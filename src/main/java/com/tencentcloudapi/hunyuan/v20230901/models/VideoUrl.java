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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoUrl extends AbstractModel {

    /**
    * 视频的url，如"https://your-video-path.mp4"，视频文件大小不超过100M。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 控制视频抽帧频率，取值范围为 0.1 ~5，表示每隔 1/fps 秒抽取一帧，默认为 1s抽取一帧
    */
    @SerializedName("Fps")
    @Expose
    private Float Fps;

    /**
     * Get 视频的url，如"https://your-video-path.mp4"，视频文件大小不超过100M。 
     * @return Url 视频的url，如"https://your-video-path.mp4"，视频文件大小不超过100M。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 视频的url，如"https://your-video-path.mp4"，视频文件大小不超过100M。
     * @param Url 视频的url，如"https://your-video-path.mp4"，视频文件大小不超过100M。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 控制视频抽帧频率，取值范围为 0.1 ~5，表示每隔 1/fps 秒抽取一帧，默认为 1s抽取一帧 
     * @return Fps 控制视频抽帧频率，取值范围为 0.1 ~5，表示每隔 1/fps 秒抽取一帧，默认为 1s抽取一帧
     */
    public Float getFps() {
        return this.Fps;
    }

    /**
     * Set 控制视频抽帧频率，取值范围为 0.1 ~5，表示每隔 1/fps 秒抽取一帧，默认为 1s抽取一帧
     * @param Fps 控制视频抽帧频率，取值范围为 0.1 ~5，表示每隔 1/fps 秒抽取一帧，默认为 1s抽取一帧
     */
    public void setFps(Float Fps) {
        this.Fps = Fps;
    }

    public VideoUrl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoUrl(VideoUrl source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Fps != null) {
            this.Fps = new Float(source.Fps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Fps", this.Fps);

    }
}

