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
package com.tencentcloudapi.npp.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCallBackRequest extends AbstractModel{

    /**
    * 业务appid
    */
    @SerializedName("BizAppId")
    @Expose
    private String BizAppId;

    /**
    * 主叫号码(必须为 11 位手机号，号码前加 0086，如 008613631686024)
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * 被叫号码(必须为 11 位手机或固话号码,号码前加 0086，如008613631686024，固话如：0086075586013388)
    */
    @SerializedName("Dst")
    @Expose
    private String Dst;

    /**
    * 主叫显示系统分配的固话号码，如不填显示随机分配号码
    */
    @SerializedName("SrcDisplayNum")
    @Expose
    private String SrcDisplayNum;

    /**
    * 被叫显示系统分配的固话号码，如不填显示随机分配号码
    */
    @SerializedName("DstDisplayNum")
    @Expose
    private String DstDisplayNum;

    /**
    * 是否录音，0 表示不录音，1 表示录音。默认为不录音
    */
    @SerializedName("Record")
    @Expose
    private String Record;

    /**
    * 允许最大通话时间，不填默认为 30 分钟（单位：分钟）
    */
    @SerializedName("MaxAllowTime")
    @Expose
    private String MaxAllowTime;

    /**
    * 主叫发起呼叫状态：1 被叫发起呼叫状态：256 主叫响铃状态：2 被叫响铃状态：512 主叫接听状态：4 被叫接听状态：1024 主叫拒绝接听状态：8 被叫拒绝接听状态：2048 主叫正常挂机状态：16 被叫正常挂机状态：4096 主叫呼叫异常：32 被叫呼叫异常：8192
例如：当值为 0：表示所有状态不需要推送；当值为 4：表示只要推送主叫接听状态；当值为 16191：表示所有状态都需要推送(上面所有值和)
    */
    @SerializedName("StatusFlag")
    @Expose
    private String StatusFlag;

    /**
    * 状态回调通知地址，正式环境可以配置默认推送地址
    */
    @SerializedName("StatusUrl")
    @Expose
    private String StatusUrl;

    /**
    * 话单回调通知地址，正式环境可以配置默认推送地址
    */
    @SerializedName("HangupUrl")
    @Expose
    private String HangupUrl;

    /**
    * 录单 URL 回调通知地址，正式环境可以配置默认推送地址
    */
    @SerializedName("RecordUrl")
    @Expose
    private String RecordUrl;

    /**
    * 业务应用 key，业务用该 key 可以区分内部业务或客户产品等，该 key 需保证在该 appId 下全局唯一，最大长度不超过 64 个字节，bizId 只能包含数字、字母。
    */
    @SerializedName("BizId")
    @Expose
    private String BizId;

    /**
    * 最后一次呼叫 callId，带上该字段以后，平台会参考该 callId 分配线路，优先不分配该 callId 通话线路（注：谨慎使用，这个会影响线路调度）
    */
    @SerializedName("LastCallId")
    @Expose
    private String LastCallId;

    /**
    * 结构体，主叫呼叫预处理操作，根据不同操作确认是否呼通被叫。如需使用，本结构体需要与 keyList 结构体配合使用，此时这两个参数都为必填项
    */
    @SerializedName("PreCallerHandle")
    @Expose
    private RreCallerHandle PreCallerHandle;

    /**
    * 订单 ID，最大长度不超过64个字节，对于一些有订单状态 App 相关应用使用（如达人帮接入 App 应用)，该字段只在帐单中带上，其它回调不附带该字段
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
     * Get 业务appid 
     * @return BizAppId 业务appid
     */
    public String getBizAppId() {
        return this.BizAppId;
    }

    /**
     * Set 业务appid
     * @param BizAppId 业务appid
     */
    public void setBizAppId(String BizAppId) {
        this.BizAppId = BizAppId;
    }

    /**
     * Get 主叫号码(必须为 11 位手机号，号码前加 0086，如 008613631686024) 
     * @return Src 主叫号码(必须为 11 位手机号，号码前加 0086，如 008613631686024)
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 主叫号码(必须为 11 位手机号，号码前加 0086，如 008613631686024)
     * @param Src 主叫号码(必须为 11 位手机号，号码前加 0086，如 008613631686024)
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    /**
     * Get 被叫号码(必须为 11 位手机或固话号码,号码前加 0086，如008613631686024，固话如：0086075586013388) 
     * @return Dst 被叫号码(必须为 11 位手机或固话号码,号码前加 0086，如008613631686024，固话如：0086075586013388)
     */
    public String getDst() {
        return this.Dst;
    }

    /**
     * Set 被叫号码(必须为 11 位手机或固话号码,号码前加 0086，如008613631686024，固话如：0086075586013388)
     * @param Dst 被叫号码(必须为 11 位手机或固话号码,号码前加 0086，如008613631686024，固话如：0086075586013388)
     */
    public void setDst(String Dst) {
        this.Dst = Dst;
    }

    /**
     * Get 主叫显示系统分配的固话号码，如不填显示随机分配号码 
     * @return SrcDisplayNum 主叫显示系统分配的固话号码，如不填显示随机分配号码
     */
    public String getSrcDisplayNum() {
        return this.SrcDisplayNum;
    }

    /**
     * Set 主叫显示系统分配的固话号码，如不填显示随机分配号码
     * @param SrcDisplayNum 主叫显示系统分配的固话号码，如不填显示随机分配号码
     */
    public void setSrcDisplayNum(String SrcDisplayNum) {
        this.SrcDisplayNum = SrcDisplayNum;
    }

    /**
     * Get 被叫显示系统分配的固话号码，如不填显示随机分配号码 
     * @return DstDisplayNum 被叫显示系统分配的固话号码，如不填显示随机分配号码
     */
    public String getDstDisplayNum() {
        return this.DstDisplayNum;
    }

    /**
     * Set 被叫显示系统分配的固话号码，如不填显示随机分配号码
     * @param DstDisplayNum 被叫显示系统分配的固话号码，如不填显示随机分配号码
     */
    public void setDstDisplayNum(String DstDisplayNum) {
        this.DstDisplayNum = DstDisplayNum;
    }

    /**
     * Get 是否录音，0 表示不录音，1 表示录音。默认为不录音 
     * @return Record 是否录音，0 表示不录音，1 表示录音。默认为不录音
     */
    public String getRecord() {
        return this.Record;
    }

    /**
     * Set 是否录音，0 表示不录音，1 表示录音。默认为不录音
     * @param Record 是否录音，0 表示不录音，1 表示录音。默认为不录音
     */
    public void setRecord(String Record) {
        this.Record = Record;
    }

    /**
     * Get 允许最大通话时间，不填默认为 30 分钟（单位：分钟） 
     * @return MaxAllowTime 允许最大通话时间，不填默认为 30 分钟（单位：分钟）
     */
    public String getMaxAllowTime() {
        return this.MaxAllowTime;
    }

    /**
     * Set 允许最大通话时间，不填默认为 30 分钟（单位：分钟）
     * @param MaxAllowTime 允许最大通话时间，不填默认为 30 分钟（单位：分钟）
     */
    public void setMaxAllowTime(String MaxAllowTime) {
        this.MaxAllowTime = MaxAllowTime;
    }

    /**
     * Get 主叫发起呼叫状态：1 被叫发起呼叫状态：256 主叫响铃状态：2 被叫响铃状态：512 主叫接听状态：4 被叫接听状态：1024 主叫拒绝接听状态：8 被叫拒绝接听状态：2048 主叫正常挂机状态：16 被叫正常挂机状态：4096 主叫呼叫异常：32 被叫呼叫异常：8192
例如：当值为 0：表示所有状态不需要推送；当值为 4：表示只要推送主叫接听状态；当值为 16191：表示所有状态都需要推送(上面所有值和) 
     * @return StatusFlag 主叫发起呼叫状态：1 被叫发起呼叫状态：256 主叫响铃状态：2 被叫响铃状态：512 主叫接听状态：4 被叫接听状态：1024 主叫拒绝接听状态：8 被叫拒绝接听状态：2048 主叫正常挂机状态：16 被叫正常挂机状态：4096 主叫呼叫异常：32 被叫呼叫异常：8192
例如：当值为 0：表示所有状态不需要推送；当值为 4：表示只要推送主叫接听状态；当值为 16191：表示所有状态都需要推送(上面所有值和)
     */
    public String getStatusFlag() {
        return this.StatusFlag;
    }

    /**
     * Set 主叫发起呼叫状态：1 被叫发起呼叫状态：256 主叫响铃状态：2 被叫响铃状态：512 主叫接听状态：4 被叫接听状态：1024 主叫拒绝接听状态：8 被叫拒绝接听状态：2048 主叫正常挂机状态：16 被叫正常挂机状态：4096 主叫呼叫异常：32 被叫呼叫异常：8192
例如：当值为 0：表示所有状态不需要推送；当值为 4：表示只要推送主叫接听状态；当值为 16191：表示所有状态都需要推送(上面所有值和)
     * @param StatusFlag 主叫发起呼叫状态：1 被叫发起呼叫状态：256 主叫响铃状态：2 被叫响铃状态：512 主叫接听状态：4 被叫接听状态：1024 主叫拒绝接听状态：8 被叫拒绝接听状态：2048 主叫正常挂机状态：16 被叫正常挂机状态：4096 主叫呼叫异常：32 被叫呼叫异常：8192
例如：当值为 0：表示所有状态不需要推送；当值为 4：表示只要推送主叫接听状态；当值为 16191：表示所有状态都需要推送(上面所有值和)
     */
    public void setStatusFlag(String StatusFlag) {
        this.StatusFlag = StatusFlag;
    }

    /**
     * Get 状态回调通知地址，正式环境可以配置默认推送地址 
     * @return StatusUrl 状态回调通知地址，正式环境可以配置默认推送地址
     */
    public String getStatusUrl() {
        return this.StatusUrl;
    }

    /**
     * Set 状态回调通知地址，正式环境可以配置默认推送地址
     * @param StatusUrl 状态回调通知地址，正式环境可以配置默认推送地址
     */
    public void setStatusUrl(String StatusUrl) {
        this.StatusUrl = StatusUrl;
    }

    /**
     * Get 话单回调通知地址，正式环境可以配置默认推送地址 
     * @return HangupUrl 话单回调通知地址，正式环境可以配置默认推送地址
     */
    public String getHangupUrl() {
        return this.HangupUrl;
    }

    /**
     * Set 话单回调通知地址，正式环境可以配置默认推送地址
     * @param HangupUrl 话单回调通知地址，正式环境可以配置默认推送地址
     */
    public void setHangupUrl(String HangupUrl) {
        this.HangupUrl = HangupUrl;
    }

    /**
     * Get 录单 URL 回调通知地址，正式环境可以配置默认推送地址 
     * @return RecordUrl 录单 URL 回调通知地址，正式环境可以配置默认推送地址
     */
    public String getRecordUrl() {
        return this.RecordUrl;
    }

    /**
     * Set 录单 URL 回调通知地址，正式环境可以配置默认推送地址
     * @param RecordUrl 录单 URL 回调通知地址，正式环境可以配置默认推送地址
     */
    public void setRecordUrl(String RecordUrl) {
        this.RecordUrl = RecordUrl;
    }

    /**
     * Get 业务应用 key，业务用该 key 可以区分内部业务或客户产品等，该 key 需保证在该 appId 下全局唯一，最大长度不超过 64 个字节，bizId 只能包含数字、字母。 
     * @return BizId 业务应用 key，业务用该 key 可以区分内部业务或客户产品等，该 key 需保证在该 appId 下全局唯一，最大长度不超过 64 个字节，bizId 只能包含数字、字母。
     */
    public String getBizId() {
        return this.BizId;
    }

    /**
     * Set 业务应用 key，业务用该 key 可以区分内部业务或客户产品等，该 key 需保证在该 appId 下全局唯一，最大长度不超过 64 个字节，bizId 只能包含数字、字母。
     * @param BizId 业务应用 key，业务用该 key 可以区分内部业务或客户产品等，该 key 需保证在该 appId 下全局唯一，最大长度不超过 64 个字节，bizId 只能包含数字、字母。
     */
    public void setBizId(String BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 最后一次呼叫 callId，带上该字段以后，平台会参考该 callId 分配线路，优先不分配该 callId 通话线路（注：谨慎使用，这个会影响线路调度） 
     * @return LastCallId 最后一次呼叫 callId，带上该字段以后，平台会参考该 callId 分配线路，优先不分配该 callId 通话线路（注：谨慎使用，这个会影响线路调度）
     */
    public String getLastCallId() {
        return this.LastCallId;
    }

    /**
     * Set 最后一次呼叫 callId，带上该字段以后，平台会参考该 callId 分配线路，优先不分配该 callId 通话线路（注：谨慎使用，这个会影响线路调度）
     * @param LastCallId 最后一次呼叫 callId，带上该字段以后，平台会参考该 callId 分配线路，优先不分配该 callId 通话线路（注：谨慎使用，这个会影响线路调度）
     */
    public void setLastCallId(String LastCallId) {
        this.LastCallId = LastCallId;
    }

    /**
     * Get 结构体，主叫呼叫预处理操作，根据不同操作确认是否呼通被叫。如需使用，本结构体需要与 keyList 结构体配合使用，此时这两个参数都为必填项 
     * @return PreCallerHandle 结构体，主叫呼叫预处理操作，根据不同操作确认是否呼通被叫。如需使用，本结构体需要与 keyList 结构体配合使用，此时这两个参数都为必填项
     */
    public RreCallerHandle getPreCallerHandle() {
        return this.PreCallerHandle;
    }

    /**
     * Set 结构体，主叫呼叫预处理操作，根据不同操作确认是否呼通被叫。如需使用，本结构体需要与 keyList 结构体配合使用，此时这两个参数都为必填项
     * @param PreCallerHandle 结构体，主叫呼叫预处理操作，根据不同操作确认是否呼通被叫。如需使用，本结构体需要与 keyList 结构体配合使用，此时这两个参数都为必填项
     */
    public void setPreCallerHandle(RreCallerHandle PreCallerHandle) {
        this.PreCallerHandle = PreCallerHandle;
    }

    /**
     * Get 订单 ID，最大长度不超过64个字节，对于一些有订单状态 App 相关应用使用（如达人帮接入 App 应用)，该字段只在帐单中带上，其它回调不附带该字段 
     * @return OrderId 订单 ID，最大长度不超过64个字节，对于一些有订单状态 App 相关应用使用（如达人帮接入 App 应用)，该字段只在帐单中带上，其它回调不附带该字段
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单 ID，最大长度不超过64个字节，对于一些有订单状态 App 相关应用使用（如达人帮接入 App 应用)，该字段只在帐单中带上，其它回调不附带该字段
     * @param OrderId 订单 ID，最大长度不超过64个字节，对于一些有订单状态 App 相关应用使用（如达人帮接入 App 应用)，该字段只在帐单中带上，其它回调不附带该字段
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizAppId", this.BizAppId);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "Dst", this.Dst);
        this.setParamSimple(map, prefix + "SrcDisplayNum", this.SrcDisplayNum);
        this.setParamSimple(map, prefix + "DstDisplayNum", this.DstDisplayNum);
        this.setParamSimple(map, prefix + "Record", this.Record);
        this.setParamSimple(map, prefix + "MaxAllowTime", this.MaxAllowTime);
        this.setParamSimple(map, prefix + "StatusFlag", this.StatusFlag);
        this.setParamSimple(map, prefix + "StatusUrl", this.StatusUrl);
        this.setParamSimple(map, prefix + "HangupUrl", this.HangupUrl);
        this.setParamSimple(map, prefix + "RecordUrl", this.RecordUrl);
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "LastCallId", this.LastCallId);
        this.setParamObj(map, prefix + "PreCallerHandle.", this.PreCallerHandle);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);

    }
}

