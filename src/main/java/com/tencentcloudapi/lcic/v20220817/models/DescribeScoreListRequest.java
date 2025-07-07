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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScoreListRequest extends AbstractModel {

    /**
    * 课堂ID
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 分页查询当前页数，从1开始递增
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 默认是10条
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 课堂ID 
     * @return RoomId 课堂ID
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 课堂ID
     * @param RoomId 课堂ID
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 分页查询当前页数，从1开始递增 
     * @return Page 分页查询当前页数，从1开始递增
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 分页查询当前页数，从1开始递增
     * @param Page 分页查询当前页数，从1开始递增
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 默认是10条 
     * @return Limit 默认是10条
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 默认是10条
     * @param Limit 默认是10条
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeScoreListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScoreListRequest(DescribeScoreListRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

