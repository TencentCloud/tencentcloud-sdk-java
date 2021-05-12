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

public class GetAccountResponse extends AbstractModel{

    /**
    * 命名空间已使用的信息
    */
    @SerializedName("AccountUsage")
    @Expose
    private UsageInfo AccountUsage;

    /**
    * 命名空间限制的信息
    */
    @SerializedName("AccountLimit")
    @Expose
    private LimitsInfo AccountLimit;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 命名空间已使用的信息 
     * @return AccountUsage 命名空间已使用的信息
     */
    public UsageInfo getAccountUsage() {
        return this.AccountUsage;
    }

    /**
     * Set 命名空间已使用的信息
     * @param AccountUsage 命名空间已使用的信息
     */
    public void setAccountUsage(UsageInfo AccountUsage) {
        this.AccountUsage = AccountUsage;
    }

    /**
     * Get 命名空间限制的信息 
     * @return AccountLimit 命名空间限制的信息
     */
    public LimitsInfo getAccountLimit() {
        return this.AccountLimit;
    }

    /**
     * Set 命名空间限制的信息
     * @param AccountLimit 命名空间限制的信息
     */
    public void setAccountLimit(LimitsInfo AccountLimit) {
        this.AccountLimit = AccountLimit;
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

    public GetAccountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAccountResponse(GetAccountResponse source) {
        if (source.AccountUsage != null) {
            this.AccountUsage = new UsageInfo(source.AccountUsage);
        }
        if (source.AccountLimit != null) {
            this.AccountLimit = new LimitsInfo(source.AccountLimit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AccountUsage.", this.AccountUsage);
        this.setParamObj(map, prefix + "AccountLimit.", this.AccountLimit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

