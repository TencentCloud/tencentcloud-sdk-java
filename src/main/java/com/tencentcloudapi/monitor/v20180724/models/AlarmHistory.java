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

public class AlarmHistory extends AbstractModel{

    /**
    * 告警历史Id
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * 监控类型
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * 策略类型
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 告警对象
    */
    @SerializedName("AlarmObject")
    @Expose
    private String AlarmObject;

    /**
    * 告警内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 时间戳，首次出现时间
    */
    @SerializedName("FirstOccurTime")
    @Expose
    private Long FirstOccurTime;

    /**
    * 时间戳，最后出现时间
    */
    @SerializedName("LastOccurTime")
    @Expose
    private Long LastOccurTime;

    /**
    * 告警状态，ALARM=未恢复 OK=已恢复 NO_CONF=已失效 NO_DATA=数据不足
    */
    @SerializedName("AlarmStatus")
    @Expose
    private String AlarmStatus;

    /**
    * 告警策略 Id
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 策略名称
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 基础产品告警的告警对象所属网络
    */
    @SerializedName("VPC")
    @Expose
    private String VPC;

    /**
    * 项目 Id
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 项目名字
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 告警对象所属实例组
    */
    @SerializedName("InstanceGroup")
    @Expose
    private InstanceGroups [] InstanceGroup;

    /**
    * 接收人列表
    */
    @SerializedName("ReceiverUids")
    @Expose
    private Long [] ReceiverUids;

    /**
    * 接收组列表
    */
    @SerializedName("ReceiverGroups")
    @Expose
    private Long [] ReceiverGroups;

    /**
    * 告警渠道列表 SMS=短信 EMAIL=邮件 CALL=电话 WECHAT=微信
    */
    @SerializedName("NoticeWays")
    @Expose
    private String [] NoticeWays;

    /**
    * 兼容告警1.0策略组 Id
    */
    @SerializedName("OriginId")
    @Expose
    private String OriginId;

    /**
    * 告警类型
    */
    @SerializedName("AlarmType")
    @Expose
    private String AlarmType;

    /**
    * 事件Id
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 告警历史Id 
     * @return AlarmId 告警历史Id
     */
    public String getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set 告警历史Id
     * @param AlarmId 告警历史Id
     */
    public void setAlarmId(String AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get 监控类型 
     * @return MonitorType 监控类型
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set 监控类型
     * @param MonitorType 监控类型
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get 策略类型 
     * @return Namespace 策略类型
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 策略类型
     * @param Namespace 策略类型
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 告警对象 
     * @return AlarmObject 告警对象
     */
    public String getAlarmObject() {
        return this.AlarmObject;
    }

    /**
     * Set 告警对象
     * @param AlarmObject 告警对象
     */
    public void setAlarmObject(String AlarmObject) {
        this.AlarmObject = AlarmObject;
    }

    /**
     * Get 告警内容 
     * @return Content 告警内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 告警内容
     * @param Content 告警内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 时间戳，首次出现时间 
     * @return FirstOccurTime 时间戳，首次出现时间
     */
    public Long getFirstOccurTime() {
        return this.FirstOccurTime;
    }

    /**
     * Set 时间戳，首次出现时间
     * @param FirstOccurTime 时间戳，首次出现时间
     */
    public void setFirstOccurTime(Long FirstOccurTime) {
        this.FirstOccurTime = FirstOccurTime;
    }

    /**
     * Get 时间戳，最后出现时间 
     * @return LastOccurTime 时间戳，最后出现时间
     */
    public Long getLastOccurTime() {
        return this.LastOccurTime;
    }

    /**
     * Set 时间戳，最后出现时间
     * @param LastOccurTime 时间戳，最后出现时间
     */
    public void setLastOccurTime(Long LastOccurTime) {
        this.LastOccurTime = LastOccurTime;
    }

    /**
     * Get 告警状态，ALARM=未恢复 OK=已恢复 NO_CONF=已失效 NO_DATA=数据不足 
     * @return AlarmStatus 告警状态，ALARM=未恢复 OK=已恢复 NO_CONF=已失效 NO_DATA=数据不足
     */
    public String getAlarmStatus() {
        return this.AlarmStatus;
    }

    /**
     * Set 告警状态，ALARM=未恢复 OK=已恢复 NO_CONF=已失效 NO_DATA=数据不足
     * @param AlarmStatus 告警状态，ALARM=未恢复 OK=已恢复 NO_CONF=已失效 NO_DATA=数据不足
     */
    public void setAlarmStatus(String AlarmStatus) {
        this.AlarmStatus = AlarmStatus;
    }

    /**
     * Get 告警策略 Id 
     * @return PolicyId 告警策略 Id
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 告警策略 Id
     * @param PolicyId 告警策略 Id
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 策略名称 
     * @return PolicyName 策略名称
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名称
     * @param PolicyName 策略名称
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 基础产品告警的告警对象所属网络 
     * @return VPC 基础产品告警的告警对象所属网络
     */
    public String getVPC() {
        return this.VPC;
    }

    /**
     * Set 基础产品告警的告警对象所属网络
     * @param VPC 基础产品告警的告警对象所属网络
     */
    public void setVPC(String VPC) {
        this.VPC = VPC;
    }

    /**
     * Get 项目 Id 
     * @return ProjectId 项目 Id
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 Id
     * @param ProjectId 项目 Id
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目名字 
     * @return ProjectName 项目名字
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名字
     * @param ProjectName 项目名字
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 告警对象所属实例组 
     * @return InstanceGroup 告警对象所属实例组
     */
    public InstanceGroups [] getInstanceGroup() {
        return this.InstanceGroup;
    }

    /**
     * Set 告警对象所属实例组
     * @param InstanceGroup 告警对象所属实例组
     */
    public void setInstanceGroup(InstanceGroups [] InstanceGroup) {
        this.InstanceGroup = InstanceGroup;
    }

    /**
     * Get 接收人列表 
     * @return ReceiverUids 接收人列表
     */
    public Long [] getReceiverUids() {
        return this.ReceiverUids;
    }

    /**
     * Set 接收人列表
     * @param ReceiverUids 接收人列表
     */
    public void setReceiverUids(Long [] ReceiverUids) {
        this.ReceiverUids = ReceiverUids;
    }

    /**
     * Get 接收组列表 
     * @return ReceiverGroups 接收组列表
     */
    public Long [] getReceiverGroups() {
        return this.ReceiverGroups;
    }

    /**
     * Set 接收组列表
     * @param ReceiverGroups 接收组列表
     */
    public void setReceiverGroups(Long [] ReceiverGroups) {
        this.ReceiverGroups = ReceiverGroups;
    }

    /**
     * Get 告警渠道列表 SMS=短信 EMAIL=邮件 CALL=电话 WECHAT=微信 
     * @return NoticeWays 告警渠道列表 SMS=短信 EMAIL=邮件 CALL=电话 WECHAT=微信
     */
    public String [] getNoticeWays() {
        return this.NoticeWays;
    }

    /**
     * Set 告警渠道列表 SMS=短信 EMAIL=邮件 CALL=电话 WECHAT=微信
     * @param NoticeWays 告警渠道列表 SMS=短信 EMAIL=邮件 CALL=电话 WECHAT=微信
     */
    public void setNoticeWays(String [] NoticeWays) {
        this.NoticeWays = NoticeWays;
    }

    /**
     * Get 兼容告警1.0策略组 Id 
     * @return OriginId 兼容告警1.0策略组 Id
     */
    public String getOriginId() {
        return this.OriginId;
    }

    /**
     * Set 兼容告警1.0策略组 Id
     * @param OriginId 兼容告警1.0策略组 Id
     */
    public void setOriginId(String OriginId) {
        this.OriginId = OriginId;
    }

    /**
     * Get 告警类型 
     * @return AlarmType 告警类型
     */
    public String getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set 告警类型
     * @param AlarmType 告警类型
     */
    public void setAlarmType(String AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get 事件Id 
     * @return EventId 事件Id
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件Id
     * @param EventId 事件Id
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "AlarmObject", this.AlarmObject);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "FirstOccurTime", this.FirstOccurTime);
        this.setParamSimple(map, prefix + "LastOccurTime", this.LastOccurTime);
        this.setParamSimple(map, prefix + "AlarmStatus", this.AlarmStatus);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "VPC", this.VPC);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamArrayObj(map, prefix + "InstanceGroup.", this.InstanceGroup);
        this.setParamArraySimple(map, prefix + "ReceiverUids.", this.ReceiverUids);
        this.setParamArraySimple(map, prefix + "ReceiverGroups.", this.ReceiverGroups);
        this.setParamArraySimple(map, prefix + "NoticeWays.", this.NoticeWays);
        this.setParamSimple(map, prefix + "OriginId", this.OriginId);
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

