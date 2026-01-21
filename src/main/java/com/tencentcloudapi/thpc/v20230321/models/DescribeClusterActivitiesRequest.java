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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterActivitiesRequest extends AbstractModel {

    /**
    * <p>集群ID。通过该参数指定需要查询活动历史记录的集群。</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>偏移量，默认为0。关于<code>Offset</code>的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/15688">简介</a>中的相关小节。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认为20，最大值为100。关于<code>Limit</code>的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/15688">简介</a>中的相关小节。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>集群ID。通过该参数指定需要查询活动历史记录的集群。</p> 
     * @return ClusterId <p>集群ID。通过该参数指定需要查询活动历史记录的集群。</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID。通过该参数指定需要查询活动历史记录的集群。</p>
     * @param ClusterId <p>集群ID。通过该参数指定需要查询活动历史记录的集群。</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>偏移量，默认为0。关于<code>Offset</code>的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/15688">简介</a>中的相关小节。</p> 
     * @return Offset <p>偏移量，默认为0。关于<code>Offset</code>的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/15688">简介</a>中的相关小节。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0。关于<code>Offset</code>的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/15688">简介</a>中的相关小节。</p>
     * @param Offset <p>偏移量，默认为0。关于<code>Offset</code>的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/15688">简介</a>中的相关小节。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认为20，最大值为100。关于<code>Limit</code>的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/15688">简介</a>中的相关小节。</p> 
     * @return Limit <p>返回数量，默认为20，最大值为100。关于<code>Limit</code>的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/15688">简介</a>中的相关小节。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为20，最大值为100。关于<code>Limit</code>的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/15688">简介</a>中的相关小节。</p>
     * @param Limit <p>返回数量，默认为20，最大值为100。关于<code>Limit</code>的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/15688">简介</a>中的相关小节。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeClusterActivitiesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterActivitiesRequest(DescribeClusterActivitiesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

