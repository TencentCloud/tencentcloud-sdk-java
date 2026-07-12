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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportContractComparisonTaskRequest extends AbstractModel {

    /**
    * <p>执行合同审查任务的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>合同对比任务ID，该参数通过调用接口CreateContractComparisonTask获取。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>导出对比结果文件类型。<br>类型如下：</p><ul><li> **0**：【PDF】以新合同文件为基础，导出带有可视化对比点标注的PDF文件。</li><li> **1**：【EXCEL】导出结构化的对比点明细表格，以列表形式罗列每一个差异点，包含改动位置、类型、标签及修改前后的完整内容。</li></ul>
    */
    @SerializedName("ExportType")
    @Expose
    private Long ExportType;

    /**
    * <p>是否忽略，适用于PDF。</p><ul><li> **true**：导出文件标注去掉忽略项。</li><li> **false**：导出文件包含所有对比点。</li></ul>
    */
    @SerializedName("Ignore")
    @Expose
    private Boolean Ignore;

    /**
     * Get <p>执行合同审查任务的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p> 
     * @return Operator <p>执行合同审查任务的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>执行合同审查任务的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     * @param Operator <p>执行合同审查任务的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>合同对比任务ID，该参数通过调用接口CreateContractComparisonTask获取。</p> 
     * @return TaskId <p>合同对比任务ID，该参数通过调用接口CreateContractComparisonTask获取。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>合同对比任务ID，该参数通过调用接口CreateContractComparisonTask获取。</p>
     * @param TaskId <p>合同对比任务ID，该参数通过调用接口CreateContractComparisonTask获取。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>导出对比结果文件类型。<br>类型如下：</p><ul><li> **0**：【PDF】以新合同文件为基础，导出带有可视化对比点标注的PDF文件。</li><li> **1**：【EXCEL】导出结构化的对比点明细表格，以列表形式罗列每一个差异点，包含改动位置、类型、标签及修改前后的完整内容。</li></ul> 
     * @return ExportType <p>导出对比结果文件类型。<br>类型如下：</p><ul><li> **0**：【PDF】以新合同文件为基础，导出带有可视化对比点标注的PDF文件。</li><li> **1**：【EXCEL】导出结构化的对比点明细表格，以列表形式罗列每一个差异点，包含改动位置、类型、标签及修改前后的完整内容。</li></ul>
     */
    public Long getExportType() {
        return this.ExportType;
    }

    /**
     * Set <p>导出对比结果文件类型。<br>类型如下：</p><ul><li> **0**：【PDF】以新合同文件为基础，导出带有可视化对比点标注的PDF文件。</li><li> **1**：【EXCEL】导出结构化的对比点明细表格，以列表形式罗列每一个差异点，包含改动位置、类型、标签及修改前后的完整内容。</li></ul>
     * @param ExportType <p>导出对比结果文件类型。<br>类型如下：</p><ul><li> **0**：【PDF】以新合同文件为基础，导出带有可视化对比点标注的PDF文件。</li><li> **1**：【EXCEL】导出结构化的对比点明细表格，以列表形式罗列每一个差异点，包含改动位置、类型、标签及修改前后的完整内容。</li></ul>
     */
    public void setExportType(Long ExportType) {
        this.ExportType = ExportType;
    }

    /**
     * Get <p>是否忽略，适用于PDF。</p><ul><li> **true**：导出文件标注去掉忽略项。</li><li> **false**：导出文件包含所有对比点。</li></ul> 
     * @return Ignore <p>是否忽略，适用于PDF。</p><ul><li> **true**：导出文件标注去掉忽略项。</li><li> **false**：导出文件包含所有对比点。</li></ul>
     */
    public Boolean getIgnore() {
        return this.Ignore;
    }

    /**
     * Set <p>是否忽略，适用于PDF。</p><ul><li> **true**：导出文件标注去掉忽略项。</li><li> **false**：导出文件包含所有对比点。</li></ul>
     * @param Ignore <p>是否忽略，适用于PDF。</p><ul><li> **true**：导出文件标注去掉忽略项。</li><li> **false**：导出文件包含所有对比点。</li></ul>
     */
    public void setIgnore(Boolean Ignore) {
        this.Ignore = Ignore;
    }

    public ExportContractComparisonTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportContractComparisonTaskRequest(ExportContractComparisonTaskRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ExportType != null) {
            this.ExportType = new Long(source.ExportType);
        }
        if (source.Ignore != null) {
            this.Ignore = new Boolean(source.Ignore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ExportType", this.ExportType);
        this.setParamSimple(map, prefix + "Ignore", this.Ignore);

    }
}

