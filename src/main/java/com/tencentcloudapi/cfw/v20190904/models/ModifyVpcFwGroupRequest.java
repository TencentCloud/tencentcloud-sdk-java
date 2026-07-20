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
    * <p>编辑的防火墙(组)ID</p>
    */
    @SerializedName("FwGroupId")
    @Expose
    private String FwGroupId;

    /**
    * <p>修改防火墙(组)名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>编辑的防火墙实例列表</p>
    */
    @SerializedName("VpcFwInstances")
    @Expose
    private VpcFwInstance [] VpcFwInstances;

    /**
    * <p>指定防火墙使用网段信息</p>
    */
    @SerializedName("FwCidrInfo")
    @Expose
    private FwCidrInfo FwCidrInfo;

    /**
     * Get <p>编辑的防火墙(组)ID</p> 
     * @return FwGroupId <p>编辑的防火墙(组)ID</p>
     */
    public String getFwGroupId() {
        return this.FwGroupId;
    }

    /**
     * Set <p>编辑的防火墙(组)ID</p>
     * @param FwGroupId <p>编辑的防火墙(组)ID</p>
     */
    public void setFwGroupId(String FwGroupId) {
        this.FwGroupId = FwGroupId;
    }

    /**
     * Get <p>修改防火墙(组)名称</p> 
     * @return Name <p>修改防火墙(组)名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>修改防火墙(组)名称</p>
     * @param Name <p>修改防火墙(组)名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>编辑的防火墙实例列表</p> 
     * @return VpcFwInstances <p>编辑的防火墙实例列表</p>
     */
    public VpcFwInstance [] getVpcFwInstances() {
        return this.VpcFwInstances;
    }

    /**
     * Set <p>编辑的防火墙实例列表</p>
     * @param VpcFwInstances <p>编辑的防火墙实例列表</p>
     */
    public void setVpcFwInstances(VpcFwInstance [] VpcFwInstances) {
        this.VpcFwInstances = VpcFwInstances;
    }

    /**
     * Get <p>指定防火墙使用网段信息</p> 
     * @return FwCidrInfo <p>指定防火墙使用网段信息</p>
     */
    public FwCidrInfo getFwCidrInfo() {
        return this.FwCidrInfo;
    }

    /**
     * Set <p>指定防火墙使用网段信息</p>
     * @param FwCidrInfo <p>指定防火墙使用网段信息</p>
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

