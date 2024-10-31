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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitTaskEventRequest extends AbstractModel {

    /**
    * 用户唯一标识，最大长度为64
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
    * 用户设备ID，最大长度为64
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 任务的唯一订单号，只能是数字、大小写字母，且在同一个产品ID下唯一，最大长度为64
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 任务事件Code，在腾讯安心用户运营平台下的任务事件列表中设置并获取
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 任务结果是否异步通知。0表示任务结果在返回信息中同步返回；1表示任务结果通过回调结果异步通知。
    */
    @SerializedName("Async")
    @Expose
    private Long Async;

    /**
    * 产品ID，可在腾讯安心用户运营平台的企业管理中获取
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * 异步接收任务结果通知的回调地址。在Async为1的时候，会将任务结果通过该回调地址进行通知。
    */
    @SerializedName("NotifyURL")
    @Expose
    private String NotifyURL;

    /**
     * Get 用户唯一标识，最大长度为64 
     * @return AccountId 用户唯一标识，最大长度为64
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 用户唯一标识，最大长度为64
     * @param AccountId 用户唯一标识，最大长度为64
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get 用户设备ID，最大长度为64 
     * @return DeviceId 用户设备ID，最大长度为64
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 用户设备ID，最大长度为64
     * @param DeviceId 用户设备ID，最大长度为64
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 任务的唯一订单号，只能是数字、大小写字母，且在同一个产品ID下唯一，最大长度为64 
     * @return OrderId 任务的唯一订单号，只能是数字、大小写字母，且在同一个产品ID下唯一，最大长度为64
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 任务的唯一订单号，只能是数字、大小写字母，且在同一个产品ID下唯一，最大长度为64
     * @param OrderId 任务的唯一订单号，只能是数字、大小写字母，且在同一个产品ID下唯一，最大长度为64
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 任务事件Code，在腾讯安心用户运营平台下的任务事件列表中设置并获取 
     * @return Code 任务事件Code，在腾讯安心用户运营平台下的任务事件列表中设置并获取
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 任务事件Code，在腾讯安心用户运营平台下的任务事件列表中设置并获取
     * @param Code 任务事件Code，在腾讯安心用户运营平台下的任务事件列表中设置并获取
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 任务结果是否异步通知。0表示任务结果在返回信息中同步返回；1表示任务结果通过回调结果异步通知。 
     * @return Async 任务结果是否异步通知。0表示任务结果在返回信息中同步返回；1表示任务结果通过回调结果异步通知。
     */
    public Long getAsync() {
        return this.Async;
    }

    /**
     * Set 任务结果是否异步通知。0表示任务结果在返回信息中同步返回；1表示任务结果通过回调结果异步通知。
     * @param Async 任务结果是否异步通知。0表示任务结果在返回信息中同步返回；1表示任务结果通过回调结果异步通知。
     */
    public void setAsync(Long Async) {
        this.Async = Async;
    }

    /**
     * Get 产品ID，可在腾讯安心用户运营平台的企业管理中获取 
     * @return ProductId 产品ID，可在腾讯安心用户运营平台的企业管理中获取
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID，可在腾讯安心用户运营平台的企业管理中获取
     * @param ProductId 产品ID，可在腾讯安心用户运营平台的企业管理中获取
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 异步接收任务结果通知的回调地址。在Async为1的时候，会将任务结果通过该回调地址进行通知。 
     * @return NotifyURL 异步接收任务结果通知的回调地址。在Async为1的时候，会将任务结果通过该回调地址进行通知。
     */
    public String getNotifyURL() {
        return this.NotifyURL;
    }

    /**
     * Set 异步接收任务结果通知的回调地址。在Async为1的时候，会将任务结果通过该回调地址进行通知。
     * @param NotifyURL 异步接收任务结果通知的回调地址。在Async为1的时候，会将任务结果通过该回调地址进行通知。
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

