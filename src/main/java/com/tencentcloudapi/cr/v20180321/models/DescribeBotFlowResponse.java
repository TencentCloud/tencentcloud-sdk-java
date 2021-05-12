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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBotFlowResponse extends AbstractModel{

    /**
    * 机器人对话流列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BotFlowList")
    @Expose
    private BotFlow [] BotFlowList;

    /**
    * 短信签名列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmsSignList")
    @Expose
    private SmsSign [] SmsSignList;

    /**
    * 短信模板列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmsTemplateList")
    @Expose
    private SmsTemplate [] SmsTemplateList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 机器人对话流列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BotFlowList 机器人对话流列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BotFlow [] getBotFlowList() {
        return this.BotFlowList;
    }

    /**
     * Set 机器人对话流列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param BotFlowList 机器人对话流列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBotFlowList(BotFlow [] BotFlowList) {
        this.BotFlowList = BotFlowList;
    }

    /**
     * Get 短信签名列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmsSignList 短信签名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmsSign [] getSmsSignList() {
        return this.SmsSignList;
    }

    /**
     * Set 短信签名列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmsSignList 短信签名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmsSignList(SmsSign [] SmsSignList) {
        this.SmsSignList = SmsSignList;
    }

    /**
     * Get 短信模板列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmsTemplateList 短信模板列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmsTemplate [] getSmsTemplateList() {
        return this.SmsTemplateList;
    }

    /**
     * Set 短信模板列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmsTemplateList 短信模板列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmsTemplateList(SmsTemplate [] SmsTemplateList) {
        this.SmsTemplateList = SmsTemplateList;
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

    public DescribeBotFlowResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBotFlowResponse(DescribeBotFlowResponse source) {
        if (source.BotFlowList != null) {
            this.BotFlowList = new BotFlow[source.BotFlowList.length];
            for (int i = 0; i < source.BotFlowList.length; i++) {
                this.BotFlowList[i] = new BotFlow(source.BotFlowList[i]);
            }
        }
        if (source.SmsSignList != null) {
            this.SmsSignList = new SmsSign[source.SmsSignList.length];
            for (int i = 0; i < source.SmsSignList.length; i++) {
                this.SmsSignList[i] = new SmsSign(source.SmsSignList[i]);
            }
        }
        if (source.SmsTemplateList != null) {
            this.SmsTemplateList = new SmsTemplate[source.SmsTemplateList.length];
            for (int i = 0; i < source.SmsTemplateList.length; i++) {
                this.SmsTemplateList[i] = new SmsTemplate(source.SmsTemplateList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BotFlowList.", this.BotFlowList);
        this.setParamArrayObj(map, prefix + "SmsSignList.", this.SmsSignList);
        this.setParamArrayObj(map, prefix + "SmsTemplateList.", this.SmsTemplateList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

