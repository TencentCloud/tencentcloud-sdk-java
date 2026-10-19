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
    * <p>资源组名称。创建通用资源组的名称，必须以字母开头，可包含字母、数字、下划线（_），最多 64 个字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>开通的资源组信息</p>
    */
    @SerializedName("Type")
    @Expose
    private ResourceType Type;

    /**
    * <p>是否自动续费</p>
    */
    @SerializedName("AutoRenewEnabled")
    @Expose
    private Boolean AutoRenewEnabled;

    /**
    * <p>购买时长，单位月</p>
    */
    @SerializedName("PurchasePeriod")
    @Expose
    private Long PurchasePeriod;

    /**
    * <p>vpcId</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网</p>
    */
    @SerializedName("SubNet")
    @Expose
    private String SubNet;

    /**
    * <p>资源购买地域</p>
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * <p>关联项目空间项目id</p>
    */
    @SerializedName("AssociatedProjectId")
    @Expose
    private String AssociatedProjectId;

    /**
    * <p>资源组描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>标签值</p>
    */
    @SerializedName("Tags")
    @Expose
    private ResourceTag [] Tags;

    /**
     * Get <p>资源组名称。创建通用资源组的名称，必须以字母开头，可包含字母、数字、下划线（_），最多 64 个字符。</p> 
     * @return Name <p>资源组名称。创建通用资源组的名称，必须以字母开头，可包含字母、数字、下划线（_），最多 64 个字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>资源组名称。创建通用资源组的名称，必须以字母开头，可包含字母、数字、下划线（_），最多 64 个字符。</p>
     * @param Name <p>资源组名称。创建通用资源组的名称，必须以字母开头，可包含字母、数字、下划线（_），最多 64 个字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>开通的资源组信息</p> 
     * @return Type <p>开通的资源组信息</p>
     */
    public ResourceType getType() {
        return this.Type;
    }

    /**
     * Set <p>开通的资源组信息</p>
     * @param Type <p>开通的资源组信息</p>
     */
    public void setType(ResourceType Type) {
        this.Type = Type;
    }

    /**
     * Get <p>是否自动续费</p> 
     * @return AutoRenewEnabled <p>是否自动续费</p>
     */
    public Boolean getAutoRenewEnabled() {
        return this.AutoRenewEnabled;
    }

    /**
     * Set <p>是否自动续费</p>
     * @param AutoRenewEnabled <p>是否自动续费</p>
     */
    public void setAutoRenewEnabled(Boolean AutoRenewEnabled) {
        this.AutoRenewEnabled = AutoRenewEnabled;
    }

    /**
     * Get <p>购买时长，单位月</p> 
     * @return PurchasePeriod <p>购买时长，单位月</p>
     */
    public Long getPurchasePeriod() {
        return this.PurchasePeriod;
    }

    /**
     * Set <p>购买时长，单位月</p>
     * @param PurchasePeriod <p>购买时长，单位月</p>
     */
    public void setPurchasePeriod(Long PurchasePeriod) {
        this.PurchasePeriod = PurchasePeriod;
    }

    /**
     * Get <p>vpcId</p> 
     * @return VpcId <p>vpcId</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>vpcId</p>
     * @param VpcId <p>vpcId</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网</p> 
     * @return SubNet <p>子网</p>
     */
    public String getSubNet() {
        return this.SubNet;
    }

    /**
     * Set <p>子网</p>
     * @param SubNet <p>子网</p>
     */
    public void setSubNet(String SubNet) {
        this.SubNet = SubNet;
    }

    /**
     * Get <p>资源购买地域</p> 
     * @return ResourceRegion <p>资源购买地域</p>
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set <p>资源购买地域</p>
     * @param ResourceRegion <p>资源购买地域</p>
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get <p>关联项目空间项目id</p> 
     * @return AssociatedProjectId <p>关联项目空间项目id</p>
     */
    public String getAssociatedProjectId() {
        return this.AssociatedProjectId;
    }

    /**
     * Set <p>关联项目空间项目id</p>
     * @param AssociatedProjectId <p>关联项目空间项目id</p>
     */
    public void setAssociatedProjectId(String AssociatedProjectId) {
        this.AssociatedProjectId = AssociatedProjectId;
    }

    /**
     * Get <p>资源组描述</p> 
     * @return Description <p>资源组描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>资源组描述</p>
     * @param Description <p>资源组描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>标签值</p> 
     * @return Tags <p>标签值</p>
     */
    public ResourceTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签值</p>
     * @param Tags <p>标签值</p>
     */
    public void setTags(ResourceTag [] Tags) {
        this.Tags = Tags;
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
        if (source.Tags != null) {
            this.Tags = new ResourceTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ResourceTag(source.Tags[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

