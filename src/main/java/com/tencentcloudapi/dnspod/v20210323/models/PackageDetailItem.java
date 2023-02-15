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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PackageDetailItem extends AbstractModel{

    /**
    * 套餐原价
    */
    @SerializedName("RealPrice")
    @Expose
    private Long RealPrice;

    /**
    * 可更换域名次数
    */
    @SerializedName("ChangedTimes")
    @Expose
    private Long ChangedTimes;

    /**
    * 允许设置的最小 TTL 值
    */
    @SerializedName("MinTtl")
    @Expose
    private Long MinTtl;

    /**
    * 负载均衡数量
    */
    @SerializedName("RecordRoll")
    @Expose
    private Long RecordRoll;

    /**
    * 子域名级数
    */
    @SerializedName("SubDomainLevel")
    @Expose
    private Long SubDomainLevel;

    /**
    * 泛解析级数
    */
    @SerializedName("MaxWildcard")
    @Expose
    private Long MaxWildcard;

    /**
    * DNS 服务集群个数
    */
    @SerializedName("DnsServerRegion")
    @Expose
    private String DnsServerRegion;

    /**
    * 套餐名称
    */
    @SerializedName("DomainGradeCn")
    @Expose
    private String DomainGradeCn;

    /**
    * 套餐代号
    */
    @SerializedName("GradeLevel")
    @Expose
    private Long GradeLevel;

    /**
    * 套餐对应的 NS
    */
    @SerializedName("Ns")
    @Expose
    private String [] Ns;

    /**
    * 套餐代码
    */
    @SerializedName("DomainGrade")
    @Expose
    private String DomainGrade;

    /**
     * Get 套餐原价 
     * @return RealPrice 套餐原价
     */
    public Long getRealPrice() {
        return this.RealPrice;
    }

    /**
     * Set 套餐原价
     * @param RealPrice 套餐原价
     */
    public void setRealPrice(Long RealPrice) {
        this.RealPrice = RealPrice;
    }

    /**
     * Get 可更换域名次数 
     * @return ChangedTimes 可更换域名次数
     */
    public Long getChangedTimes() {
        return this.ChangedTimes;
    }

    /**
     * Set 可更换域名次数
     * @param ChangedTimes 可更换域名次数
     */
    public void setChangedTimes(Long ChangedTimes) {
        this.ChangedTimes = ChangedTimes;
    }

    /**
     * Get 允许设置的最小 TTL 值 
     * @return MinTtl 允许设置的最小 TTL 值
     */
    public Long getMinTtl() {
        return this.MinTtl;
    }

    /**
     * Set 允许设置的最小 TTL 值
     * @param MinTtl 允许设置的最小 TTL 值
     */
    public void setMinTtl(Long MinTtl) {
        this.MinTtl = MinTtl;
    }

    /**
     * Get 负载均衡数量 
     * @return RecordRoll 负载均衡数量
     */
    public Long getRecordRoll() {
        return this.RecordRoll;
    }

    /**
     * Set 负载均衡数量
     * @param RecordRoll 负载均衡数量
     */
    public void setRecordRoll(Long RecordRoll) {
        this.RecordRoll = RecordRoll;
    }

    /**
     * Get 子域名级数 
     * @return SubDomainLevel 子域名级数
     */
    public Long getSubDomainLevel() {
        return this.SubDomainLevel;
    }

    /**
     * Set 子域名级数
     * @param SubDomainLevel 子域名级数
     */
    public void setSubDomainLevel(Long SubDomainLevel) {
        this.SubDomainLevel = SubDomainLevel;
    }

    /**
     * Get 泛解析级数 
     * @return MaxWildcard 泛解析级数
     */
    public Long getMaxWildcard() {
        return this.MaxWildcard;
    }

    /**
     * Set 泛解析级数
     * @param MaxWildcard 泛解析级数
     */
    public void setMaxWildcard(Long MaxWildcard) {
        this.MaxWildcard = MaxWildcard;
    }

    /**
     * Get DNS 服务集群个数 
     * @return DnsServerRegion DNS 服务集群个数
     */
    public String getDnsServerRegion() {
        return this.DnsServerRegion;
    }

    /**
     * Set DNS 服务集群个数
     * @param DnsServerRegion DNS 服务集群个数
     */
    public void setDnsServerRegion(String DnsServerRegion) {
        this.DnsServerRegion = DnsServerRegion;
    }

    /**
     * Get 套餐名称 
     * @return DomainGradeCn 套餐名称
     */
    public String getDomainGradeCn() {
        return this.DomainGradeCn;
    }

    /**
     * Set 套餐名称
     * @param DomainGradeCn 套餐名称
     */
    public void setDomainGradeCn(String DomainGradeCn) {
        this.DomainGradeCn = DomainGradeCn;
    }

    /**
     * Get 套餐代号 
     * @return GradeLevel 套餐代号
     */
    public Long getGradeLevel() {
        return this.GradeLevel;
    }

    /**
     * Set 套餐代号
     * @param GradeLevel 套餐代号
     */
    public void setGradeLevel(Long GradeLevel) {
        this.GradeLevel = GradeLevel;
    }

    /**
     * Get 套餐对应的 NS 
     * @return Ns 套餐对应的 NS
     */
    public String [] getNs() {
        return this.Ns;
    }

    /**
     * Set 套餐对应的 NS
     * @param Ns 套餐对应的 NS
     */
    public void setNs(String [] Ns) {
        this.Ns = Ns;
    }

    /**
     * Get 套餐代码 
     * @return DomainGrade 套餐代码
     */
    public String getDomainGrade() {
        return this.DomainGrade;
    }

    /**
     * Set 套餐代码
     * @param DomainGrade 套餐代码
     */
    public void setDomainGrade(String DomainGrade) {
        this.DomainGrade = DomainGrade;
    }

    public PackageDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PackageDetailItem(PackageDetailItem source) {
        if (source.RealPrice != null) {
            this.RealPrice = new Long(source.RealPrice);
        }
        if (source.ChangedTimes != null) {
            this.ChangedTimes = new Long(source.ChangedTimes);
        }
        if (source.MinTtl != null) {
            this.MinTtl = new Long(source.MinTtl);
        }
        if (source.RecordRoll != null) {
            this.RecordRoll = new Long(source.RecordRoll);
        }
        if (source.SubDomainLevel != null) {
            this.SubDomainLevel = new Long(source.SubDomainLevel);
        }
        if (source.MaxWildcard != null) {
            this.MaxWildcard = new Long(source.MaxWildcard);
        }
        if (source.DnsServerRegion != null) {
            this.DnsServerRegion = new String(source.DnsServerRegion);
        }
        if (source.DomainGradeCn != null) {
            this.DomainGradeCn = new String(source.DomainGradeCn);
        }
        if (source.GradeLevel != null) {
            this.GradeLevel = new Long(source.GradeLevel);
        }
        if (source.Ns != null) {
            this.Ns = new String[source.Ns.length];
            for (int i = 0; i < source.Ns.length; i++) {
                this.Ns[i] = new String(source.Ns[i]);
            }
        }
        if (source.DomainGrade != null) {
            this.DomainGrade = new String(source.DomainGrade);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealPrice", this.RealPrice);
        this.setParamSimple(map, prefix + "ChangedTimes", this.ChangedTimes);
        this.setParamSimple(map, prefix + "MinTtl", this.MinTtl);
        this.setParamSimple(map, prefix + "RecordRoll", this.RecordRoll);
        this.setParamSimple(map, prefix + "SubDomainLevel", this.SubDomainLevel);
        this.setParamSimple(map, prefix + "MaxWildcard", this.MaxWildcard);
        this.setParamSimple(map, prefix + "DnsServerRegion", this.DnsServerRegion);
        this.setParamSimple(map, prefix + "DomainGradeCn", this.DomainGradeCn);
        this.setParamSimple(map, prefix + "GradeLevel", this.GradeLevel);
        this.setParamArraySimple(map, prefix + "Ns.", this.Ns);
        this.setParamSimple(map, prefix + "DomainGrade", this.DomainGrade);

    }
}

