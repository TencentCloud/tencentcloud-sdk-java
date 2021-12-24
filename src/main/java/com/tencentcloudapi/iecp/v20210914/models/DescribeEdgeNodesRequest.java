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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdgeNodesRequest extends AbstractModel{

    /**
    * IECP边缘单元ID
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * 边缘节点名称模糊搜索串
    */
    @SerializedName("NamePattern")
    @Expose
    private String NamePattern;

    /**
    * 边缘节点名称列表，支持批量查询 ，优先于模糊查询
    */
    @SerializedName("NameMatchedList")
    @Expose
    private String [] NameMatchedList;

    /**
    * 排序信息列表
    */
    @SerializedName("Sort")
    @Expose
    private Sort [] Sort;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 页面大小Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 节点类型
    */
    @SerializedName("NodeType")
    @Expose
    private Long NodeType;

    /**
     * Get IECP边缘单元ID 
     * @return EdgeUnitId IECP边缘单元ID
     */
    public Long getEdgeUnitId() {
        return this.EdgeUnitId;
    }

    /**
     * Set IECP边缘单元ID
     * @param EdgeUnitId IECP边缘单元ID
     */
    public void setEdgeUnitId(Long EdgeUnitId) {
        this.EdgeUnitId = EdgeUnitId;
    }

    /**
     * Get 边缘节点名称模糊搜索串 
     * @return NamePattern 边缘节点名称模糊搜索串
     */
    public String getNamePattern() {
        return this.NamePattern;
    }

    /**
     * Set 边缘节点名称模糊搜索串
     * @param NamePattern 边缘节点名称模糊搜索串
     */
    public void setNamePattern(String NamePattern) {
        this.NamePattern = NamePattern;
    }

    /**
     * Get 边缘节点名称列表，支持批量查询 ，优先于模糊查询 
     * @return NameMatchedList 边缘节点名称列表，支持批量查询 ，优先于模糊查询
     */
    public String [] getNameMatchedList() {
        return this.NameMatchedList;
    }

    /**
     * Set 边缘节点名称列表，支持批量查询 ，优先于模糊查询
     * @param NameMatchedList 边缘节点名称列表，支持批量查询 ，优先于模糊查询
     */
    public void setNameMatchedList(String [] NameMatchedList) {
        this.NameMatchedList = NameMatchedList;
    }

    /**
     * Get 排序信息列表 
     * @return Sort 排序信息列表
     */
    public Sort [] getSort() {
        return this.Sort;
    }

    /**
     * Set 排序信息列表
     * @param Sort 排序信息列表
     */
    public void setSort(Sort [] Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 页面大小Limit 
     * @return Limit 页面大小Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 页面大小Limit
     * @param Limit 页面大小Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 节点类型 
     * @return NodeType 节点类型
     */
    public Long getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型
     * @param NodeType 节点类型
     */
    public void setNodeType(Long NodeType) {
        this.NodeType = NodeType;
    }

    public DescribeEdgeNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeNodesRequest(DescribeEdgeNodesRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
        }
        if (source.NamePattern != null) {
            this.NamePattern = new String(source.NamePattern);
        }
        if (source.NameMatchedList != null) {
            this.NameMatchedList = new String[source.NameMatchedList.length];
            for (int i = 0; i < source.NameMatchedList.length; i++) {
                this.NameMatchedList[i] = new String(source.NameMatchedList[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new Sort[source.Sort.length];
            for (int i = 0; i < source.Sort.length; i++) {
                this.Sort[i] = new Sort(source.Sort[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.NodeType != null) {
            this.NodeType = new Long(source.NodeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamSimple(map, prefix + "NamePattern", this.NamePattern);
        this.setParamArraySimple(map, prefix + "NameMatchedList.", this.NameMatchedList);
        this.setParamArrayObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);

    }
}

