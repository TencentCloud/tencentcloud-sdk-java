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

public class DescribeOperateOpsTasksRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 文件夹id，多个文件夹以逗号分隔
    */
    @SerializedName("FolderIdList")
    @Expose
    private String FolderIdList;

    /**
    * 工作流id，多个工作流id之间以英文字符逗号分隔
    */
    @SerializedName("WorkFlowIdList")
    @Expose
    private String WorkFlowIdList;

    /**
    * 工作流名称，多个工作流名称之间以英文字符逗号分隔
    */
    @SerializedName("WorkFlowNameList")
    @Expose
    private String WorkFlowNameList;

    /**
    * 任务名称，多个任务名称之间以英文字符逗号分隔
    */
    @SerializedName("TaskNameList")
    @Expose
    private String TaskNameList;

    /**
    * 任务id，多个任务id之间以英文字符逗号分隔
    */
    @SerializedName("TaskIdList")
    @Expose
    private String TaskIdList;

    /**
    * 页号
    */
    @SerializedName("PageNumber")
    @Expose
    private String PageNumber;

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private String PageSize;

    /**
    * 排序字段，支持字段为FirstSubmitTime和FirstRunTime，标识最近提交和首次执行事件
    */
    @SerializedName("SortItem")
    @Expose
    private String SortItem;

    /**
    * 排序类型。两种取值 DESC、ASC
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * 责任人，多个责任人之间以英文字符逗号分隔
    */
    @SerializedName("InChargeList")
    @Expose
    private String InChargeList;

    /**
    * 任务类型Id字符串，多个任务类型id之间以英文字符逗号分隔
    */
    @SerializedName("TaskTypeIdList")
    @Expose
    private String TaskTypeIdList;

    /**
    * 任务状态字符串，多个任务状态之间以英文字符逗号分隔
    */
    @SerializedName("StatusList")
    @Expose
    private String StatusList;

    /**
    * 任务周期类型字符串，多个任务周期之间以英文字符逗号分隔
    */
    @SerializedName("TaskCycleUnitList")
    @Expose
    private String TaskCycleUnitList;

    /**
    * 任务所属产品类型
    */
    @SerializedName("ProductNameList")
    @Expose
    private String ProductNameList;

    /**
    * 数据源id或（仅针对离线同步任务）来源数据源id
    */
    @SerializedName("SourceServiceId")
    @Expose
    private String SourceServiceId;

    /**
    * 数据源类型或（仅针对离线同步任务）来源数据源类型
    */
    @SerializedName("SourceServiceType")
    @Expose
    private String SourceServiceType;

    /**
    * （仅针对离线同步任务）目标数据源id
    */
    @SerializedName("TargetServiceId")
    @Expose
    private String TargetServiceId;

    /**
    * （仅针对离线同步任务）目标数据源类型
    */
    @SerializedName("TargetServiceType")
    @Expose
    private String TargetServiceType;

    /**
    * 告警类型，多个类型以逗号分隔
    */
    @SerializedName("AlarmType")
    @Expose
    private String AlarmType;

    /**
    * 资源组id,多个资源组id之间以英文字符逗号分隔
    */
    @SerializedName("ExecutorGroupIdList")
    @Expose
    private String ExecutorGroupIdList;

    /**
    * 任务标签
    */
    @SerializedName("TaskTags")
    @Expose
    private TaskTag [] TaskTags;

    /**
    * 查询关键字
    */
    @SerializedName("KeyWord")
    @Expose
    private String KeyWord;

    /**
    * 实例生成方式
    */
    @SerializedName("InitStrategy")
    @Expose
    private String InitStrategy;

    /**
    * 额外请求的资源类型
    */
    @SerializedName("RequestResourceTypes")
    @Expose
    private String [] RequestResourceTypes;

    /**
    * 项目ID列表
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * 黑名单任务ID列表，传了该值在筛选的时候会将列表中的任务ID剔除
    */
    @SerializedName("BlackTaskIdList")
    @Expose
    private String [] BlackTaskIdList;

    /**
    * 时区
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

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
     * Get 文件夹id，多个文件夹以逗号分隔 
     * @return FolderIdList 文件夹id，多个文件夹以逗号分隔
     */
    public String getFolderIdList() {
        return this.FolderIdList;
    }

    /**
     * Set 文件夹id，多个文件夹以逗号分隔
     * @param FolderIdList 文件夹id，多个文件夹以逗号分隔
     */
    public void setFolderIdList(String FolderIdList) {
        this.FolderIdList = FolderIdList;
    }

    /**
     * Get 工作流id，多个工作流id之间以英文字符逗号分隔 
     * @return WorkFlowIdList 工作流id，多个工作流id之间以英文字符逗号分隔
     */
    public String getWorkFlowIdList() {
        return this.WorkFlowIdList;
    }

    /**
     * Set 工作流id，多个工作流id之间以英文字符逗号分隔
     * @param WorkFlowIdList 工作流id，多个工作流id之间以英文字符逗号分隔
     */
    public void setWorkFlowIdList(String WorkFlowIdList) {
        this.WorkFlowIdList = WorkFlowIdList;
    }

    /**
     * Get 工作流名称，多个工作流名称之间以英文字符逗号分隔 
     * @return WorkFlowNameList 工作流名称，多个工作流名称之间以英文字符逗号分隔
     */
    public String getWorkFlowNameList() {
        return this.WorkFlowNameList;
    }

    /**
     * Set 工作流名称，多个工作流名称之间以英文字符逗号分隔
     * @param WorkFlowNameList 工作流名称，多个工作流名称之间以英文字符逗号分隔
     */
    public void setWorkFlowNameList(String WorkFlowNameList) {
        this.WorkFlowNameList = WorkFlowNameList;
    }

    /**
     * Get 任务名称，多个任务名称之间以英文字符逗号分隔 
     * @return TaskNameList 任务名称，多个任务名称之间以英文字符逗号分隔
     */
    public String getTaskNameList() {
        return this.TaskNameList;
    }

    /**
     * Set 任务名称，多个任务名称之间以英文字符逗号分隔
     * @param TaskNameList 任务名称，多个任务名称之间以英文字符逗号分隔
     */
    public void setTaskNameList(String TaskNameList) {
        this.TaskNameList = TaskNameList;
    }

    /**
     * Get 任务id，多个任务id之间以英文字符逗号分隔 
     * @return TaskIdList 任务id，多个任务id之间以英文字符逗号分隔
     */
    public String getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set 任务id，多个任务id之间以英文字符逗号分隔
     * @param TaskIdList 任务id，多个任务id之间以英文字符逗号分隔
     */
    public void setTaskIdList(String TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    /**
     * Get 页号 
     * @return PageNumber 页号
     */
    public String getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页号
     * @param PageNumber 页号
     */
    public void setPageNumber(String PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public String getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(String PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 排序字段，支持字段为FirstSubmitTime和FirstRunTime，标识最近提交和首次执行事件 
     * @return SortItem 排序字段，支持字段为FirstSubmitTime和FirstRunTime，标识最近提交和首次执行事件
     */
    public String getSortItem() {
        return this.SortItem;
    }

    /**
     * Set 排序字段，支持字段为FirstSubmitTime和FirstRunTime，标识最近提交和首次执行事件
     * @param SortItem 排序字段，支持字段为FirstSubmitTime和FirstRunTime，标识最近提交和首次执行事件
     */
    public void setSortItem(String SortItem) {
        this.SortItem = SortItem;
    }

    /**
     * Get 排序类型。两种取值 DESC、ASC 
     * @return SortType 排序类型。两种取值 DESC、ASC
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set 排序类型。两种取值 DESC、ASC
     * @param SortType 排序类型。两种取值 DESC、ASC
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get 责任人，多个责任人之间以英文字符逗号分隔 
     * @return InChargeList 责任人，多个责任人之间以英文字符逗号分隔
     */
    public String getInChargeList() {
        return this.InChargeList;
    }

    /**
     * Set 责任人，多个责任人之间以英文字符逗号分隔
     * @param InChargeList 责任人，多个责任人之间以英文字符逗号分隔
     */
    public void setInChargeList(String InChargeList) {
        this.InChargeList = InChargeList;
    }

    /**
     * Get 任务类型Id字符串，多个任务类型id之间以英文字符逗号分隔 
     * @return TaskTypeIdList 任务类型Id字符串，多个任务类型id之间以英文字符逗号分隔
     */
    public String getTaskTypeIdList() {
        return this.TaskTypeIdList;
    }

    /**
     * Set 任务类型Id字符串，多个任务类型id之间以英文字符逗号分隔
     * @param TaskTypeIdList 任务类型Id字符串，多个任务类型id之间以英文字符逗号分隔
     */
    public void setTaskTypeIdList(String TaskTypeIdList) {
        this.TaskTypeIdList = TaskTypeIdList;
    }

    /**
     * Get 任务状态字符串，多个任务状态之间以英文字符逗号分隔 
     * @return StatusList 任务状态字符串，多个任务状态之间以英文字符逗号分隔
     */
    public String getStatusList() {
        return this.StatusList;
    }

    /**
     * Set 任务状态字符串，多个任务状态之间以英文字符逗号分隔
     * @param StatusList 任务状态字符串，多个任务状态之间以英文字符逗号分隔
     */
    public void setStatusList(String StatusList) {
        this.StatusList = StatusList;
    }

    /**
     * Get 任务周期类型字符串，多个任务周期之间以英文字符逗号分隔 
     * @return TaskCycleUnitList 任务周期类型字符串，多个任务周期之间以英文字符逗号分隔
     */
    public String getTaskCycleUnitList() {
        return this.TaskCycleUnitList;
    }

    /**
     * Set 任务周期类型字符串，多个任务周期之间以英文字符逗号分隔
     * @param TaskCycleUnitList 任务周期类型字符串，多个任务周期之间以英文字符逗号分隔
     */
    public void setTaskCycleUnitList(String TaskCycleUnitList) {
        this.TaskCycleUnitList = TaskCycleUnitList;
    }

    /**
     * Get 任务所属产品类型 
     * @return ProductNameList 任务所属产品类型
     */
    public String getProductNameList() {
        return this.ProductNameList;
    }

    /**
     * Set 任务所属产品类型
     * @param ProductNameList 任务所属产品类型
     */
    public void setProductNameList(String ProductNameList) {
        this.ProductNameList = ProductNameList;
    }

    /**
     * Get 数据源id或（仅针对离线同步任务）来源数据源id 
     * @return SourceServiceId 数据源id或（仅针对离线同步任务）来源数据源id
     */
    public String getSourceServiceId() {
        return this.SourceServiceId;
    }

    /**
     * Set 数据源id或（仅针对离线同步任务）来源数据源id
     * @param SourceServiceId 数据源id或（仅针对离线同步任务）来源数据源id
     */
    public void setSourceServiceId(String SourceServiceId) {
        this.SourceServiceId = SourceServiceId;
    }

    /**
     * Get 数据源类型或（仅针对离线同步任务）来源数据源类型 
     * @return SourceServiceType 数据源类型或（仅针对离线同步任务）来源数据源类型
     */
    public String getSourceServiceType() {
        return this.SourceServiceType;
    }

    /**
     * Set 数据源类型或（仅针对离线同步任务）来源数据源类型
     * @param SourceServiceType 数据源类型或（仅针对离线同步任务）来源数据源类型
     */
    public void setSourceServiceType(String SourceServiceType) {
        this.SourceServiceType = SourceServiceType;
    }

    /**
     * Get （仅针对离线同步任务）目标数据源id 
     * @return TargetServiceId （仅针对离线同步任务）目标数据源id
     */
    public String getTargetServiceId() {
        return this.TargetServiceId;
    }

    /**
     * Set （仅针对离线同步任务）目标数据源id
     * @param TargetServiceId （仅针对离线同步任务）目标数据源id
     */
    public void setTargetServiceId(String TargetServiceId) {
        this.TargetServiceId = TargetServiceId;
    }

    /**
     * Get （仅针对离线同步任务）目标数据源类型 
     * @return TargetServiceType （仅针对离线同步任务）目标数据源类型
     */
    public String getTargetServiceType() {
        return this.TargetServiceType;
    }

    /**
     * Set （仅针对离线同步任务）目标数据源类型
     * @param TargetServiceType （仅针对离线同步任务）目标数据源类型
     */
    public void setTargetServiceType(String TargetServiceType) {
        this.TargetServiceType = TargetServiceType;
    }

    /**
     * Get 告警类型，多个类型以逗号分隔 
     * @return AlarmType 告警类型，多个类型以逗号分隔
     */
    public String getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set 告警类型，多个类型以逗号分隔
     * @param AlarmType 告警类型，多个类型以逗号分隔
     */
    public void setAlarmType(String AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get 资源组id,多个资源组id之间以英文字符逗号分隔 
     * @return ExecutorGroupIdList 资源组id,多个资源组id之间以英文字符逗号分隔
     */
    public String getExecutorGroupIdList() {
        return this.ExecutorGroupIdList;
    }

    /**
     * Set 资源组id,多个资源组id之间以英文字符逗号分隔
     * @param ExecutorGroupIdList 资源组id,多个资源组id之间以英文字符逗号分隔
     */
    public void setExecutorGroupIdList(String ExecutorGroupIdList) {
        this.ExecutorGroupIdList = ExecutorGroupIdList;
    }

    /**
     * Get 任务标签 
     * @return TaskTags 任务标签
     */
    public TaskTag [] getTaskTags() {
        return this.TaskTags;
    }

    /**
     * Set 任务标签
     * @param TaskTags 任务标签
     */
    public void setTaskTags(TaskTag [] TaskTags) {
        this.TaskTags = TaskTags;
    }

    /**
     * Get 查询关键字 
     * @return KeyWord 查询关键字
     */
    public String getKeyWord() {
        return this.KeyWord;
    }

    /**
     * Set 查询关键字
     * @param KeyWord 查询关键字
     */
    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    /**
     * Get 实例生成方式 
     * @return InitStrategy 实例生成方式
     */
    public String getInitStrategy() {
        return this.InitStrategy;
    }

    /**
     * Set 实例生成方式
     * @param InitStrategy 实例生成方式
     */
    public void setInitStrategy(String InitStrategy) {
        this.InitStrategy = InitStrategy;
    }

    /**
     * Get 额外请求的资源类型 
     * @return RequestResourceTypes 额外请求的资源类型
     */
    public String [] getRequestResourceTypes() {
        return this.RequestResourceTypes;
    }

    /**
     * Set 额外请求的资源类型
     * @param RequestResourceTypes 额外请求的资源类型
     */
    public void setRequestResourceTypes(String [] RequestResourceTypes) {
        this.RequestResourceTypes = RequestResourceTypes;
    }

    /**
     * Get 项目ID列表 
     * @return ProjectIds 项目ID列表
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目ID列表
     * @param ProjectIds 项目ID列表
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 黑名单任务ID列表，传了该值在筛选的时候会将列表中的任务ID剔除 
     * @return BlackTaskIdList 黑名单任务ID列表，传了该值在筛选的时候会将列表中的任务ID剔除
     */
    public String [] getBlackTaskIdList() {
        return this.BlackTaskIdList;
    }

    /**
     * Set 黑名单任务ID列表，传了该值在筛选的时候会将列表中的任务ID剔除
     * @param BlackTaskIdList 黑名单任务ID列表，传了该值在筛选的时候会将列表中的任务ID剔除
     */
    public void setBlackTaskIdList(String [] BlackTaskIdList) {
        this.BlackTaskIdList = BlackTaskIdList;
    }

    /**
     * Get 时区 
     * @return ScheduleTimeZone 时区
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set 时区
     * @param ScheduleTimeZone 时区
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    public DescribeOperateOpsTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOperateOpsTasksRequest(DescribeOperateOpsTasksRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FolderIdList != null) {
            this.FolderIdList = new String(source.FolderIdList);
        }
        if (source.WorkFlowIdList != null) {
            this.WorkFlowIdList = new String(source.WorkFlowIdList);
        }
        if (source.WorkFlowNameList != null) {
            this.WorkFlowNameList = new String(source.WorkFlowNameList);
        }
        if (source.TaskNameList != null) {
            this.TaskNameList = new String(source.TaskNameList);
        }
        if (source.TaskIdList != null) {
            this.TaskIdList = new String(source.TaskIdList);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new String(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new String(source.PageSize);
        }
        if (source.SortItem != null) {
            this.SortItem = new String(source.SortItem);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.InChargeList != null) {
            this.InChargeList = new String(source.InChargeList);
        }
        if (source.TaskTypeIdList != null) {
            this.TaskTypeIdList = new String(source.TaskTypeIdList);
        }
        if (source.StatusList != null) {
            this.StatusList = new String(source.StatusList);
        }
        if (source.TaskCycleUnitList != null) {
            this.TaskCycleUnitList = new String(source.TaskCycleUnitList);
        }
        if (source.ProductNameList != null) {
            this.ProductNameList = new String(source.ProductNameList);
        }
        if (source.SourceServiceId != null) {
            this.SourceServiceId = new String(source.SourceServiceId);
        }
        if (source.SourceServiceType != null) {
            this.SourceServiceType = new String(source.SourceServiceType);
        }
        if (source.TargetServiceId != null) {
            this.TargetServiceId = new String(source.TargetServiceId);
        }
        if (source.TargetServiceType != null) {
            this.TargetServiceType = new String(source.TargetServiceType);
        }
        if (source.AlarmType != null) {
            this.AlarmType = new String(source.AlarmType);
        }
        if (source.ExecutorGroupIdList != null) {
            this.ExecutorGroupIdList = new String(source.ExecutorGroupIdList);
        }
        if (source.TaskTags != null) {
            this.TaskTags = new TaskTag[source.TaskTags.length];
            for (int i = 0; i < source.TaskTags.length; i++) {
                this.TaskTags[i] = new TaskTag(source.TaskTags[i]);
            }
        }
        if (source.KeyWord != null) {
            this.KeyWord = new String(source.KeyWord);
        }
        if (source.InitStrategy != null) {
            this.InitStrategy = new String(source.InitStrategy);
        }
        if (source.RequestResourceTypes != null) {
            this.RequestResourceTypes = new String[source.RequestResourceTypes.length];
            for (int i = 0; i < source.RequestResourceTypes.length; i++) {
                this.RequestResourceTypes[i] = new String(source.RequestResourceTypes[i]);
            }
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.BlackTaskIdList != null) {
            this.BlackTaskIdList = new String[source.BlackTaskIdList.length];
            for (int i = 0; i < source.BlackTaskIdList.length; i++) {
                this.BlackTaskIdList[i] = new String(source.BlackTaskIdList[i]);
            }
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FolderIdList", this.FolderIdList);
        this.setParamSimple(map, prefix + "WorkFlowIdList", this.WorkFlowIdList);
        this.setParamSimple(map, prefix + "WorkFlowNameList", this.WorkFlowNameList);
        this.setParamSimple(map, prefix + "TaskNameList", this.TaskNameList);
        this.setParamSimple(map, prefix + "TaskIdList", this.TaskIdList);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "SortItem", this.SortItem);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "InChargeList", this.InChargeList);
        this.setParamSimple(map, prefix + "TaskTypeIdList", this.TaskTypeIdList);
        this.setParamSimple(map, prefix + "StatusList", this.StatusList);
        this.setParamSimple(map, prefix + "TaskCycleUnitList", this.TaskCycleUnitList);
        this.setParamSimple(map, prefix + "ProductNameList", this.ProductNameList);
        this.setParamSimple(map, prefix + "SourceServiceId", this.SourceServiceId);
        this.setParamSimple(map, prefix + "SourceServiceType", this.SourceServiceType);
        this.setParamSimple(map, prefix + "TargetServiceId", this.TargetServiceId);
        this.setParamSimple(map, prefix + "TargetServiceType", this.TargetServiceType);
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "ExecutorGroupIdList", this.ExecutorGroupIdList);
        this.setParamArrayObj(map, prefix + "TaskTags.", this.TaskTags);
        this.setParamSimple(map, prefix + "KeyWord", this.KeyWord);
        this.setParamSimple(map, prefix + "InitStrategy", this.InitStrategy);
        this.setParamArraySimple(map, prefix + "RequestResourceTypes.", this.RequestResourceTypes);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "BlackTaskIdList.", this.BlackTaskIdList);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);

    }
}

