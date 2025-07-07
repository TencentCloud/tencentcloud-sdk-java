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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NumberInfo extends AbstractModel {

    /**
    * 号码
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 绑定的外呼技能组
    */
    @SerializedName("CallOutSkillGroupIds")
    @Expose
    private Long [] CallOutSkillGroupIds;

    /**
    * 号码状态，1-正常，2-欠费停用，4-管理员停用，5-违规停用
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
     * Get 号码 
     * @return Number 号码
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set 号码
     * @param Number 号码
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get 绑定的外呼技能组 
     * @return CallOutSkillGroupIds 绑定的外呼技能组
     */
    public Long [] getCallOutSkillGroupIds() {
        return this.CallOutSkillGroupIds;
    }

    /**
     * Set 绑定的外呼技能组
     * @param CallOutSkillGroupIds 绑定的外呼技能组
     */
    public void setCallOutSkillGroupIds(Long [] CallOutSkillGroupIds) {
        this.CallOutSkillGroupIds = CallOutSkillGroupIds;
    }

    /**
     * Get 号码状态，1-正常，2-欠费停用，4-管理员停用，5-违规停用 
     * @return State 号码状态，1-正常，2-欠费停用，4-管理员停用，5-违规停用
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 号码状态，1-正常，2-欠费停用，4-管理员停用，5-违规停用
     * @param State 号码状态，1-正常，2-欠费停用，4-管理员停用，5-违规停用
     */
    public void setState(Long State) {
        this.State = State;
    }

    public NumberInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NumberInfo(NumberInfo source) {
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.CallOutSkillGroupIds != null) {
            this.CallOutSkillGroupIds = new Long[source.CallOutSkillGroupIds.length];
            for (int i = 0; i < source.CallOutSkillGroupIds.length; i++) {
                this.CallOutSkillGroupIds[i] = new Long(source.CallOutSkillGroupIds[i]);
            }
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamArraySimple(map, prefix + "CallOutSkillGroupIds.", this.CallOutSkillGroupIds);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

