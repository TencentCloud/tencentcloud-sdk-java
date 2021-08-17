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

public class MusicOpenDetail extends AbstractModel{

    /**
    * 音乐Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MusicId")
    @Expose
    private String MusicId;

    /**
    * 专辑名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlbumName")
    @Expose
    private String AlbumName;

    /**
    * 专辑图片路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlbumImageUrl")
    @Expose
    private String AlbumImageUrl;

    /**
    * 音乐名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MusicName")
    @Expose
    private String MusicName;

    /**
    * 音乐图片路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MusicImageUrl")
    @Expose
    private String MusicImageUrl;

    /**
    * 歌手
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Singers")
    @Expose
    private String [] Singers;

    /**
    * 播放时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 歌词url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LyricUrl")
    @Expose
    private String LyricUrl;

    /**
    * 波形图url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaveformUrl")
    @Expose
    private String WaveformUrl;

    /**
     * Get 音乐Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MusicId 音乐Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMusicId() {
        return this.MusicId;
    }

    /**
     * Set 音乐Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param MusicId 音乐Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMusicId(String MusicId) {
        this.MusicId = MusicId;
    }

    /**
     * Get 专辑名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlbumName 专辑名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlbumName() {
        return this.AlbumName;
    }

    /**
     * Set 专辑名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlbumName 专辑名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlbumName(String AlbumName) {
        this.AlbumName = AlbumName;
    }

    /**
     * Get 专辑图片路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlbumImageUrl 专辑图片路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlbumImageUrl() {
        return this.AlbumImageUrl;
    }

    /**
     * Set 专辑图片路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlbumImageUrl 专辑图片路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlbumImageUrl(String AlbumImageUrl) {
        this.AlbumImageUrl = AlbumImageUrl;
    }

    /**
     * Get 音乐名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MusicName 音乐名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMusicName() {
        return this.MusicName;
    }

    /**
     * Set 音乐名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param MusicName 音乐名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMusicName(String MusicName) {
        this.MusicName = MusicName;
    }

    /**
     * Get 音乐图片路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MusicImageUrl 音乐图片路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMusicImageUrl() {
        return this.MusicImageUrl;
    }

    /**
     * Set 音乐图片路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param MusicImageUrl 音乐图片路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMusicImageUrl(String MusicImageUrl) {
        this.MusicImageUrl = MusicImageUrl;
    }

    /**
     * Get 歌手
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Singers 歌手
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSingers() {
        return this.Singers;
    }

    /**
     * Set 歌手
注意：此字段可能返回 null，表示取不到有效值。
     * @param Singers 歌手
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSingers(String [] Singers) {
        this.Singers = Singers;
    }

    /**
     * Get 播放时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 播放时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 播放时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 播放时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 歌词url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LyricUrl 歌词url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLyricUrl() {
        return this.LyricUrl;
    }

    /**
     * Set 歌词url
注意：此字段可能返回 null，表示取不到有效值。
     * @param LyricUrl 歌词url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLyricUrl(String LyricUrl) {
        this.LyricUrl = LyricUrl;
    }

    /**
     * Get 波形图url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaveformUrl 波形图url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWaveformUrl() {
        return this.WaveformUrl;
    }

    /**
     * Set 波形图url
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaveformUrl 波形图url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaveformUrl(String WaveformUrl) {
        this.WaveformUrl = WaveformUrl;
    }

    public MusicOpenDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MusicOpenDetail(MusicOpenDetail source) {
        if (source.MusicId != null) {
            this.MusicId = new String(source.MusicId);
        }
        if (source.AlbumName != null) {
            this.AlbumName = new String(source.AlbumName);
        }
        if (source.AlbumImageUrl != null) {
            this.AlbumImageUrl = new String(source.AlbumImageUrl);
        }
        if (source.MusicName != null) {
            this.MusicName = new String(source.MusicName);
        }
        if (source.MusicImageUrl != null) {
            this.MusicImageUrl = new String(source.MusicImageUrl);
        }
        if (source.Singers != null) {
            this.Singers = new String[source.Singers.length];
            for (int i = 0; i < source.Singers.length; i++) {
                this.Singers[i] = new String(source.Singers[i]);
            }
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.LyricUrl != null) {
            this.LyricUrl = new String(source.LyricUrl);
        }
        if (source.WaveformUrl != null) {
            this.WaveformUrl = new String(source.WaveformUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MusicId", this.MusicId);
        this.setParamSimple(map, prefix + "AlbumName", this.AlbumName);
        this.setParamSimple(map, prefix + "AlbumImageUrl", this.AlbumImageUrl);
        this.setParamSimple(map, prefix + "MusicName", this.MusicName);
        this.setParamSimple(map, prefix + "MusicImageUrl", this.MusicImageUrl);
        this.setParamArraySimple(map, prefix + "Singers.", this.Singers);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "LyricUrl", this.LyricUrl);
        this.setParamSimple(map, prefix + "WaveformUrl", this.WaveformUrl);

    }
}

