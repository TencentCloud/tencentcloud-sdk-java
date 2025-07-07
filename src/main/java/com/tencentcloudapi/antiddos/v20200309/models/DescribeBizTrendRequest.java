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

public class DescribeBizTrendRequest extends AbstractModel {

    /**
    * 统计方式，可取值max, min, avg, sum, 如统计纬度是流量速率或包量速率，仅可取值max
    */
    @SerializedName("Statistics")
    @Expose
    private String Statistics;

    /**
    * DDoS防护子产品代号（bgpip表示高防IP）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 统计周期，可取值60，300，1800，3600，21600，86400，单位秒
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 统计开始时间。 例：“2020-09-22 00:00:00”
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 统计结束时间。 例：“2020-09-22 00:00:00”
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 资源实例ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 统计纬度，可取值connum, new_conn, inactive_conn, intraffic, outtraffic, inpkg, outpkg, qps
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 统计纬度为qps时，可选特定域名查询
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 协议及端口列表，协议可取值TCP, UDP, HTTP, HTTPS，仅统计纬度为连接数时有效
    */
    @SerializedName("ProtoInfo")
    @Expose
    private ProtocolPort [] ProtoInfo;

    /**
    * 业务类型：</br>
port：端口业务
domain：域名业务
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
     * Get 统计方式，可取值max, min, avg, sum, 如统计纬度是流量速率或包量速率，仅可取值max 
     * @return Statistics 统计方式，可取值max, min, avg, sum, 如统计纬度是流量速率或包量速率，仅可取值max
     */
    public String getStatistics() {
        return this.Statistics;
    }

    /**
     * Set 统计方式，可取值max, min, avg, sum, 如统计纬度是流量速率或包量速率，仅可取值max
     * @param Statistics 统计方式，可取值max, min, avg, sum, 如统计纬度是流量速率或包量速率，仅可取值max
     */
    public void setStatistics(String Statistics) {
        this.Statistics = Statistics;
    }

    /**
     * Get DDoS防护子产品代号（bgpip表示高防IP） 
     * @return Business DDoS防护子产品代号（bgpip表示高防IP）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set DDoS防护子产品代号（bgpip表示高防IP）
     * @param Business DDoS防护子产品代号（bgpip表示高防IP）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 统计周期，可取值60，300，1800，3600，21600，86400，单位秒 
     * @return Period 统计周期，可取值60，300，1800，3600，21600，86400，单位秒
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 统计周期，可取值60，300，1800，3600，21600，86400，单位秒
     * @param Period 统计周期，可取值60，300，1800，3600，21600，86400，单位秒
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 统计开始时间。 例：“2020-09-22 00:00:00” 
     * @return StartTime 统计开始时间。 例：“2020-09-22 00:00:00”
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 统计开始时间。 例：“2020-09-22 00:00:00”
     * @param StartTime 统计开始时间。 例：“2020-09-22 00:00:00”
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 统计结束时间。 例：“2020-09-22 00:00:00” 
     * @return EndTime 统计结束时间。 例：“2020-09-22 00:00:00”
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 统计结束时间。 例：“2020-09-22 00:00:00”
     * @param EndTime 统计结束时间。 例：“2020-09-22 00:00:00”
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 资源实例ID 
     * @return Id 资源实例ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源实例ID
     * @param Id 资源实例ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 统计纬度，可取值connum, new_conn, inactive_conn, intraffic, outtraffic, inpkg, outpkg, qps 
     * @return MetricName 统计纬度，可取值connum, new_conn, inactive_conn, intraffic, outtraffic, inpkg, outpkg, qps
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 统计纬度，可取值connum, new_conn, inactive_conn, intraffic, outtraffic, inpkg, outpkg, qps
     * @param MetricName 统计纬度，可取值connum, new_conn, inactive_conn, intraffic, outtraffic, inpkg, outpkg, qps
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 统计纬度为qps时，可选特定域名查询 
     * @return Domain 统计纬度为qps时，可选特定域名查询
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 统计纬度为qps时，可选特定域名查询
     * @param Domain 统计纬度为qps时，可选特定域名查询
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 协议及端口列表，协议可取值TCP, UDP, HTTP, HTTPS，仅统计纬度为连接数时有效 
     * @return ProtoInfo 协议及端口列表，协议可取值TCP, UDP, HTTP, HTTPS，仅统计纬度为连接数时有效
     */
    public ProtocolPort [] getProtoInfo() {
        return this.ProtoInfo;
    }

    /**
     * Set 协议及端口列表，协议可取值TCP, UDP, HTTP, HTTPS，仅统计纬度为连接数时有效
     * @param ProtoInfo 协议及端口列表，协议可取值TCP, UDP, HTTP, HTTPS，仅统计纬度为连接数时有效
     */
    public void setProtoInfo(ProtocolPort [] ProtoInfo) {
        this.ProtoInfo = ProtoInfo;
    }

    /**
     * Get 业务类型：</br>
port：端口业务
domain：域名业务 
     * @return BusinessType 业务类型：</br>
port：端口业务
domain：域名业务
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set 业务类型：</br>
port：端口业务
domain：域名业务
     * @param BusinessType 业务类型：</br>
port：端口业务
domain：域名业务
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    public DescribeBizTrendRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBizTrendRequest(DescribeBizTrendRequest source) {
        if (source.Statistics != null) {
            this.Statistics = new String(source.Statistics);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ProtoInfo != null) {
            this.ProtoInfo = new ProtocolPort[source.ProtoInfo.length];
            for (int i = 0; i < source.ProtoInfo.length; i++) {
                this.ProtoInfo[i] = new ProtocolPort(source.ProtoInfo[i]);
            }
        }
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Statistics", this.Statistics);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "ProtoInfo.", this.ProtoInfo);
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);

    }
}

