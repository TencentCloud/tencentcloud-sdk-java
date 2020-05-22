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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaGjh extends AbstractModel{

    /**
    * 数组类图片信息
    */
    @SerializedName("Pic")
    @Expose
    private MediaInfoTypeGjh [] Pic;

    /**
    * 数组类文本信息
    */
    @SerializedName("Text")
    @Expose
    private MediaInfoTypeGjh [] Text;

    /**
    * 数组类视频信息
    */
    @SerializedName("Video")
    @Expose
    private MediaInfoTypeGjh [] Video;

    /**
     * Get 数组类图片信息 
     * @return Pic 数组类图片信息
     */
    public MediaInfoTypeGjh [] getPic() {
        return this.Pic;
    }

    /**
     * Set 数组类图片信息
     * @param Pic 数组类图片信息
     */
    public void setPic(MediaInfoTypeGjh [] Pic) {
        this.Pic = Pic;
    }

    /**
     * Get 数组类文本信息 
     * @return Text 数组类文本信息
     */
    public MediaInfoTypeGjh [] getText() {
        return this.Text;
    }

    /**
     * Set 数组类文本信息
     * @param Text 数组类文本信息
     */
    public void setText(MediaInfoTypeGjh [] Text) {
        this.Text = Text;
    }

    /**
     * Get 数组类视频信息 
     * @return Video 数组类视频信息
     */
    public MediaInfoTypeGjh [] getVideo() {
        return this.Video;
    }

    /**
     * Set 数组类视频信息
     * @param Video 数组类视频信息
     */
    public void setVideo(MediaInfoTypeGjh [] Video) {
        this.Video = Video;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Pic.", this.Pic);
        this.setParamArrayObj(map, prefix + "Text.", this.Text);
        this.setParamArrayObj(map, prefix + "Video.", this.Video);

    }
}

