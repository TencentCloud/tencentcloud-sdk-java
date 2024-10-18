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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitPortraitSingJobRequest extends AbstractModel {

    /**
    * 传入音频URL地址，音频要求：
- 音频时长：2秒 - 60秒
- 音频格式：mp3、wav、m4a
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * 传入图片URL地址，图片要求：
- 图片格式：jpg、jpeg、png、bmp、webp
- 图片分辨率：192～4096
- 图片大小：不超过10M
- 图片宽高比：图片【宽：高】在1:2到2:1范围内
- 图片内容：避免上传无人脸/宠物脸或脸部过小、不完整、不清晰、偏转角度过大的图片。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 传入图片Base64编码，编码后请求体大小不超过10M。
图片Base64编码与URL地址必传其一，如果都传以ImageBase64为准。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 唱演模式，默认使用人像模式。
Person：人像模式，仅支持上传人像图片，人像生成效果更好，如果图中未检测到有效人脸将被拦截，生成时会将视频短边分辨率放缩至512。
Pet：宠物模式，支持宠物等非人像图片，固定生成512:512分辨率视频。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
     * Get 传入音频URL地址，音频要求：
- 音频时长：2秒 - 60秒
- 音频格式：mp3、wav、m4a 
     * @return AudioUrl 传入音频URL地址，音频要求：
- 音频时长：2秒 - 60秒
- 音频格式：mp3、wav、m4a
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set 传入音频URL地址，音频要求：
- 音频时长：2秒 - 60秒
- 音频格式：mp3、wav、m4a
     * @param AudioUrl 传入音频URL地址，音频要求：
- 音频时长：2秒 - 60秒
- 音频格式：mp3、wav、m4a
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get 传入图片URL地址，图片要求：
- 图片格式：jpg、jpeg、png、bmp、webp
- 图片分辨率：192～4096
- 图片大小：不超过10M
- 图片宽高比：图片【宽：高】在1:2到2:1范围内
- 图片内容：避免上传无人脸/宠物脸或脸部过小、不完整、不清晰、偏转角度过大的图片。 
     * @return ImageUrl 传入图片URL地址，图片要求：
- 图片格式：jpg、jpeg、png、bmp、webp
- 图片分辨率：192～4096
- 图片大小：不超过10M
- 图片宽高比：图片【宽：高】在1:2到2:1范围内
- 图片内容：避免上传无人脸/宠物脸或脸部过小、不完整、不清晰、偏转角度过大的图片。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 传入图片URL地址，图片要求：
- 图片格式：jpg、jpeg、png、bmp、webp
- 图片分辨率：192～4096
- 图片大小：不超过10M
- 图片宽高比：图片【宽：高】在1:2到2:1范围内
- 图片内容：避免上传无人脸/宠物脸或脸部过小、不完整、不清晰、偏转角度过大的图片。
     * @param ImageUrl 传入图片URL地址，图片要求：
- 图片格式：jpg、jpeg、png、bmp、webp
- 图片分辨率：192～4096
- 图片大小：不超过10M
- 图片宽高比：图片【宽：高】在1:2到2:1范围内
- 图片内容：避免上传无人脸/宠物脸或脸部过小、不完整、不清晰、偏转角度过大的图片。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 传入图片Base64编码，编码后请求体大小不超过10M。
图片Base64编码与URL地址必传其一，如果都传以ImageBase64为准。 
     * @return ImageBase64 传入图片Base64编码，编码后请求体大小不超过10M。
图片Base64编码与URL地址必传其一，如果都传以ImageBase64为准。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 传入图片Base64编码，编码后请求体大小不超过10M。
图片Base64编码与URL地址必传其一，如果都传以ImageBase64为准。
     * @param ImageBase64 传入图片Base64编码，编码后请求体大小不超过10M。
图片Base64编码与URL地址必传其一，如果都传以ImageBase64为准。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 唱演模式，默认使用人像模式。
Person：人像模式，仅支持上传人像图片，人像生成效果更好，如果图中未检测到有效人脸将被拦截，生成时会将视频短边分辨率放缩至512。
Pet：宠物模式，支持宠物等非人像图片，固定生成512:512分辨率视频。 
     * @return Mode 唱演模式，默认使用人像模式。
Person：人像模式，仅支持上传人像图片，人像生成效果更好，如果图中未检测到有效人脸将被拦截，生成时会将视频短边分辨率放缩至512。
Pet：宠物模式，支持宠物等非人像图片，固定生成512:512分辨率视频。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 唱演模式，默认使用人像模式。
Person：人像模式，仅支持上传人像图片，人像生成效果更好，如果图中未检测到有效人脸将被拦截，生成时会将视频短边分辨率放缩至512。
Pet：宠物模式，支持宠物等非人像图片，固定生成512:512分辨率视频。
     * @param Mode 唱演模式，默认使用人像模式。
Person：人像模式，仅支持上传人像图片，人像生成效果更好，如果图中未检测到有效人脸将被拦截，生成时会将视频短边分辨率放缩至512。
Pet：宠物模式，支持宠物等非人像图片，固定生成512:512分辨率视频。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    public SubmitPortraitSingJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitPortraitSingJobRequest(SubmitPortraitSingJobRequest source) {
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

