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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrganizationNodesRequest extends AbstractModel {

    /**
    * 限制数目。最大50
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量。取值是limit的整数倍。默认值 : 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 部门标签搜索列表，最大10个
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 限制数目。最大50 
     * @return Limit 限制数目。最大50
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目。最大50
     * @param Limit 限制数目。最大50
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量。取值是limit的整数倍。默认值 : 0。 
     * @return Offset 偏移量。取值是limit的整数倍。默认值 : 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。取值是limit的整数倍。默认值 : 0。
     * @param Offset 偏移量。取值是limit的整数倍。默认值 : 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 部门标签搜索列表，最大10个 
     * @return Tags 部门标签搜索列表，最大10个
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 部门标签搜索列表，最大10个
     * @param Tags 部门标签搜索列表，最大10个
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public DescribeOrganizationNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationNodesRequest(DescribeOrganizationNodesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

