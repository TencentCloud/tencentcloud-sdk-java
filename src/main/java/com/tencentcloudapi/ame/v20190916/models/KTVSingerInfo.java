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

public class KTVSingerInfo extends AbstractModel{

    /**
    * 歌手id
    */
    @SerializedName("SingerId")
    @Expose
    private String SingerId;

    /**
    * 歌手名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 歌手性别: 男，女，组合
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * 地区: 大陆，港台，欧美，日本
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 歌曲数
    */
    @SerializedName("MusicCount")
    @Expose
    private Long MusicCount;

    /**
    * 歌曲总播放次数
    */
    @SerializedName("PlayCount")
    @Expose
    private Long PlayCount;

    /**
     * Get 歌手id 
     * @return SingerId 歌手id
     */
    public String getSingerId() {
        return this.SingerId;
    }

    /**
     * Set 歌手id
     * @param SingerId 歌手id
     */
    public void setSingerId(String SingerId) {
        this.SingerId = SingerId;
    }

    /**
     * Get 歌手名 
     * @return Name 歌手名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 歌手名
     * @param Name 歌手名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 歌手性别: 男，女，组合 
     * @return Gender 歌手性别: 男，女，组合
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set 歌手性别: 男，女，组合
     * @param Gender 歌手性别: 男，女，组合
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 地区: 大陆，港台，欧美，日本 
     * @return Area 地区: 大陆，港台，欧美，日本
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地区: 大陆，港台，欧美，日本
     * @param Area 地区: 大陆，港台，欧美，日本
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 歌曲数 
     * @return MusicCount 歌曲数
     */
    public Long getMusicCount() {
        return this.MusicCount;
    }

    /**
     * Set 歌曲数
     * @param MusicCount 歌曲数
     */
    public void setMusicCount(Long MusicCount) {
        this.MusicCount = MusicCount;
    }

    /**
     * Get 歌曲总播放次数 
     * @return PlayCount 歌曲总播放次数
     */
    public Long getPlayCount() {
        return this.PlayCount;
    }

    /**
     * Set 歌曲总播放次数
     * @param PlayCount 歌曲总播放次数
     */
    public void setPlayCount(Long PlayCount) {
        this.PlayCount = PlayCount;
    }

    public KTVSingerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KTVSingerInfo(KTVSingerInfo source) {
        if (source.SingerId != null) {
            this.SingerId = new String(source.SingerId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.MusicCount != null) {
            this.MusicCount = new Long(source.MusicCount);
        }
        if (source.PlayCount != null) {
            this.PlayCount = new Long(source.PlayCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SingerId", this.SingerId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "MusicCount", this.MusicCount);
        this.setParamSimple(map, prefix + "PlayCount", this.PlayCount);

    }
}

