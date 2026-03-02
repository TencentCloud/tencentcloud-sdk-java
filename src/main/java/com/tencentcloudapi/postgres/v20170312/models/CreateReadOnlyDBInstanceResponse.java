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

public class CreateReadOnlyDBInstanceResponse extends AbstractModel {

    /**
    * <p>订单号列表。每个实例对应一个订单号</p>
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
    * <p>冻结流水号</p>
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

    /**
    * <p>创建成功的实例ID集合，只在后付费情景下有返回值</p>
    */
    @SerializedName("DBInstanceIdSet")
    @Expose
    private String [] DBInstanceIdSet;

    /**
    * <p>入参有BillingParameters值时，出参才有值，值为商品下单的参数。</p>
    */
    @SerializedName("BillingParameters")
    @Expose
    private String BillingParameters;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>订单号列表。每个实例对应一个订单号</p> 
     * @return DealNames <p>订单号列表。每个实例对应一个订单号</p>
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set <p>订单号列表。每个实例对应一个订单号</p>
     * @param DealNames <p>订单号列表。每个实例对应一个订单号</p>
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * Get <p>冻结流水号</p> 
     * @return BillId <p>冻结流水号</p>
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * Set <p>冻结流水号</p>
     * @param BillId <p>冻结流水号</p>
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
    }

    /**
     * Get <p>创建成功的实例ID集合，只在后付费情景下有返回值</p> 
     * @return DBInstanceIdSet <p>创建成功的实例ID集合，只在后付费情景下有返回值</p>
     */
    public String [] getDBInstanceIdSet() {
        return this.DBInstanceIdSet;
    }

    /**
     * Set <p>创建成功的实例ID集合，只在后付费情景下有返回值</p>
     * @param DBInstanceIdSet <p>创建成功的实例ID集合，只在后付费情景下有返回值</p>
     */
    public void setDBInstanceIdSet(String [] DBInstanceIdSet) {
        this.DBInstanceIdSet = DBInstanceIdSet;
    }

    /**
     * Get <p>入参有BillingParameters值时，出参才有值，值为商品下单的参数。</p> 
     * @return BillingParameters <p>入参有BillingParameters值时，出参才有值，值为商品下单的参数。</p>
     */
    public String getBillingParameters() {
        return this.BillingParameters;
    }

    /**
     * Set <p>入参有BillingParameters值时，出参才有值，值为商品下单的参数。</p>
     * @param BillingParameters <p>入参有BillingParameters值时，出参才有值，值为商品下单的参数。</p>
     */
    public void setBillingParameters(String BillingParameters) {
        this.BillingParameters = BillingParameters;
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

    public CreateReadOnlyDBInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReadOnlyDBInstanceResponse(CreateReadOnlyDBInstanceResponse source) {
        if (source.DealNames != null) {
            this.DealNames = new String[source.DealNames.length];
            for (int i = 0; i < source.DealNames.length; i++) {
                this.DealNames[i] = new String(source.DealNames[i]);
            }
        }
        if (source.BillId != null) {
            this.BillId = new String(source.BillId);
        }
        if (source.DBInstanceIdSet != null) {
            this.DBInstanceIdSet = new String[source.DBInstanceIdSet.length];
            for (int i = 0; i < source.DBInstanceIdSet.length; i++) {
                this.DBInstanceIdSet[i] = new String(source.DBInstanceIdSet[i]);
            }
        }
        if (source.BillingParameters != null) {
            this.BillingParameters = new String(source.BillingParameters);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);
        this.setParamSimple(map, prefix + "BillId", this.BillId);
        this.setParamArraySimple(map, prefix + "DBInstanceIdSet.", this.DBInstanceIdSet);
        this.setParamSimple(map, prefix + "BillingParameters", this.BillingParameters);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

