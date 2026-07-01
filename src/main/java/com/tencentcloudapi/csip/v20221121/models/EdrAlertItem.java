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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdrAlertItem extends AbstractModel {

    /**
    * <p>告警表id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>APPID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>告警ID</p>
    */
    @SerializedName("AlertId")
    @Expose
    private String AlertId;

    /**
    * <p>告警大类</p>
    */
    @SerializedName("AlertCategory")
    @Expose
    private String AlertCategory;

    /**
    * <p>告警子类</p>
    */
    @SerializedName("AlertSubType")
    @Expose
    private String AlertSubType;

    /**
    * <p>策略ID</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>策略类型</p>
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * <p>告警等级</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>告警状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>攻击阶段</p>
    */
    @SerializedName("AttackStage")
    @Expose
    private String AttackStage;

    /**
    * <p>检测模式</p>
    */
    @SerializedName("DetectMode")
    @Expose
    private String DetectMode;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>QUUID</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>是否付费</p>
    */
    @SerializedName("IsProVersion")
    @Expose
    private Long IsProVersion;

    /**
    * <p>告警来源</p>
    */
    @SerializedName("AlertSource")
    @Expose
    private String AlertSource;

    /**
    * <p>镜像ID</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>容器id</p>
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>告警数量</p>
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * <p>最初发现时间</p>
    */
    @SerializedName("FirstDetectTime")
    @Expose
    private String FirstDetectTime;

    /**
    * <p>最近发现时间</p>
    */
    @SerializedName("LatestDetectTime")
    @Expose
    private String LatestDetectTime;

    /**
    * <p>规则名</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>策略类型</p>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * <p>实例名</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>公共IP</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>内网IP</p>
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * <p>该机器是否开启应用防护</p>
    */
    @SerializedName("RaspOpen")
    @Expose
    private Boolean RaspOpen;

    /**
     * Get <p>告警表id</p> 
     * @return Id <p>告警表id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>告警表id</p>
     * @param Id <p>告警表id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>APPID</p> 
     * @return AppId <p>APPID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>APPID</p>
     * @param AppId <p>APPID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>告警ID</p> 
     * @return AlertId <p>告警ID</p>
     */
    public String getAlertId() {
        return this.AlertId;
    }

    /**
     * Set <p>告警ID</p>
     * @param AlertId <p>告警ID</p>
     */
    public void setAlertId(String AlertId) {
        this.AlertId = AlertId;
    }

    /**
     * Get <p>告警大类</p> 
     * @return AlertCategory <p>告警大类</p>
     */
    public String getAlertCategory() {
        return this.AlertCategory;
    }

    /**
     * Set <p>告警大类</p>
     * @param AlertCategory <p>告警大类</p>
     */
    public void setAlertCategory(String AlertCategory) {
        this.AlertCategory = AlertCategory;
    }

    /**
     * Get <p>告警子类</p> 
     * @return AlertSubType <p>告警子类</p>
     */
    public String getAlertSubType() {
        return this.AlertSubType;
    }

    /**
     * Set <p>告警子类</p>
     * @param AlertSubType <p>告警子类</p>
     */
    public void setAlertSubType(String AlertSubType) {
        this.AlertSubType = AlertSubType;
    }

    /**
     * Get <p>策略ID</p> 
     * @return RuleId <p>策略ID</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>策略ID</p>
     * @param RuleId <p>策略ID</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>策略类型</p> 
     * @return RuleType <p>策略类型</p>
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>策略类型</p>
     * @param RuleType <p>策略类型</p>
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>告警等级</p> 
     * @return Level <p>告警等级</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>告警等级</p>
     * @param Level <p>告警等级</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>告警状态</p> 
     * @return Status <p>告警状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>告警状态</p>
     * @param Status <p>告警状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>攻击阶段</p> 
     * @return AttackStage <p>攻击阶段</p>
     */
    public String getAttackStage() {
        return this.AttackStage;
    }

    /**
     * Set <p>攻击阶段</p>
     * @param AttackStage <p>攻击阶段</p>
     */
    public void setAttackStage(String AttackStage) {
        this.AttackStage = AttackStage;
    }

    /**
     * Get <p>检测模式</p> 
     * @return DetectMode <p>检测模式</p>
     */
    public String getDetectMode() {
        return this.DetectMode;
    }

    /**
     * Set <p>检测模式</p>
     * @param DetectMode <p>检测模式</p>
     */
    public void setDetectMode(String DetectMode) {
        this.DetectMode = DetectMode;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>QUUID</p> 
     * @return Quuid <p>QUUID</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>QUUID</p>
     * @param Quuid <p>QUUID</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>是否付费</p> 
     * @return IsProVersion <p>是否付费</p>
     */
    public Long getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * Set <p>是否付费</p>
     * @param IsProVersion <p>是否付费</p>
     */
    public void setIsProVersion(Long IsProVersion) {
        this.IsProVersion = IsProVersion;
    }

    /**
     * Get <p>告警来源</p> 
     * @return AlertSource <p>告警来源</p>
     */
    public String getAlertSource() {
        return this.AlertSource;
    }

    /**
     * Set <p>告警来源</p>
     * @param AlertSource <p>告警来源</p>
     */
    public void setAlertSource(String AlertSource) {
        this.AlertSource = AlertSource;
    }

    /**
     * Get <p>镜像ID</p> 
     * @return ImageId <p>镜像ID</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>镜像ID</p>
     * @param ImageId <p>镜像ID</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>容器id</p> 
     * @return ContainerId <p>容器id</p>
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set <p>容器id</p>
     * @param ContainerId <p>容器id</p>
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>告警数量</p> 
     * @return EventCount <p>告警数量</p>
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set <p>告警数量</p>
     * @param EventCount <p>告警数量</p>
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get <p>最初发现时间</p> 
     * @return FirstDetectTime <p>最初发现时间</p>
     */
    public String getFirstDetectTime() {
        return this.FirstDetectTime;
    }

    /**
     * Set <p>最初发现时间</p>
     * @param FirstDetectTime <p>最初发现时间</p>
     */
    public void setFirstDetectTime(String FirstDetectTime) {
        this.FirstDetectTime = FirstDetectTime;
    }

    /**
     * Get <p>最近发现时间</p> 
     * @return LatestDetectTime <p>最近发现时间</p>
     */
    public String getLatestDetectTime() {
        return this.LatestDetectTime;
    }

    /**
     * Set <p>最近发现时间</p>
     * @param LatestDetectTime <p>最近发现时间</p>
     */
    public void setLatestDetectTime(String LatestDetectTime) {
        this.LatestDetectTime = LatestDetectTime;
    }

    /**
     * Get <p>规则名</p> 
     * @return RuleName <p>规则名</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>规则名</p>
     * @param RuleName <p>规则名</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>策略类型</p> 
     * @return ContentType <p>策略类型</p>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>策略类型</p>
     * @param ContentType <p>策略类型</p>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get <p>实例名</p> 
     * @return InstanceName <p>实例名</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名</p>
     * @param InstanceName <p>实例名</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>公共IP</p> 
     * @return PublicIp <p>公共IP</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>公共IP</p>
     * @param PublicIp <p>公共IP</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>内网IP</p> 
     * @return PrivateIp <p>内网IP</p>
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set <p>内网IP</p>
     * @param PrivateIp <p>内网IP</p>
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get <p>该机器是否开启应用防护</p> 
     * @return RaspOpen <p>该机器是否开启应用防护</p>
     */
    public Boolean getRaspOpen() {
        return this.RaspOpen;
    }

    /**
     * Set <p>该机器是否开启应用防护</p>
     * @param RaspOpen <p>该机器是否开启应用防护</p>
     */
    public void setRaspOpen(Boolean RaspOpen) {
        this.RaspOpen = RaspOpen;
    }

    public EdrAlertItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdrAlertItem(EdrAlertItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AlertId != null) {
            this.AlertId = new String(source.AlertId);
        }
        if (source.AlertCategory != null) {
            this.AlertCategory = new String(source.AlertCategory);
        }
        if (source.AlertSubType != null) {
            this.AlertSubType = new String(source.AlertSubType);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AttackStage != null) {
            this.AttackStage = new String(source.AttackStage);
        }
        if (source.DetectMode != null) {
            this.DetectMode = new String(source.DetectMode);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.IsProVersion != null) {
            this.IsProVersion = new Long(source.IsProVersion);
        }
        if (source.AlertSource != null) {
            this.AlertSource = new String(source.AlertSource);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.FirstDetectTime != null) {
            this.FirstDetectTime = new String(source.FirstDetectTime);
        }
        if (source.LatestDetectTime != null) {
            this.LatestDetectTime = new String(source.LatestDetectTime);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.RaspOpen != null) {
            this.RaspOpen = new Boolean(source.RaspOpen);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AlertId", this.AlertId);
        this.setParamSimple(map, prefix + "AlertCategory", this.AlertCategory);
        this.setParamSimple(map, prefix + "AlertSubType", this.AlertSubType);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AttackStage", this.AttackStage);
        this.setParamSimple(map, prefix + "DetectMode", this.DetectMode);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "IsProVersion", this.IsProVersion);
        this.setParamSimple(map, prefix + "AlertSource", this.AlertSource);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "FirstDetectTime", this.FirstDetectTime);
        this.setParamSimple(map, prefix + "LatestDetectTime", this.LatestDetectTime);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "RaspOpen", this.RaspOpen);

    }
}

