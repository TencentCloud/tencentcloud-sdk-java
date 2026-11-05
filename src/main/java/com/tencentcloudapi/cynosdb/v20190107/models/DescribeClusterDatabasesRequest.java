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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterDatabasesRequest extends AbstractModel {

    /**
    * <p>集群id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>DB库名（支持模糊匹配）</p>
    */
    @SerializedName("FuzzyDBNames")
    @Expose
    private String [] FuzzyDBNames;

    /**
    * <p>分页偏移</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页限制数量</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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

    /**
     * Get <p>DB库名（支持模糊匹配）</p> 
     * @return FuzzyDBNames <p>DB库名（支持模糊匹配）</p>
     */
    public String [] getFuzzyDBNames() {
        return this.FuzzyDBNames;
    }

    /**
     * Set <p>DB库名（支持模糊匹配）</p>
     * @param FuzzyDBNames <p>DB库名（支持模糊匹配）</p>
     */
    public void setFuzzyDBNames(String [] FuzzyDBNames) {
        this.FuzzyDBNames = FuzzyDBNames;
    }

    /**
     * Get <p>分页偏移</p> 
     * @return Offset <p>分页偏移</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移</p>
     * @param Offset <p>分页偏移</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页限制数量</p> 
     * @return Limit <p>分页限制数量</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页限制数量</p>
     * @param Limit <p>分页限制数量</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeClusterDatabasesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterDatabasesRequest(DescribeClusterDatabasesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.FuzzyDBNames != null) {
            this.FuzzyDBNames = new String[source.FuzzyDBNames.length];
            for (int i = 0; i < source.FuzzyDBNames.length; i++) {
                this.FuzzyDBNames[i] = new String(source.FuzzyDBNames[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "FuzzyDBNames.", this.FuzzyDBNames);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

