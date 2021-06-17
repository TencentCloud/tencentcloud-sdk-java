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

public class GetUsagePlanUsageAmountResponse extends AbstractModel{

    /**
    * 最大调用量
    */
    @SerializedName("MaxRequestNum")
    @Expose
    private Long MaxRequestNum;

    /**
    * 已经调用量
    */
    @SerializedName("InUseRequestNum")
    @Expose
    private Long InUseRequestNum;

    /**
    * 剩余调用量
    */
    @SerializedName("RemainingRequestNum")
    @Expose
    private Long RemainingRequestNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 最大调用量 
     * @return MaxRequestNum 最大调用量
     */
    public Long getMaxRequestNum() {
        return this.MaxRequestNum;
    }

    /**
     * Set 最大调用量
     * @param MaxRequestNum 最大调用量
     */
    public void setMaxRequestNum(Long MaxRequestNum) {
        this.MaxRequestNum = MaxRequestNum;
    }

    /**
     * Get 已经调用量 
     * @return InUseRequestNum 已经调用量
     */
    public Long getInUseRequestNum() {
        return this.InUseRequestNum;
    }

    /**
     * Set 已经调用量
     * @param InUseRequestNum 已经调用量
     */
    public void setInUseRequestNum(Long InUseRequestNum) {
        this.InUseRequestNum = InUseRequestNum;
    }

    /**
     * Get 剩余调用量 
     * @return RemainingRequestNum 剩余调用量
     */
    public Long getRemainingRequestNum() {
        return this.RemainingRequestNum;
    }

    /**
     * Set 剩余调用量
     * @param RemainingRequestNum 剩余调用量
     */
    public void setRemainingRequestNum(Long RemainingRequestNum) {
        this.RemainingRequestNum = RemainingRequestNum;
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

    public GetUsagePlanUsageAmountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetUsagePlanUsageAmountResponse(GetUsagePlanUsageAmountResponse source) {
        if (source.MaxRequestNum != null) {
            this.MaxRequestNum = new Long(source.MaxRequestNum);
        }
        if (source.InUseRequestNum != null) {
            this.InUseRequestNum = new Long(source.InUseRequestNum);
        }
        if (source.RemainingRequestNum != null) {
            this.RemainingRequestNum = new Long(source.RemainingRequestNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxRequestNum", this.MaxRequestNum);
        this.setParamSimple(map, prefix + "InUseRequestNum", this.InUseRequestNum);
        this.setParamSimple(map, prefix + "RemainingRequestNum", this.RemainingRequestNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

