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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSimpleInstancesRequest extends AbstractModel{

    /**
    * 11
    */
    @SerializedName("SearchInstanceId")
    @Expose
    private String SearchInstanceId;

    /**
    * 11
    */
    @SerializedName("SearchInstanceName")
    @Expose
    private String SearchInstanceName;

    /**
    * 11
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 11
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 11
    */
    @SerializedName("SearchTags")
    @Expose
    private String [] SearchTags;

    /**
     * Get 11 
     * @return SearchInstanceId 11
     */
    public String getSearchInstanceId() {
        return this.SearchInstanceId;
    }

    /**
     * Set 11
     * @param SearchInstanceId 11
     */
    public void setSearchInstanceId(String SearchInstanceId) {
        this.SearchInstanceId = SearchInstanceId;
    }

    /**
     * Get 11 
     * @return SearchInstanceName 11
     */
    public String getSearchInstanceName() {
        return this.SearchInstanceName;
    }

    /**
     * Set 11
     * @param SearchInstanceName 11
     */
    public void setSearchInstanceName(String SearchInstanceName) {
        this.SearchInstanceName = SearchInstanceName;
    }

    /**
     * Get 11 
     * @return Offset 11
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 11
     * @param Offset 11
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 11 
     * @return Limit 11
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 11
     * @param Limit 11
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 11 
     * @return SearchTags 11
     */
    public String [] getSearchTags() {
        return this.SearchTags;
    }

    /**
     * Set 11
     * @param SearchTags 11
     */
    public void setSearchTags(String [] SearchTags) {
        this.SearchTags = SearchTags;
    }

    public DescribeSimpleInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSimpleInstancesRequest(DescribeSimpleInstancesRequest source) {
        if (source.SearchInstanceId != null) {
            this.SearchInstanceId = new String(source.SearchInstanceId);
        }
        if (source.SearchInstanceName != null) {
            this.SearchInstanceName = new String(source.SearchInstanceName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchTags != null) {
            this.SearchTags = new String[source.SearchTags.length];
            for (int i = 0; i < source.SearchTags.length; i++) {
                this.SearchTags[i] = new String(source.SearchTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SearchInstanceId", this.SearchInstanceId);
        this.setParamSimple(map, prefix + "SearchInstanceName", this.SearchInstanceName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "SearchTags.", this.SearchTags);

    }
}

