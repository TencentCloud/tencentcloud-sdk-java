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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadVRSModelRsp extends AbstractModel{

    /**
    * 模型cos地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 音色名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceName")
    @Expose
    private String VoiceName;

    /**
    * 音色性别:
1-male
2-female
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceGender")
    @Expose
    private Long VoiceGender;

    /**
    * 语言类型：
1-中文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceLanguage")
    @Expose
    private Long VoiceLanguage;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get 模型cos地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Model 模型cos地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 模型cos地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Model 模型cos地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModel(String Model) {
        this.Model = Model;
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
     * Get 音色性别:
1-male
2-female
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoiceGender 音色性别:
1-male
2-female
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVoiceGender() {
        return this.VoiceGender;
    }

    /**
     * Set 音色性别:
1-male
2-female
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoiceGender 音色性别:
1-male
2-female
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoiceGender(Long VoiceGender) {
        this.VoiceGender = VoiceGender;
    }

    /**
     * Get 语言类型：
1-中文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoiceLanguage 语言类型：
1-中文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVoiceLanguage() {
        return this.VoiceLanguage;
    }

    /**
     * Set 语言类型：
1-中文
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoiceLanguage 语言类型：
1-中文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoiceLanguage(Long VoiceLanguage) {
        this.VoiceLanguage = VoiceLanguage;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public DownloadVRSModelRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadVRSModelRsp(DownloadVRSModelRsp source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.VoiceName != null) {
            this.VoiceName = new String(source.VoiceName);
        }
        if (source.VoiceGender != null) {
            this.VoiceGender = new Long(source.VoiceGender);
        }
        if (source.VoiceLanguage != null) {
            this.VoiceLanguage = new Long(source.VoiceLanguage);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "VoiceName", this.VoiceName);
        this.setParamSimple(map, prefix + "VoiceGender", this.VoiceGender);
        this.setParamSimple(map, prefix + "VoiceLanguage", this.VoiceLanguage);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

