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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoEditProjectInput extends AbstractModel{

    /**
    * 输入的媒体轨道列表，包括视频、音频，等素材组成的多个轨道信息，其中：<li>输入的多个轨道在时间轴上和输出媒体文件的时间轴对齐；</li><li>时间轴上相同时间点的各个轨道的素材进行重叠，视频或者图片按轨道顺序进行图像的叠加，轨道顺序高的素材叠加在上面，音频素材进行混音；</li><li>视频、音频，每一种类型的轨道最多支持10个。</li>
    */
    @SerializedName("InitTracks")
    @Expose
    private MediaTrack [] InitTracks;

    /**
     * Get 输入的媒体轨道列表，包括视频、音频，等素材组成的多个轨道信息，其中：<li>输入的多个轨道在时间轴上和输出媒体文件的时间轴对齐；</li><li>时间轴上相同时间点的各个轨道的素材进行重叠，视频或者图片按轨道顺序进行图像的叠加，轨道顺序高的素材叠加在上面，音频素材进行混音；</li><li>视频、音频，每一种类型的轨道最多支持10个。</li> 
     * @return InitTracks 输入的媒体轨道列表，包括视频、音频，等素材组成的多个轨道信息，其中：<li>输入的多个轨道在时间轴上和输出媒体文件的时间轴对齐；</li><li>时间轴上相同时间点的各个轨道的素材进行重叠，视频或者图片按轨道顺序进行图像的叠加，轨道顺序高的素材叠加在上面，音频素材进行混音；</li><li>视频、音频，每一种类型的轨道最多支持10个。</li>
     */
    public MediaTrack [] getInitTracks() {
        return this.InitTracks;
    }

    /**
     * Set 输入的媒体轨道列表，包括视频、音频，等素材组成的多个轨道信息，其中：<li>输入的多个轨道在时间轴上和输出媒体文件的时间轴对齐；</li><li>时间轴上相同时间点的各个轨道的素材进行重叠，视频或者图片按轨道顺序进行图像的叠加，轨道顺序高的素材叠加在上面，音频素材进行混音；</li><li>视频、音频，每一种类型的轨道最多支持10个。</li>
     * @param InitTracks 输入的媒体轨道列表，包括视频、音频，等素材组成的多个轨道信息，其中：<li>输入的多个轨道在时间轴上和输出媒体文件的时间轴对齐；</li><li>时间轴上相同时间点的各个轨道的素材进行重叠，视频或者图片按轨道顺序进行图像的叠加，轨道顺序高的素材叠加在上面，音频素材进行混音；</li><li>视频、音频，每一种类型的轨道最多支持10个。</li>
     */
    public void setInitTracks(MediaTrack [] InitTracks) {
        this.InitTracks = InitTracks;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InitTracks.", this.InitTracks);

    }
}

