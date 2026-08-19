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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAigcTaskListRequest extends AbstractModel {

    /**
    * <p>开始查询页</p>
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * <p>当前页要获取多少数据</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>查询过滤条件</p>
    */
    @SerializedName("QueryTaskFilter")
    @Expose
    private QueryTaskFilter QueryTaskFilter;

    /**
     * Get <p>开始查询页</p> 
     * @return PageNum <p>开始查询页</p>
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set <p>开始查询页</p>
     * @param PageNum <p>开始查询页</p>
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get <p>当前页要获取多少数据</p> 
     * @return PageSize <p>当前页要获取多少数据</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>当前页要获取多少数据</p>
     * @param PageSize <p>当前页要获取多少数据</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>查询过滤条件</p> 
     * @return QueryTaskFilter <p>查询过滤条件</p>
     */
    public QueryTaskFilter getQueryTaskFilter() {
        return this.QueryTaskFilter;
    }

    /**
     * Set <p>查询过滤条件</p>
     * @param QueryTaskFilter <p>查询过滤条件</p>
     */
    public void setQueryTaskFilter(QueryTaskFilter QueryTaskFilter) {
        this.QueryTaskFilter = QueryTaskFilter;
    }

    public DescribeAigcTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAigcTaskListRequest(DescribeAigcTaskListRequest source) {
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.QueryTaskFilter != null) {
            this.QueryTaskFilter = new QueryTaskFilter(source.QueryTaskFilter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamObj(map, prefix + "QueryTaskFilter.", this.QueryTaskFilter);

    }
}

