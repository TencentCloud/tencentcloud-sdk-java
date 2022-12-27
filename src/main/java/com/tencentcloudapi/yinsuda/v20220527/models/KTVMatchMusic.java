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

public class KTVMatchMusic extends AbstractModel{

    /**
    * 匹配到的歌曲基础信息。
    */
    @SerializedName("KTVMusicBaseInfo")
    @Expose
    private KTVMusicBaseInfo KTVMusicBaseInfo;

    /**
    * 命中规则。
    */
    @SerializedName("MatchRule")
    @Expose
    private KTVMatchRule MatchRule;

    /**
    * AME 歌曲基础信息，仅在使用音速达歌曲 Id 匹配 AME 曲库时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AMEMusicBaseInfo")
    @Expose
    private AMEMusicBaseInfo AMEMusicBaseInfo;

    /**
     * Get 匹配到的歌曲基础信息。 
     * @return KTVMusicBaseInfo 匹配到的歌曲基础信息。
     */
    public KTVMusicBaseInfo getKTVMusicBaseInfo() {
        return this.KTVMusicBaseInfo;
    }

    /**
     * Set 匹配到的歌曲基础信息。
     * @param KTVMusicBaseInfo 匹配到的歌曲基础信息。
     */
    public void setKTVMusicBaseInfo(KTVMusicBaseInfo KTVMusicBaseInfo) {
        this.KTVMusicBaseInfo = KTVMusicBaseInfo;
    }

    /**
     * Get 命中规则。 
     * @return MatchRule 命中规则。
     */
    public KTVMatchRule getMatchRule() {
        return this.MatchRule;
    }

    /**
     * Set 命中规则。
     * @param MatchRule 命中规则。
     */
    public void setMatchRule(KTVMatchRule MatchRule) {
        this.MatchRule = MatchRule;
    }

    /**
     * Get AME 歌曲基础信息，仅在使用音速达歌曲 Id 匹配 AME 曲库时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AMEMusicBaseInfo AME 歌曲基础信息，仅在使用音速达歌曲 Id 匹配 AME 曲库时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AMEMusicBaseInfo getAMEMusicBaseInfo() {
        return this.AMEMusicBaseInfo;
    }

    /**
     * Set AME 歌曲基础信息，仅在使用音速达歌曲 Id 匹配 AME 曲库时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AMEMusicBaseInfo AME 歌曲基础信息，仅在使用音速达歌曲 Id 匹配 AME 曲库时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAMEMusicBaseInfo(AMEMusicBaseInfo AMEMusicBaseInfo) {
        this.AMEMusicBaseInfo = AMEMusicBaseInfo;
    }

    public KTVMatchMusic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KTVMatchMusic(KTVMatchMusic source) {
        if (source.KTVMusicBaseInfo != null) {
            this.KTVMusicBaseInfo = new KTVMusicBaseInfo(source.KTVMusicBaseInfo);
        }
        if (source.MatchRule != null) {
            this.MatchRule = new KTVMatchRule(source.MatchRule);
        }
        if (source.AMEMusicBaseInfo != null) {
            this.AMEMusicBaseInfo = new AMEMusicBaseInfo(source.AMEMusicBaseInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "KTVMusicBaseInfo.", this.KTVMusicBaseInfo);
        this.setParamObj(map, prefix + "MatchRule.", this.MatchRule);
        this.setParamObj(map, prefix + "AMEMusicBaseInfo.", this.AMEMusicBaseInfo);

    }
}

