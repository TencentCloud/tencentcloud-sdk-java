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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTasksRequest extends AbstractModel {

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>请求的数据页数。默认值为1，取值大于等于1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页显示的数据条数。默认值为10 ，最小值为10，最大值为200</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>所属工作流ID</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>责任人ID</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>任务类型</p>
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * <p>任务状态</p><ul><li>N: 新建 </li><li>Y: 调度中 </li><li>F: 已下线 </li><li>O: 已暂停 </li><li>T: 下线中 </li><li>INVALID: 已失效</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>提交状态</p>
    */
    @SerializedName("Submit")
    @Expose
    private Boolean Submit;

    /**
    * <p>BundleId信息</p>
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * <p>创建人ID</p>
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * <p>修改时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String [] ModifyTime;

    /**
    * <p>创建时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String [] CreateTime;

    /**
    * <p>任务文件夹路径列表，支持多选，从工作流下的目录开始填写，节点类型无需填写。选择上层文件夹时，自动包含所有子文件夹下的任务。 路径格式为绝对路径，如 &quot;/子目录A&quot;，根目录为 &quot;/&quot;</p>
    */
    @SerializedName("TaskFolderPathList")
    @Expose
    private String [] TaskFolderPathList;

    /**
    * <p>工作流文件夹路径列表，支持多选。选择上层文件夹时，自动包含所有子文件夹下工作流的任务。 路径格式为绝对路径，如 &quot;/数据开发/子目录&quot;，根目录为 &quot;/&quot;。</p>
    */
    @SerializedName("WorkflowFolderPathList")
    @Expose
    private String [] WorkflowFolderPathList;

    /**
    * <p>节点类型列表，用于按任务节点分类筛选，支持多选， 可选值参考下面枚举类型 。 传入后将根据这些节点类型包含的任务类型ID列表进行筛选。</p><p>枚举值：</p><ul><li>ETL： 数据集成节点</li><li>EMR： EMR节点</li><li>DLC： DLC节点</li><li>SETATS： SETATS节点</li><li>TDSQL： TDSQL节点</li><li>TCHOUSE： TCHOUSE节点</li><li>GENERAL： 通用节点</li><li>DATA_QUALITY： 数据质量节点</li><li>INDICATOR： 指标节点</li><li>TI_ONE： TI-ONE机器学习节点</li></ul>
    */
    @SerializedName("TaskNodeTypeList")
    @Expose
    private String [] TaskNodeTypeList;

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>请求的数据页数。默认值为1，取值大于等于1</p> 
     * @return PageNumber <p>请求的数据页数。默认值为1，取值大于等于1</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>请求的数据页数。默认值为1，取值大于等于1</p>
     * @param PageNumber <p>请求的数据页数。默认值为1，取值大于等于1</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页显示的数据条数。默认值为10 ，最小值为10，最大值为200</p> 
     * @return PageSize <p>每页显示的数据条数。默认值为10 ，最小值为10，最大值为200</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页显示的数据条数。默认值为10 ，最小值为10，最大值为200</p>
     * @param PageSize <p>每页显示的数据条数。默认值为10 ，最小值为10，最大值为200</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>任务名称</p> 
     * @return TaskName <p>任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
     * @param TaskName <p>任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>所属工作流ID</p> 
     * @return WorkflowId <p>所属工作流ID</p>
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>所属工作流ID</p>
     * @param WorkflowId <p>所属工作流ID</p>
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>责任人ID</p> 
     * @return OwnerUin <p>责任人ID</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>责任人ID</p>
     * @param OwnerUin <p>责任人ID</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>任务类型</p> 
     * @return TaskTypeId <p>任务类型</p>
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set <p>任务类型</p>
     * @param TaskTypeId <p>任务类型</p>
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get <p>任务状态</p><ul><li>N: 新建 </li><li>Y: 调度中 </li><li>F: 已下线 </li><li>O: 已暂停 </li><li>T: 下线中 </li><li>INVALID: 已失效</li></ul> 
     * @return Status <p>任务状态</p><ul><li>N: 新建 </li><li>Y: 调度中 </li><li>F: 已下线 </li><li>O: 已暂停 </li><li>T: 下线中 </li><li>INVALID: 已失效</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p><ul><li>N: 新建 </li><li>Y: 调度中 </li><li>F: 已下线 </li><li>O: 已暂停 </li><li>T: 下线中 </li><li>INVALID: 已失效</li></ul>
     * @param Status <p>任务状态</p><ul><li>N: 新建 </li><li>Y: 调度中 </li><li>F: 已下线 </li><li>O: 已暂停 </li><li>T: 下线中 </li><li>INVALID: 已失效</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>提交状态</p> 
     * @return Submit <p>提交状态</p>
     */
    public Boolean getSubmit() {
        return this.Submit;
    }

    /**
     * Set <p>提交状态</p>
     * @param Submit <p>提交状态</p>
     */
    public void setSubmit(Boolean Submit) {
        this.Submit = Submit;
    }

    /**
     * Get <p>BundleId信息</p> 
     * @return BundleId <p>BundleId信息</p>
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set <p>BundleId信息</p>
     * @param BundleId <p>BundleId信息</p>
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get <p>创建人ID</p> 
     * @return CreateUserUin <p>创建人ID</p>
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set <p>创建人ID</p>
     * @param CreateUserUin <p>创建人ID</p>
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get <p>修改时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间</p> 
     * @return ModifyTime <p>修改时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间</p>
     */
    public String [] getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>修改时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间</p>
     * @param ModifyTime <p>修改时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间</p>
     */
    public void setModifyTime(String [] ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>创建时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间</p> 
     * @return CreateTime <p>创建时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间</p>
     */
    public String [] getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间</p>
     * @param CreateTime <p>创建时间区间 yyyy-MM-dd HH:mm:ss，需要在数组填入两个时间</p>
     */
    public void setCreateTime(String [] CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>任务文件夹路径列表，支持多选，从工作流下的目录开始填写，节点类型无需填写。选择上层文件夹时，自动包含所有子文件夹下的任务。 路径格式为绝对路径，如 &quot;/子目录A&quot;，根目录为 &quot;/&quot;</p> 
     * @return TaskFolderPathList <p>任务文件夹路径列表，支持多选，从工作流下的目录开始填写，节点类型无需填写。选择上层文件夹时，自动包含所有子文件夹下的任务。 路径格式为绝对路径，如 &quot;/子目录A&quot;，根目录为 &quot;/&quot;</p>
     */
    public String [] getTaskFolderPathList() {
        return this.TaskFolderPathList;
    }

    /**
     * Set <p>任务文件夹路径列表，支持多选，从工作流下的目录开始填写，节点类型无需填写。选择上层文件夹时，自动包含所有子文件夹下的任务。 路径格式为绝对路径，如 &quot;/子目录A&quot;，根目录为 &quot;/&quot;</p>
     * @param TaskFolderPathList <p>任务文件夹路径列表，支持多选，从工作流下的目录开始填写，节点类型无需填写。选择上层文件夹时，自动包含所有子文件夹下的任务。 路径格式为绝对路径，如 &quot;/子目录A&quot;，根目录为 &quot;/&quot;</p>
     */
    public void setTaskFolderPathList(String [] TaskFolderPathList) {
        this.TaskFolderPathList = TaskFolderPathList;
    }

    /**
     * Get <p>工作流文件夹路径列表，支持多选。选择上层文件夹时，自动包含所有子文件夹下工作流的任务。 路径格式为绝对路径，如 &quot;/数据开发/子目录&quot;，根目录为 &quot;/&quot;。</p> 
     * @return WorkflowFolderPathList <p>工作流文件夹路径列表，支持多选。选择上层文件夹时，自动包含所有子文件夹下工作流的任务。 路径格式为绝对路径，如 &quot;/数据开发/子目录&quot;，根目录为 &quot;/&quot;。</p>
     */
    public String [] getWorkflowFolderPathList() {
        return this.WorkflowFolderPathList;
    }

    /**
     * Set <p>工作流文件夹路径列表，支持多选。选择上层文件夹时，自动包含所有子文件夹下工作流的任务。 路径格式为绝对路径，如 &quot;/数据开发/子目录&quot;，根目录为 &quot;/&quot;。</p>
     * @param WorkflowFolderPathList <p>工作流文件夹路径列表，支持多选。选择上层文件夹时，自动包含所有子文件夹下工作流的任务。 路径格式为绝对路径，如 &quot;/数据开发/子目录&quot;，根目录为 &quot;/&quot;。</p>
     */
    public void setWorkflowFolderPathList(String [] WorkflowFolderPathList) {
        this.WorkflowFolderPathList = WorkflowFolderPathList;
    }

    /**
     * Get <p>节点类型列表，用于按任务节点分类筛选，支持多选， 可选值参考下面枚举类型 。 传入后将根据这些节点类型包含的任务类型ID列表进行筛选。</p><p>枚举值：</p><ul><li>ETL： 数据集成节点</li><li>EMR： EMR节点</li><li>DLC： DLC节点</li><li>SETATS： SETATS节点</li><li>TDSQL： TDSQL节点</li><li>TCHOUSE： TCHOUSE节点</li><li>GENERAL： 通用节点</li><li>DATA_QUALITY： 数据质量节点</li><li>INDICATOR： 指标节点</li><li>TI_ONE： TI-ONE机器学习节点</li></ul> 
     * @return TaskNodeTypeList <p>节点类型列表，用于按任务节点分类筛选，支持多选， 可选值参考下面枚举类型 。 传入后将根据这些节点类型包含的任务类型ID列表进行筛选。</p><p>枚举值：</p><ul><li>ETL： 数据集成节点</li><li>EMR： EMR节点</li><li>DLC： DLC节点</li><li>SETATS： SETATS节点</li><li>TDSQL： TDSQL节点</li><li>TCHOUSE： TCHOUSE节点</li><li>GENERAL： 通用节点</li><li>DATA_QUALITY： 数据质量节点</li><li>INDICATOR： 指标节点</li><li>TI_ONE： TI-ONE机器学习节点</li></ul>
     */
    public String [] getTaskNodeTypeList() {
        return this.TaskNodeTypeList;
    }

    /**
     * Set <p>节点类型列表，用于按任务节点分类筛选，支持多选， 可选值参考下面枚举类型 。 传入后将根据这些节点类型包含的任务类型ID列表进行筛选。</p><p>枚举值：</p><ul><li>ETL： 数据集成节点</li><li>EMR： EMR节点</li><li>DLC： DLC节点</li><li>SETATS： SETATS节点</li><li>TDSQL： TDSQL节点</li><li>TCHOUSE： TCHOUSE节点</li><li>GENERAL： 通用节点</li><li>DATA_QUALITY： 数据质量节点</li><li>INDICATOR： 指标节点</li><li>TI_ONE： TI-ONE机器学习节点</li></ul>
     * @param TaskNodeTypeList <p>节点类型列表，用于按任务节点分类筛选，支持多选， 可选值参考下面枚举类型 。 传入后将根据这些节点类型包含的任务类型ID列表进行筛选。</p><p>枚举值：</p><ul><li>ETL： 数据集成节点</li><li>EMR： EMR节点</li><li>DLC： DLC节点</li><li>SETATS： SETATS节点</li><li>TDSQL： TDSQL节点</li><li>TCHOUSE： TCHOUSE节点</li><li>GENERAL： 通用节点</li><li>DATA_QUALITY： 数据质量节点</li><li>INDICATOR： 指标节点</li><li>TI_ONE： TI-ONE机器学习节点</li></ul>
     */
    public void setTaskNodeTypeList(String [] TaskNodeTypeList) {
        this.TaskNodeTypeList = TaskNodeTypeList;
    }

    public ListTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTasksRequest(ListTasksRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Submit != null) {
            this.Submit = new Boolean(source.Submit);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String[source.ModifyTime.length];
            for (int i = 0; i < source.ModifyTime.length; i++) {
                this.ModifyTime[i] = new String(source.ModifyTime[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String[source.CreateTime.length];
            for (int i = 0; i < source.CreateTime.length; i++) {
                this.CreateTime[i] = new String(source.CreateTime[i]);
            }
        }
        if (source.TaskFolderPathList != null) {
            this.TaskFolderPathList = new String[source.TaskFolderPathList.length];
            for (int i = 0; i < source.TaskFolderPathList.length; i++) {
                this.TaskFolderPathList[i] = new String(source.TaskFolderPathList[i]);
            }
        }
        if (source.WorkflowFolderPathList != null) {
            this.WorkflowFolderPathList = new String[source.WorkflowFolderPathList.length];
            for (int i = 0; i < source.WorkflowFolderPathList.length; i++) {
                this.WorkflowFolderPathList[i] = new String(source.WorkflowFolderPathList[i]);
            }
        }
        if (source.TaskNodeTypeList != null) {
            this.TaskNodeTypeList = new String[source.TaskNodeTypeList.length];
            for (int i = 0; i < source.TaskNodeTypeList.length; i++) {
                this.TaskNodeTypeList[i] = new String(source.TaskNodeTypeList[i]);
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
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Submit", this.Submit);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamArraySimple(map, prefix + "ModifyTime.", this.ModifyTime);
        this.setParamArraySimple(map, prefix + "CreateTime.", this.CreateTime);
        this.setParamArraySimple(map, prefix + "TaskFolderPathList.", this.TaskFolderPathList);
        this.setParamArraySimple(map, prefix + "WorkflowFolderPathList.", this.WorkflowFolderPathList);
        this.setParamArraySimple(map, prefix + "TaskNodeTypeList.", this.TaskNodeTypeList);

    }
}

