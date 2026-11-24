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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppTriggerGongfengWebhookConfig extends AbstractModel {

    /**
    * 监听的工蜂事件标识，原值传递，1 至 20 个，如 push、merge_request。
    */
    @SerializedName("EventList")
    @Expose
    private String [] EventList;

    /**
    * 工蜂项目 ID 或项目路径，不能为空。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 分支规则列表，最多 20 个；空表示全部分支。
    */
    @SerializedName("BranchRuleList")
    @Expose
    private String [] BranchRuleList;

    /**
    * 合并请求动作标识，最多 20 个；监听 merge_request 时必填，如 open、merge。
    */
    @SerializedName("MRActionList")
    @Expose
    private String [] MRActionList;

    /**
     * Get 监听的工蜂事件标识，原值传递，1 至 20 个，如 push、merge_request。 
     * @return EventList 监听的工蜂事件标识，原值传递，1 至 20 个，如 push、merge_request。
     */
    public String [] getEventList() {
        return this.EventList;
    }

    /**
     * Set 监听的工蜂事件标识，原值传递，1 至 20 个，如 push、merge_request。
     * @param EventList 监听的工蜂事件标识，原值传递，1 至 20 个，如 push、merge_request。
     */
    public void setEventList(String [] EventList) {
        this.EventList = EventList;
    }

    /**
     * Get 工蜂项目 ID 或项目路径，不能为空。 
     * @return ProjectId 工蜂项目 ID 或项目路径，不能为空。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 工蜂项目 ID 或项目路径，不能为空。
     * @param ProjectId 工蜂项目 ID 或项目路径，不能为空。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 分支规则列表，最多 20 个；空表示全部分支。 
     * @return BranchRuleList 分支规则列表，最多 20 个；空表示全部分支。
     */
    public String [] getBranchRuleList() {
        return this.BranchRuleList;
    }

    /**
     * Set 分支规则列表，最多 20 个；空表示全部分支。
     * @param BranchRuleList 分支规则列表，最多 20 个；空表示全部分支。
     */
    public void setBranchRuleList(String [] BranchRuleList) {
        this.BranchRuleList = BranchRuleList;
    }

    /**
     * Get 合并请求动作标识，最多 20 个；监听 merge_request 时必填，如 open、merge。 
     * @return MRActionList 合并请求动作标识，最多 20 个；监听 merge_request 时必填，如 open、merge。
     */
    public String [] getMRActionList() {
        return this.MRActionList;
    }

    /**
     * Set 合并请求动作标识，最多 20 个；监听 merge_request 时必填，如 open、merge。
     * @param MRActionList 合并请求动作标识，最多 20 个；监听 merge_request 时必填，如 open、merge。
     */
    public void setMRActionList(String [] MRActionList) {
        this.MRActionList = MRActionList;
    }

    public AppTriggerGongfengWebhookConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTriggerGongfengWebhookConfig(AppTriggerGongfengWebhookConfig source) {
        if (source.EventList != null) {
            this.EventList = new String[source.EventList.length];
            for (int i = 0; i < source.EventList.length; i++) {
                this.EventList[i] = new String(source.EventList[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.BranchRuleList != null) {
            this.BranchRuleList = new String[source.BranchRuleList.length];
            for (int i = 0; i < source.BranchRuleList.length; i++) {
                this.BranchRuleList[i] = new String(source.BranchRuleList[i]);
            }
        }
        if (source.MRActionList != null) {
            this.MRActionList = new String[source.MRActionList.length];
            for (int i = 0; i < source.MRActionList.length; i++) {
                this.MRActionList[i] = new String(source.MRActionList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EventList.", this.EventList);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "BranchRuleList.", this.BranchRuleList);
        this.setParamArraySimple(map, prefix + "MRActionList.", this.MRActionList);

    }
}

