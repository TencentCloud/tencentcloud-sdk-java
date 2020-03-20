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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSnapOverviewResponse extends AbstractModel{

    /**
    * 用户快照总大小
    */
    @SerializedName("TotalSize")
    @Expose
    private Float TotalSize;

    /**
    * 用户快照总大小（用于计费）
    */
    @SerializedName("RealTradeSize")
    @Expose
    private Float RealTradeSize;

    /**
    * 快照免费额度
    */
    @SerializedName("FreeQuota")
    @Expose
    private Float FreeQuota;

    /**
    * 快照总个数
    */
    @SerializedName("TotalNums")
    @Expose
    private Long TotalNums;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户快照总大小 
     * @return TotalSize 用户快照总大小
     */
    public Float getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set 用户快照总大小
     * @param TotalSize 用户快照总大小
     */
    public void setTotalSize(Float TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Get 用户快照总大小（用于计费） 
     * @return RealTradeSize 用户快照总大小（用于计费）
     */
    public Float getRealTradeSize() {
        return this.RealTradeSize;
    }

    /**
     * Set 用户快照总大小（用于计费）
     * @param RealTradeSize 用户快照总大小（用于计费）
     */
    public void setRealTradeSize(Float RealTradeSize) {
        this.RealTradeSize = RealTradeSize;
    }

    /**
     * Get 快照免费额度 
     * @return FreeQuota 快照免费额度
     */
    public Float getFreeQuota() {
        return this.FreeQuota;
    }

    /**
     * Set 快照免费额度
     * @param FreeQuota 快照免费额度
     */
    public void setFreeQuota(Float FreeQuota) {
        this.FreeQuota = FreeQuota;
    }

    /**
     * Get 快照总个数 
     * @return TotalNums 快照总个数
     */
    public Long getTotalNums() {
        return this.TotalNums;
    }

    /**
     * Set 快照总个数
     * @param TotalNums 快照总个数
     */
    public void setTotalNums(Long TotalNums) {
        this.TotalNums = TotalNums;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);
        this.setParamSimple(map, prefix + "RealTradeSize", this.RealTradeSize);
        this.setParamSimple(map, prefix + "FreeQuota", this.FreeQuota);
        this.setParamSimple(map, prefix + "TotalNums", this.TotalNums);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

