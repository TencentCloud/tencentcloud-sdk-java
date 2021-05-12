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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVsmAttributesRequest extends AbstractModel{

    /**
    * 资源Id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * UpdateResourceName-修改资源名称,
UpdateSgIds-修改安全组名称,
UpdateNetWork-修改网络,
Default-默认不修改
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * 资源名称
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 安全组Id
    */
    @SerializedName("SgIds")
    @Expose
    private String [] SgIds;

    /**
    * 虚拟专网Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网Id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * Get 资源Id 
     * @return ResourceId 资源Id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源Id
     * @param ResourceId 资源Id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get UpdateResourceName-修改资源名称,
UpdateSgIds-修改安全组名称,
UpdateNetWork-修改网络,
Default-默认不修改 
     * @return Type UpdateResourceName-修改资源名称,
UpdateSgIds-修改安全组名称,
UpdateNetWork-修改网络,
Default-默认不修改
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set UpdateResourceName-修改资源名称,
UpdateSgIds-修改安全组名称,
UpdateNetWork-修改网络,
Default-默认不修改
     * @param Type UpdateResourceName-修改资源名称,
UpdateSgIds-修改安全组名称,
UpdateNetWork-修改网络,
Default-默认不修改
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get 资源名称 
     * @return ResourceName 资源名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称
     * @param ResourceName 资源名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 安全组Id 
     * @return SgIds 安全组Id
     */
    public String [] getSgIds() {
        return this.SgIds;
    }

    /**
     * Set 安全组Id
     * @param SgIds 安全组Id
     */
    public void setSgIds(String [] SgIds) {
        this.SgIds = SgIds;
    }

    /**
     * Get 虚拟专网Id 
     * @return VpcId 虚拟专网Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 虚拟专网Id
     * @param VpcId 虚拟专网Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网Id 
     * @return SubnetId 子网Id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网Id
     * @param SubnetId 子网Id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    public ModifyVsmAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVsmAttributesRequest(ModifyVsmAttributesRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.SgIds != null) {
            this.SgIds = new String[source.SgIds.length];
            for (int i = 0; i < source.SgIds.length; i++) {
                this.SgIds[i] = new String(source.SgIds[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamArraySimple(map, prefix + "SgIds.", this.SgIds);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

