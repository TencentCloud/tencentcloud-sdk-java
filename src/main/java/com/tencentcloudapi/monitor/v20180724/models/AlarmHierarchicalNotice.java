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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmHierarchicalNotice extends AbstractModel{

    /**
    * 通知模板ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoticeId")
    @Expose
    private String NoticeId;

    /**
    * 通知等级列表，["Remind","Serious"]表示该通知模板仅接收提醒和严重类别的告警
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Classification")
    @Expose
    private String [] Classification;

    /**
     * Get 通知模板ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoticeId 通知模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNoticeId() {
        return this.NoticeId;
    }

    /**
     * Set 通知模板ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoticeId 通知模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoticeId(String NoticeId) {
        this.NoticeId = NoticeId;
    }

    /**
     * Get 通知等级列表，["Remind","Serious"]表示该通知模板仅接收提醒和严重类别的告警
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Classification 通知等级列表，["Remind","Serious"]表示该通知模板仅接收提醒和严重类别的告警
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getClassification() {
        return this.Classification;
    }

    /**
     * Set 通知等级列表，["Remind","Serious"]表示该通知模板仅接收提醒和严重类别的告警
注意：此字段可能返回 null，表示取不到有效值。
     * @param Classification 通知等级列表，["Remind","Serious"]表示该通知模板仅接收提醒和严重类别的告警
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassification(String [] Classification) {
        this.Classification = Classification;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoticeId", this.NoticeId);
        this.setParamArraySimple(map, prefix + "Classification.", this.Classification);

    }
}

