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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Function extends AbstractModel{

    /**
    * 修改时间
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * 创建时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 运行时
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 函数ID
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 函数状态，状态值及流转[参考此处](https://cloud.tencent.com/document/product/583/47175)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 函数状态详情
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 函数描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 函数标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 函数类型，取值为 HTTP 或者 Event
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 函数状态失败原因
    */
    @SerializedName("StatusReasons")
    @Expose
    private StatusReason [] StatusReasons;

    /**
    * 函数所有版本预置并发内存总和
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalProvisionedConcurrencyMem")
    @Expose
    private Long TotalProvisionedConcurrencyMem;

    /**
    * 函数并发保留内存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReservedConcurrencyMem")
    @Expose
    private Long ReservedConcurrencyMem;

    /**
    * 函数异步属性，取值 TRUE 或者 FALSE
    */
    @SerializedName("AsyncRunEnable")
    @Expose
    private String AsyncRunEnable;

    /**
    * 异步函数是否开启调用追踪，取值 TRUE 或者 FALSE
    */
    @SerializedName("TraceEnable")
    @Expose
    private String TraceEnable;

    /**
     * Get 修改时间 
     * @return ModTime 修改时间
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set 修改时间
     * @param ModTime 修改时间
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Get 创建时间 
     * @return AddTime 创建时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 创建时间
     * @param AddTime 创建时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 运行时 
     * @return Runtime 运行时
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set 运行时
     * @param Runtime 运行时
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get 函数名称 
     * @return FunctionName 函数名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 函数名称
     * @param FunctionName 函数名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 函数ID 
     * @return FunctionId 函数ID
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set 函数ID
     * @param FunctionId 函数ID
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 函数状态，状态值及流转[参考此处](https://cloud.tencent.com/document/product/583/47175) 
     * @return Status 函数状态，状态值及流转[参考此处](https://cloud.tencent.com/document/product/583/47175)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 函数状态，状态值及流转[参考此处](https://cloud.tencent.com/document/product/583/47175)
     * @param Status 函数状态，状态值及流转[参考此处](https://cloud.tencent.com/document/product/583/47175)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 函数状态详情 
     * @return StatusDesc 函数状态详情
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 函数状态详情
     * @param StatusDesc 函数状态详情
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 函数描述 
     * @return Description 函数描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 函数描述
     * @param Description 函数描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 函数标签 
     * @return Tags 函数标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 函数标签
     * @param Tags 函数标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 函数类型，取值为 HTTP 或者 Event 
     * @return Type 函数类型，取值为 HTTP 或者 Event
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 函数类型，取值为 HTTP 或者 Event
     * @param Type 函数类型，取值为 HTTP 或者 Event
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 函数状态失败原因 
     * @return StatusReasons 函数状态失败原因
     */
    public StatusReason [] getStatusReasons() {
        return this.StatusReasons;
    }

    /**
     * Set 函数状态失败原因
     * @param StatusReasons 函数状态失败原因
     */
    public void setStatusReasons(StatusReason [] StatusReasons) {
        this.StatusReasons = StatusReasons;
    }

    /**
     * Get 函数所有版本预置并发内存总和
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalProvisionedConcurrencyMem 函数所有版本预置并发内存总和
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalProvisionedConcurrencyMem() {
        return this.TotalProvisionedConcurrencyMem;
    }

    /**
     * Set 函数所有版本预置并发内存总和
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalProvisionedConcurrencyMem 函数所有版本预置并发内存总和
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalProvisionedConcurrencyMem(Long TotalProvisionedConcurrencyMem) {
        this.TotalProvisionedConcurrencyMem = TotalProvisionedConcurrencyMem;
    }

    /**
     * Get 函数并发保留内存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReservedConcurrencyMem 函数并发保留内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReservedConcurrencyMem() {
        return this.ReservedConcurrencyMem;
    }

    /**
     * Set 函数并发保留内存
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReservedConcurrencyMem 函数并发保留内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReservedConcurrencyMem(Long ReservedConcurrencyMem) {
        this.ReservedConcurrencyMem = ReservedConcurrencyMem;
    }

    /**
     * Get 函数异步属性，取值 TRUE 或者 FALSE 
     * @return AsyncRunEnable 函数异步属性，取值 TRUE 或者 FALSE
     */
    public String getAsyncRunEnable() {
        return this.AsyncRunEnable;
    }

    /**
     * Set 函数异步属性，取值 TRUE 或者 FALSE
     * @param AsyncRunEnable 函数异步属性，取值 TRUE 或者 FALSE
     */
    public void setAsyncRunEnable(String AsyncRunEnable) {
        this.AsyncRunEnable = AsyncRunEnable;
    }

    /**
     * Get 异步函数是否开启调用追踪，取值 TRUE 或者 FALSE 
     * @return TraceEnable 异步函数是否开启调用追踪，取值 TRUE 或者 FALSE
     */
    public String getTraceEnable() {
        return this.TraceEnable;
    }

    /**
     * Set 异步函数是否开启调用追踪，取值 TRUE 或者 FALSE
     * @param TraceEnable 异步函数是否开启调用追踪，取值 TRUE 或者 FALSE
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

