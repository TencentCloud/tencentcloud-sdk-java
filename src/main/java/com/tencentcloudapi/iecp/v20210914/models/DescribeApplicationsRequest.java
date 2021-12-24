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

public class DescribeApplicationsRequest extends AbstractModel{

    /**
    * 模糊搜索字符串
    */
    @SerializedName("NamePattern")
    @Expose
    private String NamePattern;

    /**
    * 默认 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 默认 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 仅支持对 DistributeTime 字段排序，ASC/DESC
    */
    @SerializedName("Sort")
    @Expose
    private FieldSort [] Sort;

    /**
     * Get 模糊搜索字符串 
     * @return NamePattern 模糊搜索字符串
     */
    public String getNamePattern() {
        return this.NamePattern;
    }

    /**
     * Set 模糊搜索字符串
     * @param NamePattern 模糊搜索字符串
     */
    public void setNamePattern(String NamePattern) {
        this.NamePattern = NamePattern;
    }

    /**
     * Get 默认 0 
     * @return Offset 默认 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 默认 0
     * @param Offset 默认 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 默认 20 
     * @return Limit 默认 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 默认 20
     * @param Limit 默认 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 仅支持对 DistributeTime 字段排序，ASC/DESC 
     * @return Sort 仅支持对 DistributeTime 字段排序，ASC/DESC
     */
    public FieldSort [] getSort() {
        return this.Sort;
    }

    /**
     * Set 仅支持对 DistributeTime 字段排序，ASC/DESC
     * @param Sort 仅支持对 DistributeTime 字段排序，ASC/DESC
     */
    public void setSort(FieldSort [] Sort) {
        this.Sort = Sort;
    }

    public DescribeApplicationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationsRequest(DescribeApplicationsRequest source) {
        if (source.NamePattern != null) {
            this.NamePattern = new String(source.NamePattern);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Sort != null) {
            this.Sort = new FieldSort[source.Sort.length];
            for (int i = 0; i < source.Sort.length; i++) {
                this.Sort[i] = new FieldSort(source.Sort[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamePattern", this.NamePattern);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Sort.", this.Sort);

    }
}

