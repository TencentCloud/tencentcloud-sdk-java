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

public class CreatePolicyRuleRequest extends AbstractModel {

    /**
    * <p>文件系统id</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>扫描目录</p>
    */
    @SerializedName("ScanDir")
    @Expose
    private String ScanDir;

    /**
    * <p>规则名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>执行计划</p>
    */
    @SerializedName("Execution")
    @Expose
    private ExecutionPlan Execution;

    /**
    * <p>过滤规则</p>
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
    * <p>清单配置</p>
    */
    @SerializedName("Manifest")
    @Expose
    private ManifestAttr Manifest;

    /**
     * Get <p>文件系统id</p> 
     * @return FileSystemId <p>文件系统id</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统id</p>
     * @param FileSystemId <p>文件系统id</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
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
     * Get <p>过滤规则</p> 
     * @return PolicyRuleSet <p>过滤规则</p>
     */
    public PolicyRuleOperator [] getPolicyRuleSet() {
        return this.PolicyRuleSet;
    }

    /**
     * Set <p>过滤规则</p>
     * @param PolicyRuleSet <p>过滤规则</p>
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
     * Get <p>清单配置</p> 
     * @return Manifest <p>清单配置</p>
     */
    public ManifestAttr getManifest() {
        return this.Manifest;
    }

    /**
     * Set <p>清单配置</p>
     * @param Manifest <p>清单配置</p>
     */
    public void setManifest(ManifestAttr Manifest) {
        this.Manifest = Manifest;
    }

    public CreatePolicyRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePolicyRuleRequest(CreatePolicyRuleRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.ScanDir != null) {
            this.ScanDir = new String(source.ScanDir);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "ScanDir", this.ScanDir);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Execution.", this.Execution);
        this.setParamArrayObj(map, prefix + "PolicyRuleSet.", this.PolicyRuleSet);
        this.setParamSimple(map, prefix + "EnableManifest", this.EnableManifest);
        this.setParamObj(map, prefix + "Manifest.", this.Manifest);

    }
}

