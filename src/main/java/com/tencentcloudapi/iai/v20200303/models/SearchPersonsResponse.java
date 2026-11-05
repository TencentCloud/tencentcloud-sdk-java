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

public class SearchPersonsResponse extends AbstractModel {

    /**
    * <p>识别结果。</p>
    */
    @SerializedName("Results")
    @Expose
    private Result [] Results;

    /**
    * <p>搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。</p>
    */
    @SerializedName("PersonNum")
    @Expose
    private Long PersonNum;

    /**
    * <p>人脸识别所用的算法模型版本。</p>
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get <p>识别结果。</p> 
     * @return Results <p>识别结果。</p>
     */
    public Result [] getResults() {
        return this.Results;
    }

    /**
     * Set <p>识别结果。</p>
     * @param Results <p>识别结果。</p>
     */
    public void setResults(Result [] Results) {
        this.Results = Results;
    }

    /**
     * Get <p>搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。</p> 
     * @return PersonNum <p>搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。</p>
     */
    public Long getPersonNum() {
        return this.PersonNum;
    }

    /**
     * Set <p>搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。</p>
     * @param PersonNum <p>搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。</p>
     */
    public void setPersonNum(Long PersonNum) {
        this.PersonNum = PersonNum;
    }

    /**
     * Get <p>人脸识别所用的算法模型版本。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FaceModelVersion <p>人脸识别所用的算法模型版本。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set <p>人脸识别所用的算法模型版本。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FaceModelVersion <p>人脸识别所用的算法模型版本。</p>
注意：此字段可能返回 null，表示取不到有效值。
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

    public SearchPersonsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchPersonsResponse(SearchPersonsResponse source) {
        if (source.Results != null) {
            this.Results = new Result[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new Result(source.Results[i]);
            }
        }
        if (source.PersonNum != null) {
            this.PersonNum = new Long(source.PersonNum);
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
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "PersonNum", this.PersonNum);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

