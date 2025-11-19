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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryChunkListRequest extends AbstractModel {

    /**
    * 表示第一页
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 默认一页展示 10 条
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 表示第一页 
     * @return Page 表示第一页
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 表示第一页
     * @param Page 表示第一页
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 默认一页展示 10 条 
     * @return PageSize 默认一页展示 10 条
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 默认一页展示 10 条
     * @param PageSize 默认一页展示 10 条
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public QueryChunkListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryChunkListRequest(QueryChunkListRequest source) {
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

