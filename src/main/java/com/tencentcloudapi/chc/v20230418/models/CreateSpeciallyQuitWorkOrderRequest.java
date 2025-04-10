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

public class CreateSpeciallyQuitWorkOrderRequest extends AbstractModel {

    /**
    * 机房id
    */
    @SerializedName("IdcId")
    @Expose
    private Long IdcId;

    /**
    * 设备类型：otherDevice。此接口只支持其他设备
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 交接方式 1.物流上门收货 2.客户上门自提
    */
    @SerializedName("HandoverMethod")
    @Expose
    private String HandoverMethod;

    /**
    * 物流上门收货必传
    */
    @SerializedName("LogisticsReceipt")
    @Expose
    private LogisticsReceipt LogisticsReceipt;

    /**
    * 客户上门自提必传
    */
    @SerializedName("CustomerReceipt")
    @Expose
    private CustomerReceipt CustomerReceipt;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 当设备类型为otherDevice，此参数必传
    */
    @SerializedName("OtherDeviceList")
    @Expose
    private OtherDevReceivingInfo [] OtherDeviceList;

    /**
     * Get 机房id 
     * @return IdcId 机房id
     */
    public Long getIdcId() {
        return this.IdcId;
    }

    /**
     * Set 机房id
     * @param IdcId 机房id
     */
    public void setIdcId(Long IdcId) {
        this.IdcId = IdcId;
    }

    /**
     * Get 设备类型：otherDevice。此接口只支持其他设备 
     * @return DeviceType 设备类型：otherDevice。此接口只支持其他设备
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型：otherDevice。此接口只支持其他设备
     * @param DeviceType 设备类型：otherDevice。此接口只支持其他设备
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 交接方式 1.物流上门收货 2.客户上门自提 
     * @return HandoverMethod 交接方式 1.物流上门收货 2.客户上门自提
     */
    public String getHandoverMethod() {
        return this.HandoverMethod;
    }

    /**
     * Set 交接方式 1.物流上门收货 2.客户上门自提
     * @param HandoverMethod 交接方式 1.物流上门收货 2.客户上门自提
     */
    public void setHandoverMethod(String HandoverMethod) {
        this.HandoverMethod = HandoverMethod;
    }

    /**
     * Get 物流上门收货必传 
     * @return LogisticsReceipt 物流上门收货必传
     */
    public LogisticsReceipt getLogisticsReceipt() {
        return this.LogisticsReceipt;
    }

    /**
     * Set 物流上门收货必传
     * @param LogisticsReceipt 物流上门收货必传
     */
    public void setLogisticsReceipt(LogisticsReceipt LogisticsReceipt) {
        this.LogisticsReceipt = LogisticsReceipt;
    }

    /**
     * Get 客户上门自提必传 
     * @return CustomerReceipt 客户上门自提必传
     */
    public CustomerReceipt getCustomerReceipt() {
        return this.CustomerReceipt;
    }

    /**
     * Set 客户上门自提必传
     * @param CustomerReceipt 客户上门自提必传
     */
    public void setCustomerReceipt(CustomerReceipt CustomerReceipt) {
        this.CustomerReceipt = CustomerReceipt;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 当设备类型为otherDevice，此参数必传 
     * @return OtherDeviceList 当设备类型为otherDevice，此参数必传
     */
    public OtherDevReceivingInfo [] getOtherDeviceList() {
        return this.OtherDeviceList;
    }

    /**
     * Set 当设备类型为otherDevice，此参数必传
     * @param OtherDeviceList 当设备类型为otherDevice，此参数必传
     */
    public void setOtherDeviceList(OtherDevReceivingInfo [] OtherDeviceList) {
        this.OtherDeviceList = OtherDeviceList;
    }

    public CreateSpeciallyQuitWorkOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSpeciallyQuitWorkOrderRequest(CreateSpeciallyQuitWorkOrderRequest source) {
        if (source.IdcId != null) {
            this.IdcId = new Long(source.IdcId);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.HandoverMethod != null) {
            this.HandoverMethod = new String(source.HandoverMethod);
        }
        if (source.LogisticsReceipt != null) {
            this.LogisticsReceipt = new LogisticsReceipt(source.LogisticsReceipt);
        }
        if (source.CustomerReceipt != null) {
            this.CustomerReceipt = new CustomerReceipt(source.CustomerReceipt);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.OtherDeviceList != null) {
            this.OtherDeviceList = new OtherDevReceivingInfo[source.OtherDeviceList.length];
            for (int i = 0; i < source.OtherDeviceList.length; i++) {
                this.OtherDeviceList[i] = new OtherDevReceivingInfo(source.OtherDeviceList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdcId", this.IdcId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "HandoverMethod", this.HandoverMethod);
        this.setParamObj(map, prefix + "LogisticsReceipt.", this.LogisticsReceipt);
        this.setParamObj(map, prefix + "CustomerReceipt.", this.CustomerReceipt);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "OtherDeviceList.", this.OtherDeviceList);

    }
}

