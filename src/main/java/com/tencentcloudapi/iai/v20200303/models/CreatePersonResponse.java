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

public class CreatePersonResponse extends AbstractModel {

    /**
    * <p>人脸图片唯一标识。</p>
    */
    @SerializedName("FaceId")
    @Expose
    private String FaceId;

    /**
    * <p>检测出的人脸框的位置。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FaceRect")
    @Expose
    private FaceRect FaceRect;

    /**
    * <p>疑似同一人的PersonId。 </p><ul><li>当 UniquePersonControl 参数不为0且人员库中有疑似的同一人，此参数才有意义。</li></ul>
    */
    @SerializedName("SimilarPersonId")
    @Expose
    private String SimilarPersonId;

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
     * Get <p>人脸图片唯一标识。</p> 
     * @return FaceId <p>人脸图片唯一标识。</p>
     */
    public String getFaceId() {
        return this.FaceId;
    }

    /**
     * Set <p>人脸图片唯一标识。</p>
     * @param FaceId <p>人脸图片唯一标识。</p>
     */
    public void setFaceId(String FaceId) {
        this.FaceId = FaceId;
    }

    /**
     * Get <p>检测出的人脸框的位置。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FaceRect <p>检测出的人脸框的位置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FaceRect getFaceRect() {
        return this.FaceRect;
    }

    /**
     * Set <p>检测出的人脸框的位置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FaceRect <p>检测出的人脸框的位置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaceRect(FaceRect FaceRect) {
        this.FaceRect = FaceRect;
    }

    /**
     * Get <p>疑似同一人的PersonId。 </p><ul><li>当 UniquePersonControl 参数不为0且人员库中有疑似的同一人，此参数才有意义。</li></ul> 
     * @return SimilarPersonId <p>疑似同一人的PersonId。 </p><ul><li>当 UniquePersonControl 参数不为0且人员库中有疑似的同一人，此参数才有意义。</li></ul>
     */
    public String getSimilarPersonId() {
        return this.SimilarPersonId;
    }

    /**
     * Set <p>疑似同一人的PersonId。 </p><ul><li>当 UniquePersonControl 参数不为0且人员库中有疑似的同一人，此参数才有意义。</li></ul>
     * @param SimilarPersonId <p>疑似同一人的PersonId。 </p><ul><li>当 UniquePersonControl 参数不为0且人员库中有疑似的同一人，此参数才有意义。</li></ul>
     */
    public void setSimilarPersonId(String SimilarPersonId) {
        this.SimilarPersonId = SimilarPersonId;
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

    public CreatePersonResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePersonResponse(CreatePersonResponse source) {
        if (source.FaceId != null) {
            this.FaceId = new String(source.FaceId);
        }
        if (source.FaceRect != null) {
            this.FaceRect = new FaceRect(source.FaceRect);
        }
        if (source.SimilarPersonId != null) {
            this.SimilarPersonId = new String(source.SimilarPersonId);
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
        this.setParamSimple(map, prefix + "FaceId", this.FaceId);
        this.setParamObj(map, prefix + "FaceRect.", this.FaceRect);
        this.setParamSimple(map, prefix + "SimilarPersonId", this.SimilarPersonId);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

