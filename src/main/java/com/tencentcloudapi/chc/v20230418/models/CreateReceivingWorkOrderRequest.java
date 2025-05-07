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

public class CreateReceivingWorkOrderRequest extends AbstractModel {

    /**
    * 机房id
    */
    @SerializedName("IdcId")
    @Expose
    private Long IdcId;

    /**
    * 设备类型，server, netDevice, wire, otherDevice
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 进入时间
    */
    @SerializedName("EntryTime")
    @Expose
    private String EntryTime;

    /**
    * 1.收货-仅核对外包装完整和数量，不开箱 2.验收-开箱核对型号SN一致
    */
    @SerializedName("ReceivingOperation")
    @Expose
    private String ReceivingOperation;

    /**
    * 是否快递寄件
    */
    @SerializedName("IsExpressDelivery")
    @Expose
    private Boolean IsExpressDelivery;

    /**
    * 快递寄件信息,快递寄件必填
    */
    @SerializedName("ExpressInfo")
    @Expose
    private ExpressDelivery ExpressInfo;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 服务器收货列表。最大值：200
    */
    @SerializedName("ServerDeviceList")
    @Expose
    private ServerReceivingInfo [] ServerDeviceList;

    /**
    * 网络设备收货列表
    */
    @SerializedName("NetDeviceList")
    @Expose
    private NetReceivingInfo [] NetDeviceList;

    /**
    * 线材收货列表
    */
    @SerializedName("WireDeviceList")
    @Expose
    private WireReceivingInfo [] WireDeviceList;

    /**
    * 其他设备收货列表
    */
    @SerializedName("OtherDeviceList")
    @Expose
    private OtherDevReceivingInfo [] OtherDeviceList;

    /**
    * 收货后自动上架。此参数为true时，后台会自动提设备上架单
    */
    @SerializedName("WithRackOn")
    @Expose
    private Boolean WithRackOn;

    /**
    * 设备上架信息。当WithRackOn为true此参数必传，且sn需要和收货的列表一致
    */
    @SerializedName("DeviceRackOnList")
    @Expose
    private DeviceRackOn [] DeviceRackOnList;

    /**
    * 上架人员 1.自行解决 2.由腾讯IDC负责
    */
    @SerializedName("StuffOption")
    @Expose
    private String StuffOption;

    /**
    * 自行解决信息。当StuffOption为1时，此参数必填
    */
    @SerializedName("SelfOperationInfo")
    @Expose
    private SelfOperation SelfOperationInfo;

    /**
    * 上架后自动开电。此参数为true时，后台会自动提设备开电单
    */
    @SerializedName("WithPowerOn")
    @Expose
    private Boolean WithPowerOn;

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
     * Get 设备类型，server, netDevice, wire, otherDevice 
     * @return DeviceType 设备类型，server, netDevice, wire, otherDevice
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型，server, netDevice, wire, otherDevice
     * @param DeviceType 设备类型，server, netDevice, wire, otherDevice
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 进入时间 
     * @return EntryTime 进入时间
     */
    public String getEntryTime() {
        return this.EntryTime;
    }

    /**
     * Set 进入时间
     * @param EntryTime 进入时间
     */
    public void setEntryTime(String EntryTime) {
        this.EntryTime = EntryTime;
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
     * Get 是否快递寄件 
     * @return IsExpressDelivery 是否快递寄件
     */
    public Boolean getIsExpressDelivery() {
        return this.IsExpressDelivery;
    }

    /**
     * Set 是否快递寄件
     * @param IsExpressDelivery 是否快递寄件
     */
    public void setIsExpressDelivery(Boolean IsExpressDelivery) {
        this.IsExpressDelivery = IsExpressDelivery;
    }

    /**
     * Get 快递寄件信息,快递寄件必填 
     * @return ExpressInfo 快递寄件信息,快递寄件必填
     */
    public ExpressDelivery getExpressInfo() {
        return this.ExpressInfo;
    }

    /**
     * Set 快递寄件信息,快递寄件必填
     * @param ExpressInfo 快递寄件信息,快递寄件必填
     */
    public void setExpressInfo(ExpressDelivery ExpressInfo) {
        this.ExpressInfo = ExpressInfo;
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
     * Get 服务器收货列表。最大值：200 
     * @return ServerDeviceList 服务器收货列表。最大值：200
     */
    public ServerReceivingInfo [] getServerDeviceList() {
        return this.ServerDeviceList;
    }

    /**
     * Set 服务器收货列表。最大值：200
     * @param ServerDeviceList 服务器收货列表。最大值：200
     */
    public void setServerDeviceList(ServerReceivingInfo [] ServerDeviceList) {
        this.ServerDeviceList = ServerDeviceList;
    }

    /**
     * Get 网络设备收货列表 
     * @return NetDeviceList 网络设备收货列表
     */
    public NetReceivingInfo [] getNetDeviceList() {
        return this.NetDeviceList;
    }

    /**
     * Set 网络设备收货列表
     * @param NetDeviceList 网络设备收货列表
     */
    public void setNetDeviceList(NetReceivingInfo [] NetDeviceList) {
        this.NetDeviceList = NetDeviceList;
    }

    /**
     * Get 线材收货列表 
     * @return WireDeviceList 线材收货列表
     */
    public WireReceivingInfo [] getWireDeviceList() {
        return this.WireDeviceList;
    }

    /**
     * Set 线材收货列表
     * @param WireDeviceList 线材收货列表
     */
    public void setWireDeviceList(WireReceivingInfo [] WireDeviceList) {
        this.WireDeviceList = WireDeviceList;
    }

    /**
     * Get 其他设备收货列表 
     * @return OtherDeviceList 其他设备收货列表
     */
    public OtherDevReceivingInfo [] getOtherDeviceList() {
        return this.OtherDeviceList;
    }

    /**
     * Set 其他设备收货列表
     * @param OtherDeviceList 其他设备收货列表
     */
    public void setOtherDeviceList(OtherDevReceivingInfo [] OtherDeviceList) {
        this.OtherDeviceList = OtherDeviceList;
    }

    /**
     * Get 收货后自动上架。此参数为true时，后台会自动提设备上架单 
     * @return WithRackOn 收货后自动上架。此参数为true时，后台会自动提设备上架单
     */
    public Boolean getWithRackOn() {
        return this.WithRackOn;
    }

    /**
     * Set 收货后自动上架。此参数为true时，后台会自动提设备上架单
     * @param WithRackOn 收货后自动上架。此参数为true时，后台会自动提设备上架单
     */
    public void setWithRackOn(Boolean WithRackOn) {
        this.WithRackOn = WithRackOn;
    }

    /**
     * Get 设备上架信息。当WithRackOn为true此参数必传，且sn需要和收货的列表一致 
     * @return DeviceRackOnList 设备上架信息。当WithRackOn为true此参数必传，且sn需要和收货的列表一致
     */
    public DeviceRackOn [] getDeviceRackOnList() {
        return this.DeviceRackOnList;
    }

    /**
     * Set 设备上架信息。当WithRackOn为true此参数必传，且sn需要和收货的列表一致
     * @param DeviceRackOnList 设备上架信息。当WithRackOn为true此参数必传，且sn需要和收货的列表一致
     */
    public void setDeviceRackOnList(DeviceRackOn [] DeviceRackOnList) {
        this.DeviceRackOnList = DeviceRackOnList;
    }

    /**
     * Get 上架人员 1.自行解决 2.由腾讯IDC负责 
     * @return StuffOption 上架人员 1.自行解决 2.由腾讯IDC负责
     */
    public String getStuffOption() {
        return this.StuffOption;
    }

    /**
     * Set 上架人员 1.自行解决 2.由腾讯IDC负责
     * @param StuffOption 上架人员 1.自行解决 2.由腾讯IDC负责
     */
    public void setStuffOption(String StuffOption) {
        this.StuffOption = StuffOption;
    }

    /**
     * Get 自行解决信息。当StuffOption为1时，此参数必填 
     * @return SelfOperationInfo 自行解决信息。当StuffOption为1时，此参数必填
     */
    public SelfOperation getSelfOperationInfo() {
        return this.SelfOperationInfo;
    }

    /**
     * Set 自行解决信息。当StuffOption为1时，此参数必填
     * @param SelfOperationInfo 自行解决信息。当StuffOption为1时，此参数必填
     */
    public void setSelfOperationInfo(SelfOperation SelfOperationInfo) {
        this.SelfOperationInfo = SelfOperationInfo;
    }

    /**
     * Get 上架后自动开电。此参数为true时，后台会自动提设备开电单 
     * @return WithPowerOn 上架后自动开电。此参数为true时，后台会自动提设备开电单
     */
    public Boolean getWithPowerOn() {
        return this.WithPowerOn;
    }

    /**
     * Set 上架后自动开电。此参数为true时，后台会自动提设备开电单
     * @param WithPowerOn 上架后自动开电。此参数为true时，后台会自动提设备开电单
     */
    public void setWithPowerOn(Boolean WithPowerOn) {
        this.WithPowerOn = WithPowerOn;
    }

    public CreateReceivingWorkOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReceivingWorkOrderRequest(CreateReceivingWorkOrderRequest source) {
        if (source.IdcId != null) {
            this.IdcId = new Long(source.IdcId);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.EntryTime != null) {
            this.EntryTime = new String(source.EntryTime);
        }
        if (source.ReceivingOperation != null) {
            this.ReceivingOperation = new String(source.ReceivingOperation);
        }
        if (source.IsExpressDelivery != null) {
            this.IsExpressDelivery = new Boolean(source.IsExpressDelivery);
        }
        if (source.ExpressInfo != null) {
            this.ExpressInfo = new ExpressDelivery(source.ExpressInfo);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ServerDeviceList != null) {
            this.ServerDeviceList = new ServerReceivingInfo[source.ServerDeviceList.length];
            for (int i = 0; i < source.ServerDeviceList.length; i++) {
                this.ServerDeviceList[i] = new ServerReceivingInfo(source.ServerDeviceList[i]);
            }
        }
        if (source.NetDeviceList != null) {
            this.NetDeviceList = new NetReceivingInfo[source.NetDeviceList.length];
            for (int i = 0; i < source.NetDeviceList.length; i++) {
                this.NetDeviceList[i] = new NetReceivingInfo(source.NetDeviceList[i]);
            }
        }
        if (source.WireDeviceList != null) {
            this.WireDeviceList = new WireReceivingInfo[source.WireDeviceList.length];
            for (int i = 0; i < source.WireDeviceList.length; i++) {
                this.WireDeviceList[i] = new WireReceivingInfo(source.WireDeviceList[i]);
            }
        }
        if (source.OtherDeviceList != null) {
            this.OtherDeviceList = new OtherDevReceivingInfo[source.OtherDeviceList.length];
            for (int i = 0; i < source.OtherDeviceList.length; i++) {
                this.OtherDeviceList[i] = new OtherDevReceivingInfo(source.OtherDeviceList[i]);
            }
        }
        if (source.WithRackOn != null) {
            this.WithRackOn = new Boolean(source.WithRackOn);
        }
        if (source.DeviceRackOnList != null) {
            this.DeviceRackOnList = new DeviceRackOn[source.DeviceRackOnList.length];
            for (int i = 0; i < source.DeviceRackOnList.length; i++) {
                this.DeviceRackOnList[i] = new DeviceRackOn(source.DeviceRackOnList[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdcId", this.IdcId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "EntryTime", this.EntryTime);
        this.setParamSimple(map, prefix + "ReceivingOperation", this.ReceivingOperation);
        this.setParamSimple(map, prefix + "IsExpressDelivery", this.IsExpressDelivery);
        this.setParamObj(map, prefix + "ExpressInfo.", this.ExpressInfo);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "ServerDeviceList.", this.ServerDeviceList);
        this.setParamArrayObj(map, prefix + "NetDeviceList.", this.NetDeviceList);
        this.setParamArrayObj(map, prefix + "WireDeviceList.", this.WireDeviceList);
        this.setParamArrayObj(map, prefix + "OtherDeviceList.", this.OtherDeviceList);
        this.setParamSimple(map, prefix + "WithRackOn", this.WithRackOn);
        this.setParamArrayObj(map, prefix + "DeviceRackOnList.", this.DeviceRackOnList);
        this.setParamSimple(map, prefix + "StuffOption", this.StuffOption);
        this.setParamObj(map, prefix + "SelfOperationInfo.", this.SelfOperationInfo);
        this.setParamSimple(map, prefix + "WithPowerOn", this.WithPowerOn);

    }
}

