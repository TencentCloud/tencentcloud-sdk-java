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

public class DescribeCancelFlowsTaskRequest extends AbstractModel {

    /**
    * <p>执行本接口操作的员工信息。<br><br>注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>批量撤销任务编号，为32位字符串，通过接口<a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateBatchCancelFlowUrl">获取批量撤销签署流程腾讯电子签小程序链接</a>和接口<a href="https://qian.tencent.com/developers/companyApis/operateFlows/CancelOrganizationFlows">全量撤销企业合同</a>获得。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>代理企业和员工的信息。<br><br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>撤销任务类型</p><p>枚举值：</p><ul><li>0： 默认类型，获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul><p>枚举值：</p><ul><li>0： 默认类型，批量撤销合同任务或者获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul><p>枚举值：</p><ul><li>0： 默认类型，获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul>
    */
    @SerializedName("CancelType")
    @Expose
    private Long CancelType;

    /**
     * Get <p>执行本接口操作的员工信息。<br><br>注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</p> 
     * @return Operator <p>执行本接口操作的员工信息。<br><br>注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>执行本接口操作的员工信息。<br><br>注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</p>
     * @param Operator <p>执行本接口操作的员工信息。<br><br>注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>批量撤销任务编号，为32位字符串，通过接口<a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateBatchCancelFlowUrl">获取批量撤销签署流程腾讯电子签小程序链接</a>和接口<a href="https://qian.tencent.com/developers/companyApis/operateFlows/CancelOrganizationFlows">全量撤销企业合同</a>获得。</p> 
     * @return TaskId <p>批量撤销任务编号，为32位字符串，通过接口<a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateBatchCancelFlowUrl">获取批量撤销签署流程腾讯电子签小程序链接</a>和接口<a href="https://qian.tencent.com/developers/companyApis/operateFlows/CancelOrganizationFlows">全量撤销企业合同</a>获得。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>批量撤销任务编号，为32位字符串，通过接口<a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateBatchCancelFlowUrl">获取批量撤销签署流程腾讯电子签小程序链接</a>和接口<a href="https://qian.tencent.com/developers/companyApis/operateFlows/CancelOrganizationFlows">全量撤销企业合同</a>获得。</p>
     * @param TaskId <p>批量撤销任务编号，为32位字符串，通过接口<a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateBatchCancelFlowUrl">获取批量撤销签署流程腾讯电子签小程序链接</a>和接口<a href="https://qian.tencent.com/developers/companyApis/operateFlows/CancelOrganizationFlows">全量撤销企业合同</a>获得。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>代理企业和员工的信息。<br><br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p> 
     * @return Agent <p>代理企业和员工的信息。<br><br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>代理企业和员工的信息。<br><br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     * @param Agent <p>代理企业和员工的信息。<br><br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>撤销任务类型</p><p>枚举值：</p><ul><li>0： 默认类型，获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul><p>枚举值：</p><ul><li>0： 默认类型，批量撤销合同任务或者获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul><p>枚举值：</p><ul><li>0： 默认类型，获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul> 
     * @return CancelType <p>撤销任务类型</p><p>枚举值：</p><ul><li>0： 默认类型，获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul><p>枚举值：</p><ul><li>0： 默认类型，批量撤销合同任务或者获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul><p>枚举值：</p><ul><li>0： 默认类型，获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul>
     */
    public Long getCancelType() {
        return this.CancelType;
    }

    /**
     * Set <p>撤销任务类型</p><p>枚举值：</p><ul><li>0： 默认类型，获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul><p>枚举值：</p><ul><li>0： 默认类型，批量撤销合同任务或者获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul><p>枚举值：</p><ul><li>0： 默认类型，获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul>
     * @param CancelType <p>撤销任务类型</p><p>枚举值：</p><ul><li>0： 默认类型，获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul><p>枚举值：</p><ul><li>0： 默认类型，批量撤销合同任务或者获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul><p>枚举值：</p><ul><li>0： 默认类型，获取批量撤销合同小程序链接的批量撤销任务</li><li>1： 全量撤销任务</li></ul>
     */
    public void setCancelType(Long CancelType) {
        this.CancelType = CancelType;
    }

    public DescribeCancelFlowsTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCancelFlowsTaskRequest(DescribeCancelFlowsTaskRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.CancelType != null) {
            this.CancelType = new Long(source.CancelType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "CancelType", this.CancelType);

    }
}

