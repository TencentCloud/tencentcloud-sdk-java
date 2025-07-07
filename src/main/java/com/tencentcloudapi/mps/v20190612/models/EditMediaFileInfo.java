/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EditMediaFileInfo extends AbstractModel {

    /**
    * 视频的输入信息。
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * 【剪辑】任务生效，视频剪辑的起始时间偏移，单位：秒。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 【剪辑】任务生效，视频剪辑的结束时间偏移，单位：秒。
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * 【合成】任务必选，用于轨道元素中媒体关联源素材 ID。

注意：允许字母、数字、-、_ ，最长 32 字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 视频的输入信息。 
     * @return InputInfo 视频的输入信息。
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 视频的输入信息。
     * @param InputInfo 视频的输入信息。
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get 【剪辑】任务生效，视频剪辑的起始时间偏移，单位：秒。 
     * @return StartTimeOffset 【剪辑】任务生效，视频剪辑的起始时间偏移，单位：秒。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 【剪辑】任务生效，视频剪辑的起始时间偏移，单位：秒。
     * @param StartTimeOffset 【剪辑】任务生效，视频剪辑的起始时间偏移，单位：秒。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 【剪辑】任务生效，视频剪辑的结束时间偏移，单位：秒。 
     * @return EndTimeOffset 【剪辑】任务生效，视频剪辑的结束时间偏移，单位：秒。
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 【剪辑】任务生效，视频剪辑的结束时间偏移，单位：秒。
     * @param EndTimeOffset 【剪辑】任务生效，视频剪辑的结束时间偏移，单位：秒。
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get 【合成】任务必选，用于轨道元素中媒体关联源素材 ID。

注意：允许字母、数字、-、_ ，最长 32 字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 【合成】任务必选，用于轨道元素中媒体关联源素材 ID。

注意：允许字母、数字、-、_ ，最长 32 字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 【合成】任务必选，用于轨道元素中媒体关联源素材 ID。

注意：允许字母、数字、-、_ ，最长 32 字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 【合成】任务必选，用于轨道元素中媒体关联源素材 ID。

注意：允许字母、数字、-、_ ，最长 32 字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public EditMediaFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditMediaFileInfo(EditMediaFileInfo source) {
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

