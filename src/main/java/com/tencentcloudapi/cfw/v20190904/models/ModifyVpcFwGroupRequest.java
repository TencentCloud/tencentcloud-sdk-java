/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVpcFwGroupRequest extends AbstractModel {

    /**
    * 编辑的防火墙(组)ID
    */
    @SerializedName("FwGroupId")
    @Expose
    private String FwGroupId;

    /**
    * 修改防火墙(组)名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 编辑的防火墙实例列表
    */
    @SerializedName("VpcFwInstances")
    @Expose
    private VpcFwInstance [] VpcFwInstances;

    /**
    * 指定防火墙使用网段信息
    */
    @SerializedName("FwCidrInfo")
    @Expose
    private FwCidrInfo FwCidrInfo;

    /**
     * Get 编辑的防火墙(组)ID 
     * @return FwGroupId 编辑的防火墙(组)ID
     */
    public String getFwGroupId() {
        return this.FwGroupId;
    }

    /**
     * Set 编辑的防火墙(组)ID
     * @param FwGroupId 编辑的防火墙(组)ID
     */
    public void setFwGroupId(String FwGroupId) {
        this.FwGroupId = FwGroupId;
    }

    /**
     * Get 修改防火墙(组)名称 
     * @return Name 修改防火墙(组)名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 修改防火墙(组)名称
     * @param Name 修改防火墙(组)名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 编辑的防火墙实例列表 
     * @return VpcFwInstances 编辑的防火墙实例列表
     */
    public VpcFwInstance [] getVpcFwInstances() {
        return this.VpcFwInstances;
    }

    /**
     * Set 编辑的防火墙实例列表
     * @param VpcFwInstances 编辑的防火墙实例列表
     */
    public void setVpcFwInstances(VpcFwInstance [] VpcFwInstances) {
        this.VpcFwInstances = VpcFwInstances;
    }

    /**
     * Get 指定防火墙使用网段信息 
     * @return FwCidrInfo 指定防火墙使用网段信息
     */
    public FwCidrInfo getFwCidrInfo() {
        return this.FwCidrInfo;
    }

    /**
     * Set 指定防火墙使用网段信息
     * @param FwCidrInfo 指定防火墙使用网段信息
     */
    public void setFwCidrInfo(FwCidrInfo FwCidrInfo) {
        this.FwCidrInfo = FwCidrInfo;
    }

    public ModifyVpcFwGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVpcFwGroupRequest(ModifyVpcFwGroupRequest source) {
        if (source.FwGroupId != null) {
            this.FwGroupId = new String(source.FwGroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VpcFwInstances != null) {
            this.VpcFwInstances = new VpcFwInstance[source.VpcFwInstances.length];
            for (int i = 0; i < source.VpcFwInstances.length; i++) {
                this.VpcFwInstances[i] = new VpcFwInstance(source.VpcFwInstances[i]);
            }
        }
        if (source.FwCidrInfo != null) {
            this.FwCidrInfo = new FwCidrInfo(source.FwCidrInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FwGroupId", this.FwGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "VpcFwInstances.", this.VpcFwInstances);
        this.setParamObj(map, prefix + "FwCidrInfo.", this.FwCidrInfo);

    }
}

