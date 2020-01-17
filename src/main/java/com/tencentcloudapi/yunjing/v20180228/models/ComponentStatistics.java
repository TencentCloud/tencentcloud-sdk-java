/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComponentStatistics extends AbstractModel{

    /**
    * 组件ID。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机数量。
    */
    @SerializedName("MachineNum")
    @Expose
    private Long MachineNum;

    /**
    * 组件名称。
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * 组件类型。
<li>WEB：Web组件</li>
<li>SYSTEM：系统组件</li>
    */
    @SerializedName("ComponentType")
    @Expose
    private String ComponentType;

    /**
    * 组件描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 组件ID。 
     * @return Id 组件ID。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 组件ID。
     * @param Id 组件ID。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 主机数量。 
     * @return MachineNum 主机数量。
     */
    public Long getMachineNum() {
        return this.MachineNum;
    }

    /**
     * Set 主机数量。
     * @param MachineNum 主机数量。
     */
    public void setMachineNum(Long MachineNum) {
        this.MachineNum = MachineNum;
    }

    /**
     * Get 组件名称。 
     * @return ComponentName 组件名称。
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set 组件名称。
     * @param ComponentName 组件名称。
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get 组件类型。
<li>WEB：Web组件</li>
<li>SYSTEM：系统组件</li> 
     * @return ComponentType 组件类型。
<li>WEB：Web组件</li>
<li>SYSTEM：系统组件</li>
     */
    public String getComponentType() {
        return this.ComponentType;
    }

    /**
     * Set 组件类型。
<li>WEB：Web组件</li>
<li>SYSTEM：系统组件</li>
     * @param ComponentType 组件类型。
<li>WEB：Web组件</li>
<li>SYSTEM：系统组件</li>
     */
    public void setComponentType(String ComponentType) {
        this.ComponentType = ComponentType;
    }

    /**
     * Get 组件描述。 
     * @return Description 组件描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 组件描述。
     * @param Description 组件描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MachineNum", this.MachineNum);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "ComponentType", this.ComponentType);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

