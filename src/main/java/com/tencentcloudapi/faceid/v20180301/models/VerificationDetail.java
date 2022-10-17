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

public class VerificationDetail extends AbstractModel{

    /**
    * 本次核验最终结果。0为核验通过，是同一人。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * 本次核验最终结果描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 本次核验活体结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LivenessErrorCode")
    @Expose
    private Long LivenessErrorCode;

    /**
    * 本次核验活体结果描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LivenessErrorMsg")
    @Expose
    private String LivenessErrorMsg;

    /**
    * 本次核验比对结果。0为视频流中采集的最佳人脸照片和上传的比对照片是同一人。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareErrorCode")
    @Expose
    private Long CompareErrorCode;

    /**
    * 本次核验比对结果描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareErrorMsg")
    @Expose
    private String CompareErrorMsg;

    /**
    * 本次核验时间戳(毫秒)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReqTimestamp")
    @Expose
    private Long ReqTimestamp;

    /**
    * 本次核验视频流中采集的最佳人脸照片和上传的比对照片的相似度， 范围[0.00, 100.00]，默认大于等于70时判断为同一人。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Similarity")
    @Expose
    private Float Similarity;

    /**
    * 本次核验的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Seq")
    @Expose
    private String Seq;

    /**
     * Get 本次核验最终结果。0为核验通过，是同一人。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCode 本次核验最终结果。0为核验通过，是同一人。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 本次核验最终结果。0为核验通过，是同一人。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCode 本次核验最终结果。0为核验通过，是同一人。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 本次核验最终结果描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMsg 本次核验最终结果描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 本次核验最终结果描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMsg 本次核验最终结果描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get 本次核验活体结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LivenessErrorCode 本次核验活体结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLivenessErrorCode() {
        return this.LivenessErrorCode;
    }

    /**
     * Set 本次核验活体结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param LivenessErrorCode 本次核验活体结果。0为成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivenessErrorCode(Long LivenessErrorCode) {
        this.LivenessErrorCode = LivenessErrorCode;
    }

    /**
     * Get 本次核验活体结果描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LivenessErrorMsg 本次核验活体结果描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLivenessErrorMsg() {
        return this.LivenessErrorMsg;
    }

    /**
     * Set 本次核验活体结果描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param LivenessErrorMsg 本次核验活体结果描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivenessErrorMsg(String LivenessErrorMsg) {
        this.LivenessErrorMsg = LivenessErrorMsg;
    }

    /**
     * Get 本次核验比对结果。0为视频流中采集的最佳人脸照片和上传的比对照片是同一人。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareErrorCode 本次核验比对结果。0为视频流中采集的最佳人脸照片和上传的比对照片是同一人。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompareErrorCode() {
        return this.CompareErrorCode;
    }

    /**
     * Set 本次核验比对结果。0为视频流中采集的最佳人脸照片和上传的比对照片是同一人。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareErrorCode 本次核验比对结果。0为视频流中采集的最佳人脸照片和上传的比对照片是同一人。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareErrorCode(Long CompareErrorCode) {
        this.CompareErrorCode = CompareErrorCode;
    }

    /**
     * Get 本次核验比对结果描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareErrorMsg 本次核验比对结果描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompareErrorMsg() {
        return this.CompareErrorMsg;
    }

    /**
     * Set 本次核验比对结果描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareErrorMsg 本次核验比对结果描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareErrorMsg(String CompareErrorMsg) {
        this.CompareErrorMsg = CompareErrorMsg;
    }

    /**
     * Get 本次核验时间戳(毫秒)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReqTimestamp 本次核验时间戳(毫秒)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReqTimestamp() {
        return this.ReqTimestamp;
    }

    /**
     * Set 本次核验时间戳(毫秒)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReqTimestamp 本次核验时间戳(毫秒)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReqTimestamp(Long ReqTimestamp) {
        this.ReqTimestamp = ReqTimestamp;
    }

    /**
     * Get 本次核验视频流中采集的最佳人脸照片和上传的比对照片的相似度， 范围[0.00, 100.00]，默认大于等于70时判断为同一人。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Similarity 本次核验视频流中采集的最佳人脸照片和上传的比对照片的相似度， 范围[0.00, 100.00]，默认大于等于70时判断为同一人。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getSimilarity() {
        return this.Similarity;
    }

    /**
     * Set 本次核验视频流中采集的最佳人脸照片和上传的比对照片的相似度， 范围[0.00, 100.00]，默认大于等于70时判断为同一人。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Similarity 本次核验视频流中采集的最佳人脸照片和上传的比对照片的相似度， 范围[0.00, 100.00]，默认大于等于70时判断为同一人。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSimilarity(Float Similarity) {
        this.Similarity = Similarity;
    }

    /**
     * Get 本次核验的唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Seq 本次核验的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSeq() {
        return this.Seq;
    }

    /**
     * Set 本次核验的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Seq 本次核验的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeq(String Seq) {
        this.Seq = Seq;
    }

    public VerificationDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerificationDetail(VerificationDetail source) {
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.LivenessErrorCode != null) {
            this.LivenessErrorCode = new Long(source.LivenessErrorCode);
        }
        if (source.LivenessErrorMsg != null) {
            this.LivenessErrorMsg = new String(source.LivenessErrorMsg);
        }
        if (source.CompareErrorCode != null) {
            this.CompareErrorCode = new Long(source.CompareErrorCode);
        }
        if (source.CompareErrorMsg != null) {
            this.CompareErrorMsg = new String(source.CompareErrorMsg);
        }
        if (source.ReqTimestamp != null) {
            this.ReqTimestamp = new Long(source.ReqTimestamp);
        }
        if (source.Similarity != null) {
            this.Similarity = new Float(source.Similarity);
        }
        if (source.Seq != null) {
            this.Seq = new String(source.Seq);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "LivenessErrorCode", this.LivenessErrorCode);
        this.setParamSimple(map, prefix + "LivenessErrorMsg", this.LivenessErrorMsg);
        this.setParamSimple(map, prefix + "CompareErrorCode", this.CompareErrorCode);
        this.setParamSimple(map, prefix + "CompareErrorMsg", this.CompareErrorMsg);
        this.setParamSimple(map, prefix + "ReqTimestamp", this.ReqTimestamp);
        this.setParamSimple(map, prefix + "Similarity", this.Similarity);
        this.setParamSimple(map, prefix + "Seq", this.Seq);

    }
}

