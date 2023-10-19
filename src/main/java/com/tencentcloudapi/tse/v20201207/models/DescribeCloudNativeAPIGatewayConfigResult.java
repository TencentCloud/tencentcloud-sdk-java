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

public class DescribeCloudNativeAPIGatewayConfigResult extends AbstractModel {

    /**
    * 网关实例ID。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 分组网络配置列表。
    */
    @SerializedName("ConfigList")
    @Expose
    private CloudNativeAPIGatewayConfig [] ConfigList;

    /**
    * 分组子网信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupSubnetId")
    @Expose
    private String GroupSubnetId;

    /**
    * 分组VPC信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupVpcId")
    @Expose
    private String GroupVpcId;

    /**
    * 分组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get 网关实例ID。 
     * @return GatewayId 网关实例ID。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关实例ID。
     * @param GatewayId 网关实例ID。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 分组网络配置列表。 
     * @return ConfigList 分组网络配置列表。
     */
    public CloudNativeAPIGatewayConfig [] getConfigList() {
        return this.ConfigList;
    }

    /**
     * Set 分组网络配置列表。
     * @param ConfigList 分组网络配置列表。
     */
    public void setConfigList(CloudNativeAPIGatewayConfig [] ConfigList) {
        this.ConfigList = ConfigList;
    }

    /**
     * Get 分组子网信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupSubnetId 分组子网信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupSubnetId() {
        return this.GroupSubnetId;
    }

    /**
     * Set 分组子网信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupSubnetId 分组子网信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupSubnetId(String GroupSubnetId) {
        this.GroupSubnetId = GroupSubnetId;
    }

    /**
     * Get 分组VPC信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupVpcId 分组VPC信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupVpcId() {
        return this.GroupVpcId;
    }

    /**
     * Set 分组VPC信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupVpcId 分组VPC信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupVpcId(String GroupVpcId) {
        this.GroupVpcId = GroupVpcId;
    }

    /**
     * Get 分组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public DescribeCloudNativeAPIGatewayConfigResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayConfigResult(DescribeCloudNativeAPIGatewayConfigResult source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ConfigList != null) {
            this.ConfigList = new CloudNativeAPIGatewayConfig[source.ConfigList.length];
            for (int i = 0; i < source.ConfigList.length; i++) {
                this.ConfigList[i] = new CloudNativeAPIGatewayConfig(source.ConfigList[i]);
            }
        }
        if (source.GroupSubnetId != null) {
            this.GroupSubnetId = new String(source.GroupSubnetId);
        }
        if (source.GroupVpcId != null) {
            this.GroupVpcId = new String(source.GroupVpcId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamArrayObj(map, prefix + "ConfigList.", this.ConfigList);
        this.setParamSimple(map, prefix + "GroupSubnetId", this.GroupSubnetId);
        this.setParamSimple(map, prefix + "GroupVpcId", this.GroupVpcId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

