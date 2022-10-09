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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClsLogTopicInfo extends AbstractModel{

    /**
    * 任务名。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 站点名称。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 日志集ID。
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * 日志主题ID。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 任务类型。
    */
    @SerializedName("EntityType")
    @Expose
    private String EntityType;

    /**
    * 任务主题保存时间。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 任务主题是否开启。
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 任务主题是否异常。
    */
    @SerializedName("Deleted")
    @Expose
    private String Deleted;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 推送目标地址,取值有：
<li>cls: 推送到cls；</li>
<li>custom_enpoint: 自定义推送地址。</li>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 日志集所属地区。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogSetRegion")
    @Expose
    private String LogSetRegion;

    /**
    * 站点id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 加速区域，取值有：
<li>mainland：中国大陆境内;</li>
<li>overseas：全球（不含中国大陆）。</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 推送任务类型，取值有：
<li>cls：推送到cls；</li>
<li>custom_endpoint：推送到自定义接口。</li>
    */
    @SerializedName("LogSetType")
    @Expose
    private String LogSetType;

    /**
     * Get 任务名。 
     * @return TaskName 任务名。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名。
     * @param TaskName 任务名。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 站点名称。 
     * @return ZoneName 站点名称。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 站点名称。
     * @param ZoneName 站点名称。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 日志集ID。 
     * @return LogSetId 日志集ID。
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set 日志集ID。
     * @param LogSetId 日志集ID。
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get 日志主题ID。 
     * @return TopicId 日志主题ID。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID。
     * @param TopicId 日志主题ID。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 任务类型。 
     * @return EntityType 任务类型。
     */
    public String getEntityType() {
        return this.EntityType;
    }

    /**
     * Set 任务类型。
     * @param EntityType 任务类型。
     */
    public void setEntityType(String EntityType) {
        this.EntityType = EntityType;
    }

    /**
     * Get 任务主题保存时间。 
     * @return Period 任务主题保存时间。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 任务主题保存时间。
     * @param Period 任务主题保存时间。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 任务主题是否开启。 
     * @return Enabled 任务主题是否开启。
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 任务主题是否开启。
     * @param Enabled 任务主题是否开启。
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 任务主题是否异常。 
     * @return Deleted 任务主题是否异常。
     */
    public String getDeleted() {
        return this.Deleted;
    }

    /**
     * Set 任务主题是否异常。
     * @param Deleted 任务主题是否异常。
     */
    public void setDeleted(String Deleted) {
        this.Deleted = Deleted;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 推送目标地址,取值有：
<li>cls: 推送到cls；</li>
<li>custom_enpoint: 自定义推送地址。</li> 
     * @return Target 推送目标地址,取值有：
<li>cls: 推送到cls；</li>
<li>custom_enpoint: 自定义推送地址。</li>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 推送目标地址,取值有：
<li>cls: 推送到cls；</li>
<li>custom_enpoint: 自定义推送地址。</li>
     * @param Target 推送目标地址,取值有：
<li>cls: 推送到cls；</li>
<li>custom_enpoint: 自定义推送地址。</li>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 日志集所属地区。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogSetRegion 日志集所属地区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogSetRegion() {
        return this.LogSetRegion;
    }

    /**
     * Set 日志集所属地区。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogSetRegion 日志集所属地区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogSetRegion(String LogSetRegion) {
        this.LogSetRegion = LogSetRegion;
    }

    /**
     * Get 站点id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId 站点id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId 站点id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 加速区域，取值有：
<li>mainland：中国大陆境内;</li>
<li>overseas：全球（不含中国大陆）。</li> 
     * @return Area 加速区域，取值有：
<li>mainland：中国大陆境内;</li>
<li>overseas：全球（不含中国大陆）。</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 加速区域，取值有：
<li>mainland：中国大陆境内;</li>
<li>overseas：全球（不含中国大陆）。</li>
     * @param Area 加速区域，取值有：
<li>mainland：中国大陆境内;</li>
<li>overseas：全球（不含中国大陆）。</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 推送任务类型，取值有：
<li>cls：推送到cls；</li>
<li>custom_endpoint：推送到自定义接口。</li> 
     * @return LogSetType 推送任务类型，取值有：
<li>cls：推送到cls；</li>
<li>custom_endpoint：推送到自定义接口。</li>
     */
    public String getLogSetType() {
        return this.LogSetType;
    }

    /**
     * Set 推送任务类型，取值有：
<li>cls：推送到cls；</li>
<li>custom_endpoint：推送到自定义接口。</li>
     * @param LogSetType 推送任务类型，取值有：
<li>cls：推送到cls；</li>
<li>custom_endpoint：推送到自定义接口。</li>
     */
    public void setLogSetType(String LogSetType) {
        this.LogSetType = LogSetType;
    }

    public ClsLogTopicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClsLogTopicInfo(ClsLogTopicInfo source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.EntityType != null) {
            this.EntityType = new String(source.EntityType);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Deleted != null) {
            this.Deleted = new String(source.Deleted);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.LogSetRegion != null) {
            this.LogSetRegion = new String(source.LogSetRegion);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.LogSetType != null) {
            this.LogSetType = new String(source.LogSetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "LogSetRegion", this.LogSetRegion);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "LogSetType", this.LogSetType);

    }
}

