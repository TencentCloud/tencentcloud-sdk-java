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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRocketMQRouterRuleRequest extends AbstractModel {

    /**
    * <p>true: 立即启动任务<br>false: 创建任务后不立即启动，可以在控制台操作启动</p>
    */
    @SerializedName("StartNow")
    @Expose
    private Boolean StartNow;

    /**
    * <p>规则数据结构</p>
    */
    @SerializedName("Rule")
    @Expose
    private RocketMQRouterRuleInfo Rule;

    /**
    * <p>数据同步类型。<br>Topic：按照topic维度同步</p>
    */
    @SerializedName("SyncType")
    @Expose
    private String SyncType;

    /**
     * Get <p>true: 立即启动任务<br>false: 创建任务后不立即启动，可以在控制台操作启动</p> 
     * @return StartNow <p>true: 立即启动任务<br>false: 创建任务后不立即启动，可以在控制台操作启动</p>
     */
    public Boolean getStartNow() {
        return this.StartNow;
    }

    /**
     * Set <p>true: 立即启动任务<br>false: 创建任务后不立即启动，可以在控制台操作启动</p>
     * @param StartNow <p>true: 立即启动任务<br>false: 创建任务后不立即启动，可以在控制台操作启动</p>
     */
    public void setStartNow(Boolean StartNow) {
        this.StartNow = StartNow;
    }

    /**
     * Get <p>规则数据结构</p> 
     * @return Rule <p>规则数据结构</p>
     */
    public RocketMQRouterRuleInfo getRule() {
        return this.Rule;
    }

    /**
     * Set <p>规则数据结构</p>
     * @param Rule <p>规则数据结构</p>
     */
    public void setRule(RocketMQRouterRuleInfo Rule) {
        this.Rule = Rule;
    }

    /**
     * Get <p>数据同步类型。<br>Topic：按照topic维度同步</p> 
     * @return SyncType <p>数据同步类型。<br>Topic：按照topic维度同步</p>
     */
    public String getSyncType() {
        return this.SyncType;
    }

    /**
     * Set <p>数据同步类型。<br>Topic：按照topic维度同步</p>
     * @param SyncType <p>数据同步类型。<br>Topic：按照topic维度同步</p>
     */
    public void setSyncType(String SyncType) {
        this.SyncType = SyncType;
    }

    public CreateRocketMQRouterRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRocketMQRouterRuleRequest(CreateRocketMQRouterRuleRequest source) {
        if (source.StartNow != null) {
            this.StartNow = new Boolean(source.StartNow);
        }
        if (source.Rule != null) {
            this.Rule = new RocketMQRouterRuleInfo(source.Rule);
        }
        if (source.SyncType != null) {
            this.SyncType = new String(source.SyncType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartNow", this.StartNow);
        this.setParamObj(map, prefix + "Rule.", this.Rule);
        this.setParamSimple(map, prefix + "SyncType", this.SyncType);

    }
}

