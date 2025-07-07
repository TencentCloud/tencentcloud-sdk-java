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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCloudNativeAPIGatewaySpecRequest extends AbstractModel {

    /**
    * 云原生API网关实例ID。
只支持后付费实例
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 网关分组id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 网关分组节点规格配置。
    */
    @SerializedName("NodeConfig")
    @Expose
    private CloudNativeAPIGatewayNodeConfig NodeConfig;

    /**
     * Get 云原生API网关实例ID。
只支持后付费实例 
     * @return GatewayId 云原生API网关实例ID。
只支持后付费实例
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 云原生API网关实例ID。
只支持后付费实例
     * @param GatewayId 云原生API网关实例ID。
只支持后付费实例
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 网关分组id 
     * @return GroupId 网关分组id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 网关分组id
     * @param GroupId 网关分组id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 网关分组节点规格配置。 
     * @return NodeConfig 网关分组节点规格配置。
     */
    public CloudNativeAPIGatewayNodeConfig getNodeConfig() {
        return this.NodeConfig;
    }

    /**
     * Set 网关分组节点规格配置。
     * @param NodeConfig 网关分组节点规格配置。
     */
    public void setNodeConfig(CloudNativeAPIGatewayNodeConfig NodeConfig) {
        this.NodeConfig = NodeConfig;
    }

    public UpdateCloudNativeAPIGatewaySpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCloudNativeAPIGatewaySpecRequest(UpdateCloudNativeAPIGatewaySpecRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.NodeConfig != null) {
            this.NodeConfig = new CloudNativeAPIGatewayNodeConfig(source.NodeConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamObj(map, prefix + "NodeConfig.", this.NodeConfig);

    }
}

