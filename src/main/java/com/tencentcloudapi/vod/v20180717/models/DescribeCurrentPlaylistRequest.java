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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCurrentPlaylistRequest extends AbstractModel {

    /**
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>轮播播单唯一标识。</p>
    */
    @SerializedName("RoundPlayId")
    @Expose
    private String RoundPlayId;

    /**
    * <p>返回的播放列表的长度。最大10，默认值为5。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p><b>点播<a href="/document/product/266/14574">应用</a> ID。</b></p> 
     * @return SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>点播<a href="/document/product/266/14574">应用</a> ID。</b></p>
     * @param SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>轮播播单唯一标识。</p> 
     * @return RoundPlayId <p>轮播播单唯一标识。</p>
     */
    public String getRoundPlayId() {
        return this.RoundPlayId;
    }

    /**
     * Set <p>轮播播单唯一标识。</p>
     * @param RoundPlayId <p>轮播播单唯一标识。</p>
     */
    public void setRoundPlayId(String RoundPlayId) {
        this.RoundPlayId = RoundPlayId;
    }

    /**
     * Get <p>返回的播放列表的长度。最大10，默认值为5。</p> 
     * @return Limit <p>返回的播放列表的长度。最大10，默认值为5。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回的播放列表的长度。最大10，默认值为5。</p>
     * @param Limit <p>返回的播放列表的长度。最大10，默认值为5。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeCurrentPlaylistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCurrentPlaylistRequest(DescribeCurrentPlaylistRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.RoundPlayId != null) {
            this.RoundPlayId = new String(source.RoundPlayId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "RoundPlayId", this.RoundPlayId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

