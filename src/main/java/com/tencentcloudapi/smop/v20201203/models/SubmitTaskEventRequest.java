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
package com.tencentcloudapi.smop.v20201203.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitTaskEventRequest extends AbstractModel{

    /**
    * 用户ID
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
    * 设备ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 订单ID
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 任务事件Code
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 同步异步方式：0为同步、1位异步
    */
    @SerializedName("Async")
    @Expose
    private Long Async;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * 回调地址
    */
    @SerializedName("NotifyURL")
    @Expose
    private String NotifyURL;

    /**
     * Get 用户ID 
     * @return AccountId 用户ID
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 用户ID
     * @param AccountId 用户ID
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get 设备ID 
     * @return DeviceId 设备ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID
     * @param DeviceId 设备ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 订单ID 
     * @return OrderId 订单ID
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单ID
     * @param OrderId 订单ID
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 任务事件Code 
     * @return Code 任务事件Code
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 任务事件Code
     * @param Code 任务事件Code
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 同步异步方式：0为同步、1位异步 
     * @return Async 同步异步方式：0为同步、1位异步
     */
    public Long getAsync() {
        return this.Async;
    }

    /**
     * Set 同步异步方式：0为同步、1位异步
     * @param Async 同步异步方式：0为同步、1位异步
     */
    public void setAsync(Long Async) {
        this.Async = Async;
    }

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 回调地址 
     * @return NotifyURL 回调地址
     */
    public String getNotifyURL() {
        return this.NotifyURL;
    }

    /**
     * Set 回调地址
     * @param NotifyURL 回调地址
     */
    public void setNotifyURL(String NotifyURL) {
        this.NotifyURL = NotifyURL;
    }

    public SubmitTaskEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitTaskEventRequest(SubmitTaskEventRequest source) {
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Async != null) {
            this.Async = new Long(source.Async);
        }
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.NotifyURL != null) {
            this.NotifyURL = new String(source.NotifyURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Async", this.Async);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "NotifyURL", this.NotifyURL);

    }
}

