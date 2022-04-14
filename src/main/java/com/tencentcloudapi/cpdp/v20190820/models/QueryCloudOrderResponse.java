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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCloudOrderResponse extends AbstractModel{

    /**
    * 订单数量
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 订单列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderList")
    @Expose
    private CloudOrderReturn [] OrderList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 订单数量 
     * @return TotalNum 订单数量
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 订单数量
     * @param TotalNum 订单数量
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 订单列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderList 订单列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudOrderReturn [] getOrderList() {
        return this.OrderList;
    }

    /**
     * Set 订单列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderList 订单列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderList(CloudOrderReturn [] OrderList) {
        this.OrderList = OrderList;
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

    public QueryCloudOrderResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCloudOrderResponse(QueryCloudOrderResponse source) {
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.OrderList != null) {
            this.OrderList = new CloudOrderReturn[source.OrderList.length];
            for (int i = 0; i < source.OrderList.length; i++) {
                this.OrderList[i] = new CloudOrderReturn(source.OrderList[i]);
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
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamArrayObj(map, prefix + "OrderList.", this.OrderList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

