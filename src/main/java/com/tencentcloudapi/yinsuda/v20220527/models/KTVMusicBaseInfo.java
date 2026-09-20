/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KTVMusicBaseInfo extends AbstractModel {

    /**
    * <p>歌曲Id。</p>
    */
    @SerializedName("MusicId")
    @Expose
    private String MusicId;

    /**
    * <p>歌曲名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>歌手名称。</p>
    */
    @SerializedName("SingerSet")
    @Expose
    private String [] SingerSet;

    /**
    * <p>播放时长。</p><p>单位：秒</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>歌手图片链接。</p>
    */
    @SerializedName("SingerImageUrl")
    @Expose
    private String SingerImageUrl;

    /**
    * <p>专辑信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlbumInfo")
    @Expose
    private MusicAlbumInfo AlbumInfo;

    /**
    * <p>权益列表，取值有：</p><li>Play：可播；</li><li>Sing：可唱。</li>
    */
    @SerializedName("RightSet")
    @Expose
    private String [] RightSet;

    /**
    * <p>推荐类型，取值有：</p><li>Featured：精选；</li><li>Other：其他。</li>
    */
    @SerializedName("RecommendType")
    @Expose
    private String RecommendType;

    /**
     * Get <p>歌曲Id。</p> 
     * @return MusicId <p>歌曲Id。</p>
     */
    public String getMusicId() {
        return this.MusicId;
    }

    /**
     * Set <p>歌曲Id。</p>
     * @param MusicId <p>歌曲Id。</p>
     */
    public void setMusicId(String MusicId) {
        this.MusicId = MusicId;
    }

    /**
     * Get <p>歌曲名称。</p> 
     * @return Name <p>歌曲名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>歌曲名称。</p>
     * @param Name <p>歌曲名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>歌手名称。</p> 
     * @return SingerSet <p>歌手名称。</p>
     */
    public String [] getSingerSet() {
        return this.SingerSet;
    }

    /**
     * Set <p>歌手名称。</p>
     * @param SingerSet <p>歌手名称。</p>
     */
    public void setSingerSet(String [] SingerSet) {
        this.SingerSet = SingerSet;
    }

    /**
     * Get <p>播放时长。</p><p>单位：秒</p> 
     * @return Duration <p>播放时长。</p><p>单位：秒</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>播放时长。</p><p>单位：秒</p>
     * @param Duration <p>播放时长。</p><p>单位：秒</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>歌手图片链接。</p> 
     * @return SingerImageUrl <p>歌手图片链接。</p>
     */
    public String getSingerImageUrl() {
        return this.SingerImageUrl;
    }

    /**
     * Set <p>歌手图片链接。</p>
     * @param SingerImageUrl <p>歌手图片链接。</p>
     */
    public void setSingerImageUrl(String SingerImageUrl) {
        this.SingerImageUrl = SingerImageUrl;
    }

    /**
     * Get <p>专辑信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlbumInfo <p>专辑信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MusicAlbumInfo getAlbumInfo() {
        return this.AlbumInfo;
    }

    /**
     * Set <p>专辑信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlbumInfo <p>专辑信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlbumInfo(MusicAlbumInfo AlbumInfo) {
        this.AlbumInfo = AlbumInfo;
    }

    /**
     * Get <p>权益列表，取值有：</p><li>Play：可播；</li><li>Sing：可唱。</li> 
     * @return RightSet <p>权益列表，取值有：</p><li>Play：可播；</li><li>Sing：可唱。</li>
     */
    public String [] getRightSet() {
        return this.RightSet;
    }

    /**
     * Set <p>权益列表，取值有：</p><li>Play：可播；</li><li>Sing：可唱。</li>
     * @param RightSet <p>权益列表，取值有：</p><li>Play：可播；</li><li>Sing：可唱。</li>
     */
    public void setRightSet(String [] RightSet) {
        this.RightSet = RightSet;
    }

    /**
     * Get <p>推荐类型，取值有：</p><li>Featured：精选；</li><li>Other：其他。</li> 
     * @return RecommendType <p>推荐类型，取值有：</p><li>Featured：精选；</li><li>Other：其他。</li>
     */
    public String getRecommendType() {
        return this.RecommendType;
    }

    /**
     * Set <p>推荐类型，取值有：</p><li>Featured：精选；</li><li>Other：其他。</li>
     * @param RecommendType <p>推荐类型，取值有：</p><li>Featured：精选；</li><li>Other：其他。</li>
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

