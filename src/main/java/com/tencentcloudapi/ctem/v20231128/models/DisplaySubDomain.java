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
    * 主键ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 子域名
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * Ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 国家
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 省份
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 城市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 互联网服务提供商
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * 公共字段
    */
    @SerializedName("DisplayToolCommon")
    @Expose
    private DisplayToolCommon DisplayToolCommon;

    /**
    * 是否为云资产：0-非云资产 1-是云资产
    */
    @SerializedName("IsCloudAsset")
    @Expose
    private Long IsCloudAsset;

    /**
    * 云资产是否下线：-1-已下线 0-正常
    */
    @SerializedName("CloudAssetStatus")
    @Expose
    private Long CloudAssetStatus;

    /**
    * 可用率（百分比）
    */
    @SerializedName("AvailabilityRate")
    @Expose
    private Long AvailabilityRate;

    /**
    * 可用状态 1:异常 0:正常
    */
    @SerializedName("AvailabilityState")
    @Expose
    private Long AvailabilityState;

    /**
    * 域名解析状态 1:异常 0:正常
    */
    @SerializedName("AnalysisState")
    @Expose
    private Long AnalysisState;

    /**
    * 平均时延：单位ms
    */
    @SerializedName("AverageDelay")
    @Expose
    private Long AverageDelay;

    /**
    * 丢包率（百分比）
    */
    @SerializedName("LossRate")
    @Expose
    private Long LossRate;

    /**
     * Get 主键ID 
     * @return Id 主键ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 主键ID
     * @param Id 主键ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 子域名 
     * @return SubDomain 子域名
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 子域名
     * @param SubDomain 子域名
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get Ip 
     * @return Ip Ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Ip
     * @param Ip Ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 国家 
     * @return Country 国家
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 国家
     * @param Country 国家
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 省份 
     * @return Province 省份
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省份
     * @param Province 省份
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 城市 
     * @return City 城市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 城市
     * @param City 城市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 互联网服务提供商 
     * @return Isp 互联网服务提供商
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set 互联网服务提供商
     * @param Isp 互联网服务提供商
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get 公共字段 
     * @return DisplayToolCommon 公共字段
     */
    public DisplayToolCommon getDisplayToolCommon() {
        return this.DisplayToolCommon;
    }

    /**
     * Set 公共字段
     * @param DisplayToolCommon 公共字段
     */
    public void setDisplayToolCommon(DisplayToolCommon DisplayToolCommon) {
        this.DisplayToolCommon = DisplayToolCommon;
    }

    /**
     * Get 是否为云资产：0-非云资产 1-是云资产 
     * @return IsCloudAsset 是否为云资产：0-非云资产 1-是云资产
     */
    public Long getIsCloudAsset() {
        return this.IsCloudAsset;
    }

    /**
     * Set 是否为云资产：0-非云资产 1-是云资产
     * @param IsCloudAsset 是否为云资产：0-非云资产 1-是云资产
     */
    public void setIsCloudAsset(Long IsCloudAsset) {
        this.IsCloudAsset = IsCloudAsset;
    }

    /**
     * Get 云资产是否下线：-1-已下线 0-正常 
     * @return CloudAssetStatus 云资产是否下线：-1-已下线 0-正常
     */
    public Long getCloudAssetStatus() {
        return this.CloudAssetStatus;
    }

    /**
     * Set 云资产是否下线：-1-已下线 0-正常
     * @param CloudAssetStatus 云资产是否下线：-1-已下线 0-正常
     */
    public void setCloudAssetStatus(Long CloudAssetStatus) {
        this.CloudAssetStatus = CloudAssetStatus;
    }

    /**
     * Get 可用率（百分比） 
     * @return AvailabilityRate 可用率（百分比）
     */
    public Long getAvailabilityRate() {
        return this.AvailabilityRate;
    }

    /**
     * Set 可用率（百分比）
     * @param AvailabilityRate 可用率（百分比）
     */
    public void setAvailabilityRate(Long AvailabilityRate) {
        this.AvailabilityRate = AvailabilityRate;
    }

    /**
     * Get 可用状态 1:异常 0:正常 
     * @return AvailabilityState 可用状态 1:异常 0:正常
     */
    public Long getAvailabilityState() {
        return this.AvailabilityState;
    }

    /**
     * Set 可用状态 1:异常 0:正常
     * @param AvailabilityState 可用状态 1:异常 0:正常
     */
    public void setAvailabilityState(Long AvailabilityState) {
        this.AvailabilityState = AvailabilityState;
    }

    /**
     * Get 域名解析状态 1:异常 0:正常 
     * @return AnalysisState 域名解析状态 1:异常 0:正常
     */
    public Long getAnalysisState() {
        return this.AnalysisState;
    }

    /**
     * Set 域名解析状态 1:异常 0:正常
     * @param AnalysisState 域名解析状态 1:异常 0:正常
     */
    public void setAnalysisState(Long AnalysisState) {
        this.AnalysisState = AnalysisState;
    }

    /**
     * Get 平均时延：单位ms 
     * @return AverageDelay 平均时延：单位ms
     */
    public Long getAverageDelay() {
        return this.AverageDelay;
    }

    /**
     * Set 平均时延：单位ms
     * @param AverageDelay 平均时延：单位ms
     */
    public void setAverageDelay(Long AverageDelay) {
        this.AverageDelay = AverageDelay;
    }

    /**
     * Get 丢包率（百分比） 
     * @return LossRate 丢包率（百分比）
     */
    public Long getLossRate() {
        return this.LossRate;
    }

    /**
     * Set 丢包率（百分比）
     * @param LossRate 丢包率（百分比）
     */
    public void setLossRate(Long LossRate) {
        this.LossRate = LossRate;
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

    }
}

