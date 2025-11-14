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

public class VideoFrames extends AbstractModel {

    /**
    * 视频图像帧列表，图像帧传url
    */
    @SerializedName("Frames")
    @Expose
    private String [] Frames;

    /**
     * Get 视频图像帧列表，图像帧传url 
     * @return Frames 视频图像帧列表，图像帧传url
     */
    public String [] getFrames() {
        return this.Frames;
    }

    /**
     * Set 视频图像帧列表，图像帧传url
     * @param Frames 视频图像帧列表，图像帧传url
     */
    public void setFrames(String [] Frames) {
        this.Frames = Frames;
    }

    public VideoFrames() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoFrames(VideoFrames source) {
        if (source.Frames != null) {
            this.Frames = new String[source.Frames.length];
            for (int i = 0; i < source.Frames.length; i++) {
                this.Frames[i] = new String(source.Frames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Frames.", this.Frames);

    }
}

