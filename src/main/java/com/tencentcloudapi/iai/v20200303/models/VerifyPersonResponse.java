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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyPersonResponse extends AbstractModel {

    /**
    * 给定的人脸照片与 PersonId 对应的相似度。若 PersonId 下有多张人脸（Face），会融合多张人脸信息进行验证。
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * 是否为同一人的判断。
    */
    @SerializedName("IsMatch")
    @Expose
    private Boolean IsMatch;

    /**
    * 人脸识别所用的算法模型版本，是该 Person 所在的人员库的算法模型版本。
- 在创建人员库时设置，详情可参考[算法模型版本](https://cloud.tencent.com/document/product/867/40042)
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
     * Get 给定的人脸照片与 PersonId 对应的相似度。若 PersonId 下有多张人脸（Face），会融合多张人脸信息进行验证。 
     * @return Score 给定的人脸照片与 PersonId 对应的相似度。若 PersonId 下有多张人脸（Face），会融合多张人脸信息进行验证。
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 给定的人脸照片与 PersonId 对应的相似度。若 PersonId 下有多张人脸（Face），会融合多张人脸信息进行验证。
     * @param Score 给定的人脸照片与 PersonId 对应的相似度。若 PersonId 下有多张人脸（Face），会融合多张人脸信息进行验证。
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get 是否为同一人的判断。 
     * @return IsMatch 是否为同一人的判断。
     */
    public Boolean getIsMatch() {
        return this.IsMatch;
    }

    /**
     * Set 是否为同一人的判断。
     * @param IsMatch 是否为同一人的判断。
     */
    public void setIsMatch(Boolean IsMatch) {
        this.IsMatch = IsMatch;
    }

    /**
     * Get 人脸识别所用的算法模型版本，是该 Person 所在的人员库的算法模型版本。
- 在创建人员库时设置，详情可参考[算法模型版本](https://cloud.tencent.com/document/product/867/40042) 
     * @return FaceModelVersion 人脸识别所用的算法模型版本，是该 Person 所在的人员库的算法模型版本。
- 在创建人员库时设置，详情可参考[算法模型版本](https://cloud.tencent.com/document/product/867/40042)
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set 人脸识别所用的算法模型版本，是该 Person 所在的人员库的算法模型版本。
- 在创建人员库时设置，详情可参考[算法模型版本](https://cloud.tencent.com/document/product/867/40042)
     * @param FaceModelVersion 人脸识别所用的算法模型版本，是该 Person 所在的人员库的算法模型版本。
- 在创建人员库时设置，详情可参考[算法模型版本](https://cloud.tencent.com/document/product/867/40042)
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

    public VerifyPersonResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyPersonResponse(VerifyPersonResponse source) {
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.IsMatch != null) {
            this.IsMatch = new Boolean(source.IsMatch);
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
        this.setParamSimple(map, prefix + "IsMatch", this.IsMatch);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

