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

public class ModifyAlarmRiskStatusRequest extends AbstractModel {

    /**
    * 告警或者风险id
    */
    @SerializedName("AlarmRiskIdSet")
    @Expose
    private CosAlarmRiskIdInfo [] AlarmRiskIdSet;

    /**
    * 风险或告警状态  1 告警 2风险
    */
    @SerializedName("AlarmRiskType")
    @Expose
    private Long AlarmRiskType;

    /**
    * 处置状态
    */
    @SerializedName("HandleStatus")
    @Expose
    private Long HandleStatus;

    /**
     * Get 告警或者风险id 
     * @return AlarmRiskIdSet 告警或者风险id
     */
    public CosAlarmRiskIdInfo [] getAlarmRiskIdSet() {
        return this.AlarmRiskIdSet;
    }

    /**
     * Set 告警或者风险id
     * @param AlarmRiskIdSet 告警或者风险id
     */
    public void setAlarmRiskIdSet(CosAlarmRiskIdInfo [] AlarmRiskIdSet) {
        this.AlarmRiskIdSet = AlarmRiskIdSet;
    }

    /**
     * Get 风险或告警状态  1 告警 2风险 
     * @return AlarmRiskType 风险或告警状态  1 告警 2风险
     */
    public Long getAlarmRiskType() {
        return this.AlarmRiskType;
    }

    /**
     * Set 风险或告警状态  1 告警 2风险
     * @param AlarmRiskType 风险或告警状态  1 告警 2风险
     */
    public void setAlarmRiskType(Long AlarmRiskType) {
        this.AlarmRiskType = AlarmRiskType;
    }

    /**
     * Get 处置状态 
     * @return HandleStatus 处置状态
     */
    public Long getHandleStatus() {
        return this.HandleStatus;
    }

    /**
     * Set 处置状态
     * @param HandleStatus 处置状态
     */
    public void setHandleStatus(Long HandleStatus) {
        this.HandleStatus = HandleStatus;
    }

    public ModifyAlarmRiskStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmRiskStatusRequest(ModifyAlarmRiskStatusRequest source) {
        if (source.AlarmRiskIdSet != null) {
            this.AlarmRiskIdSet = new CosAlarmRiskIdInfo[source.AlarmRiskIdSet.length];
            for (int i = 0; i < source.AlarmRiskIdSet.length; i++) {
                this.AlarmRiskIdSet[i] = new CosAlarmRiskIdInfo(source.AlarmRiskIdSet[i]);
            }
        }
        if (source.AlarmRiskType != null) {
            this.AlarmRiskType = new Long(source.AlarmRiskType);
        }
        if (source.HandleStatus != null) {
            this.HandleStatus = new Long(source.HandleStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AlarmRiskIdSet.", this.AlarmRiskIdSet);
        this.setParamSimple(map, prefix + "AlarmRiskType", this.AlarmRiskType);
        this.setParamSimple(map, prefix + "HandleStatus", this.HandleStatus);

    }
}

