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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCCPrecisionPolicyRequest extends AbstractModel{

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
    * 协议， 可取值HTTP，HTTPS
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
    * 策略方式，可取值alg表示验证码，drop表示丢弃
    */
    @SerializedName("PolicyAction")
    @Expose
    private String PolicyAction;

    /**
    * 策略记录
    */
    @SerializedName("PolicyList")
    @Expose
    private CCPrecisionPlyRecord [] PolicyList;

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
     * Get 协议， 可取值HTTP，HTTPS 
     * @return Protocol 协议， 可取值HTTP，HTTPS
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议， 可取值HTTP，HTTPS
     * @param Protocol 协议， 可取值HTTP，HTTPS
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
     * Get 策略方式，可取值alg表示验证码，drop表示丢弃 
     * @return PolicyAction 策略方式，可取值alg表示验证码，drop表示丢弃
     */
    public String getPolicyAction() {
        return this.PolicyAction;
    }

    /**
     * Set 策略方式，可取值alg表示验证码，drop表示丢弃
     * @param PolicyAction 策略方式，可取值alg表示验证码，drop表示丢弃
     */
    public void setPolicyAction(String PolicyAction) {
        this.PolicyAction = PolicyAction;
    }

    /**
     * Get 策略记录 
     * @return PolicyList 策略记录
     */
    public CCPrecisionPlyRecord [] getPolicyList() {
        return this.PolicyList;
    }

    /**
     * Set 策略记录
     * @param PolicyList 策略记录
     */
    public void setPolicyList(CCPrecisionPlyRecord [] PolicyList) {
        this.PolicyList = PolicyList;
    }

    public CreateCCPrecisionPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCCPrecisionPolicyRequest(CreateCCPrecisionPolicyRequest source) {
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
        if (source.PolicyAction != null) {
            this.PolicyAction = new String(source.PolicyAction);
        }
        if (source.PolicyList != null) {
            this.PolicyList = new CCPrecisionPlyRecord[source.PolicyList.length];
            for (int i = 0; i < source.PolicyList.length; i++) {
                this.PolicyList[i] = new CCPrecisionPlyRecord(source.PolicyList[i]);
            }
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
        this.setParamSimple(map, prefix + "PolicyAction", this.PolicyAction);
        this.setParamArrayObj(map, prefix + "PolicyList.", this.PolicyList);

    }
}

