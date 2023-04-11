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

public class DetectionEnvAndSoundQualityRespData extends AbstractModel{

    /**
    * 音频ID （用于创建任务接口AudioIds）,环境检测该值为空，仅在音质检测情况下返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioId")
    @Expose
    private String AudioId;

    /**
    * 检测code 

0 表示当前语音通过
-1 表示检测失败，需要重试
-2 表示语音检测不通过，提示用户再重新录制一下（通常漏读，错读，或多读）
-3 表示语音中噪声较大，不通过
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetectionCode")
    @Expose
    private Long DetectionCode;

    /**
    * 检测提示信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetectionMsg")
    @Expose
    private String DetectionMsg;

    /**
    * 检测提示信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetectionTip")
    @Expose
    private Words [] DetectionTip;

    /**
     * Get 音频ID （用于创建任务接口AudioIds）,环境检测该值为空，仅在音质检测情况下返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioId 音频ID （用于创建任务接口AudioIds）,环境检测该值为空，仅在音质检测情况下返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAudioId() {
        return this.AudioId;
    }

    /**
     * Set 音频ID （用于创建任务接口AudioIds）,环境检测该值为空，仅在音质检测情况下返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioId 音频ID （用于创建任务接口AudioIds）,环境检测该值为空，仅在音质检测情况下返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioId(String AudioId) {
        this.AudioId = AudioId;
    }

    /**
     * Get 检测code 

0 表示当前语音通过
-1 表示检测失败，需要重试
-2 表示语音检测不通过，提示用户再重新录制一下（通常漏读，错读，或多读）
-3 表示语音中噪声较大，不通过
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetectionCode 检测code 

0 表示当前语音通过
-1 表示检测失败，需要重试
-2 表示语音检测不通过，提示用户再重新录制一下（通常漏读，错读，或多读）
-3 表示语音中噪声较大，不通过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDetectionCode() {
        return this.DetectionCode;
    }

    /**
     * Set 检测code 

0 表示当前语音通过
-1 表示检测失败，需要重试
-2 表示语音检测不通过，提示用户再重新录制一下（通常漏读，错读，或多读）
-3 表示语音中噪声较大，不通过
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetectionCode 检测code 

0 表示当前语音通过
-1 表示检测失败，需要重试
-2 表示语音检测不通过，提示用户再重新录制一下（通常漏读，错读，或多读）
-3 表示语音中噪声较大，不通过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetectionCode(Long DetectionCode) {
        this.DetectionCode = DetectionCode;
    }

    /**
     * Get 检测提示信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetectionMsg 检测提示信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDetectionMsg() {
        return this.DetectionMsg;
    }

    /**
     * Set 检测提示信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetectionMsg 检测提示信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetectionMsg(String DetectionMsg) {
        this.DetectionMsg = DetectionMsg;
    }

    /**
     * Get 检测提示信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetectionTip 检测提示信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Words [] getDetectionTip() {
        return this.DetectionTip;
    }

    /**
     * Set 检测提示信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetectionTip 检测提示信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetectionTip(Words [] DetectionTip) {
        this.DetectionTip = DetectionTip;
    }

    public DetectionEnvAndSoundQualityRespData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectionEnvAndSoundQualityRespData(DetectionEnvAndSoundQualityRespData source) {
        if (source.AudioId != null) {
            this.AudioId = new String(source.AudioId);
        }
        if (source.DetectionCode != null) {
            this.DetectionCode = new Long(source.DetectionCode);
        }
        if (source.DetectionMsg != null) {
            this.DetectionMsg = new String(source.DetectionMsg);
        }
        if (source.DetectionTip != null) {
            this.DetectionTip = new Words[source.DetectionTip.length];
            for (int i = 0; i < source.DetectionTip.length; i++) {
                this.DetectionTip[i] = new Words(source.DetectionTip[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AudioId", this.AudioId);
        this.setParamSimple(map, prefix + "DetectionCode", this.DetectionCode);
        this.setParamSimple(map, prefix + "DetectionMsg", this.DetectionMsg);
        this.setParamArrayObj(map, prefix + "DetectionTip.", this.DetectionTip);

    }
}

