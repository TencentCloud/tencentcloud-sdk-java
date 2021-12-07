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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessControlChildRuleInfo extends AbstractModel{

    /**
    * 策略模式,  RULE_MODE_RELEASE: 放行
   RULE_MODE_ALERT: 告警
   RULE_MODE_HOLDUP:拦截
    */
    @SerializedName("RuleMode")
    @Expose
    private String RuleMode;

    /**
    * 进程路径
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * 被访问文件路径，仅仅在访问控制生效
    */
    @SerializedName("TargetFilePath")
    @Expose
    private String TargetFilePath;

    /**
    * 子策略id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get 策略模式,  RULE_MODE_RELEASE: 放行
   RULE_MODE_ALERT: 告警
   RULE_MODE_HOLDUP:拦截 
     * @return RuleMode 策略模式,  RULE_MODE_RELEASE: 放行
   RULE_MODE_ALERT: 告警
   RULE_MODE_HOLDUP:拦截
     */
    public String getRuleMode() {
        return this.RuleMode;
    }

    /**
     * Set 策略模式,  RULE_MODE_RELEASE: 放行
   RULE_MODE_ALERT: 告警
   RULE_MODE_HOLDUP:拦截
     * @param RuleMode 策略模式,  RULE_MODE_RELEASE: 放行
   RULE_MODE_ALERT: 告警
   RULE_MODE_HOLDUP:拦截
     */
    public void setRuleMode(String RuleMode) {
        this.RuleMode = RuleMode;
    }

    /**
     * Get 进程路径 
     * @return ProcessPath 进程路径
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set 进程路径
     * @param ProcessPath 进程路径
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get 被访问文件路径，仅仅在访问控制生效 
     * @return TargetFilePath 被访问文件路径，仅仅在访问控制生效
     */
    public String getTargetFilePath() {
        return this.TargetFilePath;
    }

    /**
     * Set 被访问文件路径，仅仅在访问控制生效
     * @param TargetFilePath 被访问文件路径，仅仅在访问控制生效
     */
    public void setTargetFilePath(String TargetFilePath) {
        this.TargetFilePath = TargetFilePath;
    }

    /**
     * Get 子策略id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 子策略id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 子策略id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 子策略id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleMode", this.RuleMode);
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "TargetFilePath", this.TargetFilePath);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

