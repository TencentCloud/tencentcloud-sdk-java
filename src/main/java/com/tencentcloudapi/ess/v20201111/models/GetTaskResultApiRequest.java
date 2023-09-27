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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTaskResultApiRequest extends AbstractModel{

    /**
    * 转换任务Id，通过接口<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务接口</a>或<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateMergeFileTask" target="_blank">创建多文件转换任务接口</a>
得到的转换任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 暂未开放
    */
    @SerializedName("Organization")
    @Expose
    private OrganizationInfo Organization;

    /**
     * Get 转换任务Id，通过接口<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务接口</a>或<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateMergeFileTask" target="_blank">创建多文件转换任务接口</a>
得到的转换任务id 
     * @return TaskId 转换任务Id，通过接口<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务接口</a>或<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateMergeFileTask" target="_blank">创建多文件转换任务接口</a>
得到的转换任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 转换任务Id，通过接口<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务接口</a>或<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateMergeFileTask" target="_blank">创建多文件转换任务接口</a>
得到的转换任务id
     * @param TaskId 转换任务Id，通过接口<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateConvertTaskApi" target="_blank">创建文件转换任务接口</a>或<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/CreateMergeFileTask" target="_blank">创建多文件转换任务接口</a>
得到的转换任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。 
     * @return Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
     * @param Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。 
     * @return Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     * @param Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 暂未开放 
     * @return Organization 暂未开放
     * @deprecated
     */
    @Deprecated
    public OrganizationInfo getOrganization() {
        return this.Organization;
    }

    /**
     * Set 暂未开放
     * @param Organization 暂未开放
     * @deprecated
     */
    @Deprecated
    public void setOrganization(OrganizationInfo Organization) {
        this.Organization = Organization;
    }

    public GetTaskResultApiRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTaskResultApiRequest(GetTaskResultApiRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Organization != null) {
            this.Organization = new OrganizationInfo(source.Organization);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamObj(map, prefix + "Organization.", this.Organization);

    }
}

