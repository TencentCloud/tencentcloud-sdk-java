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

public class DetectFaceResponse extends AbstractModel{

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
    * 人脸信息列表。包含人脸坐标信息、属性信息（若需要）、质量分信息（若需要）。
    */
    @SerializedName("FaceInfos")
    @Expose
    private FaceInfo [] FaceInfos;

    /**
    * 人脸识别服务所用的算法模型版本。

目前入参支持 “2.0”和“3.0“ 两个输入。

2020年4月2日开始，默认为“3.0”，之前使用过本接口的账号若未填写本参数默认为“2.0”。

2020年11月26日后开通服务的账号仅支持输入“3.0”。

不同算法模型版本对应的人脸识别算法不同，新版本的整体效果会优于旧版本，建议使用“3.0”版本。
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
     * Get 人脸信息列表。包含人脸坐标信息、属性信息（若需要）、质量分信息（若需要）。 
     * @return FaceInfos 人脸信息列表。包含人脸坐标信息、属性信息（若需要）、质量分信息（若需要）。
     */
    public FaceInfo [] getFaceInfos() {
        return this.FaceInfos;
    }

    /**
     * Set 人脸信息列表。包含人脸坐标信息、属性信息（若需要）、质量分信息（若需要）。
     * @param FaceInfos 人脸信息列表。包含人脸坐标信息、属性信息（若需要）、质量分信息（若需要）。
     */
    public void setFaceInfos(FaceInfo [] FaceInfos) {
        this.FaceInfos = FaceInfos;
    }

    /**
     * Get 人脸识别服务所用的算法模型版本。

目前入参支持 “2.0”和“3.0“ 两个输入。

2020年4月2日开始，默认为“3.0”，之前使用过本接口的账号若未填写本参数默认为“2.0”。

2020年11月26日后开通服务的账号仅支持输入“3.0”。

不同算法模型版本对应的人脸识别算法不同，新版本的整体效果会优于旧版本，建议使用“3.0”版本。 
     * @return FaceModelVersion 人脸识别服务所用的算法模型版本。

目前入参支持 “2.0”和“3.0“ 两个输入。

2020年4月2日开始，默认为“3.0”，之前使用过本接口的账号若未填写本参数默认为“2.0”。

2020年11月26日后开通服务的账号仅支持输入“3.0”。

不同算法模型版本对应的人脸识别算法不同，新版本的整体效果会优于旧版本，建议使用“3.0”版本。
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set 人脸识别服务所用的算法模型版本。

目前入参支持 “2.0”和“3.0“ 两个输入。

2020年4月2日开始，默认为“3.0”，之前使用过本接口的账号若未填写本参数默认为“2.0”。

2020年11月26日后开通服务的账号仅支持输入“3.0”。

不同算法模型版本对应的人脸识别算法不同，新版本的整体效果会优于旧版本，建议使用“3.0”版本。
     * @param FaceModelVersion 人脸识别服务所用的算法模型版本。

目前入参支持 “2.0”和“3.0“ 两个输入。

2020年4月2日开始，默认为“3.0”，之前使用过本接口的账号若未填写本参数默认为“2.0”。

2020年11月26日后开通服务的账号仅支持输入“3.0”。

不同算法模型版本对应的人脸识别算法不同，新版本的整体效果会优于旧版本，建议使用“3.0”版本。
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

