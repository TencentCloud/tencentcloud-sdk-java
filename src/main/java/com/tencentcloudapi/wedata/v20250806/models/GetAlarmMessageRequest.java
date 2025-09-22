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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAlarmMessageRequest extends AbstractModel {

    /**
    * 所属项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 告警消息Id
    */
    @SerializedName("AlarmMessageId")
    @Expose
    private String AlarmMessageId;

    /**
    * 返回日期的时区, 默认UTC+8
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get 所属项目Id 
     * @return ProjectId 所属项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 所属项目Id
     * @param ProjectId 所属项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 告警消息Id 
     * @return AlarmMessageId 告警消息Id
     */
    public String getAlarmMessageId() {
        return this.AlarmMessageId;
    }

    /**
     * Set 告警消息Id
     * @param AlarmMessageId 告警消息Id
     */
    public void setAlarmMessageId(String AlarmMessageId) {
        this.AlarmMessageId = AlarmMessageId;
    }

    /**
     * Get 返回日期的时区, 默认UTC+8 
     * @return TimeZone 返回日期的时区, 默认UTC+8
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 返回日期的时区, 默认UTC+8
     * @param TimeZone 返回日期的时区, 默认UTC+8
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public GetAlarmMessageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAlarmMessageRequest(GetAlarmMessageRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AlarmMessageId != null) {
            this.AlarmMessageId = new String(source.AlarmMessageId);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AlarmMessageId", this.AlarmMessageId);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

