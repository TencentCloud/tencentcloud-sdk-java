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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStatisticDataRequest extends AbstractModel{

    /**
    * 所属模块，固定值，为monitor
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 命名空间，目前只支持QCE/TKE
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 指标名列表
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * 维度条件，操作符支持=、in
    */
    @SerializedName("Conditions")
    @Expose
    private MidQueryCondition [] Conditions;

    /**
    * 统计粒度。默认取值为300，单位为s；可选的值为60、300、3600、86400
受存储时长限制，统计粒度与统计的时间范围有关：
60s：EndTime-StartTime<12小时，且StartTime距当前时间不能超过15天；
300s：EndTime-StartTime<3天，且StartTime距当前时间不能超过31天；
3600s：EndTime-StartTime<30天，且StartTime距当前时间不能超过93天；
86400s：EndTime-StartTime<186天，且StartTime距当前时间不能超过186天。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 起始时间，默认为当前时间，如2020-12-08T19:51:23+08:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，默认为当前时间，如2020-12-08T19:51:23+08:00
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 按指定维度groupBy
    */
    @SerializedName("GroupBys")
    @Expose
    private String [] GroupBys;

    /**
     * Get 所属模块，固定值，为monitor 
     * @return Module 所属模块，固定值，为monitor
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 所属模块，固定值，为monitor
     * @param Module 所属模块，固定值，为monitor
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 命名空间，目前只支持QCE/TKE 
     * @return Namespace 命名空间，目前只支持QCE/TKE
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间，目前只支持QCE/TKE
     * @param Namespace 命名空间，目前只支持QCE/TKE
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 指标名列表 
     * @return MetricNames 指标名列表
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set 指标名列表
     * @param MetricNames 指标名列表
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get 维度条件，操作符支持=、in 
     * @return Conditions 维度条件，操作符支持=、in
     */
    public MidQueryCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 维度条件，操作符支持=、in
     * @param Conditions 维度条件，操作符支持=、in
     */
    public void setConditions(MidQueryCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get 统计粒度。默认取值为300，单位为s；可选的值为60、300、3600、86400
受存储时长限制，统计粒度与统计的时间范围有关：
60s：EndTime-StartTime<12小时，且StartTime距当前时间不能超过15天；
300s：EndTime-StartTime<3天，且StartTime距当前时间不能超过31天；
3600s：EndTime-StartTime<30天，且StartTime距当前时间不能超过93天；
86400s：EndTime-StartTime<186天，且StartTime距当前时间不能超过186天。 
     * @return Period 统计粒度。默认取值为300，单位为s；可选的值为60、300、3600、86400
受存储时长限制，统计粒度与统计的时间范围有关：
60s：EndTime-StartTime<12小时，且StartTime距当前时间不能超过15天；
300s：EndTime-StartTime<3天，且StartTime距当前时间不能超过31天；
3600s：EndTime-StartTime<30天，且StartTime距当前时间不能超过93天；
86400s：EndTime-StartTime<186天，且StartTime距当前时间不能超过186天。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 统计粒度。默认取值为300，单位为s；可选的值为60、300、3600、86400
受存储时长限制，统计粒度与统计的时间范围有关：
60s：EndTime-StartTime<12小时，且StartTime距当前时间不能超过15天；
300s：EndTime-StartTime<3天，且StartTime距当前时间不能超过31天；
3600s：EndTime-StartTime<30天，且StartTime距当前时间不能超过93天；
86400s：EndTime-StartTime<186天，且StartTime距当前时间不能超过186天。
     * @param Period 统计粒度。默认取值为300，单位为s；可选的值为60、300、3600、86400
受存储时长限制，统计粒度与统计的时间范围有关：
60s：EndTime-StartTime<12小时，且StartTime距当前时间不能超过15天；
300s：EndTime-StartTime<3天，且StartTime距当前时间不能超过31天；
3600s：EndTime-StartTime<30天，且StartTime距当前时间不能超过93天；
86400s：EndTime-StartTime<186天，且StartTime距当前时间不能超过186天。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 起始时间，默认为当前时间，如2020-12-08T19:51:23+08:00 
     * @return StartTime 起始时间，默认为当前时间，如2020-12-08T19:51:23+08:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间，默认为当前时间，如2020-12-08T19:51:23+08:00
     * @param StartTime 起始时间，默认为当前时间，如2020-12-08T19:51:23+08:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，默认为当前时间，如2020-12-08T19:51:23+08:00 
     * @return EndTime 结束时间，默认为当前时间，如2020-12-08T19:51:23+08:00
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，默认为当前时间，如2020-12-08T19:51:23+08:00
     * @param EndTime 结束时间，默认为当前时间，如2020-12-08T19:51:23+08:00
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 按指定维度groupBy 
     * @return GroupBys 按指定维度groupBy
     */
    public String [] getGroupBys() {
        return this.GroupBys;
    }

    /**
     * Set 按指定维度groupBy
     * @param GroupBys 按指定维度groupBy
     */
    public void setGroupBys(String [] GroupBys) {
        this.GroupBys = GroupBys;
    }

    public DescribeStatisticDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStatisticDataRequest(DescribeStatisticDataRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.MetricNames != null) {
            this.MetricNames = new String[source.MetricNames.length];
            for (int i = 0; i < source.MetricNames.length; i++) {
                this.MetricNames[i] = new String(source.MetricNames[i]);
            }
        }
        if (source.Conditions != null) {
            this.Conditions = new MidQueryCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new MidQueryCondition(source.Conditions[i]);
            }
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
        if (source.GroupBys != null) {
            this.GroupBys = new String[source.GroupBys.length];
            for (int i = 0; i < source.GroupBys.length; i++) {
                this.GroupBys[i] = new String(source.GroupBys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "GroupBys.", this.GroupBys);

    }
}

