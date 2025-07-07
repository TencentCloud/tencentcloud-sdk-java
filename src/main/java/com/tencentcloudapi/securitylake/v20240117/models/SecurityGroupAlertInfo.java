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
package com.tencentcloudapi.securitylake.v20240117.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupAlertInfo extends AbstractModel {

    /**
    * 告警Uuid
    */
    @SerializedName("AlarmUuid")
    @Expose
    private String AlarmUuid;

    /**
    * 告警生成时间
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
     * Get 告警Uuid 
     * @return AlarmUuid 告警Uuid
     */
    public String getAlarmUuid() {
        return this.AlarmUuid;
    }

    /**
     * Set 告警Uuid
     * @param AlarmUuid 告警Uuid
     */
    public void setAlarmUuid(String AlarmUuid) {
        this.AlarmUuid = AlarmUuid;
    }

    /**
     * Get 告警生成时间 
     * @return Timestamp 告警生成时间
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 告警生成时间
     * @param Timestamp 告警生成时间
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    public SecurityGroupAlertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupAlertInfo(SecurityGroupAlertInfo source) {
        if (source.AlarmUuid != null) {
            this.AlarmUuid = new String(source.AlarmUuid);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmUuid", this.AlarmUuid);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);

    }
}

