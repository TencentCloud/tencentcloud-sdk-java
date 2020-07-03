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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeDBInstanceResponse extends AbstractModel{

    /**
    * 交易名字。
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * 冻结流水号
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 交易名字。 
     * @return DealName 交易名字。
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 交易名字。
     * @param DealName 交易名字。
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get 冻结流水号 
     * @return BillId 冻结流水号
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * Set 冻结流水号
     * @param BillId 冻结流水号
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
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
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "BillId", this.BillId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

