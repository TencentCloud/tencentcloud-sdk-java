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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddEnterpriseSecurityGroupRulesRequest extends AbstractModel{

    /**
    * 创建规则数据
    */
    @SerializedName("Data")
    @Expose
    private SecurityGroupRule [] Data;

    /**
    * 添加类型，0：添加到最后，1：添加到最前；2：中间插入；默认0添加到最后
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 是否延迟下发，1则延迟下发，否则立即下发
    */
    @SerializedName("IsDelay")
    @Expose
    private Long IsDelay;

    /**
     * Get 创建规则数据 
     * @return Data 创建规则数据
     */
    public SecurityGroupRule [] getData() {
        return this.Data;
    }

    /**
     * Set 创建规则数据
     * @param Data 创建规则数据
     */
    public void setData(SecurityGroupRule [] Data) {
        this.Data = Data;
    }

    /**
     * Get 添加类型，0：添加到最后，1：添加到最前；2：中间插入；默认0添加到最后 
     * @return Type 添加类型，0：添加到最后，1：添加到最前；2：中间插入；默认0添加到最后
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 添加类型，0：添加到最后，1：添加到最前；2：中间插入；默认0添加到最后
     * @param Type 添加类型，0：添加到最后，1：添加到最前；2：中间插入；默认0添加到最后
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。 
     * @return ClientToken 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。
     * @param ClientToken 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 是否延迟下发，1则延迟下发，否则立即下发 
     * @return IsDelay 是否延迟下发，1则延迟下发，否则立即下发
     */
    public Long getIsDelay() {
        return this.IsDelay;
    }

    /**
     * Set 是否延迟下发，1则延迟下发，否则立即下发
     * @param IsDelay 是否延迟下发，1则延迟下发，否则立即下发
     */
    public void setIsDelay(Long IsDelay) {
        this.IsDelay = IsDelay;
    }

    public AddEnterpriseSecurityGroupRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddEnterpriseSecurityGroupRulesRequest(AddEnterpriseSecurityGroupRulesRequest source) {
        if (source.Data != null) {
            this.Data = new SecurityGroupRule[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new SecurityGroupRule(source.Data[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.IsDelay != null) {
            this.IsDelay = new Long(source.IsDelay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "IsDelay", this.IsDelay);

    }
}

