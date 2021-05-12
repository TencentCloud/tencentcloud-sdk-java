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

public class MorphFaceRequest extends AbstractModel{

    /**
    * 图片 base64 数据，base64 编码后大小不可超过5M。 
jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。 
人员人脸总数量至少2张，不可超过5张。 
若图片中包含多张人脸，只选取其中人脸面积最大的人脸。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
    * 图片的 Url 。对应图片 base64 编码后大小不可超过5M。jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。 
Url、Image必须提供一个，如果都提供，只使用 Url。图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
人员人脸总数量不可超过5张。 
若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
    * 人脸渐变参数。可调整每张图片的展示时长、人像渐变的最长时间
    */
    @SerializedName("GradientInfos")
    @Expose
    private GradientInfo [] GradientInfos;

    /**
    * 视频帧率，取值[1,25]。默认10
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 视频类型，取值0。目前仅支持MP4格式，默认为MP4格式
    */
    @SerializedName("OutputType")
    @Expose
    private Long OutputType;

    /**
    * 视频宽度，取值[128,1280]。默认值720
    */
    @SerializedName("OutputWidth")
    @Expose
    private Long OutputWidth;

    /**
    * 视频高度，取值[128,1280]。默认值1280
    */
    @SerializedName("OutputHeight")
    @Expose
    private Long OutputHeight;

    /**
     * Get 图片 base64 数据，base64 编码后大小不可超过5M。 
jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。 
人员人脸总数量至少2张，不可超过5张。 
若图片中包含多张人脸，只选取其中人脸面积最大的人脸。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
     * @return Images 图片 base64 数据，base64 编码后大小不可超过5M。 
jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。 
人员人脸总数量至少2张，不可超过5张。 
若图片中包含多张人脸，只选取其中人脸面积最大的人脸。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set 图片 base64 数据，base64 编码后大小不可超过5M。 
jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。 
人员人脸总数量至少2张，不可超过5张。 
若图片中包含多张人脸，只选取其中人脸面积最大的人脸。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * @param Images 图片 base64 数据，base64 编码后大小不可超过5M。 
jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。 
人员人脸总数量至少2张，不可超过5张。 
若图片中包含多张人脸，只选取其中人脸面积最大的人脸。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setImages(String [] Images) {
        this.Images = Images;
    }

    /**
     * Get 图片的 Url 。对应图片 base64 编码后大小不可超过5M。jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。 
Url、Image必须提供一个，如果都提供，只使用 Url。图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
人员人脸总数量不可超过5张。 
若图片中包含多张人脸，只选取其中人脸面积最大的人脸。 
     * @return Urls 图片的 Url 。对应图片 base64 编码后大小不可超过5M。jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。 
Url、Image必须提供一个，如果都提供，只使用 Url。图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
人员人脸总数量不可超过5张。 
若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set 图片的 Url 。对应图片 base64 编码后大小不可超过5M。jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。 
Url、Image必须提供一个，如果都提供，只使用 Url。图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
人员人脸总数量不可超过5张。 
若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     * @param Urls 图片的 Url 。对应图片 base64 编码后大小不可超过5M。jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。 
Url、Image必须提供一个，如果都提供，只使用 Url。图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。 
非腾讯云存储的Url速度和稳定性可能受一定影响。 
支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。 
人员人脸总数量不可超过5张。 
若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    /**
     * Get 人脸渐变参数。可调整每张图片的展示时长、人像渐变的最长时间 
     * @return GradientInfos 人脸渐变参数。可调整每张图片的展示时长、人像渐变的最长时间
     */
    public GradientInfo [] getGradientInfos() {
        return this.GradientInfos;
    }

    /**
     * Set 人脸渐变参数。可调整每张图片的展示时长、人像渐变的最长时间
     * @param GradientInfos 人脸渐变参数。可调整每张图片的展示时长、人像渐变的最长时间
     */
    public void setGradientInfos(GradientInfo [] GradientInfos) {
        this.GradientInfos = GradientInfos;
    }

    /**
     * Get 视频帧率，取值[1,25]。默认10 
     * @return Fps 视频帧率，取值[1,25]。默认10
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 视频帧率，取值[1,25]。默认10
     * @param Fps 视频帧率，取值[1,25]。默认10
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 视频类型，取值0。目前仅支持MP4格式，默认为MP4格式 
     * @return OutputType 视频类型，取值0。目前仅支持MP4格式，默认为MP4格式
     */
    public Long getOutputType() {
        return this.OutputType;
    }

    /**
     * Set 视频类型，取值0。目前仅支持MP4格式，默认为MP4格式
     * @param OutputType 视频类型，取值0。目前仅支持MP4格式，默认为MP4格式
     */
    public void setOutputType(Long OutputType) {
        this.OutputType = OutputType;
    }

    /**
     * Get 视频宽度，取值[128,1280]。默认值720 
     * @return OutputWidth 视频宽度，取值[128,1280]。默认值720
     */
    public Long getOutputWidth() {
        return this.OutputWidth;
    }

    /**
     * Set 视频宽度，取值[128,1280]。默认值720
     * @param OutputWidth 视频宽度，取值[128,1280]。默认值720
     */
    public void setOutputWidth(Long OutputWidth) {
        this.OutputWidth = OutputWidth;
    }

    /**
     * Get 视频高度，取值[128,1280]。默认值1280 
     * @return OutputHeight 视频高度，取值[128,1280]。默认值1280
     */
    public Long getOutputHeight() {
        return this.OutputHeight;
    }

    /**
     * Set 视频高度，取值[128,1280]。默认值1280
     * @param OutputHeight 视频高度，取值[128,1280]。默认值1280
     */
    public void setOutputHeight(Long OutputHeight) {
        this.OutputHeight = OutputHeight;
    }

    public MorphFaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MorphFaceRequest(MorphFaceRequest source) {
        if (source.Images != null) {
            this.Images = new String[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new String(source.Images[i]);
            }
        }
        if (source.Urls != null) {
            this.Urls = new String[source.Urls.length];
            for (int i = 0; i < source.Urls.length; i++) {
                this.Urls[i] = new String(source.Urls[i]);
            }
        }
        if (source.GradientInfos != null) {
            this.GradientInfos = new GradientInfo[source.GradientInfos.length];
            for (int i = 0; i < source.GradientInfos.length; i++) {
                this.GradientInfos[i] = new GradientInfo(source.GradientInfos[i]);
            }
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.OutputType != null) {
            this.OutputType = new Long(source.OutputType);
        }
        if (source.OutputWidth != null) {
            this.OutputWidth = new Long(source.OutputWidth);
        }
        if (source.OutputHeight != null) {
            this.OutputHeight = new Long(source.OutputHeight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamArrayObj(map, prefix + "GradientInfos.", this.GradientInfos);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "OutputType", this.OutputType);
        this.setParamSimple(map, prefix + "OutputWidth", this.OutputWidth);
        this.setParamSimple(map, prefix + "OutputHeight", this.OutputHeight);

    }
}

