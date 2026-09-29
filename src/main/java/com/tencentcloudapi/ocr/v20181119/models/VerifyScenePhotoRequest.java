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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyScenePhotoRequest extends AbstractModel {

    /**
    * <p>场景类型参数，如果场景无法细分请选用该大类的第一个子类，目前支持以下类型：<br><strong>经营场所照</strong><br>0101 门头照<br>0102 店内照<br>0103 流动经营照    </p><p><strong>车牌业务照</strong><br>0201 车牌</p>
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * <p>鉴伪模式，目前支持以下模式，对应支持不同的入参、出参。<br>Image：图像鉴伪模式，根据图像分析输出告警提示，支持推理，支持区域篡改提示、AIGC合成提示、屏幕翻拍提示、截图提示、文字水印提示、水印内容、模板图片提示、VLM 推理结果。每次调用按1次调用计费。<br>Video：视频鉴伪模式，根据视频分析输出告警提示，不支持推理，支持屏幕翻拍提示。每次调用按1次调用计费。<br>Hybrid：混合鉴伪模式，综合图像、视频分析输出告警提示，支持推理，支持区域篡改提示、AIGC合成提示、屏幕翻拍提示、截图提示、文字水印提示、水印内容、模板图片提示、VLM 推理结果。每次调用按2次调用计费。</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>视频的 Url 地址。格式支持：xxxxxx。要求视频不超过 100M。建议视频时长不小于1s。</p>
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M。</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M。</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>推理 Prompt 模板，默认使用 VLM 对图片进行理解推理，同时支持使用 ${变量名} 进行推理。传入该参数即开启推理流程。</p><p>入参限制：长度限制：1–2000 字符</p>
    */
    @SerializedName("ReasoningPrompt")
    @Expose
    private String ReasoningPrompt;

    /**
    * <p>推理输出配置。当 ReasoningPrompt 传入时建议同步传入，未传入时使用默认配置（OutputMode=enum, EnumValues=[&quot;true&quot;,&quot;false&quot;], EnableImageInput=true）。</p>
    */
    @SerializedName("ReasoningConfig")
    @Expose
    private ReasoningConfig ReasoningConfig;

    /**
    * <p>水印提示排除类型，选择出参“水印提示”排除掉的水印类型，不传的话即代表任意水印都会提示。<br>PhoneCam：手机相机水印<br>WatermarkCam：水印相机水印</p>
    */
    @SerializedName("IgnoreWatermarkCategories")
    @Expose
    private String [] IgnoreWatermarkCategories;

    /**
     * Get <p>场景类型参数，如果场景无法细分请选用该大类的第一个子类，目前支持以下类型：<br><strong>经营场所照</strong><br>0101 门头照<br>0102 店内照<br>0103 流动经营照    </p><p><strong>车牌业务照</strong><br>0201 车牌</p> 
     * @return Scene <p>场景类型参数，如果场景无法细分请选用该大类的第一个子类，目前支持以下类型：<br><strong>经营场所照</strong><br>0101 门头照<br>0102 店内照<br>0103 流动经营照    </p><p><strong>车牌业务照</strong><br>0201 车牌</p>
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set <p>场景类型参数，如果场景无法细分请选用该大类的第一个子类，目前支持以下类型：<br><strong>经营场所照</strong><br>0101 门头照<br>0102 店内照<br>0103 流动经营照    </p><p><strong>车牌业务照</strong><br>0201 车牌</p>
     * @param Scene <p>场景类型参数，如果场景无法细分请选用该大类的第一个子类，目前支持以下类型：<br><strong>经营场所照</strong><br>0101 门头照<br>0102 店内照<br>0103 流动经营照    </p><p><strong>车牌业务照</strong><br>0201 车牌</p>
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get <p>鉴伪模式，目前支持以下模式，对应支持不同的入参、出参。<br>Image：图像鉴伪模式，根据图像分析输出告警提示，支持推理，支持区域篡改提示、AIGC合成提示、屏幕翻拍提示、截图提示、文字水印提示、水印内容、模板图片提示、VLM 推理结果。每次调用按1次调用计费。<br>Video：视频鉴伪模式，根据视频分析输出告警提示，不支持推理，支持屏幕翻拍提示。每次调用按1次调用计费。<br>Hybrid：混合鉴伪模式，综合图像、视频分析输出告警提示，支持推理，支持区域篡改提示、AIGC合成提示、屏幕翻拍提示、截图提示、文字水印提示、水印内容、模板图片提示、VLM 推理结果。每次调用按2次调用计费。</p> 
     * @return Mode <p>鉴伪模式，目前支持以下模式，对应支持不同的入参、出参。<br>Image：图像鉴伪模式，根据图像分析输出告警提示，支持推理，支持区域篡改提示、AIGC合成提示、屏幕翻拍提示、截图提示、文字水印提示、水印内容、模板图片提示、VLM 推理结果。每次调用按1次调用计费。<br>Video：视频鉴伪模式，根据视频分析输出告警提示，不支持推理，支持屏幕翻拍提示。每次调用按1次调用计费。<br>Hybrid：混合鉴伪模式，综合图像、视频分析输出告警提示，支持推理，支持区域篡改提示、AIGC合成提示、屏幕翻拍提示、截图提示、文字水印提示、水印内容、模板图片提示、VLM 推理结果。每次调用按2次调用计费。</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>鉴伪模式，目前支持以下模式，对应支持不同的入参、出参。<br>Image：图像鉴伪模式，根据图像分析输出告警提示，支持推理，支持区域篡改提示、AIGC合成提示、屏幕翻拍提示、截图提示、文字水印提示、水印内容、模板图片提示、VLM 推理结果。每次调用按1次调用计费。<br>Video：视频鉴伪模式，根据视频分析输出告警提示，不支持推理，支持屏幕翻拍提示。每次调用按1次调用计费。<br>Hybrid：混合鉴伪模式，综合图像、视频分析输出告警提示，支持推理，支持区域篡改提示、AIGC合成提示、屏幕翻拍提示、截图提示、文字水印提示、水印内容、模板图片提示、VLM 推理结果。每次调用按2次调用计费。</p>
     * @param Mode <p>鉴伪模式，目前支持以下模式，对应支持不同的入参、出参。<br>Image：图像鉴伪模式，根据图像分析输出告警提示，支持推理，支持区域篡改提示、AIGC合成提示、屏幕翻拍提示、截图提示、文字水印提示、水印内容、模板图片提示、VLM 推理结果。每次调用按1次调用计费。<br>Video：视频鉴伪模式，根据视频分析输出告警提示，不支持推理，支持屏幕翻拍提示。每次调用按1次调用计费。<br>Hybrid：混合鉴伪模式，综合图像、视频分析输出告警提示，支持推理，支持区域篡改提示、AIGC合成提示、屏幕翻拍提示、截图提示、文字水印提示、水印内容、模板图片提示、VLM 推理结果。每次调用按2次调用计费。</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>视频的 Url 地址。格式支持：xxxxxx。要求视频不超过 100M。建议视频时长不小于1s。</p> 
     * @return VideoUrl <p>视频的 Url 地址。格式支持：xxxxxx。要求视频不超过 100M。建议视频时长不小于1s。</p>
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set <p>视频的 Url 地址。格式支持：xxxxxx。要求视频不超过 100M。建议视频时长不小于1s。</p>
     * @param VideoUrl <p>视频的 Url 地址。格式支持：xxxxxx。要求视频不超过 100M。建议视频时长不小于1s。</p>
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M。</p> 
     * @return ImageUrl <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M。</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M。</p>
     * @param ImageUrl <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M。</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M。</p> 
     * @return ImageBase64 <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M。</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M。</p>
     * @param ImageBase64 <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M。</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>推理 Prompt 模板，默认使用 VLM 对图片进行理解推理，同时支持使用 ${变量名} 进行推理。传入该参数即开启推理流程。</p><p>入参限制：长度限制：1–2000 字符</p> 
     * @return ReasoningPrompt <p>推理 Prompt 模板，默认使用 VLM 对图片进行理解推理，同时支持使用 ${变量名} 进行推理。传入该参数即开启推理流程。</p><p>入参限制：长度限制：1–2000 字符</p>
     */
    public String getReasoningPrompt() {
        return this.ReasoningPrompt;
    }

    /**
     * Set <p>推理 Prompt 模板，默认使用 VLM 对图片进行理解推理，同时支持使用 ${变量名} 进行推理。传入该参数即开启推理流程。</p><p>入参限制：长度限制：1–2000 字符</p>
     * @param ReasoningPrompt <p>推理 Prompt 模板，默认使用 VLM 对图片进行理解推理，同时支持使用 ${变量名} 进行推理。传入该参数即开启推理流程。</p><p>入参限制：长度限制：1–2000 字符</p>
     */
    public void setReasoningPrompt(String ReasoningPrompt) {
        this.ReasoningPrompt = ReasoningPrompt;
    }

    /**
     * Get <p>推理输出配置。当 ReasoningPrompt 传入时建议同步传入，未传入时使用默认配置（OutputMode=enum, EnumValues=[&quot;true&quot;,&quot;false&quot;], EnableImageInput=true）。</p> 
     * @return ReasoningConfig <p>推理输出配置。当 ReasoningPrompt 传入时建议同步传入，未传入时使用默认配置（OutputMode=enum, EnumValues=[&quot;true&quot;,&quot;false&quot;], EnableImageInput=true）。</p>
     */
    public ReasoningConfig getReasoningConfig() {
        return this.ReasoningConfig;
    }

    /**
     * Set <p>推理输出配置。当 ReasoningPrompt 传入时建议同步传入，未传入时使用默认配置（OutputMode=enum, EnumValues=[&quot;true&quot;,&quot;false&quot;], EnableImageInput=true）。</p>
     * @param ReasoningConfig <p>推理输出配置。当 ReasoningPrompt 传入时建议同步传入，未传入时使用默认配置（OutputMode=enum, EnumValues=[&quot;true&quot;,&quot;false&quot;], EnableImageInput=true）。</p>
     */
    public void setReasoningConfig(ReasoningConfig ReasoningConfig) {
        this.ReasoningConfig = ReasoningConfig;
    }

    /**
     * Get <p>水印提示排除类型，选择出参“水印提示”排除掉的水印类型，不传的话即代表任意水印都会提示。<br>PhoneCam：手机相机水印<br>WatermarkCam：水印相机水印</p> 
     * @return IgnoreWatermarkCategories <p>水印提示排除类型，选择出参“水印提示”排除掉的水印类型，不传的话即代表任意水印都会提示。<br>PhoneCam：手机相机水印<br>WatermarkCam：水印相机水印</p>
     */
    public String [] getIgnoreWatermarkCategories() {
        return this.IgnoreWatermarkCategories;
    }

    /**
     * Set <p>水印提示排除类型，选择出参“水印提示”排除掉的水印类型，不传的话即代表任意水印都会提示。<br>PhoneCam：手机相机水印<br>WatermarkCam：水印相机水印</p>
     * @param IgnoreWatermarkCategories <p>水印提示排除类型，选择出参“水印提示”排除掉的水印类型，不传的话即代表任意水印都会提示。<br>PhoneCam：手机相机水印<br>WatermarkCam：水印相机水印</p>
     */
    public void setIgnoreWatermarkCategories(String [] IgnoreWatermarkCategories) {
        this.IgnoreWatermarkCategories = IgnoreWatermarkCategories;
    }

    public VerifyScenePhotoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyScenePhotoRequest(VerifyScenePhotoRequest source) {
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ReasoningPrompt != null) {
            this.ReasoningPrompt = new String(source.ReasoningPrompt);
        }
        if (source.ReasoningConfig != null) {
            this.ReasoningConfig = new ReasoningConfig(source.ReasoningConfig);
        }
        if (source.IgnoreWatermarkCategories != null) {
            this.IgnoreWatermarkCategories = new String[source.IgnoreWatermarkCategories.length];
            for (int i = 0; i < source.IgnoreWatermarkCategories.length; i++) {
                this.IgnoreWatermarkCategories[i] = new String(source.IgnoreWatermarkCategories[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ReasoningPrompt", this.ReasoningPrompt);
        this.setParamObj(map, prefix + "ReasoningConfig.", this.ReasoningConfig);
        this.setParamArraySimple(map, prefix + "IgnoreWatermarkCategories.", this.IgnoreWatermarkCategories);

    }
}

