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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyzeDenseLandmarksRequest extends AbstractModel {

    /**
    * 检测模式。
- 取值范围：0 为检测所有出现的人脸， 1 为检测面积最大的人脸。 
- 默认为 0。 
- 最多返回 5 张人脸的五官定位（人脸关键点）具体信息。
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 图片 base64 数据。
- base64 编码后大小不可超过5M。
- jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。  
- 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 图片的 Url 。
- 对应图片 base64 编码后大小不可超过5M。  
- jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
- Url、Image必须提供一个，如果都提供，只使用 Url。  
- 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。  
- 非腾讯云存储的Url速度和稳定性可能受一定影响。  
- 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 人脸识别服务所用的算法模型版本。本接口仅支持 “3.0“ 输入。
    */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
    * 是否开启图片旋转识别支持。
- 取值范围：0为不开启，1为开启。
- 默认为0。
- 本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。
- 若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。
    */
    @SerializedName("NeedRotateDetection")
    @Expose
    private Long NeedRotateDetection;

    /**
     * Get 检测模式。
- 取值范围：0 为检测所有出现的人脸， 1 为检测面积最大的人脸。 
- 默认为 0。 
- 最多返回 5 张人脸的五官定位（人脸关键点）具体信息。 
     * @return Mode 检测模式。
- 取值范围：0 为检测所有出现的人脸， 1 为检测面积最大的人脸。 
- 默认为 0。 
- 最多返回 5 张人脸的五官定位（人脸关键点）具体信息。
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 检测模式。
- 取值范围：0 为检测所有出现的人脸， 1 为检测面积最大的人脸。 
- 默认为 0。 
- 最多返回 5 张人脸的五官定位（人脸关键点）具体信息。
     * @param Mode 检测模式。
- 取值范围：0 为检测所有出现的人脸， 1 为检测面积最大的人脸。 
- 默认为 0。 
- 最多返回 5 张人脸的五官定位（人脸关键点）具体信息。
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 图片 base64 数据。
- base64 编码后大小不可超过5M。
- jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。  
- 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
     * @return Image 图片 base64 数据。
- base64 编码后大小不可超过5M。
- jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。  
- 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 图片 base64 数据。
- base64 编码后大小不可超过5M。
- jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。  
- 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * @param Image 图片 base64 数据。
- base64 编码后大小不可超过5M。
- jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。  
- 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 图片的 Url 。
- 对应图片 base64 编码后大小不可超过5M。  
- jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
- Url、Image必须提供一个，如果都提供，只使用 Url。  
- 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。  
- 非腾讯云存储的Url速度和稳定性可能受一定影响。  
- 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
     * @return Url 图片的 Url 。
- 对应图片 base64 编码后大小不可超过5M。  
- jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
- Url、Image必须提供一个，如果都提供，只使用 Url。  
- 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。  
- 非腾讯云存储的Url速度和稳定性可能受一定影响。  
- 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 图片的 Url 。
- 对应图片 base64 编码后大小不可超过5M。  
- jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
- Url、Image必须提供一个，如果都提供，只使用 Url。  
- 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。  
- 非腾讯云存储的Url速度和稳定性可能受一定影响。  
- 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * @param Url 图片的 Url 。
- 对应图片 base64 编码后大小不可超过5M。  
- jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
- Url、Image必须提供一个，如果都提供，只使用 Url。  
- 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。  
- 非腾讯云存储的Url速度和稳定性可能受一定影响。  
- 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 人脸识别服务所用的算法模型版本。本接口仅支持 “3.0“ 输入。 
     * @return FaceModelVersion 人脸识别服务所用的算法模型版本。本接口仅支持 “3.0“ 输入。
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set 人脸识别服务所用的算法模型版本。本接口仅支持 “3.0“ 输入。
     * @param FaceModelVersion 人脸识别服务所用的算法模型版本。本接口仅支持 “3.0“ 输入。
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

    /**
     * Get 是否开启图片旋转识别支持。
- 取值范围：0为不开启，1为开启。
- 默认为0。
- 本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。
- 若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。 
     * @return NeedRotateDetection 是否开启图片旋转识别支持。
- 取值范围：0为不开启，1为开启。
- 默认为0。
- 本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。
- 若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。
     */
    public Long getNeedRotateDetection() {
        return this.NeedRotateDetection;
    }

    /**
     * Set 是否开启图片旋转识别支持。
- 取值范围：0为不开启，1为开启。
- 默认为0。
- 本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。
- 若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。
     * @param NeedRotateDetection 是否开启图片旋转识别支持。
- 取值范围：0为不开启，1为开启。
- 默认为0。
- 本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。
- 若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。
     */
    public void setNeedRotateDetection(Long NeedRotateDetection) {
        this.NeedRotateDetection = NeedRotateDetection;
    }

    public AnalyzeDenseLandmarksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalyzeDenseLandmarksRequest(AnalyzeDenseLandmarksRequest source) {
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.FaceModelVersion != null) {
            this.FaceModelVersion = new String(source.FaceModelVersion);
        }
        if (source.NeedRotateDetection != null) {
            this.NeedRotateDetection = new Long(source.NeedRotateDetection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "NeedRotateDetection", this.NeedRotateDetection);

    }
}

