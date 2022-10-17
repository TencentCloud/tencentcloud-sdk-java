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

public class DetectReflectLivenessAndCompareResponse extends AbstractModel{

    /**
    * 验证通过后的视频最佳截图资源临时地址，jpg格式，资源和链接有效期2小时，务必在有效期内下载。
    */
    @SerializedName("BestFrameUrl")
    @Expose
    private String BestFrameUrl;

    /**
    * 验证通过后的视频最佳截图资源MD5（32位，用于校验BestFrame的一致性）。
    */
    @SerializedName("BestFrameMd5")
    @Expose
    private String BestFrameMd5;

    /**
    * 业务错误码，成功情况返回Success，错误情况请参考下方错误码 列表中FailedOperation部分。
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
    * 相似度，取值范围 [0.00, 100.00]。推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）。
    */
    @SerializedName("Sim")
    @Expose
    private Float Sim;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 验证通过后的视频最佳截图资源临时地址，jpg格式，资源和链接有效期2小时，务必在有效期内下载。 
     * @return BestFrameUrl 验证通过后的视频最佳截图资源临时地址，jpg格式，资源和链接有效期2小时，务必在有效期内下载。
     */
    public String getBestFrameUrl() {
        return this.BestFrameUrl;
    }

    /**
     * Set 验证通过后的视频最佳截图资源临时地址，jpg格式，资源和链接有效期2小时，务必在有效期内下载。
     * @param BestFrameUrl 验证通过后的视频最佳截图资源临时地址，jpg格式，资源和链接有效期2小时，务必在有效期内下载。
     */
    public void setBestFrameUrl(String BestFrameUrl) {
        this.BestFrameUrl = BestFrameUrl;
    }

    /**
     * Get 验证通过后的视频最佳截图资源MD5（32位，用于校验BestFrame的一致性）。 
     * @return BestFrameMd5 验证通过后的视频最佳截图资源MD5（32位，用于校验BestFrame的一致性）。
     */
    public String getBestFrameMd5() {
        return this.BestFrameMd5;
    }

    /**
     * Set 验证通过后的视频最佳截图资源MD5（32位，用于校验BestFrame的一致性）。
     * @param BestFrameMd5 验证通过后的视频最佳截图资源MD5（32位，用于校验BestFrame的一致性）。
     */
    public void setBestFrameMd5(String BestFrameMd5) {
        this.BestFrameMd5 = BestFrameMd5;
    }

    /**
     * Get 业务错误码，成功情况返回Success，错误情况请参考下方错误码 列表中FailedOperation部分。 
     * @return Result 业务错误码，成功情况返回Success，错误情况请参考下方错误码 列表中FailedOperation部分。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 业务错误码，成功情况返回Success，错误情况请参考下方错误码 列表中FailedOperation部分。
     * @param Result 业务错误码，成功情况返回Success，错误情况请参考下方错误码 列表中FailedOperation部分。
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
     * Get 相似度，取值范围 [0.00, 100.00]。推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）。 
     * @return Sim 相似度，取值范围 [0.00, 100.00]。推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）。
     */
    public Float getSim() {
        return this.Sim;
    }

    /**
     * Set 相似度，取值范围 [0.00, 100.00]。推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）。
     * @param Sim 相似度，取值范围 [0.00, 100.00]。推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）。
     */
    public void setSim(Float Sim) {
        this.Sim = Sim;
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

    public DetectReflectLivenessAndCompareResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectReflectLivenessAndCompareResponse(DetectReflectLivenessAndCompareResponse source) {
        if (source.BestFrameUrl != null) {
            this.BestFrameUrl = new String(source.BestFrameUrl);
        }
        if (source.BestFrameMd5 != null) {
            this.BestFrameMd5 = new String(source.BestFrameMd5);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Sim != null) {
            this.Sim = new Float(source.Sim);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BestFrameUrl", this.BestFrameUrl);
        this.setParamSimple(map, prefix + "BestFrameMd5", this.BestFrameMd5);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Sim", this.Sim);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

