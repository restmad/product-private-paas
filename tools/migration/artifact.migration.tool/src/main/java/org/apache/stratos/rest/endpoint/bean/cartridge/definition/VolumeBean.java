/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.stratos.rest.endpoint.bean.cartridge.definition;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement class VolumeBean {

    private String size;
    private String device;
    private boolean removeOnTermination;
    private String mappingPath;

    public String toString() {
        return " [ Persistence Required : " + ", Size: " + size + ", device: " +
                device + " remove on termination " + removeOnTermination +
                ", mappingPath : " + mappingPath + "] ";
    }

    public String getMappingPath() {
        return mappingPath;
    }

    public void setMappingPath(String mappingPath) {
        this.mappingPath = mappingPath;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public boolean isRemoveOnTermination() {
        return removeOnTermination;
    }

    public void setRemoveOnTermination(boolean removeOnTermination) {
        this.removeOnTermination = removeOnTermination;
    }
}
