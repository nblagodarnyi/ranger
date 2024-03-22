/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

 package org.apache.ranger.view;

/**
 * List wrapper class for VXPermMap
 *
 */

import java.util.ArrayList;
import java.util.List;

import org.apache.ranger.common.view.VList;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonAutoDetect(getterVisibility=Visibility.NONE, setterVisibility=Visibility.NONE, fieldVisibility=Visibility.ANY)
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL )
public class VXPermMapList extends VList {
	private static final long serialVersionUID = 1L;
    List<VXPermMap> vXPermMaps = new ArrayList<VXPermMap>();

    public VXPermMapList() {
	super();
    }

    public VXPermMapList(List<VXPermMap> objList) {
	super(objList);
	this.vXPermMaps = objList;
    }

    /**
     * @return the vXPermMaps
     */
    public List<VXPermMap> getVXPermMaps() {
	return vXPermMaps;
    }

    /**
     * @param vXPermMaps
     *            the vXPermMaps to set
     */
    public void setVXPermMaps(List<VXPermMap> vXPermMaps) {
	this.vXPermMaps = vXPermMaps;
    }

    @Override
    public int getListSize() {
	if (vXPermMaps != null) {
	    return vXPermMaps.size();
	}
	return 0;
    }

    @Override
    public List<VXPermMap> getList() {
	return vXPermMaps;
    }

}
