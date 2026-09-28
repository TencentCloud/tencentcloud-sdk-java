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
    * <p>偏移</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>最大数量</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>资源ID或者资源名字模糊查询的关键字</p>
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * <p>标签过滤条件</p>
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * <p>设备所属的厂商名称，根据厂商来进行筛选</p>
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * <p>Hsm服务类型，可选virtualization、physical、GHSM、EHSM、SHSM、all</p>
    */
    @SerializedName("HsmType")
    @Expose
    private String HsmType;

    /**
    * <p>集群id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get <p>偏移</p> 
     * @return Offset <p>偏移</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移</p>
     * @param Offset <p>偏移</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>最大数量</p> 
     * @return Limit <p>最大数量</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>最大数量</p>
     * @param Limit <p>最大数量</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>资源ID或者资源名字模糊查询的关键字</p> 
     * @return SearchWord <p>资源ID或者资源名字模糊查询的关键字</p>
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set <p>资源ID或者资源名字模糊查询的关键字</p>
     * @param SearchWord <p>资源ID或者资源名字模糊查询的关键字</p>
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get <p>标签过滤条件</p> 
     * @return TagFilters <p>标签过滤条件</p>
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set <p>标签过滤条件</p>
     * @param TagFilters <p>标签过滤条件</p>
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get <p>设备所属的厂商名称，根据厂商来进行筛选</p> 
     * @return Manufacturer <p>设备所属的厂商名称，根据厂商来进行筛选</p>
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set <p>设备所属的厂商名称，根据厂商来进行筛选</p>
     * @param Manufacturer <p>设备所属的厂商名称，根据厂商来进行筛选</p>
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get <p>Hsm服务类型，可选virtualization、physical、GHSM、EHSM、SHSM、all</p> 
     * @return HsmType <p>Hsm服务类型，可选virtualization、physical、GHSM、EHSM、SHSM、all</p>
     */
    public String getHsmType() {
        return this.HsmType;
    }

    /**
     * Set <p>Hsm服务类型，可选virtualization、physical、GHSM、EHSM、SHSM、all</p>
     * @param HsmType <p>Hsm服务类型，可选virtualization、physical、GHSM、EHSM、SHSM、all</p>
     */
    public void setHsmType(String HsmType) {
        this.HsmType = HsmType;
    }

    /**
     * Get <p>集群id</p> 
     * @return ClusterId <p>集群id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群id</p>
     * @param ClusterId <p>集群id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
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
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
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
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

