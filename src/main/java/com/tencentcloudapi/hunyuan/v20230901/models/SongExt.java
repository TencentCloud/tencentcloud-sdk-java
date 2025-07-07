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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SongExt extends AbstractModel {

    /**
    * 歌曲id
    */
    @SerializedName("SongId")
    @Expose
    private Long SongId;

    /**
    * 歌曲mid
    */
    @SerializedName("SongMid")
    @Expose
    private String SongMid;

    /**
    * 歌曲是否为vip。1：vip歌曲； 0：普通歌曲。
    */
    @SerializedName("Vip")
    @Expose
    private Long Vip;

    /**
     * Get 歌曲id 
     * @return SongId 歌曲id
     */
    public Long getSongId() {
        return this.SongId;
    }

    /**
     * Set 歌曲id
     * @param SongId 歌曲id
     */
    public void setSongId(Long SongId) {
        this.SongId = SongId;
    }

    /**
     * Get 歌曲mid 
     * @return SongMid 歌曲mid
     */
    public String getSongMid() {
        return this.SongMid;
    }

    /**
     * Set 歌曲mid
     * @param SongMid 歌曲mid
     */
    public void setSongMid(String SongMid) {
        this.SongMid = SongMid;
    }

    /**
     * Get 歌曲是否为vip。1：vip歌曲； 0：普通歌曲。 
     * @return Vip 歌曲是否为vip。1：vip歌曲； 0：普通歌曲。
     */
    public Long getVip() {
        return this.Vip;
    }

    /**
     * Set 歌曲是否为vip。1：vip歌曲； 0：普通歌曲。
     * @param Vip 歌曲是否为vip。1：vip歌曲； 0：普通歌曲。
     */
    public void setVip(Long Vip) {
        this.Vip = Vip;
    }

    public SongExt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SongExt(SongExt source) {
        if (source.SongId != null) {
            this.SongId = new Long(source.SongId);
        }
        if (source.SongMid != null) {
            this.SongMid = new String(source.SongMid);
        }
        if (source.Vip != null) {
            this.Vip = new Long(source.Vip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SongId", this.SongId);
        this.setParamSimple(map, prefix + "SongMid", this.SongMid);
        this.setParamSimple(map, prefix + "Vip", this.Vip);

    }
}

