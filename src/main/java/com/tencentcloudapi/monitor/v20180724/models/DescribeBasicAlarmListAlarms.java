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

public class DescribeBasicAlarmListAlarms extends AbstractModel{

    /**
    * 该条告警的ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 告警状态ID，0表示未恢复；1表示已恢复；2,3,5表示数据不足；4表示已失效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 告警状态，ALARM表示未恢复；OK表示已恢复；NO_DATA表示数据不足；NO_CONF表示已失效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmStatus")
    @Expose
    private String AlarmStatus;

    /**
    * 策略组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 策略组名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 发生时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstOccurTime")
    @Expose
    private String FirstOccurTime;

    /**
    * 持续时间，单位s
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastOccurTime")
    @Expose
    private String LastOccurTime;

    /**
    * 告警内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 告警对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjName")
    @Expose
    private String ObjName;

    /**
    * 告警对象ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjId")
    @Expose
    private String ObjId;

    /**
    * 策略类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * VPC，只有CVM有
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vpc")
    @Expose
    private String Vpc;

    /**
    * 指标ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricId")
    @Expose
    private Long MetricId;

    /**
    * 指标名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 告警类型，0表示指标告警，2表示产品事件告警，3表示平台事件告警
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmType")
    @Expose
    private Long AlarmType;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 告警对象维度信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * 通知方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotifyWay")
    @Expose
    private String [] NotifyWay;

    /**
    * 所属实例组信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceGroup")
    @Expose
    private InstanceGroup [] InstanceGroup;

    /**
     * Get 该条告警的ID 
     * @return Id 该条告警的ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 该条告警的ID
     * @param Id 该条告警的ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 告警状态ID，0表示未恢复；1表示已恢复；2,3,5表示数据不足；4表示已失效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 告警状态ID，0表示未恢复；1表示已恢复；2,3,5表示数据不足；4表示已失效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 告警状态ID，0表示未恢复；1表示已恢复；2,3,5表示数据不足；4表示已失效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 告警状态ID，0表示未恢复；1表示已恢复；2,3,5表示数据不足；4表示已失效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 告警状态，ALARM表示未恢复；OK表示已恢复；NO_DATA表示数据不足；NO_CONF表示已失效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmStatus 告警状态，ALARM表示未恢复；OK表示已恢复；NO_DATA表示数据不足；NO_CONF表示已失效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmStatus() {
        return this.AlarmStatus;
    }

    /**
     * Set 告警状态，ALARM表示未恢复；OK表示已恢复；NO_DATA表示数据不足；NO_CONF表示已失效
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmStatus 告警状态，ALARM表示未恢复；OK表示已恢复；NO_DATA表示数据不足；NO_CONF表示已失效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmStatus(String AlarmStatus) {
        this.AlarmStatus = AlarmStatus;
    }

    /**
     * Get 策略组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 策略组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 策略组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 策略组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 策略组名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 策略组名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 策略组名
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 策略组名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 发生时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstOccurTime 发生时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstOccurTime() {
        return this.FirstOccurTime;
    }

    /**
     * Set 发生时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstOccurTime 发生时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstOccurTime(String FirstOccurTime) {
        this.FirstOccurTime = FirstOccurTime;
    }

    /**
     * Get 持续时间，单位s
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 持续时间，单位s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 持续时间，单位s
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 持续时间，单位s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastOccurTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastOccurTime() {
        return this.LastOccurTime;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastOccurTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastOccurTime(String LastOccurTime) {
        this.LastOccurTime = LastOccurTime;
    }

    /**
     * Get 告警内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 告警内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 告警内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 告警内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 告警对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjName 告警对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjName() {
        return this.ObjName;
    }

    /**
     * Set 告警对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjName 告警对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjName(String ObjName) {
        this.ObjName = ObjName;
    }

    /**
     * Get 告警对象ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjId 告警对象ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjId() {
        return this.ObjId;
    }

    /**
     * Set 告警对象ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjId 告警对象ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjId(String ObjId) {
        this.ObjId = ObjId;
    }

    /**
     * Get 策略类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ViewName 策略类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set 策略类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ViewName 策略类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get VPC，只有CVM有
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vpc VPC，只有CVM有
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpc() {
        return this.Vpc;
    }

    /**
     * Set VPC，只有CVM有
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vpc VPC，只有CVM有
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpc(String Vpc) {
        this.Vpc = Vpc;
    }

    /**
     * Get 指标ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricId 指标ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMetricId() {
        return this.MetricId;
    }

    /**
     * Set 指标ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricId 指标ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricId(Long MetricId) {
        this.MetricId = MetricId;
    }

    /**
     * Get 指标名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricName 指标名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricName 指标名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 告警类型，0表示指标告警，2表示产品事件告警，3表示平台事件告警
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmType 告警类型，0表示指标告警，2表示产品事件告警，3表示平台事件告警
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set 告警类型，0表示指标告警，2表示产品事件告警，3表示平台事件告警
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmType 告警类型，0表示指标告警，2表示产品事件告警，3表示平台事件告警
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmType(Long AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 告警对象维度信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Dimensions 告警对象维度信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 告警对象维度信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Dimensions 告警对象维度信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get 通知方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotifyWay 通知方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNotifyWay() {
        return this.NotifyWay;
    }

    /**
     * Set 通知方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotifyWay 通知方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotifyWay(String [] NotifyWay) {
        this.NotifyWay = NotifyWay;
    }

    /**
     * Get 所属实例组信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceGroup 所属实例组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceGroup [] getInstanceGroup() {
        return this.InstanceGroup;
    }

    /**
     * Set 所属实例组信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceGroup 所属实例组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceGroup(InstanceGroup [] InstanceGroup) {
        this.InstanceGroup = InstanceGroup;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AlarmStatus", this.AlarmStatus);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "FirstOccurTime", this.FirstOccurTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "LastOccurTime", this.LastOccurTime);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ObjName", this.ObjName);
        this.setParamSimple(map, prefix + "ObjId", this.ObjId);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "Vpc", this.Vpc);
        this.setParamSimple(map, prefix + "MetricId", this.MetricId);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Dimensions", this.Dimensions);
        this.setParamArraySimple(map, prefix + "NotifyWay.", this.NotifyWay);
        this.setParamArrayObj(map, prefix + "InstanceGroup.", this.InstanceGroup);

    }
}

