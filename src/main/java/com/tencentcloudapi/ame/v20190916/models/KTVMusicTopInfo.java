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

public class KTVMusicTopInfo extends AbstractModel{

    /**
    * 歌曲Id
    */
    @SerializedName("MusicId")
    @Expose
    private String MusicId;

    /**
    * 歌曲名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 歌手名称列表
    */
    @SerializedName("SingerInfoSet")
    @Expose
    private KTVSingerBaseInfo [] SingerInfoSet;

    /**
    * 歌词名称列表
    */
    @SerializedName("LyricistSet")
    @Expose
    private String [] LyricistSet;

    /**
    * 作曲列表
    */
    @SerializedName("ComposerSet")
    @Expose
    private String [] ComposerSet;

    /**
    * 标签列表
    */
    @SerializedName("TagSet")
    @Expose
    private String [] TagSet;

    /**
    * 播放时长
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

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
     * Get 歌曲名称 
     * @return Name 歌曲名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 歌曲名称
     * @param Name 歌曲名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 歌手名称列表 
     * @return SingerInfoSet 歌手名称列表
     */
    public KTVSingerBaseInfo [] getSingerInfoSet() {
        return this.SingerInfoSet;
    }

    /**
     * Set 歌手名称列表
     * @param SingerInfoSet 歌手名称列表
     */
    public void setSingerInfoSet(KTVSingerBaseInfo [] SingerInfoSet) {
        this.SingerInfoSet = SingerInfoSet;
    }

    /**
     * Get 歌词名称列表 
     * @return LyricistSet 歌词名称列表
     */
    public String [] getLyricistSet() {
        return this.LyricistSet;
    }

    /**
     * Set 歌词名称列表
     * @param LyricistSet 歌词名称列表
     */
    public void setLyricistSet(String [] LyricistSet) {
        this.LyricistSet = LyricistSet;
    }

    /**
     * Get 作曲列表 
     * @return ComposerSet 作曲列表
     */
    public String [] getComposerSet() {
        return this.ComposerSet;
    }

    /**
     * Set 作曲列表
     * @param ComposerSet 作曲列表
     */
    public void setComposerSet(String [] ComposerSet) {
        this.ComposerSet = ComposerSet;
    }

    /**
     * Get 标签列表 
     * @return TagSet 标签列表
     */
    public String [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签列表
     * @param TagSet 标签列表
     */
    public void setTagSet(String [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 播放时长 
     * @return Duration 播放时长
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 播放时长
     * @param Duration 播放时长
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    public KTVMusicTopInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KTVMusicTopInfo(KTVMusicTopInfo source) {
        if (source.MusicId != null) {
            this.MusicId = new String(source.MusicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SingerInfoSet != null) {
            this.SingerInfoSet = new KTVSingerBaseInfo[source.SingerInfoSet.length];
            for (int i = 0; i < source.SingerInfoSet.length; i++) {
                this.SingerInfoSet[i] = new KTVSingerBaseInfo(source.SingerInfoSet[i]);
            }
        }
        if (source.LyricistSet != null) {
            this.LyricistSet = new String[source.LyricistSet.length];
            for (int i = 0; i < source.LyricistSet.length; i++) {
                this.LyricistSet[i] = new String(source.LyricistSet[i]);
            }
        }
        if (source.ComposerSet != null) {
            this.ComposerSet = new String[source.ComposerSet.length];
            for (int i = 0; i < source.ComposerSet.length; i++) {
                this.ComposerSet[i] = new String(source.ComposerSet[i]);
            }
        }
        if (source.TagSet != null) {
            this.TagSet = new String[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new String(source.TagSet[i]);
            }
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MusicId", this.MusicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "SingerInfoSet.", this.SingerInfoSet);
        this.setParamArraySimple(map, prefix + "LyricistSet.", this.LyricistSet);
        this.setParamArraySimple(map, prefix + "ComposerSet.", this.ComposerSet);
        this.setParamArraySimple(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

