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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerLogResp extends AbstractModel{

    /**
    * 仓库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * Tag名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * 触发器名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * 触发方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvokeSource")
    @Expose
    private String InvokeSource;

    /**
    * 触发动作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvokeAction")
    @Expose
    private String InvokeAction;

    /**
    * 触发时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvokeTime")
    @Expose
    private String InvokeTime;

    /**
    * 触发条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvokeCondition")
    @Expose
    private TriggerInvokeCondition InvokeCondition;

    /**
    * 触发参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvokePara")
    @Expose
    private TriggerInvokePara InvokePara;

    /**
    * 触发结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvokeResult")
    @Expose
    private TriggerInvokeResult InvokeResult;

    /**
     * Get 仓库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoName 仓库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 仓库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoName 仓库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get Tag名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagName Tag名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set Tag名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagName Tag名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get 触发器名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerName 触发器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set 触发器名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerName 触发器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get 触发方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvokeSource 触发方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInvokeSource() {
        return this.InvokeSource;
    }

    /**
     * Set 触发方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvokeSource 触发方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvokeSource(String InvokeSource) {
        this.InvokeSource = InvokeSource;
    }

    /**
     * Get 触发动作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvokeAction 触发动作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInvokeAction() {
        return this.InvokeAction;
    }

    /**
     * Set 触发动作
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvokeAction 触发动作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvokeAction(String InvokeAction) {
        this.InvokeAction = InvokeAction;
    }

    /**
     * Get 触发时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvokeTime 触发时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInvokeTime() {
        return this.InvokeTime;
    }

    /**
     * Set 触发时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvokeTime 触发时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvokeTime(String InvokeTime) {
        this.InvokeTime = InvokeTime;
    }

    /**
     * Get 触发条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvokeCondition 触发条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TriggerInvokeCondition getInvokeCondition() {
        return this.InvokeCondition;
    }

    /**
     * Set 触发条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvokeCondition 触发条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvokeCondition(TriggerInvokeCondition InvokeCondition) {
        this.InvokeCondition = InvokeCondition;
    }

    /**
     * Get 触发参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvokePara 触发参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TriggerInvokePara getInvokePara() {
        return this.InvokePara;
    }

    /**
     * Set 触发参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvokePara 触发参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvokePara(TriggerInvokePara InvokePara) {
        this.InvokePara = InvokePara;
    }

    /**
     * Get 触发结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvokeResult 触发结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TriggerInvokeResult getInvokeResult() {
        return this.InvokeResult;
    }

    /**
     * Set 触发结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvokeResult 触发结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvokeResult(TriggerInvokeResult InvokeResult) {
        this.InvokeResult = InvokeResult;
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

