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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolicyRuleTaskAttribute extends AbstractModel {

    /**
    * <p>规则id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>规则名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>扫描目录</p>
    */
    @SerializedName("ScanDir")
    @Expose
    private String ScanDir;

    /**
    * <p>执行计划</p>
    */
    @SerializedName("Execution")
    @Expose
    private ExecutionPlan Execution;

    /**
    * <p>扫描规则</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyRuleSet")
    @Expose
    private PolicyRuleOperator [] PolicyRuleSet;

    /**
    * <p>是否输出清单</p>
    */
    @SerializedName("EnableManifest")
    @Expose
    private Boolean EnableManifest;

    /**
    * <p>输出清单配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Manifest")
    @Expose
    private ManifestAttr Manifest;

    /**
    * <p>任务状态</p><p>枚举值：</p><ul><li>0： 启用（enable）</li><li>1： 禁用（disable）</li></ul><p>默认值：0</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>修改时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get <p>规则id</p> 
     * @return RuleId <p>规则id</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则id</p>
     * @param RuleId <p>规则id</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>规则名称</p> 
     * @return Name <p>规则名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>规则名称</p>
     * @param Name <p>规则名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>扫描目录</p> 
     * @return ScanDir <p>扫描目录</p>
     */
    public String getScanDir() {
        return this.ScanDir;
    }

    /**
     * Set <p>扫描目录</p>
     * @param ScanDir <p>扫描目录</p>
     */
    public void setScanDir(String ScanDir) {
        this.ScanDir = ScanDir;
    }

    /**
     * Get <p>执行计划</p> 
     * @return Execution <p>执行计划</p>
     */
    public ExecutionPlan getExecution() {
        return this.Execution;
    }

    /**
     * Set <p>执行计划</p>
     * @param Execution <p>执行计划</p>
     */
    public void setExecution(ExecutionPlan Execution) {
        this.Execution = Execution;
    }

    /**
     * Get <p>扫描规则</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyRuleSet <p>扫描规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PolicyRuleOperator [] getPolicyRuleSet() {
        return this.PolicyRuleSet;
    }

    /**
     * Set <p>扫描规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyRuleSet <p>扫描规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyRuleSet(PolicyRuleOperator [] PolicyRuleSet) {
        this.PolicyRuleSet = PolicyRuleSet;
    }

    /**
     * Get <p>是否输出清单</p> 
     * @return EnableManifest <p>是否输出清单</p>
     */
    public Boolean getEnableManifest() {
        return this.EnableManifest;
    }

    /**
     * Set <p>是否输出清单</p>
     * @param EnableManifest <p>是否输出清单</p>
     */
    public void setEnableManifest(Boolean EnableManifest) {
        this.EnableManifest = EnableManifest;
    }

    /**
     * Get <p>输出清单配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Manifest <p>输出清单配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ManifestAttr getManifest() {
        return this.Manifest;
    }

    /**
     * Set <p>输出清单配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Manifest <p>输出清单配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManifest(ManifestAttr Manifest) {
        this.Manifest = Manifest;
    }

    /**
     * Get <p>任务状态</p><p>枚举值：</p><ul><li>0： 启用（enable）</li><li>1： 禁用（disable）</li></ul><p>默认值：0</p> 
     * @return Status <p>任务状态</p><p>枚举值：</p><ul><li>0： 启用（enable）</li><li>1： 禁用（disable）</li></ul><p>默认值：0</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p><p>枚举值：</p><ul><li>0： 启用（enable）</li><li>1： 禁用（disable）</li></ul><p>默认值：0</p>
     * @param Status <p>任务状态</p><p>枚举值：</p><ul><li>0： 启用（enable）</li><li>1： 禁用（disable）</li></ul><p>默认值：0</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>修改时间</p> 
     * @return ModifyTime <p>修改时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param ModifyTime <p>修改时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public PolicyRuleTaskAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyRuleTaskAttribute(PolicyRuleTaskAttribute source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ScanDir != null) {
            this.ScanDir = new String(source.ScanDir);
        }
        if (source.Execution != null) {
            this.Execution = new ExecutionPlan(source.Execution);
        }
        if (source.PolicyRuleSet != null) {
            this.PolicyRuleSet = new PolicyRuleOperator[source.PolicyRuleSet.length];
            for (int i = 0; i < source.PolicyRuleSet.length; i++) {
                this.PolicyRuleSet[i] = new PolicyRuleOperator(source.PolicyRuleSet[i]);
            }
        }
        if (source.EnableManifest != null) {
            this.EnableManifest = new Boolean(source.EnableManifest);
        }
        if (source.Manifest != null) {
            this.Manifest = new ManifestAttr(source.Manifest);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ScanDir", this.ScanDir);
        this.setParamObj(map, prefix + "Execution.", this.Execution);
        this.setParamArrayObj(map, prefix + "PolicyRuleSet.", this.PolicyRuleSet);
        this.setParamSimple(map, prefix + "EnableManifest", this.EnableManifest);
        this.setParamObj(map, prefix + "Manifest.", this.Manifest);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

