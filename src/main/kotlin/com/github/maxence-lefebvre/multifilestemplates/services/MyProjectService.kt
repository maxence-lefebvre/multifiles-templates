package com.github.maxence-lefebvre.multifilestemplates.services

import com.intellij.openapi.project.Project
import com.github.maxence-lefebvre.multifilestemplates.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
