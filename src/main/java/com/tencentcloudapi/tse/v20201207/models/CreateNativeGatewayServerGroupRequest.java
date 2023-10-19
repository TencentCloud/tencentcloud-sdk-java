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

public class CreateNativeGatewayServerGroupRequest extends AbstractModel {

    /**
    * 网关实例id。
只支持后付费实例
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 网关分组名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 节点配置
    */
    @SerializedName("NodeConfig")
    @Expose
    private CloudNativeAPIGatewayNodeConfig NodeConfig;

    /**
    * 子网id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 公网带宽信息
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 公网配置。
    */
    @SerializedName("InternetConfig")
    @Expose
    private InternetConfig InternetConfig;

    /**
     * Get 网关实例id。
只支持后付费实例 
     * @return GatewayId 网关实例id。
只支持后付费实例
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关实例id。
只支持后付费实例
     * @param GatewayId 网关实例id。
只支持后付费实例
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 网关分组名 
     * @return Name 网关分组名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 网关分组名
     * @param Name 网关分组名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 节点配置 
     * @return NodeConfig 节点配置
     */
    public CloudNativeAPIGatewayNodeConfig getNodeConfig() {
        return this.NodeConfig;
    }

    /**
     * Set 节点配置
     * @param NodeConfig 节点配置
     */
    public void setNodeConfig(CloudNativeAPIGatewayNodeConfig NodeConfig) {
        this.NodeConfig = NodeConfig;
    }

    /**
     * Get 子网id 
     * @return SubnetId 子网id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id
     * @param SubnetId 子网id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
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
     * Get 公网带宽信息 
     * @return InternetMaxBandwidthOut 公网带宽信息
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 公网带宽信息
     * @param InternetMaxBandwidthOut 公网带宽信息
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 公网配置。 
     * @return InternetConfig 公网配置。
     */
    public InternetConfig getInternetConfig() {
        return this.InternetConfig;
    }

    /**
     * Set 公网配置。
     * @param InternetConfig 公网配置。
     */
    public void setInternetConfig(InternetConfig InternetConfig) {
        this.InternetConfig = InternetConfig;
    }

    public CreateNativeGatewayServerGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNativeGatewayServerGroupRequest(CreateNativeGatewayServerGroupRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NodeConfig != null) {
            this.NodeConfig = new CloudNativeAPIGatewayNodeConfig(source.NodeConfig);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.InternetConfig != null) {
            this.InternetConfig = new InternetConfig(source.InternetConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "NodeConfig.", this.NodeConfig);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamObj(map, prefix + "InternetConfig.", this.InternetConfig);

    }
}

