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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAsyncJobsRequest extends AbstractModel {

    /**
    * <p>请求ID列表</p>
    */
    @SerializedName("RequestIds")
    @Expose
    private String [] RequestIds;

    /**
    * <p>分页游标</p>
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * <p>本次查询最大数量</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
     * Get <p>请求ID列表</p> 
     * @return RequestIds <p>请求ID列表</p>
     */
    public String [] getRequestIds() {
        return this.RequestIds;
    }

    /**
     * Set <p>请求ID列表</p>
     * @param RequestIds <p>请求ID列表</p>
     */
    public void setRequestIds(String [] RequestIds) {
        this.RequestIds = RequestIds;
    }

    /**
     * Get <p>分页游标</p> 
     * @return NextToken <p>分页游标</p>
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set <p>分页游标</p>
     * @param NextToken <p>分页游标</p>
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get <p>本次查询最大数量</p><p>取值范围：[1, 100]</p><p>默认值：20</p> 
     * @return MaxResults <p>本次查询最大数量</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set <p>本次查询最大数量</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     * @param MaxResults <p>本次查询最大数量</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    public DescribeAsyncJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAsyncJobsRequest(DescribeAsyncJobsRequest source) {
        if (source.RequestIds != null) {
            this.RequestIds = new String[source.RequestIds.length];
            for (int i = 0; i < source.RequestIds.length; i++) {
                this.RequestIds[i] = new String(source.RequestIds[i]);
            }
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RequestIds.", this.RequestIds);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);

    }
}

