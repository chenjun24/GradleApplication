package com.ci.plugin;

import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class MyPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        System.out.println("2222222222222222222222222222");
        Ext android2 = project.getExtensions().create("android2", Ext.class);
        project.afterEvaluate(new Action<Project>() {
            @Override
            public void execute(Project project) {

            }
        });
    }
}
