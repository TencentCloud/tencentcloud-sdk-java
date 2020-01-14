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

public class VirturalNumCdr extends AbstractModel{

    /**
    * 呼叫通话 ID
    */
    @SerializedName("CallId")
    @Expose
    private String CallId;

    /**
    * 双方号码 + 中间号绑定 ID，该 ID 全局唯一
    */
    @SerializedName("BindId")
    @Expose
    private String BindId;

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
    * 主叫通讯录直拨虚拟保护号码
    */
    @SerializedName("DstVirtualNum")
    @Expose
    private String DstVirtualNum;

    /**
    * 虚拟保护号码平台收到呼叫时间
    */
    @SerializedName("CallCenterAcceptTime")
    @Expose
    private String CallCenterAcceptTime;

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
    * 通话最后状态：0：未知状态 1：正常通话 2：查询呼叫转移被叫号异常 3：未接通 4：未接听 5：拒接挂断 6：关机 7：空号 8：通话中 9：欠费 10：运营商线路或平台异常
    */
    @SerializedName("CallEndStatus")
    @Expose
    private String CallEndStatus;

    /**
    * 主叫接通虚拟保护号码到通话结束通话时间
    */
    @SerializedName("SrcDuration")
    @Expose
    private String SrcDuration;

    /**
    * 呼叫转接被叫接通到通话结束通话时间
    */
    @SerializedName("DstDuration")
    @Expose
    private String DstDuration;

    /**
    * 录音 URL，如果不录音或录音失败，该值为空
    */
    @SerializedName("RecordUrl")
    @Expose
    private String RecordUrl;

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
     * Get 双方号码 + 中间号绑定 ID，该 ID 全局唯一 
     * @return BindId 双方号码 + 中间号绑定 ID，该 ID 全局唯一
     */
    public String getBindId() {
        return this.BindId;
    }

    /**
     * Set 双方号码 + 中间号绑定 ID，该 ID 全局唯一
     * @param BindId 双方号码 + 中间号绑定 ID，该 ID 全局唯一
     */
    public void setBindId(String BindId) {
        this.BindId = BindId;
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
     * Get 主叫通讯录直拨虚拟保护号码 
     * @return DstVirtualNum 主叫通讯录直拨虚拟保护号码
     */
    public String getDstVirtualNum() {
        return this.DstVirtualNum;
    }

    /**
     * Set 主叫通讯录直拨虚拟保护号码
     * @param DstVirtualNum 主叫通讯录直拨虚拟保护号码
     */
    public void setDstVirtualNum(String DstVirtualNum) {
        this.DstVirtualNum = DstVirtualNum;
    }

    /**
     * Get 虚拟保护号码平台收到呼叫时间 
     * @return CallCenterAcceptTime 虚拟保护号码平台收到呼叫时间
     */
    public String getCallCenterAcceptTime() {
        return this.CallCenterAcceptTime;
    }

    /**
     * Set 虚拟保护号码平台收到呼叫时间
     * @param CallCenterAcceptTime 虚拟保护号码平台收到呼叫时间
     */
    public void setCallCenterAcceptTime(String CallCenterAcceptTime) {
        this.CallCenterAcceptTime = CallCenterAcceptTime;
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
     * Get 通话最后状态：0：未知状态 1：正常通话 2：查询呼叫转移被叫号异常 3：未接通 4：未接听 5：拒接挂断 6：关机 7：空号 8：通话中 9：欠费 10：运营商线路或平台异常 
     * @return CallEndStatus 通话最后状态：0：未知状态 1：正常通话 2：查询呼叫转移被叫号异常 3：未接通 4：未接听 5：拒接挂断 6：关机 7：空号 8：通话中 9：欠费 10：运营商线路或平台异常
     */
    public String getCallEndStatus() {
        return this.CallEndStatus;
    }

    /**
     * Set 通话最后状态：0：未知状态 1：正常通话 2：查询呼叫转移被叫号异常 3：未接通 4：未接听 5：拒接挂断 6：关机 7：空号 8：通话中 9：欠费 10：运营商线路或平台异常
     * @param CallEndStatus 通话最后状态：0：未知状态 1：正常通话 2：查询呼叫转移被叫号异常 3：未接通 4：未接听 5：拒接挂断 6：关机 7：空号 8：通话中 9：欠费 10：运营商线路或平台异常
     */
    public void setCallEndStatus(String CallEndStatus) {
        this.CallEndStatus = CallEndStatus;
    }

    /**
     * Get 主叫接通虚拟保护号码到通话结束通话时间 
     * @return SrcDuration 主叫接通虚拟保护号码到通话结束通话时间
     */
    public String getSrcDuration() {
        return this.SrcDuration;
    }

    /**
     * Set 主叫接通虚拟保护号码到通话结束通话时间
     * @param SrcDuration 主叫接通虚拟保护号码到通话结束通话时间
     */
    public void setSrcDuration(String SrcDuration) {
        this.SrcDuration = SrcDuration;
    }

    /**
     * Get 呼叫转接被叫接通到通话结束通话时间 
     * @return DstDuration 呼叫转接被叫接通到通话结束通话时间
     */
    public String getDstDuration() {
        return this.DstDuration;
    }

    /**
     * Set 呼叫转接被叫接通到通话结束通话时间
     * @param DstDuration 呼叫转接被叫接通到通话结束通话时间
     */
    public void setDstDuration(String DstDuration) {
        this.DstDuration = DstDuration;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallId", this.CallId);
        this.setParamSimple(map, prefix + "BindId", this.BindId);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "Dst", this.Dst);
        this.setParamSimple(map, prefix + "DstVirtualNum", this.DstVirtualNum);
        this.setParamSimple(map, prefix + "CallCenterAcceptTime", this.CallCenterAcceptTime);
        this.setParamSimple(map, prefix + "StartDstCallTime", this.StartDstCallTime);
        this.setParamSimple(map, prefix + "StartDstRingTime", this.StartDstRingTime);
        this.setParamSimple(map, prefix + "DstAcceptTime", this.DstAcceptTime);
        this.setParamSimple(map, prefix + "EndCallTime", this.EndCallTime);
        this.setParamSimple(map, prefix + "CallEndStatus", this.CallEndStatus);
        this.setParamSimple(map, prefix + "SrcDuration", this.SrcDuration);
        this.setParamSimple(map, prefix + "DstDuration", this.DstDuration);
        this.setParamSimple(map, prefix + "RecordUrl", this.RecordUrl);

    }
}

