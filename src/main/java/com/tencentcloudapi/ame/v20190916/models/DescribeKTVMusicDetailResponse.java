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

public class DescribeKTVMusicDetailResponse extends AbstractModel{

    /**
    * 歌曲基础信息
    */
    @SerializedName("KTVMusicBaseInfo")
    @Expose
    private KTVMusicBaseInfo KTVMusicBaseInfo;

    /**
    * 播放凭证
    */
    @SerializedName("PlayToken")
    @Expose
    private String PlayToken;

    /**
    * 歌词下载地址
    */
    @SerializedName("LyricsUrl")
    @Expose
    private String LyricsUrl;

    /**
    * 歌曲规格信息列表
    */
    @SerializedName("DefinitionInfoSet")
    @Expose
    private KTVMusicDefinitionInfo [] DefinitionInfoSet;

    /**
    * 音高数据文件下载地址
    */
    @SerializedName("MidiJsonUrl")
    @Expose
    private String MidiJsonUrl;

    /**
    * 副歌片段数据列表
    */
    @SerializedName("ChorusClipSet")
    @Expose
    private ChorusClip [] ChorusClipSet;

    /**
    * 前奏间隔，单位：毫秒；注：若参数返回为0则无人声部分
    */
    @SerializedName("PreludeInterval")
    @Expose
    private Long PreludeInterval;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 歌曲基础信息 
     * @return KTVMusicBaseInfo 歌曲基础信息
     */
    public KTVMusicBaseInfo getKTVMusicBaseInfo() {
        return this.KTVMusicBaseInfo;
    }

    /**
     * Set 歌曲基础信息
     * @param KTVMusicBaseInfo 歌曲基础信息
     */
    public void setKTVMusicBaseInfo(KTVMusicBaseInfo KTVMusicBaseInfo) {
        this.KTVMusicBaseInfo = KTVMusicBaseInfo;
    }

    /**
     * Get 播放凭证 
     * @return PlayToken 播放凭证
     */
    public String getPlayToken() {
        return this.PlayToken;
    }

    /**
     * Set 播放凭证
     * @param PlayToken 播放凭证
     */
    public void setPlayToken(String PlayToken) {
        this.PlayToken = PlayToken;
    }

    /**
     * Get 歌词下载地址 
     * @return LyricsUrl 歌词下载地址
     */
    public String getLyricsUrl() {
        return this.LyricsUrl;
    }

    /**
     * Set 歌词下载地址
     * @param LyricsUrl 歌词下载地址
     */
    public void setLyricsUrl(String LyricsUrl) {
        this.LyricsUrl = LyricsUrl;
    }

    /**
     * Get 歌曲规格信息列表 
     * @return DefinitionInfoSet 歌曲规格信息列表
     */
    public KTVMusicDefinitionInfo [] getDefinitionInfoSet() {
        return this.DefinitionInfoSet;
    }

    /**
     * Set 歌曲规格信息列表
     * @param DefinitionInfoSet 歌曲规格信息列表
     */
    public void setDefinitionInfoSet(KTVMusicDefinitionInfo [] DefinitionInfoSet) {
        this.DefinitionInfoSet = DefinitionInfoSet;
    }

    /**
     * Get 音高数据文件下载地址 
     * @return MidiJsonUrl 音高数据文件下载地址
     */
    public String getMidiJsonUrl() {
        return this.MidiJsonUrl;
    }

    /**
     * Set 音高数据文件下载地址
     * @param MidiJsonUrl 音高数据文件下载地址
     */
    public void setMidiJsonUrl(String MidiJsonUrl) {
        this.MidiJsonUrl = MidiJsonUrl;
    }

    /**
     * Get 副歌片段数据列表 
     * @return ChorusClipSet 副歌片段数据列表
     */
    public ChorusClip [] getChorusClipSet() {
        return this.ChorusClipSet;
    }

    /**
     * Set 副歌片段数据列表
     * @param ChorusClipSet 副歌片段数据列表
     */
    public void setChorusClipSet(ChorusClip [] ChorusClipSet) {
        this.ChorusClipSet = ChorusClipSet;
    }

    /**
     * Get 前奏间隔，单位：毫秒；注：若参数返回为0则无人声部分 
     * @return PreludeInterval 前奏间隔，单位：毫秒；注：若参数返回为0则无人声部分
     */
    public Long getPreludeInterval() {
        return this.PreludeInterval;
    }

    /**
     * Set 前奏间隔，单位：毫秒；注：若参数返回为0则无人声部分
     * @param PreludeInterval 前奏间隔，单位：毫秒；注：若参数返回为0则无人声部分
     */
    public void setPreludeInterval(Long PreludeInterval) {
        this.PreludeInterval = PreludeInterval;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeKTVMusicDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKTVMusicDetailResponse(DescribeKTVMusicDetailResponse source) {
        if (source.KTVMusicBaseInfo != null) {
            this.KTVMusicBaseInfo = new KTVMusicBaseInfo(source.KTVMusicBaseInfo);
        }
        if (source.PlayToken != null) {
            this.PlayToken = new String(source.PlayToken);
        }
        if (source.LyricsUrl != null) {
            this.LyricsUrl = new String(source.LyricsUrl);
        }
        if (source.DefinitionInfoSet != null) {
            this.DefinitionInfoSet = new KTVMusicDefinitionInfo[source.DefinitionInfoSet.length];
            for (int i = 0; i < source.DefinitionInfoSet.length; i++) {
                this.DefinitionInfoSet[i] = new KTVMusicDefinitionInfo(source.DefinitionInfoSet[i]);
            }
        }
        if (source.MidiJsonUrl != null) {
            this.MidiJsonUrl = new String(source.MidiJsonUrl);
        }
        if (source.ChorusClipSet != null) {
            this.ChorusClipSet = new ChorusClip[source.ChorusClipSet.length];
            for (int i = 0; i < source.ChorusClipSet.length; i++) {
                this.ChorusClipSet[i] = new ChorusClip(source.ChorusClipSet[i]);
            }
        }
        if (source.PreludeInterval != null) {
            this.PreludeInterval = new Long(source.PreludeInterval);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "KTVMusicBaseInfo.", this.KTVMusicBaseInfo);
        this.setParamSimple(map, prefix + "PlayToken", this.PlayToken);
        this.setParamSimple(map, prefix + "LyricsUrl", this.LyricsUrl);
        this.setParamArrayObj(map, prefix + "DefinitionInfoSet.", this.DefinitionInfoSet);
        this.setParamSimple(map, prefix + "MidiJsonUrl", this.MidiJsonUrl);
        this.setParamArrayObj(map, prefix + "ChorusClipSet.", this.ChorusClipSet);
        this.setParamSimple(map, prefix + "PreludeInterval", this.PreludeInterval);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

