package example3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TreeNode {

    private String name;
    private HashMap<String, String> attributes = new HashMap<>();
    private TreeNode parent;
    private List<TreeNode> children = new ArrayList<>();

    public TreeNode(String name, TreeNode parent) {
        this.name = name;
        this.parent = parent;
    }

    public TreeNode setAttribute(String name, String value) {
        attributes.put(name, value);
        return this;
    }

    public TreeNode appendChild(String name) {
        TreeNode child = new TreeNode(name, this);
        children.add(child);
        return child;
    }

    public TreeNode up() {
        return parent;
    }

    public Iterable<TreeNode> getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, String> getAttributes() {
        return attributes;
    }
    
    
}
