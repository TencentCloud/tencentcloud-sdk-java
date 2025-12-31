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

public class DetectFaceResponse extends AbstractModel {

    /**
    * ，单位为：像素（px）。
    */
    @SerializedName("ImageWidth")
    @Expose
    private Long ImageWidth;

    /**
    * ，单位为：像素（px）。
    */
    @SerializedName("ImageHeight")
    @Expose
    private Long ImageHeight;

    /**
    * 人脸信息列表。
- 包含人脸坐标信息、属性信息（若需要）、质量分信息（若需要）。
    */
    @SerializedName("FaceInfos")
    @Expose
    private FaceInfo [] FaceInfos;

    /**
    * 人脸识别所用的算法模型版本。
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
     * Get ，单位为：像素（px）。 
     * @return ImageWidth ，单位为：像素（px）。
     */
    public Long getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set ，单位为：像素（px）。
     * @param ImageWidth ，单位为：像素（px）。
     */
    public void setImageWidth(Long ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get ，单位为：像素（px）。 
     * @return ImageHeight ，单位为：像素（px）。
     */
    public Long getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set ，单位为：像素（px）。
     * @param ImageHeight ，单位为：像素（px）。
     */
    public void setImageHeight(Long ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Get 人脸信息列表。
- 包含人脸坐标信息、属性信息（若需要）、质量分信息（若需要）。 
     * @return FaceInfos 人脸信息列表。
- 包含人脸坐标信息、属性信息（若需要）、质量分信息（若需要）。
     */
    public FaceInfo [] getFaceInfos() {
        return this.FaceInfos;
    }

    /**
     * Set 人脸信息列表。
- 包含人脸坐标信息、属性信息（若需要）、质量分信息（若需要）。
     * @param FaceInfos 人脸信息列表。
- 包含人脸坐标信息、属性信息（若需要）、质量分信息（若需要）。
     */
    public void setFaceInfos(FaceInfo [] FaceInfos) {
        this.FaceInfos = FaceInfos;
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

    public DetectFaceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectFaceResponse(DetectFaceResponse source) {
        if (source.ImageWidth != null) {
            this.ImageWidth = new Long(source.ImageWidth);
        }
        if (source.ImageHeight != null) {
            this.ImageHeight = new Long(source.ImageHeight);
        }
        if (source.FaceInfos != null) {
            this.FaceInfos = new FaceInfo[source.FaceInfos.length];
            for (int i = 0; i < source.FaceInfos.length; i++) {
                this.FaceInfos[i] = new FaceInfo(source.FaceInfos[i]);
            }
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
        this.setParamSimple(map, prefix + "ImageWidth", this.ImageWidth);
        this.setParamSimple(map, prefix + "ImageHeight", this.ImageHeight);
        this.setParamArrayObj(map, prefix + "FaceInfos.", this.FaceInfos);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

