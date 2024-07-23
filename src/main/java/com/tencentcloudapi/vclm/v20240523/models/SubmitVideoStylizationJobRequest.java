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

public class SubmitVideoStylizationJobRequest extends AbstractModel {

    /**
    * 风格ID，取值说明：2d_anime 2D动漫；3d_cartoon 3D卡通；3d_china 3D国潮；pixel_art	像素风。
    */
    @SerializedName("StyleId")
    @Expose
    private String StyleId;

    /**
    * 输入视频URL。视频要求：
- 视频格式：mp4、mov；
- 视频时长：1～60秒；
- 视频分辨率：540P~2056P，即长宽像素数均在540px～2056px范围内；
- 视频大小：不超过200M；
- 视频FPS：15～60fps。
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * 风格化强度 可选参数["low","medium","high"] 
"low":风格化强度弱,"medium":"风格化强度中等","high":"风格化强度强" 
默认为medium
    */
    @SerializedName("StyleStrength")
    @Expose
    private String StyleStrength;

    /**
     * Get 风格ID，取值说明：2d_anime 2D动漫；3d_cartoon 3D卡通；3d_china 3D国潮；pixel_art	像素风。 
     * @return StyleId 风格ID，取值说明：2d_anime 2D动漫；3d_cartoon 3D卡通；3d_china 3D国潮；pixel_art	像素风。
     */
    public String getStyleId() {
        return this.StyleId;
    }

    /**
     * Set 风格ID，取值说明：2d_anime 2D动漫；3d_cartoon 3D卡通；3d_china 3D国潮；pixel_art	像素风。
     * @param StyleId 风格ID，取值说明：2d_anime 2D动漫；3d_cartoon 3D卡通；3d_china 3D国潮；pixel_art	像素风。
     */
    public void setStyleId(String StyleId) {
        this.StyleId = StyleId;
    }

    /**
     * Get 输入视频URL。视频要求：
- 视频格式：mp4、mov；
- 视频时长：1～60秒；
- 视频分辨率：540P~2056P，即长宽像素数均在540px～2056px范围内；
- 视频大小：不超过200M；
- 视频FPS：15～60fps。 
     * @return VideoUrl 输入视频URL。视频要求：
- 视频格式：mp4、mov；
- 视频时长：1～60秒；
- 视频分辨率：540P~2056P，即长宽像素数均在540px～2056px范围内；
- 视频大小：不超过200M；
- 视频FPS：15～60fps。
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set 输入视频URL。视频要求：
- 视频格式：mp4、mov；
- 视频时长：1～60秒；
- 视频分辨率：540P~2056P，即长宽像素数均在540px～2056px范围内；
- 视频大小：不超过200M；
- 视频FPS：15～60fps。
     * @param VideoUrl 输入视频URL。视频要求：
- 视频格式：mp4、mov；
- 视频时长：1～60秒；
- 视频分辨率：540P~2056P，即长宽像素数均在540px～2056px范围内；
- 视频大小：不超过200M；
- 视频FPS：15～60fps。
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get 风格化强度 可选参数["low","medium","high"] 
"low":风格化强度弱,"medium":"风格化强度中等","high":"风格化强度强" 
默认为medium 
     * @return StyleStrength 风格化强度 可选参数["low","medium","high"] 
"low":风格化强度弱,"medium":"风格化强度中等","high":"风格化强度强" 
默认为medium
     */
    public String getStyleStrength() {
        return this.StyleStrength;
    }

    /**
     * Set 风格化强度 可选参数["low","medium","high"] 
"low":风格化强度弱,"medium":"风格化强度中等","high":"风格化强度强" 
默认为medium
     * @param StyleStrength 风格化强度 可选参数["low","medium","high"] 
"low":风格化强度弱,"medium":"风格化强度中等","high":"风格化强度强" 
默认为medium
     */
    public void setStyleStrength(String StyleStrength) {
        this.StyleStrength = StyleStrength;
    }

    public SubmitVideoStylizationJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitVideoStylizationJobRequest(SubmitVideoStylizationJobRequest source) {
        if (source.StyleId != null) {
            this.StyleId = new String(source.StyleId);
        }
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.StyleStrength != null) {
            this.StyleStrength = new String(source.StyleStrength);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StyleId", this.StyleId);
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "StyleStrength", this.StyleStrength);

    }
}

