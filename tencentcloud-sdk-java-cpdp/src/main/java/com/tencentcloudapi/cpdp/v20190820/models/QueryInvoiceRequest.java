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

public class QueryInvoiceRequest extends AbstractModel{

    /**
    * 开票平台ID
    */
    @SerializedName("InvoicePlatformId")
    @Expose
    private Long InvoicePlatformId;

    /**
    * 订单号
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 业务开票号
    */
    @SerializedName("OrderSn")
    @Expose
    private String OrderSn;

    /**
    * 发票种类：
0：蓝票
1：红票【该字段默认为0， 如果需要查询红票信息，本字段必须传1，否则可能查询不到需要的发票信息】。
    */
    @SerializedName("IsRed")
    @Expose
    private Long IsRed;

    /**
    * 接入环境。沙箱环境填sandbox。
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 开票平台ID 
     * @return InvoicePlatformId 开票平台ID
     */
    public Long getInvoicePlatformId() {
        return this.InvoicePlatformId;
    }

    /**
     * Set 开票平台ID
     * @param InvoicePlatformId 开票平台ID
     */
    public void setInvoicePlatformId(Long InvoicePlatformId) {
        this.InvoicePlatformId = InvoicePlatformId;
    }

    /**
     * Get 订单号 
     * @return OrderId 订单号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单号
     * @param OrderId 订单号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 业务开票号 
     * @return OrderSn 业务开票号
     */
    public String getOrderSn() {
        return this.OrderSn;
    }

    /**
     * Set 业务开票号
     * @param OrderSn 业务开票号
     */
    public void setOrderSn(String OrderSn) {
        this.OrderSn = OrderSn;
    }

    /**
     * Get 发票种类：
0：蓝票
1：红票【该字段默认为0， 如果需要查询红票信息，本字段必须传1，否则可能查询不到需要的发票信息】。 
     * @return IsRed 发票种类：
0：蓝票
1：红票【该字段默认为0， 如果需要查询红票信息，本字段必须传1，否则可能查询不到需要的发票信息】。
     */
    public Long getIsRed() {
        return this.IsRed;
    }

    /**
     * Set 发票种类：
0：蓝票
1：红票【该字段默认为0， 如果需要查询红票信息，本字段必须传1，否则可能查询不到需要的发票信息】。
     * @param IsRed 发票种类：
0：蓝票
1：红票【该字段默认为0， 如果需要查询红票信息，本字段必须传1，否则可能查询不到需要的发票信息】。
     */
    public void setIsRed(Long IsRed) {
        this.IsRed = IsRed;
    }

    /**
     * Get 接入环境。沙箱环境填sandbox。 
     * @return Profile 接入环境。沙箱环境填sandbox。
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 接入环境。沙箱环境填sandbox。
     * @param Profile 接入环境。沙箱环境填sandbox。
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvoicePlatformId", this.InvoicePlatformId);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "OrderSn", this.OrderSn);
        this.setParamSimple(map, prefix + "IsRed", this.IsRed);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

