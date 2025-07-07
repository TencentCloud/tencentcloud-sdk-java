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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FindAllDomainDetail extends AbstractModel {

    /**
    * 用户id
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名ip
    */
    @SerializedName("Ips")
    @Expose
    private String [] Ips;

    /**
    * 发现时间
    */
    @SerializedName("FindTime")
    @Expose
    private String FindTime;

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 域名id
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * waf类型
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 是否接入waf
    */
    @SerializedName("IsWafDomain")
    @Expose
    private Long IsWafDomain;

    /**
     * Get 用户id 
     * @return Appid 用户id
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set 用户id
     * @param Appid 用户id
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
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
     * Get 域名ip 
     * @return Ips 域名ip
     */
    public String [] getIps() {
        return this.Ips;
    }

    /**
     * Set 域名ip
     * @param Ips 域名ip
     */
    public void setIps(String [] Ips) {
        this.Ips = Ips;
    }

    /**
     * Get 发现时间 
     * @return FindTime 发现时间
     */
    public String getFindTime() {
        return this.FindTime;
    }

    /**
     * Set 发现时间
     * @param FindTime 发现时间
     */
    public void setFindTime(String FindTime) {
        this.FindTime = FindTime;
    }

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 域名id 
     * @return DomainId 域名id
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名id
     * @param DomainId 域名id
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get waf类型 
     * @return Edition waf类型
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set waf类型
     * @param Edition waf类型
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 是否接入waf 
     * @return IsWafDomain 是否接入waf
     */
    public Long getIsWafDomain() {
        return this.IsWafDomain;
    }

    /**
     * Set 是否接入waf
     * @param IsWafDomain 是否接入waf
     */
    public void setIsWafDomain(Long IsWafDomain) {
        this.IsWafDomain = IsWafDomain;
    }

    public FindAllDomainDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FindAllDomainDetail(FindAllDomainDetail source) {
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Ips != null) {
            this.Ips = new String[source.Ips.length];
            for (int i = 0; i < source.Ips.length; i++) {
                this.Ips[i] = new String(source.Ips[i]);
            }
        }
        if (source.FindTime != null) {
            this.FindTime = new String(source.FindTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.IsWafDomain != null) {
            this.IsWafDomain = new Long(source.IsWafDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "Ips.", this.Ips);
        this.setParamSimple(map, prefix + "FindTime", this.FindTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "IsWafDomain", this.IsWafDomain);

    }
}

