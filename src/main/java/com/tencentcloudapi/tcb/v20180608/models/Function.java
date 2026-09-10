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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Function extends AbstractModel {

    /**
    * <p>修改时间</p>
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * <p>运行时</p>
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * <p>函数名称</p>
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * <p>函数ID</p>
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * <p>命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>函数状态，状态值</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>函数状态详情</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>函数描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>函数标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>函数类型，取值为 HTTP 或者 Event</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>函数状态失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusReasons")
    @Expose
    private StatusReason [] StatusReasons;

    /**
    * <p>函数所有版本预置并发内存总和</p>
    */
    @SerializedName("TotalProvisionedConcurrencyMem")
    @Expose
    private Long TotalProvisionedConcurrencyMem;

    /**
    * <p>函数并发保留内存</p>
    */
    @SerializedName("ReservedConcurrencyMem")
    @Expose
    private Long ReservedConcurrencyMem;

    /**
    * <p>函数异步属性，取值 TRUE 或者 FALSE</p>
    */
    @SerializedName("AsyncRunEnable")
    @Expose
    private String AsyncRunEnable;

    /**
    * <p>异步函数是否开启调用追踪，取值 TRUE 或者 FALSE</p>
    */
    @SerializedName("TraceEnable")
    @Expose
    private String TraceEnable;

    /**
     * Get <p>修改时间</p> 
     * @return ModTime <p>修改时间</p>
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param ModTime <p>修改时间</p>
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Get <p>创建时间</p> 
     * @return AddTime <p>创建时间</p>
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param AddTime <p>创建时间</p>
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get <p>运行时</p> 
     * @return Runtime <p>运行时</p>
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set <p>运行时</p>
     * @param Runtime <p>运行时</p>
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get <p>函数名称</p> 
     * @return FunctionName <p>函数名称</p>
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set <p>函数名称</p>
     * @param FunctionName <p>函数名称</p>
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get <p>函数ID</p> 
     * @return FunctionId <p>函数ID</p>
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set <p>函数ID</p>
     * @param FunctionId <p>函数ID</p>
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get <p>命名空间</p> 
     * @return Namespace <p>命名空间</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>命名空间</p>
     * @param Namespace <p>命名空间</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>函数状态，状态值</p> 
     * @return Status <p>函数状态，状态值</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>函数状态，状态值</p>
     * @param Status <p>函数状态，状态值</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>函数状态详情</p> 
     * @return StatusDesc <p>函数状态详情</p>
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>函数状态详情</p>
     * @param StatusDesc <p>函数状态详情</p>
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>函数描述</p> 
     * @return Description <p>函数描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>函数描述</p>
     * @param Description <p>函数描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>函数标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>函数标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>函数标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>函数标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>函数类型，取值为 HTTP 或者 Event</p> 
     * @return Type <p>函数类型，取值为 HTTP 或者 Event</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>函数类型，取值为 HTTP 或者 Event</p>
     * @param Type <p>函数类型，取值为 HTTP 或者 Event</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>函数状态失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusReasons <p>函数状态失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StatusReason [] getStatusReasons() {
        return this.StatusReasons;
    }

    /**
     * Set <p>函数状态失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusReasons <p>函数状态失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusReasons(StatusReason [] StatusReasons) {
        this.StatusReasons = StatusReasons;
    }

    /**
     * Get <p>函数所有版本预置并发内存总和</p> 
     * @return TotalProvisionedConcurrencyMem <p>函数所有版本预置并发内存总和</p>
     */
    public Long getTotalProvisionedConcurrencyMem() {
        return this.TotalProvisionedConcurrencyMem;
    }

    /**
     * Set <p>函数所有版本预置并发内存总和</p>
     * @param TotalProvisionedConcurrencyMem <p>函数所有版本预置并发内存总和</p>
     */
    public void setTotalProvisionedConcurrencyMem(Long TotalProvisionedConcurrencyMem) {
        this.TotalProvisionedConcurrencyMem = TotalProvisionedConcurrencyMem;
    }

    /**
     * Get <p>函数并发保留内存</p> 
     * @return ReservedConcurrencyMem <p>函数并发保留内存</p>
     */
    public Long getReservedConcurrencyMem() {
        return this.ReservedConcurrencyMem;
    }

    /**
     * Set <p>函数并发保留内存</p>
     * @param ReservedConcurrencyMem <p>函数并发保留内存</p>
     */
    public void setReservedConcurrencyMem(Long ReservedConcurrencyMem) {
        this.ReservedConcurrencyMem = ReservedConcurrencyMem;
    }

    /**
     * Get <p>函数异步属性，取值 TRUE 或者 FALSE</p> 
     * @return AsyncRunEnable <p>函数异步属性，取值 TRUE 或者 FALSE</p>
     */
    public String getAsyncRunEnable() {
        return this.AsyncRunEnable;
    }

    /**
     * Set <p>函数异步属性，取值 TRUE 或者 FALSE</p>
     * @param AsyncRunEnable <p>函数异步属性，取值 TRUE 或者 FALSE</p>
     */
    public void setAsyncRunEnable(String AsyncRunEnable) {
        this.AsyncRunEnable = AsyncRunEnable;
    }

    /**
     * Get <p>异步函数是否开启调用追踪，取值 TRUE 或者 FALSE</p> 
     * @return TraceEnable <p>异步函数是否开启调用追踪，取值 TRUE 或者 FALSE</p>
     */
    public String getTraceEnable() {
        return this.TraceEnable;
    }

    /**
     * Set <p>异步函数是否开启调用追踪，取值 TRUE 或者 FALSE</p>
     * @param TraceEnable <p>异步函数是否开启调用追踪，取值 TRUE 或者 FALSE</p>
     */
    public void setTraceEnable(String TraceEnable) {
        this.TraceEnable = TraceEnable;
    }

    public Function() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Function(Function source) {
        if (source.ModTime != null) {
            this.ModTime = new String(source.ModTime);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.Runtime != null) {
            this.Runtime = new String(source.Runtime);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.StatusReasons != null) {
            this.StatusReasons = new StatusReason[source.StatusReasons.length];
            for (int i = 0; i < source.StatusReasons.length; i++) {
                this.StatusReasons[i] = new StatusReason(source.StatusReasons[i]);
            }
        }
        if (source.TotalProvisionedConcurrencyMem != null) {
            this.TotalProvisionedConcurrencyMem = new Long(source.TotalProvisionedConcurrencyMem);
        }
        if (source.ReservedConcurrencyMem != null) {
            this.ReservedConcurrencyMem = new Long(source.ReservedConcurrencyMem);
        }
        if (source.AsyncRunEnable != null) {
            this.AsyncRunEnable = new String(source.AsyncRunEnable);
        }
        if (source.TraceEnable != null) {
            this.TraceEnable = new String(source.TraceEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "StatusReasons.", this.StatusReasons);
        this.setParamSimple(map, prefix + "TotalProvisionedConcurrencyMem", this.TotalProvisionedConcurrencyMem);
        this.setParamSimple(map, prefix + "ReservedConcurrencyMem", this.ReservedConcurrencyMem);
        this.setParamSimple(map, prefix + "AsyncRunEnable", this.AsyncRunEnable);
        this.setParamSimple(map, prefix + "TraceEnable", this.TraceEnable);

    }
}

