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

public class CreateFlowEvidenceReportRequest extends AbstractModel {

    /**
    * <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>合同流程ID，为32位字符串。<br>可登录腾讯电子签控制台，在 &quot;合同&quot;-&gt;&quot;合同中心&quot; 中查看某个合同的FlowId(在页面中展示为合同ID)。</p>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>指定申请的报告类型，可选类型如下：<ul><li> <strong>0</strong> :合同签署报告（默认）</li></ul></p><p>枚举值：</p><ul><li>0： 合同签署报告</li></ul>
    */
    @SerializedName("ReportType")
    @Expose
    private Long ReportType;

    /**
    * <p>混合云模式获取合同文件合并出证，默认：不同意。注：此参数需要联系腾讯电子签运营进行开通后生效</p>
    */
    @SerializedName("HybridEvidenceFlowFile")
    @Expose
    private Boolean HybridEvidenceFlowFile;

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
     * Get <p>合同流程ID，为32位字符串。<br>可登录腾讯电子签控制台，在 &quot;合同&quot;-&gt;&quot;合同中心&quot; 中查看某个合同的FlowId(在页面中展示为合同ID)。</p> 
     * @return FlowId <p>合同流程ID，为32位字符串。<br>可登录腾讯电子签控制台，在 &quot;合同&quot;-&gt;&quot;合同中心&quot; 中查看某个合同的FlowId(在页面中展示为合同ID)。</p>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>合同流程ID，为32位字符串。<br>可登录腾讯电子签控制台，在 &quot;合同&quot;-&gt;&quot;合同中心&quot; 中查看某个合同的FlowId(在页面中展示为合同ID)。</p>
     * @param FlowId <p>合同流程ID，为32位字符串。<br>可登录腾讯电子签控制台，在 &quot;合同&quot;-&gt;&quot;合同中心&quot; 中查看某个合同的FlowId(在页面中展示为合同ID)。</p>
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
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

    /**
     * Get <p>指定申请的报告类型，可选类型如下：<ul><li> <strong>0</strong> :合同签署报告（默认）</li></ul></p><p>枚举值：</p><ul><li>0： 合同签署报告</li></ul> 
     * @return ReportType <p>指定申请的报告类型，可选类型如下：<ul><li> <strong>0</strong> :合同签署报告（默认）</li></ul></p><p>枚举值：</p><ul><li>0： 合同签署报告</li></ul>
     */
    public Long getReportType() {
        return this.ReportType;
    }

    /**
     * Set <p>指定申请的报告类型，可选类型如下：<ul><li> <strong>0</strong> :合同签署报告（默认）</li></ul></p><p>枚举值：</p><ul><li>0： 合同签署报告</li></ul>
     * @param ReportType <p>指定申请的报告类型，可选类型如下：<ul><li> <strong>0</strong> :合同签署报告（默认）</li></ul></p><p>枚举值：</p><ul><li>0： 合同签署报告</li></ul>
     */
    public void setReportType(Long ReportType) {
        this.ReportType = ReportType;
    }

    /**
     * Get <p>混合云模式获取合同文件合并出证，默认：不同意。注：此参数需要联系腾讯电子签运营进行开通后生效</p> 
     * @return HybridEvidenceFlowFile <p>混合云模式获取合同文件合并出证，默认：不同意。注：此参数需要联系腾讯电子签运营进行开通后生效</p>
     */
    public Boolean getHybridEvidenceFlowFile() {
        return this.HybridEvidenceFlowFile;
    }

    /**
     * Set <p>混合云模式获取合同文件合并出证，默认：不同意。注：此参数需要联系腾讯电子签运营进行开通后生效</p>
     * @param HybridEvidenceFlowFile <p>混合云模式获取合同文件合并出证，默认：不同意。注：此参数需要联系腾讯电子签运营进行开通后生效</p>
     */
    public void setHybridEvidenceFlowFile(Boolean HybridEvidenceFlowFile) {
        this.HybridEvidenceFlowFile = HybridEvidenceFlowFile;
    }

    public CreateFlowEvidenceReportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowEvidenceReportRequest(CreateFlowEvidenceReportRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.ReportType != null) {
            this.ReportType = new Long(source.ReportType);
        }
        if (source.HybridEvidenceFlowFile != null) {
            this.HybridEvidenceFlowFile = new Boolean(source.HybridEvidenceFlowFile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "ReportType", this.ReportType);
        this.setParamSimple(map, prefix + "HybridEvidenceFlowFile", this.HybridEvidenceFlowFile);

    }
}

