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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LivenessCompareRequest extends AbstractModel {

    /**
    * <p>活体检测类型。</p><ul><li>取值：LIP/ACTION/SILENT。</li><li>LIP为数字模式，ACTION为动作模式，SILENT为静默模式，三种模式选择一种传入。</li></ul>
    */
    @SerializedName("LivenessType")
    @Expose
    private String LivenessType;

    /**
    * <p>用于人脸比对的照片的Base64值。</p><ul><li>Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li><li>图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageBase64。</li></ul>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>用于人脸比对照片的URL地址。</p><ul><li>图片下载后经Base64编码后的数据大小不超过3M，仅支持jpg、png格式。</li><li>图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageBase64。</li><li>图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。</li><li>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</li></ul>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>验证数据。</p><ul><li>数字模式传参：传数字验证码，验证码需先调用<a href="https://cloud.tencent.com/document/product/1007/31821">获取数字验证码接口</a>得到；</li><li>动作模式传参：传动作顺序，动作顺序需先调用<a href="https://cloud.tencent.com/document/product/1007/31822">获取动作顺序接口</a>得到；</li><li>静默模式传参：空。</li></ul>
    */
    @SerializedName("ValidateData")
    @Expose
    private String ValidateData;

    /**
    * <p>额外配置，传入JSON字符串。</p><ul><li>格式如下：<br>{<br>&quot;BestFrameNum&quot;: 2  //需要返回多张最佳截图，取值范围2-10<br>}</li></ul>
    */
    @SerializedName("Optional")
    @Expose
    private String Optional;

    /**
    * <p>用于活体检测的视频，视频的Base64值。</p><ul><li>Base64编码后的大小不超过8M，支持mp4、avi、flv格式。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li><li>视频的 VideoUrl、VideoBase64 必须提供一个，如果都提供，只使用 VideoBase64。</li></ul>
    */
    @SerializedName("VideoBase64")
    @Expose
    private String VideoBase64;

    /**
    * <p>用于活体检测的视频Url 地址。</p><ul><li>视频下载后经Base64编码后不超过 8M，视频下载耗时不超过4S，支持mp4、avi、flv格式。</li><li>视频的 VideoUrl、VideoBase64 必须提供一个，如果都提供，只使用 VideoBase64。</li><li>建议视频存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议视频存储于腾讯云。</li><li>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</li></ul>
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
     * Get <p>活体检测类型。</p><ul><li>取值：LIP/ACTION/SILENT。</li><li>LIP为数字模式，ACTION为动作模式，SILENT为静默模式，三种模式选择一种传入。</li></ul> 
     * @return LivenessType <p>活体检测类型。</p><ul><li>取值：LIP/ACTION/SILENT。</li><li>LIP为数字模式，ACTION为动作模式，SILENT为静默模式，三种模式选择一种传入。</li></ul>
     */
    public String getLivenessType() {
        return this.LivenessType;
    }

    /**
     * Set <p>活体检测类型。</p><ul><li>取值：LIP/ACTION/SILENT。</li><li>LIP为数字模式，ACTION为动作模式，SILENT为静默模式，三种模式选择一种传入。</li></ul>
     * @param LivenessType <p>活体检测类型。</p><ul><li>取值：LIP/ACTION/SILENT。</li><li>LIP为数字模式，ACTION为动作模式，SILENT为静默模式，三种模式选择一种传入。</li></ul>
     */
    public void setLivenessType(String LivenessType) {
        this.LivenessType = LivenessType;
    }

    /**
     * Get <p>用于人脸比对的照片的Base64值。</p><ul><li>Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li><li>图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageBase64。</li></ul> 
     * @return ImageBase64 <p>用于人脸比对的照片的Base64值。</p><ul><li>Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li><li>图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageBase64。</li></ul>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>用于人脸比对的照片的Base64值。</p><ul><li>Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li><li>图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageBase64。</li></ul>
     * @param ImageBase64 <p>用于人脸比对的照片的Base64值。</p><ul><li>Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li><li>图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageBase64。</li></ul>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>用于人脸比对照片的URL地址。</p><ul><li>图片下载后经Base64编码后的数据大小不超过3M，仅支持jpg、png格式。</li><li>图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageBase64。</li><li>图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。</li><li>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</li></ul> 
     * @return ImageUrl <p>用于人脸比对照片的URL地址。</p><ul><li>图片下载后经Base64编码后的数据大小不超过3M，仅支持jpg、png格式。</li><li>图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageBase64。</li><li>图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。</li><li>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</li></ul>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>用于人脸比对照片的URL地址。</p><ul><li>图片下载后经Base64编码后的数据大小不超过3M，仅支持jpg、png格式。</li><li>图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageBase64。</li><li>图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。</li><li>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</li></ul>
     * @param ImageUrl <p>用于人脸比对照片的URL地址。</p><ul><li>图片下载后经Base64编码后的数据大小不超过3M，仅支持jpg、png格式。</li><li>图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageBase64。</li><li>图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。</li><li>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</li></ul>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>验证数据。</p><ul><li>数字模式传参：传数字验证码，验证码需先调用<a href="https://cloud.tencent.com/document/product/1007/31821">获取数字验证码接口</a>得到；</li><li>动作模式传参：传动作顺序，动作顺序需先调用<a href="https://cloud.tencent.com/document/product/1007/31822">获取动作顺序接口</a>得到；</li><li>静默模式传参：空。</li></ul> 
     * @return ValidateData <p>验证数据。</p><ul><li>数字模式传参：传数字验证码，验证码需先调用<a href="https://cloud.tencent.com/document/product/1007/31821">获取数字验证码接口</a>得到；</li><li>动作模式传参：传动作顺序，动作顺序需先调用<a href="https://cloud.tencent.com/document/product/1007/31822">获取动作顺序接口</a>得到；</li><li>静默模式传参：空。</li></ul>
     */
    public String getValidateData() {
        return this.ValidateData;
    }

    /**
     * Set <p>验证数据。</p><ul><li>数字模式传参：传数字验证码，验证码需先调用<a href="https://cloud.tencent.com/document/product/1007/31821">获取数字验证码接口</a>得到；</li><li>动作模式传参：传动作顺序，动作顺序需先调用<a href="https://cloud.tencent.com/document/product/1007/31822">获取动作顺序接口</a>得到；</li><li>静默模式传参：空。</li></ul>
     * @param ValidateData <p>验证数据。</p><ul><li>数字模式传参：传数字验证码，验证码需先调用<a href="https://cloud.tencent.com/document/product/1007/31821">获取数字验证码接口</a>得到；</li><li>动作模式传参：传动作顺序，动作顺序需先调用<a href="https://cloud.tencent.com/document/product/1007/31822">获取动作顺序接口</a>得到；</li><li>静默模式传参：空。</li></ul>
     */
    public void setValidateData(String ValidateData) {
        this.ValidateData = ValidateData;
    }

    /**
     * Get <p>额外配置，传入JSON字符串。</p><ul><li>格式如下：<br>{<br>&quot;BestFrameNum&quot;: 2  //需要返回多张最佳截图，取值范围2-10<br>}</li></ul> 
     * @return Optional <p>额外配置，传入JSON字符串。</p><ul><li>格式如下：<br>{<br>&quot;BestFrameNum&quot;: 2  //需要返回多张最佳截图，取值范围2-10<br>}</li></ul>
     */
    public String getOptional() {
        return this.Optional;
    }

    /**
     * Set <p>额外配置，传入JSON字符串。</p><ul><li>格式如下：<br>{<br>&quot;BestFrameNum&quot;: 2  //需要返回多张最佳截图，取值范围2-10<br>}</li></ul>
     * @param Optional <p>额外配置，传入JSON字符串。</p><ul><li>格式如下：<br>{<br>&quot;BestFrameNum&quot;: 2  //需要返回多张最佳截图，取值范围2-10<br>}</li></ul>
     */
    public void setOptional(String Optional) {
        this.Optional = Optional;
    }

    /**
     * Get <p>用于活体检测的视频，视频的Base64值。</p><ul><li>Base64编码后的大小不超过8M，支持mp4、avi、flv格式。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li><li>视频的 VideoUrl、VideoBase64 必须提供一个，如果都提供，只使用 VideoBase64。</li></ul> 
     * @return VideoBase64 <p>用于活体检测的视频，视频的Base64值。</p><ul><li>Base64编码后的大小不超过8M，支持mp4、avi、flv格式。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li><li>视频的 VideoUrl、VideoBase64 必须提供一个，如果都提供，只使用 VideoBase64。</li></ul>
     */
    public String getVideoBase64() {
        return this.VideoBase64;
    }

    /**
     * Set <p>用于活体检测的视频，视频的Base64值。</p><ul><li>Base64编码后的大小不超过8M，支持mp4、avi、flv格式。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li><li>视频的 VideoUrl、VideoBase64 必须提供一个，如果都提供，只使用 VideoBase64。</li></ul>
     * @param VideoBase64 <p>用于活体检测的视频，视频的Base64值。</p><ul><li>Base64编码后的大小不超过8M，支持mp4、avi、flv格式。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li><li>视频的 VideoUrl、VideoBase64 必须提供一个，如果都提供，只使用 VideoBase64。</li></ul>
     */
    public void setVideoBase64(String VideoBase64) {
        this.VideoBase64 = VideoBase64;
    }

    /**
     * Get <p>用于活体检测的视频Url 地址。</p><ul><li>视频下载后经Base64编码后不超过 8M，视频下载耗时不超过4S，支持mp4、avi、flv格式。</li><li>视频的 VideoUrl、VideoBase64 必须提供一个，如果都提供，只使用 VideoBase64。</li><li>建议视频存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议视频存储于腾讯云。</li><li>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</li></ul> 
     * @return VideoUrl <p>用于活体检测的视频Url 地址。</p><ul><li>视频下载后经Base64编码后不超过 8M，视频下载耗时不超过4S，支持mp4、avi、flv格式。</li><li>视频的 VideoUrl、VideoBase64 必须提供一个，如果都提供，只使用 VideoBase64。</li><li>建议视频存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议视频存储于腾讯云。</li><li>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</li></ul>
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set <p>用于活体检测的视频Url 地址。</p><ul><li>视频下载后经Base64编码后不超过 8M，视频下载耗时不超过4S，支持mp4、avi、flv格式。</li><li>视频的 VideoUrl、VideoBase64 必须提供一个，如果都提供，只使用 VideoBase64。</li><li>建议视频存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议视频存储于腾讯云。</li><li>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</li></ul>
     * @param VideoUrl <p>用于活体检测的视频Url 地址。</p><ul><li>视频下载后经Base64编码后不超过 8M，视频下载耗时不超过4S，支持mp4、avi、flv格式。</li><li>视频的 VideoUrl、VideoBase64 必须提供一个，如果都提供，只使用 VideoBase64。</li><li>建议视频存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议视频存储于腾讯云。</li><li>非腾讯云存储的 Url 速度和稳定性可能受一定影响。</li></ul>
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    public LivenessCompareRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LivenessCompareRequest(LivenessCompareRequest source) {
        if (source.LivenessType != null) {
            this.LivenessType = new String(source.LivenessType);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ValidateData != null) {
            this.ValidateData = new String(source.ValidateData);
        }
        if (source.Optional != null) {
            this.Optional = new String(source.Optional);
        }
        if (source.VideoBase64 != null) {
            this.VideoBase64 = new String(source.VideoBase64);
        }
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LivenessType", this.LivenessType);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ValidateData", this.ValidateData);
        this.setParamSimple(map, prefix + "Optional", this.Optional);
        this.setParamSimple(map, prefix + "VideoBase64", this.VideoBase64);
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);

    }
}

