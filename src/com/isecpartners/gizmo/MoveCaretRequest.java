/*
Copyright (C) 2009 Rachel Engel

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
*/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.isecpartners.gizmo;

/**
 *
 * @author rachel
 */
public class MoveCaretRequest extends UpdateRequest{
    private int where;

    public static final int GET_END = -1;

    public MoveCaretRequest(int where) {
        super();
        this.where = where;

    }

    public int getWhere() {
        return where;
    }

    public String toString() {
        return "MOVE CARET: " + where;
    }
}
