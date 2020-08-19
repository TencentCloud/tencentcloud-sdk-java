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

public class CreateCustomerGatewayRequest extends AbstractModel{

    /**
    * 对端网关名称，可任意命名，但不得超过60个字符。
    */
    @SerializedName("CustomerGatewayName")
    @Expose
    private String CustomerGatewayName;

    /**
    * 对端网关公网IP。
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 对端网关名称，可任意命名，但不得超过60个字符。 
     * @return CustomerGatewayName 对端网关名称，可任意命名，但不得超过60个字符。
     */
    public String getCustomerGatewayName() {
        return this.CustomerGatewayName;
    }

    /**
     * Set 对端网关名称，可任意命名，但不得超过60个字符。
     * @param CustomerGatewayName 对端网关名称，可任意命名，但不得超过60个字符。
     */
    public void setCustomerGatewayName(String CustomerGatewayName) {
        this.CustomerGatewayName = CustomerGatewayName;
    }

    /**
     * Get 对端网关公网IP。 
     * @return IpAddress 对端网关公网IP。
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set 对端网关公网IP。
     * @param IpAddress 对端网关公网IP。
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}] 
     * @return Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
     * @param Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerGatewayName", this.CustomerGatewayName);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

