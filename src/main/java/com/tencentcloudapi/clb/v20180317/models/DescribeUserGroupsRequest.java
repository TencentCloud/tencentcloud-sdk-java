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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserGroupsRequest extends AbstractModel {

    /**
    * <p>模型路由实例ID。</p>
    */
    @SerializedName("ModelRouterId")
    @Expose
    private String ModelRouterId;

    /**
    * <p>用户组ID列表，用于按ID过滤，单次最多100个；可包含「未分组」虚拟分组 ugrp-ungrouped。</p>
    */
    @SerializedName("UserGroupIds")
    @Expose
    private String [] UserGroupIds;

    /**
    * <p>过滤列表。支持：UserGroupName、Status、tag-key、tag:&lt;tag-key&gt;。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>本次查询限制的数量</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>本次查询偏移量</p><p>默认值：0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>模型路由实例ID。</p> 
     * @return ModelRouterId <p>模型路由实例ID。</p>
     */
    public String getModelRouterId() {
        return this.ModelRouterId;
    }

    /**
     * Set <p>模型路由实例ID。</p>
     * @param ModelRouterId <p>模型路由实例ID。</p>
     */
    public void setModelRouterId(String ModelRouterId) {
        this.ModelRouterId = ModelRouterId;
    }

    /**
     * Get <p>用户组ID列表，用于按ID过滤，单次最多100个；可包含「未分组」虚拟分组 ugrp-ungrouped。</p> 
     * @return UserGroupIds <p>用户组ID列表，用于按ID过滤，单次最多100个；可包含「未分组」虚拟分组 ugrp-ungrouped。</p>
     */
    public String [] getUserGroupIds() {
        return this.UserGroupIds;
    }

    /**
     * Set <p>用户组ID列表，用于按ID过滤，单次最多100个；可包含「未分组」虚拟分组 ugrp-ungrouped。</p>
     * @param UserGroupIds <p>用户组ID列表，用于按ID过滤，单次最多100个；可包含「未分组」虚拟分组 ugrp-ungrouped。</p>
     */
    public void setUserGroupIds(String [] UserGroupIds) {
        this.UserGroupIds = UserGroupIds;
    }

    /**
     * Get <p>过滤列表。支持：UserGroupName、Status、tag-key、tag:&lt;tag-key&gt;。</p> 
     * @return Filters <p>过滤列表。支持：UserGroupName、Status、tag-key、tag:&lt;tag-key&gt;。</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤列表。支持：UserGroupName、Status、tag-key、tag:&lt;tag-key&gt;。</p>
     * @param Filters <p>过滤列表。支持：UserGroupName、Status、tag-key、tag:&lt;tag-key&gt;。</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>本次查询限制的数量</p><p>取值范围：[1, 100]</p><p>默认值：20</p> 
     * @return Limit <p>本次查询限制的数量</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>本次查询限制的数量</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     * @param Limit <p>本次查询限制的数量</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>本次查询偏移量</p><p>默认值：0</p> 
     * @return Offset <p>本次查询偏移量</p><p>默认值：0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>本次查询偏移量</p><p>默认值：0</p>
     * @param Offset <p>本次查询偏移量</p><p>默认值：0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeUserGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserGroupsRequest(DescribeUserGroupsRequest source) {
        if (source.ModelRouterId != null) {
            this.ModelRouterId = new String(source.ModelRouterId);
        }
        if (source.UserGroupIds != null) {
            this.UserGroupIds = new String[source.UserGroupIds.length];
            for (int i = 0; i < source.UserGroupIds.length; i++) {
                this.UserGroupIds[i] = new String(source.UserGroupIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelRouterId", this.ModelRouterId);
        this.setParamArraySimple(map, prefix + "UserGroupIds.", this.UserGroupIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

