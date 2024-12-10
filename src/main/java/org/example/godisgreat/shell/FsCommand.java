package org.example.godisgreat.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class FsCommand {

    @ShellMethod("diese methode pritnet world")
    public String hello(){
        return "hello world";
    }
}
