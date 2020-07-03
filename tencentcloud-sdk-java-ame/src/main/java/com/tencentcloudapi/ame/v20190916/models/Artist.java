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

public class Artist extends AbstractModel{

    /**
    * 歌手名
    */
    @SerializedName("ArtistName")
    @Expose
    private String ArtistName;

    /**
     * Get 歌手名 
     * @return ArtistName 歌手名
     */
    public String getArtistName() {
        return this.ArtistName;
    }

    /**
     * Set 歌手名
     * @param ArtistName 歌手名
     */
    public void setArtistName(String ArtistName) {
        this.ArtistName = ArtistName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ArtistName", this.ArtistName);

    }
}

