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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunRerunScheduleInstancesRequest extends AbstractModel {

    /**
    * 实例列表
    */
    @SerializedName("Instances")
    @Expose
    private InstanceOpsDto [] Instances;

    /**
    * 检查父任务类型, true: 检查父任务; false: 不检查父任务 
    */
    @SerializedName("CheckFather")
    @Expose
    private Boolean CheckFather;

    /**
    * 重跑类型, 1: 自身; 3: 孩子; 2: 自身以及孩子 
    */
    @SerializedName("RerunType")
    @Expose
    private String RerunType;

    /**
    * 实例依赖方式, 1: 自依赖; 2: 任务依赖; 3: 自依赖及父子依赖 
    */
    @SerializedName("DependentWay")
    @Expose
    private String DependentWay;

    /**
    * 重跑忽略事件监听与否 
    */
    @SerializedName("SkipEventListening")
    @Expose
    private Boolean SkipEventListening;

    /**
    * 下游实例范围 1: 所在工作流 2: 所在项目 3: 所有跨工作流依赖的项目
    */
    @SerializedName("SonInstanceType")
    @Expose
    private String SonInstanceType;

    /**
    * 查询条件
    */
    @SerializedName("SearchCondition")
    @Expose
    private InstanceApiOpsRequest SearchCondition;

    /**
    * 访问类型
    */
    @SerializedName("OptType")
    @Expose
    private String OptType;

    /**
    * 操作者名称
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
    * 操作者id
    */
    @SerializedName("OperatorId")
    @Expose
    private String OperatorId;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目标志
    */
    @SerializedName("ProjectIdent")
    @Expose
    private String ProjectIdent;

    /**
    * 项目名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 索引页码
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 页面大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 数据总数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 基础请求信息
    */
    @SerializedName("RequestBaseInfo")
    @Expose
    private ProjectBaseInfoOpsRequest RequestBaseInfo;

    /**
    * 是否计算总数
    */
    @SerializedName("IsCount")
    @Expose
    private Boolean IsCount;

    /**
    * 是否异步模式
    */
    @SerializedName("AsyncMode")
    @Expose
    private Boolean AsyncMode;

    /**
    * 是否检查上游任务： ALL（全部）、 MAKE_SCOPE（选中）、NONE （全部不检查）
    */
    @SerializedName("CheckParentType")
    @Expose
    private String CheckParentType;

    /**
    * 任务原有自依赖配置 true（是）、false（否）
    */
    @SerializedName("SameSelfDependType")
    @Expose
    private Boolean SameSelfDependType;

    /**
    * 实例运行并发度
    */
    @SerializedName("ParallelNum")
    @Expose
    private Long ParallelNum;

    /**
    * 任务原有自依赖配置 true（是）、false（否）
    */
    @SerializedName("SameSelfWorkflowDependType")
    @Expose
    private Boolean SameSelfWorkflowDependType;

    /**
    * 代表重新指定 的  是 或者 否  yes、 no
    */
    @SerializedName("SelfWorkflowDependency")
    @Expose
    private String SelfWorkflowDependency;

    /**
    * 运行实例数据时间排序 0---正常  1--正序  2 – 逆序
    */
    @SerializedName("DataTimeOrder")
    @Expose
    private Long DataTimeOrder;

    /**
    * 重跑参数
    */
    @SerializedName("ReDoParams")
    @Expose
    private String ReDoParams;

    /**
     * Get 实例列表 
     * @return Instances 实例列表
     */
    public InstanceOpsDto [] getInstances() {
        return this.Instances;
    }

    /**
     * Set 实例列表
     * @param Instances 实例列表
     */
    public void setInstances(InstanceOpsDto [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Get 检查父任务类型, true: 检查父任务; false: 不检查父任务  
     * @return CheckFather 检查父任务类型, true: 检查父任务; false: 不检查父任务 
     */
    public Boolean getCheckFather() {
        return this.CheckFather;
    }

    /**
     * Set 检查父任务类型, true: 检查父任务; false: 不检查父任务 
     * @param CheckFather 检查父任务类型, true: 检查父任务; false: 不检查父任务 
     */
    public void setCheckFather(Boolean CheckFather) {
        this.CheckFather = CheckFather;
    }

    /**
     * Get 重跑类型, 1: 自身; 3: 孩子; 2: 自身以及孩子  
     * @return RerunType 重跑类型, 1: 自身; 3: 孩子; 2: 自身以及孩子 
     */
    public String getRerunType() {
        return this.RerunType;
    }

    /**
     * Set 重跑类型, 1: 自身; 3: 孩子; 2: 自身以及孩子 
     * @param RerunType 重跑类型, 1: 自身; 3: 孩子; 2: 自身以及孩子 
     */
    public void setRerunType(String RerunType) {
        this.RerunType = RerunType;
    }

    /**
     * Get 实例依赖方式, 1: 自依赖; 2: 任务依赖; 3: 自依赖及父子依赖  
     * @return DependentWay 实例依赖方式, 1: 自依赖; 2: 任务依赖; 3: 自依赖及父子依赖 
     */
    public String getDependentWay() {
        return this.DependentWay;
    }

    /**
     * Set 实例依赖方式, 1: 自依赖; 2: 任务依赖; 3: 自依赖及父子依赖 
     * @param DependentWay 实例依赖方式, 1: 自依赖; 2: 任务依赖; 3: 自依赖及父子依赖 
     */
    public void setDependentWay(String DependentWay) {
        this.DependentWay = DependentWay;
    }

    /**
     * Get 重跑忽略事件监听与否  
     * @return SkipEventListening 重跑忽略事件监听与否 
     */
    public Boolean getSkipEventListening() {
        return this.SkipEventListening;
    }

    /**
     * Set 重跑忽略事件监听与否 
     * @param SkipEventListening 重跑忽略事件监听与否 
     */
    public void setSkipEventListening(Boolean SkipEventListening) {
        this.SkipEventListening = SkipEventListening;
    }

    /**
     * Get 下游实例范围 1: 所在工作流 2: 所在项目 3: 所有跨工作流依赖的项目 
     * @return SonInstanceType 下游实例范围 1: 所在工作流 2: 所在项目 3: 所有跨工作流依赖的项目
     */
    public String getSonInstanceType() {
        return this.SonInstanceType;
    }

    /**
     * Set 下游实例范围 1: 所在工作流 2: 所在项目 3: 所有跨工作流依赖的项目
     * @param SonInstanceType 下游实例范围 1: 所在工作流 2: 所在项目 3: 所有跨工作流依赖的项目
     */
    public void setSonInstanceType(String SonInstanceType) {
        this.SonInstanceType = SonInstanceType;
    }

    /**
     * Get 查询条件 
     * @return SearchCondition 查询条件
     */
    public InstanceApiOpsRequest getSearchCondition() {
        return this.SearchCondition;
    }

    /**
     * Set 查询条件
     * @param SearchCondition 查询条件
     */
    public void setSearchCondition(InstanceApiOpsRequest SearchCondition) {
        this.SearchCondition = SearchCondition;
    }

    /**
     * Get 访问类型 
     * @return OptType 访问类型
     */
    public String getOptType() {
        return this.OptType;
    }

    /**
     * Set 访问类型
     * @param OptType 访问类型
     */
    public void setOptType(String OptType) {
        this.OptType = OptType;
    }

    /**
     * Get 操作者名称 
     * @return OperatorName 操作者名称
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set 操作者名称
     * @param OperatorName 操作者名称
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    /**
     * Get 操作者id 
     * @return OperatorId 操作者id
     */
    public String getOperatorId() {
        return this.OperatorId;
    }

    /**
     * Set 操作者id
     * @param OperatorId 操作者id
     */
    public void setOperatorId(String OperatorId) {
        this.OperatorId = OperatorId;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目标志 
     * @return ProjectIdent 项目标志
     */
    public String getProjectIdent() {
        return this.ProjectIdent;
    }

    /**
     * Set 项目标志
     * @param ProjectIdent 项目标志
     */
    public void setProjectIdent(String ProjectIdent) {
        this.ProjectIdent = ProjectIdent;
    }

    /**
     * Get 项目名称 
     * @return ProjectName 项目名称
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
     * @param ProjectName 项目名称
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 索引页码 
     * @return PageIndex 索引页码
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 索引页码
     * @param PageIndex 索引页码
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 页面大小 
     * @return PageSize 页面大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页面大小
     * @param PageSize 页面大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 数据总数 
     * @return Count 数据总数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 数据总数
     * @param Count 数据总数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 基础请求信息 
     * @return RequestBaseInfo 基础请求信息
     */
    public ProjectBaseInfoOpsRequest getRequestBaseInfo() {
        return this.RequestBaseInfo;
    }

    /**
     * Set 基础请求信息
     * @param RequestBaseInfo 基础请求信息
     */
    public void setRequestBaseInfo(ProjectBaseInfoOpsRequest RequestBaseInfo) {
        this.RequestBaseInfo = RequestBaseInfo;
    }

    /**
     * Get 是否计算总数 
     * @return IsCount 是否计算总数
     */
    public Boolean getIsCount() {
        return this.IsCount;
    }

    /**
     * Set 是否计算总数
     * @param IsCount 是否计算总数
     */
    public void setIsCount(Boolean IsCount) {
        this.IsCount = IsCount;
    }

    /**
     * Get 是否异步模式 
     * @return AsyncMode 是否异步模式
     */
    public Boolean getAsyncMode() {
        return this.AsyncMode;
    }

    /**
     * Set 是否异步模式
     * @param AsyncMode 是否异步模式
     */
    public void setAsyncMode(Boolean AsyncMode) {
        this.AsyncMode = AsyncMode;
    }

    /**
     * Get 是否检查上游任务： ALL（全部）、 MAKE_SCOPE（选中）、NONE （全部不检查） 
     * @return CheckParentType 是否检查上游任务： ALL（全部）、 MAKE_SCOPE（选中）、NONE （全部不检查）
     */
    public String getCheckParentType() {
        return this.CheckParentType;
    }

    /**
     * Set 是否检查上游任务： ALL（全部）、 MAKE_SCOPE（选中）、NONE （全部不检查）
     * @param CheckParentType 是否检查上游任务： ALL（全部）、 MAKE_SCOPE（选中）、NONE （全部不检查）
     */
    public void setCheckParentType(String CheckParentType) {
        this.CheckParentType = CheckParentType;
    }

    /**
     * Get 任务原有自依赖配置 true（是）、false（否） 
     * @return SameSelfDependType 任务原有自依赖配置 true（是）、false（否）
     */
    public Boolean getSameSelfDependType() {
        return this.SameSelfDependType;
    }

    /**
     * Set 任务原有自依赖配置 true（是）、false（否）
     * @param SameSelfDependType 任务原有自依赖配置 true（是）、false（否）
     */
    public void setSameSelfDependType(Boolean SameSelfDependType) {
        this.SameSelfDependType = SameSelfDependType;
    }

    /**
     * Get 实例运行并发度 
     * @return ParallelNum 实例运行并发度
     */
    public Long getParallelNum() {
        return this.ParallelNum;
    }

    /**
     * Set 实例运行并发度
     * @param ParallelNum 实例运行并发度
     */
    public void setParallelNum(Long ParallelNum) {
        this.ParallelNum = ParallelNum;
    }

    /**
     * Get 任务原有自依赖配置 true（是）、false（否） 
     * @return SameSelfWorkflowDependType 任务原有自依赖配置 true（是）、false（否）
     */
    public Boolean getSameSelfWorkflowDependType() {
        return this.SameSelfWorkflowDependType;
    }

    /**
     * Set 任务原有自依赖配置 true（是）、false（否）
     * @param SameSelfWorkflowDependType 任务原有自依赖配置 true（是）、false（否）
     */
    public void setSameSelfWorkflowDependType(Boolean SameSelfWorkflowDependType) {
        this.SameSelfWorkflowDependType = SameSelfWorkflowDependType;
    }

    /**
     * Get 代表重新指定 的  是 或者 否  yes、 no 
     * @return SelfWorkflowDependency 代表重新指定 的  是 或者 否  yes、 no
     */
    public String getSelfWorkflowDependency() {
        return this.SelfWorkflowDependency;
    }

    /**
     * Set 代表重新指定 的  是 或者 否  yes、 no
     * @param SelfWorkflowDependency 代表重新指定 的  是 或者 否  yes、 no
     */
    public void setSelfWorkflowDependency(String SelfWorkflowDependency) {
        this.SelfWorkflowDependency = SelfWorkflowDependency;
    }

    /**
     * Get 运行实例数据时间排序 0---正常  1--正序  2 – 逆序 
     * @return DataTimeOrder 运行实例数据时间排序 0---正常  1--正序  2 – 逆序
     */
    public Long getDataTimeOrder() {
        return this.DataTimeOrder;
    }

    /**
     * Set 运行实例数据时间排序 0---正常  1--正序  2 – 逆序
     * @param DataTimeOrder 运行实例数据时间排序 0---正常  1--正序  2 – 逆序
     */
    public void setDataTimeOrder(Long DataTimeOrder) {
        this.DataTimeOrder = DataTimeOrder;
    }

    /**
     * Get 重跑参数 
     * @return ReDoParams 重跑参数
     */
    public String getReDoParams() {
        return this.ReDoParams;
    }

    /**
     * Set 重跑参数
     * @param ReDoParams 重跑参数
     */
    public void setReDoParams(String ReDoParams) {
        this.ReDoParams = ReDoParams;
    }

    public RunRerunScheduleInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunRerunScheduleInstancesRequest(RunRerunScheduleInstancesRequest source) {
        if (source.Instances != null) {
            this.Instances = new InstanceOpsDto[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new InstanceOpsDto(source.Instances[i]);
            }
        }
        if (source.CheckFather != null) {
            this.CheckFather = new Boolean(source.CheckFather);
        }
        if (source.RerunType != null) {
            this.RerunType = new String(source.RerunType);
        }
        if (source.DependentWay != null) {
            this.DependentWay = new String(source.DependentWay);
        }
        if (source.SkipEventListening != null) {
            this.SkipEventListening = new Boolean(source.SkipEventListening);
        }
        if (source.SonInstanceType != null) {
            this.SonInstanceType = new String(source.SonInstanceType);
        }
        if (source.SearchCondition != null) {
            this.SearchCondition = new InstanceApiOpsRequest(source.SearchCondition);
        }
        if (source.OptType != null) {
            this.OptType = new String(source.OptType);
        }
        if (source.OperatorName != null) {
            this.OperatorName = new String(source.OperatorName);
        }
        if (source.OperatorId != null) {
            this.OperatorId = new String(source.OperatorId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectIdent != null) {
            this.ProjectIdent = new String(source.ProjectIdent);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.RequestBaseInfo != null) {
            this.RequestBaseInfo = new ProjectBaseInfoOpsRequest(source.RequestBaseInfo);
        }
        if (source.IsCount != null) {
            this.IsCount = new Boolean(source.IsCount);
        }
        if (source.AsyncMode != null) {
            this.AsyncMode = new Boolean(source.AsyncMode);
        }
        if (source.CheckParentType != null) {
            this.CheckParentType = new String(source.CheckParentType);
        }
        if (source.SameSelfDependType != null) {
            this.SameSelfDependType = new Boolean(source.SameSelfDependType);
        }
        if (source.ParallelNum != null) {
            this.ParallelNum = new Long(source.ParallelNum);
        }
        if (source.SameSelfWorkflowDependType != null) {
            this.SameSelfWorkflowDependType = new Boolean(source.SameSelfWorkflowDependType);
        }
        if (source.SelfWorkflowDependency != null) {
            this.SelfWorkflowDependency = new String(source.SelfWorkflowDependency);
        }
        if (source.DataTimeOrder != null) {
            this.DataTimeOrder = new Long(source.DataTimeOrder);
        }
        if (source.ReDoParams != null) {
            this.ReDoParams = new String(source.ReDoParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);
        this.setParamSimple(map, prefix + "CheckFather", this.CheckFather);
        this.setParamSimple(map, prefix + "RerunType", this.RerunType);
        this.setParamSimple(map, prefix + "DependentWay", this.DependentWay);
        this.setParamSimple(map, prefix + "SkipEventListening", this.SkipEventListening);
        this.setParamSimple(map, prefix + "SonInstanceType", this.SonInstanceType);
        this.setParamObj(map, prefix + "SearchCondition.", this.SearchCondition);
        this.setParamSimple(map, prefix + "OptType", this.OptType);
        this.setParamSimple(map, prefix + "OperatorName", this.OperatorName);
        this.setParamSimple(map, prefix + "OperatorId", this.OperatorId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamObj(map, prefix + "RequestBaseInfo.", this.RequestBaseInfo);
        this.setParamSimple(map, prefix + "IsCount", this.IsCount);
        this.setParamSimple(map, prefix + "AsyncMode", this.AsyncMode);
        this.setParamSimple(map, prefix + "CheckParentType", this.CheckParentType);
        this.setParamSimple(map, prefix + "SameSelfDependType", this.SameSelfDependType);
        this.setParamSimple(map, prefix + "ParallelNum", this.ParallelNum);
        this.setParamSimple(map, prefix + "SameSelfWorkflowDependType", this.SameSelfWorkflowDependType);
        this.setParamSimple(map, prefix + "SelfWorkflowDependency", this.SelfWorkflowDependency);
        this.setParamSimple(map, prefix + "DataTimeOrder", this.DataTimeOrder);
        this.setParamSimple(map, prefix + "ReDoParams", this.ReDoParams);

    }
}

