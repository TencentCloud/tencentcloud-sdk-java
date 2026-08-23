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

public class DescribeClusterStorageAutoExpandResponse extends AbstractModel {

    /**
    * <p>存储使用率阈值</p>
    */
    @SerializedName("StorageUsageThreshold")
    @Expose
    private Long StorageUsageThreshold;

    /**
    * <p>扩容步长</p>
    */
    @SerializedName("ExpandStep")
    @Expose
    private Long ExpandStep;

    /**
    * <p>最大存储上限</p>
    */
    @SerializedName("MaxStorageLimit")
    @Expose
    private Long MaxStorageLimit;

    /**
    * <p>是否开启：yes-开启，no-关闭</p>
    */
    @SerializedName("StorageAutoExpand")
    @Expose
    private String StorageAutoExpand;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>存储使用率阈值</p> 
     * @return StorageUsageThreshold <p>存储使用率阈值</p>
     */
    public Long getStorageUsageThreshold() {
        return this.StorageUsageThreshold;
    }

    /**
     * Set <p>存储使用率阈值</p>
     * @param StorageUsageThreshold <p>存储使用率阈值</p>
     */
    public void setStorageUsageThreshold(Long StorageUsageThreshold) {
        this.StorageUsageThreshold = StorageUsageThreshold;
    }

    /**
     * Get <p>扩容步长</p> 
     * @return ExpandStep <p>扩容步长</p>
     */
    public Long getExpandStep() {
        return this.ExpandStep;
    }

    /**
     * Set <p>扩容步长</p>
     * @param ExpandStep <p>扩容步长</p>
     */
    public void setExpandStep(Long ExpandStep) {
        this.ExpandStep = ExpandStep;
    }

    /**
     * Get <p>最大存储上限</p> 
     * @return MaxStorageLimit <p>最大存储上限</p>
     */
    public Long getMaxStorageLimit() {
        return this.MaxStorageLimit;
    }

    /**
     * Set <p>最大存储上限</p>
     * @param MaxStorageLimit <p>最大存储上限</p>
     */
    public void setMaxStorageLimit(Long MaxStorageLimit) {
        this.MaxStorageLimit = MaxStorageLimit;
    }

    /**
     * Get <p>是否开启：yes-开启，no-关闭</p> 
     * @return StorageAutoExpand <p>是否开启：yes-开启，no-关闭</p>
     */
    public String getStorageAutoExpand() {
        return this.StorageAutoExpand;
    }

    /**
     * Set <p>是否开启：yes-开启，no-关闭</p>
     * @param StorageAutoExpand <p>是否开启：yes-开启，no-关闭</p>
     */
    public void setStorageAutoExpand(String StorageAutoExpand) {
        this.StorageAutoExpand = StorageAutoExpand;
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

    public DescribeClusterStorageAutoExpandResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterStorageAutoExpandResponse(DescribeClusterStorageAutoExpandResponse source) {
        if (source.StorageUsageThreshold != null) {
            this.StorageUsageThreshold = new Long(source.StorageUsageThreshold);
        }
        if (source.ExpandStep != null) {
            this.ExpandStep = new Long(source.ExpandStep);
        }
        if (source.MaxStorageLimit != null) {
            this.MaxStorageLimit = new Long(source.MaxStorageLimit);
        }
        if (source.StorageAutoExpand != null) {
            this.StorageAutoExpand = new String(source.StorageAutoExpand);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageUsageThreshold", this.StorageUsageThreshold);
        this.setParamSimple(map, prefix + "ExpandStep", this.ExpandStep);
        this.setParamSimple(map, prefix + "MaxStorageLimit", this.MaxStorageLimit);
        this.setParamSimple(map, prefix + "StorageAutoExpand", this.StorageAutoExpand);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

