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

public class CallBackCdr extends AbstractModel{

    /**
    * 呼叫通话 ID
    */
    @SerializedName("CallId")
    @Expose
    private String CallId;

    /**
    * 主叫号码
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * 被叫号码
    */
    @SerializedName("Dst")
    @Expose
    private String Dst;

    /**
    * 主叫呼叫开始时间
    */
    @SerializedName("StartSrcCallTime")
    @Expose
    private String StartSrcCallTime;

    /**
    * 主叫响铃开始时间
    */
    @SerializedName("StartSrcRingTime")
    @Expose
    private String StartSrcRingTime;

    /**
    * 主叫接听时间
    */
    @SerializedName("SrcAcceptTime")
    @Expose
    private String SrcAcceptTime;

    /**
    * 被叫呼叫开始时间
    */
    @SerializedName("StartDstCallTime")
    @Expose
    private String StartDstCallTime;

    /**
    * 被叫响铃开始时间
    */
    @SerializedName("StartDstRingTime")
    @Expose
    private String StartDstRingTime;

    /**
    * 被叫接听时间
    */
    @SerializedName("DstAcceptTime")
    @Expose
    private String DstAcceptTime;

    /**
    * 用户挂机通话结束时间
    */
    @SerializedName("EndCallTime")
    @Expose
    private String EndCallTime;

    /**
    * 通话最后状态：0：未知状态 1：正常通话 2：主叫未接 3：主叫接听，被叫未接 4：主叫未接通 5：被叫未接通
    */
    @SerializedName("CallEndStatus")
    @Expose
    private String CallEndStatus;

    /**
    * 通话计费时间
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * 录音 URL，如果不录音或录音失败，该值为空
    */
    @SerializedName("RecordUrl")
    @Expose
    private String RecordUrl;

    /**
    * 通话类型(1: VOIP 2:IP TO PSTN 3: PSTN TO PSTN)，如果话单中没有该字段，默认值为回拨 3 (PSTN TO PSTN)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallType")
    @Expose
    private String CallType;

    /**
    * 同回拨请求中的 bizId，如果回拨请求中带 bizId 会有该字段返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizId")
    @Expose
    private String BizId;

    /**
    * 订单 ID,最大长度不超过 64 个字节，对于一些有订单状态 App 相关应用（如达人帮接入 App 应用)，该字段只在帐单中带上，其它回调不附带该字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
     * Get 呼叫通话 ID 
     * @return CallId 呼叫通话 ID
     */
    public String getCallId() {
        return this.CallId;
    }

    /**
     * Set 呼叫通话 ID
     * @param CallId 呼叫通话 ID
     */
    public void setCallId(String CallId) {
        this.CallId = CallId;
    }

    /**
     * Get 主叫号码 
     * @return Src 主叫号码
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 主叫号码
     * @param Src 主叫号码
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    /**
     * Get 被叫号码 
     * @return Dst 被叫号码
     */
    public String getDst() {
        return this.Dst;
    }

    /**
     * Set 被叫号码
     * @param Dst 被叫号码
     */
    public void setDst(String Dst) {
        this.Dst = Dst;
    }

    /**
     * Get 主叫呼叫开始时间 
     * @return StartSrcCallTime 主叫呼叫开始时间
     */
    public String getStartSrcCallTime() {
        return this.StartSrcCallTime;
    }

    /**
     * Set 主叫呼叫开始时间
     * @param StartSrcCallTime 主叫呼叫开始时间
     */
    public void setStartSrcCallTime(String StartSrcCallTime) {
        this.StartSrcCallTime = StartSrcCallTime;
    }

    /**
     * Get 主叫响铃开始时间 
     * @return StartSrcRingTime 主叫响铃开始时间
     */
    public String getStartSrcRingTime() {
        return this.StartSrcRingTime;
    }

    /**
     * Set 主叫响铃开始时间
     * @param StartSrcRingTime 主叫响铃开始时间
     */
    public void setStartSrcRingTime(String StartSrcRingTime) {
        this.StartSrcRingTime = StartSrcRingTime;
    }

    /**
     * Get 主叫接听时间 
     * @return SrcAcceptTime 主叫接听时间
     */
    public String getSrcAcceptTime() {
        return this.SrcAcceptTime;
    }

    /**
     * Set 主叫接听时间
     * @param SrcAcceptTime 主叫接听时间
     */
    public void setSrcAcceptTime(String SrcAcceptTime) {
        this.SrcAcceptTime = SrcAcceptTime;
    }

    /**
     * Get 被叫呼叫开始时间 
     * @return StartDstCallTime 被叫呼叫开始时间
     */
    public String getStartDstCallTime() {
        return this.StartDstCallTime;
    }

    /**
     * Set 被叫呼叫开始时间
     * @param StartDstCallTime 被叫呼叫开始时间
     */
    public void setStartDstCallTime(String StartDstCallTime) {
        this.StartDstCallTime = StartDstCallTime;
    }

    /**
     * Get 被叫响铃开始时间 
     * @return StartDstRingTime 被叫响铃开始时间
     */
    public String getStartDstRingTime() {
        return this.StartDstRingTime;
    }

    /**
     * Set 被叫响铃开始时间
     * @param StartDstRingTime 被叫响铃开始时间
     */
    public void setStartDstRingTime(String StartDstRingTime) {
        this.StartDstRingTime = StartDstRingTime;
    }

    /**
     * Get 被叫接听时间 
     * @return DstAcceptTime 被叫接听时间
     */
    public String getDstAcceptTime() {
        return this.DstAcceptTime;
    }

    /**
     * Set 被叫接听时间
     * @param DstAcceptTime 被叫接听时间
     */
    public void setDstAcceptTime(String DstAcceptTime) {
        this.DstAcceptTime = DstAcceptTime;
    }

    /**
     * Get 用户挂机通话结束时间 
     * @return EndCallTime 用户挂机通话结束时间
     */
    public String getEndCallTime() {
        return this.EndCallTime;
    }

    /**
     * Set 用户挂机通话结束时间
     * @param EndCallTime 用户挂机通话结束时间
     */
    public void setEndCallTime(String EndCallTime) {
        this.EndCallTime = EndCallTime;
    }

    /**
     * Get 通话最后状态：0：未知状态 1：正常通话 2：主叫未接 3：主叫接听，被叫未接 4：主叫未接通 5：被叫未接通 
     * @return CallEndStatus 通话最后状态：0：未知状态 1：正常通话 2：主叫未接 3：主叫接听，被叫未接 4：主叫未接通 5：被叫未接通
     */
    public String getCallEndStatus() {
        return this.CallEndStatus;
    }

    /**
     * Set 通话最后状态：0：未知状态 1：正常通话 2：主叫未接 3：主叫接听，被叫未接 4：主叫未接通 5：被叫未接通
     * @param CallEndStatus 通话最后状态：0：未知状态 1：正常通话 2：主叫未接 3：主叫接听，被叫未接 4：主叫未接通 5：被叫未接通
     */
    public void setCallEndStatus(String CallEndStatus) {
        this.CallEndStatus = CallEndStatus;
    }

    /**
     * Get 通话计费时间 
     * @return Duration 通话计费时间
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 通话计费时间
     * @param Duration 通话计费时间
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 录音 URL，如果不录音或录音失败，该值为空 
     * @return RecordUrl 录音 URL，如果不录音或录音失败，该值为空
     */
    public String getRecordUrl() {
        return this.RecordUrl;
    }

    /**
     * Set 录音 URL，如果不录音或录音失败，该值为空
     * @param RecordUrl 录音 URL，如果不录音或录音失败，该值为空
     */
    public void setRecordUrl(String RecordUrl) {
        this.RecordUrl = RecordUrl;
    }

    /**
     * Get 通话类型(1: VOIP 2:IP TO PSTN 3: PSTN TO PSTN)，如果话单中没有该字段，默认值为回拨 3 (PSTN TO PSTN)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CallType 通话类型(1: VOIP 2:IP TO PSTN 3: PSTN TO PSTN)，如果话单中没有该字段，默认值为回拨 3 (PSTN TO PSTN)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCallType() {
        return this.CallType;
    }

    /**
     * Set 通话类型(1: VOIP 2:IP TO PSTN 3: PSTN TO PSTN)，如果话单中没有该字段，默认值为回拨 3 (PSTN TO PSTN)
注意：此字段可能返回 null，表示取不到有效值。
     * @param CallType 通话类型(1: VOIP 2:IP TO PSTN 3: PSTN TO PSTN)，如果话单中没有该字段，默认值为回拨 3 (PSTN TO PSTN)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallType(String CallType) {
        this.CallType = CallType;
    }

    /**
     * Get 同回拨请求中的 bizId，如果回拨请求中带 bizId 会有该字段返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizId 同回拨请求中的 bizId，如果回拨请求中带 bizId 会有该字段返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBizId() {
        return this.BizId;
    }

    /**
     * Set 同回拨请求中的 bizId，如果回拨请求中带 bizId 会有该字段返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizId 同回拨请求中的 bizId，如果回拨请求中带 bizId 会有该字段返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizId(String BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 订单 ID,最大长度不超过 64 个字节，对于一些有订单状态 App 相关应用（如达人帮接入 App 应用)，该字段只在帐单中带上，其它回调不附带该字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderId 订单 ID,最大长度不超过 64 个字节，对于一些有订单状态 App 相关应用（如达人帮接入 App 应用)，该字段只在帐单中带上，其它回调不附带该字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单 ID,最大长度不超过 64 个字节，对于一些有订单状态 App 相关应用（如达人帮接入 App 应用)，该字段只在帐单中带上，其它回调不附带该字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderId 订单 ID,最大长度不超过 64 个字节，对于一些有订单状态 App 相关应用（如达人帮接入 App 应用)，该字段只在帐单中带上，其它回调不附带该字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallId", this.CallId);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "Dst", this.Dst);
        this.setParamSimple(map, prefix + "StartSrcCallTime", this.StartSrcCallTime);
        this.setParamSimple(map, prefix + "StartSrcRingTime", this.StartSrcRingTime);
        this.setParamSimple(map, prefix + "SrcAcceptTime", this.SrcAcceptTime);
        this.setParamSimple(map, prefix + "StartDstCallTime", this.StartDstCallTime);
        this.setParamSimple(map, prefix + "StartDstRingTime", this.StartDstRingTime);
        this.setParamSimple(map, prefix + "DstAcceptTime", this.DstAcceptTime);
        this.setParamSimple(map, prefix + "EndCallTime", this.EndCallTime);
        this.setParamSimple(map, prefix + "CallEndStatus", this.CallEndStatus);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "RecordUrl", this.RecordUrl);
        this.setParamSimple(map, prefix + "CallType", this.CallType);
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);

    }
}

