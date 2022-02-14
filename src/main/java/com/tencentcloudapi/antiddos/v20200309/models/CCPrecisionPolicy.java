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

public class CCPrecisionPolicy extends AbstractModel{

    /**
    * 策略Id
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Ip地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 协议
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
    * 策略方式（丢弃或验证码）
    */
    @SerializedName("PolicyAction")
    @Expose
    private String PolicyAction;

    /**
    * 策略列表
    */
    @SerializedName("PolicyList")
    @Expose
    private CCPrecisionPlyRecord [] PolicyList;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 策略Id 
     * @return PolicyId 策略Id
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略Id
     * @param PolicyId 策略Id
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

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
     * Get Ip地址 
     * @return Ip Ip地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Ip地址
     * @param Ip Ip地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 协议 
     * @return Protocol 协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议
     * @param Protocol 协议
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
     * Get 策略方式（丢弃或验证码） 
     * @return PolicyAction 策略方式（丢弃或验证码）
     */
    public String getPolicyAction() {
        return this.PolicyAction;
    }

    /**
     * Set 策略方式（丢弃或验证码）
     * @param PolicyAction 策略方式（丢弃或验证码）
     */
    public void setPolicyAction(String PolicyAction) {
        this.PolicyAction = PolicyAction;
    }

    /**
     * Get 策略列表 
     * @return PolicyList 策略列表
     */
    public CCPrecisionPlyRecord [] getPolicyList() {
        return this.PolicyList;
    }

    /**
     * Set 策略列表
     * @param PolicyList 策略列表
     */
    public void setPolicyList(CCPrecisionPlyRecord [] PolicyList) {
        this.PolicyList = PolicyList;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public CCPrecisionPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CCPrecisionPolicy(CCPrecisionPolicy source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "PolicyAction", this.PolicyAction);
        this.setParamArrayObj(map, prefix + "PolicyList.", this.PolicyList);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

