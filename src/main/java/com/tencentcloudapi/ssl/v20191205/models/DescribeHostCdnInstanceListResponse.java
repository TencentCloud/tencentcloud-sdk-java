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

public class DescribeHostCdnInstanceListResponse extends AbstractModel {

    /**
    * CDN实例列表，如取不到值返回空数组
    */
    @SerializedName("InstanceList")
    @Expose
    private CdnInstanceDetail [] InstanceList;

    /**
    * CDN域名总数，如取不到值返回0
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 异步刷新总数，如取不到值返回0
    */
    @SerializedName("AsyncTotalNum")
    @Expose
    private Long AsyncTotalNum;

    /**
    * 异步刷新当前执行数，如取不到值返回0
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
     * Get CDN实例列表，如取不到值返回空数组 
     * @return InstanceList CDN实例列表，如取不到值返回空数组
     */
    public CdnInstanceDetail [] getInstanceList() {
        return this.InstanceList;
    }

    /**
     * Set CDN实例列表，如取不到值返回空数组
     * @param InstanceList CDN实例列表，如取不到值返回空数组
     */
    public void setInstanceList(CdnInstanceDetail [] InstanceList) {
        this.InstanceList = InstanceList;
    }

    /**
     * Get CDN域名总数，如取不到值返回0 
     * @return TotalCount CDN域名总数，如取不到值返回0
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set CDN域名总数，如取不到值返回0
     * @param TotalCount CDN域名总数，如取不到值返回0
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 异步刷新总数，如取不到值返回0 
     * @return AsyncTotalNum 异步刷新总数，如取不到值返回0
     */
    public Long getAsyncTotalNum() {
        return this.AsyncTotalNum;
    }

    /**
     * Set 异步刷新总数，如取不到值返回0
     * @param AsyncTotalNum 异步刷新总数，如取不到值返回0
     */
    public void setAsyncTotalNum(Long AsyncTotalNum) {
        this.AsyncTotalNum = AsyncTotalNum;
    }

    /**
     * Get 异步刷新当前执行数，如取不到值返回0 
     * @return AsyncOffset 异步刷新当前执行数，如取不到值返回0
     */
    public Long getAsyncOffset() {
        return this.AsyncOffset;
    }

    /**
     * Set 异步刷新当前执行数，如取不到值返回0
     * @param AsyncOffset 异步刷新当前执行数，如取不到值返回0
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

    public DescribeHostCdnInstanceListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostCdnInstanceListResponse(DescribeHostCdnInstanceListResponse source) {
        if (source.InstanceList != null) {
            this.InstanceList = new CdnInstanceDetail[source.InstanceList.length];
            for (int i = 0; i < source.InstanceList.length; i++) {
                this.InstanceList[i] = new CdnInstanceDetail(source.InstanceList[i]);
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

