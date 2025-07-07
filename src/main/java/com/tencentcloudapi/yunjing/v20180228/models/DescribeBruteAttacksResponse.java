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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBruteAttacksResponse extends AbstractModel {

    /**
    * 事件数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 暴力破解事件列表
    */
    @SerializedName("BruteAttacks")
    @Expose
    private BruteAttack [] BruteAttacks;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 事件数量 
     * @return TotalCount 事件数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 事件数量
     * @param TotalCount 事件数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 暴力破解事件列表 
     * @return BruteAttacks 暴力破解事件列表
     */
    public BruteAttack [] getBruteAttacks() {
        return this.BruteAttacks;
    }

    /**
     * Set 暴力破解事件列表
     * @param BruteAttacks 暴力破解事件列表
     */
    public void setBruteAttacks(BruteAttack [] BruteAttacks) {
        this.BruteAttacks = BruteAttacks;
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

    public DescribeBruteAttacksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBruteAttacksResponse(DescribeBruteAttacksResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.BruteAttacks != null) {
            this.BruteAttacks = new BruteAttack[source.BruteAttacks.length];
            for (int i = 0; i < source.BruteAttacks.length; i++) {
                this.BruteAttacks[i] = new BruteAttack(source.BruteAttacks[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "BruteAttacks.", this.BruteAttacks);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

