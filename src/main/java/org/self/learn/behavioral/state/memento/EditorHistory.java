package org.self.learn.behavioral.state.memento;

import java.util.Stack;

public class EditorHistory {
    private Stack<EditorMemento> history = new Stack<>();

    public void save(Editor editor){
        history.push(editor.save());
    }

    public void restore(Editor editor){
        if (!history.empty()){
            editor.restore(history.pop());
        }
    }

}
