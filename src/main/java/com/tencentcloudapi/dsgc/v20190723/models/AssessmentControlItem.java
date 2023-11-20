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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssessmentControlItem extends AbstractModel {

    /**
    * 评估项Id
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * 评估项名称
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * 评估项描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 评估项来源，内置/用户自定，取值（system，user）
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 评估项类型，问卷/自动化，取值（questionnaire，auto）
    */
    @SerializedName("ItemType")
    @Expose
    private String ItemType;

    /**
    * 评估项子类型，单选/多选/时间/文本/AKSK等，取值（singlechoice，multichoice，date，text，AKSK……等）
    */
    @SerializedName("ItemSubType")
    @Expose
    private String ItemSubType;

    /**
    * 评估项创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 评估项启用状态，启用/未启用，取值draft / launched
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 评估项关联的模板数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateCount")
    @Expose
    private Long TemplateCount;

    /**
     * Get 评估项Id 
     * @return ItemId 评估项Id
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set 评估项Id
     * @param ItemId 评估项Id
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get 评估项名称 
     * @return ItemName 评估项名称
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set 评估项名称
     * @param ItemName 评估项名称
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get 评估项描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 评估项描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 评估项描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 评估项描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 评估项来源，内置/用户自定，取值（system，user） 
     * @return Source 评估项来源，内置/用户自定，取值（system，user）
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 评估项来源，内置/用户自定，取值（system，user）
     * @param Source 评估项来源，内置/用户自定，取值（system，user）
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 评估项类型，问卷/自动化，取值（questionnaire，auto） 
     * @return ItemType 评估项类型，问卷/自动化，取值（questionnaire，auto）
     */
    public String getItemType() {
        return this.ItemType;
    }

    /**
     * Set 评估项类型，问卷/自动化，取值（questionnaire，auto）
     * @param ItemType 评估项类型，问卷/自动化，取值（questionnaire，auto）
     */
    public void setItemType(String ItemType) {
        this.ItemType = ItemType;
    }

    /**
     * Get 评估项子类型，单选/多选/时间/文本/AKSK等，取值（singlechoice，multichoice，date，text，AKSK……等） 
     * @return ItemSubType 评估项子类型，单选/多选/时间/文本/AKSK等，取值（singlechoice，multichoice，date，text，AKSK……等）
     */
    public String getItemSubType() {
        return this.ItemSubType;
    }

    /**
     * Set 评估项子类型，单选/多选/时间/文本/AKSK等，取值（singlechoice，multichoice，date，text，AKSK……等）
     * @param ItemSubType 评估项子类型，单选/多选/时间/文本/AKSK等，取值（singlechoice，multichoice，date，text，AKSK……等）
     */
    public void setItemSubType(String ItemSubType) {
        this.ItemSubType = ItemSubType;
    }

    /**
     * Get 评估项创建时间 
     * @return CreatedTime 评估项创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 评估项创建时间
     * @param CreatedTime 评估项创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 评估项启用状态，启用/未启用，取值draft / launched 
     * @return Status 评估项启用状态，启用/未启用，取值draft / launched
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 评估项启用状态，启用/未启用，取值draft / launched
     * @param Status 评估项启用状态，启用/未启用，取值draft / launched
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 评估项关联的模板数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateCount 评估项关联的模板数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTemplateCount() {
        return this.TemplateCount;
    }

    /**
     * Set 评估项关联的模板数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateCount 评估项关联的模板数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateCount(Long TemplateCount) {
        this.TemplateCount = TemplateCount;
    }

    public AssessmentControlItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssessmentControlItem(AssessmentControlItem source) {
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.ItemType != null) {
            this.ItemType = new String(source.ItemType);
        }
        if (source.ItemSubType != null) {
            this.ItemSubType = new String(source.ItemSubType);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TemplateCount != null) {
            this.TemplateCount = new Long(source.TemplateCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "ItemType", this.ItemType);
        this.setParamSimple(map, prefix + "ItemSubType", this.ItemSubType);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TemplateCount", this.TemplateCount);

    }
}

