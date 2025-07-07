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

public class KTVMatchRule extends AbstractModel {

    /**
    * AME 曲库 Id。
    */
    @SerializedName("AMEMusicId")
    @Expose
    private String AMEMusicId;

    /**
    * 歌曲匹配信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MusicInfo")
    @Expose
    private KTVMatchRuleMusicInfo MusicInfo;

    /**
    * 音速达歌曲 Id，用于匹配 AME 曲库歌曲。
    */
    @SerializedName("MusicIdToMatchAME")
    @Expose
    private String MusicIdToMatchAME;

    /**
     * Get AME 曲库 Id。 
     * @return AMEMusicId AME 曲库 Id。
     */
    public String getAMEMusicId() {
        return this.AMEMusicId;
    }

    /**
     * Set AME 曲库 Id。
     * @param AMEMusicId AME 曲库 Id。
     */
    public void setAMEMusicId(String AMEMusicId) {
        this.AMEMusicId = AMEMusicId;
    }

    /**
     * Get 歌曲匹配信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MusicInfo 歌曲匹配信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KTVMatchRuleMusicInfo getMusicInfo() {
        return this.MusicInfo;
    }

    /**
     * Set 歌曲匹配信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MusicInfo 歌曲匹配信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMusicInfo(KTVMatchRuleMusicInfo MusicInfo) {
        this.MusicInfo = MusicInfo;
    }

    /**
     * Get 音速达歌曲 Id，用于匹配 AME 曲库歌曲。 
     * @return MusicIdToMatchAME 音速达歌曲 Id，用于匹配 AME 曲库歌曲。
     */
    public String getMusicIdToMatchAME() {
        return this.MusicIdToMatchAME;
    }

    /**
     * Set 音速达歌曲 Id，用于匹配 AME 曲库歌曲。
     * @param MusicIdToMatchAME 音速达歌曲 Id，用于匹配 AME 曲库歌曲。
     */
    public void setMusicIdToMatchAME(String MusicIdToMatchAME) {
        this.MusicIdToMatchAME = MusicIdToMatchAME;
    }

    public KTVMatchRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KTVMatchRule(KTVMatchRule source) {
        if (source.AMEMusicId != null) {
            this.AMEMusicId = new String(source.AMEMusicId);
        }
        if (source.MusicInfo != null) {
            this.MusicInfo = new KTVMatchRuleMusicInfo(source.MusicInfo);
        }
        if (source.MusicIdToMatchAME != null) {
            this.MusicIdToMatchAME = new String(source.MusicIdToMatchAME);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AMEMusicId", this.AMEMusicId);
        this.setParamObj(map, prefix + "MusicInfo.", this.MusicInfo);
        this.setParamSimple(map, prefix + "MusicIdToMatchAME", this.MusicIdToMatchAME);

    }
}

