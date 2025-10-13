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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateResourceGroupRequest extends AbstractModel {

    /**
    * 资源组名称。创建通用资源组的名称，必须以字母开头，可包含字母、数字、下划线（_），最多 64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 开通的资源组信息
    */
    @SerializedName("Type")
    @Expose
    private ResourceType Type;

    /**
    * 是否自动续费
    */
    @SerializedName("AutoRenewEnabled")
    @Expose
    private Boolean AutoRenewEnabled;

    /**
    * 购买时长，单位月
    */
    @SerializedName("PurchasePeriod")
    @Expose
    private Long PurchasePeriod;

    /**
    * vpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网
    */
    @SerializedName("SubNet")
    @Expose
    private String SubNet;

    /**
    * 资源购买地域
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 关联项目空间项目id
    */
    @SerializedName("AssociatedProjectId")
    @Expose
    private String AssociatedProjectId;

    /**
    * 资源组描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 资源组名称。创建通用资源组的名称，必须以字母开头，可包含字母、数字、下划线（_），最多 64 个字符。 
     * @return Name 资源组名称。创建通用资源组的名称，必须以字母开头，可包含字母、数字、下划线（_），最多 64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源组名称。创建通用资源组的名称，必须以字母开头，可包含字母、数字、下划线（_），最多 64 个字符。
     * @param Name 资源组名称。创建通用资源组的名称，必须以字母开头，可包含字母、数字、下划线（_），最多 64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 开通的资源组信息 
     * @return Type 开通的资源组信息
     */
    public ResourceType getType() {
        return this.Type;
    }

    /**
     * Set 开通的资源组信息
     * @param Type 开通的资源组信息
     */
    public void setType(ResourceType Type) {
        this.Type = Type;
    }

    /**
     * Get 是否自动续费 
     * @return AutoRenewEnabled 是否自动续费
     */
    public Boolean getAutoRenewEnabled() {
        return this.AutoRenewEnabled;
    }

    /**
     * Set 是否自动续费
     * @param AutoRenewEnabled 是否自动续费
     */
    public void setAutoRenewEnabled(Boolean AutoRenewEnabled) {
        this.AutoRenewEnabled = AutoRenewEnabled;
    }

    /**
     * Get 购买时长，单位月 
     * @return PurchasePeriod 购买时长，单位月
     */
    public Long getPurchasePeriod() {
        return this.PurchasePeriod;
    }

    /**
     * Set 购买时长，单位月
     * @param PurchasePeriod 购买时长，单位月
     */
    public void setPurchasePeriod(Long PurchasePeriod) {
        this.PurchasePeriod = PurchasePeriod;
    }

    /**
     * Get vpcId 
     * @return VpcId vpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpcId
     * @param VpcId vpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网 
     * @return SubNet 子网
     */
    public String getSubNet() {
        return this.SubNet;
    }

    /**
     * Set 子网
     * @param SubNet 子网
     */
    public void setSubNet(String SubNet) {
        this.SubNet = SubNet;
    }

    /**
     * Get 资源购买地域 
     * @return ResourceRegion 资源购买地域
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源购买地域
     * @param ResourceRegion 资源购买地域
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 关联项目空间项目id 
     * @return AssociatedProjectId 关联项目空间项目id
     */
    public String getAssociatedProjectId() {
        return this.AssociatedProjectId;
    }

    /**
     * Set 关联项目空间项目id
     * @param AssociatedProjectId 关联项目空间项目id
     */
    public void setAssociatedProjectId(String AssociatedProjectId) {
        this.AssociatedProjectId = AssociatedProjectId;
    }

    /**
     * Get 资源组描述 
     * @return Description 资源组描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 资源组描述
     * @param Description 资源组描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateResourceGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateResourceGroupRequest(CreateResourceGroupRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new ResourceType(source.Type);
        }
        if (source.AutoRenewEnabled != null) {
            this.AutoRenewEnabled = new Boolean(source.AutoRenewEnabled);
        }
        if (source.PurchasePeriod != null) {
            this.PurchasePeriod = new Long(source.PurchasePeriod);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubNet != null) {
            this.SubNet = new String(source.SubNet);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.AssociatedProjectId != null) {
            this.AssociatedProjectId = new String(source.AssociatedProjectId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Type.", this.Type);
        this.setParamSimple(map, prefix + "AutoRenewEnabled", this.AutoRenewEnabled);
        this.setParamSimple(map, prefix + "PurchasePeriod", this.PurchasePeriod);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubNet", this.SubNet);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "AssociatedProjectId", this.AssociatedProjectId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

