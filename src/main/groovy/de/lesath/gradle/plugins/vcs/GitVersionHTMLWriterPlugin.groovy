package de.lesath.gradle.plugins.vcs

import org.gradle.api.Plugin
import org.gradle.api.Project

class GitVersionHTMLWriterPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.task('hello') {
            doLast {
                println 'Hello from the GitVersionHTMLWriterPlugin'
            }
        }
    }
}

