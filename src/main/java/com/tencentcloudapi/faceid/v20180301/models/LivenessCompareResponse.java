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

public class LivenessCompareResponse extends AbstractModel {

    /**
    * <p>验证通过后的视频最佳截图照片。</p><ul><li>照片为BASE64编码后的值，jpg格式。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BestFrameBase64")
    @Expose
    private String BestFrameBase64;

    /**
    * <p>相似度。- 取值范围 [0.00, 100.00]。- 推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为万分之一）。</p>
    */
    @SerializedName("Sim")
    @Expose
    private Float Sim;

    /**
    * <p>业务错误码。</p><ul><li>成功情况返回Success。</li><li>错误情况请参考下方错误码，列表中FailedOperation部分。</li></ul>
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * <p>业务结果描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>最佳截图列表。</p><ul><li>仅在配置了返回多张最佳截图时返回。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BestFrameList")
    @Expose
    private String [] BestFrameList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>验证通过后的视频最佳截图照片。</p><ul><li>照片为BASE64编码后的值，jpg格式。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BestFrameBase64 <p>验证通过后的视频最佳截图照片。</p><ul><li>照片为BASE64编码后的值，jpg格式。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBestFrameBase64() {
        return this.BestFrameBase64;
    }

    /**
     * Set <p>验证通过后的视频最佳截图照片。</p><ul><li>照片为BASE64编码后的值，jpg格式。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BestFrameBase64 <p>验证通过后的视频最佳截图照片。</p><ul><li>照片为BASE64编码后的值，jpg格式。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBestFrameBase64(String BestFrameBase64) {
        this.BestFrameBase64 = BestFrameBase64;
    }

    /**
     * Get <p>相似度。- 取值范围 [0.00, 100.00]。- 推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为万分之一）。</p> 
     * @return Sim <p>相似度。- 取值范围 [0.00, 100.00]。- 推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为万分之一）。</p>
     */
    public Float getSim() {
        return this.Sim;
    }

    /**
     * Set <p>相似度。- 取值范围 [0.00, 100.00]。- 推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为万分之一）。</p>
     * @param Sim <p>相似度。- 取值范围 [0.00, 100.00]。- 推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为万分之一）。</p>
     */
    public void setSim(Float Sim) {
        this.Sim = Sim;
    }

    /**
     * Get <p>业务错误码。</p><ul><li>成功情况返回Success。</li><li>错误情况请参考下方错误码，列表中FailedOperation部分。</li></ul> 
     * @return Result <p>业务错误码。</p><ul><li>成功情况返回Success。</li><li>错误情况请参考下方错误码，列表中FailedOperation部分。</li></ul>
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set <p>业务错误码。</p><ul><li>成功情况返回Success。</li><li>错误情况请参考下方错误码，列表中FailedOperation部分。</li></ul>
     * @param Result <p>业务错误码。</p><ul><li>成功情况返回Success。</li><li>错误情况请参考下方错误码，列表中FailedOperation部分。</li></ul>
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get <p>业务结果描述。</p> 
     * @return Description <p>业务结果描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>业务结果描述。</p>
     * @param Description <p>业务结果描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>最佳截图列表。</p><ul><li>仅在配置了返回多张最佳截图时返回。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BestFrameList <p>最佳截图列表。</p><ul><li>仅在配置了返回多张最佳截图时返回。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBestFrameList() {
        return this.BestFrameList;
    }

    /**
     * Set <p>最佳截图列表。</p><ul><li>仅在配置了返回多张最佳截图时返回。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BestFrameList <p>最佳截图列表。</p><ul><li>仅在配置了返回多张最佳截图时返回。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBestFrameList(String [] BestFrameList) {
        this.BestFrameList = BestFrameList;
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

    public LivenessCompareResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LivenessCompareResponse(LivenessCompareResponse source) {
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

