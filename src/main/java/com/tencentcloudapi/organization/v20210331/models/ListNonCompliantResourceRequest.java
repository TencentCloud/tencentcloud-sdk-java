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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListNonCompliantResourceRequest extends AbstractModel {

    /**
    * 限制数目。取值范围：1~50。
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * 成员Uin。
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * 从上一页的响应中获取的下一页的Token值。
如果是第一次请求，设置为空。
    */
    @SerializedName("PaginationToken")
    @Expose
    private String PaginationToken;

    /**
    * 标签键。
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
     * Get 限制数目。取值范围：1~50。 
     * @return MaxResults 限制数目。取值范围：1~50。
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set 限制数目。取值范围：1~50。
     * @param MaxResults 限制数目。取值范围：1~50。
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
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
     * Get 从上一页的响应中获取的下一页的Token值。
如果是第一次请求，设置为空。 
     * @return PaginationToken 从上一页的响应中获取的下一页的Token值。
如果是第一次请求，设置为空。
     */
    public String getPaginationToken() {
        return this.PaginationToken;
    }

    /**
     * Set 从上一页的响应中获取的下一页的Token值。
如果是第一次请求，设置为空。
     * @param PaginationToken 从上一页的响应中获取的下一页的Token值。
如果是第一次请求，设置为空。
     */
    public void setPaginationToken(String PaginationToken) {
        this.PaginationToken = PaginationToken;
    }

    /**
     * Get 标签键。 
     * @return TagKey 标签键。
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set 标签键。
     * @param TagKey 标签键。
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    public ListNonCompliantResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListNonCompliantResourceRequest(ListNonCompliantResourceRequest source) {
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.PaginationToken != null) {
            this.PaginationToken = new String(source.PaginationToken);
        }
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "PaginationToken", this.PaginationToken);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);

    }
}

