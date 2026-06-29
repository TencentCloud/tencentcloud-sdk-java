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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNDRAssetIdentificationCursorListRequest extends AbstractModel {

    /**
    * <p>每页条数</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页游标</p><p>前一页返回的NextCursor</p>
    */
    @SerializedName("Cursor")
    @Expose
    private String Cursor;

    /**
    * <p>查询过滤条件，多个条件之间为AND的关系</p>
    */
    @SerializedName("Filters")
    @Expose
    private OperatorFilter [] Filters;

    /**
     * Get <p>每页条数</p> 
     * @return Limit <p>每页条数</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页条数</p>
     * @param Limit <p>每页条数</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页游标</p><p>前一页返回的NextCursor</p> 
     * @return Cursor <p>分页游标</p><p>前一页返回的NextCursor</p>
     */
    public String getCursor() {
        return this.Cursor;
    }

    /**
     * Set <p>分页游标</p><p>前一页返回的NextCursor</p>
     * @param Cursor <p>分页游标</p><p>前一页返回的NextCursor</p>
     */
    public void setCursor(String Cursor) {
        this.Cursor = Cursor;
    }

    /**
     * Get <p>查询过滤条件，多个条件之间为AND的关系</p> 
     * @return Filters <p>查询过滤条件，多个条件之间为AND的关系</p>
     */
    public OperatorFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>查询过滤条件，多个条件之间为AND的关系</p>
     * @param Filters <p>查询过滤条件，多个条件之间为AND的关系</p>
     */
    public void setFilters(OperatorFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeNDRAssetIdentificationCursorListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNDRAssetIdentificationCursorListRequest(DescribeNDRAssetIdentificationCursorListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Cursor != null) {
            this.Cursor = new String(source.Cursor);
        }
        if (source.Filters != null) {
            this.Filters = new OperatorFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new OperatorFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

