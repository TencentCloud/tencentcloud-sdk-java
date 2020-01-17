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

public class Component extends AbstractModel{

    /**
    * 唯一ID。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 云镜客户端唯一Uuid。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机内网IP。
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 主机名。
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 组件版本号。
    */
    @SerializedName("ComponentVersion")
    @Expose
    private String ComponentVersion;

    /**
    * 组件类型。
<li>SYSTEM：系统组件</li>
<li>WEB：Web组件</li>
    */
    @SerializedName("ComponentType")
    @Expose
    private String ComponentType;

    /**
    * 组件名称。
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * 组件检测更新时间。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 唯一ID。 
     * @return Id 唯一ID。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 唯一ID。
     * @param Id 唯一ID。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 云镜客户端唯一Uuid。 
     * @return Uuid 云镜客户端唯一Uuid。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 云镜客户端唯一Uuid。
     * @param Uuid 云镜客户端唯一Uuid。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 主机内网IP。 
     * @return MachineIp 主机内网IP。
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 主机内网IP。
     * @param MachineIp 主机内网IP。
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 主机名。 
     * @return MachineName 主机名。
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 主机名。
     * @param MachineName 主机名。
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 组件版本号。 
     * @return ComponentVersion 组件版本号。
     */
    public String getComponentVersion() {
        return this.ComponentVersion;
    }

    /**
     * Set 组件版本号。
     * @param ComponentVersion 组件版本号。
     */
    public void setComponentVersion(String ComponentVersion) {
        this.ComponentVersion = ComponentVersion;
    }

    /**
     * Get 组件类型。
<li>SYSTEM：系统组件</li>
<li>WEB：Web组件</li> 
     * @return ComponentType 组件类型。
<li>SYSTEM：系统组件</li>
<li>WEB：Web组件</li>
     */
    public String getComponentType() {
        return this.ComponentType;
    }

    /**
     * Set 组件类型。
<li>SYSTEM：系统组件</li>
<li>WEB：Web组件</li>
     * @param ComponentType 组件类型。
<li>SYSTEM：系统组件</li>
<li>WEB：Web组件</li>
     */
    public void setComponentType(String ComponentType) {
        this.ComponentType = ComponentType;
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
     * Get 组件检测更新时间。 
     * @return ModifyTime 组件检测更新时间。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 组件检测更新时间。
     * @param ModifyTime 组件检测更新时间。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "ComponentVersion", this.ComponentVersion);
        this.setParamSimple(map, prefix + "ComponentType", this.ComponentType);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

