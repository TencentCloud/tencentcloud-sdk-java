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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBasicAlarmListRequest extends AbstractModel {

    /**
    * <p>接口模块名，当前取值monitor</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>起始时间，默认一天前的时间戳</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间，默认当前时间戳</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>分页参数，每页返回的数量，取值1~100，默认20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页参数，页偏移量，从0开始计数，默认0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>根据发生时间排序，取值ASC或DESC</p>
    */
    @SerializedName("OccurTimeOrder")
    @Expose
    private String OccurTimeOrder;

    /**
    * <p>根据项目ID过滤</p>
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * <p>根据策略类型过滤</p>
    */
    @SerializedName("ViewNames")
    @Expose
    private String [] ViewNames;

    /**
    * <p>根据告警状态过滤</p>
    */
    @SerializedName("AlarmStatus")
    @Expose
    private Long [] AlarmStatus;

    /**
    * <p>根据告警对象过滤</p>
    */
    @SerializedName("ObjLike")
    @Expose
    private String ObjLike;

    /**
    * <p>根据实例组ID过滤</p>
    */
    @SerializedName("InstanceGroupIds")
    @Expose
    private Long [] InstanceGroupIds;

    /**
    * <p>根据指标名过滤</p>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
     * Get <p>接口模块名，当前取值monitor</p> 
     * @return Module <p>接口模块名，当前取值monitor</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>接口模块名，当前取值monitor</p>
     * @param Module <p>接口模块名，当前取值monitor</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>起始时间，默认一天前的时间戳</p> 
     * @return StartTime <p>起始时间，默认一天前的时间戳</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>起始时间，默认一天前的时间戳</p>
     * @param StartTime <p>起始时间，默认一天前的时间戳</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间，默认当前时间戳</p> 
     * @return EndTime <p>结束时间，默认当前时间戳</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间，默认当前时间戳</p>
     * @param EndTime <p>结束时间，默认当前时间戳</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>分页参数，每页返回的数量，取值1~100，默认20</p> 
     * @return Limit <p>分页参数，每页返回的数量，取值1~100，默认20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页参数，每页返回的数量，取值1~100，默认20</p>
     * @param Limit <p>分页参数，每页返回的数量，取值1~100，默认20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页参数，页偏移量，从0开始计数，默认0</p> 
     * @return Offset <p>分页参数，页偏移量，从0开始计数，默认0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页参数，页偏移量，从0开始计数，默认0</p>
     * @param Offset <p>分页参数，页偏移量，从0开始计数，默认0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>根据发生时间排序，取值ASC或DESC</p> 
     * @return OccurTimeOrder <p>根据发生时间排序，取值ASC或DESC</p>
     */
    public String getOccurTimeOrder() {
        return this.OccurTimeOrder;
    }

    /**
     * Set <p>根据发生时间排序，取值ASC或DESC</p>
     * @param OccurTimeOrder <p>根据发生时间排序，取值ASC或DESC</p>
     */
    public void setOccurTimeOrder(String OccurTimeOrder) {
        this.OccurTimeOrder = OccurTimeOrder;
    }

    /**
     * Get <p>根据项目ID过滤</p> 
     * @return ProjectIds <p>根据项目ID过滤</p>
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set <p>根据项目ID过滤</p>
     * @param ProjectIds <p>根据项目ID过滤</p>
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get <p>根据策略类型过滤</p> 
     * @return ViewNames <p>根据策略类型过滤</p>
     */
    public String [] getViewNames() {
        return this.ViewNames;
    }

    /**
     * Set <p>根据策略类型过滤</p>
     * @param ViewNames <p>根据策略类型过滤</p>
     */
    public void setViewNames(String [] ViewNames) {
        this.ViewNames = ViewNames;
    }

    /**
     * Get <p>根据告警状态过滤</p> 
     * @return AlarmStatus <p>根据告警状态过滤</p>
     */
    public Long [] getAlarmStatus() {
        return this.AlarmStatus;
    }

    /**
     * Set <p>根据告警状态过滤</p>
     * @param AlarmStatus <p>根据告警状态过滤</p>
     */
    public void setAlarmStatus(Long [] AlarmStatus) {
        this.AlarmStatus = AlarmStatus;
    }

    /**
     * Get <p>根据告警对象过滤</p> 
     * @return ObjLike <p>根据告警对象过滤</p>
     */
    public String getObjLike() {
        return this.ObjLike;
    }

    /**
     * Set <p>根据告警对象过滤</p>
     * @param ObjLike <p>根据告警对象过滤</p>
     */
    public void setObjLike(String ObjLike) {
        this.ObjLike = ObjLike;
    }

    /**
     * Get <p>根据实例组ID过滤</p> 
     * @return InstanceGroupIds <p>根据实例组ID过滤</p>
     */
    public Long [] getInstanceGroupIds() {
        return this.InstanceGroupIds;
    }

    /**
     * Set <p>根据实例组ID过滤</p>
     * @param InstanceGroupIds <p>根据实例组ID过滤</p>
     */
    public void setInstanceGroupIds(Long [] InstanceGroupIds) {
        this.InstanceGroupIds = InstanceGroupIds;
    }

    /**
     * Get <p>根据指标名过滤</p> 
     * @return MetricNames <p>根据指标名过滤</p>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set <p>根据指标名过滤</p>
     * @param MetricNames <p>根据指标名过滤</p>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    public DescribeBasicAlarmListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBasicAlarmListRequest(DescribeBasicAlarmListRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OccurTimeOrder != null) {
            this.OccurTimeOrder = new String(source.OccurTimeOrder);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.ViewNames != null) {
            this.ViewNames = new String[source.ViewNames.length];
            for (int i = 0; i < source.ViewNames.length; i++) {
                this.ViewNames[i] = new String(source.ViewNames[i]);
            }
        }
        if (source.AlarmStatus != null) {
            this.AlarmStatus = new Long[source.AlarmStatus.length];
            for (int i = 0; i < source.AlarmStatus.length; i++) {
                this.AlarmStatus[i] = new Long(source.AlarmStatus[i]);
            }
        }
        if (source.ObjLike != null) {
            this.ObjLike = new String(source.ObjLike);
        }
        if (source.InstanceGroupIds != null) {
            this.InstanceGroupIds = new Long[source.InstanceGroupIds.length];
            for (int i = 0; i < source.InstanceGroupIds.length; i++) {
                this.InstanceGroupIds[i] = new Long(source.InstanceGroupIds[i]);
            }
        }
        if (source.MetricNames != null) {
            this.MetricNames = new String[source.MetricNames.length];
            for (int i = 0; i < source.MetricNames.length; i++) {
                this.MetricNames[i] = new String(source.MetricNames[i]);
            }
        }
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

