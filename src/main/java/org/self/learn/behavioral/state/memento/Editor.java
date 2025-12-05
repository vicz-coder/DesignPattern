package org.self.learn.behavioral.state.memento;

public class Editor {

    private String content;

    public String getContent() {
        return content;
    }

    public void type(String word){
        this.content = this.content+word;
    }

    public EditorMemento save(){
        return new EditorMemento(content);
    }

    public void restore(EditorMemento editorMemento){
        this.content = editorMemento.getContent();
    }

}
