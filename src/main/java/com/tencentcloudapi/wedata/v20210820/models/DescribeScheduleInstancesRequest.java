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

public class DescribeScheduleInstancesRequest extends AbstractModel {

    /**
    * 请求来源，WEB 前端；CLIENT 客户端
    */
    @SerializedName("RequestFromSource")
    @Expose
    private String RequestFromSource;

    /**
    * 【已废弃参数，新用户接入无需关注】
实例列表过滤条件
    */
    @SerializedName("Instances")
    @Expose
    private InstanceOpsDto [] Instances;

    /**
    * 【已废弃参数，新用户接入无需关注】
检查父任务类型,  true: 检查父任务类型;  false: 不检查父任务类型
    */
    @SerializedName("CheckFather")
    @Expose
    private Boolean CheckFather;

    /**
    * 【已废弃参数，新用户接入无需关注】
重跑类型, 1: 仅重跑当前实例; 2: 重跑当前实例及其子实例; 3: 仅重跑子实例
    */
    @SerializedName("RerunType")
    @Expose
    private String RerunType;

    /**
    * 【已废弃参数，新用户接入无需关注】
实例依赖方式, 1: 任务自依赖; 2: 任务上游依赖; 3: 自依赖及其上游依赖 
    */
    @SerializedName("DependentWay")
    @Expose
    private String DependentWay;

    /**
    * 【已废弃参数，新用户接入无需关注】
重跑时是否忽略事件监听
    */
    @SerializedName("SkipEventListening")
    @Expose
    private Boolean SkipEventListening;

    /**
    * 【已废弃参数，新用户接入无需关注】
下游实例范围 1: 所在工作流 2: 所在项目 3: 所有跨工作流依赖的项目
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
    * 【已废弃参数，新用户接入无需关注】
访问类型
    */
    @SerializedName("OptType")
    @Expose
    private String OptType;

    /**
    * 【已废弃参数，新用户接入无需关注】
操作者名称
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
    * 【已废弃参数，新用户接入无需关注】
操作者id
    */
    @SerializedName("OperatorId")
    @Expose
    private String OperatorId;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 【必要参数】
项目ID
    */
    @SerializedName("ProjectIdent")
    @Expose
    private String ProjectIdent;

    /**
    * 【已废弃参数，新用户接入无需关注】
项目名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 【必要参数】
分页查询开始页页码，默认值为 1
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 【必要参数】
分页查询每页返回的结果行数，默认值为 10
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 【已废弃参数，新用户接入无需关注】
数据总数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 【已废弃参数，新用户接入无需关注】
基础请求信息
    */
    @SerializedName("RequestBaseInfo")
    @Expose
    private ProjectBaseInfoOpsRequest RequestBaseInfo;

    /**
    * 【已废弃参数，新用户接入无需关注】
是否计算总数
    */
    @SerializedName("IsCount")
    @Expose
    private Boolean IsCount;

    /**
    * 【已废弃参数，新用户接入无需关注】
项目ID列表，用于多项目实例列表筛选，请注意，该字段传入时 ProjectId 字段也必须传，且传入的 ProjectIds 中的项目ID必须是当前用户有权限的项目ID，否则会由于权限校验失败报错
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
     * Get 请求来源，WEB 前端；CLIENT 客户端 
     * @return RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
     */
    public String getRequestFromSource() {
        return this.RequestFromSource;
    }

    /**
     * Set 请求来源，WEB 前端；CLIENT 客户端
     * @param RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
     */
    public void setRequestFromSource(String RequestFromSource) {
        this.RequestFromSource = RequestFromSource;
    }

    /**
     * Get 【已废弃参数，新用户接入无需关注】
实例列表过滤条件 
     * @return Instances 【已废弃参数，新用户接入无需关注】
实例列表过滤条件
     */
    public InstanceOpsDto [] getInstances() {
        return this.Instances;
    }

    /**
     * Set 【已废弃参数，新用户接入无需关注】
实例列表过滤条件
     * @param Instances 【已废弃参数，新用户接入无需关注】
实例列表过滤条件
     */
    public void setInstances(InstanceOpsDto [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Get 【已废弃参数，新用户接入无需关注】
检查父任务类型,  true: 检查父任务类型;  false: 不检查父任务类型 
     * @return CheckFather 【已废弃参数，新用户接入无需关注】
检查父任务类型,  true: 检查父任务类型;  false: 不检查父任务类型
     */
    public Boolean getCheckFather() {
        return this.CheckFather;
    }

    /**
     * Set 【已废弃参数，新用户接入无需关注】
检查父任务类型,  true: 检查父任务类型;  false: 不检查父任务类型
     * @param CheckFather 【已废弃参数，新用户接入无需关注】
检查父任务类型,  true: 检查父任务类型;  false: 不检查父任务类型
     */
    public void setCheckFather(Boolean CheckFather) {
        this.CheckFather = CheckFather;
    }

    /**
     * Get 【已废弃参数，新用户接入无需关注】
重跑类型, 1: 仅重跑当前实例; 2: 重跑当前实例及其子实例; 3: 仅重跑子实例 
     * @return RerunType 【已废弃参数，新用户接入无需关注】
重跑类型, 1: 仅重跑当前实例; 2: 重跑当前实例及其子实例; 3: 仅重跑子实例
     */
    public String getRerunType() {
        return this.RerunType;
    }

    /**
     * Set 【已废弃参数，新用户接入无需关注】
重跑类型, 1: 仅重跑当前实例; 2: 重跑当前实例及其子实例; 3: 仅重跑子实例
     * @param RerunType 【已废弃参数，新用户接入无需关注】
重跑类型, 1: 仅重跑当前实例; 2: 重跑当前实例及其子实例; 3: 仅重跑子实例
     */
    public void setRerunType(String RerunType) {
        this.RerunType = RerunType;
    }

    /**
     * Get 【已废弃参数，新用户接入无需关注】
实例依赖方式, 1: 任务自依赖; 2: 任务上游依赖; 3: 自依赖及其上游依赖  
     * @return DependentWay 【已废弃参数，新用户接入无需关注】
实例依赖方式, 1: 任务自依赖; 2: 任务上游依赖; 3: 自依赖及其上游依赖 
     */
    public String getDependentWay() {
        return this.DependentWay;
    }

    /**
     * Set 【已废弃参数，新用户接入无需关注】
实例依赖方式, 1: 任务自依赖; 2: 任务上游依赖; 3: 自依赖及其上游依赖 
     * @param DependentWay 【已废弃参数，新用户接入无需关注】
实例依赖方式, 1: 任务自依赖; 2: 任务上游依赖; 3: 自依赖及其上游依赖 
     */
    public void setDependentWay(String DependentWay) {
        this.DependentWay = DependentWay;
    }

    /**
     * Get 【已废弃参数，新用户接入无需关注】
重跑时是否忽略事件监听 
     * @return SkipEventListening 【已废弃参数，新用户接入无需关注】
重跑时是否忽略事件监听
     */
    public Boolean getSkipEventListening() {
        return this.SkipEventListening;
    }

    /**
     * Set 【已废弃参数，新用户接入无需关注】
重跑时是否忽略事件监听
     * @param SkipEventListening 【已废弃参数，新用户接入无需关注】
重跑时是否忽略事件监听
     */
    public void setSkipEventListening(Boolean SkipEventListening) {
        this.SkipEventListening = SkipEventListening;
    }

    /**
     * Get 【已废弃参数，新用户接入无需关注】
下游实例范围 1: 所在工作流 2: 所在项目 3: 所有跨工作流依赖的项目 
     * @return SonInstanceType 【已废弃参数，新用户接入无需关注】
下游实例范围 1: 所在工作流 2: 所在项目 3: 所有跨工作流依赖的项目
     */
    public String getSonInstanceType() {
        return this.SonInstanceType;
    }

    /**
     * Set 【已废弃参数，新用户接入无需关注】
下游实例范围 1: 所在工作流 2: 所在项目 3: 所有跨工作流依赖的项目
     * @param SonInstanceType 【已废弃参数，新用户接入无需关注】
下游实例范围 1: 所在工作流 2: 所在项目 3: 所有跨工作流依赖的项目
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
     * Get 【已废弃参数，新用户接入无需关注】
访问类型 
     * @return OptType 【已废弃参数，新用户接入无需关注】
访问类型
     */
    public String getOptType() {
        return this.OptType;
    }

    /**
     * Set 【已废弃参数，新用户接入无需关注】
访问类型
     * @param OptType 【已废弃参数，新用户接入无需关注】
访问类型
     */
    public void setOptType(String OptType) {
        this.OptType = OptType;
    }

    /**
     * Get 【已废弃参数，新用户接入无需关注】
操作者名称 
     * @return OperatorName 【已废弃参数，新用户接入无需关注】
操作者名称
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set 【已废弃参数，新用户接入无需关注】
操作者名称
     * @param OperatorName 【已废弃参数，新用户接入无需关注】
操作者名称
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    /**
     * Get 【已废弃参数，新用户接入无需关注】
操作者id 
     * @return OperatorId 【已废弃参数，新用户接入无需关注】
操作者id
     */
    public String getOperatorId() {
        return this.OperatorId;
    }

    /**
     * Set 【已废弃参数，新用户接入无需关注】
操作者id
     * @param OperatorId 【已废弃参数，新用户接入无需关注】
操作者id
     */
    public void setOperatorId(String OperatorId) {
        this.OperatorId = OperatorId;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 【必要参数】
项目ID 
     * @return ProjectIdent 【必要参数】
项目ID
     */
    public String getProjectIdent() {
        return this.ProjectIdent;
    }

    /**
     * Set 【必要参数】
项目ID
     * @param ProjectIdent 【必要参数】
项目ID
     */
    public void setProjectIdent(String ProjectIdent) {
        this.ProjectIdent = ProjectIdent;
    }

    /**
     * Get 【已废弃参数，新用户接入无需关注】
项目名称 
     * @return ProjectName 【已废弃参数，新用户接入无需关注】
项目名称
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 【已废弃参数，新用户接入无需关注】
项目名称
     * @param ProjectName 【已废弃参数，新用户接入无需关注】
项目名称
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 【必要参数】
分页查询开始页页码，默认值为 1 
     * @return PageIndex 【必要参数】
分页查询开始页页码，默认值为 1
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 【必要参数】
分页查询开始页页码，默认值为 1
     * @param PageIndex 【必要参数】
分页查询开始页页码，默认值为 1
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 【必要参数】
分页查询每页返回的结果行数，默认值为 10 
     * @return PageSize 【必要参数】
分页查询每页返回的结果行数，默认值为 10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 【必要参数】
分页查询每页返回的结果行数，默认值为 10
     * @param PageSize 【必要参数】
分页查询每页返回的结果行数，默认值为 10
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 【已废弃参数，新用户接入无需关注】
数据总数 
     * @return Count 【已废弃参数，新用户接入无需关注】
数据总数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 【已废弃参数，新用户接入无需关注】
数据总数
     * @param Count 【已废弃参数，新用户接入无需关注】
数据总数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 【已废弃参数，新用户接入无需关注】
基础请求信息 
     * @return RequestBaseInfo 【已废弃参数，新用户接入无需关注】
基础请求信息
     */
    public ProjectBaseInfoOpsRequest getRequestBaseInfo() {
        return this.RequestBaseInfo;
    }

    /**
     * Set 【已废弃参数，新用户接入无需关注】
基础请求信息
     * @param RequestBaseInfo 【已废弃参数，新用户接入无需关注】
基础请求信息
     */
    public void setRequestBaseInfo(ProjectBaseInfoOpsRequest RequestBaseInfo) {
        this.RequestBaseInfo = RequestBaseInfo;
    }

    /**
     * Get 【已废弃参数，新用户接入无需关注】
是否计算总数 
     * @return IsCount 【已废弃参数，新用户接入无需关注】
是否计算总数
     */
    public Boolean getIsCount() {
        return this.IsCount;
    }

    /**
     * Set 【已废弃参数，新用户接入无需关注】
是否计算总数
     * @param IsCount 【已废弃参数，新用户接入无需关注】
是否计算总数
     */
    public void setIsCount(Boolean IsCount) {
        this.IsCount = IsCount;
    }

    /**
     * Get 【已废弃参数，新用户接入无需关注】
项目ID列表，用于多项目实例列表筛选，请注意，该字段传入时 ProjectId 字段也必须传，且传入的 ProjectIds 中的项目ID必须是当前用户有权限的项目ID，否则会由于权限校验失败报错 
     * @return ProjectIds 【已废弃参数，新用户接入无需关注】
项目ID列表，用于多项目实例列表筛选，请注意，该字段传入时 ProjectId 字段也必须传，且传入的 ProjectIds 中的项目ID必须是当前用户有权限的项目ID，否则会由于权限校验失败报错
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 【已废弃参数，新用户接入无需关注】
项目ID列表，用于多项目实例列表筛选，请注意，该字段传入时 ProjectId 字段也必须传，且传入的 ProjectIds 中的项目ID必须是当前用户有权限的项目ID，否则会由于权限校验失败报错
     * @param ProjectIds 【已废弃参数，新用户接入无需关注】
项目ID列表，用于多项目实例列表筛选，请注意，该字段传入时 ProjectId 字段也必须传，且传入的 ProjectIds 中的项目ID必须是当前用户有权限的项目ID，否则会由于权限校验失败报错
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    public DescribeScheduleInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScheduleInstancesRequest(DescribeScheduleInstancesRequest source) {
        if (source.RequestFromSource != null) {
            this.RequestFromSource = new String(source.RequestFromSource);
        }
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
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestFromSource", this.RequestFromSource);
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
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);

    }
}

