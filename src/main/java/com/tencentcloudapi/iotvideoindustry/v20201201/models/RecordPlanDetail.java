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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordPlanDetail extends AbstractModel{

    /**
    * 计划ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 计划名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 时间模板ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeTemplateId")
    @Expose
    private String TimeTemplateId;

    /**
    * 时间模板名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeTemplateName")
    @Expose
    private String TimeTemplateName;

    /**
    * 绑定的通道列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Channels")
    @Expose
    private ChannelItem [] Channels;

    /**
    * 存储周期（天）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordStorageTime")
    @Expose
    private Long RecordStorageTime;

    /**
     * Get 计划ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlanId 计划ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 计划ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlanId 计划ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 计划名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 计划名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 计划名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 计划名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 时间模板ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeTemplateId 时间模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeTemplateId() {
        return this.TimeTemplateId;
    }

    /**
     * Set 时间模板ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeTemplateId 时间模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeTemplateId(String TimeTemplateId) {
        this.TimeTemplateId = TimeTemplateId;
    }

    /**
     * Get 时间模板名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeTemplateName 时间模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeTemplateName() {
        return this.TimeTemplateName;
    }

    /**
     * Set 时间模板名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeTemplateName 时间模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeTemplateName(String TimeTemplateName) {
        this.TimeTemplateName = TimeTemplateName;
    }

    /**
     * Get 绑定的通道列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Channels 绑定的通道列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChannelItem [] getChannels() {
        return this.Channels;
    }

    /**
     * Set 绑定的通道列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Channels 绑定的通道列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannels(ChannelItem [] Channels) {
        this.Channels = Channels;
    }

    /**
     * Get 存储周期（天）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordStorageTime 存储周期（天）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecordStorageTime() {
        return this.RecordStorageTime;
    }

    /**
     * Set 存储周期（天）
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordStorageTime 存储周期（天）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordStorageTime(Long RecordStorageTime) {
        this.RecordStorageTime = RecordStorageTime;
    }

    public RecordPlanDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordPlanDetail(RecordPlanDetail source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TimeTemplateId != null) {
            this.TimeTemplateId = new String(source.TimeTemplateId);
        }
        if (source.TimeTemplateName != null) {
            this.TimeTemplateName = new String(source.TimeTemplateName);
        }
        if (source.Channels != null) {
            this.Channels = new ChannelItem[source.Channels.length];
            for (int i = 0; i < source.Channels.length; i++) {
                this.Channels[i] = new ChannelItem(source.Channels[i]);
            }
        }
        if (source.RecordStorageTime != null) {
            this.RecordStorageTime = new Long(source.RecordStorageTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TimeTemplateId", this.TimeTemplateId);
        this.setParamSimple(map, prefix + "TimeTemplateName", this.TimeTemplateName);
        this.setParamArrayObj(map, prefix + "Channels.", this.Channels);
        this.setParamSimple(map, prefix + "RecordStorageTime", this.RecordStorageTime);

    }
}

