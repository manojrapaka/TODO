package com.mr.todo.ui;

import com.vaadin.addon.touchkit.ui.EmailField;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.NumberField;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.TextField;

@SuppressWarnings("serial")
public class TodoView extends NavigationView {

    public TodoView() {
        super("TODOs...");

        CssLayout content = new CssLayout();
        setContent(content);

        final VerticalComponentGroup group = new VerticalComponentGroup();
        content.addComponent(group);
        
        group.addComponent(new TextField("TextField"));
        group.addComponent(new NumberField("NumberField"));
        group.addComponent(new EmailField("EmailField"));
    }
}
