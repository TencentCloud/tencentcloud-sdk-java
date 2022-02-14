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

public class CcBlackWhiteIpPolicy extends AbstractModel{

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
    * IP地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * IP类型，取值[black(黑名单IP), white(白名单IP)]
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 黑白名单IP地址
    */
    @SerializedName("BlackWhiteIp")
    @Expose
    private String BlackWhiteIp;

    /**
    * 掩码
    */
    @SerializedName("Mask")
    @Expose
    private Long Mask;

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
     * Get IP地址 
     * @return Ip IP地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP地址
     * @param Ip IP地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
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
     * Get IP类型，取值[black(黑名单IP), white(白名单IP)] 
     * @return Type IP类型，取值[black(黑名单IP), white(白名单IP)]
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set IP类型，取值[black(黑名单IP), white(白名单IP)]
     * @param Type IP类型，取值[black(黑名单IP), white(白名单IP)]
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 黑白名单IP地址 
     * @return BlackWhiteIp 黑白名单IP地址
     */
    public String getBlackWhiteIp() {
        return this.BlackWhiteIp;
    }

    /**
     * Set 黑白名单IP地址
     * @param BlackWhiteIp 黑白名单IP地址
     */
    public void setBlackWhiteIp(String BlackWhiteIp) {
        this.BlackWhiteIp = BlackWhiteIp;
    }

    /**
     * Get 掩码 
     * @return Mask 掩码
     */
    public Long getMask() {
        return this.Mask;
    }

    /**
     * Set 掩码
     * @param Mask 掩码
     */
    public void setMask(Long Mask) {
        this.Mask = Mask;
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

    public CcBlackWhiteIpPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcBlackWhiteIpPolicy(CcBlackWhiteIpPolicy source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.BlackWhiteIp != null) {
            this.BlackWhiteIp = new String(source.BlackWhiteIp);
        }
        if (source.Mask != null) {
            this.Mask = new Long(source.Mask);
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
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "BlackWhiteIp", this.BlackWhiteIp);
        this.setParamSimple(map, prefix + "Mask", this.Mask);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

