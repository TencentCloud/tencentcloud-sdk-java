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

public class DeviceOrderBaseInfo extends AbstractModel {

    /**
    * 机房id
    */
    @SerializedName("IdcId")
    @Expose
    private Long IdcId;

    /**
    * 机房名称
    */
    @SerializedName("IdcName")
    @Expose
    private String IdcName;

    /**
    * 设备类型
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 1.收货-仅核对外包装完整和数量，不开箱 2.验收-开箱核对型号SN一致
    */
    @SerializedName("ReceivingOperation")
    @Expose
    private String ReceivingOperation;

    /**
    * 设备收货-进入时间
    */
    @SerializedName("EntryTime")
    @Expose
    private String EntryTime;

    /**
    * 设备收货-是否快递寄件
    */
    @SerializedName("IsExpressDelivery")
    @Expose
    private Boolean IsExpressDelivery;

    /**
    * 设备收货-快递寄件信息
    */
    @SerializedName("ExpressInfo")
    @Expose
    private ExpressDelivery ExpressInfo;

    /**
    * 上/下架人员 1.自行解决 2.由腾讯IDC负责
    */
    @SerializedName("StuffOption")
    @Expose
    private String StuffOption;

    /**
    * 上/下架自行解决信息
    */
    @SerializedName("SelfOperationInfo")
    @Expose
    private SelfOperation SelfOperationInfo;

    /**
    * 上架后开电
    */
    @SerializedName("WithPowerOn")
    @Expose
    private Boolean WithPowerOn;

    /**
    * 关电确认 1.授权时关电 2.关电前需要确认
    */
    @SerializedName("IsPowerOffConfirm")
    @Expose
    private String IsPowerOffConfirm;

    /**
    * 关电前需要确认信息
    */
    @SerializedName("PowerOffConfirmInfo")
    @Expose
    private PowerOffConfirm PowerOffConfirmInfo;

    /**
    * 退出交接方式 1.物流上门收货 2.客户上门自提
    */
    @SerializedName("HandoverMethod")
    @Expose
    private String HandoverMethod;

    /**
    * 客户上门自提信息
    */
    @SerializedName("CustomerReceipt")
    @Expose
    private CustomerReceipt CustomerReceipt;

    /**
    * 物流上门收货信息
    */
    @SerializedName("LogisticsReceipt")
    @Expose
    private LogisticsReceipt LogisticsReceipt;

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
     * Get 机房名称 
     * @return IdcName 机房名称
     */
    public String getIdcName() {
        return this.IdcName;
    }

    /**
     * Set 机房名称
     * @param IdcName 机房名称
     */
    public void setIdcName(String IdcName) {
        this.IdcName = IdcName;
    }

    /**
     * Get 设备类型 
     * @return DeviceType 设备类型
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型
     * @param DeviceType 设备类型
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 1.收货-仅核对外包装完整和数量，不开箱 2.验收-开箱核对型号SN一致 
     * @return ReceivingOperation 1.收货-仅核对外包装完整和数量，不开箱 2.验收-开箱核对型号SN一致
     */
    public String getReceivingOperation() {
        return this.ReceivingOperation;
    }

    /**
     * Set 1.收货-仅核对外包装完整和数量，不开箱 2.验收-开箱核对型号SN一致
     * @param ReceivingOperation 1.收货-仅核对外包装完整和数量，不开箱 2.验收-开箱核对型号SN一致
     */
    public void setReceivingOperation(String ReceivingOperation) {
        this.ReceivingOperation = ReceivingOperation;
    }

    /**
     * Get 设备收货-进入时间 
     * @return EntryTime 设备收货-进入时间
     */
    public String getEntryTime() {
        return this.EntryTime;
    }

    /**
     * Set 设备收货-进入时间
     * @param EntryTime 设备收货-进入时间
     */
    public void setEntryTime(String EntryTime) {
        this.EntryTime = EntryTime;
    }

    /**
     * Get 设备收货-是否快递寄件 
     * @return IsExpressDelivery 设备收货-是否快递寄件
     */
    public Boolean getIsExpressDelivery() {
        return this.IsExpressDelivery;
    }

    /**
     * Set 设备收货-是否快递寄件
     * @param IsExpressDelivery 设备收货-是否快递寄件
     */
    public void setIsExpressDelivery(Boolean IsExpressDelivery) {
        this.IsExpressDelivery = IsExpressDelivery;
    }

    /**
     * Get 设备收货-快递寄件信息 
     * @return ExpressInfo 设备收货-快递寄件信息
     */
    public ExpressDelivery getExpressInfo() {
        return this.ExpressInfo;
    }

    /**
     * Set 设备收货-快递寄件信息
     * @param ExpressInfo 设备收货-快递寄件信息
     */
    public void setExpressInfo(ExpressDelivery ExpressInfo) {
        this.ExpressInfo = ExpressInfo;
    }

    /**
     * Get 上/下架人员 1.自行解决 2.由腾讯IDC负责 
     * @return StuffOption 上/下架人员 1.自行解决 2.由腾讯IDC负责
     */
    public String getStuffOption() {
        return this.StuffOption;
    }

    /**
     * Set 上/下架人员 1.自行解决 2.由腾讯IDC负责
     * @param StuffOption 上/下架人员 1.自行解决 2.由腾讯IDC负责
     */
    public void setStuffOption(String StuffOption) {
        this.StuffOption = StuffOption;
    }

    /**
     * Get 上/下架自行解决信息 
     * @return SelfOperationInfo 上/下架自行解决信息
     */
    public SelfOperation getSelfOperationInfo() {
        return this.SelfOperationInfo;
    }

    /**
     * Set 上/下架自行解决信息
     * @param SelfOperationInfo 上/下架自行解决信息
     */
    public void setSelfOperationInfo(SelfOperation SelfOperationInfo) {
        this.SelfOperationInfo = SelfOperationInfo;
    }

    /**
     * Get 上架后开电 
     * @return WithPowerOn 上架后开电
     */
    public Boolean getWithPowerOn() {
        return this.WithPowerOn;
    }

    /**
     * Set 上架后开电
     * @param WithPowerOn 上架后开电
     */
    public void setWithPowerOn(Boolean WithPowerOn) {
        this.WithPowerOn = WithPowerOn;
    }

    /**
     * Get 关电确认 1.授权时关电 2.关电前需要确认 
     * @return IsPowerOffConfirm 关电确认 1.授权时关电 2.关电前需要确认
     */
    public String getIsPowerOffConfirm() {
        return this.IsPowerOffConfirm;
    }

    /**
     * Set 关电确认 1.授权时关电 2.关电前需要确认
     * @param IsPowerOffConfirm 关电确认 1.授权时关电 2.关电前需要确认
     */
    public void setIsPowerOffConfirm(String IsPowerOffConfirm) {
        this.IsPowerOffConfirm = IsPowerOffConfirm;
    }

    /**
     * Get 关电前需要确认信息 
     * @return PowerOffConfirmInfo 关电前需要确认信息
     */
    public PowerOffConfirm getPowerOffConfirmInfo() {
        return this.PowerOffConfirmInfo;
    }

    /**
     * Set 关电前需要确认信息
     * @param PowerOffConfirmInfo 关电前需要确认信息
     */
    public void setPowerOffConfirmInfo(PowerOffConfirm PowerOffConfirmInfo) {
        this.PowerOffConfirmInfo = PowerOffConfirmInfo;
    }

    /**
     * Get 退出交接方式 1.物流上门收货 2.客户上门自提 
     * @return HandoverMethod 退出交接方式 1.物流上门收货 2.客户上门自提
     */
    public String getHandoverMethod() {
        return this.HandoverMethod;
    }

    /**
     * Set 退出交接方式 1.物流上门收货 2.客户上门自提
     * @param HandoverMethod 退出交接方式 1.物流上门收货 2.客户上门自提
     */
    public void setHandoverMethod(String HandoverMethod) {
        this.HandoverMethod = HandoverMethod;
    }

    /**
     * Get 客户上门自提信息 
     * @return CustomerReceipt 客户上门自提信息
     */
    public CustomerReceipt getCustomerReceipt() {
        return this.CustomerReceipt;
    }

    /**
     * Set 客户上门自提信息
     * @param CustomerReceipt 客户上门自提信息
     */
    public void setCustomerReceipt(CustomerReceipt CustomerReceipt) {
        this.CustomerReceipt = CustomerReceipt;
    }

    /**
     * Get 物流上门收货信息 
     * @return LogisticsReceipt 物流上门收货信息
     */
    public LogisticsReceipt getLogisticsReceipt() {
        return this.LogisticsReceipt;
    }

    /**
     * Set 物流上门收货信息
     * @param LogisticsReceipt 物流上门收货信息
     */
    public void setLogisticsReceipt(LogisticsReceipt LogisticsReceipt) {
        this.LogisticsReceipt = LogisticsReceipt;
    }

    public DeviceOrderBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceOrderBaseInfo(DeviceOrderBaseInfo source) {
        if (source.IdcId != null) {
            this.IdcId = new Long(source.IdcId);
        }
        if (source.IdcName != null) {
            this.IdcName = new String(source.IdcName);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ReceivingOperation != null) {
            this.ReceivingOperation = new String(source.ReceivingOperation);
        }
        if (source.EntryTime != null) {
            this.EntryTime = new String(source.EntryTime);
        }
        if (source.IsExpressDelivery != null) {
            this.IsExpressDelivery = new Boolean(source.IsExpressDelivery);
        }
        if (source.ExpressInfo != null) {
            this.ExpressInfo = new ExpressDelivery(source.ExpressInfo);
        }
        if (source.StuffOption != null) {
            this.StuffOption = new String(source.StuffOption);
        }
        if (source.SelfOperationInfo != null) {
            this.SelfOperationInfo = new SelfOperation(source.SelfOperationInfo);
        }
        if (source.WithPowerOn != null) {
            this.WithPowerOn = new Boolean(source.WithPowerOn);
        }
        if (source.IsPowerOffConfirm != null) {
            this.IsPowerOffConfirm = new String(source.IsPowerOffConfirm);
        }
        if (source.PowerOffConfirmInfo != null) {
            this.PowerOffConfirmInfo = new PowerOffConfirm(source.PowerOffConfirmInfo);
        }
        if (source.HandoverMethod != null) {
            this.HandoverMethod = new String(source.HandoverMethod);
        }
        if (source.CustomerReceipt != null) {
            this.CustomerReceipt = new CustomerReceipt(source.CustomerReceipt);
        }
        if (source.LogisticsReceipt != null) {
            this.LogisticsReceipt = new LogisticsReceipt(source.LogisticsReceipt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdcId", this.IdcId);
        this.setParamSimple(map, prefix + "IdcName", this.IdcName);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ReceivingOperation", this.ReceivingOperation);
        this.setParamSimple(map, prefix + "EntryTime", this.EntryTime);
        this.setParamSimple(map, prefix + "IsExpressDelivery", this.IsExpressDelivery);
        this.setParamObj(map, prefix + "ExpressInfo.", this.ExpressInfo);
        this.setParamSimple(map, prefix + "StuffOption", this.StuffOption);
        this.setParamObj(map, prefix + "SelfOperationInfo.", this.SelfOperationInfo);
        this.setParamSimple(map, prefix + "WithPowerOn", this.WithPowerOn);
        this.setParamSimple(map, prefix + "IsPowerOffConfirm", this.IsPowerOffConfirm);
        this.setParamObj(map, prefix + "PowerOffConfirmInfo.", this.PowerOffConfirmInfo);
        this.setParamSimple(map, prefix + "HandoverMethod", this.HandoverMethod);
        this.setParamObj(map, prefix + "CustomerReceipt.", this.CustomerReceipt);
        this.setParamObj(map, prefix + "LogisticsReceipt.", this.LogisticsReceipt);

    }
}

