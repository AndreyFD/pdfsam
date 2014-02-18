/* 
 * This file is part of the PDF Split And Merge source code
 * Created on 03/apr/2012
 * Copyright 2012 by Andrea Vacondio (andrea.vacondio@gmail.com).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as 
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.pdfsam.module;

import javafx.scene.Node;
import javafx.scene.layout.Pane;

/**
 * pdfsam module.
 * 
 * @author Andrea Vacondio
 * 
 */
public interface Module {

    /**
     * @return the unique id for this module
     */
    String id();

    /**
     * @return the descriptor for the module
     */
    ModuleDescriptor descriptor();

    /**
     * @return the module panel.
     */
    Pane modulePanel();

    /**
     * @return the graphic node for this {@link Module}.
     */
    Node graphic();
}
