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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectLiveFaceAccurateResponse extends AbstractModel {

    /**
    * <p>活体真实度打分。</p><ul><li>取值范围 [0,100]。</li><li>根据活体分数对应的阈值区间来判断是否为翻拍。</li><li>目前阈值可分为[5,10,40,70,90]，其中推荐阈值为40。</li><li>分数值越高越接近真人，翻拍风险越低。</li></ul>
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * <p>人脸识别所用的算法模型版本。</p>
    */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>活体真实度打分。</p><ul><li>取值范围 [0,100]。</li><li>根据活体分数对应的阈值区间来判断是否为翻拍。</li><li>目前阈值可分为[5,10,40,70,90]，其中推荐阈值为40。</li><li>分数值越高越接近真人，翻拍风险越低。</li></ul> 
     * @return Score <p>活体真实度打分。</p><ul><li>取值范围 [0,100]。</li><li>根据活体分数对应的阈值区间来判断是否为翻拍。</li><li>目前阈值可分为[5,10,40,70,90]，其中推荐阈值为40。</li><li>分数值越高越接近真人，翻拍风险越低。</li></ul>
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set <p>活体真实度打分。</p><ul><li>取值范围 [0,100]。</li><li>根据活体分数对应的阈值区间来判断是否为翻拍。</li><li>目前阈值可分为[5,10,40,70,90]，其中推荐阈值为40。</li><li>分数值越高越接近真人，翻拍风险越低。</li></ul>
     * @param Score <p>活体真实度打分。</p><ul><li>取值范围 [0,100]。</li><li>根据活体分数对应的阈值区间来判断是否为翻拍。</li><li>目前阈值可分为[5,10,40,70,90]，其中推荐阈值为40。</li><li>分数值越高越接近真人，翻拍风险越低。</li></ul>
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get <p>人脸识别所用的算法模型版本。</p> 
     * @return FaceModelVersion <p>人脸识别所用的算法模型版本。</p>
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set <p>人脸识别所用的算法模型版本。</p>
     * @param FaceModelVersion <p>人脸识别所用的算法模型版本。</p>
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
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

    public DetectLiveFaceAccurateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectLiveFaceAccurateResponse(DetectLiveFaceAccurateResponse source) {
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.FaceModelVersion != null) {
            this.FaceModelVersion = new String(source.FaceModelVersion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

