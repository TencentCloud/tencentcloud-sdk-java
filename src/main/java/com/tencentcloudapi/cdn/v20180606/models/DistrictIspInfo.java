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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DistrictIspInfo extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 协议类型
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * IP协议类型
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * 起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 时间间隔，单位为分钟
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 指标名称
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 地区ID
    */
    @SerializedName("District")
    @Expose
    private Long District;

    /**
    * 运营商ID
    */
    @SerializedName("Isp")
    @Expose
    private Long Isp;

    /**
    * 指标数据点
    */
    @SerializedName("DataPoints")
    @Expose
    private Long [] DataPoints;

    /**
    * 地区名称
    */
    @SerializedName("DistrictName")
    @Expose
    private String DistrictName;

    /**
    * 运营商名称
    */
    @SerializedName("IspName")
    @Expose
    private String IspName;

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
     * Get 协议类型 
     * @return Protocol 协议类型
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议类型
     * @param Protocol 协议类型
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get IP协议类型 
     * @return IpProtocol IP协议类型
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set IP协议类型
     * @param IpProtocol IP协议类型
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get 起始时间 
     * @return StartTime 起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间
     * @param StartTime 起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 时间间隔，单位为分钟 
     * @return Interval 时间间隔，单位为分钟
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 时间间隔，单位为分钟
     * @param Interval 时间间隔，单位为分钟
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 指标名称 
     * @return Metric 指标名称
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 指标名称
     * @param Metric 指标名称
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 地区ID 
     * @return District 地区ID
     */
    public Long getDistrict() {
        return this.District;
    }

    /**
     * Set 地区ID
     * @param District 地区ID
     */
    public void setDistrict(Long District) {
        this.District = District;
    }

    /**
     * Get 运营商ID 
     * @return Isp 运营商ID
     */
    public Long getIsp() {
        return this.Isp;
    }

    /**
     * Set 运营商ID
     * @param Isp 运营商ID
     */
    public void setIsp(Long Isp) {
        this.Isp = Isp;
    }

    /**
     * Get 指标数据点 
     * @return DataPoints 指标数据点
     */
    public Long [] getDataPoints() {
        return this.DataPoints;
    }

    /**
     * Set 指标数据点
     * @param DataPoints 指标数据点
     */
    public void setDataPoints(Long [] DataPoints) {
        this.DataPoints = DataPoints;
    }

    /**
     * Get 地区名称 
     * @return DistrictName 地区名称
     */
    public String getDistrictName() {
        return this.DistrictName;
    }

    /**
     * Set 地区名称
     * @param DistrictName 地区名称
     */
    public void setDistrictName(String DistrictName) {
        this.DistrictName = DistrictName;
    }

    /**
     * Get 运营商名称 
     * @return IspName 运营商名称
     */
    public String getIspName() {
        return this.IspName;
    }

    /**
     * Set 运营商名称
     * @param IspName 运营商名称
     */
    public void setIspName(String IspName) {
        this.IspName = IspName;
    }

    public DistrictIspInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DistrictIspInfo(DistrictIspInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.IpProtocol != null) {
            this.IpProtocol = new String(source.IpProtocol);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.District != null) {
            this.District = new Long(source.District);
        }
        if (source.Isp != null) {
            this.Isp = new Long(source.Isp);
        }
        if (source.DataPoints != null) {
            this.DataPoints = new Long[source.DataPoints.length];
            for (int i = 0; i < source.DataPoints.length; i++) {
                this.DataPoints[i] = new Long(source.DataPoints[i]);
            }
        }
        if (source.DistrictName != null) {
            this.DistrictName = new String(source.DistrictName);
        }
        if (source.IspName != null) {
            this.IspName = new String(source.IspName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "IpProtocol", this.IpProtocol);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "District", this.District);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamArraySimple(map, prefix + "DataPoints.", this.DataPoints);
        this.setParamSimple(map, prefix + "DistrictName", this.DistrictName);
        this.setParamSimple(map, prefix + "IspName", this.IspName);

    }
}

