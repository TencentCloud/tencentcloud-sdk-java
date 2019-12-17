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
package com.tencentcloudapi.tbp.v20190311.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetResponse extends AbstractModel{

    /**
    * 当前会话状态。取值:"start"/"continue"/"complete"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DialogStatus")
    @Expose
    private String DialogStatus;

    /**
    * 匹配到的机器人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BotName")
    @Expose
    private String BotName;

    /**
    * 匹配到的意图名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntentName")
    @Expose
    private String IntentName;

    /**
    * 机器人回答
    */
    @SerializedName("ResponseText")
    @Expose
    private String ResponseText;

    /**
    * 语义解析的槽位结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlotInfoList")
    @Expose
    private SlotInfo [] SlotInfoList;

    /**
    * 透传字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionAttributes")
    @Expose
    private String SessionAttributes;

    /**
    * 用户说法。该说法是用户原生说法或ASR识别结果，未经过语义优化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * tts合成pcm音频存储链接。仅当请求参数NeedTts=true时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaveUrl")
    @Expose
    private String WaveUrl;

    /**
    * tts合成的pcm音频。二进制数组经过base64编码(暂时不返回)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaveData")
    @Expose
    private String WaveData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前会话状态。取值:"start"/"continue"/"complete"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DialogStatus 当前会话状态。取值:"start"/"continue"/"complete"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDialogStatus() {
        return this.DialogStatus;
    }

    /**
     * Set 当前会话状态。取值:"start"/"continue"/"complete"
注意：此字段可能返回 null，表示取不到有效值。
     * @param DialogStatus 当前会话状态。取值:"start"/"continue"/"complete"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDialogStatus(String DialogStatus) {
        this.DialogStatus = DialogStatus;
    }

    /**
     * Get 匹配到的机器人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BotName 匹配到的机器人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBotName() {
        return this.BotName;
    }

    /**
     * Set 匹配到的机器人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BotName 匹配到的机器人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBotName(String BotName) {
        this.BotName = BotName;
    }

    /**
     * Get 匹配到的意图名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntentName 匹配到的意图名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntentName() {
        return this.IntentName;
    }

    /**
     * Set 匹配到的意图名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntentName 匹配到的意图名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntentName(String IntentName) {
        this.IntentName = IntentName;
    }

    /**
     * Get 机器人回答 
     * @return ResponseText 机器人回答
     */
    public String getResponseText() {
        return this.ResponseText;
    }

    /**
     * Set 机器人回答
     * @param ResponseText 机器人回答
     */
    public void setResponseText(String ResponseText) {
        this.ResponseText = ResponseText;
    }

    /**
     * Get 语义解析的槽位结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlotInfoList 语义解析的槽位结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SlotInfo [] getSlotInfoList() {
        return this.SlotInfoList;
    }

    /**
     * Set 语义解析的槽位结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlotInfoList 语义解析的槽位结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlotInfoList(SlotInfo [] SlotInfoList) {
        this.SlotInfoList = SlotInfoList;
    }

    /**
     * Get 透传字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionAttributes 透传字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionAttributes() {
        return this.SessionAttributes;
    }

    /**
     * Set 透传字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionAttributes 透传字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionAttributes(String SessionAttributes) {
        this.SessionAttributes = SessionAttributes;
    }

    /**
     * Get 用户说法。该说法是用户原生说法或ASR识别结果，未经过语义优化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Question 用户说法。该说法是用户原生说法或ASR识别结果，未经过语义优化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set 用户说法。该说法是用户原生说法或ASR识别结果，未经过语义优化
注意：此字段可能返回 null，表示取不到有效值。
     * @param Question 用户说法。该说法是用户原生说法或ASR识别结果，未经过语义优化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get tts合成pcm音频存储链接。仅当请求参数NeedTts=true时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaveUrl tts合成pcm音频存储链接。仅当请求参数NeedTts=true时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWaveUrl() {
        return this.WaveUrl;
    }

    /**
     * Set tts合成pcm音频存储链接。仅当请求参数NeedTts=true时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaveUrl tts合成pcm音频存储链接。仅当请求参数NeedTts=true时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaveUrl(String WaveUrl) {
        this.WaveUrl = WaveUrl;
    }

    /**
     * Get tts合成的pcm音频。二进制数组经过base64编码(暂时不返回)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaveData tts合成的pcm音频。二进制数组经过base64编码(暂时不返回)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWaveData() {
        return this.WaveData;
    }

    /**
     * Set tts合成的pcm音频。二进制数组经过base64编码(暂时不返回)
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaveData tts合成的pcm音频。二进制数组经过base64编码(暂时不返回)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaveData(String WaveData) {
        this.WaveData = WaveData;
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
        this.setParamSimple(map, prefix + "ResponseText", this.ResponseText);
        this.setParamArrayObj(map, prefix + "SlotInfoList.", this.SlotInfoList);
        this.setParamSimple(map, prefix + "SessionAttributes", this.SessionAttributes);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "WaveUrl", this.WaveUrl);
        this.setParamSimple(map, prefix + "WaveData", this.WaveData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

