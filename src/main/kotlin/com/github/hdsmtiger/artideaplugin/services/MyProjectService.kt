package com.github.hdsmtiger.artideaplugin.services

import com.github.hdsmtiger.artideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
