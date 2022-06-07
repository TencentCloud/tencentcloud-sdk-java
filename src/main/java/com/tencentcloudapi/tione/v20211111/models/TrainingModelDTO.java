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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrainingModelDTO extends AbstractModel{

    /**
    * 模型id
    */
    @SerializedName("TrainingModelId")
    @Expose
    private String TrainingModelId;

    /**
    * 模型名称
    */
    @SerializedName("TrainingModelName")
    @Expose
    private String TrainingModelName;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 模型创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 模型id 
     * @return TrainingModelId 模型id
     */
    public String getTrainingModelId() {
        return this.TrainingModelId;
    }

    /**
     * Set 模型id
     * @param TrainingModelId 模型id
     */
    public void setTrainingModelId(String TrainingModelId) {
        this.TrainingModelId = TrainingModelId;
    }

    /**
     * Get 模型名称 
     * @return TrainingModelName 模型名称
     */
    public String getTrainingModelName() {
        return this.TrainingModelName;
    }

    /**
     * Set 模型名称
     * @param TrainingModelName 模型名称
     */
    public void setTrainingModelName(String TrainingModelName) {
        this.TrainingModelName = TrainingModelName;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 模型创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 模型创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 模型创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 模型创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public TrainingModelDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrainingModelDTO(TrainingModelDTO source) {
        if (source.TrainingModelId != null) {
            this.TrainingModelId = new String(source.TrainingModelId);
        }
        if (source.TrainingModelName != null) {
            this.TrainingModelName = new String(source.TrainingModelName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrainingModelId", this.TrainingModelId);
        this.setParamSimple(map, prefix + "TrainingModelName", this.TrainingModelName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

