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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdrExcludeNetworkSegmentsResponse extends AbstractModel {

    /**
    * <p>例外网段列表，支持IP/IP段/CIDR格式</p>
    */
    @SerializedName("NetworkSegments")
    @Expose
    private String [] NetworkSegments;

    /**
    * <p>网段数量</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>默认网段配置</p>
    */
    @SerializedName("DefaultNetworkSegments")
    @Expose
    private NetworkSegment [] DefaultNetworkSegments;

    /**
    * <p>是否修改过</p>
    */
    @SerializedName("IsModified")
    @Expose
    private Boolean IsModified;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>例外网段列表，支持IP/IP段/CIDR格式</p> 
     * @return NetworkSegments <p>例外网段列表，支持IP/IP段/CIDR格式</p>
     */
    public String [] getNetworkSegments() {
        return this.NetworkSegments;
    }

    /**
     * Set <p>例外网段列表，支持IP/IP段/CIDR格式</p>
     * @param NetworkSegments <p>例外网段列表，支持IP/IP段/CIDR格式</p>
     */
    public void setNetworkSegments(String [] NetworkSegments) {
        this.NetworkSegments = NetworkSegments;
    }

    /**
     * Get <p>网段数量</p> 
     * @return TotalCount <p>网段数量</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>网段数量</p>
     * @param TotalCount <p>网段数量</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>默认网段配置</p> 
     * @return DefaultNetworkSegments <p>默认网段配置</p>
     */
    public NetworkSegment [] getDefaultNetworkSegments() {
        return this.DefaultNetworkSegments;
    }

    /**
     * Set <p>默认网段配置</p>
     * @param DefaultNetworkSegments <p>默认网段配置</p>
     */
    public void setDefaultNetworkSegments(NetworkSegment [] DefaultNetworkSegments) {
        this.DefaultNetworkSegments = DefaultNetworkSegments;
    }

    /**
     * Get <p>是否修改过</p> 
     * @return IsModified <p>是否修改过</p>
     */
    public Boolean getIsModified() {
        return this.IsModified;
    }

    /**
     * Set <p>是否修改过</p>
     * @param IsModified <p>是否修改过</p>
     */
    public void setIsModified(Boolean IsModified) {
        this.IsModified = IsModified;
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

    public DescribeEdrExcludeNetworkSegmentsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdrExcludeNetworkSegmentsResponse(DescribeEdrExcludeNetworkSegmentsResponse source) {
        if (source.NetworkSegments != null) {
            this.NetworkSegments = new String[source.NetworkSegments.length];
            for (int i = 0; i < source.NetworkSegments.length; i++) {
                this.NetworkSegments[i] = new String(source.NetworkSegments[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DefaultNetworkSegments != null) {
            this.DefaultNetworkSegments = new NetworkSegment[source.DefaultNetworkSegments.length];
            for (int i = 0; i < source.DefaultNetworkSegments.length; i++) {
                this.DefaultNetworkSegments[i] = new NetworkSegment(source.DefaultNetworkSegments[i]);
            }
        }
        if (source.IsModified != null) {
            this.IsModified = new Boolean(source.IsModified);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "NetworkSegments.", this.NetworkSegments);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "DefaultNetworkSegments.", this.DefaultNetworkSegments);
        this.setParamSimple(map, prefix + "IsModified", this.IsModified);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

