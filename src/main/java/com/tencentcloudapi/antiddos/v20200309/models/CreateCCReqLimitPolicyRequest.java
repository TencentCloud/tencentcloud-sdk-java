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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCCReqLimitPolicyRequest extends AbstractModel {

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * IP值
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 协议，可取值http, https, http/https
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 策略项
    */
    @SerializedName("Policy")
    @Expose
    private CCReqLimitPolicyRecord Policy;

    /**
    * 是否为兜底频控 0表示不是 1表示是
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get IP值 
     * @return Ip IP值
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP值
     * @param Ip IP值
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 协议，可取值http, https, http/https 
     * @return Protocol 协议，可取值http, https, http/https
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议，可取值http, https, http/https
     * @param Protocol 协议，可取值http, https, http/https
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 策略项 
     * @return Policy 策略项
     */
    public CCReqLimitPolicyRecord getPolicy() {
        return this.Policy;
    }

    /**
     * Set 策略项
     * @param Policy 策略项
     */
    public void setPolicy(CCReqLimitPolicyRecord Policy) {
        this.Policy = Policy;
    }

    /**
     * Get 是否为兜底频控 0表示不是 1表示是 
     * @return IsGlobal 是否为兜底频控 0表示不是 1表示是
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 是否为兜底频控 0表示不是 1表示是
     * @param IsGlobal 是否为兜底频控 0表示不是 1表示是
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    public CreateCCReqLimitPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCCReqLimitPolicyRequest(CreateCCReqLimitPolicyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Policy != null) {
            this.Policy = new CCReqLimitPolicyRecord(source.Policy);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamObj(map, prefix + "Policy.", this.Policy);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);

    }
}

