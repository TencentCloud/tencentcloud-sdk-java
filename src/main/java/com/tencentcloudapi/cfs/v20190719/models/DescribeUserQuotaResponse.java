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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserQuotaResponse extends AbstractModel{

    /**
    * UserQuota条目总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * UserQuota条目
    */
    @SerializedName("UserQuotaInfo")
    @Expose
    private UserQuota [] UserQuotaInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get UserQuota条目总数 
     * @return TotalCount UserQuota条目总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set UserQuota条目总数
     * @param TotalCount UserQuota条目总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get UserQuota条目 
     * @return UserQuotaInfo UserQuota条目
     */
    public UserQuota [] getUserQuotaInfo() {
        return this.UserQuotaInfo;
    }

    /**
     * Set UserQuota条目
     * @param UserQuotaInfo UserQuota条目
     */
    public void setUserQuotaInfo(UserQuota [] UserQuotaInfo) {
        this.UserQuotaInfo = UserQuotaInfo;
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

    public DescribeUserQuotaResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserQuotaResponse(DescribeUserQuotaResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.UserQuotaInfo != null) {
            this.UserQuotaInfo = new UserQuota[source.UserQuotaInfo.length];
            for (int i = 0; i < source.UserQuotaInfo.length; i++) {
                this.UserQuotaInfo[i] = new UserQuota(source.UserQuotaInfo[i]);
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
        this.setParamArrayObj(map, prefix + "UserQuotaInfo.", this.UserQuotaInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

