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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerWorkflowTaskRunDetailBrief extends AbstractModel {

    /**
    * 工作流运行信息
    */
    @SerializedName("TriggerWorkflowRun")
    @Expose
    private TriggerWorkflowRunBrief TriggerWorkflowRun;

    /**
    * 任务运行信息
    */
    @SerializedName("TriggerTaskRuns")
    @Expose
    private TriggerTaskRunBrief [] TriggerTaskRuns;

    /**
    * 业务状态枚举信息
    */
    @SerializedName("BizStateEnumInfos")
    @Expose
    private BizStateEnumInfoBrief [] BizStateEnumInfos;

    /**
     * Get 工作流运行信息 
     * @return TriggerWorkflowRun 工作流运行信息
     */
    public TriggerWorkflowRunBrief getTriggerWorkflowRun() {
        return this.TriggerWorkflowRun;
    }

    /**
     * Set 工作流运行信息
     * @param TriggerWorkflowRun 工作流运行信息
     */
    public void setTriggerWorkflowRun(TriggerWorkflowRunBrief TriggerWorkflowRun) {
        this.TriggerWorkflowRun = TriggerWorkflowRun;
    }

    /**
     * Get 任务运行信息 
     * @return TriggerTaskRuns 任务运行信息
     */
    public TriggerTaskRunBrief [] getTriggerTaskRuns() {
        return this.TriggerTaskRuns;
    }

    /**
     * Set 任务运行信息
     * @param TriggerTaskRuns 任务运行信息
     */
    public void setTriggerTaskRuns(TriggerTaskRunBrief [] TriggerTaskRuns) {
        this.TriggerTaskRuns = TriggerTaskRuns;
    }

    /**
     * Get 业务状态枚举信息 
     * @return BizStateEnumInfos 业务状态枚举信息
     */
    public BizStateEnumInfoBrief [] getBizStateEnumInfos() {
        return this.BizStateEnumInfos;
    }

    /**
     * Set 业务状态枚举信息
     * @param BizStateEnumInfos 业务状态枚举信息
     */
    public void setBizStateEnumInfos(BizStateEnumInfoBrief [] BizStateEnumInfos) {
        this.BizStateEnumInfos = BizStateEnumInfos;
    }

    public TriggerWorkflowTaskRunDetailBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerWorkflowTaskRunDetailBrief(TriggerWorkflowTaskRunDetailBrief source) {
        if (source.TriggerWorkflowRun != null) {
            this.TriggerWorkflowRun = new TriggerWorkflowRunBrief(source.TriggerWorkflowRun);
        }
        if (source.TriggerTaskRuns != null) {
            this.TriggerTaskRuns = new TriggerTaskRunBrief[source.TriggerTaskRuns.length];
            for (int i = 0; i < source.TriggerTaskRuns.length; i++) {
                this.TriggerTaskRuns[i] = new TriggerTaskRunBrief(source.TriggerTaskRuns[i]);
            }
        }
        if (source.BizStateEnumInfos != null) {
            this.BizStateEnumInfos = new BizStateEnumInfoBrief[source.BizStateEnumInfos.length];
            for (int i = 0; i < source.BizStateEnumInfos.length; i++) {
                this.BizStateEnumInfos[i] = new BizStateEnumInfoBrief(source.BizStateEnumInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TriggerWorkflowRun.", this.TriggerWorkflowRun);
        this.setParamArrayObj(map, prefix + "TriggerTaskRuns.", this.TriggerTaskRuns);
        this.setParamArrayObj(map, prefix + "BizStateEnumInfos.", this.BizStateEnumInfos);

    }
}

