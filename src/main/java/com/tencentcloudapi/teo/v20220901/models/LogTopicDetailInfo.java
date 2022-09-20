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

public class LogTopicDetailInfo extends AbstractModel{

    /**
    * 推送任务的任务名称。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 日志集所属的地域。
    */
    @SerializedName("LogSetRegion")
    @Expose
    private String LogSetRegion;

    /**
    * 推送任务的类型。
    */
    @SerializedName("EntityType")
    @Expose
    private String EntityType;

    /**
    * 任务实体列表。
    */
    @SerializedName("EntityList")
    @Expose
    private String [] EntityList;

    /**
    * 日志集ID。
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * 日志集名称。
    */
    @SerializedName("LogSetName")
    @Expose
    private String LogSetName;

    /**
    * 推送任务主题ID。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 推送任务主题名称。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 推送任务主题保存时间，单位为天。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 推送任务是否开启。
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 推送任务创建时间，时间格式为: YYYY-mm-dd HH:MM:SS。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 加速区域，取值有：
<li>mainland：中国大陆境内;</li>
<li>overseas：全球（不含中国大陆）。</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 站点ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 站点名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 是否被删除了，取值有：
<li>yes: 已经被删除；</li>
<li>no: 没有被删除。</li>
    */
    @SerializedName("Deleted")
    @Expose
    private String Deleted;

    /**
     * Get 推送任务的任务名称。 
     * @return TaskName 推送任务的任务名称。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 推送任务的任务名称。
     * @param TaskName 推送任务的任务名称。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 日志集所属的地域。 
     * @return LogSetRegion 日志集所属的地域。
     */
    public String getLogSetRegion() {
        return this.LogSetRegion;
    }

    /**
     * Set 日志集所属的地域。
     * @param LogSetRegion 日志集所属的地域。
     */
    public void setLogSetRegion(String LogSetRegion) {
        this.LogSetRegion = LogSetRegion;
    }

    /**
     * Get 推送任务的类型。 
     * @return EntityType 推送任务的类型。
     */
    public String getEntityType() {
        return this.EntityType;
    }

    /**
     * Set 推送任务的类型。
     * @param EntityType 推送任务的类型。
     */
    public void setEntityType(String EntityType) {
        this.EntityType = EntityType;
    }

    /**
     * Get 任务实体列表。 
     * @return EntityList 任务实体列表。
     */
    public String [] getEntityList() {
        return this.EntityList;
    }

    /**
     * Set 任务实体列表。
     * @param EntityList 任务实体列表。
     */
    public void setEntityList(String [] EntityList) {
        this.EntityList = EntityList;
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
     * Get 日志集名称。 
     * @return LogSetName 日志集名称。
     */
    public String getLogSetName() {
        return this.LogSetName;
    }

    /**
     * Set 日志集名称。
     * @param LogSetName 日志集名称。
     */
    public void setLogSetName(String LogSetName) {
        this.LogSetName = LogSetName;
    }

    /**
     * Get 推送任务主题ID。 
     * @return TopicId 推送任务主题ID。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 推送任务主题ID。
     * @param TopicId 推送任务主题ID。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 推送任务主题名称。 
     * @return TopicName 推送任务主题名称。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 推送任务主题名称。
     * @param TopicName 推送任务主题名称。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 推送任务主题保存时间，单位为天。 
     * @return Period 推送任务主题保存时间，单位为天。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 推送任务主题保存时间，单位为天。
     * @param Period 推送任务主题保存时间，单位为天。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 推送任务是否开启。 
     * @return Enabled 推送任务是否开启。
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 推送任务是否开启。
     * @param Enabled 推送任务是否开启。
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 推送任务创建时间，时间格式为: YYYY-mm-dd HH:MM:SS。 
     * @return CreateTime 推送任务创建时间，时间格式为: YYYY-mm-dd HH:MM:SS。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 推送任务创建时间，时间格式为: YYYY-mm-dd HH:MM:SS。
     * @param CreateTime 推送任务创建时间，时间格式为: YYYY-mm-dd HH:MM:SS。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get 站点ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId 站点ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId 站点ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 站点名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneName 站点名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 站点名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneName 站点名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 是否被删除了，取值有：
<li>yes: 已经被删除；</li>
<li>no: 没有被删除。</li> 
     * @return Deleted 是否被删除了，取值有：
<li>yes: 已经被删除；</li>
<li>no: 没有被删除。</li>
     */
    public String getDeleted() {
        return this.Deleted;
    }

    /**
     * Set 是否被删除了，取值有：
<li>yes: 已经被删除；</li>
<li>no: 没有被删除。</li>
     * @param Deleted 是否被删除了，取值有：
<li>yes: 已经被删除；</li>
<li>no: 没有被删除。</li>
     */
    public void setDeleted(String Deleted) {
        this.Deleted = Deleted;
    }

    public LogTopicDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogTopicDetailInfo(LogTopicDetailInfo source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.LogSetRegion != null) {
            this.LogSetRegion = new String(source.LogSetRegion);
        }
        if (source.EntityType != null) {
            this.EntityType = new String(source.EntityType);
        }
        if (source.EntityList != null) {
            this.EntityList = new String[source.EntityList.length];
            for (int i = 0; i < source.EntityList.length; i++) {
                this.EntityList[i] = new String(source.EntityList[i]);
            }
        }
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.LogSetName != null) {
            this.LogSetName = new String(source.LogSetName);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Deleted != null) {
            this.Deleted = new String(source.Deleted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "LogSetRegion", this.LogSetRegion);
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);
        this.setParamArraySimple(map, prefix + "EntityList.", this.EntityList);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "LogSetName", this.LogSetName);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);

    }
}

