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

public class DescribeKTVPlaylistDetailRequest extends AbstractModel{

    /**
    * 歌单Id
    */
    @SerializedName("PlaylistId")
    @Expose
    private String PlaylistId;

    /**
    * 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页返回的记录条数，默认值：50。将返回第 Offset 到第 Offset+Limit-1 条。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 歌单Id 
     * @return PlaylistId 歌单Id
     */
    public String getPlaylistId() {
        return this.PlaylistId;
    }

    /**
     * Set 歌单Id
     * @param PlaylistId 歌单Id
     */
    public void setPlaylistId(String PlaylistId) {
        this.PlaylistId = PlaylistId;
    }

    /**
     * Get 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。 
     * @return Offset 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
     * @param Offset 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页返回的记录条数，默认值：50。将返回第 Offset 到第 Offset+Limit-1 条。 
     * @return Limit 分页返回的记录条数，默认值：50。将返回第 Offset 到第 Offset+Limit-1 条。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回的记录条数，默认值：50。将返回第 Offset 到第 Offset+Limit-1 条。
     * @param Limit 分页返回的记录条数，默认值：50。将返回第 Offset 到第 Offset+Limit-1 条。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeKTVPlaylistDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKTVPlaylistDetailRequest(DescribeKTVPlaylistDetailRequest source) {
        if (source.PlaylistId != null) {
            this.PlaylistId = new String(source.PlaylistId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlaylistId", this.PlaylistId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

