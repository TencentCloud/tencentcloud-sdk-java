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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Invocation extends AbstractModel {

    /**
    * <p>脚本执行ID。</p>
    */
    @SerializedName("InvokeId")
    @Expose
    private String InvokeId;

    /**
    * <p>运行状态。<li> Running：正在执行</li> <li>Finished：已经完成</li> <li>Failed：失败</li>  <li> Stopped：已停止</li></p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>任务输出。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Output")
    @Expose
    private InvocationOutput Output;

    /**
    * <p>任务失败时的错误码。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * <p>任务失败时的错误信息描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorInfo")
    @Expose
    private String ErrorInfo;

    /**
    * <p>任务退出状态码</p>
    */
    @SerializedName("ExitCode")
    @Expose
    private Long ExitCode;

    /**
     * Get <p>脚本执行ID。</p> 
     * @return InvokeId <p>脚本执行ID。</p>
     */
    public String getInvokeId() {
        return this.InvokeId;
    }

    /**
     * Set <p>脚本执行ID。</p>
     * @param InvokeId <p>脚本执行ID。</p>
     */
    public void setInvokeId(String InvokeId) {
        this.InvokeId = InvokeId;
    }

    /**
     * Get <p>运行状态。<li> Running：正在执行</li> <li>Finished：已经完成</li> <li>Failed：失败</li>  <li> Stopped：已停止</li></p> 
     * @return Status <p>运行状态。<li> Running：正在执行</li> <li>Finished：已经完成</li> <li>Failed：失败</li>  <li> Stopped：已停止</li></p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>运行状态。<li> Running：正在执行</li> <li>Finished：已经完成</li> <li>Failed：失败</li>  <li> Stopped：已停止</li></p>
     * @param Status <p>运行状态。<li> Running：正在执行</li> <li>Finished：已经完成</li> <li>Failed：失败</li>  <li> Stopped：已停止</li></p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>任务输出。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Output <p>任务输出。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InvocationOutput getOutput() {
        return this.Output;
    }

    /**
     * Set <p>任务输出。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Output <p>任务输出。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutput(InvocationOutput Output) {
        this.Output = Output;
    }

    /**
     * Get <p>任务失败时的错误码。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCode <p>任务失败时的错误码。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set <p>任务失败时的错误码。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCode <p>任务失败时的错误码。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get <p>任务失败时的错误信息描述。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorInfo <p>任务失败时的错误信息描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set <p>任务失败时的错误信息描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorInfo <p>任务失败时的错误信息描述。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get <p>任务退出状态码</p> 
     * @return ExitCode <p>任务退出状态码</p>
     */
    public Long getExitCode() {
        return this.ExitCode;
    }

    /**
     * Set <p>任务退出状态码</p>
     * @param ExitCode <p>任务退出状态码</p>
     */
    public void setExitCode(Long ExitCode) {
        this.ExitCode = ExitCode;
    }

    public Invocation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Invocation(Invocation source) {
        if (source.InvokeId != null) {
            this.InvokeId = new String(source.InvokeId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Output != null) {
            this.Output = new InvocationOutput(source.Output);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new String(source.ErrorInfo);
        }
        if (source.ExitCode != null) {
            this.ExitCode = new Long(source.ExitCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvokeId", this.InvokeId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorInfo", this.ErrorInfo);
        this.setParamSimple(map, prefix + "ExitCode", this.ExitCode);

    }
}

