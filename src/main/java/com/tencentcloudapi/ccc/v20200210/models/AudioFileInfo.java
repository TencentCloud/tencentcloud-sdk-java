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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioFileInfo extends AbstractModel {

    /**
    * 文件ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileId")
    @Expose
    private Long FileId;

    /**
    * 文件别名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomFileName")
    @Expose
    private String CustomFileName;

    /**
    * 文件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioFileName")
    @Expose
    private String AudioFileName;

    /**
    * 审核状态，0-未审核，1-审核通过，2-审核拒绝
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 文件ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileId 文件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileId() {
        return this.FileId;
    }

    /**
     * Set 文件ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileId 文件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileId(Long FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 文件别名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomFileName 文件别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomFileName() {
        return this.CustomFileName;
    }

    /**
     * Set 文件别名
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomFileName 文件别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomFileName(String CustomFileName) {
        this.CustomFileName = CustomFileName;
    }

    /**
     * Get 文件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioFileName 文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAudioFileName() {
        return this.AudioFileName;
    }

    /**
     * Set 文件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioFileName 文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioFileName(String AudioFileName) {
        this.AudioFileName = AudioFileName;
    }

    /**
     * Get 审核状态，0-未审核，1-审核通过，2-审核拒绝
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 审核状态，0-未审核，1-审核通过，2-审核拒绝
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 审核状态，0-未审核，1-审核通过，2-审核拒绝
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 审核状态，0-未审核，1-审核通过，2-审核拒绝
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public AudioFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioFileInfo(AudioFileInfo source) {
        if (source.FileId != null) {
            this.FileId = new Long(source.FileId);
        }
        if (source.CustomFileName != null) {
            this.CustomFileName = new String(source.CustomFileName);
        }
        if (source.AudioFileName != null) {
            this.AudioFileName = new String(source.AudioFileName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "CustomFileName", this.CustomFileName);
        this.setParamSimple(map, prefix + "AudioFileName", this.AudioFileName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

