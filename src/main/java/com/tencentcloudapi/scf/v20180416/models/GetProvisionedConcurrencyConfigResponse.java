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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetProvisionedConcurrencyConfigResponse extends AbstractModel{

    /**
    * 该函数剩余可配置的预置并发数。
    */
    @SerializedName("UnallocatedConcurrencyNum")
    @Expose
    private Long UnallocatedConcurrencyNum;

    /**
    * 函数已预置的并发配置详情。
    */
    @SerializedName("Allocated")
    @Expose
    private VersionProvisionedConcurrencyInfo [] Allocated;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 该函数剩余可配置的预置并发数。 
     * @return UnallocatedConcurrencyNum 该函数剩余可配置的预置并发数。
     */
    public Long getUnallocatedConcurrencyNum() {
        return this.UnallocatedConcurrencyNum;
    }

    /**
     * Set 该函数剩余可配置的预置并发数。
     * @param UnallocatedConcurrencyNum 该函数剩余可配置的预置并发数。
     */
    public void setUnallocatedConcurrencyNum(Long UnallocatedConcurrencyNum) {
        this.UnallocatedConcurrencyNum = UnallocatedConcurrencyNum;
    }

    /**
     * Get 函数已预置的并发配置详情。 
     * @return Allocated 函数已预置的并发配置详情。
     */
    public VersionProvisionedConcurrencyInfo [] getAllocated() {
        return this.Allocated;
    }

    /**
     * Set 函数已预置的并发配置详情。
     * @param Allocated 函数已预置的并发配置详情。
     */
    public void setAllocated(VersionProvisionedConcurrencyInfo [] Allocated) {
        this.Allocated = Allocated;
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

    public GetProvisionedConcurrencyConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetProvisionedConcurrencyConfigResponse(GetProvisionedConcurrencyConfigResponse source) {
        if (source.UnallocatedConcurrencyNum != null) {
            this.UnallocatedConcurrencyNum = new Long(source.UnallocatedConcurrencyNum);
        }
        if (source.Allocated != null) {
            this.Allocated = new VersionProvisionedConcurrencyInfo[source.Allocated.length];
            for (int i = 0; i < source.Allocated.length; i++) {
                this.Allocated[i] = new VersionProvisionedConcurrencyInfo(source.Allocated[i]);
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
        this.setParamSimple(map, prefix + "UnallocatedConcurrencyNum", this.UnallocatedConcurrencyNum);
        this.setParamArrayObj(map, prefix + "Allocated.", this.Allocated);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

