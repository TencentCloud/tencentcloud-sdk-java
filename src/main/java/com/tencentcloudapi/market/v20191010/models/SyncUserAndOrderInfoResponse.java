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
package com.tencentcloudapi.market.v20191010.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncUserAndOrderInfoResponse extends AbstractModel{

    /**
    * 同步用户信息订单信息详情
    */
    @SerializedName("Details")
    @Expose
    private SyncUserAndOrderInfoDetail Details;

    /**
    * 返回信息 成功返回 0 success
    */
    @SerializedName("Info")
    @Expose
    private Error Info;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 同步用户信息订单信息详情 
     * @return Details 同步用户信息订单信息详情
     */
    public SyncUserAndOrderInfoDetail getDetails() {
        return this.Details;
    }

    /**
     * Set 同步用户信息订单信息详情
     * @param Details 同步用户信息订单信息详情
     */
    public void setDetails(SyncUserAndOrderInfoDetail Details) {
        this.Details = Details;
    }

    /**
     * Get 返回信息 成功返回 0 success 
     * @return Info 返回信息 成功返回 0 success
     */
    public Error getInfo() {
        return this.Info;
    }

    /**
     * Set 返回信息 成功返回 0 success
     * @param Info 返回信息 成功返回 0 success
     */
    public void setInfo(Error Info) {
        this.Info = Info;
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

    public SyncUserAndOrderInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncUserAndOrderInfoResponse(SyncUserAndOrderInfoResponse source) {
        if (source.Details != null) {
            this.Details = new SyncUserAndOrderInfoDetail(source.Details);
        }
        if (source.Info != null) {
            this.Info = new Error(source.Info);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Details.", this.Details);
        this.setParamObj(map, prefix + "Info.", this.Info);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

