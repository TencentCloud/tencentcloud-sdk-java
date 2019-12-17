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
package com.tencentcloudapi.tbp.v20190627.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextProcessResponse extends AbstractModel{

    /**
    * 当前会话状态{会话开始: START; 会话中: COUTINUE; 会话结束: COMPLETE}。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DialogStatus")
    @Expose
    private String DialogStatus;

    /**
    * 匹配到的机器人名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BotName")
    @Expose
    private String BotName;

    /**
    * 匹配到的意图名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntentName")
    @Expose
    private String IntentName;

    /**
    * 槽位信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlotInfoList")
    @Expose
    private SlotInfo [] SlotInfoList;

    /**
    * 原始的用户说法。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputText")
    @Expose
    private String InputText;

    /**
    * 机器人应答。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseMessage")
    @Expose
    private ResponseMessage ResponseMessage;

    /**
    * 透传字段，由用户自定义的WebService服务返回。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionAttributes")
    @Expose
    private String SessionAttributes;

    /**
    * 结果类型 {中间逻辑出错:0; 任务型机器人:1; 问答型机器人:2; 闲聊型机器人:3; 未匹配上，返回预设兜底话术:5; 未匹配上，返回相似问题列表:6}。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultType")
    @Expose
    private String ResultType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前会话状态{会话开始: START; 会话中: COUTINUE; 会话结束: COMPLETE}。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DialogStatus 当前会话状态{会话开始: START; 会话中: COUTINUE; 会话结束: COMPLETE}。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDialogStatus() {
        return this.DialogStatus;
    }

    /**
     * Set 当前会话状态{会话开始: START; 会话中: COUTINUE; 会话结束: COMPLETE}。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DialogStatus 当前会话状态{会话开始: START; 会话中: COUTINUE; 会话结束: COMPLETE}。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDialogStatus(String DialogStatus) {
        this.DialogStatus = DialogStatus;
    }

    /**
     * Get 匹配到的机器人名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BotName 匹配到的机器人名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBotName() {
        return this.BotName;
    }

    /**
     * Set 匹配到的机器人名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BotName 匹配到的机器人名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBotName(String BotName) {
        this.BotName = BotName;
    }

    /**
     * Get 匹配到的意图名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntentName 匹配到的意图名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntentName() {
        return this.IntentName;
    }

    /**
     * Set 匹配到的意图名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntentName 匹配到的意图名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntentName(String IntentName) {
        this.IntentName = IntentName;
    }

    /**
     * Get 槽位信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlotInfoList 槽位信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SlotInfo [] getSlotInfoList() {
        return this.SlotInfoList;
    }

    /**
     * Set 槽位信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlotInfoList 槽位信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlotInfoList(SlotInfo [] SlotInfoList) {
        this.SlotInfoList = SlotInfoList;
    }

    /**
     * Get 原始的用户说法。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputText 原始的用户说法。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputText() {
        return this.InputText;
    }

    /**
     * Set 原始的用户说法。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputText 原始的用户说法。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputText(String InputText) {
        this.InputText = InputText;
    }

    /**
     * Get 机器人应答。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseMessage 机器人应答。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResponseMessage getResponseMessage() {
        return this.ResponseMessage;
    }

    /**
     * Set 机器人应答。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseMessage 机器人应答。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseMessage(ResponseMessage ResponseMessage) {
        this.ResponseMessage = ResponseMessage;
    }

    /**
     * Get 透传字段，由用户自定义的WebService服务返回。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionAttributes 透传字段，由用户自定义的WebService服务返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionAttributes() {
        return this.SessionAttributes;
    }

    /**
     * Set 透传字段，由用户自定义的WebService服务返回。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionAttributes 透传字段，由用户自定义的WebService服务返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionAttributes(String SessionAttributes) {
        this.SessionAttributes = SessionAttributes;
    }

    /**
     * Get 结果类型 {中间逻辑出错:0; 任务型机器人:1; 问答型机器人:2; 闲聊型机器人:3; 未匹配上，返回预设兜底话术:5; 未匹配上，返回相似问题列表:6}。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultType 结果类型 {中间逻辑出错:0; 任务型机器人:1; 问答型机器人:2; 闲聊型机器人:3; 未匹配上，返回预设兜底话术:5; 未匹配上，返回相似问题列表:6}。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultType() {
        return this.ResultType;
    }

    /**
     * Set 结果类型 {中间逻辑出错:0; 任务型机器人:1; 问答型机器人:2; 闲聊型机器人:3; 未匹配上，返回预设兜底话术:5; 未匹配上，返回相似问题列表:6}。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultType 结果类型 {中间逻辑出错:0; 任务型机器人:1; 问答型机器人:2; 闲聊型机器人:3; 未匹配上，返回预设兜底话术:5; 未匹配上，返回相似问题列表:6}。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultType(String ResultType) {
        this.ResultType = ResultType;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DialogStatus", this.DialogStatus);
        this.setParamSimple(map, prefix + "BotName", this.BotName);
        this.setParamSimple(map, prefix + "IntentName", this.IntentName);
        this.setParamArrayObj(map, prefix + "SlotInfoList.", this.SlotInfoList);
        this.setParamSimple(map, prefix + "InputText", this.InputText);
        this.setParamObj(map, prefix + "ResponseMessage.", this.ResponseMessage);
        this.setParamSimple(map, prefix + "SessionAttributes", this.SessionAttributes);
        this.setParamSimple(map, prefix + "ResultType", this.ResultType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

