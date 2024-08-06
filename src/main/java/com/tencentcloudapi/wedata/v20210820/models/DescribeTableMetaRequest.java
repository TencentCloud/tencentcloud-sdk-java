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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTableMetaRequest extends AbstractModel {

    /**
    * 表唯一id
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 按名称查询的条件
    */
    @SerializedName("TableNameFilter")
    @Expose
    private TableNameFilter TableNameFilter;

    /**
    * 查询条件类型0按id，1按名称，默认为0
    */
    @SerializedName("TableFilterType")
    @Expose
    private Long TableFilterType;

    /**
    * 查询字段列表
    */
    @SerializedName("SearchNames")
    @Expose
    private String [] SearchNames;

    /**
     * Get 表唯一id 
     * @return TableId 表唯一id
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 表唯一id
     * @param TableId 表唯一id
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 按名称查询的条件 
     * @return TableNameFilter 按名称查询的条件
     */
    public TableNameFilter getTableNameFilter() {
        return this.TableNameFilter;
    }

    /**
     * Set 按名称查询的条件
     * @param TableNameFilter 按名称查询的条件
     */
    public void setTableNameFilter(TableNameFilter TableNameFilter) {
        this.TableNameFilter = TableNameFilter;
    }

    /**
     * Get 查询条件类型0按id，1按名称，默认为0 
     * @return TableFilterType 查询条件类型0按id，1按名称，默认为0
     */
    public Long getTableFilterType() {
        return this.TableFilterType;
    }

    /**
     * Set 查询条件类型0按id，1按名称，默认为0
     * @param TableFilterType 查询条件类型0按id，1按名称，默认为0
     */
    public void setTableFilterType(Long TableFilterType) {
        this.TableFilterType = TableFilterType;
    }

    /**
     * Get 查询字段列表 
     * @return SearchNames 查询字段列表
     */
    public String [] getSearchNames() {
        return this.SearchNames;
    }

    /**
     * Set 查询字段列表
     * @param SearchNames 查询字段列表
     */
    public void setSearchNames(String [] SearchNames) {
        this.SearchNames = SearchNames;
    }

    public DescribeTableMetaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableMetaRequest(DescribeTableMetaRequest source) {
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableNameFilter != null) {
            this.TableNameFilter = new TableNameFilter(source.TableNameFilter);
        }
        if (source.TableFilterType != null) {
            this.TableFilterType = new Long(source.TableFilterType);
        }
        if (source.SearchNames != null) {
            this.SearchNames = new String[source.SearchNames.length];
            for (int i = 0; i < source.SearchNames.length; i++) {
                this.SearchNames[i] = new String(source.SearchNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamObj(map, prefix + "TableNameFilter.", this.TableNameFilter);
        this.setParamSimple(map, prefix + "TableFilterType", this.TableFilterType);
        this.setParamArraySimple(map, prefix + "SearchNames.", this.SearchNames);

    }
}

