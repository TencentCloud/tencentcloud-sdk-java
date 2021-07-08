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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaInfo extends AbstractModel{

    /**
    * 该字段用于返回传入的媒体文件的编码格式，如wav、mp3、aac、flac、amr、3gp、 m4a、wma、ogg、ape等。
    */
    @SerializedName("Codecs")
    @Expose
    private String Codecs;

    /**
    * 该字段用于返回对传入的流媒体文件进行分片的片段时长，单位为秒。**默认值为15秒**，支持用户自定义配置。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * *内测中，敬请期待*
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * *内测中，敬请期待*
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * *内测中，敬请期待*
    */
    @SerializedName("Thumbnail")
    @Expose
    private String Thumbnail;

    /**
     * Get 该字段用于返回传入的媒体文件的编码格式，如wav、mp3、aac、flac、amr、3gp、 m4a、wma、ogg、ape等。 
     * @return Codecs 该字段用于返回传入的媒体文件的编码格式，如wav、mp3、aac、flac、amr、3gp、 m4a、wma、ogg、ape等。
     */
    public String getCodecs() {
        return this.Codecs;
    }

    /**
     * Set 该字段用于返回传入的媒体文件的编码格式，如wav、mp3、aac、flac、amr、3gp、 m4a、wma、ogg、ape等。
     * @param Codecs 该字段用于返回传入的媒体文件的编码格式，如wav、mp3、aac、flac、amr、3gp、 m4a、wma、ogg、ape等。
     */
    public void setCodecs(String Codecs) {
        this.Codecs = Codecs;
    }

    /**
     * Get 该字段用于返回对传入的流媒体文件进行分片的片段时长，单位为秒。**默认值为15秒**，支持用户自定义配置。 
     * @return Duration 该字段用于返回对传入的流媒体文件进行分片的片段时长，单位为秒。**默认值为15秒**，支持用户自定义配置。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 该字段用于返回对传入的流媒体文件进行分片的片段时长，单位为秒。**默认值为15秒**，支持用户自定义配置。
     * @param Duration 该字段用于返回对传入的流媒体文件进行分片的片段时长，单位为秒。**默认值为15秒**，支持用户自定义配置。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get *内测中，敬请期待* 
     * @return Width *内测中，敬请期待*
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set *内测中，敬请期待*
     * @param Width *内测中，敬请期待*
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get *内测中，敬请期待* 
     * @return Height *内测中，敬请期待*
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set *内测中，敬请期待*
     * @param Height *内测中，敬请期待*
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get *内测中，敬请期待* 
     * @return Thumbnail *内测中，敬请期待*
     */
    public String getThumbnail() {
        return this.Thumbnail;
    }

    /**
     * Set *内测中，敬请期待*
     * @param Thumbnail *内测中，敬请期待*
     */
    public void setThumbnail(String Thumbnail) {
        this.Thumbnail = Thumbnail;
    }

    public MediaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaInfo(MediaInfo source) {
        if (source.Codecs != null) {
            this.Codecs = new String(source.Codecs);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Thumbnail != null) {
            this.Thumbnail = new String(source.Thumbnail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codecs", this.Codecs);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Thumbnail", this.Thumbnail);

    }
}

