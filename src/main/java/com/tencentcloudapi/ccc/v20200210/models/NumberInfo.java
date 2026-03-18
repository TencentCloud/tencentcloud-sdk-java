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
    * <p>号码</p>
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * <p>绑定的外呼技能组</p>
    */
    @SerializedName("CallOutSkillGroupIds")
    @Expose
    private Long [] CallOutSkillGroupIds;

    /**
    * <p>号码状态，1-正常，2-欠费停用，4-管理员停用，5-违规停用</p>
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * <p>是否自携号码</p><p>枚举值：</p><ul><li>0： 非自携</li><li>1： 自携</li></ul>
    */
    @SerializedName("CostType")
    @Expose
    private Long CostType;

    /**
     * Get <p>号码</p> 
     * @return Number <p>号码</p>
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set <p>号码</p>
     * @param Number <p>号码</p>
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get <p>绑定的外呼技能组</p> 
     * @return CallOutSkillGroupIds <p>绑定的外呼技能组</p>
     */
    public Long [] getCallOutSkillGroupIds() {
        return this.CallOutSkillGroupIds;
    }

    /**
     * Set <p>绑定的外呼技能组</p>
     * @param CallOutSkillGroupIds <p>绑定的外呼技能组</p>
     */
    public void setCallOutSkillGroupIds(Long [] CallOutSkillGroupIds) {
        this.CallOutSkillGroupIds = CallOutSkillGroupIds;
    }

    /**
     * Get <p>号码状态，1-正常，2-欠费停用，4-管理员停用，5-违规停用</p> 
     * @return State <p>号码状态，1-正常，2-欠费停用，4-管理员停用，5-违规停用</p>
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set <p>号码状态，1-正常，2-欠费停用，4-管理员停用，5-违规停用</p>
     * @param State <p>号码状态，1-正常，2-欠费停用，4-管理员停用，5-违规停用</p>
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get <p>是否自携号码</p><p>枚举值：</p><ul><li>0： 非自携</li><li>1： 自携</li></ul> 
     * @return CostType <p>是否自携号码</p><p>枚举值：</p><ul><li>0： 非自携</li><li>1： 自携</li></ul>
     */
    public Long getCostType() {
        return this.CostType;
    }

    /**
     * Set <p>是否自携号码</p><p>枚举值：</p><ul><li>0： 非自携</li><li>1： 自携</li></ul>
     * @param CostType <p>是否自携号码</p><p>枚举值：</p><ul><li>0： 非自携</li><li>1： 自携</li></ul>
     */
    public void setCostType(Long CostType) {
        this.CostType = CostType;
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
        if (source.CostType != null) {
            this.CostType = new Long(source.CostType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamArraySimple(map, prefix + "CallOutSkillGroupIds.", this.CallOutSkillGroupIds);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CostType", this.CostType);

    }
}

