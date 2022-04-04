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

public class DescribeKTVPlaylistsRequest extends AbstractModel{

    /**
    * 歌单类型，取值有：
·OfficialRec：官方推荐
·Normal：自定义
当该字段未填时，默认为取OfficialRec
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
取值范围：Offset + Limit 不超过5000
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页返回的记录条数，默认值：50。将返回第 Offset 到第 Offset+Limit-1 条。
取值范围：Offset + Limit 不超过5000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 歌单类型，取值有：
·OfficialRec：官方推荐
·Normal：自定义
当该字段未填时，默认为取OfficialRec 
     * @return Type 歌单类型，取值有：
·OfficialRec：官方推荐
·Normal：自定义
当该字段未填时，默认为取OfficialRec
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 歌单类型，取值有：
·OfficialRec：官方推荐
·Normal：自定义
当该字段未填时，默认为取OfficialRec
     * @param Type 歌单类型，取值有：
·OfficialRec：官方推荐
·Normal：自定义
当该字段未填时，默认为取OfficialRec
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
取值范围：Offset + Limit 不超过5000 
     * @return Offset 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
取值范围：Offset + Limit 不超过5000
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
取值范围：Offset + Limit 不超过5000
     * @param Offset 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
取值范围：Offset + Limit 不超过5000
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页返回的记录条数，默认值：50。将返回第 Offset 到第 Offset+Limit-1 条。
取值范围：Offset + Limit 不超过5000 
     * @return Limit 分页返回的记录条数，默认值：50。将返回第 Offset 到第 Offset+Limit-1 条。
取值范围：Offset + Limit 不超过5000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回的记录条数，默认值：50。将返回第 Offset 到第 Offset+Limit-1 条。
取值范围：Offset + Limit 不超过5000
     * @param Limit 分页返回的记录条数，默认值：50。将返回第 Offset 到第 Offset+Limit-1 条。
取值范围：Offset + Limit 不超过5000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeKTVPlaylistsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKTVPlaylistsRequest(DescribeKTVPlaylistsRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

