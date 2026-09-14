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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchDescribeTWeSeeOrdersResult extends AbstractModel {

    /**
    * <p>订单 ID</p>
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * <p>订单状态。</p><p>枚举值：</p><ul><li>DELIVERED： 已发货</li><li>DELIVERING： 发货中</li><li>DELIVER_FAILED： 发货失败</li><li>NOT_DELIVERED： 未发货</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>资源 ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>币种</p>
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * <p>订单价格</p>
    */
    @SerializedName("Price")
    @Expose
    private String Price;

    /**
    * <p>自定义订单 ID</p>
    */
    @SerializedName("CustomOrderId")
    @Expose
    private String CustomOrderId;

    /**
    * <p>单个订单的查询错误码，查询成功时为空</p>
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * <p>单个订单的查询错误信息，查询成功时为空</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
     * Get <p>订单 ID</p> 
     * @return OrderId <p>订单 ID</p>
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set <p>订单 ID</p>
     * @param OrderId <p>订单 ID</p>
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get <p>订单状态。</p><p>枚举值：</p><ul><li>DELIVERED： 已发货</li><li>DELIVERING： 发货中</li><li>DELIVER_FAILED： 发货失败</li><li>NOT_DELIVERED： 未发货</li></ul> 
     * @return Status <p>订单状态。</p><p>枚举值：</p><ul><li>DELIVERED： 已发货</li><li>DELIVERING： 发货中</li><li>DELIVER_FAILED： 发货失败</li><li>NOT_DELIVERED： 未发货</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>订单状态。</p><p>枚举值：</p><ul><li>DELIVERED： 已发货</li><li>DELIVERING： 发货中</li><li>DELIVER_FAILED： 发货失败</li><li>NOT_DELIVERED： 未发货</li></ul>
     * @param Status <p>订单状态。</p><p>枚举值：</p><ul><li>DELIVERED： 已发货</li><li>DELIVERING： 发货中</li><li>DELIVER_FAILED： 发货失败</li><li>NOT_DELIVERED： 未发货</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>资源 ID</p> 
     * @return ResourceId <p>资源 ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源 ID</p>
     * @param ResourceId <p>资源 ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>币种</p> 
     * @return Currency <p>币种</p>
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set <p>币种</p>
     * @param Currency <p>币种</p>
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get <p>订单价格</p> 
     * @return Price <p>订单价格</p>
     */
    public String getPrice() {
        return this.Price;
    }

    /**
     * Set <p>订单价格</p>
     * @param Price <p>订单价格</p>
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    /**
     * Get <p>自定义订单 ID</p> 
     * @return CustomOrderId <p>自定义订单 ID</p>
     */
    public String getCustomOrderId() {
        return this.CustomOrderId;
    }

    /**
     * Set <p>自定义订单 ID</p>
     * @param CustomOrderId <p>自定义订单 ID</p>
     */
    public void setCustomOrderId(String CustomOrderId) {
        this.CustomOrderId = CustomOrderId;
    }

    /**
     * Get <p>单个订单的查询错误码，查询成功时为空</p> 
     * @return ErrorCode <p>单个订单的查询错误码，查询成功时为空</p>
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set <p>单个订单的查询错误码，查询成功时为空</p>
     * @param ErrorCode <p>单个订单的查询错误码，查询成功时为空</p>
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get <p>单个订单的查询错误信息，查询成功时为空</p> 
     * @return ErrorMessage <p>单个订单的查询错误信息，查询成功时为空</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>单个订单的查询错误信息，查询成功时为空</p>
     * @param ErrorMessage <p>单个订单的查询错误信息，查询成功时为空</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    public BatchDescribeTWeSeeOrdersResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDescribeTWeSeeOrdersResult(BatchDescribeTWeSeeOrdersResult source) {
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.Price != null) {
            this.Price = new String(source.Price);
        }
        if (source.CustomOrderId != null) {
            this.CustomOrderId = new String(source.CustomOrderId);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "CustomOrderId", this.CustomOrderId);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);

    }
}

