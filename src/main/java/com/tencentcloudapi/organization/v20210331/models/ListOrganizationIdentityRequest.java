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

public class ListOrganizationIdentityRequest extends AbstractModel{

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
    * 名称搜索关键字。
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 身份ID搜索。
    */
    @SerializedName("IdentityId")
    @Expose
    private Long IdentityId;

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
     * Get 名称搜索关键字。 
     * @return SearchKey 名称搜索关键字。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 名称搜索关键字。
     * @param SearchKey 名称搜索关键字。
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get 身份ID搜索。 
     * @return IdentityId 身份ID搜索。
     */
    public Long getIdentityId() {
        return this.IdentityId;
    }

    /**
     * Set 身份ID搜索。
     * @param IdentityId 身份ID搜索。
     */
    public void setIdentityId(Long IdentityId) {
        this.IdentityId = IdentityId;
    }

    public ListOrganizationIdentityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListOrganizationIdentityRequest(ListOrganizationIdentityRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.IdentityId != null) {
            this.IdentityId = new Long(source.IdentityId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "IdentityId", this.IdentityId);

    }
}

