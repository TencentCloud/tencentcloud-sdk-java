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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBgpInstancesRequest extends AbstractModel {

    /**
    * 地域
    */
    @SerializedName("FilterRegion")
    @Expose
    private String FilterRegion;

    /**
    * ["bgp-0000041i"]
    */
    @SerializedName("FilterInstanceIdList")
    @Expose
    private String [] FilterInstanceIdList;

    /**
    * [{}]
    */
    @SerializedName("FilterTag")
    @Expose
    private TagInfo [] FilterTag;

    /**
    * 分页数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 地域 
     * @return FilterRegion 地域
     */
    public String getFilterRegion() {
        return this.FilterRegion;
    }

    /**
     * Set 地域
     * @param FilterRegion 地域
     */
    public void setFilterRegion(String FilterRegion) {
        this.FilterRegion = FilterRegion;
    }

    /**
     * Get ["bgp-0000041i"] 
     * @return FilterInstanceIdList ["bgp-0000041i"]
     */
    public String [] getFilterInstanceIdList() {
        return this.FilterInstanceIdList;
    }

    /**
     * Set ["bgp-0000041i"]
     * @param FilterInstanceIdList ["bgp-0000041i"]
     */
    public void setFilterInstanceIdList(String [] FilterInstanceIdList) {
        this.FilterInstanceIdList = FilterInstanceIdList;
    }

    /**
     * Get [{}] 
     * @return FilterTag [{}]
     */
    public TagInfo [] getFilterTag() {
        return this.FilterTag;
    }

    /**
     * Set [{}]
     * @param FilterTag [{}]
     */
    public void setFilterTag(TagInfo [] FilterTag) {
        this.FilterTag = FilterTag;
    }

    /**
     * Get 分页数量 
     * @return Limit 分页数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页数量
     * @param Limit 分页数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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

    public DescribeBgpInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBgpInstancesRequest(DescribeBgpInstancesRequest source) {
        if (source.FilterRegion != null) {
            this.FilterRegion = new String(source.FilterRegion);
        }
        if (source.FilterInstanceIdList != null) {
            this.FilterInstanceIdList = new String[source.FilterInstanceIdList.length];
            for (int i = 0; i < source.FilterInstanceIdList.length; i++) {
                this.FilterInstanceIdList[i] = new String(source.FilterInstanceIdList[i]);
            }
        }
        if (source.FilterTag != null) {
            this.FilterTag = new TagInfo[source.FilterTag.length];
            for (int i = 0; i < source.FilterTag.length; i++) {
                this.FilterTag[i] = new TagInfo(source.FilterTag[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilterRegion", this.FilterRegion);
        this.setParamArraySimple(map, prefix + "FilterInstanceIdList.", this.FilterInstanceIdList);
        this.setParamArrayObj(map, prefix + "FilterTag.", this.FilterTag);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

