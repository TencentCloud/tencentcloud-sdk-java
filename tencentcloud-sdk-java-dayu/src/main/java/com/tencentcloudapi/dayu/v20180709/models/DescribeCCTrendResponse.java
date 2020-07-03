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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCCTrendResponse extends AbstractModel{

    /**
    * 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版；basic表示DDoS基础防护）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 资源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 资源的IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 指标，取值[inqps(总请求峰值，dropqps(攻击请求峰值))]
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 统计粒度，取值[300(5分钟)，3600(小时)，86400(天)]
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 统计开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 统计结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 值数组
    */
    @SerializedName("Data")
    @Expose
    private Long [] Data;

    /**
    * 值个数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版；basic表示DDoS基础防护） 
     * @return Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版；basic表示DDoS基础防护）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版；basic表示DDoS基础防护）
     * @param Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版；basic表示DDoS基础防护）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 资源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 资源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 资源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 资源的IP 
     * @return Ip 资源的IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 资源的IP
     * @param Ip 资源的IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 指标，取值[inqps(总请求峰值，dropqps(攻击请求峰值))] 
     * @return MetricName 指标，取值[inqps(总请求峰值，dropqps(攻击请求峰值))]
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标，取值[inqps(总请求峰值，dropqps(攻击请求峰值))]
     * @param MetricName 指标，取值[inqps(总请求峰值，dropqps(攻击请求峰值))]
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 统计粒度，取值[300(5分钟)，3600(小时)，86400(天)] 
     * @return Period 统计粒度，取值[300(5分钟)，3600(小时)，86400(天)]
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 统计粒度，取值[300(5分钟)，3600(小时)，86400(天)]
     * @param Period 统计粒度，取值[300(5分钟)，3600(小时)，86400(天)]
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 统计开始时间 
     * @return StartTime 统计开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 统计开始时间
     * @param StartTime 统计开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 统计结束时间 
     * @return EndTime 统计结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 统计结束时间
     * @param EndTime 统计结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 值数组 
     * @return Data 值数组
     */
    public Long [] getData() {
        return this.Data;
    }

    /**
     * Set 值数组
     * @param Data 值数组
     */
    public void setData(Long [] Data) {
        this.Data = Data;
    }

    /**
     * Get 值个数 
     * @return Count 值个数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 值个数
     * @param Count 值个数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

