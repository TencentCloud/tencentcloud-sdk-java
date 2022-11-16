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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrganizationMemberPoliciesRequest extends AbstractModel{

    /**
    * 偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数目。最大50
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 成员Uin。
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * 搜索关键字。可用于策略名或描述搜索
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get 偏移量。 
     * @return Offset 偏移量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。
     * @param Offset 偏移量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

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
     * Get 成员Uin。 
     * @return MemberUin 成员Uin。
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set 成员Uin。
     * @param MemberUin 成员Uin。
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get 搜索关键字。可用于策略名或描述搜索 
     * @return SearchKey 搜索关键字。可用于策略名或描述搜索
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 搜索关键字。可用于策略名或描述搜索
     * @param SearchKey 搜索关键字。可用于策略名或描述搜索
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    public DescribeOrganizationMemberPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationMemberPoliciesRequest(DescribeOrganizationMemberPoliciesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);

    }
}

