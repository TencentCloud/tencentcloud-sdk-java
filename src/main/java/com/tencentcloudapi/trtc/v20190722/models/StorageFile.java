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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageFile extends AbstractModel{

    /**
    * 录制文件对应的UserId，如果是混流的话的这里返回的是空串。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 录制索引文件名。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 录制文件流信息。
video：视频录制文件
audio：音频录制文件
audio_video：音视频录制文件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrackType")
    @Expose
    private String TrackType;

    /**
    * 录制文件开始Unix时间戳。
    */
    @SerializedName("BeginTimeStamp")
    @Expose
    private Long BeginTimeStamp;

    /**
     * Get 录制文件对应的UserId，如果是混流的话的这里返回的是空串。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 录制文件对应的UserId，如果是混流的话的这里返回的是空串。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 录制文件对应的UserId，如果是混流的话的这里返回的是空串。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 录制文件对应的UserId，如果是混流的话的这里返回的是空串。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 录制索引文件名。 
     * @return FileName 录制索引文件名。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 录制索引文件名。
     * @param FileName 录制索引文件名。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 录制文件流信息。
video：视频录制文件
audio：音频录制文件
audio_video：音视频录制文件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrackType 录制文件流信息。
video：视频录制文件
audio：音频录制文件
audio_video：音视频录制文件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrackType() {
        return this.TrackType;
    }

    /**
     * Set 录制文件流信息。
video：视频录制文件
audio：音频录制文件
audio_video：音视频录制文件
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrackType 录制文件流信息。
video：视频录制文件
audio：音频录制文件
audio_video：音视频录制文件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrackType(String TrackType) {
        this.TrackType = TrackType;
    }

    /**
     * Get 录制文件开始Unix时间戳。 
     * @return BeginTimeStamp 录制文件开始Unix时间戳。
     */
    public Long getBeginTimeStamp() {
        return this.BeginTimeStamp;
    }

    /**
     * Set 录制文件开始Unix时间戳。
     * @param BeginTimeStamp 录制文件开始Unix时间戳。
     */
    public void setBeginTimeStamp(Long BeginTimeStamp) {
        this.BeginTimeStamp = BeginTimeStamp;
    }

    public StorageFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageFile(StorageFile source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.TrackType != null) {
            this.TrackType = new String(source.TrackType);
        }
        if (source.BeginTimeStamp != null) {
            this.BeginTimeStamp = new Long(source.BeginTimeStamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "TrackType", this.TrackType);
        this.setParamSimple(map, prefix + "BeginTimeStamp", this.BeginTimeStamp);

    }
}

