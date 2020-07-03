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
package com.tencentcloudapi.cds.v20180420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDbauditInstancesRequest extends AbstractModel{

    /**
    * 查询条件地域
    */
    @SerializedName("SearchRegion")
    @Expose
    private String SearchRegion;

    /**
    * 限制数目，默认10， 最大50
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认1
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 查询条件地域 
     * @return SearchRegion 查询条件地域
     */
    public String getSearchRegion() {
        return this.SearchRegion;
    }

    /**
     * Set 查询条件地域
     * @param SearchRegion 查询条件地域
     */
    public void setSearchRegion(String SearchRegion) {
        this.SearchRegion = SearchRegion;
    }

    /**
     * Get 限制数目，默认10， 最大50 
     * @return Limit 限制数目，默认10， 最大50
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目，默认10， 最大50
     * @param Limit 限制数目，默认10， 最大50
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认1 
     * @return Offset 偏移量，默认1
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认1
     * @param Offset 偏移量，默认1
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SearchRegion", this.SearchRegion);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

