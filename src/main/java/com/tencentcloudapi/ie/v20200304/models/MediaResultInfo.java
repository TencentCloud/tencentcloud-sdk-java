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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaResultInfo extends AbstractModel{

    /**
    * 媒体时长，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 视频流信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultVideoInfoSet")
    @Expose
    private ResultVideoInfo [] ResultVideoInfoSet;

    /**
    * 音频流信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultAudioInfoSet")
    @Expose
    private ResultAudioInfo [] ResultAudioInfoSet;

    /**
     * Get 媒体时长，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 媒体时长，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 媒体时长，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 媒体时长，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 视频流信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultVideoInfoSet 视频流信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResultVideoInfo [] getResultVideoInfoSet() {
        return this.ResultVideoInfoSet;
    }

    /**
     * Set 视频流信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultVideoInfoSet 视频流信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultVideoInfoSet(ResultVideoInfo [] ResultVideoInfoSet) {
        this.ResultVideoInfoSet = ResultVideoInfoSet;
    }

    /**
     * Get 音频流信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultAudioInfoSet 音频流信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResultAudioInfo [] getResultAudioInfoSet() {
        return this.ResultAudioInfoSet;
    }

    /**
     * Set 音频流信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultAudioInfoSet 音频流信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultAudioInfoSet(ResultAudioInfo [] ResultAudioInfoSet) {
        this.ResultAudioInfoSet = ResultAudioInfoSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArrayObj(map, prefix + "ResultVideoInfoSet.", this.ResultVideoInfoSet);
        this.setParamArrayObj(map, prefix + "ResultAudioInfoSet.", this.ResultAudioInfoSet);

    }
}

