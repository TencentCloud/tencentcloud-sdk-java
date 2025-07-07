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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVsmsRequest extends AbstractModel {

    /**
    * 偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 最大数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 资源ID或者资源名字模糊查询的关键字
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 标签过滤条件
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * 设备所属的厂商名称，根据厂商来进行筛选
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * Hsm服务类型，可选virtualization、physical、GHSM、EHSM、SHSM、all
    */
    @SerializedName("HsmType")
    @Expose
    private String HsmType;

    /**
     * Get 偏移 
     * @return Offset 偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移
     * @param Offset 偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 最大数量 
     * @return Limit 最大数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大数量
     * @param Limit 最大数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 资源ID或者资源名字模糊查询的关键字 
     * @return SearchWord 资源ID或者资源名字模糊查询的关键字
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 资源ID或者资源名字模糊查询的关键字
     * @param SearchWord 资源ID或者资源名字模糊查询的关键字
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 标签过滤条件 
     * @return TagFilters 标签过滤条件
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set 标签过滤条件
     * @param TagFilters 标签过滤条件
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get 设备所属的厂商名称，根据厂商来进行筛选 
     * @return Manufacturer 设备所属的厂商名称，根据厂商来进行筛选
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set 设备所属的厂商名称，根据厂商来进行筛选
     * @param Manufacturer 设备所属的厂商名称，根据厂商来进行筛选
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get Hsm服务类型，可选virtualization、physical、GHSM、EHSM、SHSM、all 
     * @return HsmType Hsm服务类型，可选virtualization、physical、GHSM、EHSM、SHSM、all
     */
    public String getHsmType() {
        return this.HsmType;
    }

    /**
     * Set Hsm服务类型，可选virtualization、physical、GHSM、EHSM、SHSM、all
     * @param HsmType Hsm服务类型，可选virtualization、physical、GHSM、EHSM、SHSM、all
     */
    public void setHsmType(String HsmType) {
        this.HsmType = HsmType;
    }

    public DescribeVsmsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVsmsRequest(DescribeVsmsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
        if (source.Manufacturer != null) {
            this.Manufacturer = new String(source.Manufacturer);
        }
        if (source.HsmType != null) {
            this.HsmType = new String(source.HsmType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamSimple(map, prefix + "Manufacturer", this.Manufacturer);
        this.setParamSimple(map, prefix + "HsmType", this.HsmType);

    }
}

