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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogisticsReceipt extends AbstractModel {

    /**
    * 物流预计上门时间
    */
    @SerializedName("LogisticsArrivalTime")
    @Expose
    private String LogisticsArrivalTime;

    /**
    * 物流公司名称
    */
    @SerializedName("LogisticsCompany")
    @Expose
    private String LogisticsCompany;

    /**
    * 物流联系人
    */
    @SerializedName("LogisticsStuff")
    @Expose
    private String LogisticsStuff;

    /**
    * 物流电话
    */
    @SerializedName("LogisticsStuffContact")
    @Expose
    private String LogisticsStuffContact;

    /**
    * 收货人电话
    */
    @SerializedName("ReceiverContact")
    @Expose
    private String ReceiverContact;

    /**
    * 收货人姓名
    */
    @SerializedName("ReceiverName")
    @Expose
    private String ReceiverName;

    /**
    * 收货地址
    */
    @SerializedName("ShippingAddress")
    @Expose
    private String ShippingAddress;

    /**
     * Get 物流预计上门时间 
     * @return LogisticsArrivalTime 物流预计上门时间
     */
    public String getLogisticsArrivalTime() {
        return this.LogisticsArrivalTime;
    }

    /**
     * Set 物流预计上门时间
     * @param LogisticsArrivalTime 物流预计上门时间
     */
    public void setLogisticsArrivalTime(String LogisticsArrivalTime) {
        this.LogisticsArrivalTime = LogisticsArrivalTime;
    }

    /**
     * Get 物流公司名称 
     * @return LogisticsCompany 物流公司名称
     */
    public String getLogisticsCompany() {
        return this.LogisticsCompany;
    }

    /**
     * Set 物流公司名称
     * @param LogisticsCompany 物流公司名称
     */
    public void setLogisticsCompany(String LogisticsCompany) {
        this.LogisticsCompany = LogisticsCompany;
    }

    /**
     * Get 物流联系人 
     * @return LogisticsStuff 物流联系人
     */
    public String getLogisticsStuff() {
        return this.LogisticsStuff;
    }

    /**
     * Set 物流联系人
     * @param LogisticsStuff 物流联系人
     */
    public void setLogisticsStuff(String LogisticsStuff) {
        this.LogisticsStuff = LogisticsStuff;
    }

    /**
     * Get 物流电话 
     * @return LogisticsStuffContact 物流电话
     */
    public String getLogisticsStuffContact() {
        return this.LogisticsStuffContact;
    }

    /**
     * Set 物流电话
     * @param LogisticsStuffContact 物流电话
     */
    public void setLogisticsStuffContact(String LogisticsStuffContact) {
        this.LogisticsStuffContact = LogisticsStuffContact;
    }

    /**
     * Get 收货人电话 
     * @return ReceiverContact 收货人电话
     */
    public String getReceiverContact() {
        return this.ReceiverContact;
    }

    /**
     * Set 收货人电话
     * @param ReceiverContact 收货人电话
     */
    public void setReceiverContact(String ReceiverContact) {
        this.ReceiverContact = ReceiverContact;
    }

    /**
     * Get 收货人姓名 
     * @return ReceiverName 收货人姓名
     */
    public String getReceiverName() {
        return this.ReceiverName;
    }

    /**
     * Set 收货人姓名
     * @param ReceiverName 收货人姓名
     */
    public void setReceiverName(String ReceiverName) {
        this.ReceiverName = ReceiverName;
    }

    /**
     * Get 收货地址 
     * @return ShippingAddress 收货地址
     */
    public String getShippingAddress() {
        return this.ShippingAddress;
    }

    /**
     * Set 收货地址
     * @param ShippingAddress 收货地址
     */
    public void setShippingAddress(String ShippingAddress) {
        this.ShippingAddress = ShippingAddress;
    }

    public LogisticsReceipt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogisticsReceipt(LogisticsReceipt source) {
        if (source.LogisticsArrivalTime != null) {
            this.LogisticsArrivalTime = new String(source.LogisticsArrivalTime);
        }
        if (source.LogisticsCompany != null) {
            this.LogisticsCompany = new String(source.LogisticsCompany);
        }
        if (source.LogisticsStuff != null) {
            this.LogisticsStuff = new String(source.LogisticsStuff);
        }
        if (source.LogisticsStuffContact != null) {
            this.LogisticsStuffContact = new String(source.LogisticsStuffContact);
        }
        if (source.ReceiverContact != null) {
            this.ReceiverContact = new String(source.ReceiverContact);
        }
        if (source.ReceiverName != null) {
            this.ReceiverName = new String(source.ReceiverName);
        }
        if (source.ShippingAddress != null) {
            this.ShippingAddress = new String(source.ShippingAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogisticsArrivalTime", this.LogisticsArrivalTime);
        this.setParamSimple(map, prefix + "LogisticsCompany", this.LogisticsCompany);
        this.setParamSimple(map, prefix + "LogisticsStuff", this.LogisticsStuff);
        this.setParamSimple(map, prefix + "LogisticsStuffContact", this.LogisticsStuffContact);
        this.setParamSimple(map, prefix + "ReceiverContact", this.ReceiverContact);
        this.setParamSimple(map, prefix + "ReceiverName", this.ReceiverName);
        this.setParamSimple(map, prefix + "ShippingAddress", this.ShippingAddress);

    }
}

