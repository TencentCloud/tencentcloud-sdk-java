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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReplicationGroupRequest extends AbstractModel{

    /**
    * 实例列表的大小，参数默认值20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，取Limit整数倍
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 复制组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 实例ID和实例名称，支持模糊查询
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get 实例列表的大小，参数默认值20 
     * @return Limit 实例列表的大小，参数默认值20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 实例列表的大小，参数默认值20
     * @param Limit 实例列表的大小，参数默认值20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，取Limit整数倍 
     * @return Offset 偏移量，取Limit整数倍
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，取Limit整数倍
     * @param Offset 偏移量，取Limit整数倍
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 复制组ID 
     * @return GroupId 复制组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 复制组ID
     * @param GroupId 复制组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 实例ID和实例名称，支持模糊查询 
     * @return SearchKey 实例ID和实例名称，支持模糊查询
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 实例ID和实例名称，支持模糊查询
     * @param SearchKey 实例ID和实例名称，支持模糊查询
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    public DescribeReplicationGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReplicationGroupRequest(DescribeReplicationGroupRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);

    }
}

