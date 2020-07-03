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

public class DescribeBasicAlarmListRequest extends AbstractModel{

    /**
    * 接口模块名，当前取值monitor
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 起始时间，默认一天前的时间戳
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间，默认当前时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 分页参数，每页返回的数量，取值1~100，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页参数，页偏移量，从0开始计数，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 根据发生时间排序，取值ASC或DESC
    */
    @SerializedName("OccurTimeOrder")
    @Expose
    private String OccurTimeOrder;

    /**
    * 根据项目ID过滤
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * 根据策略类型过滤
    */
    @SerializedName("ViewNames")
    @Expose
    private String [] ViewNames;

    /**
    * 根据告警状态过滤
    */
    @SerializedName("AlarmStatus")
    @Expose
    private Long [] AlarmStatus;

    /**
    * 根据告警对象过滤
    */
    @SerializedName("ObjLike")
    @Expose
    private String ObjLike;

    /**
    * 根据实例组ID过滤
    */
    @SerializedName("InstanceGroupIds")
    @Expose
    private Long [] InstanceGroupIds;

    /**
    * 根据指标名过滤
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
     * Get 接口模块名，当前取值monitor 
     * @return Module 接口模块名，当前取值monitor
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 接口模块名，当前取值monitor
     * @param Module 接口模块名，当前取值monitor
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 起始时间，默认一天前的时间戳 
     * @return StartTime 起始时间，默认一天前的时间戳
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间，默认一天前的时间戳
     * @param StartTime 起始时间，默认一天前的时间戳
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，默认当前时间戳 
     * @return EndTime 结束时间，默认当前时间戳
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，默认当前时间戳
     * @param EndTime 结束时间，默认当前时间戳
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页参数，每页返回的数量，取值1~100，默认20 
     * @return Limit 分页参数，每页返回的数量，取值1~100，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，每页返回的数量，取值1~100，默认20
     * @param Limit 分页参数，每页返回的数量，取值1~100，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页参数，页偏移量，从0开始计数，默认0 
     * @return Offset 分页参数，页偏移量，从0开始计数，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数，页偏移量，从0开始计数，默认0
     * @param Offset 分页参数，页偏移量，从0开始计数，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 根据发生时间排序，取值ASC或DESC 
     * @return OccurTimeOrder 根据发生时间排序，取值ASC或DESC
     */
    public String getOccurTimeOrder() {
        return this.OccurTimeOrder;
    }

    /**
     * Set 根据发生时间排序，取值ASC或DESC
     * @param OccurTimeOrder 根据发生时间排序，取值ASC或DESC
     */
    public void setOccurTimeOrder(String OccurTimeOrder) {
        this.OccurTimeOrder = OccurTimeOrder;
    }

    /**
     * Get 根据项目ID过滤 
     * @return ProjectIds 根据项目ID过滤
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 根据项目ID过滤
     * @param ProjectIds 根据项目ID过滤
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 根据策略类型过滤 
     * @return ViewNames 根据策略类型过滤
     */
    public String [] getViewNames() {
        return this.ViewNames;
    }

    /**
     * Set 根据策略类型过滤
     * @param ViewNames 根据策略类型过滤
     */
    public void setViewNames(String [] ViewNames) {
        this.ViewNames = ViewNames;
    }

    /**
     * Get 根据告警状态过滤 
     * @return AlarmStatus 根据告警状态过滤
     */
    public Long [] getAlarmStatus() {
        return this.AlarmStatus;
    }

    /**
     * Set 根据告警状态过滤
     * @param AlarmStatus 根据告警状态过滤
     */
    public void setAlarmStatus(Long [] AlarmStatus) {
        this.AlarmStatus = AlarmStatus;
    }

    /**
     * Get 根据告警对象过滤 
     * @return ObjLike 根据告警对象过滤
     */
    public String getObjLike() {
        return this.ObjLike;
    }

    /**
     * Set 根据告警对象过滤
     * @param ObjLike 根据告警对象过滤
     */
    public void setObjLike(String ObjLike) {
        this.ObjLike = ObjLike;
    }

    /**
     * Get 根据实例组ID过滤 
     * @return InstanceGroupIds 根据实例组ID过滤
     */
    public Long [] getInstanceGroupIds() {
        return this.InstanceGroupIds;
    }

    /**
     * Set 根据实例组ID过滤
     * @param InstanceGroupIds 根据实例组ID过滤
     */
    public void setInstanceGroupIds(Long [] InstanceGroupIds) {
        this.InstanceGroupIds = InstanceGroupIds;
    }

    /**
     * Get 根据指标名过滤 
     * @return MetricNames 根据指标名过滤
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set 根据指标名过滤
     * @param MetricNames 根据指标名过滤
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OccurTimeOrder", this.OccurTimeOrder);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "ViewNames.", this.ViewNames);
        this.setParamArraySimple(map, prefix + "AlarmStatus.", this.AlarmStatus);
        this.setParamSimple(map, prefix + "ObjLike", this.ObjLike);
        this.setParamArraySimple(map, prefix + "InstanceGroupIds.", this.InstanceGroupIds);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);

    }
}

