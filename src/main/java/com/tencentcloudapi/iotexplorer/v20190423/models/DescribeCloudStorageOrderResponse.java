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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudStorageOrderResponse extends AbstractModel {

    /**
    * 云存套餐开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 云存套餐过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 套餐id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 套餐状态
0：等待生效
1: 已过期
2:生效
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 通道id
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * 订单金额，单位为分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 支付金额，单位为分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Amount")
    @Expose
    private Long Amount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 云存套餐开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 云存套餐开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 云存套餐开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 云存套餐开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 云存套餐过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 云存套餐过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 云存套餐过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 云存套餐过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 套餐id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageId 套餐id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 套餐id
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageId 套餐id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 套餐状态
0：等待生效
1: 已过期
2:生效 
     * @return Status 套餐状态
0：等待生效
1: 已过期
2:生效
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 套餐状态
0：等待生效
1: 已过期
2:生效
     * @param Status 套餐状态
0：等待生效
1: 已过期
2:生效
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 通道id 
     * @return ChannelId 通道id
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道id
     * @param ChannelId 通道id
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 订单金额，单位为分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Price 订单金额，单位为分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set 订单金额，单位为分
注意：此字段可能返回 null，表示取不到有效值。
     * @param Price 订单金额，单位为分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * Get 支付金额，单位为分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Amount 支付金额，单位为分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAmount() {
        return this.Amount;
    }

    /**
     * Set 支付金额，单位为分
注意：此字段可能返回 null，表示取不到有效值。
     * @param Amount 支付金额，单位为分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAmount(Long Amount) {
        this.Amount = Amount;
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

    public DescribeCloudStorageOrderResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudStorageOrderResponse(DescribeCloudStorageOrderResponse source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.Price != null) {
            this.Price = new Long(source.Price);
        }
        if (source.Amount != null) {
            this.Amount = new Long(source.Amount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

