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

public class DescribeConfigMapsRequest extends AbstractModel{

    /**
    * 单元ID
    */
    @SerializedName("EdgeUnitID")
    @Expose
    private Long EdgeUnitID;

    /**
    * 翻页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页大小(最大100)
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 命名空间
    */
    @SerializedName("ConfigMapNamespace")
    @Expose
    private String ConfigMapNamespace;

    /**
    * 模糊匹配的名称
    */
    @SerializedName("NamePattern")
    @Expose
    private String NamePattern;

    /**
    * Sort.Fileld填写CreateTime Sort.Order(ASC|DESC) 默认ASC
    */
    @SerializedName("Sort")
    @Expose
    private FieldSort Sort;

    /**
     * Get 单元ID 
     * @return EdgeUnitID 单元ID
     */
    public Long getEdgeUnitID() {
        return this.EdgeUnitID;
    }

    /**
     * Set 单元ID
     * @param EdgeUnitID 单元ID
     */
    public void setEdgeUnitID(Long EdgeUnitID) {
        this.EdgeUnitID = EdgeUnitID;
    }

    /**
     * Get 翻页偏移量 
     * @return Offset 翻页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页偏移量
     * @param Offset 翻页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页大小(最大100) 
     * @return Limit 每页大小(最大100)
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页大小(最大100)
     * @param Limit 每页大小(最大100)
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 命名空间 
     * @return ConfigMapNamespace 命名空间
     */
    public String getConfigMapNamespace() {
        return this.ConfigMapNamespace;
    }

    /**
     * Set 命名空间
     * @param ConfigMapNamespace 命名空间
     */
    public void setConfigMapNamespace(String ConfigMapNamespace) {
        this.ConfigMapNamespace = ConfigMapNamespace;
    }

    /**
     * Get 模糊匹配的名称 
     * @return NamePattern 模糊匹配的名称
     */
    public String getNamePattern() {
        return this.NamePattern;
    }

    /**
     * Set 模糊匹配的名称
     * @param NamePattern 模糊匹配的名称
     */
    public void setNamePattern(String NamePattern) {
        this.NamePattern = NamePattern;
    }

    /**
     * Get Sort.Fileld填写CreateTime Sort.Order(ASC|DESC) 默认ASC 
     * @return Sort Sort.Fileld填写CreateTime Sort.Order(ASC|DESC) 默认ASC
     */
    public FieldSort getSort() {
        return this.Sort;
    }

    /**
     * Set Sort.Fileld填写CreateTime Sort.Order(ASC|DESC) 默认ASC
     * @param Sort Sort.Fileld填写CreateTime Sort.Order(ASC|DESC) 默认ASC
     */
    public void setSort(FieldSort Sort) {
        this.Sort = Sort;
    }

    public DescribeConfigMapsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigMapsRequest(DescribeConfigMapsRequest source) {
        if (source.EdgeUnitID != null) {
            this.EdgeUnitID = new Long(source.EdgeUnitID);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ConfigMapNamespace != null) {
            this.ConfigMapNamespace = new String(source.ConfigMapNamespace);
        }
        if (source.NamePattern != null) {
            this.NamePattern = new String(source.NamePattern);
        }
        if (source.Sort != null) {
            this.Sort = new FieldSort(source.Sort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitID", this.EdgeUnitID);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ConfigMapNamespace", this.ConfigMapNamespace);
        this.setParamSimple(map, prefix + "NamePattern", this.NamePattern);
        this.setParamObj(map, prefix + "Sort.", this.Sort);

    }
}

