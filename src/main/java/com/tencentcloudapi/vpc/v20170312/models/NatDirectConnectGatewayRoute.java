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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatDirectConnectGatewayRoute extends AbstractModel{

    /**
    * 子网的 `IPv4` `CIDR`
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * 下一跳网关的类型，目前此接口支持的类型有：
DIRECTCONNECT：专线网关
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * 下一跳网关ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 路由的创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 路由的更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 子网的 `IPv4` `CIDR` 
     * @return DestinationCidrBlock 子网的 `IPv4` `CIDR`
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set 子网的 `IPv4` `CIDR`
     * @param DestinationCidrBlock 子网的 `IPv4` `CIDR`
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get 下一跳网关的类型，目前此接口支持的类型有：
DIRECTCONNECT：专线网关 
     * @return GatewayType 下一跳网关的类型，目前此接口支持的类型有：
DIRECTCONNECT：专线网关
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set 下一跳网关的类型，目前此接口支持的类型有：
DIRECTCONNECT：专线网关
     * @param GatewayType 下一跳网关的类型，目前此接口支持的类型有：
DIRECTCONNECT：专线网关
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get 下一跳网关ID 
     * @return GatewayId 下一跳网关ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 下一跳网关ID
     * @param GatewayId 下一跳网关ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 路由的创建时间 
     * @return CreateTime 路由的创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 路由的创建时间
     * @param CreateTime 路由的创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 路由的更新时间 
     * @return UpdateTime 路由的更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 路由的更新时间
     * @param UpdateTime 路由的更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public NatDirectConnectGatewayRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatDirectConnectGatewayRoute(NatDirectConnectGatewayRoute source) {
        if (source.DestinationCidrBlock != null) {
            this.DestinationCidrBlock = new String(source.DestinationCidrBlock);
        }
        if (source.GatewayType != null) {
            this.GatewayType = new String(source.GatewayType);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

