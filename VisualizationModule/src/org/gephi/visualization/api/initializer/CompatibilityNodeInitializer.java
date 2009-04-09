/*
Copyright 2008 WebAtlas
Authors : Mathieu Bastian, Mathieu Jacomy, Julian Bilcke
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.gephi.visualization.api.initializer;


import org.gephi.graph.api.Node;
import org.gephi.graph.api.Object3d;
import org.gephi.visualization.api.initializer.CompatibilityObject3dInitializer;
import org.gephi.visualization.api.initializer.NodeInitializer;
import org.gephi.visualization.api.Object3dImpl;
import org.gephi.visualization.opengl.compatibility.CompatibilityEngine;


/**
 * Specialized initilizer interface adapted to the {@link CompatibilityEngine} processes.
 *
 * @author Mathieu Bastian
 */
public interface CompatibilityNodeInitializer extends CompatibilityObject3dInitializer<Node>, NodeInitializer
{
    @Override
	public void chooseModel(Object3dImpl<Node> obj);
}
