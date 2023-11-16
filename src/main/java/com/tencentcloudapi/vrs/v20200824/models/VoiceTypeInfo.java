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
package com.tencentcloudapi.vrs.v20200824.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoiceTypeInfo extends AbstractModel {

    /**
    * 音色id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceType")
    @Expose
    private Long VoiceType;

    /**
    * 音色名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceName")
    @Expose
    private String VoiceName;

    /**
    * 音色性别: 1-male 2-female
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceGender")
    @Expose
    private Long VoiceGender;

    /**
    * 复刻类型: 0-轻量版复刻 1-基础版复刻
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 复刻任务 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DateCreated")
    @Expose
    private String DateCreated;

    /**
     * Get 音色id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoiceType 音色id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set 音色id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoiceType 音色id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoiceType(Long VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get 音色名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoiceName 音色名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVoiceName() {
        return this.VoiceName;
    }

    /**
     * Set 音色名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoiceName 音色名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoiceName(String VoiceName) {
        this.VoiceName = VoiceName;
    }

    /**
     * Get 音色性别: 1-male 2-female
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoiceGender 音色性别: 1-male 2-female
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVoiceGender() {
        return this.VoiceGender;
    }

    /**
     * Set 音色性别: 1-male 2-female
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoiceGender 音色性别: 1-male 2-female
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoiceGender(Long VoiceGender) {
        this.VoiceGender = VoiceGender;
    }

    /**
     * Get 复刻类型: 0-轻量版复刻 1-基础版复刻
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType 复刻类型: 0-轻量版复刻 1-基础版复刻
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 复刻类型: 0-轻量版复刻 1-基础版复刻
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 复刻类型: 0-轻量版复刻 1-基础版复刻
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 复刻任务 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskID 复刻任务 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 复刻任务 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskID 复刻任务 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DateCreated 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDateCreated() {
        return this.DateCreated;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DateCreated 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDateCreated(String DateCreated) {
        this.DateCreated = DateCreated;
    }

    public VoiceTypeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceTypeInfo(VoiceTypeInfo source) {
        if (source.VoiceType != null) {
            this.VoiceType = new Long(source.VoiceType);
        }
        if (source.VoiceName != null) {
            this.VoiceName = new String(source.VoiceName);
        }
        if (source.VoiceGender != null) {
            this.VoiceGender = new Long(source.VoiceGender);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
        if (source.DateCreated != null) {
            this.DateCreated = new String(source.DateCreated);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamSimple(map, prefix + "VoiceName", this.VoiceName);
        this.setParamSimple(map, prefix + "VoiceGender", this.VoiceGender);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "DateCreated", this.DateCreated);

    }
}

