package com.garawaa;

import com.intellij.codeInsight.template.TemplateContextType;
import com.intellij.codeInsight.template.TemplateActionContext;
import org.jetbrains.annotations.NotNull;

public class TemplateContext extends TemplateContextType {

    protected TemplateContext() {
        super("JAVA", "Java");
    }

    @Override
    public boolean isInContext(@NotNull TemplateActionContext templateActionContext) {
        return templateActionContext.getFile().getName().endsWith(".java");
    }

}


