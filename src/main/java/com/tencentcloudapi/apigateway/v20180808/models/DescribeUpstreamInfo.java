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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUpstreamInfo extends AbstractModel {

    /**
    * 查询总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 查询列表
    */
    @SerializedName("UpstreamSet")
    @Expose
    private UpstreamInfo [] UpstreamSet;

    /**
     * Get 查询总数 
     * @return TotalCount 查询总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 查询总数
     * @param TotalCount 查询总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 查询列表 
     * @return UpstreamSet 查询列表
     */
    public UpstreamInfo [] getUpstreamSet() {
        return this.UpstreamSet;
    }

    /**
     * Set 查询列表
     * @param UpstreamSet 查询列表
     */
    public void setUpstreamSet(UpstreamInfo [] UpstreamSet) {
        this.UpstreamSet = UpstreamSet;
    }

    public DescribeUpstreamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUpstreamInfo(DescribeUpstreamInfo source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.UpstreamSet != null) {
            this.UpstreamSet = new UpstreamInfo[source.UpstreamSet.length];
            for (int i = 0; i < source.UpstreamSet.length; i++) {
                this.UpstreamSet[i] = new UpstreamInfo(source.UpstreamSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "UpstreamSet.", this.UpstreamSet);

    }
}

