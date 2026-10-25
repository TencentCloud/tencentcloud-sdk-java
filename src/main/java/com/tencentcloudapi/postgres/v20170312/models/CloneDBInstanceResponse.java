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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneDBInstanceResponse extends AbstractModel {

    /**
    * <p>订单号。</p>
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * <p>订单流水号。</p>
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

    /**
    * <p>克隆出的新实例ID，当前只支持后付费返回该值。</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>订单号。</p> 
     * @return DealName <p>订单号。</p>
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set <p>订单号。</p>
     * @param DealName <p>订单号。</p>
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get <p>订单流水号。</p> 
     * @return BillId <p>订单流水号。</p>
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * Set <p>订单流水号。</p>
     * @param BillId <p>订单流水号。</p>
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
    }

    /**
     * Get <p>克隆出的新实例ID，当前只支持后付费返回该值。</p> 
     * @return DBInstanceId <p>克隆出的新实例ID，当前只支持后付费返回该值。</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>克隆出的新实例ID，当前只支持后付费返回该值。</p>
     * @param DBInstanceId <p>克隆出的新实例ID，当前只支持后付费返回该值。</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CloneDBInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneDBInstanceResponse(CloneDBInstanceResponse source) {
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.BillId != null) {
            this.BillId = new String(source.BillId);
        }
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "BillId", this.BillId);
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

