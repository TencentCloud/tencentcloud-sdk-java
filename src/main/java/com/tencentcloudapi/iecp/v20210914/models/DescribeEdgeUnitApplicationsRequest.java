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

public class DescribeEdgeUnitApplicationsRequest extends AbstractModel{

    /**
    * 单元ID
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * 翻页偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 翻页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 名称模糊匹配
    */
    @SerializedName("NamePattern")
    @Expose
    private String NamePattern;

    /**
    * 字段排序 (Sort.Filed为:StartTime）
    */
    @SerializedName("Sort")
    @Expose
    private FieldSort [] Sort;

    /**
    * 命名空间过滤
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * Get 单元ID 
     * @return EdgeUnitId 单元ID
     */
    public Long getEdgeUnitId() {
        return this.EdgeUnitId;
    }

    /**
     * Set 单元ID
     * @param EdgeUnitId 单元ID
     */
    public void setEdgeUnitId(Long EdgeUnitId) {
        this.EdgeUnitId = EdgeUnitId;
    }

    /**
     * Get 翻页偏移 
     * @return Offset 翻页偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页偏移
     * @param Offset 翻页偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 翻页大小 
     * @return Limit 翻页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 翻页大小
     * @param Limit 翻页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 名称模糊匹配 
     * @return NamePattern 名称模糊匹配
     */
    public String getNamePattern() {
        return this.NamePattern;
    }

    /**
     * Set 名称模糊匹配
     * @param NamePattern 名称模糊匹配
     */
    public void setNamePattern(String NamePattern) {
        this.NamePattern = NamePattern;
    }

    /**
     * Get 字段排序 (Sort.Filed为:StartTime） 
     * @return Sort 字段排序 (Sort.Filed为:StartTime）
     */
    public FieldSort [] getSort() {
        return this.Sort;
    }

    /**
     * Set 字段排序 (Sort.Filed为:StartTime）
     * @param Sort 字段排序 (Sort.Filed为:StartTime）
     */
    public void setSort(FieldSort [] Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 命名空间过滤 
     * @return Namespace 命名空间过滤
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间过滤
     * @param Namespace 命名空间过滤
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    public DescribeEdgeUnitApplicationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeUnitApplicationsRequest(DescribeEdgeUnitApplicationsRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.NamePattern != null) {
            this.NamePattern = new String(source.NamePattern);
        }
        if (source.Sort != null) {
            this.Sort = new FieldSort[source.Sort.length];
            for (int i = 0; i < source.Sort.length; i++) {
                this.Sort[i] = new FieldSort(source.Sort[i]);
            }
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NamePattern", this.NamePattern);
        this.setParamArrayObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

