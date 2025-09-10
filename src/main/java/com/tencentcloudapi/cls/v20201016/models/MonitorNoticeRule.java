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
    * 云监控通知模版ID
    */
    @SerializedName("NoticeId")
    @Expose
    private String NoticeId;

    /**
    * 云监控内容模版ID，不传默认内容模版
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContentTmplId")
    @Expose
    private String ContentTmplId;

    /**
    * 告警级别,0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)
    */
    @SerializedName("AlarmLevels")
    @Expose
    private Long [] AlarmLevels;

    /**
     * Get 云监控通知模版ID 
     * @return NoticeId 云监控通知模版ID
     */
    public String getNoticeId() {
        return this.NoticeId;
    }

    /**
     * Set 云监控通知模版ID
     * @param NoticeId 云监控通知模版ID
     */
    public void setNoticeId(String NoticeId) {
        this.NoticeId = NoticeId;
    }

    /**
     * Get 云监控内容模版ID，不传默认内容模版
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentTmplId 云监控内容模版ID，不传默认内容模版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContentTmplId() {
        return this.ContentTmplId;
    }

    /**
     * Set 云监控内容模版ID，不传默认内容模版
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentTmplId 云监控内容模版ID，不传默认内容模版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContentTmplId(String ContentTmplId) {
        this.ContentTmplId = ContentTmplId;
    }

    /**
     * Get 告警级别,0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical) 
     * @return AlarmLevels 告警级别,0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)
     */
    public Long [] getAlarmLevels() {
        return this.AlarmLevels;
    }

    /**
     * Set 告警级别,0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)
     * @param AlarmLevels 告警级别,0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)
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

