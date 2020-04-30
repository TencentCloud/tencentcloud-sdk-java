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
package com.tencentcloudapi.fmu.v20191213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LipColorInfo extends AbstractModel{

    /**
    * 使用RGBA模型试唇色。
    */
    @SerializedName("RGBA")
    @Expose
    private RGBAInfo RGBA;

    /**
    * 使用已注册的 LUT 文件试唇色。  
ModelId 和 RGBA 两个参数只需提供一个，若都提供只使用 ModelId。
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 人脸框位置。若不输入则选择 Image 或 Url 中面积最大的人脸。  
您可以通过 [人脸检测与分析](https://cloud.tencent.com/document/api/867/32800)  接口获取人脸框位置信息。
    */
    @SerializedName("FaceRect")
    @Expose
    private FaceRect FaceRect;

    /**
    * 涂妆浓淡[0,100]。建议取值50。本参数仅控制ModelId对应的涂妆浓淡。
    */
    @SerializedName("ModelAlpha")
    @Expose
    private Long ModelAlpha;

    /**
     * Get 使用RGBA模型试唇色。 
     * @return RGBA 使用RGBA模型试唇色。
     */
    public RGBAInfo getRGBA() {
        return this.RGBA;
    }

    /**
     * Set 使用RGBA模型试唇色。
     * @param RGBA 使用RGBA模型试唇色。
     */
    public void setRGBA(RGBAInfo RGBA) {
        this.RGBA = RGBA;
    }

    /**
     * Get 使用已注册的 LUT 文件试唇色。  
ModelId 和 RGBA 两个参数只需提供一个，若都提供只使用 ModelId。 
     * @return ModelId 使用已注册的 LUT 文件试唇色。  
ModelId 和 RGBA 两个参数只需提供一个，若都提供只使用 ModelId。
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 使用已注册的 LUT 文件试唇色。  
ModelId 和 RGBA 两个参数只需提供一个，若都提供只使用 ModelId。
     * @param ModelId 使用已注册的 LUT 文件试唇色。  
ModelId 和 RGBA 两个参数只需提供一个，若都提供只使用 ModelId。
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 人脸框位置。若不输入则选择 Image 或 Url 中面积最大的人脸。  
您可以通过 [人脸检测与分析](https://cloud.tencent.com/document/api/867/32800)  接口获取人脸框位置信息。 
     * @return FaceRect 人脸框位置。若不输入则选择 Image 或 Url 中面积最大的人脸。  
您可以通过 [人脸检测与分析](https://cloud.tencent.com/document/api/867/32800)  接口获取人脸框位置信息。
     */
    public FaceRect getFaceRect() {
        return this.FaceRect;
    }

    /**
     * Set 人脸框位置。若不输入则选择 Image 或 Url 中面积最大的人脸。  
您可以通过 [人脸检测与分析](https://cloud.tencent.com/document/api/867/32800)  接口获取人脸框位置信息。
     * @param FaceRect 人脸框位置。若不输入则选择 Image 或 Url 中面积最大的人脸。  
您可以通过 [人脸检测与分析](https://cloud.tencent.com/document/api/867/32800)  接口获取人脸框位置信息。
     */
    public void setFaceRect(FaceRect FaceRect) {
        this.FaceRect = FaceRect;
    }

    /**
     * Get 涂妆浓淡[0,100]。建议取值50。本参数仅控制ModelId对应的涂妆浓淡。 
     * @return ModelAlpha 涂妆浓淡[0,100]。建议取值50。本参数仅控制ModelId对应的涂妆浓淡。
     */
    public Long getModelAlpha() {
        return this.ModelAlpha;
    }

    /**
     * Set 涂妆浓淡[0,100]。建议取值50。本参数仅控制ModelId对应的涂妆浓淡。
     * @param ModelAlpha 涂妆浓淡[0,100]。建议取值50。本参数仅控制ModelId对应的涂妆浓淡。
     */
    public void setModelAlpha(Long ModelAlpha) {
        this.ModelAlpha = ModelAlpha;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RGBA.", this.RGBA);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamObj(map, prefix + "FaceRect.", this.FaceRect);
        this.setParamSimple(map, prefix + "ModelAlpha", this.ModelAlpha);

    }
}

