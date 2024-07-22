package abstraction.abstractclasses.exercise;

public class SearchTree implements NodeList {
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            // the tree was empty, so this item becomes the head of the tree
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                // newItem is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there's no next, so add at this point
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, move left if possible
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    // there's no previous, so add at this point
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                // equal, don't add
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                // we found the item to remove
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        // remove item from tree
        if (item.next() == null) {
            // no right child, so make parent point to left child (which may be null)
            if (parent.next() == item) {
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.previous());
            } else {
                // parent must be item, which means we were removing the root of the tree
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            // no left child, so make parent point to right child (which may be null)
            if (parent.next() == item) {
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.next());
            } else {
                // parent must be item, which means we were removing the root of the tree
                this.root = item.next();
            }
        } else {
            // neither left nor right are null, deletion is now a lot trickier!
            // From the right sub-tree, find the smallest value (i.e., the leftmost).
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }
            // Now put the smallest value into the node to be deleted.
            item.setValue(current.getValue());
            // And delete the smallest
            if (leftmostParent == item) {
                // There was no leftmost node, so current points to the smallest node (which means item.next)
                item.setNext(current.next());
            } else {
                // set the leftmost parent to point to the smallest node's right child (which may be null)
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        // recursive method
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
