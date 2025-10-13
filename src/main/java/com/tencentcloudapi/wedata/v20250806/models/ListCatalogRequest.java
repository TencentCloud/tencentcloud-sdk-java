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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListCatalogRequest extends AbstractModel {

    /**
    * 页码，从1开始
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页大小，最大500
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 父目录ID
    */
    @SerializedName("ParentCatalogId")
    @Expose
    private String ParentCatalogId;

    /**
     * Get 页码，从1开始 
     * @return PageNumber 页码，从1开始
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码，从1开始
     * @param PageNumber 页码，从1开始
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小，最大500 
     * @return PageSize 分页大小，最大500
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小，最大500
     * @param PageSize 分页大小，最大500
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 父目录ID 
     * @return ParentCatalogId 父目录ID
     */
    public String getParentCatalogId() {
        return this.ParentCatalogId;
    }

    /**
     * Set 父目录ID
     * @param ParentCatalogId 父目录ID
     */
    public void setParentCatalogId(String ParentCatalogId) {
        this.ParentCatalogId = ParentCatalogId;
    }

    public ListCatalogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListCatalogRequest(ListCatalogRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ParentCatalogId != null) {
            this.ParentCatalogId = new String(source.ParentCatalogId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ParentCatalogId", this.ParentCatalogId);

    }
}

