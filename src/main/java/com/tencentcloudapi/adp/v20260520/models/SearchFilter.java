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

public class SearchFilter extends AbstractModel {

    /**
    * <p>检索过滤类型<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SEARCH_FILTER_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_FILTER_TYPE_CUSTOMER_LABEL_VALUE</td><td>1</td><td>用户自定义标签值</td></tr><tr><td>SEARCH_FILTER_TYPE_CUSTOMER_LABEL_VALUE_ID</td><td>2</td><td>用户自定义标签值ID</td></tr><tr><td>SEARCH_FILTER_TYPE_DOC_ID</td><td>3</td><td>指定文档 ID 检索</td></tr><tr><td>SEARCH_FILTER_TYPE_DOC_CATEGORY_ID</td><td>4</td><td>指定文档分类 ID 检索</td></tr><tr><td>SEARCH_FILTER_TYPE_DB_TABLE_ID</td><td>5</td><td>指定数据库表 ID 检索</td></tr><tr><td>SEARCH_FILTER_TYPE_KB_SCHEMA_ID</td><td>6</td><td>指定知识库 schema ID</td></tr></tbody></table></p>
    */
    @SerializedName("FilterType")
    @Expose
    private Long FilterType;

    /**
    * <p>过滤值列表，根据SearchFilterType取值1：传自定义标签值；2：传自定义标签值ID；3：传文档ID；4：传分类ID</p>
    */
    @SerializedName("FilterValueList")
    @Expose
    private String [] FilterValueList;

    /**
    * <p>用户自定义标签 ID</p>
    */
    @SerializedName("LabelId")
    @Expose
    private String LabelId;

    /**
    * <p>逻辑运算符：AND 或 OR<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>LOGIC_OPR_NOOP</td><td>0</td><td></td></tr><tr><td>LOGIC_OPR_AND</td><td>1</td><td></td></tr><tr><td>LOGIC_OPR_OR</td><td>2</td><td></td></tr></tbody></table></p>
    */
    @SerializedName("LogicOp")
    @Expose
    private Long LogicOp;

    /**
    * <p>嵌套检索过滤</p>
    */
    @SerializedName("SearchFilterList")
    @Expose
    private SearchFilter [] SearchFilterList;

    /**
     * Get <p>检索过滤类型<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SEARCH_FILTER_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_FILTER_TYPE_CUSTOMER_LABEL_VALUE</td><td>1</td><td>用户自定义标签值</td></tr><tr><td>SEARCH_FILTER_TYPE_CUSTOMER_LABEL_VALUE_ID</td><td>2</td><td>用户自定义标签值ID</td></tr><tr><td>SEARCH_FILTER_TYPE_DOC_ID</td><td>3</td><td>指定文档 ID 检索</td></tr><tr><td>SEARCH_FILTER_TYPE_DOC_CATEGORY_ID</td><td>4</td><td>指定文档分类 ID 检索</td></tr><tr><td>SEARCH_FILTER_TYPE_DB_TABLE_ID</td><td>5</td><td>指定数据库表 ID 检索</td></tr><tr><td>SEARCH_FILTER_TYPE_KB_SCHEMA_ID</td><td>6</td><td>指定知识库 schema ID</td></tr></tbody></table></p> 
     * @return FilterType <p>检索过滤类型<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SEARCH_FILTER_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_FILTER_TYPE_CUSTOMER_LABEL_VALUE</td><td>1</td><td>用户自定义标签值</td></tr><tr><td>SEARCH_FILTER_TYPE_CUSTOMER_LABEL_VALUE_ID</td><td>2</td><td>用户自定义标签值ID</td></tr><tr><td>SEARCH_FILTER_TYPE_DOC_ID</td><td>3</td><td>指定文档 ID 检索</td></tr><tr><td>SEARCH_FILTER_TYPE_DOC_CATEGORY_ID</td><td>4</td><td>指定文档分类 ID 检索</td></tr><tr><td>SEARCH_FILTER_TYPE_DB_TABLE_ID</td><td>5</td><td>指定数据库表 ID 检索</td></tr><tr><td>SEARCH_FILTER_TYPE_KB_SCHEMA_ID</td><td>6</td><td>指定知识库 schema ID</td></tr></tbody></table></p>
     */
    public Long getFilterType() {
        return this.FilterType;
    }

    /**
     * Set <p>检索过滤类型<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SEARCH_FILTER_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_FILTER_TYPE_CUSTOMER_LABEL_VALUE</td><td>1</td><td>用户自定义标签值</td></tr><tr><td>SEARCH_FILTER_TYPE_CUSTOMER_LABEL_VALUE_ID</td><td>2</td><td>用户自定义标签值ID</td></tr><tr><td>SEARCH_FILTER_TYPE_DOC_ID</td><td>3</td><td>指定文档 ID 检索</td></tr><tr><td>SEARCH_FILTER_TYPE_DOC_CATEGORY_ID</td><td>4</td><td>指定文档分类 ID 检索</td></tr><tr><td>SEARCH_FILTER_TYPE_DB_TABLE_ID</td><td>5</td><td>指定数据库表 ID 检索</td></tr><tr><td>SEARCH_FILTER_TYPE_KB_SCHEMA_ID</td><td>6</td><td>指定知识库 schema ID</td></tr></tbody></table></p>
     * @param FilterType <p>检索过滤类型<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SEARCH_FILTER_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_FILTER_TYPE_CUSTOMER_LABEL_VALUE</td><td>1</td><td>用户自定义标签值</td></tr><tr><td>SEARCH_FILTER_TYPE_CUSTOMER_LABEL_VALUE_ID</td><td>2</td><td>用户自定义标签值ID</td></tr><tr><td>SEARCH_FILTER_TYPE_DOC_ID</td><td>3</td><td>指定文档 ID 检索</td></tr><tr><td>SEARCH_FILTER_TYPE_DOC_CATEGORY_ID</td><td>4</td><td>指定文档分类 ID 检索</td></tr><tr><td>SEARCH_FILTER_TYPE_DB_TABLE_ID</td><td>5</td><td>指定数据库表 ID 检索</td></tr><tr><td>SEARCH_FILTER_TYPE_KB_SCHEMA_ID</td><td>6</td><td>指定知识库 schema ID</td></tr></tbody></table></p>
     */
    public void setFilterType(Long FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get <p>过滤值列表，根据SearchFilterType取值1：传自定义标签值；2：传自定义标签值ID；3：传文档ID；4：传分类ID</p> 
     * @return FilterValueList <p>过滤值列表，根据SearchFilterType取值1：传自定义标签值；2：传自定义标签值ID；3：传文档ID；4：传分类ID</p>
     */
    public String [] getFilterValueList() {
        return this.FilterValueList;
    }

    /**
     * Set <p>过滤值列表，根据SearchFilterType取值1：传自定义标签值；2：传自定义标签值ID；3：传文档ID；4：传分类ID</p>
     * @param FilterValueList <p>过滤值列表，根据SearchFilterType取值1：传自定义标签值；2：传自定义标签值ID；3：传文档ID；4：传分类ID</p>
     */
    public void setFilterValueList(String [] FilterValueList) {
        this.FilterValueList = FilterValueList;
    }

    /**
     * Get <p>用户自定义标签 ID</p> 
     * @return LabelId <p>用户自定义标签 ID</p>
     */
    public String getLabelId() {
        return this.LabelId;
    }

    /**
     * Set <p>用户自定义标签 ID</p>
     * @param LabelId <p>用户自定义标签 ID</p>
     */
    public void setLabelId(String LabelId) {
        this.LabelId = LabelId;
    }

    /**
     * Get <p>逻辑运算符：AND 或 OR<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>LOGIC_OPR_NOOP</td><td>0</td><td></td></tr><tr><td>LOGIC_OPR_AND</td><td>1</td><td></td></tr><tr><td>LOGIC_OPR_OR</td><td>2</td><td></td></tr></tbody></table></p> 
     * @return LogicOp <p>逻辑运算符：AND 或 OR<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>LOGIC_OPR_NOOP</td><td>0</td><td></td></tr><tr><td>LOGIC_OPR_AND</td><td>1</td><td></td></tr><tr><td>LOGIC_OPR_OR</td><td>2</td><td></td></tr></tbody></table></p>
     */
    public Long getLogicOp() {
        return this.LogicOp;
    }

    /**
     * Set <p>逻辑运算符：AND 或 OR<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>LOGIC_OPR_NOOP</td><td>0</td><td></td></tr><tr><td>LOGIC_OPR_AND</td><td>1</td><td></td></tr><tr><td>LOGIC_OPR_OR</td><td>2</td><td></td></tr></tbody></table></p>
     * @param LogicOp <p>逻辑运算符：AND 或 OR<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>LOGIC_OPR_NOOP</td><td>0</td><td></td></tr><tr><td>LOGIC_OPR_AND</td><td>1</td><td></td></tr><tr><td>LOGIC_OPR_OR</td><td>2</td><td></td></tr></tbody></table></p>
     */
    public void setLogicOp(Long LogicOp) {
        this.LogicOp = LogicOp;
    }

    /**
     * Get <p>嵌套检索过滤</p> 
     * @return SearchFilterList <p>嵌套检索过滤</p>
     */
    public SearchFilter [] getSearchFilterList() {
        return this.SearchFilterList;
    }

    /**
     * Set <p>嵌套检索过滤</p>
     * @param SearchFilterList <p>嵌套检索过滤</p>
     */
    public void setSearchFilterList(SearchFilter [] SearchFilterList) {
        this.SearchFilterList = SearchFilterList;
    }

    public SearchFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchFilter(SearchFilter source) {
        if (source.FilterType != null) {
            this.FilterType = new Long(source.FilterType);
        }
        if (source.FilterValueList != null) {
            this.FilterValueList = new String[source.FilterValueList.length];
            for (int i = 0; i < source.FilterValueList.length; i++) {
                this.FilterValueList[i] = new String(source.FilterValueList[i]);
            }
        }
        if (source.LabelId != null) {
            this.LabelId = new String(source.LabelId);
        }
        if (source.LogicOp != null) {
            this.LogicOp = new Long(source.LogicOp);
        }
        if (source.SearchFilterList != null) {
            this.SearchFilterList = new SearchFilter[source.SearchFilterList.length];
            for (int i = 0; i < source.SearchFilterList.length; i++) {
                this.SearchFilterList[i] = new SearchFilter(source.SearchFilterList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamArraySimple(map, prefix + "FilterValueList.", this.FilterValueList);
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamSimple(map, prefix + "LogicOp", this.LogicOp);
        this.setParamArrayObj(map, prefix + "SearchFilterList.", this.SearchFilterList);

    }
}

