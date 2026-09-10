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

public class GetFunctionResponse extends AbstractModel {

    /**
    * <p>函数最后修改时间</p>
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * <p>函数代码（&gt;1M 不返回）</p>
    */
    @SerializedName("CodeInfo")
    @Expose
    private String CodeInfo;

    /**
    * <p>函数描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>触发器列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Triggers")
    @Expose
    private FunctionTrigger [] Triggers;

    /**
    * <p>入口函数</p>
    */
    @SerializedName("Handler")
    @Expose
    private String Handler;

    /**
    * <p>代码大小（字节）</p>
    */
    @SerializedName("CodeSize")
    @Expose
    private Long CodeSize;

    /**
    * <p>超时时间（秒）</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>函数版本</p>
    */
    @SerializedName("FunctionVersion")
    @Expose
    private String FunctionVersion;

    /**
    * <p>内存大小（MB）</p>
    */
    @SerializedName("MemorySize")
    @Expose
    private Long MemorySize;

    /**
    * <p>运行环境</p>
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
    * <p>VPC 配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcConfig")
    @Expose
    private FunctionVpcConfig VpcConfig;

    /**
    * <p>是否使用 GPU (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
    */
    @SerializedName("UseGpu")
    @Expose
    private String UseGpu;

    /**
    * <p>代码校验结果 (&quot;success&quot;/&quot;failed&quot;)</p>
    */
    @SerializedName("CodeResult")
    @Expose
    private String CodeResult;

    /**
    * <p>代码错误码</p>
    */
    @SerializedName("ErrNo")
    @Expose
    private Long ErrNo;

    /**
    * <p>命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>角色</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>是否自动安装依赖 (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
    */
    @SerializedName("InstallDependency")
    @Expose
    private String InstallDependency;

    /**
    * <p>函数状态 (&quot;Active&quot;, &quot;Inactive&quot; 等)</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>函数 ID</p>
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>函数类型 (&quot;HTTP&quot; 或 &quot;Event&quot;)</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>是否启用 L5 (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
    */
    @SerializedName("L5Enable")
    @Expose
    private String L5Enable;

    /**
    * <p>函数创建时间</p>
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * <p>对应scf.GetFunction接口的OnsEnable，是否启用 Ons (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
    */
    @SerializedName("OnsEnable")
    @Expose
    private String OnsEnable;

    /**
    * <p>计费状态 (&quot;Available&quot; 等)</p>
    */
    @SerializedName("AvailableStatus")
    @Expose
    private String AvailableStatus;

    /**
    * <p>函数版本（查询时传入的）</p>
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * <p>初始化超时时间（秒）</p>
    */
    @SerializedName("InitTimeout")
    @Expose
    private Long InitTimeout;

    /**
    * <p>是否开启异步 (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
    */
    @SerializedName("AsyncRunEnable")
    @Expose
    private String AsyncRunEnable;

    /**
    * <p>是否开启事件追踪 (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
    */
    @SerializedName("TraceEnable")
    @Expose
    private String TraceEnable;

    /**
    * <p>镜像配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageConfig")
    @Expose
    private AgentRuntimeCodeImageConfig ImageConfig;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>函数最后修改时间</p> 
     * @return ModTime <p>函数最后修改时间</p>
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set <p>函数最后修改时间</p>
     * @param ModTime <p>函数最后修改时间</p>
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Get <p>函数代码（&gt;1M 不返回）</p> 
     * @return CodeInfo <p>函数代码（&gt;1M 不返回）</p>
     */
    public String getCodeInfo() {
        return this.CodeInfo;
    }

    /**
     * Set <p>函数代码（&gt;1M 不返回）</p>
     * @param CodeInfo <p>函数代码（&gt;1M 不返回）</p>
     */
    public void setCodeInfo(String CodeInfo) {
        this.CodeInfo = CodeInfo;
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
     * Get <p>触发器列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Triggers <p>触发器列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FunctionTrigger [] getTriggers() {
        return this.Triggers;
    }

    /**
     * Set <p>触发器列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Triggers <p>触发器列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggers(FunctionTrigger [] Triggers) {
        this.Triggers = Triggers;
    }

    /**
     * Get <p>入口函数</p> 
     * @return Handler <p>入口函数</p>
     */
    public String getHandler() {
        return this.Handler;
    }

    /**
     * Set <p>入口函数</p>
     * @param Handler <p>入口函数</p>
     */
    public void setHandler(String Handler) {
        this.Handler = Handler;
    }

    /**
     * Get <p>代码大小（字节）</p> 
     * @return CodeSize <p>代码大小（字节）</p>
     */
    public Long getCodeSize() {
        return this.CodeSize;
    }

    /**
     * Set <p>代码大小（字节）</p>
     * @param CodeSize <p>代码大小（字节）</p>
     */
    public void setCodeSize(Long CodeSize) {
        this.CodeSize = CodeSize;
    }

    /**
     * Get <p>超时时间（秒）</p> 
     * @return Timeout <p>超时时间（秒）</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>超时时间（秒）</p>
     * @param Timeout <p>超时时间（秒）</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>函数版本</p> 
     * @return FunctionVersion <p>函数版本</p>
     */
    public String getFunctionVersion() {
        return this.FunctionVersion;
    }

    /**
     * Set <p>函数版本</p>
     * @param FunctionVersion <p>函数版本</p>
     */
    public void setFunctionVersion(String FunctionVersion) {
        this.FunctionVersion = FunctionVersion;
    }

    /**
     * Get <p>内存大小（MB）</p> 
     * @return MemorySize <p>内存大小（MB）</p>
     */
    public Long getMemorySize() {
        return this.MemorySize;
    }

    /**
     * Set <p>内存大小（MB）</p>
     * @param MemorySize <p>内存大小（MB）</p>
     */
    public void setMemorySize(Long MemorySize) {
        this.MemorySize = MemorySize;
    }

    /**
     * Get <p>运行环境</p> 
     * @return Runtime <p>运行环境</p>
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set <p>运行环境</p>
     * @param Runtime <p>运行环境</p>
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
     * Get <p>VPC 配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcConfig <p>VPC 配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FunctionVpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * Set <p>VPC 配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcConfig <p>VPC 配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcConfig(FunctionVpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
    }

    /**
     * Get <p>是否使用 GPU (&quot;TRUE&quot;/&quot;FALSE&quot;)</p> 
     * @return UseGpu <p>是否使用 GPU (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
     */
    public String getUseGpu() {
        return this.UseGpu;
    }

    /**
     * Set <p>是否使用 GPU (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
     * @param UseGpu <p>是否使用 GPU (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
     */
    public void setUseGpu(String UseGpu) {
        this.UseGpu = UseGpu;
    }

    /**
     * Get <p>代码校验结果 (&quot;success&quot;/&quot;failed&quot;)</p> 
     * @return CodeResult <p>代码校验结果 (&quot;success&quot;/&quot;failed&quot;)</p>
     */
    public String getCodeResult() {
        return this.CodeResult;
    }

    /**
     * Set <p>代码校验结果 (&quot;success&quot;/&quot;failed&quot;)</p>
     * @param CodeResult <p>代码校验结果 (&quot;success&quot;/&quot;failed&quot;)</p>
     */
    public void setCodeResult(String CodeResult) {
        this.CodeResult = CodeResult;
    }

    /**
     * Get <p>代码错误码</p> 
     * @return ErrNo <p>代码错误码</p>
     */
    public Long getErrNo() {
        return this.ErrNo;
    }

    /**
     * Set <p>代码错误码</p>
     * @param ErrNo <p>代码错误码</p>
     */
    public void setErrNo(Long ErrNo) {
        this.ErrNo = ErrNo;
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
     * Get <p>角色</p> 
     * @return Role <p>角色</p>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>角色</p>
     * @param Role <p>角色</p>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>是否自动安装依赖 (&quot;TRUE&quot;/&quot;FALSE&quot;)</p> 
     * @return InstallDependency <p>是否自动安装依赖 (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
     */
    public String getInstallDependency() {
        return this.InstallDependency;
    }

    /**
     * Set <p>是否自动安装依赖 (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
     * @param InstallDependency <p>是否自动安装依赖 (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
     */
    public void setInstallDependency(String InstallDependency) {
        this.InstallDependency = InstallDependency;
    }

    /**
     * Get <p>函数状态 (&quot;Active&quot;, &quot;Inactive&quot; 等)</p> 
     * @return Status <p>函数状态 (&quot;Active&quot;, &quot;Inactive&quot; 等)</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>函数状态 (&quot;Active&quot;, &quot;Inactive&quot; 等)</p>
     * @param Status <p>函数状态 (&quot;Active&quot;, &quot;Inactive&quot; 等)</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>函数 ID</p> 
     * @return FunctionId <p>函数 ID</p>
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set <p>函数 ID</p>
     * @param FunctionId <p>函数 ID</p>
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>函数类型 (&quot;HTTP&quot; 或 &quot;Event&quot;)</p> 
     * @return Type <p>函数类型 (&quot;HTTP&quot; 或 &quot;Event&quot;)</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>函数类型 (&quot;HTTP&quot; 或 &quot;Event&quot;)</p>
     * @param Type <p>函数类型 (&quot;HTTP&quot; 或 &quot;Event&quot;)</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>是否启用 L5 (&quot;TRUE&quot;/&quot;FALSE&quot;)</p> 
     * @return L5Enable <p>是否启用 L5 (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
     */
    public String getL5Enable() {
        return this.L5Enable;
    }

    /**
     * Set <p>是否启用 L5 (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
     * @param L5Enable <p>是否启用 L5 (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
     */
    public void setL5Enable(String L5Enable) {
        this.L5Enable = L5Enable;
    }

    /**
     * Get <p>函数创建时间</p> 
     * @return AddTime <p>函数创建时间</p>
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set <p>函数创建时间</p>
     * @param AddTime <p>函数创建时间</p>
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get <p>对应scf.GetFunction接口的OnsEnable，是否启用 Ons (&quot;TRUE&quot;/&quot;FALSE&quot;)</p> 
     * @return OnsEnable <p>对应scf.GetFunction接口的OnsEnable，是否启用 Ons (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
     */
    public String getOnsEnable() {
        return this.OnsEnable;
    }

    /**
     * Set <p>对应scf.GetFunction接口的OnsEnable，是否启用 Ons (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
     * @param OnsEnable <p>对应scf.GetFunction接口的OnsEnable，是否启用 Ons (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
     */
    public void setOnsEnable(String OnsEnable) {
        this.OnsEnable = OnsEnable;
    }

    /**
     * Get <p>计费状态 (&quot;Available&quot; 等)</p> 
     * @return AvailableStatus <p>计费状态 (&quot;Available&quot; 等)</p>
     */
    public String getAvailableStatus() {
        return this.AvailableStatus;
    }

    /**
     * Set <p>计费状态 (&quot;Available&quot; 等)</p>
     * @param AvailableStatus <p>计费状态 (&quot;Available&quot; 等)</p>
     */
    public void setAvailableStatus(String AvailableStatus) {
        this.AvailableStatus = AvailableStatus;
    }

    /**
     * Get <p>函数版本（查询时传入的）</p> 
     * @return Qualifier <p>函数版本（查询时传入的）</p>
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set <p>函数版本（查询时传入的）</p>
     * @param Qualifier <p>函数版本（查询时传入的）</p>
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get <p>初始化超时时间（秒）</p> 
     * @return InitTimeout <p>初始化超时时间（秒）</p>
     */
    public Long getInitTimeout() {
        return this.InitTimeout;
    }

    /**
     * Set <p>初始化超时时间（秒）</p>
     * @param InitTimeout <p>初始化超时时间（秒）</p>
     */
    public void setInitTimeout(Long InitTimeout) {
        this.InitTimeout = InitTimeout;
    }

    /**
     * Get <p>是否开启异步 (&quot;TRUE&quot;/&quot;FALSE&quot;)</p> 
     * @return AsyncRunEnable <p>是否开启异步 (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
     */
    public String getAsyncRunEnable() {
        return this.AsyncRunEnable;
    }

    /**
     * Set <p>是否开启异步 (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
     * @param AsyncRunEnable <p>是否开启异步 (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
     */
    public void setAsyncRunEnable(String AsyncRunEnable) {
        this.AsyncRunEnable = AsyncRunEnable;
    }

    /**
     * Get <p>是否开启事件追踪 (&quot;TRUE&quot;/&quot;FALSE&quot;)</p> 
     * @return TraceEnable <p>是否开启事件追踪 (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
     */
    public String getTraceEnable() {
        return this.TraceEnable;
    }

    /**
     * Set <p>是否开启事件追踪 (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
     * @param TraceEnable <p>是否开启事件追踪 (&quot;TRUE&quot;/&quot;FALSE&quot;)</p>
     */
    public void setTraceEnable(String TraceEnable) {
        this.TraceEnable = TraceEnable;
    }

    /**
     * Get <p>镜像配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageConfig <p>镜像配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentRuntimeCodeImageConfig getImageConfig() {
        return this.ImageConfig;
    }

    /**
     * Set <p>镜像配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageConfig <p>镜像配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageConfig(AgentRuntimeCodeImageConfig ImageConfig) {
        this.ImageConfig = ImageConfig;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetFunctionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFunctionResponse(GetFunctionResponse source) {
        if (source.ModTime != null) {
            this.ModTime = new String(source.ModTime);
        }
        if (source.CodeInfo != null) {
            this.CodeInfo = new String(source.CodeInfo);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Triggers != null) {
            this.Triggers = new FunctionTrigger[source.Triggers.length];
            for (int i = 0; i < source.Triggers.length; i++) {
                this.Triggers[i] = new FunctionTrigger(source.Triggers[i]);
            }
        }
        if (source.Handler != null) {
            this.Handler = new String(source.Handler);
        }
        if (source.CodeSize != null) {
            this.CodeSize = new Long(source.CodeSize);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.FunctionVersion != null) {
            this.FunctionVersion = new String(source.FunctionVersion);
        }
        if (source.MemorySize != null) {
            this.MemorySize = new Long(source.MemorySize);
        }
        if (source.Runtime != null) {
            this.Runtime = new String(source.Runtime);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.VpcConfig != null) {
            this.VpcConfig = new FunctionVpcConfig(source.VpcConfig);
        }
        if (source.UseGpu != null) {
            this.UseGpu = new String(source.UseGpu);
        }
        if (source.CodeResult != null) {
            this.CodeResult = new String(source.CodeResult);
        }
        if (source.ErrNo != null) {
            this.ErrNo = new Long(source.ErrNo);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.InstallDependency != null) {
            this.InstallDependency = new String(source.InstallDependency);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
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
        if (source.L5Enable != null) {
            this.L5Enable = new String(source.L5Enable);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.OnsEnable != null) {
            this.OnsEnable = new String(source.OnsEnable);
        }
        if (source.AvailableStatus != null) {
            this.AvailableStatus = new String(source.AvailableStatus);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.InitTimeout != null) {
            this.InitTimeout = new Long(source.InitTimeout);
        }
        if (source.AsyncRunEnable != null) {
            this.AsyncRunEnable = new String(source.AsyncRunEnable);
        }
        if (source.TraceEnable != null) {
            this.TraceEnable = new String(source.TraceEnable);
        }
        if (source.ImageConfig != null) {
            this.ImageConfig = new AgentRuntimeCodeImageConfig(source.ImageConfig);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "CodeInfo", this.CodeInfo);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Triggers.", this.Triggers);
        this.setParamSimple(map, prefix + "Handler", this.Handler);
        this.setParamSimple(map, prefix + "CodeSize", this.CodeSize);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "FunctionVersion", this.FunctionVersion);
        this.setParamSimple(map, prefix + "MemorySize", this.MemorySize);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamObj(map, prefix + "VpcConfig.", this.VpcConfig);
        this.setParamSimple(map, prefix + "UseGpu", this.UseGpu);
        this.setParamSimple(map, prefix + "CodeResult", this.CodeResult);
        this.setParamSimple(map, prefix + "ErrNo", this.ErrNo);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "InstallDependency", this.InstallDependency);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "L5Enable", this.L5Enable);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "OnsEnable", this.OnsEnable);
        this.setParamSimple(map, prefix + "AvailableStatus", this.AvailableStatus);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "InitTimeout", this.InitTimeout);
        this.setParamSimple(map, prefix + "AsyncRunEnable", this.AsyncRunEnable);
        this.setParamSimple(map, prefix + "TraceEnable", this.TraceEnable);
        this.setParamObj(map, prefix + "ImageConfig.", this.ImageConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

