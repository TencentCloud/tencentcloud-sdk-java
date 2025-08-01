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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserVpcConnectionRequest extends AbstractModel {

    /**
    * 用户vpcid
    */
    @SerializedName("UserVpcId")
    @Expose
    private String UserVpcId;

    /**
    * 用户子网
    */
    @SerializedName("UserSubnetId")
    @Expose
    private String UserSubnetId;

    /**
    * 用户终端节点名称
    */
    @SerializedName("UserVpcEndpointName")
    @Expose
    private String UserVpcEndpointName;

    /**
    * 引擎网络ID
    */
    @SerializedName("EngineNetworkId")
    @Expose
    private String EngineNetworkId;

    /**
    * 手动指定vip，不填自动分配子网下的一个ip
    */
    @SerializedName("UserVpcEndpointVip")
    @Expose
    private String UserVpcEndpointVip;

    /**
     * Get 用户vpcid 
     * @return UserVpcId 用户vpcid
     */
    public String getUserVpcId() {
        return this.UserVpcId;
    }

    /**
     * Set 用户vpcid
     * @param UserVpcId 用户vpcid
     */
    public void setUserVpcId(String UserVpcId) {
        this.UserVpcId = UserVpcId;
    }

    /**
     * Get 用户子网 
     * @return UserSubnetId 用户子网
     */
    public String getUserSubnetId() {
        return this.UserSubnetId;
    }

    /**
     * Set 用户子网
     * @param UserSubnetId 用户子网
     */
    public void setUserSubnetId(String UserSubnetId) {
        this.UserSubnetId = UserSubnetId;
    }

    /**
     * Get 用户终端节点名称 
     * @return UserVpcEndpointName 用户终端节点名称
     */
    public String getUserVpcEndpointName() {
        return this.UserVpcEndpointName;
    }

    /**
     * Set 用户终端节点名称
     * @param UserVpcEndpointName 用户终端节点名称
     */
    public void setUserVpcEndpointName(String UserVpcEndpointName) {
        this.UserVpcEndpointName = UserVpcEndpointName;
    }

    /**
     * Get 引擎网络ID 
     * @return EngineNetworkId 引擎网络ID
     */
    public String getEngineNetworkId() {
        return this.EngineNetworkId;
    }

    /**
     * Set 引擎网络ID
     * @param EngineNetworkId 引擎网络ID
     */
    public void setEngineNetworkId(String EngineNetworkId) {
        this.EngineNetworkId = EngineNetworkId;
    }

    /**
     * Get 手动指定vip，不填自动分配子网下的一个ip 
     * @return UserVpcEndpointVip 手动指定vip，不填自动分配子网下的一个ip
     */
    public String getUserVpcEndpointVip() {
        return this.UserVpcEndpointVip;
    }

    /**
     * Set 手动指定vip，不填自动分配子网下的一个ip
     * @param UserVpcEndpointVip 手动指定vip，不填自动分配子网下的一个ip
     */
    public void setUserVpcEndpointVip(String UserVpcEndpointVip) {
        this.UserVpcEndpointVip = UserVpcEndpointVip;
    }

    public CreateUserVpcConnectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserVpcConnectionRequest(CreateUserVpcConnectionRequest source) {
        if (source.UserVpcId != null) {
            this.UserVpcId = new String(source.UserVpcId);
        }
        if (source.UserSubnetId != null) {
            this.UserSubnetId = new String(source.UserSubnetId);
        }
        if (source.UserVpcEndpointName != null) {
            this.UserVpcEndpointName = new String(source.UserVpcEndpointName);
        }
        if (source.EngineNetworkId != null) {
            this.EngineNetworkId = new String(source.EngineNetworkId);
        }
        if (source.UserVpcEndpointVip != null) {
            this.UserVpcEndpointVip = new String(source.UserVpcEndpointVip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserVpcId", this.UserVpcId);
        this.setParamSimple(map, prefix + "UserSubnetId", this.UserSubnetId);
        this.setParamSimple(map, prefix + "UserVpcEndpointName", this.UserVpcEndpointName);
        this.setParamSimple(map, prefix + "EngineNetworkId", this.EngineNetworkId);
        this.setParamSimple(map, prefix + "UserVpcEndpointVip", this.UserVpcEndpointVip);

    }
}

