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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyProxiesAttributeRequest extends AbstractModel{

    /**
    * （旧参数，请切换到ProxyIds）一个或多个待操作的通道ID。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 通道名称。可任意命名，但不得超过30个字符。
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * （新参数）一个或多个待操作的通道ID。
    */
    @SerializedName("ProxyIds")
    @Expose
    private String [] ProxyIds;

    /**
     * Get （旧参数，请切换到ProxyIds）一个或多个待操作的通道ID。 
     * @return InstanceIds （旧参数，请切换到ProxyIds）一个或多个待操作的通道ID。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set （旧参数，请切换到ProxyIds）一个或多个待操作的通道ID。
     * @param InstanceIds （旧参数，请切换到ProxyIds）一个或多个待操作的通道ID。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 通道名称。可任意命名，但不得超过30个字符。 
     * @return ProxyName 通道名称。可任意命名，但不得超过30个字符。
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set 通道名称。可任意命名，但不得超过30个字符。
     * @param ProxyName 通道名称。可任意命名，但不得超过30个字符。
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。 
     * @return ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。
     * @param ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get （新参数）一个或多个待操作的通道ID。 
     * @return ProxyIds （新参数）一个或多个待操作的通道ID。
     */
    public String [] getProxyIds() {
        return this.ProxyIds;
    }

    /**
     * Set （新参数）一个或多个待操作的通道ID。
     * @param ProxyIds （新参数）一个或多个待操作的通道ID。
     */
    public void setProxyIds(String [] ProxyIds) {
        this.ProxyIds = ProxyIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamArraySimple(map, prefix + "ProxyIds.", this.ProxyIds);

    }
}

