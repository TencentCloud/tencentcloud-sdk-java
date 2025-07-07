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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerLogResp extends AbstractModel {

    /**
    * 仓库名称
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * Tag名称
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * 触发器名称
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * 触发方式
    */
    @SerializedName("InvokeSource")
    @Expose
    private String InvokeSource;

    /**
    * 触发动作
    */
    @SerializedName("InvokeAction")
    @Expose
    private String InvokeAction;

    /**
    * 触发时间
    */
    @SerializedName("InvokeTime")
    @Expose
    private String InvokeTime;

    /**
    * 触发条件
    */
    @SerializedName("InvokeCondition")
    @Expose
    private TriggerInvokeCondition InvokeCondition;

    /**
    * 触发参数
    */
    @SerializedName("InvokePara")
    @Expose
    private TriggerInvokePara InvokePara;

    /**
    * 触发结果
    */
    @SerializedName("InvokeResult")
    @Expose
    private TriggerInvokeResult InvokeResult;

    /**
     * Get 仓库名称 
     * @return RepoName 仓库名称
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 仓库名称
     * @param RepoName 仓库名称
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get Tag名称 
     * @return TagName Tag名称
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set Tag名称
     * @param TagName Tag名称
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get 触发器名称 
     * @return TriggerName 触发器名称
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set 触发器名称
     * @param TriggerName 触发器名称
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get 触发方式 
     * @return InvokeSource 触发方式
     */
    public String getInvokeSource() {
        return this.InvokeSource;
    }

    /**
     * Set 触发方式
     * @param InvokeSource 触发方式
     */
    public void setInvokeSource(String InvokeSource) {
        this.InvokeSource = InvokeSource;
    }

    /**
     * Get 触发动作 
     * @return InvokeAction 触发动作
     */
    public String getInvokeAction() {
        return this.InvokeAction;
    }

    /**
     * Set 触发动作
     * @param InvokeAction 触发动作
     */
    public void setInvokeAction(String InvokeAction) {
        this.InvokeAction = InvokeAction;
    }

    /**
     * Get 触发时间 
     * @return InvokeTime 触发时间
     */
    public String getInvokeTime() {
        return this.InvokeTime;
    }

    /**
     * Set 触发时间
     * @param InvokeTime 触发时间
     */
    public void setInvokeTime(String InvokeTime) {
        this.InvokeTime = InvokeTime;
    }

    /**
     * Get 触发条件 
     * @return InvokeCondition 触发条件
     */
    public TriggerInvokeCondition getInvokeCondition() {
        return this.InvokeCondition;
    }

    /**
     * Set 触发条件
     * @param InvokeCondition 触发条件
     */
    public void setInvokeCondition(TriggerInvokeCondition InvokeCondition) {
        this.InvokeCondition = InvokeCondition;
    }

    /**
     * Get 触发参数 
     * @return InvokePara 触发参数
     */
    public TriggerInvokePara getInvokePara() {
        return this.InvokePara;
    }

    /**
     * Set 触发参数
     * @param InvokePara 触发参数
     */
    public void setInvokePara(TriggerInvokePara InvokePara) {
        this.InvokePara = InvokePara;
    }

    /**
     * Get 触发结果 
     * @return InvokeResult 触发结果
     */
    public TriggerInvokeResult getInvokeResult() {
        return this.InvokeResult;
    }

    /**
     * Set 触发结果
     * @param InvokeResult 触发结果
     */
    public void setInvokeResult(TriggerInvokeResult InvokeResult) {
        this.InvokeResult = InvokeResult;
    }

    public TriggerLogResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerLogResp(TriggerLogResp source) {
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
        }
        if (source.TriggerName != null) {
            this.TriggerName = new String(source.TriggerName);
        }
        if (source.InvokeSource != null) {
            this.InvokeSource = new String(source.InvokeSource);
        }
        if (source.InvokeAction != null) {
            this.InvokeAction = new String(source.InvokeAction);
        }
        if (source.InvokeTime != null) {
            this.InvokeTime = new String(source.InvokeTime);
        }
        if (source.InvokeCondition != null) {
            this.InvokeCondition = new TriggerInvokeCondition(source.InvokeCondition);
        }
        if (source.InvokePara != null) {
            this.InvokePara = new TriggerInvokePara(source.InvokePara);
        }
        if (source.InvokeResult != null) {
            this.InvokeResult = new TriggerInvokeResult(source.InvokeResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "InvokeSource", this.InvokeSource);
        this.setParamSimple(map, prefix + "InvokeAction", this.InvokeAction);
        this.setParamSimple(map, prefix + "InvokeTime", this.InvokeTime);
        this.setParamObj(map, prefix + "InvokeCondition.", this.InvokeCondition);
        this.setParamObj(map, prefix + "InvokePara.", this.InvokePara);
        this.setParamObj(map, prefix + "InvokeResult.", this.InvokeResult);

    }
}

