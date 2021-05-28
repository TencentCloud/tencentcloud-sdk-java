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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudMusicRequest extends AbstractModel{

    /**
    * 歌曲Id
    */
    @SerializedName("MusicId")
    @Expose
    private String MusicId;

    /**
    * 歌曲类型，可选值有：
<li>MP3-128K-FTW：含有水印的试听资源；</li>
<li>MP3-320K-FTD-P：320kbps歌曲热门片段；</li>
<li>MP3-320K-FTD：320kbps已核验歌曲完整资源。</li>
默认为：MP3-128K-FTW
    */
    @SerializedName("MusicType")
    @Expose
    private String MusicType;

    /**
     * Get 歌曲Id 
     * @return MusicId 歌曲Id
     */
    public String getMusicId() {
        return this.MusicId;
    }

    /**
     * Set 歌曲Id
     * @param MusicId 歌曲Id
     */
    public void setMusicId(String MusicId) {
        this.MusicId = MusicId;
    }

    /**
     * Get 歌曲类型，可选值有：
<li>MP3-128K-FTW：含有水印的试听资源；</li>
<li>MP3-320K-FTD-P：320kbps歌曲热门片段；</li>
<li>MP3-320K-FTD：320kbps已核验歌曲完整资源。</li>
默认为：MP3-128K-FTW 
     * @return MusicType 歌曲类型，可选值有：
<li>MP3-128K-FTW：含有水印的试听资源；</li>
<li>MP3-320K-FTD-P：320kbps歌曲热门片段；</li>
<li>MP3-320K-FTD：320kbps已核验歌曲完整资源。</li>
默认为：MP3-128K-FTW
     */
    public String getMusicType() {
        return this.MusicType;
    }

    /**
     * Set 歌曲类型，可选值有：
<li>MP3-128K-FTW：含有水印的试听资源；</li>
<li>MP3-320K-FTD-P：320kbps歌曲热门片段；</li>
<li>MP3-320K-FTD：320kbps已核验歌曲完整资源。</li>
默认为：MP3-128K-FTW
     * @param MusicType 歌曲类型，可选值有：
<li>MP3-128K-FTW：含有水印的试听资源；</li>
<li>MP3-320K-FTD-P：320kbps歌曲热门片段；</li>
<li>MP3-320K-FTD：320kbps已核验歌曲完整资源。</li>
默认为：MP3-128K-FTW
     */
    public void setMusicType(String MusicType) {
        this.MusicType = MusicType;
    }

    public DescribeCloudMusicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudMusicRequest(DescribeCloudMusicRequest source) {
        if (source.MusicId != null) {
            this.MusicId = new String(source.MusicId);
        }
        if (source.MusicType != null) {
            this.MusicType = new String(source.MusicType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MusicId", this.MusicId);
        this.setParamSimple(map, prefix + "MusicType", this.MusicType);

    }
}

