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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddEnterpriseSecurityGroupRulesRequest extends AbstractModel {

    /**
    * <p>创建规则数据</p>
    */
    @SerializedName("Data")
    @Expose
    private SecurityGroupRule [] Data;

    /**
    * <p>添加类型，0：添加到最后，1：添加到最前；2：中间插入；默认0添加到最后</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>（IsDelay为老版参数，新版无需输入）是否延迟下发，1则延迟下发，否则立即下发</p>
    */
    @SerializedName("IsDelay")
    @Expose
    private Long IsDelay;

    /**
    * <p>来源 默认空 覆盖导入是 batch_import_cover</p>
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * <p>是否复用rule id，1为是，默认不需要</p>
    */
    @SerializedName("IsUseId")
    @Expose
    private Long IsUseId;

    /**
     * Get <p>创建规则数据</p> 
     * @return Data <p>创建规则数据</p>
     */
    public SecurityGroupRule [] getData() {
        return this.Data;
    }

    /**
     * Set <p>创建规则数据</p>
     * @param Data <p>创建规则数据</p>
     */
    public void setData(SecurityGroupRule [] Data) {
        this.Data = Data;
    }

    /**
     * Get <p>添加类型，0：添加到最后，1：添加到最前；2：中间插入；默认0添加到最后</p> 
     * @return Type <p>添加类型，0：添加到最后，1：添加到最前；2：中间插入；默认0添加到最后</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>添加类型，0：添加到最后，1：添加到最前；2：中间插入；默认0添加到最后</p>
     * @param Type <p>添加类型，0：添加到最后，1：添加到最前；2：中间插入；默认0添加到最后</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。</p> 
     * @return ClientToken <p>保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。</p>
     * @param ClientToken <p>保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>（IsDelay为老版参数，新版无需输入）是否延迟下发，1则延迟下发，否则立即下发</p> 
     * @return IsDelay <p>（IsDelay为老版参数，新版无需输入）是否延迟下发，1则延迟下发，否则立即下发</p>
     */
    public Long getIsDelay() {
        return this.IsDelay;
    }

    /**
     * Set <p>（IsDelay为老版参数，新版无需输入）是否延迟下发，1则延迟下发，否则立即下发</p>
     * @param IsDelay <p>（IsDelay为老版参数，新版无需输入）是否延迟下发，1则延迟下发，否则立即下发</p>
     */
    public void setIsDelay(Long IsDelay) {
        this.IsDelay = IsDelay;
    }

    /**
     * Get <p>来源 默认空 覆盖导入是 batch_import_cover</p> 
     * @return From <p>来源 默认空 覆盖导入是 batch_import_cover</p>
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set <p>来源 默认空 覆盖导入是 batch_import_cover</p>
     * @param From <p>来源 默认空 覆盖导入是 batch_import_cover</p>
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get <p>是否复用rule id，1为是，默认不需要</p> 
     * @return IsUseId <p>是否复用rule id，1为是，默认不需要</p>
     */
    public Long getIsUseId() {
        return this.IsUseId;
    }

    /**
     * Set <p>是否复用rule id，1为是，默认不需要</p>
     * @param IsUseId <p>是否复用rule id，1为是，默认不需要</p>
     */
    public void setIsUseId(Long IsUseId) {
        this.IsUseId = IsUseId;
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
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.IsUseId != null) {
            this.IsUseId = new Long(source.IsUseId);
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
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "IsUseId", this.IsUseId);

    }
}

