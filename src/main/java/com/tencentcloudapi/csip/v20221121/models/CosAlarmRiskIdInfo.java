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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosAlarmRiskIdInfo extends AbstractModel {

    /**
    * 告警id
    */
    @SerializedName("AlarmRiskId")
    @Expose
    private Long AlarmRiskId;

    /**
    * 租户id
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
     * Get 告警id 
     * @return AlarmRiskId 告警id
     */
    public Long getAlarmRiskId() {
        return this.AlarmRiskId;
    }

    /**
     * Set 告警id
     * @param AlarmRiskId 告警id
     */
    public void setAlarmRiskId(Long AlarmRiskId) {
        this.AlarmRiskId = AlarmRiskId;
    }

    /**
     * Get 租户id 
     * @return AppId 租户id
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 租户id
     * @param AppId 租户id
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    public CosAlarmRiskIdInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosAlarmRiskIdInfo(CosAlarmRiskIdInfo source) {
        if (source.AlarmRiskId != null) {
            this.AlarmRiskId = new Long(source.AlarmRiskId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmRiskId", this.AlarmRiskId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

