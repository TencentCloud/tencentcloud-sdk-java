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
    private Integer StartTime;

    /**
    * 结束时间，默认当前时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private Integer EndTime;

    /**
    * 每页返回的数量，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 页偏移量，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

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
    private Integer [] ProjectIds;

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
    private Integer [] AlarmStatus;

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
    private Integer [] InstanceGroupIds;

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
    public Integer getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间，默认一天前的时间戳
     * @param StartTime 起始时间，默认一天前的时间戳
     */
    public void setStartTime(Integer StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，默认当前时间戳 
     * @return EndTime 结束时间，默认当前时间戳
     */
    public Integer getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，默认当前时间戳
     * @param EndTime 结束时间，默认当前时间戳
     */
    public void setEndTime(Integer EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 每页返回的数量，默认20 
     * @return Limit 每页返回的数量，默认20
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页返回的数量，默认20
     * @param Limit 每页返回的数量，默认20
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 页偏移量，默认0 
     * @return Offset 页偏移量，默认0
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * Set 页偏移量，默认0
     * @param Offset 页偏移量，默认0
     */
    public void setOffset(Integer Offset) {
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
    public Integer [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 根据项目ID过滤
     * @param ProjectIds 根据项目ID过滤
     */
    public void setProjectIds(Integer [] ProjectIds) {
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
    public Integer [] getAlarmStatus() {
        return this.AlarmStatus;
    }

    /**
     * Set 根据告警状态过滤
     * @param AlarmStatus 根据告警状态过滤
     */
    public void setAlarmStatus(Integer [] AlarmStatus) {
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
    public Integer [] getInstanceGroupIds() {
        return this.InstanceGroupIds;
    }

    /**
     * Set 根据实例组ID过滤
     * @param InstanceGroupIds 根据实例组ID过滤
     */
    public void setInstanceGroupIds(Integer [] InstanceGroupIds) {
        this.InstanceGroupIds = InstanceGroupIds;
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

    }
}

