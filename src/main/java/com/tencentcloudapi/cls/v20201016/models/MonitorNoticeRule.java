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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorNoticeRule extends AbstractModel {

    /**
    * <p>腾讯云可观测平台通知模板 ID</p>
    */
    @SerializedName("NoticeId")
    @Expose
    private String NoticeId;

    /**
    * <p>腾讯云可观测平台内容模板ID，为空时使用默认内容模板</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContentTmplId")
    @Expose
    private String ContentTmplId;

    /**
    * <p>告警级别,0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)</p>
    */
    @SerializedName("AlarmLevels")
    @Expose
    private Long [] AlarmLevels;

    /**
     * Get <p>腾讯云可观测平台通知模板 ID</p> 
     * @return NoticeId <p>腾讯云可观测平台通知模板 ID</p>
     */
    public String getNoticeId() {
        return this.NoticeId;
    }

    /**
     * Set <p>腾讯云可观测平台通知模板 ID</p>
     * @param NoticeId <p>腾讯云可观测平台通知模板 ID</p>
     */
    public void setNoticeId(String NoticeId) {
        this.NoticeId = NoticeId;
    }

    /**
     * Get <p>腾讯云可观测平台内容模板ID，为空时使用默认内容模板</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentTmplId <p>腾讯云可观测平台内容模板ID，为空时使用默认内容模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContentTmplId() {
        return this.ContentTmplId;
    }

    /**
     * Set <p>腾讯云可观测平台内容模板ID，为空时使用默认内容模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentTmplId <p>腾讯云可观测平台内容模板ID，为空时使用默认内容模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContentTmplId(String ContentTmplId) {
        this.ContentTmplId = ContentTmplId;
    }

    /**
     * Get <p>告警级别,0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)</p> 
     * @return AlarmLevels <p>告警级别,0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)</p>
     */
    public Long [] getAlarmLevels() {
        return this.AlarmLevels;
    }

    /**
     * Set <p>告警级别,0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)</p>
     * @param AlarmLevels <p>告警级别,0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)</p>
     */
    public void setAlarmLevels(Long [] AlarmLevels) {
        this.AlarmLevels = AlarmLevels;
    }

    public MonitorNoticeRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorNoticeRule(MonitorNoticeRule source) {
        if (source.NoticeId != null) {
            this.NoticeId = new String(source.NoticeId);
        }
        if (source.ContentTmplId != null) {
            this.ContentTmplId = new String(source.ContentTmplId);
        }
        if (source.AlarmLevels != null) {
            this.AlarmLevels = new Long[source.AlarmLevels.length];
            for (int i = 0; i < source.AlarmLevels.length; i++) {
                this.AlarmLevels[i] = new Long(source.AlarmLevels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoticeId", this.NoticeId);
        this.setParamSimple(map, prefix + "ContentTmplId", this.ContentTmplId);
        this.setParamArraySimple(map, prefix + "AlarmLevels.", this.AlarmLevels);

    }
}

