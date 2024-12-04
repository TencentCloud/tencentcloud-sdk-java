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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Feature extends AbstractModel {

    /**
    * 索引
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 功能ID
    */
    @SerializedName("FeatureId")
    @Expose
    private Long FeatureId;

    /**
    * 功能名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 功能类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 是否可以申请试用
    */
    @SerializedName("Trial")
    @Expose
    private Boolean Trial;

    /**
    * 可以试用的次数
    */
    @SerializedName("TrialCount")
    @Expose
    private Long TrialCount;

    /**
    * 可以试用的时长，单位天
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get 索引 
     * @return Id 索引
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 索引
     * @param Id 索引
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 功能ID 
     * @return FeatureId 功能ID
     */
    public Long getFeatureId() {
        return this.FeatureId;
    }

    /**
     * Set 功能ID
     * @param FeatureId 功能ID
     */
    public void setFeatureId(Long FeatureId) {
        this.FeatureId = FeatureId;
    }

    /**
     * Get 功能名称 
     * @return Name 功能名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 功能名称
     * @param Name 功能名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 功能类型 
     * @return Type 功能类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 功能类型
     * @param Type 功能类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 是否可以申请试用 
     * @return Trial 是否可以申请试用
     */
    public Boolean getTrial() {
        return this.Trial;
    }

    /**
     * Set 是否可以申请试用
     * @param Trial 是否可以申请试用
     */
    public void setTrial(Boolean Trial) {
        this.Trial = Trial;
    }

    /**
     * Get 可以试用的次数 
     * @return TrialCount 可以试用的次数
     */
    public Long getTrialCount() {
        return this.TrialCount;
    }

    /**
     * Set 可以试用的次数
     * @param TrialCount 可以试用的次数
     */
    public void setTrialCount(Long TrialCount) {
        this.TrialCount = TrialCount;
    }

    /**
     * Get 可以试用的时长，单位天 
     * @return Duration 可以试用的时长，单位天
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 可以试用的时长，单位天
     * @param Duration 可以试用的时长，单位天
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public Feature() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Feature(Feature source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.FeatureId != null) {
            this.FeatureId = new Long(source.FeatureId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Trial != null) {
            this.Trial = new Boolean(source.Trial);
        }
        if (source.TrialCount != null) {
            this.TrialCount = new Long(source.TrialCount);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "FeatureId", this.FeatureId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Trial", this.Trial);
        this.setParamSimple(map, prefix + "TrialCount", this.TrialCount);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

