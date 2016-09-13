/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roshan.fileio.command;

import com.roshan.fileio.command.CopyCommand;

/**
 *
 * @author Aasick
 */
public class DosFactory {

    public static DosCommand get(String param) {
        if (param.equalsIgnoreCase("md")) {
            return new MkdirCommand();
        } else if (param.equalsIgnoreCase("rd")) {
            return new RmDirCommand();
        } else if (param.equalsIgnoreCase("ren")) {
            return new RenameCommand();

        } else if (param.equalsIgnoreCase("copy")) {
            return new CopyCommand();

        } else if (param.equalsIgnoreCase("dir")) {
            return new DirCommand();
        }
        else if (param.equalsIgnoreCase("vi")) {
            return new EditCommand();
        }
        return null;
    }

}
