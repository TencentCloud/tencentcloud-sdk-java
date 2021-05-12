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

public class ModifyMusicOnShelvesRequest extends AbstractModel{

    /**
    * 歌曲变更信息
    */
    @SerializedName("MusicDetailInfos")
    @Expose
    private MusicDetailInfo MusicDetailInfos;

    /**
    * ame对接资源方密钥
    */
    @SerializedName("AmeKey")
    @Expose
    private String AmeKey;

    /**
     * Get 歌曲变更信息 
     * @return MusicDetailInfos 歌曲变更信息
     */
    public MusicDetailInfo getMusicDetailInfos() {
        return this.MusicDetailInfos;
    }

    /**
     * Set 歌曲变更信息
     * @param MusicDetailInfos 歌曲变更信息
     */
    public void setMusicDetailInfos(MusicDetailInfo MusicDetailInfos) {
        this.MusicDetailInfos = MusicDetailInfos;
    }

    /**
     * Get ame对接资源方密钥 
     * @return AmeKey ame对接资源方密钥
     */
    public String getAmeKey() {
        return this.AmeKey;
    }

    /**
     * Set ame对接资源方密钥
     * @param AmeKey ame对接资源方密钥
     */
    public void setAmeKey(String AmeKey) {
        this.AmeKey = AmeKey;
    }

    public ModifyMusicOnShelvesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMusicOnShelvesRequest(ModifyMusicOnShelvesRequest source) {
        if (source.MusicDetailInfos != null) {
            this.MusicDetailInfos = new MusicDetailInfo(source.MusicDetailInfos);
        }
        if (source.AmeKey != null) {
            this.AmeKey = new String(source.AmeKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MusicDetailInfos.", this.MusicDetailInfos);
        this.setParamSimple(map, prefix + "AmeKey", this.AmeKey);

    }
}

