package com.poc.tree.entity;

import java.util.ArrayList;
import java.util.List;

public class GenericTreeNode<T> {

    private T data = null;
    private List<GenericTreeNode> children = new ArrayList<>();
    private GenericTreeNode parent = null;

    public GenericTreeNode() {
    }
    public GenericTreeNode(T data) {
        this.data = data;
    }

    public void addChild(GenericTreeNode child) {
        child.setParent(this);
        this.children.add(child);
    }

    public void addChild(T data) {
        GenericTreeNode<T> newChild = new GenericTreeNode<>(data);
        this.addChild(newChild);
    }

    public void addChildren(List<GenericTreeNode> children) {
        for(GenericTreeNode t : children) {
            t.setParent(this);
        }
        this.children.addAll(children);
    }

    public List<GenericTreeNode> getChildren() {
        return children;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private void setParent(GenericTreeNode parent) {
        this.parent = parent;
    }

    public GenericTreeNode getParent() {
        return parent;
    }
}

