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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NativeGatewayServerGroup extends AbstractModel {

    /**
    * 云原生网关分组唯一id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 分组名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 节点规格、节点数信息
    */
    @SerializedName("NodeConfig")
    @Expose
    private CloudNativeAPIGatewayNodeConfig NodeConfig;

    /**
    * 网关分组状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 是否是默认分组。
0：否。
1：是。
    */
    @SerializedName("IsFirstGroup")
    @Expose
    private Long IsFirstGroup;

    /**
    * 关联策略信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindingStrategy")
    @Expose
    private CloudNativeAPIGatewayStrategy BindingStrategy;

    /**
    * 网关实例 id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 带宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 子网id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetIds")
    @Expose
    private String SubnetIds;

    /**
     * Get 云原生网关分组唯一id 
     * @return GroupId 云原生网关分组唯一id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 云原生网关分组唯一id
     * @param GroupId 云原生网关分组唯一id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 分组名 
     * @return Name 分组名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分组名
     * @param Name 分组名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述信息 
     * @return Description 描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息
     * @param Description 描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 节点规格、节点数信息 
     * @return NodeConfig 节点规格、节点数信息
     */
    public CloudNativeAPIGatewayNodeConfig getNodeConfig() {
        return this.NodeConfig;
    }

    /**
     * Set 节点规格、节点数信息
     * @param NodeConfig 节点规格、节点数信息
     */
    public void setNodeConfig(CloudNativeAPIGatewayNodeConfig NodeConfig) {
        this.NodeConfig = NodeConfig;
    }

    /**
     * Get 网关分组状态。 
     * @return Status 网关分组状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 网关分组状态。
     * @param Status 网关分组状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 是否是默认分组。
0：否。
1：是。 
     * @return IsFirstGroup 是否是默认分组。
0：否。
1：是。
     */
    public Long getIsFirstGroup() {
        return this.IsFirstGroup;
    }

    /**
     * Set 是否是默认分组。
0：否。
1：是。
     * @param IsFirstGroup 是否是默认分组。
0：否。
1：是。
     */
    public void setIsFirstGroup(Long IsFirstGroup) {
        this.IsFirstGroup = IsFirstGroup;
    }

    /**
     * Get 关联策略信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindingStrategy 关联策略信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudNativeAPIGatewayStrategy getBindingStrategy() {
        return this.BindingStrategy;
    }

    /**
     * Set 关联策略信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindingStrategy 关联策略信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindingStrategy(CloudNativeAPIGatewayStrategy BindingStrategy) {
        this.BindingStrategy = BindingStrategy;
    }

    /**
     * Get 网关实例 id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayId 网关实例 id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关实例 id
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayId 网关实例 id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 带宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternetMaxBandwidthOut 带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 带宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternetMaxBandwidthOut 带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 子网id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetIds 子网id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetIds 子网id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetIds(String SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    public NativeGatewayServerGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NativeGatewayServerGroup(NativeGatewayServerGroup source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.NodeConfig != null) {
            this.NodeConfig = new CloudNativeAPIGatewayNodeConfig(source.NodeConfig);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.IsFirstGroup != null) {
            this.IsFirstGroup = new Long(source.IsFirstGroup);
        }
        if (source.BindingStrategy != null) {
            this.BindingStrategy = new CloudNativeAPIGatewayStrategy(source.BindingStrategy);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String(source.SubnetIds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "NodeConfig.", this.NodeConfig);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsFirstGroup", this.IsFirstGroup);
        this.setParamObj(map, prefix + "BindingStrategy.", this.BindingStrategy);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "SubnetIds", this.SubnetIds);

    }
}

