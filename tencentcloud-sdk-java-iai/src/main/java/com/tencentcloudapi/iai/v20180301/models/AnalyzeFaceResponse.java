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

public class AnalyzeFaceResponse extends AbstractModel{

    /**
    * 请求的图片宽度。
    */
    @SerializedName("ImageWidth")
    @Expose
    private Long ImageWidth;

    /**
    * 请求的图片高度。
    */
    @SerializedName("ImageHeight")
    @Expose
    private Long ImageHeight;

    /**
    * 五官定位（人脸关键点）具体信息。
    */
    @SerializedName("FaceShapeSet")
    @Expose
    private FaceShape [] FaceShapeSet;

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
     * Get 请求的图片宽度。 
     * @return ImageWidth 请求的图片宽度。
     */
    public Long getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set 请求的图片宽度。
     * @param ImageWidth 请求的图片宽度。
     */
    public void setImageWidth(Long ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get 请求的图片高度。 
     * @return ImageHeight 请求的图片高度。
     */
    public Long getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set 请求的图片高度。
     * @param ImageHeight 请求的图片高度。
     */
    public void setImageHeight(Long ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Get 五官定位（人脸关键点）具体信息。 
     * @return FaceShapeSet 五官定位（人脸关键点）具体信息。
     */
    public FaceShape [] getFaceShapeSet() {
        return this.FaceShapeSet;
    }

    /**
     * Set 五官定位（人脸关键点）具体信息。
     * @param FaceShapeSet 五官定位（人脸关键点）具体信息。
     */
    public void setFaceShapeSet(FaceShape [] FaceShapeSet) {
        this.FaceShapeSet = FaceShapeSet;
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
        this.setParamSimple(map, prefix + "ImageWidth", this.ImageWidth);
        this.setParamSimple(map, prefix + "ImageHeight", this.ImageHeight);
        this.setParamArrayObj(map, prefix + "FaceShapeSet.", this.FaceShapeSet);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

