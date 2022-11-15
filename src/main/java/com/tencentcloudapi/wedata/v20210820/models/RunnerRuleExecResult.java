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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunnerRuleExecResult extends AbstractModel{

    /**
    * rule id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * rule exec id
    */
    @SerializedName("RuleExecId")
    @Expose
    private Long RuleExecId;

    /**
    * exec state
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 结果
    */
    @SerializedName("Data")
    @Expose
    private String [] Data;

    /**
     * Get rule id 
     * @return RuleId rule id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set rule id
     * @param RuleId rule id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get rule exec id 
     * @return RuleExecId rule exec id
     */
    public Long getRuleExecId() {
        return this.RuleExecId;
    }

    /**
     * Set rule exec id
     * @param RuleExecId rule exec id
     */
    public void setRuleExecId(Long RuleExecId) {
        this.RuleExecId = RuleExecId;
    }

    /**
     * Get exec state 
     * @return State exec state
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set exec state
     * @param State exec state
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 结果 
     * @return Data 结果
     */
    public String [] getData() {
        return this.Data;
    }

    /**
     * Set 结果
     * @param Data 结果
     */
    public void setData(String [] Data) {
        this.Data = Data;
    }

    public RunnerRuleExecResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunnerRuleExecResult(RunnerRuleExecResult source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleExecId != null) {
            this.RuleExecId = new Long(source.RuleExecId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Data != null) {
            this.Data = new String[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new String(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleExecId", this.RuleExecId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArraySimple(map, prefix + "Data.", this.Data);

    }
}

