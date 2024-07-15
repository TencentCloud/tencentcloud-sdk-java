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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotOverviewResponse extends AbstractModel {

    /**
    * 当前总有效快照数量
    */
    @SerializedName("TotalNums")
    @Expose
    private Long TotalNums;

    /**
    * 已使用快照总容量大小，容量单位为GiB
    */
    @SerializedName("TotalSize")
    @Expose
    private Float TotalSize;

    /**
    * 快照免费额度大小，额度单位为GiB
    */
    @SerializedName("FreeQuota")
    @Expose
    private Float FreeQuota;

    /**
    * 快照真实产生计费的总容量大小，单位为GiB
    */
    @SerializedName("RealTradeSize")
    @Expose
    private Float RealTradeSize;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前总有效快照数量 
     * @return TotalNums 当前总有效快照数量
     */
    public Long getTotalNums() {
        return this.TotalNums;
    }

    /**
     * Set 当前总有效快照数量
     * @param TotalNums 当前总有效快照数量
     */
    public void setTotalNums(Long TotalNums) {
        this.TotalNums = TotalNums;
    }

    /**
     * Get 已使用快照总容量大小，容量单位为GiB 
     * @return TotalSize 已使用快照总容量大小，容量单位为GiB
     */
    public Float getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set 已使用快照总容量大小，容量单位为GiB
     * @param TotalSize 已使用快照总容量大小，容量单位为GiB
     */
    public void setTotalSize(Float TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Get 快照免费额度大小，额度单位为GiB 
     * @return FreeQuota 快照免费额度大小，额度单位为GiB
     */
    public Float getFreeQuota() {
        return this.FreeQuota;
    }

    /**
     * Set 快照免费额度大小，额度单位为GiB
     * @param FreeQuota 快照免费额度大小，额度单位为GiB
     */
    public void setFreeQuota(Float FreeQuota) {
        this.FreeQuota = FreeQuota;
    }

    /**
     * Get 快照真实产生计费的总容量大小，单位为GiB 
     * @return RealTradeSize 快照真实产生计费的总容量大小，单位为GiB
     */
    public Float getRealTradeSize() {
        return this.RealTradeSize;
    }

    /**
     * Set 快照真实产生计费的总容量大小，单位为GiB
     * @param RealTradeSize 快照真实产生计费的总容量大小，单位为GiB
     */
    public void setRealTradeSize(Float RealTradeSize) {
        this.RealTradeSize = RealTradeSize;
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

    public DescribeSnapshotOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotOverviewResponse(DescribeSnapshotOverviewResponse source) {
        if (source.TotalNums != null) {
            this.TotalNums = new Long(source.TotalNums);
        }
        if (source.TotalSize != null) {
            this.TotalSize = new Float(source.TotalSize);
        }
        if (source.FreeQuota != null) {
            this.FreeQuota = new Float(source.FreeQuota);
        }
        if (source.RealTradeSize != null) {
            this.RealTradeSize = new Float(source.RealTradeSize);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalNums", this.TotalNums);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);
        this.setParamSimple(map, prefix + "FreeQuota", this.FreeQuota);
        this.setParamSimple(map, prefix + "RealTradeSize", this.RealTradeSize);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

