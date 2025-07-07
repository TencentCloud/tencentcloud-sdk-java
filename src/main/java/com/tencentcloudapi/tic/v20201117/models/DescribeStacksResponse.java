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
package com.tencentcloudapi.tic.v20201117.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStacksResponse extends AbstractModel {

    /**
    * 符合条件的资源栈数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 资源栈详细信息列表
    */
    @SerializedName("Stacks")
    @Expose
    private StackInfo [] Stacks;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合条件的资源栈数量 
     * @return TotalCount 符合条件的资源栈数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的资源栈数量
     * @param TotalCount 符合条件的资源栈数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 资源栈详细信息列表 
     * @return Stacks 资源栈详细信息列表
     */
    public StackInfo [] getStacks() {
        return this.Stacks;
    }

    /**
     * Set 资源栈详细信息列表
     * @param Stacks 资源栈详细信息列表
     */
    public void setStacks(StackInfo [] Stacks) {
        this.Stacks = Stacks;
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

    public DescribeStacksResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStacksResponse(DescribeStacksResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Stacks != null) {
            this.Stacks = new StackInfo[source.Stacks.length];
            for (int i = 0; i < source.Stacks.length; i++) {
                this.Stacks[i] = new StackInfo(source.Stacks[i]);
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
        this.setParamArrayObj(map, prefix + "Stacks.", this.Stacks);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

