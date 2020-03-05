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
package com.tencentcloudapi.ft.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenderInfo extends AbstractModel{

    /**
    * 选择转换方向，0：男变女，1：女变男。
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * 人脸框位置。若不输入则选择 Image 或 Url 中面积最大的人脸。  
您可以通过 [人脸检测与分析](https://cloud.tencent.com/document/api/867/32800)  接口获取人脸框位置信息。
    */
    @SerializedName("FaceRect")
    @Expose
    private FaceRect FaceRect;

    /**
     * Get 选择转换方向，0：男变女，1：女变男。 
     * @return Gender 选择转换方向，0：男变女，1：女变男。
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 选择转换方向，0：男变女，1：女变男。
     * @param Gender 选择转换方向，0：男变女，1：女变男。
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamObj(map, prefix + "FaceRect.", this.FaceRect);

    }
}

