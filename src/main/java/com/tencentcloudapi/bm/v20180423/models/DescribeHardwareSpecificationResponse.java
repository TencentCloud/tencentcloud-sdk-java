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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHardwareSpecificationResponse extends AbstractModel {

    /**
    * CPU型号列表
    */
    @SerializedName("CpuInfoSet")
    @Expose
    private CpuInfo [] CpuInfoSet;

    /**
    * 内存的取值，单位为G
    */
    @SerializedName("MemSet")
    @Expose
    private Long [] MemSet;

    /**
    * 硬盘型号列表
    */
    @SerializedName("DiskInfoSet")
    @Expose
    private DiskInfo [] DiskInfoSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get CPU型号列表 
     * @return CpuInfoSet CPU型号列表
     */
    public CpuInfo [] getCpuInfoSet() {
        return this.CpuInfoSet;
    }

    /**
     * Set CPU型号列表
     * @param CpuInfoSet CPU型号列表
     */
    public void setCpuInfoSet(CpuInfo [] CpuInfoSet) {
        this.CpuInfoSet = CpuInfoSet;
    }

    /**
     * Get 内存的取值，单位为G 
     * @return MemSet 内存的取值，单位为G
     */
    public Long [] getMemSet() {
        return this.MemSet;
    }

    /**
     * Set 内存的取值，单位为G
     * @param MemSet 内存的取值，单位为G
     */
    public void setMemSet(Long [] MemSet) {
        this.MemSet = MemSet;
    }

    /**
     * Get 硬盘型号列表 
     * @return DiskInfoSet 硬盘型号列表
     */
    public DiskInfo [] getDiskInfoSet() {
        return this.DiskInfoSet;
    }

    /**
     * Set 硬盘型号列表
     * @param DiskInfoSet 硬盘型号列表
     */
    public void setDiskInfoSet(DiskInfo [] DiskInfoSet) {
        this.DiskInfoSet = DiskInfoSet;
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

    public DescribeHardwareSpecificationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHardwareSpecificationResponse(DescribeHardwareSpecificationResponse source) {
        if (source.CpuInfoSet != null) {
            this.CpuInfoSet = new CpuInfo[source.CpuInfoSet.length];
            for (int i = 0; i < source.CpuInfoSet.length; i++) {
                this.CpuInfoSet[i] = new CpuInfo(source.CpuInfoSet[i]);
            }
        }
        if (source.MemSet != null) {
            this.MemSet = new Long[source.MemSet.length];
            for (int i = 0; i < source.MemSet.length; i++) {
                this.MemSet[i] = new Long(source.MemSet[i]);
            }
        }
        if (source.DiskInfoSet != null) {
            this.DiskInfoSet = new DiskInfo[source.DiskInfoSet.length];
            for (int i = 0; i < source.DiskInfoSet.length; i++) {
                this.DiskInfoSet[i] = new DiskInfo(source.DiskInfoSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CpuInfoSet.", this.CpuInfoSet);
        this.setParamArraySimple(map, prefix + "MemSet.", this.MemSet);
        this.setParamArrayObj(map, prefix + "DiskInfoSet.", this.DiskInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

