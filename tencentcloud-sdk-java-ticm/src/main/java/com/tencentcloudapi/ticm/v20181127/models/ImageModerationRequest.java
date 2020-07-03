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
package com.tencentcloudapi.ticm.v20181127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageModerationRequest extends AbstractModel{

    /**
    * 本次调用支持的识别场景，可选值如下：
1. PORN，即色情识别
2. TERRORISM，即暴恐识别
3. POLITICS，即政治敏感识别

支持多场景（Scenes）一起检测。例如，使用 Scenes=["PORN", "TERRORISM"]，即对一张图片同时进行色情识别和暴恐识别。
    */
    @SerializedName("Scenes")
    @Expose
    private String [] Scenes;

    /**
    * 图片URL地址。 
图片限制： 
 • 图片格式：PNG、JPG、JPEG。 
 • 图片大小：所下载图片经Base64编码后不超过4M。图片下载时间不超过3秒。 
 • 图片像素：大于50*50像素，否则影响识别效果； 
 • 长宽比：长边：短边<5； 
接口响应时间会受到图片下载时间的影响，建议使用更可靠的存储服务，推荐将图片存储在腾讯云COS。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 预留字段，后期用于展示更多识别信息。
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 透传字段，透传简单信息。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 图片经过base64编码的内容。最大不超过4M。与ImageUrl同时存在时优先使用ImageUrl字段。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
     * Get 本次调用支持的识别场景，可选值如下：
1. PORN，即色情识别
2. TERRORISM，即暴恐识别
3. POLITICS，即政治敏感识别

支持多场景（Scenes）一起检测。例如，使用 Scenes=["PORN", "TERRORISM"]，即对一张图片同时进行色情识别和暴恐识别。 
     * @return Scenes 本次调用支持的识别场景，可选值如下：
1. PORN，即色情识别
2. TERRORISM，即暴恐识别
3. POLITICS，即政治敏感识别

支持多场景（Scenes）一起检测。例如，使用 Scenes=["PORN", "TERRORISM"]，即对一张图片同时进行色情识别和暴恐识别。
     */
    public String [] getScenes() {
        return this.Scenes;
    }

    /**
     * Set 本次调用支持的识别场景，可选值如下：
1. PORN，即色情识别
2. TERRORISM，即暴恐识别
3. POLITICS，即政治敏感识别

支持多场景（Scenes）一起检测。例如，使用 Scenes=["PORN", "TERRORISM"]，即对一张图片同时进行色情识别和暴恐识别。
     * @param Scenes 本次调用支持的识别场景，可选值如下：
1. PORN，即色情识别
2. TERRORISM，即暴恐识别
3. POLITICS，即政治敏感识别

支持多场景（Scenes）一起检测。例如，使用 Scenes=["PORN", "TERRORISM"]，即对一张图片同时进行色情识别和暴恐识别。
     */
    public void setScenes(String [] Scenes) {
        this.Scenes = Scenes;
    }

    /**
     * Get 图片URL地址。 
图片限制： 
 • 图片格式：PNG、JPG、JPEG。 
 • 图片大小：所下载图片经Base64编码后不超过4M。图片下载时间不超过3秒。 
 • 图片像素：大于50*50像素，否则影响识别效果； 
 • 长宽比：长边：短边<5； 
接口响应时间会受到图片下载时间的影响，建议使用更可靠的存储服务，推荐将图片存储在腾讯云COS。 
     * @return ImageUrl 图片URL地址。 
图片限制： 
 • 图片格式：PNG、JPG、JPEG。 
 • 图片大小：所下载图片经Base64编码后不超过4M。图片下载时间不超过3秒。 
 • 图片像素：大于50*50像素，否则影响识别效果； 
 • 长宽比：长边：短边<5； 
接口响应时间会受到图片下载时间的影响，建议使用更可靠的存储服务，推荐将图片存储在腾讯云COS。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片URL地址。 
图片限制： 
 • 图片格式：PNG、JPG、JPEG。 
 • 图片大小：所下载图片经Base64编码后不超过4M。图片下载时间不超过3秒。 
 • 图片像素：大于50*50像素，否则影响识别效果； 
 • 长宽比：长边：短边<5； 
接口响应时间会受到图片下载时间的影响，建议使用更可靠的存储服务，推荐将图片存储在腾讯云COS。
     * @param ImageUrl 图片URL地址。 
图片限制： 
 • 图片格式：PNG、JPG、JPEG。 
 • 图片大小：所下载图片经Base64编码后不超过4M。图片下载时间不超过3秒。 
 • 图片像素：大于50*50像素，否则影响识别效果； 
 • 长宽比：长边：短边<5； 
接口响应时间会受到图片下载时间的影响，建议使用更可靠的存储服务，推荐将图片存储在腾讯云COS。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 预留字段，后期用于展示更多识别信息。 
     * @return Config 预留字段，后期用于展示更多识别信息。
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 预留字段，后期用于展示更多识别信息。
     * @param Config 预留字段，后期用于展示更多识别信息。
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get 透传字段，透传简单信息。 
     * @return Extra 透传字段，透传简单信息。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 透传字段，透传简单信息。
     * @param Extra 透传字段，透传简单信息。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get 图片经过base64编码的内容。最大不超过4M。与ImageUrl同时存在时优先使用ImageUrl字段。 
     * @return ImageBase64 图片经过base64编码的内容。最大不超过4M。与ImageUrl同时存在时优先使用ImageUrl字段。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片经过base64编码的内容。最大不超过4M。与ImageUrl同时存在时优先使用ImageUrl字段。
     * @param ImageBase64 图片经过base64编码的内容。最大不超过4M。与ImageUrl同时存在时优先使用ImageUrl字段。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Scenes.", this.Scenes);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);

    }
}

