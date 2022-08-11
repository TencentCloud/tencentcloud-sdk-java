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

public class DescribeBgpBizTrendRequest extends AbstractModel{

    /**
    * 大禹子产品代号（bgp-multip表示高防包）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

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
    * 统计纬度，可取值intraffic, outtraffic, inpkg, outpkg
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
     * Get 大禹子产品代号（bgp-multip表示高防包） 
     * @return Business 大禹子产品代号（bgp-multip表示高防包）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgp-multip表示高防包）
     * @param Business 大禹子产品代号（bgp-multip表示高防包）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
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
     * Get 统计纬度，可取值intraffic, outtraffic, inpkg, outpkg 
     * @return MetricName 统计纬度，可取值intraffic, outtraffic, inpkg, outpkg
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 统计纬度，可取值intraffic, outtraffic, inpkg, outpkg
     * @param MetricName 统计纬度，可取值intraffic, outtraffic, inpkg, outpkg
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

