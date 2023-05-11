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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunOption extends AbstractModel{

    /**
    * 运行失败模式，取值范围：
- ContinueWhilePossible
- NoNewCalls
    */
    @SerializedName("FailureMode")
    @Expose
    private String FailureMode;

    /**
    * 是否使用Call-Caching功能。
    */
    @SerializedName("UseCallCache")
    @Expose
    private Boolean UseCallCache;

    /**
    * 是否使用错误挂起功能。
    */
    @SerializedName("UseErrorOnHold")
    @Expose
    private Boolean UseErrorOnHold;

    /**
    * 输出归档COS路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinalWorkflowOutputsDir")
    @Expose
    private String FinalWorkflowOutputsDir;

    /**
    * 是否使用相对目录归档输出。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseRelativeOutputPaths")
    @Expose
    private Boolean UseRelativeOutputPaths;

    /**
     * Get 运行失败模式，取值范围：
- ContinueWhilePossible
- NoNewCalls 
     * @return FailureMode 运行失败模式，取值范围：
- ContinueWhilePossible
- NoNewCalls
     */
    public String getFailureMode() {
        return this.FailureMode;
    }

    /**
     * Set 运行失败模式，取值范围：
- ContinueWhilePossible
- NoNewCalls
     * @param FailureMode 运行失败模式，取值范围：
- ContinueWhilePossible
- NoNewCalls
     */
    public void setFailureMode(String FailureMode) {
        this.FailureMode = FailureMode;
    }

    /**
     * Get 是否使用Call-Caching功能。 
     * @return UseCallCache 是否使用Call-Caching功能。
     */
    public Boolean getUseCallCache() {
        return this.UseCallCache;
    }

    /**
     * Set 是否使用Call-Caching功能。
     * @param UseCallCache 是否使用Call-Caching功能。
     */
    public void setUseCallCache(Boolean UseCallCache) {
        this.UseCallCache = UseCallCache;
    }

    /**
     * Get 是否使用错误挂起功能。 
     * @return UseErrorOnHold 是否使用错误挂起功能。
     */
    public Boolean getUseErrorOnHold() {
        return this.UseErrorOnHold;
    }

    /**
     * Set 是否使用错误挂起功能。
     * @param UseErrorOnHold 是否使用错误挂起功能。
     */
    public void setUseErrorOnHold(Boolean UseErrorOnHold) {
        this.UseErrorOnHold = UseErrorOnHold;
    }

    /**
     * Get 输出归档COS路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinalWorkflowOutputsDir 输出归档COS路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinalWorkflowOutputsDir() {
        return this.FinalWorkflowOutputsDir;
    }

    /**
     * Set 输出归档COS路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinalWorkflowOutputsDir 输出归档COS路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinalWorkflowOutputsDir(String FinalWorkflowOutputsDir) {
        this.FinalWorkflowOutputsDir = FinalWorkflowOutputsDir;
    }

    /**
     * Get 是否使用相对目录归档输出。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UseRelativeOutputPaths 是否使用相对目录归档输出。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUseRelativeOutputPaths() {
        return this.UseRelativeOutputPaths;
    }

    /**
     * Set 是否使用相对目录归档输出。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseRelativeOutputPaths 是否使用相对目录归档输出。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseRelativeOutputPaths(Boolean UseRelativeOutputPaths) {
        this.UseRelativeOutputPaths = UseRelativeOutputPaths;
    }

    public RunOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunOption(RunOption source) {
        if (source.FailureMode != null) {
            this.FailureMode = new String(source.FailureMode);
        }
        if (source.UseCallCache != null) {
            this.UseCallCache = new Boolean(source.UseCallCache);
        }
        if (source.UseErrorOnHold != null) {
            this.UseErrorOnHold = new Boolean(source.UseErrorOnHold);
        }
        if (source.FinalWorkflowOutputsDir != null) {
            this.FinalWorkflowOutputsDir = new String(source.FinalWorkflowOutputsDir);
        }
        if (source.UseRelativeOutputPaths != null) {
            this.UseRelativeOutputPaths = new Boolean(source.UseRelativeOutputPaths);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FailureMode", this.FailureMode);
        this.setParamSimple(map, prefix + "UseCallCache", this.UseCallCache);
        this.setParamSimple(map, prefix + "UseErrorOnHold", this.UseErrorOnHold);
        this.setParamSimple(map, prefix + "FinalWorkflowOutputsDir", this.FinalWorkflowOutputsDir);
        this.setParamSimple(map, prefix + "UseRelativeOutputPaths", this.UseRelativeOutputPaths);

    }
}

