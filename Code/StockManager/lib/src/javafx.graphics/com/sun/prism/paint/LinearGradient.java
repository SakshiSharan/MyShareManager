/*
 * Copyright (c) 2009, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package com.sun.prism.paint;

import com.sun.javafx.geom.transform.BaseTransform;
import java.util.List;

public final class LinearGradient extends Gradient {

    private float x1;
    private float y1;
    private float x2;
    private float y2;

    public LinearGradient(float x1, float y1,
                          float x2, float y2,
                          BaseTransform gradientTransform,
                          boolean proportional,
                          int spreadMethod,
                          List<Stop> stops)
    {
        super(Type.LINEAR_GRADIENT, gradientTransform, proportional, spreadMethod, stops);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public float getX1() { return x1; }
    public float getY1() { return y1; }
    public float getX2() { return x2; }
    public float getY2() { return y2; }
}
