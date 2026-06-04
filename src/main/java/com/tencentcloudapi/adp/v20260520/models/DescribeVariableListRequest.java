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

public class DescribeVariableListRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 过滤条件(支持: VariableIdList-变量ID列表, VariableType-变量类型)
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * 模块类型。枚举值: 1:环境参数, 2:应用参数, 3:系统参数, -1:所有参数
    */
    @SerializedName("ModuleType")
    @Expose
    private Long ModuleType;

    /**
    * 是否需要内部变量
    */
    @SerializedName("NeedInternalVariable")
    @Expose
    private Boolean NeedInternalVariable;

    /**
    * 页码(从0开始)
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数量(最大值:100)
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 查询关键词
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get 应用ID 
     * @return AppId 应用ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用ID
     * @param AppId 应用ID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 过滤条件(支持: VariableIdList-变量ID列表, VariableType-变量类型) 
     * @return FilterList 过滤条件(支持: VariableIdList-变量ID列表, VariableType-变量类型)
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set 过滤条件(支持: VariableIdList-变量ID列表, VariableType-变量类型)
     * @param FilterList 过滤条件(支持: VariableIdList-变量ID列表, VariableType-变量类型)
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get 模块类型。枚举值: 1:环境参数, 2:应用参数, 3:系统参数, -1:所有参数 
     * @return ModuleType 模块类型。枚举值: 1:环境参数, 2:应用参数, 3:系统参数, -1:所有参数
     */
    public Long getModuleType() {
        return this.ModuleType;
    }

    /**
     * Set 模块类型。枚举值: 1:环境参数, 2:应用参数, 3:系统参数, -1:所有参数
     * @param ModuleType 模块类型。枚举值: 1:环境参数, 2:应用参数, 3:系统参数, -1:所有参数
     */
    public void setModuleType(Long ModuleType) {
        this.ModuleType = ModuleType;
    }

    /**
     * Get 是否需要内部变量 
     * @return NeedInternalVariable 是否需要内部变量
     */
    public Boolean getNeedInternalVariable() {
        return this.NeedInternalVariable;
    }

    /**
     * Set 是否需要内部变量
     * @param NeedInternalVariable 是否需要内部变量
     */
    public void setNeedInternalVariable(Boolean NeedInternalVariable) {
        this.NeedInternalVariable = NeedInternalVariable;
    }

    /**
     * Get 页码(从0开始) 
     * @return PageNumber 页码(从0开始)
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码(从0开始)
     * @param PageNumber 页码(从0开始)
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数量(最大值:100) 
     * @return PageSize 每页数量(最大值:100)
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量(最大值:100)
     * @param PageSize 每页数量(最大值:100)
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 查询关键词 
     * @return Query 查询关键词
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询关键词
     * @param Query 查询关键词
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    public DescribeVariableListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVariableListRequest(DescribeVariableListRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
        if (source.ModuleType != null) {
            this.ModuleType = new Long(source.ModuleType);
        }
        if (source.NeedInternalVariable != null) {
            this.NeedInternalVariable = new Boolean(source.NeedInternalVariable);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamSimple(map, prefix + "ModuleType", this.ModuleType);
        this.setParamSimple(map, prefix + "NeedInternalVariable", this.NeedInternalVariable);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);

    }
}

