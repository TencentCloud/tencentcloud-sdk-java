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

public class ExecutorResourceGroupInfo extends AbstractModel {

    /**
    * 资源组唯一标识
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 资源组描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 执行资源组类型，不能为空

- Schedule --- 调度资源组
- Integration --- 集成资源组
- DataService -- 数据服务资源组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupType")
    @Expose
    private String ResourceGroupType;

    /**
    * 项目集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssociateProjects")
    @Expose
    private BindProject [] AssociateProjects;

    /**
    * 区域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * vpcId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubNet")
    @Expose
    private String SubNet;

    /**
    * 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenewEnabled")
    @Expose
    private Boolean AutoRenewEnabled;

    /**
     * Get 资源组唯一标识 
     * @return Id 资源组唯一标识
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源组唯一标识
     * @param Id 资源组唯一标识
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 资源组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 资源组描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 资源组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 资源组描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 资源组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 执行资源组类型，不能为空

- Schedule --- 调度资源组
- Integration --- 集成资源组
- DataService -- 数据服务资源组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupType 执行资源组类型，不能为空

- Schedule --- 调度资源组
- Integration --- 集成资源组
- DataService -- 数据服务资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupType() {
        return this.ResourceGroupType;
    }

    /**
     * Set 执行资源组类型，不能为空

- Schedule --- 调度资源组
- Integration --- 集成资源组
- DataService -- 数据服务资源组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupType 执行资源组类型，不能为空

- Schedule --- 调度资源组
- Integration --- 集成资源组
- DataService -- 数据服务资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupType(String ResourceGroupType) {
        this.ResourceGroupType = ResourceGroupType;
    }

    /**
     * Get 项目集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssociateProjects 项目集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BindProject [] getAssociateProjects() {
        return this.AssociateProjects;
    }

    /**
     * Set 项目集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssociateProjects 项目集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssociateProjects(BindProject [] AssociateProjects) {
        this.AssociateProjects = AssociateProjects;
    }

    /**
     * Get 区域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get vpcId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId vpcId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpcId
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId vpcId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubNet 子网id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubNet() {
        return this.SubNet;
    }

    /**
     * Set 子网id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubNet 子网id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubNet(String SubNet) {
        this.SubNet = SubNet;
    }

    /**
     * Get 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenewEnabled 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoRenewEnabled() {
        return this.AutoRenewEnabled;
    }

    /**
     * Set 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenewEnabled 是否自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenewEnabled(Boolean AutoRenewEnabled) {
        this.AutoRenewEnabled = AutoRenewEnabled;
    }

    public ExecutorResourceGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecutorResourceGroupInfo(ExecutorResourceGroupInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ResourceGroupType != null) {
            this.ResourceGroupType = new String(source.ResourceGroupType);
        }
        if (source.AssociateProjects != null) {
            this.AssociateProjects = new BindProject[source.AssociateProjects.length];
            for (int i = 0; i < source.AssociateProjects.length; i++) {
                this.AssociateProjects[i] = new BindProject(source.AssociateProjects[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubNet != null) {
            this.SubNet = new String(source.SubNet);
        }
        if (source.AutoRenewEnabled != null) {
            this.AutoRenewEnabled = new Boolean(source.AutoRenewEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ResourceGroupType", this.ResourceGroupType);
        this.setParamArrayObj(map, prefix + "AssociateProjects.", this.AssociateProjects);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubNet", this.SubNet);
        this.setParamSimple(map, prefix + "AutoRenewEnabled", this.AutoRenewEnabled);

    }
}

