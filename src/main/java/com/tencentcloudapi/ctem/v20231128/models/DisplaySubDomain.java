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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisplaySubDomain extends AbstractModel {

    /**
    * <p>主键ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>子域名</p>
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * <p>Ip</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>国家</p>
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * <p>省份</p>
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * <p>城市</p>
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * <p>互联网服务提供商</p>
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * <p>公共字段</p>
    */
    @SerializedName("DisplayToolCommon")
    @Expose
    private DisplayToolCommon DisplayToolCommon;

    /**
    * <p>是否为云资产：0-非云资产 1-是云资产</p>
    */
    @SerializedName("IsCloudAsset")
    @Expose
    private Long IsCloudAsset;

    /**
    * <p>云资产是否下线：-1-已下线 0-正常</p>
    */
    @SerializedName("CloudAssetStatus")
    @Expose
    private Long CloudAssetStatus;

    /**
    * <p>可用率（百分比）</p>
    */
    @SerializedName("AvailabilityRate")
    @Expose
    private Long AvailabilityRate;

    /**
    * <p>可用状态 1:异常 0:正常</p>
    */
    @SerializedName("AvailabilityState")
    @Expose
    private Long AvailabilityState;

    /**
    * <p>域名解析状态 1:异常 0:正常</p>
    */
    @SerializedName("AnalysisState")
    @Expose
    private Long AnalysisState;

    /**
    * <p>平均时延：单位ms</p>
    */
    @SerializedName("AverageDelay")
    @Expose
    private Long AverageDelay;

    /**
    * <p>丢包率（百分比）</p>
    */
    @SerializedName("LossRate")
    @Expose
    private Long LossRate;

    /**
    * <p>DNS解析类型</p><p>A、AAAA、MX、CNAME、NX</p>
    */
    @SerializedName("DnsType")
    @Expose
    private String DnsType;

    /**
    * <p>DNS解析值</p>
    */
    @SerializedName("DnsValue")
    @Expose
    private String DnsValue;

    /**
     * Get <p>主键ID</p> 
     * @return Id <p>主键ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>主键ID</p>
     * @param Id <p>主键ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>子域名</p> 
     * @return SubDomain <p>子域名</p>
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set <p>子域名</p>
     * @param SubDomain <p>子域名</p>
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get <p>Ip</p> 
     * @return Ip <p>Ip</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>Ip</p>
     * @param Ip <p>Ip</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>国家</p> 
     * @return Country <p>国家</p>
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set <p>国家</p>
     * @param Country <p>国家</p>
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get <p>省份</p> 
     * @return Province <p>省份</p>
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set <p>省份</p>
     * @param Province <p>省份</p>
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get <p>城市</p> 
     * @return City <p>城市</p>
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set <p>城市</p>
     * @param City <p>城市</p>
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get <p>互联网服务提供商</p> 
     * @return Isp <p>互联网服务提供商</p>
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set <p>互联网服务提供商</p>
     * @param Isp <p>互联网服务提供商</p>
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get <p>公共字段</p> 
     * @return DisplayToolCommon <p>公共字段</p>
     */
    public DisplayToolCommon getDisplayToolCommon() {
        return this.DisplayToolCommon;
    }

    /**
     * Set <p>公共字段</p>
     * @param DisplayToolCommon <p>公共字段</p>
     */
    public void setDisplayToolCommon(DisplayToolCommon DisplayToolCommon) {
        this.DisplayToolCommon = DisplayToolCommon;
    }

    /**
     * Get <p>是否为云资产：0-非云资产 1-是云资产</p> 
     * @return IsCloudAsset <p>是否为云资产：0-非云资产 1-是云资产</p>
     */
    public Long getIsCloudAsset() {
        return this.IsCloudAsset;
    }

    /**
     * Set <p>是否为云资产：0-非云资产 1-是云资产</p>
     * @param IsCloudAsset <p>是否为云资产：0-非云资产 1-是云资产</p>
     */
    public void setIsCloudAsset(Long IsCloudAsset) {
        this.IsCloudAsset = IsCloudAsset;
    }

    /**
     * Get <p>云资产是否下线：-1-已下线 0-正常</p> 
     * @return CloudAssetStatus <p>云资产是否下线：-1-已下线 0-正常</p>
     */
    public Long getCloudAssetStatus() {
        return this.CloudAssetStatus;
    }

    /**
     * Set <p>云资产是否下线：-1-已下线 0-正常</p>
     * @param CloudAssetStatus <p>云资产是否下线：-1-已下线 0-正常</p>
     */
    public void setCloudAssetStatus(Long CloudAssetStatus) {
        this.CloudAssetStatus = CloudAssetStatus;
    }

    /**
     * Get <p>可用率（百分比）</p> 
     * @return AvailabilityRate <p>可用率（百分比）</p>
     */
    public Long getAvailabilityRate() {
        return this.AvailabilityRate;
    }

    /**
     * Set <p>可用率（百分比）</p>
     * @param AvailabilityRate <p>可用率（百分比）</p>
     */
    public void setAvailabilityRate(Long AvailabilityRate) {
        this.AvailabilityRate = AvailabilityRate;
    }

    /**
     * Get <p>可用状态 1:异常 0:正常</p> 
     * @return AvailabilityState <p>可用状态 1:异常 0:正常</p>
     */
    public Long getAvailabilityState() {
        return this.AvailabilityState;
    }

    /**
     * Set <p>可用状态 1:异常 0:正常</p>
     * @param AvailabilityState <p>可用状态 1:异常 0:正常</p>
     */
    public void setAvailabilityState(Long AvailabilityState) {
        this.AvailabilityState = AvailabilityState;
    }

    /**
     * Get <p>域名解析状态 1:异常 0:正常</p> 
     * @return AnalysisState <p>域名解析状态 1:异常 0:正常</p>
     */
    public Long getAnalysisState() {
        return this.AnalysisState;
    }

    /**
     * Set <p>域名解析状态 1:异常 0:正常</p>
     * @param AnalysisState <p>域名解析状态 1:异常 0:正常</p>
     */
    public void setAnalysisState(Long AnalysisState) {
        this.AnalysisState = AnalysisState;
    }

    /**
     * Get <p>平均时延：单位ms</p> 
     * @return AverageDelay <p>平均时延：单位ms</p>
     */
    public Long getAverageDelay() {
        return this.AverageDelay;
    }

    /**
     * Set <p>平均时延：单位ms</p>
     * @param AverageDelay <p>平均时延：单位ms</p>
     */
    public void setAverageDelay(Long AverageDelay) {
        this.AverageDelay = AverageDelay;
    }

    /**
     * Get <p>丢包率（百分比）</p> 
     * @return LossRate <p>丢包率（百分比）</p>
     */
    public Long getLossRate() {
        return this.LossRate;
    }

    /**
     * Set <p>丢包率（百分比）</p>
     * @param LossRate <p>丢包率（百分比）</p>
     */
    public void setLossRate(Long LossRate) {
        this.LossRate = LossRate;
    }

    /**
     * Get <p>DNS解析类型</p><p>A、AAAA、MX、CNAME、NX</p> 
     * @return DnsType <p>DNS解析类型</p><p>A、AAAA、MX、CNAME、NX</p>
     */
    public String getDnsType() {
        return this.DnsType;
    }

    /**
     * Set <p>DNS解析类型</p><p>A、AAAA、MX、CNAME、NX</p>
     * @param DnsType <p>DNS解析类型</p><p>A、AAAA、MX、CNAME、NX</p>
     */
    public void setDnsType(String DnsType) {
        this.DnsType = DnsType;
    }

    /**
     * Get <p>DNS解析值</p> 
     * @return DnsValue <p>DNS解析值</p>
     */
    public String getDnsValue() {
        return this.DnsValue;
    }

    /**
     * Set <p>DNS解析值</p>
     * @param DnsValue <p>DNS解析值</p>
     */
    public void setDnsValue(String DnsValue) {
        this.DnsValue = DnsValue;
    }

    public DisplaySubDomain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplaySubDomain(DisplaySubDomain source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.DisplayToolCommon != null) {
            this.DisplayToolCommon = new DisplayToolCommon(source.DisplayToolCommon);
        }
        if (source.IsCloudAsset != null) {
            this.IsCloudAsset = new Long(source.IsCloudAsset);
        }
        if (source.CloudAssetStatus != null) {
            this.CloudAssetStatus = new Long(source.CloudAssetStatus);
        }
        if (source.AvailabilityRate != null) {
            this.AvailabilityRate = new Long(source.AvailabilityRate);
        }
        if (source.AvailabilityState != null) {
            this.AvailabilityState = new Long(source.AvailabilityState);
        }
        if (source.AnalysisState != null) {
            this.AnalysisState = new Long(source.AnalysisState);
        }
        if (source.AverageDelay != null) {
            this.AverageDelay = new Long(source.AverageDelay);
        }
        if (source.LossRate != null) {
            this.LossRate = new Long(source.LossRate);
        }
        if (source.DnsType != null) {
            this.DnsType = new String(source.DnsType);
        }
        if (source.DnsValue != null) {
            this.DnsValue = new String(source.DnsValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamObj(map, prefix + "DisplayToolCommon.", this.DisplayToolCommon);
        this.setParamSimple(map, prefix + "IsCloudAsset", this.IsCloudAsset);
        this.setParamSimple(map, prefix + "CloudAssetStatus", this.CloudAssetStatus);
        this.setParamSimple(map, prefix + "AvailabilityRate", this.AvailabilityRate);
        this.setParamSimple(map, prefix + "AvailabilityState", this.AvailabilityState);
        this.setParamSimple(map, prefix + "AnalysisState", this.AnalysisState);
        this.setParamSimple(map, prefix + "AverageDelay", this.AverageDelay);
        this.setParamSimple(map, prefix + "LossRate", this.LossRate);
        this.setParamSimple(map, prefix + "DnsType", this.DnsType);
        this.setParamSimple(map, prefix + "DnsValue", this.DnsValue);

    }
}

