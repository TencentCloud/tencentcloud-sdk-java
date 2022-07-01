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

public class KTVPlaylistBaseInfo extends AbstractModel{

    /**
    * 歌单Id。
    */
    @SerializedName("PlaylistId")
    @Expose
    private String PlaylistId;

    /**
    * 歌单标题。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
     * Get 歌单Id。 
     * @return PlaylistId 歌单Id。
     */
    public String getPlaylistId() {
        return this.PlaylistId;
    }

    /**
     * Set 歌单Id。
     * @param PlaylistId 歌单Id。
     */
    public void setPlaylistId(String PlaylistId) {
        this.PlaylistId = PlaylistId;
    }

    /**
     * Get 歌单标题。 
     * @return Title 歌单标题。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 歌单标题。
     * @param Title 歌单标题。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    public KTVPlaylistBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KTVPlaylistBaseInfo(KTVPlaylistBaseInfo source) {
        if (source.PlaylistId != null) {
            this.PlaylistId = new String(source.PlaylistId);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlaylistId", this.PlaylistId);
        this.setParamSimple(map, prefix + "Title", this.Title);

    }
}

