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

public class KTVMusicBaseInfo extends AbstractModel{

    /**
    * 歌曲Id。
    */
    @SerializedName("MusicId")
    @Expose
    private String MusicId;

    /**
    * 歌曲名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 歌手名称。
    */
    @SerializedName("SingerSet")
    @Expose
    private String [] SingerSet;

    /**
    * 播放时长。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 歌手图片链接。
    */
    @SerializedName("SingerImageUrl")
    @Expose
    private String SingerImageUrl;

    /**
    * 专辑信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlbumInfo")
    @Expose
    private MusicAlbumInfo AlbumInfo;

    /**
    * 权益列表，取值有：
<li>Play：可播；</li>
<li>Sing：可唱。</li>
    */
    @SerializedName("RightSet")
    @Expose
    private String [] RightSet;

    /**
    * 推荐类型，取值有：
<li>Featured：精选；</li>
<li>Other：其他。</li>
    */
    @SerializedName("RecommendType")
    @Expose
    private String RecommendType;

    /**
     * Get 歌曲Id。 
     * @return MusicId 歌曲Id。
     */
    public String getMusicId() {
        return this.MusicId;
    }

    /**
     * Set 歌曲Id。
     * @param MusicId 歌曲Id。
     */
    public void setMusicId(String MusicId) {
        this.MusicId = MusicId;
    }

    /**
     * Get 歌曲名称。 
     * @return Name 歌曲名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 歌曲名称。
     * @param Name 歌曲名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 歌手名称。 
     * @return SingerSet 歌手名称。
     */
    public String [] getSingerSet() {
        return this.SingerSet;
    }

    /**
     * Set 歌手名称。
     * @param SingerSet 歌手名称。
     */
    public void setSingerSet(String [] SingerSet) {
        this.SingerSet = SingerSet;
    }

    /**
     * Get 播放时长。 
     * @return Duration 播放时长。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 播放时长。
     * @param Duration 播放时长。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 歌手图片链接。 
     * @return SingerImageUrl 歌手图片链接。
     */
    public String getSingerImageUrl() {
        return this.SingerImageUrl;
    }

    /**
     * Set 歌手图片链接。
     * @param SingerImageUrl 歌手图片链接。
     */
    public void setSingerImageUrl(String SingerImageUrl) {
        this.SingerImageUrl = SingerImageUrl;
    }

    /**
     * Get 专辑信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlbumInfo 专辑信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MusicAlbumInfo getAlbumInfo() {
        return this.AlbumInfo;
    }

    /**
     * Set 专辑信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlbumInfo 专辑信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlbumInfo(MusicAlbumInfo AlbumInfo) {
        this.AlbumInfo = AlbumInfo;
    }

    /**
     * Get 权益列表，取值有：
<li>Play：可播；</li>
<li>Sing：可唱。</li> 
     * @return RightSet 权益列表，取值有：
<li>Play：可播；</li>
<li>Sing：可唱。</li>
     */
    public String [] getRightSet() {
        return this.RightSet;
    }

    /**
     * Set 权益列表，取值有：
<li>Play：可播；</li>
<li>Sing：可唱。</li>
     * @param RightSet 权益列表，取值有：
<li>Play：可播；</li>
<li>Sing：可唱。</li>
     */
    public void setRightSet(String [] RightSet) {
        this.RightSet = RightSet;
    }

    /**
     * Get 推荐类型，取值有：
<li>Featured：精选；</li>
<li>Other：其他。</li> 
     * @return RecommendType 推荐类型，取值有：
<li>Featured：精选；</li>
<li>Other：其他。</li>
     */
    public String getRecommendType() {
        return this.RecommendType;
    }

    /**
     * Set 推荐类型，取值有：
<li>Featured：精选；</li>
<li>Other：其他。</li>
     * @param RecommendType 推荐类型，取值有：
<li>Featured：精选；</li>
<li>Other：其他。</li>
     */
    public void setRecommendType(String RecommendType) {
        this.RecommendType = RecommendType;
    }

    public KTVMusicBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KTVMusicBaseInfo(KTVMusicBaseInfo source) {
        if (source.MusicId != null) {
            this.MusicId = new String(source.MusicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SingerSet != null) {
            this.SingerSet = new String[source.SingerSet.length];
            for (int i = 0; i < source.SingerSet.length; i++) {
                this.SingerSet[i] = new String(source.SingerSet[i]);
            }
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.SingerImageUrl != null) {
            this.SingerImageUrl = new String(source.SingerImageUrl);
        }
        if (source.AlbumInfo != null) {
            this.AlbumInfo = new MusicAlbumInfo(source.AlbumInfo);
        }
        if (source.RightSet != null) {
            this.RightSet = new String[source.RightSet.length];
            for (int i = 0; i < source.RightSet.length; i++) {
                this.RightSet[i] = new String(source.RightSet[i]);
            }
        }
        if (source.RecommendType != null) {
            this.RecommendType = new String(source.RecommendType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MusicId", this.MusicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "SingerSet.", this.SingerSet);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "SingerImageUrl", this.SingerImageUrl);
        this.setParamObj(map, prefix + "AlbumInfo.", this.AlbumInfo);
        this.setParamArraySimple(map, prefix + "RightSet.", this.RightSet);
        this.setParamSimple(map, prefix + "RecommendType", this.RecommendType);

    }
}

