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

public class CcGeoIpPolicyNew extends AbstractModel{

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
    * 协议，可取值HTTP，HTTPS
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 用户动作，drop或alg
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 地域类型，分为china, oversea与customized
    */
    @SerializedName("RegionType")
    @Expose
    private String RegionType;

    /**
    * 用户选择封禁的地域ID列表
    */
    @SerializedName("AreaList")
    @Expose
    private Long [] AreaList;

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
     * Get 协议，可取值HTTP，HTTPS 
     * @return Protocol 协议，可取值HTTP，HTTPS
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议，可取值HTTP，HTTPS
     * @param Protocol 协议，可取值HTTP，HTTPS
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 用户动作，drop或alg 
     * @return Action 用户动作，drop或alg
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 用户动作，drop或alg
     * @param Action 用户动作，drop或alg
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 地域类型，分为china, oversea与customized 
     * @return RegionType 地域类型，分为china, oversea与customized
     */
    public String getRegionType() {
        return this.RegionType;
    }

    /**
     * Set 地域类型，分为china, oversea与customized
     * @param RegionType 地域类型，分为china, oversea与customized
     */
    public void setRegionType(String RegionType) {
        this.RegionType = RegionType;
    }

    /**
     * Get 用户选择封禁的地域ID列表 
     * @return AreaList 用户选择封禁的地域ID列表
     */
    public Long [] getAreaList() {
        return this.AreaList;
    }

    /**
     * Set 用户选择封禁的地域ID列表
     * @param AreaList 用户选择封禁的地域ID列表
     */
    public void setAreaList(Long [] AreaList) {
        this.AreaList = AreaList;
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

    public CcGeoIpPolicyNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcGeoIpPolicyNew(CcGeoIpPolicyNew source) {
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
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RegionType != null) {
            this.RegionType = new String(source.RegionType);
        }
        if (source.AreaList != null) {
            this.AreaList = new Long[source.AreaList.length];
            for (int i = 0; i < source.AreaList.length; i++) {
                this.AreaList[i] = new Long(source.AreaList[i]);
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
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RegionType", this.RegionType);
        this.setParamArraySimple(map, prefix + "AreaList.", this.AreaList);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

