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

public class TimeTemplateItem extends AbstractModel{

    /**
    * 时间模板ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 模板名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否全时录制，即7*24小时录制 0-否 1-是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAllWeek")
    @Expose
    private Long IsAllWeek;

    /**
    * 是否为自定义模板 0-否 1-是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 时间片段详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeTemplateSpecs")
    @Expose
    private TimeTemplateSpec [] TimeTemplateSpecs;

    /**
     * Get 时间模板ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateId 时间模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 时间模板ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateId 时间模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 模板名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否全时录制，即7*24小时录制 0-否 1-是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAllWeek 是否全时录制，即7*24小时录制 0-否 1-是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsAllWeek() {
        return this.IsAllWeek;
    }

    /**
     * Set 是否全时录制，即7*24小时录制 0-否 1-是
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAllWeek 是否全时录制，即7*24小时录制 0-否 1-是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAllWeek(Long IsAllWeek) {
        this.IsAllWeek = IsAllWeek;
    }

    /**
     * Get 是否为自定义模板 0-否 1-是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 是否为自定义模板 0-否 1-是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 是否为自定义模板 0-否 1-是
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 是否为自定义模板 0-否 1-是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 时间片段详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeTemplateSpecs 时间片段详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TimeTemplateSpec [] getTimeTemplateSpecs() {
        return this.TimeTemplateSpecs;
    }

    /**
     * Set 时间片段详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeTemplateSpecs 时间片段详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeTemplateSpecs(TimeTemplateSpec [] TimeTemplateSpecs) {
        this.TimeTemplateSpecs = TimeTemplateSpecs;
    }

    public TimeTemplateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeTemplateItem(TimeTemplateItem source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IsAllWeek != null) {
            this.IsAllWeek = new Long(source.IsAllWeek);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.TimeTemplateSpecs != null) {
            this.TimeTemplateSpecs = new TimeTemplateSpec[source.TimeTemplateSpecs.length];
            for (int i = 0; i < source.TimeTemplateSpecs.length; i++) {
                this.TimeTemplateSpecs[i] = new TimeTemplateSpec(source.TimeTemplateSpecs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IsAllWeek", this.IsAllWeek);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "TimeTemplateSpecs.", this.TimeTemplateSpecs);

    }
}

