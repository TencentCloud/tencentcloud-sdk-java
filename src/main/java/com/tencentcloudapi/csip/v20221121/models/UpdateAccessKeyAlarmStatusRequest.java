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

public class UpdateAccessKeyAlarmStatusRequest extends AbstractModel {

    /**
    * 状态  0:未处理 1:已处理 2:已忽略
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 告警ID列表
    */
    @SerializedName("AlarmIDList")
    @Expose
    private Long [] AlarmIDList;

    /**
    * 风险ID列表
    */
    @SerializedName("RiskIDList")
    @Expose
    private Long [] RiskIDList;

    /**
     * Get 状态  0:未处理 1:已处理 2:已忽略 
     * @return Status 状态  0:未处理 1:已处理 2:已忽略
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态  0:未处理 1:已处理 2:已忽略
     * @param Status 状态  0:未处理 1:已处理 2:已忽略
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 告警ID列表 
     * @return AlarmIDList 告警ID列表
     */
    public Long [] getAlarmIDList() {
        return this.AlarmIDList;
    }

    /**
     * Set 告警ID列表
     * @param AlarmIDList 告警ID列表
     */
    public void setAlarmIDList(Long [] AlarmIDList) {
        this.AlarmIDList = AlarmIDList;
    }

    /**
     * Get 风险ID列表 
     * @return RiskIDList 风险ID列表
     */
    public Long [] getRiskIDList() {
        return this.RiskIDList;
    }

    /**
     * Set 风险ID列表
     * @param RiskIDList 风险ID列表
     */
    public void setRiskIDList(Long [] RiskIDList) {
        this.RiskIDList = RiskIDList;
    }

    public UpdateAccessKeyAlarmStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAccessKeyAlarmStatusRequest(UpdateAccessKeyAlarmStatusRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.AlarmIDList != null) {
            this.AlarmIDList = new Long[source.AlarmIDList.length];
            for (int i = 0; i < source.AlarmIDList.length; i++) {
                this.AlarmIDList[i] = new Long(source.AlarmIDList[i]);
            }
        }
        if (source.RiskIDList != null) {
            this.RiskIDList = new Long[source.RiskIDList.length];
            for (int i = 0; i < source.RiskIDList.length; i++) {
                this.RiskIDList[i] = new Long(source.RiskIDList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "AlarmIDList.", this.AlarmIDList);
        this.setParamArraySimple(map, prefix + "RiskIDList.", this.RiskIDList);

    }
}

