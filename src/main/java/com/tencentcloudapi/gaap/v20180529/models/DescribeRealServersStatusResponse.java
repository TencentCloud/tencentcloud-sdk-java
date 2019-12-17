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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRealServersStatusResponse extends AbstractModel{

    /**
    * 返回源站查询结果的个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 源站被绑定状态列表
    */
    @SerializedName("RealServerStatusSet")
    @Expose
    private RealServerStatus [] RealServerStatusSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回源站查询结果的个数 
     * @return TotalCount 返回源站查询结果的个数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 返回源站查询结果的个数
     * @param TotalCount 返回源站查询结果的个数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 源站被绑定状态列表 
     * @return RealServerStatusSet 源站被绑定状态列表
     */
    public RealServerStatus [] getRealServerStatusSet() {
        return this.RealServerStatusSet;
    }

    /**
     * Set 源站被绑定状态列表
     * @param RealServerStatusSet 源站被绑定状态列表
     */
    public void setRealServerStatusSet(RealServerStatus [] RealServerStatusSet) {
        this.RealServerStatusSet = RealServerStatusSet;
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "RealServerStatusSet.", this.RealServerStatusSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

