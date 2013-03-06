package example3;

import java.util.HashMap;

public class XMLBuilder implements TreeDocumentBuilder {

    private TreeNode root;
    private StringBuilder resultBuilder = new StringBuilder();

    @Override
    public TreeNode create(String rootName) {
        root = new TreeNode(rootName, null);
        return root;
    }

    public String getResult() {
        resultBuilder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
        appendChildren(root, 0);
        return resultBuilder.toString();
    }

    private void appendChildren(TreeNode node, int level) {
        for (TreeNode treeNode : node.getChildren()) {
            appendOpenTag(level, treeNode);
            appendChildren(treeNode, level + 1);
            appendCloseTag(level, treeNode);
        }
    }

    private void appendOpenTag(int level, TreeNode treeNode) {
        resultBuilder.append(createPadding(level));
        resultBuilder.append(stringifyOpenTag(treeNode));
        resultBuilder.append("\n");
    }

    private void appendCloseTag(int level, TreeNode treeNode) {
        resultBuilder.append(createPadding(level));
        resultBuilder.append(stringifyCloseTag(treeNode));
        resultBuilder.append("\n");
    }

    private Object stringifyOpenTag(TreeNode treeNode) {
        StringBuilder nodeStringBuilder = new StringBuilder();
        nodeStringBuilder.append("<").append(treeNode.getName());

        HashMap<String, String> attributes = treeNode.getAttributes();
        appendAttributes(attributes, nodeStringBuilder);
        nodeStringBuilder.append(">");

        return nodeStringBuilder.toString();
    }

    private Object stringifyCloseTag(TreeNode treeNode) {
        return "</" + treeNode.getName() + ">";
    }

    private String createPadding(int level) {
        int numberOfSpaces = level * 2;
        return new String(new char[numberOfSpaces]).replace("\0", " ");
    }

    private void appendAttributes(HashMap<String, String> attributes, StringBuilder nodeStringBuilder) {
        for (String key : attributes.keySet()) {
            String value = attributes.get(key);
            nodeStringBuilder.append(" ").append(key).append("=\"").append(value).append("\"");
        }
    }
}
