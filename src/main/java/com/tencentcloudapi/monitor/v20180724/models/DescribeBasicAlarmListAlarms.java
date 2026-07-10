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

public class DescribeBasicAlarmListAlarms extends AbstractModel {

    /**
    * <p>该条告警的ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>告警状态ID，0表示未恢复；1表示已恢复；2,3,5表示数据不足；4表示已失效</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>告警状态，ALARM表示未恢复；OK表示已恢复；NO_DATA表示数据不足；NO_CONF表示已失效</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmStatus")
    @Expose
    private String AlarmStatus;

    /**
    * <p>策略组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * <p>策略组名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>发生时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstOccurTime")
    @Expose
    private String FirstOccurTime;

    /**
    * <p>持续时间，单位s</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastOccurTime")
    @Expose
    private String LastOccurTime;

    /**
    * <p>告警内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>告警对象</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjName")
    @Expose
    private String ObjName;

    /**
    * <p>告警对象ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjId")
    @Expose
    private String ObjId;

    /**
    * <p>策略类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * <p>VPC，只有CVM有</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vpc")
    @Expose
    private String Vpc;

    /**
    * <p>指标ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricId")
    @Expose
    private Long MetricId;

    /**
    * <p>指标名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * <p>告警类型，0表示指标告警，2表示产品事件告警，3表示平台事件告警</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmType")
    @Expose
    private Long AlarmType;

    /**
    * <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>告警对象维度信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * <p>通知方式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotifyWay")
    @Expose
    private String [] NotifyWay;

    /**
    * <p>所属实例组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceGroup")
    @Expose
    private InstanceGroup [] InstanceGroup;

    /**
     * Get <p>该条告警的ID</p> 
     * @return Id <p>该条告警的ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>该条告警的ID</p>
     * @param Id <p>该条告警的ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get <p>告警状态ID，0表示未恢复；1表示已恢复；2,3,5表示数据不足；4表示已失效</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>告警状态ID，0表示未恢复；1表示已恢复；2,3,5表示数据不足；4表示已失效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>告警状态ID，0表示未恢复；1表示已恢复；2,3,5表示数据不足；4表示已失效</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>告警状态ID，0表示未恢复；1表示已恢复；2,3,5表示数据不足；4表示已失效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>告警状态，ALARM表示未恢复；OK表示已恢复；NO_DATA表示数据不足；NO_CONF表示已失效</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmStatus <p>告警状态，ALARM表示未恢复；OK表示已恢复；NO_DATA表示数据不足；NO_CONF表示已失效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmStatus() {
        return this.AlarmStatus;
    }

    /**
     * Set <p>告警状态，ALARM表示未恢复；OK表示已恢复；NO_DATA表示数据不足；NO_CONF表示已失效</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmStatus <p>告警状态，ALARM表示未恢复；OK表示已恢复；NO_DATA表示数据不足；NO_CONF表示已失效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmStatus(String AlarmStatus) {
        this.AlarmStatus = AlarmStatus;
    }

    /**
     * Get <p>策略组ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId <p>策略组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>策略组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId <p>策略组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>策略组名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName <p>策略组名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>策略组名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName <p>策略组名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>发生时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstOccurTime <p>发生时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstOccurTime() {
        return this.FirstOccurTime;
    }

    /**
     * Set <p>发生时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstOccurTime <p>发生时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstOccurTime(String FirstOccurTime) {
        this.FirstOccurTime = FirstOccurTime;
    }

    /**
     * Get <p>持续时间，单位s</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration <p>持续时间，单位s</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>持续时间，单位s</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration <p>持续时间，单位s</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastOccurTime <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastOccurTime() {
        return this.LastOccurTime;
    }

    /**
     * Set <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastOccurTime <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastOccurTime(String LastOccurTime) {
        this.LastOccurTime = LastOccurTime;
    }

    /**
     * Get <p>告警内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content <p>告警内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>告警内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content <p>告警内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>告警对象</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjName <p>告警对象</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjName() {
        return this.ObjName;
    }

    /**
     * Set <p>告警对象</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjName <p>告警对象</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjName(String ObjName) {
        this.ObjName = ObjName;
    }

    /**
     * Get <p>告警对象ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjId <p>告警对象ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjId() {
        return this.ObjId;
    }

    /**
     * Set <p>告警对象ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjId <p>告警对象ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjId(String ObjId) {
        this.ObjId = ObjId;
    }

    /**
     * Get <p>策略类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ViewName <p>策略类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set <p>策略类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ViewName <p>策略类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get <p>VPC，只有CVM有</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vpc <p>VPC，只有CVM有</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpc() {
        return this.Vpc;
    }

    /**
     * Set <p>VPC，只有CVM有</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vpc <p>VPC，只有CVM有</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpc(String Vpc) {
        this.Vpc = Vpc;
    }

    /**
     * Get <p>指标ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricId <p>指标ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMetricId() {
        return this.MetricId;
    }

    /**
     * Set <p>指标ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricId <p>指标ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricId(Long MetricId) {
        this.MetricId = MetricId;
    }

    /**
     * Get <p>指标名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricName <p>指标名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set <p>指标名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricName <p>指标名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get <p>告警类型，0表示指标告警，2表示产品事件告警，3表示平台事件告警</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmType <p>告警类型，0表示指标告警，2表示产品事件告警，3表示平台事件告警</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set <p>告警类型，0表示指标告警，2表示产品事件告警，3表示平台事件告警</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmType <p>告警类型，0表示指标告警，2表示产品事件告警，3表示平台事件告警</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmType(Long AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>告警对象维度信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Dimensions <p>告警对象维度信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set <p>告警对象维度信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Dimensions <p>告警对象维度信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get <p>通知方式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotifyWay <p>通知方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNotifyWay() {
        return this.NotifyWay;
    }

    /**
     * Set <p>通知方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotifyWay <p>通知方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotifyWay(String [] NotifyWay) {
        this.NotifyWay = NotifyWay;
    }

    /**
     * Get <p>所属实例组信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceGroup <p>所属实例组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceGroup [] getInstanceGroup() {
        return this.InstanceGroup;
    }

    /**
     * Set <p>所属实例组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceGroup <p>所属实例组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceGroup(InstanceGroup [] InstanceGroup) {
        this.InstanceGroup = InstanceGroup;
    }

    public DescribeBasicAlarmListAlarms() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBasicAlarmListAlarms(DescribeBasicAlarmListAlarms source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AlarmStatus != null) {
            this.AlarmStatus = new String(source.AlarmStatus);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.FirstOccurTime != null) {
            this.FirstOccurTime = new String(source.FirstOccurTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.LastOccurTime != null) {
            this.LastOccurTime = new String(source.LastOccurTime);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ObjName != null) {
            this.ObjName = new String(source.ObjName);
        }
        if (source.ObjId != null) {
            this.ObjId = new String(source.ObjId);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.Vpc != null) {
            this.Vpc = new String(source.Vpc);
        }
        if (source.MetricId != null) {
            this.MetricId = new Long(source.MetricId);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.AlarmType != null) {
            this.AlarmType = new Long(source.AlarmType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new String(source.Dimensions);
        }
        if (source.NotifyWay != null) {
            this.NotifyWay = new String[source.NotifyWay.length];
            for (int i = 0; i < source.NotifyWay.length; i++) {
                this.NotifyWay[i] = new String(source.NotifyWay[i]);
            }
        }
        if (source.InstanceGroup != null) {
            this.InstanceGroup = new InstanceGroup[source.InstanceGroup.length];
            for (int i = 0; i < source.InstanceGroup.length; i++) {
                this.InstanceGroup[i] = new InstanceGroup(source.InstanceGroup[i]);
            }
        }
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

