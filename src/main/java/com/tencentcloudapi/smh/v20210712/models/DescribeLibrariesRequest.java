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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLibrariesRequest extends AbstractModel {

    /**
    * 按照一个或者多个媒体库 ID 查询，每次请求的上限为 100 个。
    */
    @SerializedName("LibraryIds")
    @Expose
    private String [] LibraryIds;

    /**
    * 页码，整型，配合 PageSize 使用，默认值为 1。
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数目，整型，配合 PageNumber 使用，默认值为 20，最大值为 100。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 偏移量，从0开始。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单次列出的数量限制，不超过100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 按照一个或者多个媒体库 ID 查询，每次请求的上限为 100 个。 
     * @return LibraryIds 按照一个或者多个媒体库 ID 查询，每次请求的上限为 100 个。
     */
    public String [] getLibraryIds() {
        return this.LibraryIds;
    }

    /**
     * Set 按照一个或者多个媒体库 ID 查询，每次请求的上限为 100 个。
     * @param LibraryIds 按照一个或者多个媒体库 ID 查询，每次请求的上限为 100 个。
     */
    public void setLibraryIds(String [] LibraryIds) {
        this.LibraryIds = LibraryIds;
    }

    /**
     * Get 页码，整型，配合 PageSize 使用，默认值为 1。 
     * @return PageNumber 页码，整型，配合 PageSize 使用，默认值为 1。
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码，整型，配合 PageSize 使用，默认值为 1。
     * @param PageNumber 页码，整型，配合 PageSize 使用，默认值为 1。
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数目，整型，配合 PageNumber 使用，默认值为 20，最大值为 100。 
     * @return PageSize 每页数目，整型，配合 PageNumber 使用，默认值为 20，最大值为 100。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数目，整型，配合 PageNumber 使用，默认值为 20，最大值为 100。
     * @param PageSize 每页数目，整型，配合 PageNumber 使用，默认值为 20，最大值为 100。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 偏移量，从0开始。 
     * @return Offset 偏移量，从0开始。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，从0开始。
     * @param Offset 偏移量，从0开始。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单次列出的数量限制，不超过100. 
     * @return Limit 单次列出的数量限制，不超过100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次列出的数量限制，不超过100.
     * @param Limit 单次列出的数量限制，不超过100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeLibrariesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLibrariesRequest(DescribeLibrariesRequest source) {
        if (source.LibraryIds != null) {
            this.LibraryIds = new String[source.LibraryIds.length];
            for (int i = 0; i < source.LibraryIds.length; i++) {
                this.LibraryIds[i] = new String(source.LibraryIds[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
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
        this.setParamArraySimple(map, prefix + "LibraryIds.", this.LibraryIds);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

