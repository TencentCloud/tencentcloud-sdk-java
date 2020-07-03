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

public class CustomerGateway extends AbstractModel{

    /**
    * 用户网关唯一ID
    */
    @SerializedName("CustomerGatewayId")
    @Expose
    private String CustomerGatewayId;

    /**
    * 网关名称
    */
    @SerializedName("CustomerGatewayName")
    @Expose
    private String CustomerGatewayName;

    /**
    * 公网地址
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 用户网关唯一ID 
     * @return CustomerGatewayId 用户网关唯一ID
     */
    public String getCustomerGatewayId() {
        return this.CustomerGatewayId;
    }

    /**
     * Set 用户网关唯一ID
     * @param CustomerGatewayId 用户网关唯一ID
     */
    public void setCustomerGatewayId(String CustomerGatewayId) {
        this.CustomerGatewayId = CustomerGatewayId;
    }

    /**
     * Get 网关名称 
     * @return CustomerGatewayName 网关名称
     */
    public String getCustomerGatewayName() {
        return this.CustomerGatewayName;
    }

    /**
     * Set 网关名称
     * @param CustomerGatewayName 网关名称
     */
    public void setCustomerGatewayName(String CustomerGatewayName) {
        this.CustomerGatewayName = CustomerGatewayName;
    }

    /**
     * Get 公网地址 
     * @return IpAddress 公网地址
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set 公网地址
     * @param IpAddress 公网地址
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerGatewayId", this.CustomerGatewayId);
        this.setParamSimple(map, prefix + "CustomerGatewayName", this.CustomerGatewayName);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

