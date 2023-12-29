package com.example.hello_world

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class HelloWorldAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        Messages.showDialog("Hello World!", "Hello World", arrayOf("OK"), 0, Messages.getInformationIcon())
    }
}