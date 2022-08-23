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

public class KTVMatchRuleMusicInfo extends AbstractModel{

    /**
    * 歌曲名称。
    */
    @SerializedName("MusicName")
    @Expose
    private String MusicName;

    /**
    * 歌手列表。
    */
    @SerializedName("SingerSet")
    @Expose
    private String [] SingerSet;

    /**
     * Get 歌曲名称。 
     * @return MusicName 歌曲名称。
     */
    public String getMusicName() {
        return this.MusicName;
    }

    /**
     * Set 歌曲名称。
     * @param MusicName 歌曲名称。
     */
    public void setMusicName(String MusicName) {
        this.MusicName = MusicName;
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

    public KTVMatchRuleMusicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KTVMatchRuleMusicInfo(KTVMatchRuleMusicInfo source) {
        if (source.MusicName != null) {
            this.MusicName = new String(source.MusicName);
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
        this.setParamSimple(map, prefix + "MusicName", this.MusicName);
        this.setParamArraySimple(map, prefix + "SingerSet.", this.SingerSet);

    }
}

