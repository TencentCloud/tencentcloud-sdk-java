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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NoticeRule extends AbstractModel {

    /**
    * 告警通知模板接收者信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoticeReceivers")
    @Expose
    private NoticeReceiver [] NoticeReceivers;

    /**
    * 告警通知模板回调信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebCallbacks")
    @Expose
    private WebCallback [] WebCallbacks;

    /**
    * 匹配规则。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
     * Get 告警通知模板接收者信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoticeReceivers 告警通知模板接收者信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NoticeReceiver [] getNoticeReceivers() {
        return this.NoticeReceivers;
    }

    /**
     * Set 告警通知模板接收者信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoticeReceivers 告警通知模板接收者信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoticeReceivers(NoticeReceiver [] NoticeReceivers) {
        this.NoticeReceivers = NoticeReceivers;
    }

    /**
     * Get 告警通知模板回调信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebCallbacks 告警通知模板回调信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WebCallback [] getWebCallbacks() {
        return this.WebCallbacks;
    }

    /**
     * Set 告警通知模板回调信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebCallbacks 告警通知模板回调信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebCallbacks(WebCallback [] WebCallbacks) {
        this.WebCallbacks = WebCallbacks;
    }

    /**
     * Get 匹配规则。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rule 匹配规则。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set 匹配规则。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rule 匹配规则。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    public NoticeRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NoticeRule(NoticeRule source) {
        if (source.NoticeReceivers != null) {
            this.NoticeReceivers = new NoticeReceiver[source.NoticeReceivers.length];
            for (int i = 0; i < source.NoticeReceivers.length; i++) {
                this.NoticeReceivers[i] = new NoticeReceiver(source.NoticeReceivers[i]);
            }
        }
        if (source.WebCallbacks != null) {
            this.WebCallbacks = new WebCallback[source.WebCallbacks.length];
            for (int i = 0; i < source.WebCallbacks.length; i++) {
                this.WebCallbacks[i] = new WebCallback(source.WebCallbacks[i]);
            }
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NoticeReceivers.", this.NoticeReceivers);
        this.setParamArrayObj(map, prefix + "WebCallbacks.", this.WebCallbacks);
        this.setParamSimple(map, prefix + "Rule", this.Rule);

    }
}

