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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PageQuery extends AbstractModel {

    /**
    * 文件id数组，表示要查询的文件的所有 ID，支持批量查询，数组元素范围[1,20]。
    */
    @SerializedName("DocumentSetId")
    @Expose
    private String [] DocumentSetId;

    /**
    * 表示要查询的文档名称，支持批量查询，数组元素范围[1,20]。
    */
    @SerializedName("DocumentSetName")
    @Expose
    private String [] DocumentSetName;

    /**
    * 取值范围：[1,16384]
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 设置分页偏移量，用于控制分页查询返回结果的起始位置，方便用户对数据进行分页展示和浏览。
取值：为 limit 整数倍。
计算公式：offset=limit*(page-1)。
例如：当 limit = 10，page = 2 时，分页偏移量 offset = 10 * (2 - 1) = 10，表示从查询结果的第 11 条记录开始返回数据。

    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 设置后，其他字段为空值
    */
    @SerializedName("OutputFields")
    @Expose
    private String [] OutputFields;

    /**
    * 使用创建 CollectionView 指定的 Filter 索引的字段设置查询过滤表达式。
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
     * Get 文件id数组，表示要查询的文件的所有 ID，支持批量查询，数组元素范围[1,20]。 
     * @return DocumentSetId 文件id数组，表示要查询的文件的所有 ID，支持批量查询，数组元素范围[1,20]。
     */
    public String [] getDocumentSetId() {
        return this.DocumentSetId;
    }

    /**
     * Set 文件id数组，表示要查询的文件的所有 ID，支持批量查询，数组元素范围[1,20]。
     * @param DocumentSetId 文件id数组，表示要查询的文件的所有 ID，支持批量查询，数组元素范围[1,20]。
     */
    public void setDocumentSetId(String [] DocumentSetId) {
        this.DocumentSetId = DocumentSetId;
    }

    /**
     * Get 表示要查询的文档名称，支持批量查询，数组元素范围[1,20]。 
     * @return DocumentSetName 表示要查询的文档名称，支持批量查询，数组元素范围[1,20]。
     */
    public String [] getDocumentSetName() {
        return this.DocumentSetName;
    }

    /**
     * Set 表示要查询的文档名称，支持批量查询，数组元素范围[1,20]。
     * @param DocumentSetName 表示要查询的文档名称，支持批量查询，数组元素范围[1,20]。
     */
    public void setDocumentSetName(String [] DocumentSetName) {
        this.DocumentSetName = DocumentSetName;
    }

    /**
     * Get 取值范围：[1,16384] 
     * @return Limit 取值范围：[1,16384]
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 取值范围：[1,16384]
     * @param Limit 取值范围：[1,16384]
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 设置分页偏移量，用于控制分页查询返回结果的起始位置，方便用户对数据进行分页展示和浏览。
取值：为 limit 整数倍。
计算公式：offset=limit*(page-1)。
例如：当 limit = 10，page = 2 时，分页偏移量 offset = 10 * (2 - 1) = 10，表示从查询结果的第 11 条记录开始返回数据。
 
     * @return Offset 设置分页偏移量，用于控制分页查询返回结果的起始位置，方便用户对数据进行分页展示和浏览。
取值：为 limit 整数倍。
计算公式：offset=limit*(page-1)。
例如：当 limit = 10，page = 2 时，分页偏移量 offset = 10 * (2 - 1) = 10，表示从查询结果的第 11 条记录开始返回数据。

     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 设置分页偏移量，用于控制分页查询返回结果的起始位置，方便用户对数据进行分页展示和浏览。
取值：为 limit 整数倍。
计算公式：offset=limit*(page-1)。
例如：当 limit = 10，page = 2 时，分页偏移量 offset = 10 * (2 - 1) = 10，表示从查询结果的第 11 条记录开始返回数据。

     * @param Offset 设置分页偏移量，用于控制分页查询返回结果的起始位置，方便用户对数据进行分页展示和浏览。
取值：为 limit 整数倍。
计算公式：offset=limit*(page-1)。
例如：当 limit = 10，page = 2 时，分页偏移量 offset = 10 * (2 - 1) = 10，表示从查询结果的第 11 条记录开始返回数据。

     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 设置后，其他字段为空值 
     * @return OutputFields 设置后，其他字段为空值
     */
    public String [] getOutputFields() {
        return this.OutputFields;
    }

    /**
     * Set 设置后，其他字段为空值
     * @param OutputFields 设置后，其他字段为空值
     */
    public void setOutputFields(String [] OutputFields) {
        this.OutputFields = OutputFields;
    }

    /**
     * Get 使用创建 CollectionView 指定的 Filter 索引的字段设置查询过滤表达式。 
     * @return Filter 使用创建 CollectionView 指定的 Filter 索引的字段设置查询过滤表达式。
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set 使用创建 CollectionView 指定的 Filter 索引的字段设置查询过滤表达式。
     * @param Filter 使用创建 CollectionView 指定的 Filter 索引的字段设置查询过滤表达式。
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    public PageQuery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PageQuery(PageQuery source) {
        if (source.DocumentSetId != null) {
            this.DocumentSetId = new String[source.DocumentSetId.length];
            for (int i = 0; i < source.DocumentSetId.length; i++) {
                this.DocumentSetId[i] = new String(source.DocumentSetId[i]);
            }
        }
        if (source.DocumentSetName != null) {
            this.DocumentSetName = new String[source.DocumentSetName.length];
            for (int i = 0; i < source.DocumentSetName.length; i++) {
                this.DocumentSetName[i] = new String(source.DocumentSetName[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OutputFields != null) {
            this.OutputFields = new String[source.OutputFields.length];
            for (int i = 0; i < source.OutputFields.length; i++) {
                this.OutputFields[i] = new String(source.OutputFields[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DocumentSetId.", this.DocumentSetId);
        this.setParamArraySimple(map, prefix + "DocumentSetName.", this.DocumentSetName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "OutputFields.", this.OutputFields);
        this.setParamSimple(map, prefix + "Filter", this.Filter);

    }
}

