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

public class CreatePublicNetworkResult extends AbstractModel {

    /**
    * 网关实例ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 客户端公网网络ID
    */
    @SerializedName("NetworkId")
    @Expose
    private String NetworkId;

    /**
     * Get 网关实例ID 
     * @return GatewayId 网关实例ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关实例ID
     * @param GatewayId 网关实例ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 分组ID 
     * @return GroupId 分组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组ID
     * @param GroupId 分组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 客户端公网网络ID 
     * @return NetworkId 客户端公网网络ID
     */
    public String getNetworkId() {
        return this.NetworkId;
    }

    /**
     * Set 客户端公网网络ID
     * @param NetworkId 客户端公网网络ID
     */
    public void setNetworkId(String NetworkId) {
        this.NetworkId = NetworkId;
    }

    public CreatePublicNetworkResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePublicNetworkResult(CreatePublicNetworkResult source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.NetworkId != null) {
            this.NetworkId = new String(source.NetworkId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "NetworkId", this.NetworkId);

    }
}

