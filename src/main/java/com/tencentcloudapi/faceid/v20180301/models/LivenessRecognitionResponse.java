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

public class LivenessRecognitionResponse extends AbstractModel{

    /**
    * 验证通过后的视频最佳截图照片，照片为BASE64编码后的值，jpg格式。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BestFrameBase64")
    @Expose
    private String BestFrameBase64;

    /**
    * 相似度，取值范围 [0.00, 100.00]。推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）
    */
    @SerializedName("Sim")
    @Expose
    private Float Sim;

    /**
    * 业务错误码，成功情况返回Success, 错误情况请参考下方错误码 列表中FailedOperation部分
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 业务结果描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 最佳截图列表，仅在配置了返回多张最佳截图时返回。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BestFrameList")
    @Expose
    private String [] BestFrameList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 验证通过后的视频最佳截图照片，照片为BASE64编码后的值，jpg格式。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BestFrameBase64 验证通过后的视频最佳截图照片，照片为BASE64编码后的值，jpg格式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBestFrameBase64() {
        return this.BestFrameBase64;
    }

    /**
     * Set 验证通过后的视频最佳截图照片，照片为BASE64编码后的值，jpg格式。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BestFrameBase64 验证通过后的视频最佳截图照片，照片为BASE64编码后的值，jpg格式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBestFrameBase64(String BestFrameBase64) {
        this.BestFrameBase64 = BestFrameBase64;
    }

    /**
     * Get 相似度，取值范围 [0.00, 100.00]。推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一） 
     * @return Sim 相似度，取值范围 [0.00, 100.00]。推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）
     */
    public Float getSim() {
        return this.Sim;
    }

    /**
     * Set 相似度，取值范围 [0.00, 100.00]。推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）
     * @param Sim 相似度，取值范围 [0.00, 100.00]。推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）
     */
    public void setSim(Float Sim) {
        this.Sim = Sim;
    }

    /**
     * Get 业务错误码，成功情况返回Success, 错误情况请参考下方错误码 列表中FailedOperation部分 
     * @return Result 业务错误码，成功情况返回Success, 错误情况请参考下方错误码 列表中FailedOperation部分
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 业务错误码，成功情况返回Success, 错误情况请参考下方错误码 列表中FailedOperation部分
     * @param Result 业务错误码，成功情况返回Success, 错误情况请参考下方错误码 列表中FailedOperation部分
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 业务结果描述。 
     * @return Description 业务结果描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 业务结果描述。
     * @param Description 业务结果描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 最佳截图列表，仅在配置了返回多张最佳截图时返回。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BestFrameList 最佳截图列表，仅在配置了返回多张最佳截图时返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBestFrameList() {
        return this.BestFrameList;
    }

    /**
     * Set 最佳截图列表，仅在配置了返回多张最佳截图时返回。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BestFrameList 最佳截图列表，仅在配置了返回多张最佳截图时返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBestFrameList(String [] BestFrameList) {
        this.BestFrameList = BestFrameList;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public LivenessRecognitionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LivenessRecognitionResponse(LivenessRecognitionResponse source) {
        if (source.BestFrameBase64 != null) {
            this.BestFrameBase64 = new String(source.BestFrameBase64);
        }
        if (source.Sim != null) {
            this.Sim = new Float(source.Sim);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.BestFrameList != null) {
            this.BestFrameList = new String[source.BestFrameList.length];
            for (int i = 0; i < source.BestFrameList.length; i++) {
                this.BestFrameList[i] = new String(source.BestFrameList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BestFrameBase64", this.BestFrameBase64);
        this.setParamSimple(map, prefix + "Sim", this.Sim);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "BestFrameList.", this.BestFrameList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

