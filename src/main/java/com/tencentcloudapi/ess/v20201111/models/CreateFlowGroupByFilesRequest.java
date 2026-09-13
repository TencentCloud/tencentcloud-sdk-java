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

public class CreateFlowGroupByFilesRequest extends AbstractModel {

    /**
    * <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>合同（流程）组名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。</p>
    */
    @SerializedName("FlowGroupName")
    @Expose
    private String FlowGroupName;

    /**
    * <p>合同（流程）组的子合同信息，支持2-50个子合同</p>
    */
    @SerializedName("FlowGroupInfos")
    @Expose
    private FlowGroupInfo [] FlowGroupInfos;

    /**
    * <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>合同（流程）组的配置项信息。<br>其中包括：</p><ul><li>是否通知本企业签署方</li><li>是否通知其他签署方</li></ul>
    */
    @SerializedName("FlowGroupOptions")
    @Expose
    private FlowGroupOptions FlowGroupOptions;

    /**
    * <p>用户自定义合同类型。</p><p>自定义合同类型配置的地方如链接图所示。<a href="https://qcloudimg.tencent-cloud.cn/raw/36582cea03ae6a2559894844942b5d5c.png">点击查看自定义合同类型管理的位置</a></p><p>注意：<br>如果传递了自定义合同类型，则每一个子合同设置的自定义合同类型将会失效，已最外层定义的为准。<br>例如：<br>这份合同组有三个子合同，设置合同类型为<font color="blue">人事/劳务</font><br>第一份子合同设置的合同自定义合同类型是<font color="blue">采购</font><br>第二份和第三份子合同设置的合同自定义合同类型是<font color="blue">人事/劳务</font><br>但最终这个合同组的合同类型是<font color="blue">人事/劳务</font></p>
    */
    @SerializedName("UserFlowType")
    @Expose
    private UserFlowType UserFlowType;

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
     * Get <p>合同（流程）组名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。</p> 
     * @return FlowGroupName <p>合同（流程）组名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。</p>
     */
    public String getFlowGroupName() {
        return this.FlowGroupName;
    }

    /**
     * Set <p>合同（流程）组名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。</p>
     * @param FlowGroupName <p>合同（流程）组名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。</p>
     */
    public void setFlowGroupName(String FlowGroupName) {
        this.FlowGroupName = FlowGroupName;
    }

    /**
     * Get <p>合同（流程）组的子合同信息，支持2-50个子合同</p> 
     * @return FlowGroupInfos <p>合同（流程）组的子合同信息，支持2-50个子合同</p>
     */
    public FlowGroupInfo [] getFlowGroupInfos() {
        return this.FlowGroupInfos;
    }

    /**
     * Set <p>合同（流程）组的子合同信息，支持2-50个子合同</p>
     * @param FlowGroupInfos <p>合同（流程）组的子合同信息，支持2-50个子合同</p>
     */
    public void setFlowGroupInfos(FlowGroupInfo [] FlowGroupInfos) {
        this.FlowGroupInfos = FlowGroupInfos;
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
     * Get <p>合同（流程）组的配置项信息。<br>其中包括：</p><ul><li>是否通知本企业签署方</li><li>是否通知其他签署方</li></ul> 
     * @return FlowGroupOptions <p>合同（流程）组的配置项信息。<br>其中包括：</p><ul><li>是否通知本企业签署方</li><li>是否通知其他签署方</li></ul>
     */
    public FlowGroupOptions getFlowGroupOptions() {
        return this.FlowGroupOptions;
    }

    /**
     * Set <p>合同（流程）组的配置项信息。<br>其中包括：</p><ul><li>是否通知本企业签署方</li><li>是否通知其他签署方</li></ul>
     * @param FlowGroupOptions <p>合同（流程）组的配置项信息。<br>其中包括：</p><ul><li>是否通知本企业签署方</li><li>是否通知其他签署方</li></ul>
     */
    public void setFlowGroupOptions(FlowGroupOptions FlowGroupOptions) {
        this.FlowGroupOptions = FlowGroupOptions;
    }

    /**
     * Get <p>用户自定义合同类型。</p><p>自定义合同类型配置的地方如链接图所示。<a href="https://qcloudimg.tencent-cloud.cn/raw/36582cea03ae6a2559894844942b5d5c.png">点击查看自定义合同类型管理的位置</a></p><p>注意：<br>如果传递了自定义合同类型，则每一个子合同设置的自定义合同类型将会失效，已最外层定义的为准。<br>例如：<br>这份合同组有三个子合同，设置合同类型为<font color="blue">人事/劳务</font><br>第一份子合同设置的合同自定义合同类型是<font color="blue">采购</font><br>第二份和第三份子合同设置的合同自定义合同类型是<font color="blue">人事/劳务</font><br>但最终这个合同组的合同类型是<font color="blue">人事/劳务</font></p> 
     * @return UserFlowType <p>用户自定义合同类型。</p><p>自定义合同类型配置的地方如链接图所示。<a href="https://qcloudimg.tencent-cloud.cn/raw/36582cea03ae6a2559894844942b5d5c.png">点击查看自定义合同类型管理的位置</a></p><p>注意：<br>如果传递了自定义合同类型，则每一个子合同设置的自定义合同类型将会失效，已最外层定义的为准。<br>例如：<br>这份合同组有三个子合同，设置合同类型为<font color="blue">人事/劳务</font><br>第一份子合同设置的合同自定义合同类型是<font color="blue">采购</font><br>第二份和第三份子合同设置的合同自定义合同类型是<font color="blue">人事/劳务</font><br>但最终这个合同组的合同类型是<font color="blue">人事/劳务</font></p>
     */
    public UserFlowType getUserFlowType() {
        return this.UserFlowType;
    }

    /**
     * Set <p>用户自定义合同类型。</p><p>自定义合同类型配置的地方如链接图所示。<a href="https://qcloudimg.tencent-cloud.cn/raw/36582cea03ae6a2559894844942b5d5c.png">点击查看自定义合同类型管理的位置</a></p><p>注意：<br>如果传递了自定义合同类型，则每一个子合同设置的自定义合同类型将会失效，已最外层定义的为准。<br>例如：<br>这份合同组有三个子合同，设置合同类型为<font color="blue">人事/劳务</font><br>第一份子合同设置的合同自定义合同类型是<font color="blue">采购</font><br>第二份和第三份子合同设置的合同自定义合同类型是<font color="blue">人事/劳务</font><br>但最终这个合同组的合同类型是<font color="blue">人事/劳务</font></p>
     * @param UserFlowType <p>用户自定义合同类型。</p><p>自定义合同类型配置的地方如链接图所示。<a href="https://qcloudimg.tencent-cloud.cn/raw/36582cea03ae6a2559894844942b5d5c.png">点击查看自定义合同类型管理的位置</a></p><p>注意：<br>如果传递了自定义合同类型，则每一个子合同设置的自定义合同类型将会失效，已最外层定义的为准。<br>例如：<br>这份合同组有三个子合同，设置合同类型为<font color="blue">人事/劳务</font><br>第一份子合同设置的合同自定义合同类型是<font color="blue">采购</font><br>第二份和第三份子合同设置的合同自定义合同类型是<font color="blue">人事/劳务</font><br>但最终这个合同组的合同类型是<font color="blue">人事/劳务</font></p>
     */
    public void setUserFlowType(UserFlowType UserFlowType) {
        this.UserFlowType = UserFlowType;
    }

    public CreateFlowGroupByFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowGroupByFilesRequest(CreateFlowGroupByFilesRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.FlowGroupName != null) {
            this.FlowGroupName = new String(source.FlowGroupName);
        }
        if (source.FlowGroupInfos != null) {
            this.FlowGroupInfos = new FlowGroupInfo[source.FlowGroupInfos.length];
            for (int i = 0; i < source.FlowGroupInfos.length; i++) {
                this.FlowGroupInfos[i] = new FlowGroupInfo(source.FlowGroupInfos[i]);
            }
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FlowGroupOptions != null) {
            this.FlowGroupOptions = new FlowGroupOptions(source.FlowGroupOptions);
        }
        if (source.UserFlowType != null) {
            this.UserFlowType = new UserFlowType(source.UserFlowType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "FlowGroupName", this.FlowGroupName);
        this.setParamArrayObj(map, prefix + "FlowGroupInfos.", this.FlowGroupInfos);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamObj(map, prefix + "FlowGroupOptions.", this.FlowGroupOptions);
        this.setParamObj(map, prefix + "UserFlowType.", this.UserFlowType);

    }
}

