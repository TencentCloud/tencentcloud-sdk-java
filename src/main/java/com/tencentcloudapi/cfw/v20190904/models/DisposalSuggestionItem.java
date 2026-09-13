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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisposalSuggestionItem extends AbstractModel {

    /**
    * 处置动作
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 处置对象
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 处置优先级
    */
    @SerializedName("Priority")
    @Expose
    private String Priority;

    /**
    * 处置建议
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
     * Get 处置动作 
     * @return Action 处置动作
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 处置动作
     * @param Action 处置动作
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 处置对象 
     * @return Target 处置对象
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 处置对象
     * @param Target 处置对象
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 处置优先级 
     * @return Priority 处置优先级
     */
    public String getPriority() {
        return this.Priority;
    }

    /**
     * Set 处置优先级
     * @param Priority 处置优先级
     */
    public void setPriority(String Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 处置建议 
     * @return Suggestion 处置建议
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 处置建议
     * @param Suggestion 处置建议
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    public DisposalSuggestionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisposalSuggestionItem(DisposalSuggestionItem source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Priority != null) {
            this.Priority = new String(source.Priority);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);

    }
}

