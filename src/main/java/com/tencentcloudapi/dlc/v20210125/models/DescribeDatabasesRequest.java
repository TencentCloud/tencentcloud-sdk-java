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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabasesRequest extends AbstractModel{

    /**
    * 返回数量，默认为10，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 数据偏移量，从0开始，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 模糊匹配，库名关键字。
    */
    @SerializedName("KeyWord")
    @Expose
    private String KeyWord;

    /**
    * 数据源唯名称，该名称可以通过DescribeDatasourceConnection接口查询到。默认为DataLakeCatalog
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * 排序字段，当前版本仅支持按库名排序
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 排序类型：false：降序（默认）、true：升序
    */
    @SerializedName("Asc")
    @Expose
    private Boolean Asc;

    /**
     * Get 返回数量，默认为10，最大值为100。 
     * @return Limit 返回数量，默认为10，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为10，最大值为100。
     * @param Limit 返回数量，默认为10，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 数据偏移量，从0开始，默认为0。 
     * @return Offset 数据偏移量，从0开始，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据偏移量，从0开始，默认为0。
     * @param Offset 数据偏移量，从0开始，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 模糊匹配，库名关键字。 
     * @return KeyWord 模糊匹配，库名关键字。
     */
    public String getKeyWord() {
        return this.KeyWord;
    }

    /**
     * Set 模糊匹配，库名关键字。
     * @param KeyWord 模糊匹配，库名关键字。
     */
    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    /**
     * Get 数据源唯名称，该名称可以通过DescribeDatasourceConnection接口查询到。默认为DataLakeCatalog 
     * @return DatasourceConnectionName 数据源唯名称，该名称可以通过DescribeDatasourceConnection接口查询到。默认为DataLakeCatalog
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set 数据源唯名称，该名称可以通过DescribeDatasourceConnection接口查询到。默认为DataLakeCatalog
     * @param DatasourceConnectionName 数据源唯名称，该名称可以通过DescribeDatasourceConnection接口查询到。默认为DataLakeCatalog
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get 排序字段，当前版本仅支持按库名排序 
     * @return Sort 排序字段，当前版本仅支持按库名排序
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 排序字段，当前版本仅支持按库名排序
     * @param Sort 排序字段，当前版本仅支持按库名排序
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 排序类型：false：降序（默认）、true：升序 
     * @return Asc 排序类型：false：降序（默认）、true：升序
     */
    public Boolean getAsc() {
        return this.Asc;
    }

    /**
     * Set 排序类型：false：降序（默认）、true：升序
     * @param Asc 排序类型：false：降序（默认）、true：升序
     */
    public void setAsc(Boolean Asc) {
        this.Asc = Asc;
    }

    public DescribeDatabasesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabasesRequest(DescribeDatabasesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.KeyWord != null) {
            this.KeyWord = new String(source.KeyWord);
        }
        if (source.DatasourceConnectionName != null) {
            this.DatasourceConnectionName = new String(source.DatasourceConnectionName);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Asc != null) {
            this.Asc = new Boolean(source.Asc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "KeyWord", this.KeyWord);
        this.setParamSimple(map, prefix + "DatasourceConnectionName", this.DatasourceConnectionName);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Asc", this.Asc);

    }
}

