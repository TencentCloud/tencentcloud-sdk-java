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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceDealResponse extends AbstractModel{

    /**
    * 订单状态，1：未支付，2：已支付，3：发货中，4：发货成功，5：发货失败，6：退款，7：订单关闭，8：超时未支付关闭。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 订单原价。
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * 订单折扣价格。
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * 订单行为，purchase：新购，renew：续费，upgrade：升配，downgrade：降配，refund：退货退款。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 订单状态，1：未支付，2：已支付，3：发货中，4：发货成功，5：发货失败，6：退款，7：订单关闭，8：超时未支付关闭。 
     * @return Status 订单状态，1：未支付，2：已支付，3：发货中，4：发货成功，5：发货失败，6：退款，7：订单关闭，8：超时未支付关闭。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 订单状态，1：未支付，2：已支付，3：发货中，4：发货成功，5：发货失败，6：退款，7：订单关闭，8：超时未支付关闭。
     * @param Status 订单状态，1：未支付，2：已支付，3：发货中，4：发货成功，5：发货失败，6：退款，7：订单关闭，8：超时未支付关闭。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 订单原价。 
     * @return OriginalPrice 订单原价。
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set 订单原价。
     * @param OriginalPrice 订单原价。
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get 订单折扣价格。 
     * @return DiscountPrice 订单折扣价格。
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set 订单折扣价格。
     * @param DiscountPrice 订单折扣价格。
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Get 订单行为，purchase：新购，renew：续费，upgrade：升配，downgrade：降配，refund：退货退款。 
     * @return Action 订单行为，purchase：新购，renew：续费，upgrade：升配，downgrade：降配，refund：退货退款。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 订单行为，purchase：新购，renew：续费，upgrade：升配，downgrade：降配，refund：退货退款。
     * @param Action 订单行为，purchase：新购，renew：续费，upgrade：升配，downgrade：降配，refund：退货退款。
     */
    public void setAction(String Action) {
        this.Action = Action;
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

