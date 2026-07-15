/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmHierarchicalNotice extends AbstractModel {

    /**
    * <p>通知模板ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoticeId")
    @Expose
    private String NoticeId;

    /**
    * <p>通知等级列表，[&quot;Remind&quot;,&quot;Serious&quot;]表示该通知模板仅接收提醒和严重类别的告警</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Classification")
    @Expose
    private String [] Classification;

    /**
    * <p>模板对应的策略id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
     * Get <p>通知模板ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoticeId <p>通知模板ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNoticeId() {
        return this.NoticeId;
    }

    /**
     * Set <p>通知模板ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoticeId <p>通知模板ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoticeId(String NoticeId) {
        this.NoticeId = NoticeId;
    }

    /**
     * Get <p>通知等级列表，[&quot;Remind&quot;,&quot;Serious&quot;]表示该通知模板仅接收提醒和严重类别的告警</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Classification <p>通知等级列表，[&quot;Remind&quot;,&quot;Serious&quot;]表示该通知模板仅接收提醒和严重类别的告警</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getClassification() {
        return this.Classification;
    }

    /**
     * Set <p>通知等级列表，[&quot;Remind&quot;,&quot;Serious&quot;]表示该通知模板仅接收提醒和严重类别的告警</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Classification <p>通知等级列表，[&quot;Remind&quot;,&quot;Serious&quot;]表示该通知模板仅接收提醒和严重类别的告警</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassification(String [] Classification) {
        this.Classification = Classification;
    }

    /**
     * Get <p>模板对应的策略id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyId <p>模板对应的策略id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>模板对应的策略id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyId <p>模板对应的策略id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    public AlarmHierarchicalNotice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmHierarchicalNotice(AlarmHierarchicalNotice source) {
        if (source.NoticeId != null) {
            this.NoticeId = new String(source.NoticeId);
        }
        if (source.Classification != null) {
            this.Classification = new String[source.Classification.length];
            for (int i = 0; i < source.Classification.length; i++) {
                this.Classification[i] = new String(source.Classification[i]);
            }
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoticeId", this.NoticeId);
        this.setParamArraySimple(map, prefix + "Classification.", this.Classification);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}

