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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfirmOrderResponse extends AbstractModel {

    /**
    * 分配给商户的AppId
    */
    @SerializedName("MerchantAppId")
    @Expose
    private String MerchantAppId;

    /**
    * 平台流水号。消费订单发起成功后，返回的平台唯一订单号。
    */
    @SerializedName("OrderNo")
    @Expose
    private String OrderNo;

    /**
    * 订单确认状态。0-确认失败
1-确认成功 
2-可疑状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 订单确认状态描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 分配给商户的AppId 
     * @return MerchantAppId 分配给商户的AppId
     */
    public String getMerchantAppId() {
        return this.MerchantAppId;
    }

    /**
     * Set 分配给商户的AppId
     * @param MerchantAppId 分配给商户的AppId
     */
    public void setMerchantAppId(String MerchantAppId) {
        this.MerchantAppId = MerchantAppId;
    }

    /**
     * Get 平台流水号。消费订单发起成功后，返回的平台唯一订单号。 
     * @return OrderNo 平台流水号。消费订单发起成功后，返回的平台唯一订单号。
     */
    public String getOrderNo() {
        return this.OrderNo;
    }

    /**
     * Set 平台流水号。消费订单发起成功后，返回的平台唯一订单号。
     * @param OrderNo 平台流水号。消费订单发起成功后，返回的平台唯一订单号。
     */
    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    /**
     * Get 订单确认状态。0-确认失败
1-确认成功 
2-可疑状态 
     * @return Status 订单确认状态。0-确认失败
1-确认成功 
2-可疑状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 订单确认状态。0-确认失败
1-确认成功 
2-可疑状态
     * @param Status 订单确认状态。0-确认失败
1-确认成功 
2-可疑状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 订单确认状态描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 订单确认状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 订单确认状态描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 订单确认状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
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

    public ConfirmOrderResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfirmOrderResponse(ConfirmOrderResponse source) {
        if (source.MerchantAppId != null) {
            this.MerchantAppId = new String(source.MerchantAppId);
        }
        if (source.OrderNo != null) {
            this.OrderNo = new String(source.OrderNo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantAppId", this.MerchantAppId);
        this.setParamSimple(map, prefix + "OrderNo", this.OrderNo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

