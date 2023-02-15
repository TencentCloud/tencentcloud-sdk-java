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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCurrentMemberListRequest extends AbstractModel{

    /**
    * 房间Id。
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 分页查询当前页数，从1开始递增。
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页数据量，最大1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 房间Id。 
     * @return RoomId 房间Id。
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间Id。
     * @param RoomId 房间Id。
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 分页查询当前页数，从1开始递增。 
     * @return Page 分页查询当前页数，从1开始递增。
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 分页查询当前页数，从1开始递增。
     * @param Page 分页查询当前页数，从1开始递增。
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 每页数据量，最大1000。 
     * @return Limit 每页数据量，最大1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数据量，最大1000。
     * @param Limit 每页数据量，最大1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeCurrentMemberListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCurrentMemberListRequest(DescribeCurrentMemberListRequest source) {
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

