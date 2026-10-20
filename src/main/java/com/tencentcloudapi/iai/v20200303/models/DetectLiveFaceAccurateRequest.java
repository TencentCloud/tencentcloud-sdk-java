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

public class DetectLiveFaceAccurateRequest extends AbstractModel {

    /**
    * <p>图片 base64 数据。</p><ul><li>base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。 </li><li>图片的宽高比请接近 3:4，手机拍摄比例最佳。</li><li>人脸尺寸大于100X100像素。</li><li>图片格式支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>图片的 Url 。</p><ul><li>对应图片 base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。</li><li>Url、Image必须提供一个，如果都提供，只使用 Url。 </li><li>图片的宽高比请接近 3:4，手机拍摄比例最佳。</li><li>人脸尺寸大于100X100像素。</li><li>图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的Url速度和稳定性可能受一定影响。</li><li>图片格式支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>人脸识别服务所用的算法模型版本。目前入参支持“3.0“。</p>
    */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
     * Get <p>图片 base64 数据。</p><ul><li>base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。 </li><li>图片的宽高比请接近 3:4，手机拍摄比例最佳。</li><li>人脸尺寸大于100X100像素。</li><li>图片格式支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul> 
     * @return Image <p>图片 base64 数据。</p><ul><li>base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。 </li><li>图片的宽高比请接近 3:4，手机拍摄比例最佳。</li><li>人脸尺寸大于100X100像素。</li><li>图片格式支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>图片 base64 数据。</p><ul><li>base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。 </li><li>图片的宽高比请接近 3:4，手机拍摄比例最佳。</li><li>人脸尺寸大于100X100像素。</li><li>图片格式支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
     * @param Image <p>图片 base64 数据。</p><ul><li>base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。 </li><li>图片的宽高比请接近 3:4，手机拍摄比例最佳。</li><li>人脸尺寸大于100X100像素。</li><li>图片格式支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>图片的 Url 。</p><ul><li>对应图片 base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。</li><li>Url、Image必须提供一个，如果都提供，只使用 Url。 </li><li>图片的宽高比请接近 3:4，手机拍摄比例最佳。</li><li>人脸尺寸大于100X100像素。</li><li>图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的Url速度和稳定性可能受一定影响。</li><li>图片格式支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul> 
     * @return Url <p>图片的 Url 。</p><ul><li>对应图片 base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。</li><li>Url、Image必须提供一个，如果都提供，只使用 Url。 </li><li>图片的宽高比请接近 3:4，手机拍摄比例最佳。</li><li>人脸尺寸大于100X100像素。</li><li>图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的Url速度和稳定性可能受一定影响。</li><li>图片格式支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>图片的 Url 。</p><ul><li>对应图片 base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。</li><li>Url、Image必须提供一个，如果都提供，只使用 Url。 </li><li>图片的宽高比请接近 3:4，手机拍摄比例最佳。</li><li>人脸尺寸大于100X100像素。</li><li>图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的Url速度和稳定性可能受一定影响。</li><li>图片格式支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
     * @param Url <p>图片的 Url 。</p><ul><li>对应图片 base64 编码后大小不可超过5M。</li><li>jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。</li><li>Url、Image必须提供一个，如果都提供，只使用 Url。 </li><li>图片的宽高比请接近 3:4，手机拍摄比例最佳。</li><li>人脸尺寸大于100X100像素。</li><li>图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的Url速度和稳定性可能受一定影响。</li><li>图片格式支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。</li></ul>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>人脸识别服务所用的算法模型版本。目前入参支持“3.0“。</p> 
     * @return FaceModelVersion <p>人脸识别服务所用的算法模型版本。目前入参支持“3.0“。</p>
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set <p>人脸识别服务所用的算法模型版本。目前入参支持“3.0“。</p>
     * @param FaceModelVersion <p>人脸识别服务所用的算法模型版本。目前入参支持“3.0“。</p>
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

    public DetectLiveFaceAccurateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectLiveFaceAccurateRequest(DetectLiveFaceAccurateRequest source) {
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.FaceModelVersion != null) {
            this.FaceModelVersion = new String(source.FaceModelVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);

    }
}

