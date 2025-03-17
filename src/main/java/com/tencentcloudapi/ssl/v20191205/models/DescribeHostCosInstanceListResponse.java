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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostCosInstanceListResponse extends AbstractModel {

    /**
    * COS实例列表
    */
    @SerializedName("InstanceList")
    @Expose
    private CosInstanceDetail [] InstanceList;

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 异步刷新总数
    */
    @SerializedName("AsyncTotalNum")
    @Expose
    private Long AsyncTotalNum;

    /**
    * 异步刷新当前执行数
    */
    @SerializedName("AsyncOffset")
    @Expose
    private Long AsyncOffset;

    /**
    * 当前缓存读取时间
    */
    @SerializedName("AsyncCacheTime")
    @Expose
    private String AsyncCacheTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get COS实例列表 
     * @return InstanceList COS实例列表
     */
    public CosInstanceDetail [] getInstanceList() {
        return this.InstanceList;
    }

    /**
     * Set COS实例列表
     * @param InstanceList COS实例列表
     */
    public void setInstanceList(CosInstanceDetail [] InstanceList) {
        this.InstanceList = InstanceList;
    }

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 异步刷新总数 
     * @return AsyncTotalNum 异步刷新总数
     */
    public Long getAsyncTotalNum() {
        return this.AsyncTotalNum;
    }

    /**
     * Set 异步刷新总数
     * @param AsyncTotalNum 异步刷新总数
     */
    public void setAsyncTotalNum(Long AsyncTotalNum) {
        this.AsyncTotalNum = AsyncTotalNum;
    }

    /**
     * Get 异步刷新当前执行数 
     * @return AsyncOffset 异步刷新当前执行数
     */
    public Long getAsyncOffset() {
        return this.AsyncOffset;
    }

    /**
     * Set 异步刷新当前执行数
     * @param AsyncOffset 异步刷新当前执行数
     */
    public void setAsyncOffset(Long AsyncOffset) {
        this.AsyncOffset = AsyncOffset;
    }

    /**
     * Get 当前缓存读取时间 
     * @return AsyncCacheTime 当前缓存读取时间
     */
    public String getAsyncCacheTime() {
        return this.AsyncCacheTime;
    }

    /**
     * Set 当前缓存读取时间
     * @param AsyncCacheTime 当前缓存读取时间
     */
    public void setAsyncCacheTime(String AsyncCacheTime) {
        this.AsyncCacheTime = AsyncCacheTime;
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

    public DescribeHostCosInstanceListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostCosInstanceListResponse(DescribeHostCosInstanceListResponse source) {
        if (source.InstanceList != null) {
            this.InstanceList = new CosInstanceDetail[source.InstanceList.length];
            for (int i = 0; i < source.InstanceList.length; i++) {
                this.InstanceList[i] = new CosInstanceDetail(source.InstanceList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AsyncTotalNum != null) {
            this.AsyncTotalNum = new Long(source.AsyncTotalNum);
        }
        if (source.AsyncOffset != null) {
            this.AsyncOffset = new Long(source.AsyncOffset);
        }
        if (source.AsyncCacheTime != null) {
            this.AsyncCacheTime = new String(source.AsyncCacheTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InstanceList.", this.InstanceList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "AsyncTotalNum", this.AsyncTotalNum);
        this.setParamSimple(map, prefix + "AsyncOffset", this.AsyncOffset);
        this.setParamSimple(map, prefix + "AsyncCacheTime", this.AsyncCacheTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

