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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountQuotaResponse extends AbstractModel{

    /**
    * 用户appid
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 配额数据
    */
    @SerializedName("AccountQuotaOverview")
    @Expose
    private AccountQuotaOverview AccountQuotaOverview;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户appid 
     * @return AppId 用户appid
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户appid
     * @param AppId 用户appid
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 配额数据 
     * @return AccountQuotaOverview 配额数据
     */
    public AccountQuotaOverview getAccountQuotaOverview() {
        return this.AccountQuotaOverview;
    }

    /**
     * Set 配额数据
     * @param AccountQuotaOverview 配额数据
     */
    public void setAccountQuotaOverview(AccountQuotaOverview AccountQuotaOverview) {
        this.AccountQuotaOverview = AccountQuotaOverview;
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

    public DescribeAccountQuotaResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountQuotaResponse(DescribeAccountQuotaResponse source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AccountQuotaOverview != null) {
            this.AccountQuotaOverview = new AccountQuotaOverview(source.AccountQuotaOverview);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamObj(map, prefix + "AccountQuotaOverview.", this.AccountQuotaOverview);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

