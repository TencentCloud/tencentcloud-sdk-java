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
    * VpcId
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
     * Get VpcId 
     * @return VpcId VpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VpcId
     * @param VpcId VpcId
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

