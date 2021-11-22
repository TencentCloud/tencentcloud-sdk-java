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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSocAlertDetailsRequest extends AbstractModel{

    /**
    * 告警id
    */
    @SerializedName("AlertId")
    @Expose
    private String AlertId;

    /**
    * 告警时间，取Timestamp字段
    */
    @SerializedName("AlertTimestamp")
    @Expose
    private String AlertTimestamp;

    /**
     * Get 告警id 
     * @return AlertId 告警id
     */
    public String getAlertId() {
        return this.AlertId;
    }

    /**
     * Set 告警id
     * @param AlertId 告警id
     */
    public void setAlertId(String AlertId) {
        this.AlertId = AlertId;
    }

    /**
     * Get 告警时间，取Timestamp字段 
     * @return AlertTimestamp 告警时间，取Timestamp字段
     */
    public String getAlertTimestamp() {
        return this.AlertTimestamp;
    }

    /**
     * Set 告警时间，取Timestamp字段
     * @param AlertTimestamp 告警时间，取Timestamp字段
     */
    public void setAlertTimestamp(String AlertTimestamp) {
        this.AlertTimestamp = AlertTimestamp;
    }

    public DescribeSocAlertDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSocAlertDetailsRequest(DescribeSocAlertDetailsRequest source) {
        if (source.AlertId != null) {
            this.AlertId = new String(source.AlertId);
        }
        if (source.AlertTimestamp != null) {
            this.AlertTimestamp = new String(source.AlertTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlertId", this.AlertId);
        this.setParamSimple(map, prefix + "AlertTimestamp", this.AlertTimestamp);

    }
}

