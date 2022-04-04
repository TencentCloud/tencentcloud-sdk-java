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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntentionVerifyData extends AbstractModel{

    /**
    * 意愿确认环节中录制的视频（base64）。若不存在则为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntentionVerifyVideo")
    @Expose
    private String IntentionVerifyVideo;

    /**
    * 意愿确认环节中用户语音转文字的识别结果。若不存在则为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrResult")
    @Expose
    private String AsrResult;

    /**
    * 意愿确认环节的结果码。当该结果码为0时，语音朗读的视频与语音识别结果才会返回。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * 意愿确认环节的结果信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 意愿确认环节中录制视频的最佳帧（base64）。若不存在则为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntentionVerifyBestFrame")
    @Expose
    private String IntentionVerifyBestFrame;

    /**
    * 本次流程用户语音与传入文本比对的相似度分值，取值范围 [0.00, 100.00]。只有配置了相似度阈值后才进行语音校验并返回相似度分值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrResultSimilarity")
    @Expose
    private String AsrResultSimilarity;

    /**
     * Get 意愿确认环节中录制的视频（base64）。若不存在则为空字符串。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntentionVerifyVideo 意愿确认环节中录制的视频（base64）。若不存在则为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntentionVerifyVideo() {
        return this.IntentionVerifyVideo;
    }

    /**
     * Set 意愿确认环节中录制的视频（base64）。若不存在则为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntentionVerifyVideo 意愿确认环节中录制的视频（base64）。若不存在则为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntentionVerifyVideo(String IntentionVerifyVideo) {
        this.IntentionVerifyVideo = IntentionVerifyVideo;
    }

    /**
     * Get 意愿确认环节中用户语音转文字的识别结果。若不存在则为空字符串。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrResult 意愿确认环节中用户语音转文字的识别结果。若不存在则为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAsrResult() {
        return this.AsrResult;
    }

    /**
     * Set 意愿确认环节中用户语音转文字的识别结果。若不存在则为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrResult 意愿确认环节中用户语音转文字的识别结果。若不存在则为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrResult(String AsrResult) {
        this.AsrResult = AsrResult;
    }

    /**
     * Get 意愿确认环节的结果码。当该结果码为0时，语音朗读的视频与语音识别结果才会返回。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCode 意愿确认环节的结果码。当该结果码为0时，语音朗读的视频与语音识别结果才会返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 意愿确认环节的结果码。当该结果码为0时，语音朗读的视频与语音识别结果才会返回。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCode 意愿确认环节的结果码。当该结果码为0时，语音朗读的视频与语音识别结果才会返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 意愿确认环节的结果信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage 意愿确认环节的结果信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 意愿确认环节的结果信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage 意愿确认环节的结果信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 意愿确认环节中录制视频的最佳帧（base64）。若不存在则为空字符串。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntentionVerifyBestFrame 意愿确认环节中录制视频的最佳帧（base64）。若不存在则为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntentionVerifyBestFrame() {
        return this.IntentionVerifyBestFrame;
    }

    /**
     * Set 意愿确认环节中录制视频的最佳帧（base64）。若不存在则为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntentionVerifyBestFrame 意愿确认环节中录制视频的最佳帧（base64）。若不存在则为空字符串。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntentionVerifyBestFrame(String IntentionVerifyBestFrame) {
        this.IntentionVerifyBestFrame = IntentionVerifyBestFrame;
    }

    /**
     * Get 本次流程用户语音与传入文本比对的相似度分值，取值范围 [0.00, 100.00]。只有配置了相似度阈值后才进行语音校验并返回相似度分值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrResultSimilarity 本次流程用户语音与传入文本比对的相似度分值，取值范围 [0.00, 100.00]。只有配置了相似度阈值后才进行语音校验并返回相似度分值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAsrResultSimilarity() {
        return this.AsrResultSimilarity;
    }

    /**
     * Set 本次流程用户语音与传入文本比对的相似度分值，取值范围 [0.00, 100.00]。只有配置了相似度阈值后才进行语音校验并返回相似度分值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrResultSimilarity 本次流程用户语音与传入文本比对的相似度分值，取值范围 [0.00, 100.00]。只有配置了相似度阈值后才进行语音校验并返回相似度分值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrResultSimilarity(String AsrResultSimilarity) {
        this.AsrResultSimilarity = AsrResultSimilarity;
    }

    public IntentionVerifyData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntentionVerifyData(IntentionVerifyData source) {
        if (source.IntentionVerifyVideo != null) {
            this.IntentionVerifyVideo = new String(source.IntentionVerifyVideo);
        }
        if (source.AsrResult != null) {
            this.AsrResult = new String(source.AsrResult);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.IntentionVerifyBestFrame != null) {
            this.IntentionVerifyBestFrame = new String(source.IntentionVerifyBestFrame);
        }
        if (source.AsrResultSimilarity != null) {
            this.AsrResultSimilarity = new String(source.AsrResultSimilarity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntentionVerifyVideo", this.IntentionVerifyVideo);
        this.setParamSimple(map, prefix + "AsrResult", this.AsrResult);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "IntentionVerifyBestFrame", this.IntentionVerifyBestFrame);
        this.setParamSimple(map, prefix + "AsrResultSimilarity", this.AsrResultSimilarity);

    }
}

