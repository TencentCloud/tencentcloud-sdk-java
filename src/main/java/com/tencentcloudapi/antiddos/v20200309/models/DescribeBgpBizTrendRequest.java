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

public class DescribeBgpBizTrendRequest extends AbstractModel {

    /**
    * DDoS防护子产品代号（bgp-multip表示高防包）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 统计开始时间。 例：“2020-09-22 00:00:00”，注意该时间必须为5分钟的倍数
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 统计结束时间。 例：“2020-09-22 00:00:00”，注意该时间必须为5分钟的倍数
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 统计维度，可取值intraffic, outtraffic, inpkg, outpkg； intraffic：入流量 outtraffic：出流量 inpkg：入包速率 outpkg：出包速率
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 资源实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 0表示固定时间，1表示自定义时间
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
     * Get DDoS防护子产品代号（bgp-multip表示高防包） 
     * @return Business DDoS防护子产品代号（bgp-multip表示高防包）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set DDoS防护子产品代号（bgp-multip表示高防包）
     * @param Business DDoS防护子产品代号（bgp-multip表示高防包）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 统计开始时间。 例：“2020-09-22 00:00:00”，注意该时间必须为5分钟的倍数 
     * @return StartTime 统计开始时间。 例：“2020-09-22 00:00:00”，注意该时间必须为5分钟的倍数
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 统计开始时间。 例：“2020-09-22 00:00:00”，注意该时间必须为5分钟的倍数
     * @param StartTime 统计开始时间。 例：“2020-09-22 00:00:00”，注意该时间必须为5分钟的倍数
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 统计结束时间。 例：“2020-09-22 00:00:00”，注意该时间必须为5分钟的倍数 
     * @return EndTime 统计结束时间。 例：“2020-09-22 00:00:00”，注意该时间必须为5分钟的倍数
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 统计结束时间。 例：“2020-09-22 00:00:00”，注意该时间必须为5分钟的倍数
     * @param EndTime 统计结束时间。 例：“2020-09-22 00:00:00”，注意该时间必须为5分钟的倍数
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 统计维度，可取值intraffic, outtraffic, inpkg, outpkg； intraffic：入流量 outtraffic：出流量 inpkg：入包速率 outpkg：出包速率 
     * @return MetricName 统计维度，可取值intraffic, outtraffic, inpkg, outpkg； intraffic：入流量 outtraffic：出流量 inpkg：入包速率 outpkg：出包速率
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 统计维度，可取值intraffic, outtraffic, inpkg, outpkg； intraffic：入流量 outtraffic：出流量 inpkg：入包速率 outpkg：出包速率
     * @param MetricName 统计维度，可取值intraffic, outtraffic, inpkg, outpkg； intraffic：入流量 outtraffic：出流量 inpkg：入包速率 outpkg：出包速率
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 资源实例ID 
     * @return InstanceId 资源实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资源实例ID
     * @param InstanceId 资源实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 0表示固定时间，1表示自定义时间 
     * @return Flag 0表示固定时间，1表示自定义时间
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set 0表示固定时间，1表示自定义时间
     * @param Flag 0表示固定时间，1表示自定义时间
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    public DescribeBgpBizTrendRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBgpBizTrendRequest(DescribeBgpBizTrendRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Flag != null) {
            this.Flag = new Long(source.Flag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Flag", this.Flag);

    }
}

