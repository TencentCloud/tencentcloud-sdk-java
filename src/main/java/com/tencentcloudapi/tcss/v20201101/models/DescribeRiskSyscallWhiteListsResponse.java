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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRiskSyscallWhiteListsResponse extends AbstractModel{

    /**
    * 事件总数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 白名单信息列表
    */
    @SerializedName("WhiteListSet")
    @Expose
    private RiskSyscallWhiteListBaseInfo [] WhiteListSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 事件总数量 
     * @return TotalCount 事件总数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 事件总数量
     * @param TotalCount 事件总数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 白名单信息列表 
     * @return WhiteListSet 白名单信息列表
     */
    public RiskSyscallWhiteListBaseInfo [] getWhiteListSet() {
        return this.WhiteListSet;
    }

    /**
     * Set 白名单信息列表
     * @param WhiteListSet 白名单信息列表
     */
    public void setWhiteListSet(RiskSyscallWhiteListBaseInfo [] WhiteListSet) {
        this.WhiteListSet = WhiteListSet;
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

    public DescribeRiskSyscallWhiteListsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRiskSyscallWhiteListsResponse(DescribeRiskSyscallWhiteListsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.WhiteListSet != null) {
            this.WhiteListSet = new RiskSyscallWhiteListBaseInfo[source.WhiteListSet.length];
            for (int i = 0; i < source.WhiteListSet.length; i++) {
                this.WhiteListSet[i] = new RiskSyscallWhiteListBaseInfo(source.WhiteListSet[i]);
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
        this.setParamArrayObj(map, prefix + "WhiteListSet.", this.WhiteListSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

