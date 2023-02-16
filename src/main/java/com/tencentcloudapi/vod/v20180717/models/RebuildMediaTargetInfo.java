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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RebuildMediaTargetInfo extends AbstractModel{

    /**
    * 输出文件名，最长 64 个字符。缺省由系统指定生成文件名。
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * 描述信息，最长 128 个字符。缺省描述信息为空。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 分类ID，用于对媒体进行分类管理，可通过 [创建分类](/document/product/266/7812) 接口，创建分类，获得分类 ID。
<li>默认值：0，表示其他分类。</li>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * 输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 输出文件封装格式，可选值：mp4、flv、hls。默认mp4。
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * 输出的视频信息。
    */
    @SerializedName("VideoStream")
    @Expose
    private RebuildMediaTargetVideoStream VideoStream;

    /**
    * 输出的音频信息。
    */
    @SerializedName("AudioStream")
    @Expose
    private RebuildMediaTargetAudioStream AudioStream;

    /**
    * 是否去除视频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>

默认值：0。
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * 是否去除音频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>

默认值：0。
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
     * Get 输出文件名，最长 64 个字符。缺省由系统指定生成文件名。 
     * @return MediaName 输出文件名，最长 64 个字符。缺省由系统指定生成文件名。
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set 输出文件名，最长 64 个字符。缺省由系统指定生成文件名。
     * @param MediaName 输出文件名，最长 64 个字符。缺省由系统指定生成文件名。
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get 描述信息，最长 128 个字符。缺省描述信息为空。 
     * @return Description 描述信息，最长 128 个字符。缺省描述信息为空。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息，最长 128 个字符。缺省描述信息为空。
     * @param Description 描述信息，最长 128 个字符。缺省描述信息为空。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 分类ID，用于对媒体进行分类管理，可通过 [创建分类](/document/product/266/7812) 接口，创建分类，获得分类 ID。
<li>默认值：0，表示其他分类。</li> 
     * @return ClassId 分类ID，用于对媒体进行分类管理，可通过 [创建分类](/document/product/266/7812) 接口，创建分类，获得分类 ID。
<li>默认值：0，表示其他分类。</li>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set 分类ID，用于对媒体进行分类管理，可通过 [创建分类](/document/product/266/7812) 接口，创建分类，获得分类 ID。
<li>默认值：0，表示其他分类。</li>
     * @param ClassId 分类ID，用于对媒体进行分类管理，可通过 [创建分类](/document/product/266/7812) 接口，创建分类，获得分类 ID。
<li>默认值：0，表示其他分类。</li>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get 输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return ExpireTime 输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param ExpireTime 输出文件的过期时间，超过该时间文件将被删除，默认为永久不过期，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 输出文件封装格式，可选值：mp4、flv、hls。默认mp4。 
     * @return Container 输出文件封装格式，可选值：mp4、flv、hls。默认mp4。
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set 输出文件封装格式，可选值：mp4、flv、hls。默认mp4。
     * @param Container 输出文件封装格式，可选值：mp4、flv、hls。默认mp4。
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get 输出的视频信息。 
     * @return VideoStream 输出的视频信息。
     */
    public RebuildMediaTargetVideoStream getVideoStream() {
        return this.VideoStream;
    }

    /**
     * Set 输出的视频信息。
     * @param VideoStream 输出的视频信息。
     */
    public void setVideoStream(RebuildMediaTargetVideoStream VideoStream) {
        this.VideoStream = VideoStream;
    }

    /**
     * Get 输出的音频信息。 
     * @return AudioStream 输出的音频信息。
     */
    public RebuildMediaTargetAudioStream getAudioStream() {
        return this.AudioStream;
    }

    /**
     * Set 输出的音频信息。
     * @param AudioStream 输出的音频信息。
     */
    public void setAudioStream(RebuildMediaTargetAudioStream AudioStream) {
        this.AudioStream = AudioStream;
    }

    /**
     * Get 是否去除视频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>

默认值：0。 
     * @return RemoveVideo 是否去除视频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>

默认值：0。
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set 是否去除视频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>

默认值：0。
     * @param RemoveVideo 是否去除视频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>

默认值：0。
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get 是否去除音频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>

默认值：0。 
     * @return RemoveAudio 是否去除音频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>

默认值：0。
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set 是否去除音频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>

默认值：0。
     * @param RemoveAudio 是否去除音频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>

默认值：0。
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    public RebuildMediaTargetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebuildMediaTargetInfo(RebuildMediaTargetInfo source) {
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.VideoStream != null) {
            this.VideoStream = new RebuildMediaTargetVideoStream(source.VideoStream);
        }
        if (source.AudioStream != null) {
            this.AudioStream = new RebuildMediaTargetAudioStream(source.AudioStream);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamObj(map, prefix + "VideoStream.", this.VideoStream);
        this.setParamObj(map, prefix + "AudioStream.", this.AudioStream);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);

    }
}

