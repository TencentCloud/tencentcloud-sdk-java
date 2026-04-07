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

public class ExportContractReviewResultRequest extends AbstractModel {

    /**
    * <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>合同审查任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>导出文件类型</p><p>枚举值：</p><ul><li>1： WORD、PDF当前带风险批注文件</li><li>2： 审查结果＆摘要（.xIsx）</li><li>3： WORD、PDF审查合同内容时的文件（最原始文件）</li><li>4： WORD、PDF当前无风险批注文件</li></ul>
    */
    @SerializedName("FileType")
    @Expose
    private Long FileType;

    /**
    * <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p> 
     * @return Operator <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     * @param Operator <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>合同审查任务ID</p> 
     * @return TaskId <p>合同审查任务ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>合同审查任务ID</p>
     * @param TaskId <p>合同审查任务ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>导出文件类型</p><p>枚举值：</p><ul><li>1： WORD、PDF当前带风险批注文件</li><li>2： 审查结果＆摘要（.xIsx）</li><li>3： WORD、PDF审查合同内容时的文件（最原始文件）</li><li>4： WORD、PDF当前无风险批注文件</li></ul> 
     * @return FileType <p>导出文件类型</p><p>枚举值：</p><ul><li>1： WORD、PDF当前带风险批注文件</li><li>2： 审查结果＆摘要（.xIsx）</li><li>3： WORD、PDF审查合同内容时的文件（最原始文件）</li><li>4： WORD、PDF当前无风险批注文件</li></ul>
     */
    public Long getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>导出文件类型</p><p>枚举值：</p><ul><li>1： WORD、PDF当前带风险批注文件</li><li>2： 审查结果＆摘要（.xIsx）</li><li>3： WORD、PDF审查合同内容时的文件（最原始文件）</li><li>4： WORD、PDF当前无风险批注文件</li></ul>
     * @param FileType <p>导出文件类型</p><p>枚举值：</p><ul><li>1： WORD、PDF当前带风险批注文件</li><li>2： 审查结果＆摘要（.xIsx）</li><li>3： WORD、PDF审查合同内容时的文件（最原始文件）</li><li>4： WORD、PDF当前无风险批注文件</li></ul>
     */
    public void setFileType(Long FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p> 
     * @return Agent <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     * @param Agent <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    public ExportContractReviewResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportContractReviewResultRequest(ExportContractReviewResultRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.FileType != null) {
            this.FileType = new Long(source.FileType);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

