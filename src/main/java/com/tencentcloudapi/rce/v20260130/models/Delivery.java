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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Delivery extends AbstractModel {

    /**
    * <p>物流方式</p><ul><li>physical：物理投送</li><li>electonic：电子投送</li></ul>
    */
    @SerializedName("DeliveryMethod")
    @Expose
    private String DeliveryMethod;

    /**
    * <p>物流费用</p>
    */
    @SerializedName("DeliveryAmount")
    @Expose
    private Amount DeliveryAmount;

    /**
    * <p>收货地址</p>
    */
    @SerializedName("DeliveryAddress")
    @Expose
    private Address DeliveryAddress;

    /**
    * <p>收货人电话</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
    */
    @SerializedName("ConsigneePhone")
    @Expose
    private String ConsigneePhone;

    /**
    * <p>收货人邮箱</p>
    */
    @SerializedName("ConsigneeEmail")
    @Expose
    private String ConsigneeEmail;

    /**
    * <p>收货人姓名</p>
    */
    @SerializedName("ConsigneeName")
    @Expose
    private String ConsigneeName;

    /**
    * <p>是否加急</p>
    */
    @SerializedName("Expedited")
    @Expose
    private Boolean Expedited;

    /**
    * <p>物流厂商，一般是物流的公司</p>
    */
    @SerializedName("DeliveryCarrier")
    @Expose
    private String DeliveryCarrier;

    /**
    * <p>物流追踪单号</p>
    */
    @SerializedName("DeliveryTracking")
    @Expose
    private String DeliveryTracking;

    /**
     * Get <p>物流方式</p><ul><li>physical：物理投送</li><li>electonic：电子投送</li></ul> 
     * @return DeliveryMethod <p>物流方式</p><ul><li>physical：物理投送</li><li>electonic：电子投送</li></ul>
     */
    public String getDeliveryMethod() {
        return this.DeliveryMethod;
    }

    /**
     * Set <p>物流方式</p><ul><li>physical：物理投送</li><li>electonic：电子投送</li></ul>
     * @param DeliveryMethod <p>物流方式</p><ul><li>physical：物理投送</li><li>electonic：电子投送</li></ul>
     */
    public void setDeliveryMethod(String DeliveryMethod) {
        this.DeliveryMethod = DeliveryMethod;
    }

    /**
     * Get <p>物流费用</p> 
     * @return DeliveryAmount <p>物流费用</p>
     */
    public Amount getDeliveryAmount() {
        return this.DeliveryAmount;
    }

    /**
     * Set <p>物流费用</p>
     * @param DeliveryAmount <p>物流费用</p>
     */
    public void setDeliveryAmount(Amount DeliveryAmount) {
        this.DeliveryAmount = DeliveryAmount;
    }

    /**
     * Get <p>收货地址</p> 
     * @return DeliveryAddress <p>收货地址</p>
     */
    public Address getDeliveryAddress() {
        return this.DeliveryAddress;
    }

    /**
     * Set <p>收货地址</p>
     * @param DeliveryAddress <p>收货地址</p>
     */
    public void setDeliveryAddress(Address DeliveryAddress) {
        this.DeliveryAddress = DeliveryAddress;
    }

    /**
     * Get <p>收货人电话</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p> 
     * @return ConsigneePhone <p>收货人电话</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
     */
    public String getConsigneePhone() {
        return this.ConsigneePhone;
    }

    /**
     * Set <p>收货人电话</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
     * @param ConsigneePhone <p>收货人电话</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
     */
    public void setConsigneePhone(String ConsigneePhone) {
        this.ConsigneePhone = ConsigneePhone;
    }

    /**
     * Get <p>收货人邮箱</p> 
     * @return ConsigneeEmail <p>收货人邮箱</p>
     */
    public String getConsigneeEmail() {
        return this.ConsigneeEmail;
    }

    /**
     * Set <p>收货人邮箱</p>
     * @param ConsigneeEmail <p>收货人邮箱</p>
     */
    public void setConsigneeEmail(String ConsigneeEmail) {
        this.ConsigneeEmail = ConsigneeEmail;
    }

    /**
     * Get <p>收货人姓名</p> 
     * @return ConsigneeName <p>收货人姓名</p>
     */
    public String getConsigneeName() {
        return this.ConsigneeName;
    }

    /**
     * Set <p>收货人姓名</p>
     * @param ConsigneeName <p>收货人姓名</p>
     */
    public void setConsigneeName(String ConsigneeName) {
        this.ConsigneeName = ConsigneeName;
    }

    /**
     * Get <p>是否加急</p> 
     * @return Expedited <p>是否加急</p>
     */
    public Boolean getExpedited() {
        return this.Expedited;
    }

    /**
     * Set <p>是否加急</p>
     * @param Expedited <p>是否加急</p>
     */
    public void setExpedited(Boolean Expedited) {
        this.Expedited = Expedited;
    }

    /**
     * Get <p>物流厂商，一般是物流的公司</p> 
     * @return DeliveryCarrier <p>物流厂商，一般是物流的公司</p>
     */
    public String getDeliveryCarrier() {
        return this.DeliveryCarrier;
    }

    /**
     * Set <p>物流厂商，一般是物流的公司</p>
     * @param DeliveryCarrier <p>物流厂商，一般是物流的公司</p>
     */
    public void setDeliveryCarrier(String DeliveryCarrier) {
        this.DeliveryCarrier = DeliveryCarrier;
    }

    /**
     * Get <p>物流追踪单号</p> 
     * @return DeliveryTracking <p>物流追踪单号</p>
     */
    public String getDeliveryTracking() {
        return this.DeliveryTracking;
    }

    /**
     * Set <p>物流追踪单号</p>
     * @param DeliveryTracking <p>物流追踪单号</p>
     */
    public void setDeliveryTracking(String DeliveryTracking) {
        this.DeliveryTracking = DeliveryTracking;
    }

    public Delivery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Delivery(Delivery source) {
        if (source.DeliveryMethod != null) {
            this.DeliveryMethod = new String(source.DeliveryMethod);
        }
        if (source.DeliveryAmount != null) {
            this.DeliveryAmount = new Amount(source.DeliveryAmount);
        }
        if (source.DeliveryAddress != null) {
            this.DeliveryAddress = new Address(source.DeliveryAddress);
        }
        if (source.ConsigneePhone != null) {
            this.ConsigneePhone = new String(source.ConsigneePhone);
        }
        if (source.ConsigneeEmail != null) {
            this.ConsigneeEmail = new String(source.ConsigneeEmail);
        }
        if (source.ConsigneeName != null) {
            this.ConsigneeName = new String(source.ConsigneeName);
        }
        if (source.Expedited != null) {
            this.Expedited = new Boolean(source.Expedited);
        }
        if (source.DeliveryCarrier != null) {
            this.DeliveryCarrier = new String(source.DeliveryCarrier);
        }
        if (source.DeliveryTracking != null) {
            this.DeliveryTracking = new String(source.DeliveryTracking);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeliveryMethod", this.DeliveryMethod);
        this.setParamObj(map, prefix + "DeliveryAmount.", this.DeliveryAmount);
        this.setParamObj(map, prefix + "DeliveryAddress.", this.DeliveryAddress);
        this.setParamSimple(map, prefix + "ConsigneePhone", this.ConsigneePhone);
        this.setParamSimple(map, prefix + "ConsigneeEmail", this.ConsigneeEmail);
        this.setParamSimple(map, prefix + "ConsigneeName", this.ConsigneeName);
        this.setParamSimple(map, prefix + "Expedited", this.Expedited);
        this.setParamSimple(map, prefix + "DeliveryCarrier", this.DeliveryCarrier);
        this.setParamSimple(map, prefix + "DeliveryTracking", this.DeliveryTracking);

    }
}

