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

public class OperateFlowRemarksRequest extends AbstractModel {

    /**
    * <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>操作类型，可取值如下:</p><ul><li>DELETE:  删除</li><li>ENABLE: 启用</li><li>DISABLE: 停用</li><li>COPY: 复制新建</li></ul>
    */
    @SerializedName("OperateType")
    @Expose
    private String OperateType;

    /**
    * <p>对应的合同流程id</p><p>目标合同为合同组时此参数不填</p>
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
    * <p>对应合同组id</p><p>目标合同为单份合同时此参数不填</p>
    */
    @SerializedName("FlowGroupId")
    @Expose
    private String FlowGroupId;

    /**
    * <p>合同备注信息。</p><p>入参限制：当OperateType为UPDATE和DELETE时，通过该结构体进行对应备注操作，合同备注数量范围为 1 - 5个。</p>
    */
    @SerializedName("FlowItem")
    @Expose
    private FlowRemarkItem FlowItem;

    /**
    * <p>合同备注列表。</p><p>入参限制：当OperateType为CREATE时，通过该参数进行全量的合同备注创建。</p>
    */
    @SerializedName("FlowItems")
    @Expose
    private String [] FlowItems;

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
     * Get <p>操作类型，可取值如下:</p><ul><li>DELETE:  删除</li><li>ENABLE: 启用</li><li>DISABLE: 停用</li><li>COPY: 复制新建</li></ul> 
     * @return OperateType <p>操作类型，可取值如下:</p><ul><li>DELETE:  删除</li><li>ENABLE: 启用</li><li>DISABLE: 停用</li><li>COPY: 复制新建</li></ul>
     */
    public String getOperateType() {
        return this.OperateType;
    }

    /**
     * Set <p>操作类型，可取值如下:</p><ul><li>DELETE:  删除</li><li>ENABLE: 启用</li><li>DISABLE: 停用</li><li>COPY: 复制新建</li></ul>
     * @param OperateType <p>操作类型，可取值如下:</p><ul><li>DELETE:  删除</li><li>ENABLE: 启用</li><li>DISABLE: 停用</li><li>COPY: 复制新建</li></ul>
     */
    public void setOperateType(String OperateType) {
        this.OperateType = OperateType;
    }

    /**
     * Get <p>对应的合同流程id</p><p>目标合同为合同组时此参数不填</p> 
     * @return FlowId <p>对应的合同流程id</p><p>目标合同为合同组时此参数不填</p>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>对应的合同流程id</p><p>目标合同为合同组时此参数不填</p>
     * @param FlowId <p>对应的合同流程id</p><p>目标合同为合同组时此参数不填</p>
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
     * Get <p>对应合同组id</p><p>目标合同为单份合同时此参数不填</p> 
     * @return FlowGroupId <p>对应合同组id</p><p>目标合同为单份合同时此参数不填</p>
     */
    public String getFlowGroupId() {
        return this.FlowGroupId;
    }

    /**
     * Set <p>对应合同组id</p><p>目标合同为单份合同时此参数不填</p>
     * @param FlowGroupId <p>对应合同组id</p><p>目标合同为单份合同时此参数不填</p>
     */
    public void setFlowGroupId(String FlowGroupId) {
        this.FlowGroupId = FlowGroupId;
    }

    /**
     * Get <p>合同备注信息。</p><p>入参限制：当OperateType为UPDATE和DELETE时，通过该结构体进行对应备注操作，合同备注数量范围为 1 - 5个。</p> 
     * @return FlowItem <p>合同备注信息。</p><p>入参限制：当OperateType为UPDATE和DELETE时，通过该结构体进行对应备注操作，合同备注数量范围为 1 - 5个。</p>
     */
    public FlowRemarkItem getFlowItem() {
        return this.FlowItem;
    }

    /**
     * Set <p>合同备注信息。</p><p>入参限制：当OperateType为UPDATE和DELETE时，通过该结构体进行对应备注操作，合同备注数量范围为 1 - 5个。</p>
     * @param FlowItem <p>合同备注信息。</p><p>入参限制：当OperateType为UPDATE和DELETE时，通过该结构体进行对应备注操作，合同备注数量范围为 1 - 5个。</p>
     */
    public void setFlowItem(FlowRemarkItem FlowItem) {
        this.FlowItem = FlowItem;
    }

    /**
     * Get <p>合同备注列表。</p><p>入参限制：当OperateType为CREATE时，通过该参数进行全量的合同备注创建。</p> 
     * @return FlowItems <p>合同备注列表。</p><p>入参限制：当OperateType为CREATE时，通过该参数进行全量的合同备注创建。</p>
     */
    public String [] getFlowItems() {
        return this.FlowItems;
    }

    /**
     * Set <p>合同备注列表。</p><p>入参限制：当OperateType为CREATE时，通过该参数进行全量的合同备注创建。</p>
     * @param FlowItems <p>合同备注列表。</p><p>入参限制：当OperateType为CREATE时，通过该参数进行全量的合同备注创建。</p>
     */
    public void setFlowItems(String [] FlowItems) {
        this.FlowItems = FlowItems;
    }

    public OperateFlowRemarksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperateFlowRemarksRequest(OperateFlowRemarksRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.OperateType != null) {
            this.OperateType = new String(source.OperateType);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FlowGroupId != null) {
            this.FlowGroupId = new String(source.FlowGroupId);
        }
        if (source.FlowItem != null) {
            this.FlowItem = new FlowRemarkItem(source.FlowItem);
        }
        if (source.FlowItems != null) {
            this.FlowItems = new String[source.FlowItems.length];
            for (int i = 0; i < source.FlowItems.length; i++) {
                this.FlowItems[i] = new String(source.FlowItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "OperateType", this.OperateType);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "FlowGroupId", this.FlowGroupId);
        this.setParamObj(map, prefix + "FlowItem.", this.FlowItem);
        this.setParamArraySimple(map, prefix + "FlowItems.", this.FlowItems);

    }
}

