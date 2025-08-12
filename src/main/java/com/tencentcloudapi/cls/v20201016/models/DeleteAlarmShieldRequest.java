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

public class DeleteAlarmShieldRequest extends AbstractModel {

    /**
    * 屏蔽规则id。通过[获取告警屏蔽配置规则](https://cloud.tencent.com/document/api/614/103650)获取屏蔽规则ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 通知渠道组id。通过[获取告警屏蔽配置规则](https://cloud.tencent.com/document/api/614/103650)获取通知渠道组id
    */
    @SerializedName("AlarmNoticeId")
    @Expose
    private String AlarmNoticeId;

    /**
     * Get 屏蔽规则id。通过[获取告警屏蔽配置规则](https://cloud.tencent.com/document/api/614/103650)获取屏蔽规则ID 
     * @return TaskId 屏蔽规则id。通过[获取告警屏蔽配置规则](https://cloud.tencent.com/document/api/614/103650)获取屏蔽规则ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 屏蔽规则id。通过[获取告警屏蔽配置规则](https://cloud.tencent.com/document/api/614/103650)获取屏蔽规则ID
     * @param TaskId 屏蔽规则id。通过[获取告警屏蔽配置规则](https://cloud.tencent.com/document/api/614/103650)获取屏蔽规则ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 通知渠道组id。通过[获取告警屏蔽配置规则](https://cloud.tencent.com/document/api/614/103650)获取通知渠道组id 
     * @return AlarmNoticeId 通知渠道组id。通过[获取告警屏蔽配置规则](https://cloud.tencent.com/document/api/614/103650)获取通知渠道组id
     */
    public String getAlarmNoticeId() {
        return this.AlarmNoticeId;
    }

    /**
     * Set 通知渠道组id。通过[获取告警屏蔽配置规则](https://cloud.tencent.com/document/api/614/103650)获取通知渠道组id
     * @param AlarmNoticeId 通知渠道组id。通过[获取告警屏蔽配置规则](https://cloud.tencent.com/document/api/614/103650)获取通知渠道组id
     */
    public void setAlarmNoticeId(String AlarmNoticeId) {
        this.AlarmNoticeId = AlarmNoticeId;
    }

    public DeleteAlarmShieldRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAlarmShieldRequest(DeleteAlarmShieldRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.AlarmNoticeId != null) {
            this.AlarmNoticeId = new String(source.AlarmNoticeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "AlarmNoticeId", this.AlarmNoticeId);

    }
}

