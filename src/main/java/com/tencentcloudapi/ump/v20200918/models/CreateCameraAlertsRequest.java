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
package com.tencentcloudapi.ump.v20200918.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCameraAlertsRequest extends AbstractModel{

    /**
    * 告警信息列表
    */
    @SerializedName("Alerts")
    @Expose
    private CreateCameraAlertAlert [] Alerts;

    /**
     * Get 告警信息列表 
     * @return Alerts 告警信息列表
     */
    public CreateCameraAlertAlert [] getAlerts() {
        return this.Alerts;
    }

    /**
     * Set 告警信息列表
     * @param Alerts 告警信息列表
     */
    public void setAlerts(CreateCameraAlertAlert [] Alerts) {
        this.Alerts = Alerts;
    }

    public CreateCameraAlertsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCameraAlertsRequest(CreateCameraAlertsRequest source) {
        if (source.Alerts != null) {
            this.Alerts = new CreateCameraAlertAlert[source.Alerts.length];
            for (int i = 0; i < source.Alerts.length; i++) {
                this.Alerts[i] = new CreateCameraAlertAlert(source.Alerts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Alerts.", this.Alerts);

    }
}

