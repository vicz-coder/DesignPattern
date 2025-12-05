package org.self.learn.behavioral.state.memento;

public class MementoMainApp {

    public static void main(String[] args) {
        Editor editor = new Editor();
        EditorHistory history = new EditorHistory();

        editor.type("Hello");
        history.save(editor);

        editor.type("World");
        history.save(editor);

        editor.type("Vickey");

        System.out.println("Content : "+editor.getContent());

        history.restore(editor);
        System.out.println("Content : "+editor.getContent());
        history.restore(editor);
        System.out.println("Content : "+editor.getContent());
    }
}
