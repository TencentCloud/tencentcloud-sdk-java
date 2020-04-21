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

public class MediaTrack extends AbstractModel{

    /**
    * 轨道类型，取值有：
<ul>
<li>Video ：视频轨道。视频轨道由以下 Item 组成：<ul><li>VideoTrackItem</li><li>MediaTransitionItem</li> <li>EmptyTrackItem</li></ul> </li>
<li>Audio ：音频轨道。音频轨道由以下 Item 组成：<ul><li>AudioTrackItem</li><li>MediaTransitionItem</li><li>EmptyTrackItem</li></ul></li>
<li>Sticker ：贴图轨道。贴图轨道以下 Item 组成：<ul><li> StickerTrackItem</li><li>EmptyTrackItem</li></ul></li>	
</ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 轨道上的媒体片段列表。
    */
    @SerializedName("TrackItems")
    @Expose
    private MediaTrackItem [] TrackItems;

    /**
     * Get 轨道类型，取值有：
<ul>
<li>Video ：视频轨道。视频轨道由以下 Item 组成：<ul><li>VideoTrackItem</li><li>MediaTransitionItem</li> <li>EmptyTrackItem</li></ul> </li>
<li>Audio ：音频轨道。音频轨道由以下 Item 组成：<ul><li>AudioTrackItem</li><li>MediaTransitionItem</li><li>EmptyTrackItem</li></ul></li>
<li>Sticker ：贴图轨道。贴图轨道以下 Item 组成：<ul><li> StickerTrackItem</li><li>EmptyTrackItem</li></ul></li>	
</ul> 
     * @return Type 轨道类型，取值有：
<ul>
<li>Video ：视频轨道。视频轨道由以下 Item 组成：<ul><li>VideoTrackItem</li><li>MediaTransitionItem</li> <li>EmptyTrackItem</li></ul> </li>
<li>Audio ：音频轨道。音频轨道由以下 Item 组成：<ul><li>AudioTrackItem</li><li>MediaTransitionItem</li><li>EmptyTrackItem</li></ul></li>
<li>Sticker ：贴图轨道。贴图轨道以下 Item 组成：<ul><li> StickerTrackItem</li><li>EmptyTrackItem</li></ul></li>	
</ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 轨道类型，取值有：
<ul>
<li>Video ：视频轨道。视频轨道由以下 Item 组成：<ul><li>VideoTrackItem</li><li>MediaTransitionItem</li> <li>EmptyTrackItem</li></ul> </li>
<li>Audio ：音频轨道。音频轨道由以下 Item 组成：<ul><li>AudioTrackItem</li><li>MediaTransitionItem</li><li>EmptyTrackItem</li></ul></li>
<li>Sticker ：贴图轨道。贴图轨道以下 Item 组成：<ul><li> StickerTrackItem</li><li>EmptyTrackItem</li></ul></li>	
</ul>
     * @param Type 轨道类型，取值有：
<ul>
<li>Video ：视频轨道。视频轨道由以下 Item 组成：<ul><li>VideoTrackItem</li><li>MediaTransitionItem</li> <li>EmptyTrackItem</li></ul> </li>
<li>Audio ：音频轨道。音频轨道由以下 Item 组成：<ul><li>AudioTrackItem</li><li>MediaTransitionItem</li><li>EmptyTrackItem</li></ul></li>
<li>Sticker ：贴图轨道。贴图轨道以下 Item 组成：<ul><li> StickerTrackItem</li><li>EmptyTrackItem</li></ul></li>	
</ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 轨道上的媒体片段列表。 
     * @return TrackItems 轨道上的媒体片段列表。
     */
    public MediaTrackItem [] getTrackItems() {
        return this.TrackItems;
    }

    /**
     * Set 轨道上的媒体片段列表。
     * @param TrackItems 轨道上的媒体片段列表。
     */
    public void setTrackItems(MediaTrackItem [] TrackItems) {
        this.TrackItems = TrackItems;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "TrackItems.", this.TrackItems);

    }
}

