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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEndpointGroupRequest extends AbstractModel {

    /**
    * 全球加速实例ID。
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * 监听器ID。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 终端节点组类型。支持VIRTUAL，DEFAULT。
    */
    @SerializedName("EndpointGroupType")
    @Expose
    private String EndpointGroupType;

    /**
    * 终端节点组配置。
    */
    @SerializedName("EndpointGroupConfiguration")
    @Expose
    private EndpointGroupConfiguration EndpointGroupConfiguration;

    /**
     * Get 全球加速实例ID。 
     * @return GlobalAcceleratorId 全球加速实例ID。
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set 全球加速实例ID。
     * @param GlobalAcceleratorId 全球加速实例ID。
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get 监听器ID。 
     * @return ListenerId 监听器ID。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID。
     * @param ListenerId 监听器ID。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 终端节点组类型。支持VIRTUAL，DEFAULT。 
     * @return EndpointGroupType 终端节点组类型。支持VIRTUAL，DEFAULT。
     */
    public String getEndpointGroupType() {
        return this.EndpointGroupType;
    }

    /**
     * Set 终端节点组类型。支持VIRTUAL，DEFAULT。
     * @param EndpointGroupType 终端节点组类型。支持VIRTUAL，DEFAULT。
     */
    public void setEndpointGroupType(String EndpointGroupType) {
        this.EndpointGroupType = EndpointGroupType;
    }

    /**
     * Get 终端节点组配置。 
     * @return EndpointGroupConfiguration 终端节点组配置。
     */
    public EndpointGroupConfiguration getEndpointGroupConfiguration() {
        return this.EndpointGroupConfiguration;
    }

    /**
     * Set 终端节点组配置。
     * @param EndpointGroupConfiguration 终端节点组配置。
     */
    public void setEndpointGroupConfiguration(EndpointGroupConfiguration EndpointGroupConfiguration) {
        this.EndpointGroupConfiguration = EndpointGroupConfiguration;
    }

    public CreateEndpointGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEndpointGroupRequest(CreateEndpointGroupRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.EndpointGroupType != null) {
            this.EndpointGroupType = new String(source.EndpointGroupType);
        }
        if (source.EndpointGroupConfiguration != null) {
            this.EndpointGroupConfiguration = new EndpointGroupConfiguration(source.EndpointGroupConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "EndpointGroupType", this.EndpointGroupType);
        this.setParamObj(map, prefix + "EndpointGroupConfiguration.", this.EndpointGroupConfiguration);

    }
}

