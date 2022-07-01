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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskInstancesRequest extends AbstractModel{

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 页号，默认为1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 页大小，默认为10，最大不超过200
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 工作流id列表
    */
    @SerializedName("WorkflowIdList")
    @Expose
    private String [] WorkflowIdList;

    /**
    * 工作流名称列表，支持模糊搜索
    */
    @SerializedName("WorkflowNameList")
    @Expose
    private String [] WorkflowNameList;

    /**
    * 起始数据时间，格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("DateFrom")
    @Expose
    private String DateFrom;

    /**
    * 结束数据时间，格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("DateTo")
    @Expose
    private String DateTo;

    /**
    * 任务id列表
    */
    @SerializedName("TaskIdList")
    @Expose
    private String [] TaskIdList;

    /**
    * 任务名称列表，支持模糊搜索
    */
    @SerializedName("TaskNameList")
    @Expose
    private String [] TaskNameList;

    /**
    * 责任人名称列表
    */
    @SerializedName("InChargeList")
    @Expose
    private String [] InChargeList;

    /**
    * 任务类型码列表，26离线同步，30Python，31PySpark，32DLC，33Impala，34Hive SQL，35Shell，36Spark SQL，39Spark，40CDW PG，92MapReduce
    */
    @SerializedName("TaskTypeIdList")
    @Expose
    private Long [] TaskTypeIdList;

    /**
    * 实例状态列表，0等待事件，1等待上游，2等待运行，3运行中，4正在终止，5失败重试，6失败，7成功
    */
    @SerializedName("StateList")
    @Expose
    private String [] StateList;

    /**
    * 周期类型列表，I分钟，H小时，D天，W周，M月，Y年，O一次性，C crontab
    */
    @SerializedName("TaskCycleUnitList")
    @Expose
    private String [] TaskCycleUnitList;

    /**
    * 实例类型，0补录实例，1周期实例，2非周期实例
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * 排序字段信息列表，ScheduleDateTime / CostTime / StartTime / EndTime
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

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
     * Get 页号，默认为1 
     * @return PageNumber 页号，默认为1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页号，默认为1
     * @param PageNumber 页号，默认为1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 页大小，默认为10，最大不超过200 
     * @return PageSize 页大小，默认为10，最大不超过200
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页大小，默认为10，最大不超过200
     * @param PageSize 页大小，默认为10，最大不超过200
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 工作流id列表 
     * @return WorkflowIdList 工作流id列表
     */
    public String [] getWorkflowIdList() {
        return this.WorkflowIdList;
    }

    /**
     * Set 工作流id列表
     * @param WorkflowIdList 工作流id列表
     */
    public void setWorkflowIdList(String [] WorkflowIdList) {
        this.WorkflowIdList = WorkflowIdList;
    }

    /**
     * Get 工作流名称列表，支持模糊搜索 
     * @return WorkflowNameList 工作流名称列表，支持模糊搜索
     */
    public String [] getWorkflowNameList() {
        return this.WorkflowNameList;
    }

    /**
     * Set 工作流名称列表，支持模糊搜索
     * @param WorkflowNameList 工作流名称列表，支持模糊搜索
     */
    public void setWorkflowNameList(String [] WorkflowNameList) {
        this.WorkflowNameList = WorkflowNameList;
    }

    /**
     * Get 起始数据时间，格式yyyy-MM-dd HH:mm:ss 
     * @return DateFrom 起始数据时间，格式yyyy-MM-dd HH:mm:ss
     */
    public String getDateFrom() {
        return this.DateFrom;
    }

    /**
     * Set 起始数据时间，格式yyyy-MM-dd HH:mm:ss
     * @param DateFrom 起始数据时间，格式yyyy-MM-dd HH:mm:ss
     */
    public void setDateFrom(String DateFrom) {
        this.DateFrom = DateFrom;
    }

    /**
     * Get 结束数据时间，格式yyyy-MM-dd HH:mm:ss 
     * @return DateTo 结束数据时间，格式yyyy-MM-dd HH:mm:ss
     */
    public String getDateTo() {
        return this.DateTo;
    }

    /**
     * Set 结束数据时间，格式yyyy-MM-dd HH:mm:ss
     * @param DateTo 结束数据时间，格式yyyy-MM-dd HH:mm:ss
     */
    public void setDateTo(String DateTo) {
        this.DateTo = DateTo;
    }

    /**
     * Get 任务id列表 
     * @return TaskIdList 任务id列表
     */
    public String [] getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set 任务id列表
     * @param TaskIdList 任务id列表
     */
    public void setTaskIdList(String [] TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    /**
     * Get 任务名称列表，支持模糊搜索 
     * @return TaskNameList 任务名称列表，支持模糊搜索
     */
    public String [] getTaskNameList() {
        return this.TaskNameList;
    }

    /**
     * Set 任务名称列表，支持模糊搜索
     * @param TaskNameList 任务名称列表，支持模糊搜索
     */
    public void setTaskNameList(String [] TaskNameList) {
        this.TaskNameList = TaskNameList;
    }

    /**
     * Get 责任人名称列表 
     * @return InChargeList 责任人名称列表
     */
    public String [] getInChargeList() {
        return this.InChargeList;
    }

    /**
     * Set 责任人名称列表
     * @param InChargeList 责任人名称列表
     */
    public void setInChargeList(String [] InChargeList) {
        this.InChargeList = InChargeList;
    }

    /**
     * Get 任务类型码列表，26离线同步，30Python，31PySpark，32DLC，33Impala，34Hive SQL，35Shell，36Spark SQL，39Spark，40CDW PG，92MapReduce 
     * @return TaskTypeIdList 任务类型码列表，26离线同步，30Python，31PySpark，32DLC，33Impala，34Hive SQL，35Shell，36Spark SQL，39Spark，40CDW PG，92MapReduce
     */
    public Long [] getTaskTypeIdList() {
        return this.TaskTypeIdList;
    }

    /**
     * Set 任务类型码列表，26离线同步，30Python，31PySpark，32DLC，33Impala，34Hive SQL，35Shell，36Spark SQL，39Spark，40CDW PG，92MapReduce
     * @param TaskTypeIdList 任务类型码列表，26离线同步，30Python，31PySpark，32DLC，33Impala，34Hive SQL，35Shell，36Spark SQL，39Spark，40CDW PG，92MapReduce
     */
    public void setTaskTypeIdList(Long [] TaskTypeIdList) {
        this.TaskTypeIdList = TaskTypeIdList;
    }

    /**
     * Get 实例状态列表，0等待事件，1等待上游，2等待运行，3运行中，4正在终止，5失败重试，6失败，7成功 
     * @return StateList 实例状态列表，0等待事件，1等待上游，2等待运行，3运行中，4正在终止，5失败重试，6失败，7成功
     */
    public String [] getStateList() {
        return this.StateList;
    }

    /**
     * Set 实例状态列表，0等待事件，1等待上游，2等待运行，3运行中，4正在终止，5失败重试，6失败，7成功
     * @param StateList 实例状态列表，0等待事件，1等待上游，2等待运行，3运行中，4正在终止，5失败重试，6失败，7成功
     */
    public void setStateList(String [] StateList) {
        this.StateList = StateList;
    }

    /**
     * Get 周期类型列表，I分钟，H小时，D天，W周，M月，Y年，O一次性，C crontab 
     * @return TaskCycleUnitList 周期类型列表，I分钟，H小时，D天，W周，M月，Y年，O一次性，C crontab
     */
    public String [] getTaskCycleUnitList() {
        return this.TaskCycleUnitList;
    }

    /**
     * Set 周期类型列表，I分钟，H小时，D天，W周，M月，Y年，O一次性，C crontab
     * @param TaskCycleUnitList 周期类型列表，I分钟，H小时，D天，W周，M月，Y年，O一次性，C crontab
     */
    public void setTaskCycleUnitList(String [] TaskCycleUnitList) {
        this.TaskCycleUnitList = TaskCycleUnitList;
    }

    /**
     * Get 实例类型，0补录实例，1周期实例，2非周期实例 
     * @return InstanceType 实例类型，0补录实例，1周期实例，2非周期实例
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型，0补录实例，1周期实例，2非周期实例
     * @param InstanceType 实例类型，0补录实例，1周期实例，2非周期实例
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 排序字段信息列表，ScheduleDateTime / CostTime / StartTime / EndTime 
     * @return OrderFields 排序字段信息列表，ScheduleDateTime / CostTime / StartTime / EndTime
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 排序字段信息列表，ScheduleDateTime / CostTime / StartTime / EndTime
     * @param OrderFields 排序字段信息列表，ScheduleDateTime / CostTime / StartTime / EndTime
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    public DescribeTaskInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskInstancesRequest(DescribeTaskInstancesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.WorkflowIdList != null) {
            this.WorkflowIdList = new String[source.WorkflowIdList.length];
            for (int i = 0; i < source.WorkflowIdList.length; i++) {
                this.WorkflowIdList[i] = new String(source.WorkflowIdList[i]);
            }
        }
        if (source.WorkflowNameList != null) {
            this.WorkflowNameList = new String[source.WorkflowNameList.length];
            for (int i = 0; i < source.WorkflowNameList.length; i++) {
                this.WorkflowNameList[i] = new String(source.WorkflowNameList[i]);
            }
        }
        if (source.DateFrom != null) {
            this.DateFrom = new String(source.DateFrom);
        }
        if (source.DateTo != null) {
            this.DateTo = new String(source.DateTo);
        }
        if (source.TaskIdList != null) {
            this.TaskIdList = new String[source.TaskIdList.length];
            for (int i = 0; i < source.TaskIdList.length; i++) {
                this.TaskIdList[i] = new String(source.TaskIdList[i]);
            }
        }
        if (source.TaskNameList != null) {
            this.TaskNameList = new String[source.TaskNameList.length];
            for (int i = 0; i < source.TaskNameList.length; i++) {
                this.TaskNameList[i] = new String(source.TaskNameList[i]);
            }
        }
        if (source.InChargeList != null) {
            this.InChargeList = new String[source.InChargeList.length];
            for (int i = 0; i < source.InChargeList.length; i++) {
                this.InChargeList[i] = new String(source.InChargeList[i]);
            }
        }
        if (source.TaskTypeIdList != null) {
            this.TaskTypeIdList = new Long[source.TaskTypeIdList.length];
            for (int i = 0; i < source.TaskTypeIdList.length; i++) {
                this.TaskTypeIdList[i] = new Long(source.TaskTypeIdList[i]);
            }
        }
        if (source.StateList != null) {
            this.StateList = new String[source.StateList.length];
            for (int i = 0; i < source.StateList.length; i++) {
                this.StateList[i] = new String(source.StateList[i]);
            }
        }
        if (source.TaskCycleUnitList != null) {
            this.TaskCycleUnitList = new String[source.TaskCycleUnitList.length];
            for (int i = 0; i < source.TaskCycleUnitList.length; i++) {
                this.TaskCycleUnitList[i] = new String(source.TaskCycleUnitList[i]);
            }
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "WorkflowIdList.", this.WorkflowIdList);
        this.setParamArraySimple(map, prefix + "WorkflowNameList.", this.WorkflowNameList);
        this.setParamSimple(map, prefix + "DateFrom", this.DateFrom);
        this.setParamSimple(map, prefix + "DateTo", this.DateTo);
        this.setParamArraySimple(map, prefix + "TaskIdList.", this.TaskIdList);
        this.setParamArraySimple(map, prefix + "TaskNameList.", this.TaskNameList);
        this.setParamArraySimple(map, prefix + "InChargeList.", this.InChargeList);
        this.setParamArraySimple(map, prefix + "TaskTypeIdList.", this.TaskTypeIdList);
        this.setParamArraySimple(map, prefix + "StateList.", this.StateList);
        this.setParamArraySimple(map, prefix + "TaskCycleUnitList.", this.TaskCycleUnitList);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);

    }
}

