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

public class DescribeTaskPredictCostQuotaRequest extends AbstractModel {

    /**
    * <p>任务模式</p>
    */
    @SerializedName("TaskMode")
    @Expose
    private Long TaskMode;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>自定义规则列表</p>
    */
    @SerializedName("RuleIDs")
    @Expose
    private String [] RuleIDs;

    /**
    * <p>规范ID</p>
    */
    @SerializedName("StandardIDs")
    @Expose
    private Long [] StandardIDs;

    /**
     * Get <p>任务模式</p> 
     * @return TaskMode <p>任务模式</p>
     */
    public Long getTaskMode() {
        return this.TaskMode;
    }

    /**
     * Set <p>任务模式</p>
     * @param TaskMode <p>任务模式</p>
     */
    public void setTaskMode(Long TaskMode) {
        this.TaskMode = TaskMode;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>自定义规则列表</p> 
     * @return RuleIDs <p>自定义规则列表</p>
     */
    public String [] getRuleIDs() {
        return this.RuleIDs;
    }

    /**
     * Set <p>自定义规则列表</p>
     * @param RuleIDs <p>自定义规则列表</p>
     */
    public void setRuleIDs(String [] RuleIDs) {
        this.RuleIDs = RuleIDs;
    }

    /**
     * Get <p>规范ID</p> 
     * @return StandardIDs <p>规范ID</p>
     */
    public Long [] getStandardIDs() {
        return this.StandardIDs;
    }

    /**
     * Set <p>规范ID</p>
     * @param StandardIDs <p>规范ID</p>
     */
    public void setStandardIDs(Long [] StandardIDs) {
        this.StandardIDs = StandardIDs;
    }

    public DescribeTaskPredictCostQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskPredictCostQuotaRequest(DescribeTaskPredictCostQuotaRequest source) {
        if (source.TaskMode != null) {
            this.TaskMode = new Long(source.TaskMode);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.RuleIDs != null) {
            this.RuleIDs = new String[source.RuleIDs.length];
            for (int i = 0; i < source.RuleIDs.length; i++) {
                this.RuleIDs[i] = new String(source.RuleIDs[i]);
            }
        }
        if (source.StandardIDs != null) {
            this.StandardIDs = new Long[source.StandardIDs.length];
            for (int i = 0; i < source.StandardIDs.length; i++) {
                this.StandardIDs[i] = new Long(source.StandardIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskMode", this.TaskMode);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "RuleIDs.", this.RuleIDs);
        this.setParamArraySimple(map, prefix + "StandardIDs.", this.StandardIDs);

    }
}

