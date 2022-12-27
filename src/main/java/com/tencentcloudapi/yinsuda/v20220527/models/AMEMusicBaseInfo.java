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

public class AMEMusicBaseInfo extends AbstractModel{

    /**
    * 歌曲 Id。
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
    * 歌手列表。
    */
    @SerializedName("SingerSet")
    @Expose
    private String [] SingerSet;

    /**
     * Get 歌曲 Id。 
     * @return MusicId 歌曲 Id。
     */
    public String getMusicId() {
        return this.MusicId;
    }

    /**
     * Set 歌曲 Id。
     * @param MusicId 歌曲 Id。
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
     * Get 歌手列表。 
     * @return SingerSet 歌手列表。
     */
    public String [] getSingerSet() {
        return this.SingerSet;
    }

    /**
     * Set 歌手列表。
     * @param SingerSet 歌手列表。
     */
    public void setSingerSet(String [] SingerSet) {
        this.SingerSet = SingerSet;
    }

    public AMEMusicBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AMEMusicBaseInfo(AMEMusicBaseInfo source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MusicId", this.MusicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "SingerSet.", this.SingerSet);

    }
}

