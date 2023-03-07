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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryPartnerCreditResponse extends AbstractModel{

    /**
    * 已分配额度
    */
    @SerializedName("AllocatedCredit")
    @Expose
    private Float AllocatedCredit;

    /**
    * 额度总数
    */
    @SerializedName("TotalCredit")
    @Expose
    private Float TotalCredit;

    /**
    * 剩余额度
    */
    @SerializedName("RemainingCredit")
    @Expose
    private Float RemainingCredit;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 已分配额度 
     * @return AllocatedCredit 已分配额度
     */
    public Float getAllocatedCredit() {
        return this.AllocatedCredit;
    }

    /**
     * Set 已分配额度
     * @param AllocatedCredit 已分配额度
     */
    public void setAllocatedCredit(Float AllocatedCredit) {
        this.AllocatedCredit = AllocatedCredit;
    }

    /**
     * Get 额度总数 
     * @return TotalCredit 额度总数
     */
    public Float getTotalCredit() {
        return this.TotalCredit;
    }

    /**
     * Set 额度总数
     * @param TotalCredit 额度总数
     */
    public void setTotalCredit(Float TotalCredit) {
        this.TotalCredit = TotalCredit;
    }

    /**
     * Get 剩余额度 
     * @return RemainingCredit 剩余额度
     */
    public Float getRemainingCredit() {
        return this.RemainingCredit;
    }

    /**
     * Set 剩余额度
     * @param RemainingCredit 剩余额度
     */
    public void setRemainingCredit(Float RemainingCredit) {
        this.RemainingCredit = RemainingCredit;
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

    public QueryPartnerCreditResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryPartnerCreditResponse(QueryPartnerCreditResponse source) {
        if (source.AllocatedCredit != null) {
            this.AllocatedCredit = new Float(source.AllocatedCredit);
        }
        if (source.TotalCredit != null) {
            this.TotalCredit = new Float(source.TotalCredit);
        }
        if (source.RemainingCredit != null) {
            this.RemainingCredit = new Float(source.RemainingCredit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllocatedCredit", this.AllocatedCredit);
        this.setParamSimple(map, prefix + "TotalCredit", this.TotalCredit);
        this.setParamSimple(map, prefix + "RemainingCredit", this.RemainingCredit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

