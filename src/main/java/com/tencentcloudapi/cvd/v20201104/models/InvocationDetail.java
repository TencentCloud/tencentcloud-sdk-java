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

public class InvocationDetail extends AbstractModel {

    /**
    * 实例 id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例所在区域，目前支持的区域有：ap-beijing、ap-shanghai、ap-guangzhou、ap-shanghai-adc
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 脚本任务执行状态，取值有：
Running-执行中
Finished-完成
Failed-失败
Stopped-终止
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例上任务唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvokeId")
    @Expose
    private String InvokeId;

    /**
    * 脚本任务输出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * 任务退出码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExitCode")
    @Expose
    private Long ExitCode;

    /**
    * 任务错误码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * 执行任务错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorInfo")
    @Expose
    private String ErrorInfo;

    /**
     * Get 实例 id 
     * @return InstanceId 实例 id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 id
     * @param InstanceId 实例 id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例所在区域，目前支持的区域有：ap-beijing、ap-shanghai、ap-guangzhou、ap-shanghai-adc 
     * @return Region 实例所在区域，目前支持的区域有：ap-beijing、ap-shanghai、ap-guangzhou、ap-shanghai-adc
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所在区域，目前支持的区域有：ap-beijing、ap-shanghai、ap-guangzhou、ap-shanghai-adc
     * @param Region 实例所在区域，目前支持的区域有：ap-beijing、ap-shanghai、ap-guangzhou、ap-shanghai-adc
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 脚本任务执行状态，取值有：
Running-执行中
Finished-完成
Failed-失败
Stopped-终止
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 脚本任务执行状态，取值有：
Running-执行中
Finished-完成
Failed-失败
Stopped-终止
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 脚本任务执行状态，取值有：
Running-执行中
Finished-完成
Failed-失败
Stopped-终止
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 脚本任务执行状态，取值有：
Running-执行中
Finished-完成
Failed-失败
Stopped-终止
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例上任务唯一 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvokeId 实例上任务唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInvokeId() {
        return this.InvokeId;
    }

    /**
     * Set 实例上任务唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvokeId 实例上任务唯一 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvokeId(String InvokeId) {
        this.InvokeId = InvokeId;
    }

    /**
     * Get 脚本任务输出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Output 脚本任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set 脚本任务输出
注意：此字段可能返回 null，表示取不到有效值。
     * @param Output 脚本任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get 任务退出码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExitCode 任务退出码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExitCode() {
        return this.ExitCode;
    }

    /**
     * Set 任务退出码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExitCode 任务退出码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExitCode(Long ExitCode) {
        this.ExitCode = ExitCode;
    }

    /**
     * Get 任务错误码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCode 任务错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 任务错误码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCode 任务错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 执行任务错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorInfo 执行任务错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set 执行任务错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorInfo 执行任务错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    public InvocationDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvocationDetail(InvocationDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InvokeId != null) {
            this.InvokeId = new String(source.InvokeId);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.ExitCode != null) {
            this.ExitCode = new Long(source.ExitCode);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new String(source.ErrorInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InvokeId", this.InvokeId);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "ExitCode", this.ExitCode);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorInfo", this.ErrorInfo);

    }
}

