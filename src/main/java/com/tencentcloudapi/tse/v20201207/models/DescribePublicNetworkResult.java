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

public class DescribePublicNetworkResult extends AbstractModel {

    /**
    * 网关实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 网关分组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 客户端公网信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicNetwork")
    @Expose
    private CloudNativeAPIGatewayConfig PublicNetwork;

    /**
     * Get 网关实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayId 网关实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayId 网关实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 网关分组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 网关分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 网关分组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 网关分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 客户端公网信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicNetwork 客户端公网信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudNativeAPIGatewayConfig getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set 客户端公网信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicNetwork 客户端公网信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicNetwork(CloudNativeAPIGatewayConfig PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    public DescribePublicNetworkResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePublicNetworkResult(DescribePublicNetworkResult source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.PublicNetwork != null) {
            this.PublicNetwork = new CloudNativeAPIGatewayConfig(source.PublicNetwork);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamObj(map, prefix + "PublicNetwork.", this.PublicNetwork);

    }
}

