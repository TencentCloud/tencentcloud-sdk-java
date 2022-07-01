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
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KTVMusicDetailInfo extends AbstractModel{

    /**
    * 歌曲基础信息。
    */
    @SerializedName("KTVMusicBaseInfo")
    @Expose
    private KTVMusicBaseInfo KTVMusicBaseInfo;

    /**
    * 播放凭证。
    */
    @SerializedName("PlayToken")
    @Expose
    private String PlayToken;

    /**
    * 歌词下载链接。
    */
    @SerializedName("LyricsUrl")
    @Expose
    private String LyricsUrl;

    /**
    * 音高数据下载链接。
    */
    @SerializedName("MidiUrl")
    @Expose
    private String MidiUrl;

    /**
    * 副歌片段信息。
    */
    @SerializedName("ChorusClipSet")
    @Expose
    private ChorusClip [] ChorusClipSet;

    /**
     * Get 歌曲基础信息。 
     * @return KTVMusicBaseInfo 歌曲基础信息。
     */
    public KTVMusicBaseInfo getKTVMusicBaseInfo() {
        return this.KTVMusicBaseInfo;
    }

    /**
     * Set 歌曲基础信息。
     * @param KTVMusicBaseInfo 歌曲基础信息。
     */
    public void setKTVMusicBaseInfo(KTVMusicBaseInfo KTVMusicBaseInfo) {
        this.KTVMusicBaseInfo = KTVMusicBaseInfo;
    }

    /**
     * Get 播放凭证。 
     * @return PlayToken 播放凭证。
     */
    public String getPlayToken() {
        return this.PlayToken;
    }

    /**
     * Set 播放凭证。
     * @param PlayToken 播放凭证。
     */
    public void setPlayToken(String PlayToken) {
        this.PlayToken = PlayToken;
    }

    /**
     * Get 歌词下载链接。 
     * @return LyricsUrl 歌词下载链接。
     */
    public String getLyricsUrl() {
        return this.LyricsUrl;
    }

    /**
     * Set 歌词下载链接。
     * @param LyricsUrl 歌词下载链接。
     */
    public void setLyricsUrl(String LyricsUrl) {
        this.LyricsUrl = LyricsUrl;
    }

    /**
     * Get 音高数据下载链接。 
     * @return MidiUrl 音高数据下载链接。
     */
    public String getMidiUrl() {
        return this.MidiUrl;
    }

    /**
     * Set 音高数据下载链接。
     * @param MidiUrl 音高数据下载链接。
     */
    public void setMidiUrl(String MidiUrl) {
        this.MidiUrl = MidiUrl;
    }

    /**
     * Get 副歌片段信息。 
     * @return ChorusClipSet 副歌片段信息。
     */
    public ChorusClip [] getChorusClipSet() {
        return this.ChorusClipSet;
    }

    /**
     * Set 副歌片段信息。
     * @param ChorusClipSet 副歌片段信息。
     */
    public void setChorusClipSet(ChorusClip [] ChorusClipSet) {
        this.ChorusClipSet = ChorusClipSet;
    }

    public KTVMusicDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KTVMusicDetailInfo(KTVMusicDetailInfo source) {
        if (source.KTVMusicBaseInfo != null) {
            this.KTVMusicBaseInfo = new KTVMusicBaseInfo(source.KTVMusicBaseInfo);
        }
        if (source.PlayToken != null) {
            this.PlayToken = new String(source.PlayToken);
        }
        if (source.LyricsUrl != null) {
            this.LyricsUrl = new String(source.LyricsUrl);
        }
        if (source.MidiUrl != null) {
            this.MidiUrl = new String(source.MidiUrl);
        }
        if (source.ChorusClipSet != null) {
            this.ChorusClipSet = new ChorusClip[source.ChorusClipSet.length];
            for (int i = 0; i < source.ChorusClipSet.length; i++) {
                this.ChorusClipSet[i] = new ChorusClip(source.ChorusClipSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "KTVMusicBaseInfo.", this.KTVMusicBaseInfo);
        this.setParamSimple(map, prefix + "PlayToken", this.PlayToken);
        this.setParamSimple(map, prefix + "LyricsUrl", this.LyricsUrl);
        this.setParamSimple(map, prefix + "MidiUrl", this.MidiUrl);
        this.setParamArrayObj(map, prefix + "ChorusClipSet.", this.ChorusClipSet);

    }
}

