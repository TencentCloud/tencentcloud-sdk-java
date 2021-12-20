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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDisksReturnableResponse extends AbstractModel{

    /**
    * 可退还云硬盘详细信息列表。
    */
    @SerializedName("DiskReturnableSet")
    @Expose
    private DiskReturnable [] DiskReturnableSet;

    /**
    * 符合条件的云硬盘数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 可退还云硬盘详细信息列表。 
     * @return DiskReturnableSet 可退还云硬盘详细信息列表。
     */
    public DiskReturnable [] getDiskReturnableSet() {
        return this.DiskReturnableSet;
    }

    /**
     * Set 可退还云硬盘详细信息列表。
     * @param DiskReturnableSet 可退还云硬盘详细信息列表。
     */
    public void setDiskReturnableSet(DiskReturnable [] DiskReturnableSet) {
        this.DiskReturnableSet = DiskReturnableSet;
    }

    /**
     * Get 符合条件的云硬盘数量。 
     * @return TotalCount 符合条件的云硬盘数量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的云硬盘数量。
     * @param TotalCount 符合条件的云硬盘数量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDisksReturnableResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDisksReturnableResponse(DescribeDisksReturnableResponse source) {
        if (source.DiskReturnableSet != null) {
            this.DiskReturnableSet = new DiskReturnable[source.DiskReturnableSet.length];
            for (int i = 0; i < source.DiskReturnableSet.length; i++) {
                this.DiskReturnableSet[i] = new DiskReturnable(source.DiskReturnableSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DiskReturnableSet.", this.DiskReturnableSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

