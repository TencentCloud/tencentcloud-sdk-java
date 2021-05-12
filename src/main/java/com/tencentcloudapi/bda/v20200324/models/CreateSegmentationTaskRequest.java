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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSegmentationTaskRequest extends AbstractModel{

    /**
    * 需要分割的视频URL，可外网访问。
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * 背景图片URL。 
可以将视频背景替换为输入的图片。 
如果不输入背景图片，则输出人像区域mask。
    */
    @SerializedName("BackgroundImageUrl")
    @Expose
    private String BackgroundImageUrl;

    /**
    * 预留字段，后期用于展示更多识别信息。
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
     * Get 需要分割的视频URL，可外网访问。 
     * @return VideoUrl 需要分割的视频URL，可外网访问。
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set 需要分割的视频URL，可外网访问。
     * @param VideoUrl 需要分割的视频URL，可外网访问。
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get 背景图片URL。 
可以将视频背景替换为输入的图片。 
如果不输入背景图片，则输出人像区域mask。 
     * @return BackgroundImageUrl 背景图片URL。 
可以将视频背景替换为输入的图片。 
如果不输入背景图片，则输出人像区域mask。
     */
    public String getBackgroundImageUrl() {
        return this.BackgroundImageUrl;
    }

    /**
     * Set 背景图片URL。 
可以将视频背景替换为输入的图片。 
如果不输入背景图片，则输出人像区域mask。
     * @param BackgroundImageUrl 背景图片URL。 
可以将视频背景替换为输入的图片。 
如果不输入背景图片，则输出人像区域mask。
     */
    public void setBackgroundImageUrl(String BackgroundImageUrl) {
        this.BackgroundImageUrl = BackgroundImageUrl;
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

    public CreateSegmentationTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSegmentationTaskRequest(CreateSegmentationTaskRequest source) {
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.BackgroundImageUrl != null) {
            this.BackgroundImageUrl = new String(source.BackgroundImageUrl);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "BackgroundImageUrl", this.BackgroundImageUrl);
        this.setParamSimple(map, prefix + "Config", this.Config);

    }
}

