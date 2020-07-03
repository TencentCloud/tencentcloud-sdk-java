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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePersonResponse extends AbstractModel{

    /**
    * 人脸图片唯一标识。
    */
    @SerializedName("FaceId")
    @Expose
    private String FaceId;

    /**
    * 检测出的人脸框的位置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FaceRect")
    @Expose
    private FaceRect FaceRect;

    /**
    * 疑似同一人的PersonId。 
当 UniquePersonControl 参数不为0且人员库中有疑似的同一人，此参数才有意义。
    */
    @SerializedName("SimilarPersonId")
    @Expose
    private String SimilarPersonId;

    /**
    * 人脸识别所用的算法模型版本。
    */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 人脸图片唯一标识。 
     * @return FaceId 人脸图片唯一标识。
     */
    public String getFaceId() {
        return this.FaceId;
    }

    /**
     * Set 人脸图片唯一标识。
     * @param FaceId 人脸图片唯一标识。
     */
    public void setFaceId(String FaceId) {
        this.FaceId = FaceId;
    }

    /**
     * Get 检测出的人脸框的位置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FaceRect 检测出的人脸框的位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FaceRect getFaceRect() {
        return this.FaceRect;
    }

    /**
     * Set 检测出的人脸框的位置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FaceRect 检测出的人脸框的位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaceRect(FaceRect FaceRect) {
        this.FaceRect = FaceRect;
    }

    /**
     * Get 疑似同一人的PersonId。 
当 UniquePersonControl 参数不为0且人员库中有疑似的同一人，此参数才有意义。 
     * @return SimilarPersonId 疑似同一人的PersonId。 
当 UniquePersonControl 参数不为0且人员库中有疑似的同一人，此参数才有意义。
     */
    public String getSimilarPersonId() {
        return this.SimilarPersonId;
    }

    /**
     * Set 疑似同一人的PersonId。 
当 UniquePersonControl 参数不为0且人员库中有疑似的同一人，此参数才有意义。
     * @param SimilarPersonId 疑似同一人的PersonId。 
当 UniquePersonControl 参数不为0且人员库中有疑似的同一人，此参数才有意义。
     */
    public void setSimilarPersonId(String SimilarPersonId) {
        this.SimilarPersonId = SimilarPersonId;
    }

    /**
     * Get 人脸识别所用的算法模型版本。 
     * @return FaceModelVersion 人脸识别所用的算法模型版本。
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set 人脸识别所用的算法模型版本。
     * @param FaceModelVersion 人脸识别所用的算法模型版本。
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
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

