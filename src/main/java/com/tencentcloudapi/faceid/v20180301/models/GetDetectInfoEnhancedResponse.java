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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDetectInfoEnhancedResponse extends AbstractModel {

    /**
    * 人脸核身识别结果及文本类信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private DetectInfoText Text;

    /**
    * 身份证照片信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdCardData")
    @Expose
    private DetectInfoIdCardData IdCardData;

    /**
    * 最佳帧信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BestFrame")
    @Expose
    private DetectInfoBestFrame BestFrame;

    /**
    * 视频信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoData")
    @Expose
    private DetectInfoVideoData VideoData;

    /**
    * 敏感数据加密信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * 意愿核身朗读模式结果信息。
- 若未使用意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntentionVerifyData")
    @Expose
    private IntentionVerifyData IntentionVerifyData;

    /**
    * 意愿核身问答模式结果。

- 若未使用该意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntentionQuestionResult")
    @Expose
    private IntentionQuestionResult IntentionQuestionResult;

    /**
    * 意愿核身点头确认模式的结果信息。
- 若未使用该意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntentionActionResult")
    @Expose
    private IntentionActionResult IntentionActionResult;

    /**
    * 加密后的数据。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EncryptedBody")
    @Expose
    private String EncryptedBody;

    /**
    * 本次请求是否配置开启意愿校验。 
false：未开启意愿校验 
true：已开启意愿校验 
说明：若请求开启了意愿校验，可结合IntentionVerifyType中具体使用的校验模式从对应的出参Result中获取最终的核验结果；若请求没有开启意愿校验，则可在出参Text中获取最终的核验结果。
    */
    @SerializedName("IsVerifyIntention")
    @Expose
    private Boolean IsVerifyIntention;

    /**
    * 本次请求意愿校验使用的具体模式。
0：问答模式
1：点头确认模式
2：朗读模式
若未使用意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值
    */
    @SerializedName("IntentionVerifyType")
    @Expose
    private String IntentionVerifyType;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 人脸核身识别结果及文本类信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 人脸核身识别结果及文本类信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetectInfoText getText() {
        return this.Text;
    }

    /**
     * Set 人脸核身识别结果及文本类信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 人脸核身识别结果及文本类信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(DetectInfoText Text) {
        this.Text = Text;
    }

    /**
     * Get 身份证照片信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdCardData 身份证照片信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetectInfoIdCardData getIdCardData() {
        return this.IdCardData;
    }

    /**
     * Set 身份证照片信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdCardData 身份证照片信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdCardData(DetectInfoIdCardData IdCardData) {
        this.IdCardData = IdCardData;
    }

    /**
     * Get 最佳帧信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BestFrame 最佳帧信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetectInfoBestFrame getBestFrame() {
        return this.BestFrame;
    }

    /**
     * Set 最佳帧信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BestFrame 最佳帧信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBestFrame(DetectInfoBestFrame BestFrame) {
        this.BestFrame = BestFrame;
    }

    /**
     * Get 视频信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoData 视频信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetectInfoVideoData getVideoData() {
        return this.VideoData;
    }

    /**
     * Set 视频信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoData 视频信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoData(DetectInfoVideoData VideoData) {
        this.VideoData = VideoData;
    }

    /**
     * Get 敏感数据加密信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Encryption 敏感数据加密信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set 敏感数据加密信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Encryption 敏感数据加密信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get 意愿核身朗读模式结果信息。
- 若未使用意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntentionVerifyData 意愿核身朗读模式结果信息。
- 若未使用意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntentionVerifyData getIntentionVerifyData() {
        return this.IntentionVerifyData;
    }

    /**
     * Set 意愿核身朗读模式结果信息。
- 若未使用意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntentionVerifyData 意愿核身朗读模式结果信息。
- 若未使用意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntentionVerifyData(IntentionVerifyData IntentionVerifyData) {
        this.IntentionVerifyData = IntentionVerifyData;
    }

    /**
     * Get 意愿核身问答模式结果。

- 若未使用该意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntentionQuestionResult 意愿核身问答模式结果。

- 若未使用该意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntentionQuestionResult getIntentionQuestionResult() {
        return this.IntentionQuestionResult;
    }

    /**
     * Set 意愿核身问答模式结果。

- 若未使用该意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntentionQuestionResult 意愿核身问答模式结果。

- 若未使用该意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntentionQuestionResult(IntentionQuestionResult IntentionQuestionResult) {
        this.IntentionQuestionResult = IntentionQuestionResult;
    }

    /**
     * Get 意愿核身点头确认模式的结果信息。
- 若未使用该意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntentionActionResult 意愿核身点头确认模式的结果信息。
- 若未使用该意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntentionActionResult getIntentionActionResult() {
        return this.IntentionActionResult;
    }

    /**
     * Set 意愿核身点头确认模式的结果信息。
- 若未使用该意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntentionActionResult 意愿核身点头确认模式的结果信息。
- 若未使用该意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntentionActionResult(IntentionActionResult IntentionActionResult) {
        this.IntentionActionResult = IntentionActionResult;
    }

    /**
     * Get 加密后的数据。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EncryptedBody 加密后的数据。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEncryptedBody() {
        return this.EncryptedBody;
    }

    /**
     * Set 加密后的数据。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EncryptedBody 加密后的数据。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncryptedBody(String EncryptedBody) {
        this.EncryptedBody = EncryptedBody;
    }

    /**
     * Get 本次请求是否配置开启意愿校验。 
false：未开启意愿校验 
true：已开启意愿校验 
说明：若请求开启了意愿校验，可结合IntentionVerifyType中具体使用的校验模式从对应的出参Result中获取最终的核验结果；若请求没有开启意愿校验，则可在出参Text中获取最终的核验结果。 
     * @return IsVerifyIntention 本次请求是否配置开启意愿校验。 
false：未开启意愿校验 
true：已开启意愿校验 
说明：若请求开启了意愿校验，可结合IntentionVerifyType中具体使用的校验模式从对应的出参Result中获取最终的核验结果；若请求没有开启意愿校验，则可在出参Text中获取最终的核验结果。
     */
    public Boolean getIsVerifyIntention() {
        return this.IsVerifyIntention;
    }

    /**
     * Set 本次请求是否配置开启意愿校验。 
false：未开启意愿校验 
true：已开启意愿校验 
说明：若请求开启了意愿校验，可结合IntentionVerifyType中具体使用的校验模式从对应的出参Result中获取最终的核验结果；若请求没有开启意愿校验，则可在出参Text中获取最终的核验结果。
     * @param IsVerifyIntention 本次请求是否配置开启意愿校验。 
false：未开启意愿校验 
true：已开启意愿校验 
说明：若请求开启了意愿校验，可结合IntentionVerifyType中具体使用的校验模式从对应的出参Result中获取最终的核验结果；若请求没有开启意愿校验，则可在出参Text中获取最终的核验结果。
     */
    public void setIsVerifyIntention(Boolean IsVerifyIntention) {
        this.IsVerifyIntention = IsVerifyIntention;
    }

    /**
     * Get 本次请求意愿校验使用的具体模式。
0：问答模式
1：点头确认模式
2：朗读模式
若未使用意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值 
     * @return IntentionVerifyType 本次请求意愿校验使用的具体模式。
0：问答模式
1：点头确认模式
2：朗读模式
若未使用意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值
     */
    public String getIntentionVerifyType() {
        return this.IntentionVerifyType;
    }

    /**
     * Set 本次请求意愿校验使用的具体模式。
0：问答模式
1：点头确认模式
2：朗读模式
若未使用意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值
     * @param IntentionVerifyType 本次请求意愿校验使用的具体模式。
0：问答模式
1：点头确认模式
2：朗读模式
若未使用意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值
     */
    public void setIntentionVerifyType(String IntentionVerifyType) {
        this.IntentionVerifyType = IntentionVerifyType;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetDetectInfoEnhancedResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDetectInfoEnhancedResponse(GetDetectInfoEnhancedResponse source) {
        if (source.Text != null) {
            this.Text = new DetectInfoText(source.Text);
        }
        if (source.IdCardData != null) {
            this.IdCardData = new DetectInfoIdCardData(source.IdCardData);
        }
        if (source.BestFrame != null) {
            this.BestFrame = new DetectInfoBestFrame(source.BestFrame);
        }
        if (source.VideoData != null) {
            this.VideoData = new DetectInfoVideoData(source.VideoData);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
        if (source.IntentionVerifyData != null) {
            this.IntentionVerifyData = new IntentionVerifyData(source.IntentionVerifyData);
        }
        if (source.IntentionQuestionResult != null) {
            this.IntentionQuestionResult = new IntentionQuestionResult(source.IntentionQuestionResult);
        }
        if (source.IntentionActionResult != null) {
            this.IntentionActionResult = new IntentionActionResult(source.IntentionActionResult);
        }
        if (source.EncryptedBody != null) {
            this.EncryptedBody = new String(source.EncryptedBody);
        }
        if (source.IsVerifyIntention != null) {
            this.IsVerifyIntention = new Boolean(source.IsVerifyIntention);
        }
        if (source.IntentionVerifyType != null) {
            this.IntentionVerifyType = new String(source.IntentionVerifyType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Text.", this.Text);
        this.setParamObj(map, prefix + "IdCardData.", this.IdCardData);
        this.setParamObj(map, prefix + "BestFrame.", this.BestFrame);
        this.setParamObj(map, prefix + "VideoData.", this.VideoData);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);
        this.setParamObj(map, prefix + "IntentionVerifyData.", this.IntentionVerifyData);
        this.setParamObj(map, prefix + "IntentionQuestionResult.", this.IntentionQuestionResult);
        this.setParamObj(map, prefix + "IntentionActionResult.", this.IntentionActionResult);
        this.setParamSimple(map, prefix + "EncryptedBody", this.EncryptedBody);
        this.setParamSimple(map, prefix + "IsVerifyIntention", this.IsVerifyIntention);
        this.setParamSimple(map, prefix + "IntentionVerifyType", this.IntentionVerifyType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

