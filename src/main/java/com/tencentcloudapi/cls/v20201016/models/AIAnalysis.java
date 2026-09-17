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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIAnalysis extends AbstractModel {

    /**
    * <p>是否开启告警AI诊断</p><p>默认值：false</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>是否显示诊断过程</p><p>默认值：false</p>
    */
    @SerializedName("HideProcess")
    @Expose
    private Boolean HideProcess;

    /**
    * <p>AI诊断告警时给AI的提示词</p><p>参数格式：请详细诊断根因</p>
    */
    @SerializedName("UserPrompt")
    @Expose
    private String UserPrompt;

    /**
    * <p>AI 分析的数据范围</p>
    */
    @SerializedName("AnalysisDataScope")
    @Expose
    private AIAnalysisDataScope [] AnalysisDataScope;

    /**
     * Get <p>是否开启告警AI诊断</p><p>默认值：false</p> 
     * @return Enable <p>是否开启告警AI诊断</p><p>默认值：false</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>是否开启告警AI诊断</p><p>默认值：false</p>
     * @param Enable <p>是否开启告警AI诊断</p><p>默认值：false</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>是否显示诊断过程</p><p>默认值：false</p> 
     * @return HideProcess <p>是否显示诊断过程</p><p>默认值：false</p>
     */
    public Boolean getHideProcess() {
        return this.HideProcess;
    }

    /**
     * Set <p>是否显示诊断过程</p><p>默认值：false</p>
     * @param HideProcess <p>是否显示诊断过程</p><p>默认值：false</p>
     */
    public void setHideProcess(Boolean HideProcess) {
        this.HideProcess = HideProcess;
    }

    /**
     * Get <p>AI诊断告警时给AI的提示词</p><p>参数格式：请详细诊断根因</p> 
     * @return UserPrompt <p>AI诊断告警时给AI的提示词</p><p>参数格式：请详细诊断根因</p>
     */
    public String getUserPrompt() {
        return this.UserPrompt;
    }

    /**
     * Set <p>AI诊断告警时给AI的提示词</p><p>参数格式：请详细诊断根因</p>
     * @param UserPrompt <p>AI诊断告警时给AI的提示词</p><p>参数格式：请详细诊断根因</p>
     */
    public void setUserPrompt(String UserPrompt) {
        this.UserPrompt = UserPrompt;
    }

    /**
     * Get <p>AI 分析的数据范围</p> 
     * @return AnalysisDataScope <p>AI 分析的数据范围</p>
     */
    public AIAnalysisDataScope [] getAnalysisDataScope() {
        return this.AnalysisDataScope;
    }

    /**
     * Set <p>AI 分析的数据范围</p>
     * @param AnalysisDataScope <p>AI 分析的数据范围</p>
     */
    public void setAnalysisDataScope(AIAnalysisDataScope [] AnalysisDataScope) {
        this.AnalysisDataScope = AnalysisDataScope;
    }

    public AIAnalysis() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIAnalysis(AIAnalysis source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.HideProcess != null) {
            this.HideProcess = new Boolean(source.HideProcess);
        }
        if (source.UserPrompt != null) {
            this.UserPrompt = new String(source.UserPrompt);
        }
        if (source.AnalysisDataScope != null) {
            this.AnalysisDataScope = new AIAnalysisDataScope[source.AnalysisDataScope.length];
            for (int i = 0; i < source.AnalysisDataScope.length; i++) {
                this.AnalysisDataScope[i] = new AIAnalysisDataScope(source.AnalysisDataScope[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "HideProcess", this.HideProcess);
        this.setParamSimple(map, prefix + "UserPrompt", this.UserPrompt);
        this.setParamArrayObj(map, prefix + "AnalysisDataScope.", this.AnalysisDataScope);

    }
}

