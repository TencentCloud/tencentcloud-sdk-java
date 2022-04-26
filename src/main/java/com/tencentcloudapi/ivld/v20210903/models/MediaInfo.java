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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaInfo extends AbstractModel{

    /**
    * 媒资ID
    */
    @SerializedName("MediaId")
    @Expose
    private String MediaId;

    /**
    * 媒资名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 媒资下载地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownLoadURL")
    @Expose
    private String DownLoadURL;

    /**
    * 媒资状态，取值参看上方表格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 若状态为失败，表示失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedReason")
    @Expose
    private String FailedReason;

    /**
    * 媒资视频元信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metadata")
    @Expose
    private MediaMetadata Metadata;

    /**
    * 导入视频进度，取值范围为[0,100]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * 媒资自定义标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 媒资导入完成后的回调地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallbackURL")
    @Expose
    private String CallbackURL;

    /**
     * Get 媒资ID 
     * @return MediaId 媒资ID
     */
    public String getMediaId() {
        return this.MediaId;
    }

    /**
     * Set 媒资ID
     * @param MediaId 媒资ID
     */
    public void setMediaId(String MediaId) {
        this.MediaId = MediaId;
    }

    /**
     * Get 媒资名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 媒资名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 媒资名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 媒资名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 媒资下载地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownLoadURL 媒资下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDownLoadURL() {
        return this.DownLoadURL;
    }

    /**
     * Set 媒资下载地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownLoadURL 媒资下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownLoadURL(String DownLoadURL) {
        this.DownLoadURL = DownLoadURL;
    }

    /**
     * Get 媒资状态，取值参看上方表格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 媒资状态，取值参看上方表格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 媒资状态，取值参看上方表格
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 媒资状态，取值参看上方表格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 若状态为失败，表示失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedReason 若状态为失败，表示失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * Set 若状态为失败，表示失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedReason 若状态为失败，表示失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
    }

    /**
     * Get 媒资视频元信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metadata 媒资视频元信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaMetadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 媒资视频元信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metadata 媒资视频元信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetadata(MediaMetadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get 导入视频进度，取值范围为[0,100]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Progress 导入视频进度，取值范围为[0,100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 导入视频进度，取值范围为[0,100]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Progress 导入视频进度，取值范围为[0,100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 媒资自定义标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label 媒资自定义标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 媒资自定义标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label 媒资自定义标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 媒资导入完成后的回调地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CallbackURL 媒资导入完成后的回调地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCallbackURL() {
        return this.CallbackURL;
    }

    /**
     * Set 媒资导入完成后的回调地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param CallbackURL 媒资导入完成后的回调地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallbackURL(String CallbackURL) {
        this.CallbackURL = CallbackURL;
    }

    public MediaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaInfo(MediaInfo source) {
        if (source.MediaId != null) {
            this.MediaId = new String(source.MediaId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DownLoadURL != null) {
            this.DownLoadURL = new String(source.DownLoadURL);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FailedReason != null) {
            this.FailedReason = new String(source.FailedReason);
        }
        if (source.Metadata != null) {
            this.Metadata = new MediaMetadata(source.Metadata);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.CallbackURL != null) {
            this.CallbackURL = new String(source.CallbackURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaId", this.MediaId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DownLoadURL", this.DownLoadURL);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailedReason", this.FailedReason);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "CallbackURL", this.CallbackURL);

    }
}

