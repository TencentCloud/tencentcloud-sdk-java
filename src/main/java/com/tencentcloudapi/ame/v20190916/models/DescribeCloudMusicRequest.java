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
    * MP3-320K-FTD-P  为获取320kbps歌曲热门片段。
MP3-320K-FTD 为获取320kbps已核验歌曲完整资源。
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
     * Get MP3-320K-FTD-P  为获取320kbps歌曲热门片段。
MP3-320K-FTD 为获取320kbps已核验歌曲完整资源。 
     * @return MusicType MP3-320K-FTD-P  为获取320kbps歌曲热门片段。
MP3-320K-FTD 为获取320kbps已核验歌曲完整资源。
     */
    public String getMusicType() {
        return this.MusicType;
    }

    /**
     * Set MP3-320K-FTD-P  为获取320kbps歌曲热门片段。
MP3-320K-FTD 为获取320kbps已核验歌曲完整资源。
     * @param MusicType MP3-320K-FTD-P  为获取320kbps歌曲热门片段。
MP3-320K-FTD 为获取320kbps已核验歌曲完整资源。
     */
    public void setMusicType(String MusicType) {
        this.MusicType = MusicType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MusicId", this.MusicId);
        this.setParamSimple(map, prefix + "MusicType", this.MusicType);

    }
}

