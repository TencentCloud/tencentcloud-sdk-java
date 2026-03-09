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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessControlChildRuleInfo extends AbstractModel {

    /**
    * <p>策略模式,  RULE_MODE_RELEASE: 放行<br>   RULE_MODE_ALERT: 告警<br>   RULE_MODE_HOLDUP:拦截</p>
    */
    @SerializedName("RuleMode")
    @Expose
    private String RuleMode;

    /**
    * <p>进程路径</p>
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * <p>被访问文件路径，仅仅在访问控制生效</p>
    */
    @SerializedName("TargetFilePath")
    @Expose
    private String TargetFilePath;

    /**
    * <p>子策略id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>命令行参数</p>
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
     * Get <p>策略模式,  RULE_MODE_RELEASE: 放行<br>   RULE_MODE_ALERT: 告警<br>   RULE_MODE_HOLDUP:拦截</p> 
     * @return RuleMode <p>策略模式,  RULE_MODE_RELEASE: 放行<br>   RULE_MODE_ALERT: 告警<br>   RULE_MODE_HOLDUP:拦截</p>
     */
    public String getRuleMode() {
        return this.RuleMode;
    }

    /**
     * Set <p>策略模式,  RULE_MODE_RELEASE: 放行<br>   RULE_MODE_ALERT: 告警<br>   RULE_MODE_HOLDUP:拦截</p>
     * @param RuleMode <p>策略模式,  RULE_MODE_RELEASE: 放行<br>   RULE_MODE_ALERT: 告警<br>   RULE_MODE_HOLDUP:拦截</p>
     */
    public void setRuleMode(String RuleMode) {
        this.RuleMode = RuleMode;
    }

    /**
     * Get <p>进程路径</p> 
     * @return ProcessPath <p>进程路径</p>
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set <p>进程路径</p>
     * @param ProcessPath <p>进程路径</p>
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get <p>被访问文件路径，仅仅在访问控制生效</p> 
     * @return TargetFilePath <p>被访问文件路径，仅仅在访问控制生效</p>
     */
    public String getTargetFilePath() {
        return this.TargetFilePath;
    }

    /**
     * Set <p>被访问文件路径，仅仅在访问控制生效</p>
     * @param TargetFilePath <p>被访问文件路径，仅仅在访问控制生效</p>
     */
    public void setTargetFilePath(String TargetFilePath) {
        this.TargetFilePath = TargetFilePath;
    }

    /**
     * Get <p>子策略id</p> 
     * @return RuleId <p>子策略id</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>子策略id</p>
     * @param RuleId <p>子策略id</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>命令行参数</p> 
     * @return CmdLine <p>命令行参数</p>
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set <p>命令行参数</p>
     * @param CmdLine <p>命令行参数</p>
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    public AccessControlChildRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessControlChildRuleInfo(AccessControlChildRuleInfo source) {
        if (source.RuleMode != null) {
            this.RuleMode = new String(source.RuleMode);
        }
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.TargetFilePath != null) {
            this.TargetFilePath = new String(source.TargetFilePath);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.CmdLine != null) {
            this.CmdLine = new String(source.CmdLine);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleMode", this.RuleMode);
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "TargetFilePath", this.TargetFilePath);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);

    }
}

