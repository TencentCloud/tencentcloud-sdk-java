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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QAQuery extends AbstractModel {

    /**
    * <p>查询关键词（模糊搜索）</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>查询范围（query 作用的字段）：1=问题，2=标签或标签值，3=答案；支持多选，缺省时无效</p>
    */
    @SerializedName("QueryScopeList")
    @Expose
    private Long [] QueryScopeList;

    /**
     * Get <p>查询关键词（模糊搜索）</p> 
     * @return Query <p>查询关键词（模糊搜索）</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>查询关键词（模糊搜索）</p>
     * @param Query <p>查询关键词（模糊搜索）</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>查询范围（query 作用的字段）：1=问题，2=标签或标签值，3=答案；支持多选，缺省时无效</p> 
     * @return QueryScopeList <p>查询范围（query 作用的字段）：1=问题，2=标签或标签值，3=答案；支持多选，缺省时无效</p>
     */
    public Long [] getQueryScopeList() {
        return this.QueryScopeList;
    }

    /**
     * Set <p>查询范围（query 作用的字段）：1=问题，2=标签或标签值，3=答案；支持多选，缺省时无效</p>
     * @param QueryScopeList <p>查询范围（query 作用的字段）：1=问题，2=标签或标签值，3=答案；支持多选，缺省时无效</p>
     */
    public void setQueryScopeList(Long [] QueryScopeList) {
        this.QueryScopeList = QueryScopeList;
    }

    public QAQuery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QAQuery(QAQuery source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.QueryScopeList != null) {
            this.QueryScopeList = new Long[source.QueryScopeList.length];
            for (int i = 0; i < source.QueryScopeList.length; i++) {
                this.QueryScopeList[i] = new Long(source.QueryScopeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArraySimple(map, prefix + "QueryScopeList.", this.QueryScopeList);

    }
}

