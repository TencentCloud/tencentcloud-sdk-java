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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlertChannel extends AbstractModel{

    /**
    * 通知模板ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoticeId")
    @Expose
    private String NoticeId;

    /**
    * AMP consumer ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AMPConsumerId")
    @Expose
    private String AMPConsumerId;

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
     * Get AMP consumer ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AMPConsumerId AMP consumer ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAMPConsumerId() {
        return this.AMPConsumerId;
    }

    /**
     * Set AMP consumer ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AMPConsumerId AMP consumer ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAMPConsumerId(String AMPConsumerId) {
        this.AMPConsumerId = AMPConsumerId;
    }

    public AlertChannel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlertChannel(AlertChannel source) {
        if (source.NoticeId != null) {
            this.NoticeId = new String(source.NoticeId);
        }
        if (source.AMPConsumerId != null) {
            this.AMPConsumerId = new String(source.AMPConsumerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoticeId", this.NoticeId);
        this.setParamSimple(map, prefix + "AMPConsumerId", this.AMPConsumerId);

    }
}

