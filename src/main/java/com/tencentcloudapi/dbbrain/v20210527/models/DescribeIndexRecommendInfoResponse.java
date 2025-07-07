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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIndexRecommendInfoResponse extends AbstractModel {

    /**
    * 索引推荐的集合数量。
    */
    @SerializedName("CollectionNum")
    @Expose
    private Long CollectionNum;

    /**
    * 索引推荐的索引数量。
    */
    @SerializedName("IndexNum")
    @Expose
    private Long IndexNum;

    /**
    * 索引项。
    */
    @SerializedName("Items")
    @Expose
    private MongoDBIndex [] Items;

    /**
    * 优化级别，1-4，优先级从高到低。
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 历史优化数。
    */
    @SerializedName("Optimized")
    @Expose
    private Long Optimized;

    /**
    * 累计优化条数。
    */
    @SerializedName("OptimizedCount")
    @Expose
    private Long OptimizedCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 索引推荐的集合数量。 
     * @return CollectionNum 索引推荐的集合数量。
     */
    public Long getCollectionNum() {
        return this.CollectionNum;
    }

    /**
     * Set 索引推荐的集合数量。
     * @param CollectionNum 索引推荐的集合数量。
     */
    public void setCollectionNum(Long CollectionNum) {
        this.CollectionNum = CollectionNum;
    }

    /**
     * Get 索引推荐的索引数量。 
     * @return IndexNum 索引推荐的索引数量。
     */
    public Long getIndexNum() {
        return this.IndexNum;
    }

    /**
     * Set 索引推荐的索引数量。
     * @param IndexNum 索引推荐的索引数量。
     */
    public void setIndexNum(Long IndexNum) {
        this.IndexNum = IndexNum;
    }

    /**
     * Get 索引项。 
     * @return Items 索引项。
     */
    public MongoDBIndex [] getItems() {
        return this.Items;
    }

    /**
     * Set 索引项。
     * @param Items 索引项。
     */
    public void setItems(MongoDBIndex [] Items) {
        this.Items = Items;
    }

    /**
     * Get 优化级别，1-4，优先级从高到低。 
     * @return Level 优化级别，1-4，优先级从高到低。
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 优化级别，1-4，优先级从高到低。
     * @param Level 优化级别，1-4，优先级从高到低。
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 历史优化数。 
     * @return Optimized 历史优化数。
     */
    public Long getOptimized() {
        return this.Optimized;
    }

    /**
     * Set 历史优化数。
     * @param Optimized 历史优化数。
     */
    public void setOptimized(Long Optimized) {
        this.Optimized = Optimized;
    }

    /**
     * Get 累计优化条数。 
     * @return OptimizedCount 累计优化条数。
     */
    public Long getOptimizedCount() {
        return this.OptimizedCount;
    }

    /**
     * Set 累计优化条数。
     * @param OptimizedCount 累计优化条数。
     */
    public void setOptimizedCount(Long OptimizedCount) {
        this.OptimizedCount = OptimizedCount;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeIndexRecommendInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIndexRecommendInfoResponse(DescribeIndexRecommendInfoResponse source) {
        if (source.CollectionNum != null) {
            this.CollectionNum = new Long(source.CollectionNum);
        }
        if (source.IndexNum != null) {
            this.IndexNum = new Long(source.IndexNum);
        }
        if (source.Items != null) {
            this.Items = new MongoDBIndex[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new MongoDBIndex(source.Items[i]);
            }
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Optimized != null) {
            this.Optimized = new Long(source.Optimized);
        }
        if (source.OptimizedCount != null) {
            this.OptimizedCount = new Long(source.OptimizedCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CollectionNum", this.CollectionNum);
        this.setParamSimple(map, prefix + "IndexNum", this.IndexNum);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Optimized", this.Optimized);
        this.setParamSimple(map, prefix + "OptimizedCount", this.OptimizedCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

