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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubnetInfos extends AbstractModel{

    /**
    * 子网id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 子网节点名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 安全组id
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
    * 系统
    */
    @SerializedName("Os")
    @Expose
    private String Os;

    /**
    * 硬件架构
    */
    @SerializedName("Arch")
    @Expose
    private String Arch;

    /**
     * Get 子网id 
     * @return SubnetId 子网id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id
     * @param SubnetId 子网id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 子网节点名称 
     * @return Name 子网节点名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 子网节点名称
     * @param Name 子网节点名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 安全组id 
     * @return SecurityGroups 安全组id
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set 安全组id
     * @param SecurityGroups 安全组id
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    /**
     * Get 系统 
     * @return Os 系统
     */
    public String getOs() {
        return this.Os;
    }

    /**
     * Set 系统
     * @param Os 系统
     */
    public void setOs(String Os) {
        this.Os = Os;
    }

    /**
     * Get 硬件架构 
     * @return Arch 硬件架构
     */
    public String getArch() {
        return this.Arch;
    }

    /**
     * Set 硬件架构
     * @param Arch 硬件架构
     */
    public void setArch(String Arch) {
        this.Arch = Arch;
    }

    public SubnetInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubnetInfos(SubnetInfos source) {
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SecurityGroups != null) {
            this.SecurityGroups = new String[source.SecurityGroups.length];
            for (int i = 0; i < source.SecurityGroups.length; i++) {
                this.SecurityGroups[i] = new String(source.SecurityGroups[i]);
            }
        }
        if (source.Os != null) {
            this.Os = new String(source.Os);
        }
        if (source.Arch != null) {
            this.Arch = new String(source.Arch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "SecurityGroups.", this.SecurityGroups);
        this.setParamSimple(map, prefix + "Os", this.Os);
        this.setParamSimple(map, prefix + "Arch", this.Arch);

    }
}

