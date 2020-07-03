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

public class CreateDBInstancesResponse extends AbstractModel{

    /**
    * 订单号列表。每个实例对应一个订单号。
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
    * 冻结流水号
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

    /**
    * 创建成功的实例ID集合，只在后付费情景下有返回值
    */
    @SerializedName("DBInstanceIdSet")
    @Expose
    private String [] DBInstanceIdSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 订单号列表。每个实例对应一个订单号。 
     * @return DealNames 订单号列表。每个实例对应一个订单号。
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set 订单号列表。每个实例对应一个订单号。
     * @param DealNames 订单号列表。每个实例对应一个订单号。
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
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
     * Get 创建成功的实例ID集合，只在后付费情景下有返回值 
     * @return DBInstanceIdSet 创建成功的实例ID集合，只在后付费情景下有返回值
     */
    public String [] getDBInstanceIdSet() {
        return this.DBInstanceIdSet;
    }

    /**
     * Set 创建成功的实例ID集合，只在后付费情景下有返回值
     * @param DBInstanceIdSet 创建成功的实例ID集合，只在后付费情景下有返回值
     */
    public void setDBInstanceIdSet(String [] DBInstanceIdSet) {
        this.DBInstanceIdSet = DBInstanceIdSet;
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
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);
        this.setParamSimple(map, prefix + "BillId", this.BillId);
        this.setParamArraySimple(map, prefix + "DBInstanceIdSet.", this.DBInstanceIdSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

