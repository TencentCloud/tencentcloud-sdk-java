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

public class DescribeAlarmNoticeOnCallUsersFromPrometheusAlertIDRequest extends AbstractModel {

    /**
    * <p>prometheus告警分组ID</p><p>参数格式：alert-xxxxxxxx</p>
    */
    @SerializedName("AlertId")
    @Expose
    private String AlertId;

    /**
     * Get <p>prometheus告警分组ID</p><p>参数格式：alert-xxxxxxxx</p> 
     * @return AlertId <p>prometheus告警分组ID</p><p>参数格式：alert-xxxxxxxx</p>
     */
    public String getAlertId() {
        return this.AlertId;
    }

    /**
     * Set <p>prometheus告警分组ID</p><p>参数格式：alert-xxxxxxxx</p>
     * @param AlertId <p>prometheus告警分组ID</p><p>参数格式：alert-xxxxxxxx</p>
     */
    public void setAlertId(String AlertId) {
        this.AlertId = AlertId;
    }

    public DescribeAlarmNoticeOnCallUsersFromPrometheusAlertIDRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmNoticeOnCallUsersFromPrometheusAlertIDRequest(DescribeAlarmNoticeOnCallUsersFromPrometheusAlertIDRequest source) {
        if (source.AlertId != null) {
            this.AlertId = new String(source.AlertId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlertId", this.AlertId);

    }
}

