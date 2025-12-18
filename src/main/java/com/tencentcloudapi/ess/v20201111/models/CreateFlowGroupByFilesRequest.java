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
    * 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 合同（流程）组名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
    */
    @SerializedName("FlowGroupName")
    @Expose
    private String FlowGroupName;

    /**
    * 合同（流程）组的子合同信息，支持2-50个子合同
    */
    @SerializedName("FlowGroupInfos")
    @Expose
    private FlowGroupInfo [] FlowGroupInfos;

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 合同（流程）组的配置项信息。
其中包括：
<ul>
<li>是否通知本企业签署方</li>
<li>是否通知其他签署方</li>
</ul>
    */
    @SerializedName("FlowGroupOptions")
    @Expose
    private FlowGroupOptions FlowGroupOptions;

    /**
    * 用户自定义合同类型。

自定义合同类型配置的地方如链接图所示。[点击查看自定义合同类型管理的位置](https://qcloudimg.tencent-cloud.cn/raw/36582cea03ae6a2559894844942b5d5c.png)

注意：
如果传递了自定义合同类型，则每一个子合同设置的自定义合同类型将会失效，已最外层定义的为准。
例如：
这份合同组有三个子合同，设置合同类型为<font color="blue">人事/劳务</font>
第一份子合同设置的合同自定义合同类型是<font color="blue">采购</font>
第二份和第三份子合同设置的合同自定义合同类型是<font color="blue">人事/劳务</font>
但最终这个合同组的合同类型是<font color="blue">人事/劳务</font>





    */
    @SerializedName("UserFlowType")
    @Expose
    private UserFlowType UserFlowType;

    /**
     * Get 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 合同（流程）组名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。 
     * @return FlowGroupName 合同（流程）组名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
     */
    public String getFlowGroupName() {
        return this.FlowGroupName;
    }

    /**
     * Set 合同（流程）组名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
     * @param FlowGroupName 合同（流程）组名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
     */
    public void setFlowGroupName(String FlowGroupName) {
        this.FlowGroupName = FlowGroupName;
    }

    /**
     * Get 合同（流程）组的子合同信息，支持2-50个子合同 
     * @return FlowGroupInfos 合同（流程）组的子合同信息，支持2-50个子合同
     */
    public FlowGroupInfo [] getFlowGroupInfos() {
        return this.FlowGroupInfos;
    }

    /**
     * Set 合同（流程）组的子合同信息，支持2-50个子合同
     * @param FlowGroupInfos 合同（流程）组的子合同信息，支持2-50个子合同
     */
    public void setFlowGroupInfos(FlowGroupInfo [] FlowGroupInfos) {
        this.FlowGroupInfos = FlowGroupInfos;
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
     * Get 合同（流程）组的配置项信息。
其中包括：
<ul>
<li>是否通知本企业签署方</li>
<li>是否通知其他签署方</li>
</ul> 
     * @return FlowGroupOptions 合同（流程）组的配置项信息。
其中包括：
<ul>
<li>是否通知本企业签署方</li>
<li>是否通知其他签署方</li>
</ul>
     */
    public FlowGroupOptions getFlowGroupOptions() {
        return this.FlowGroupOptions;
    }

    /**
     * Set 合同（流程）组的配置项信息。
其中包括：
<ul>
<li>是否通知本企业签署方</li>
<li>是否通知其他签署方</li>
</ul>
     * @param FlowGroupOptions 合同（流程）组的配置项信息。
其中包括：
<ul>
<li>是否通知本企业签署方</li>
<li>是否通知其他签署方</li>
</ul>
     */
    public void setFlowGroupOptions(FlowGroupOptions FlowGroupOptions) {
        this.FlowGroupOptions = FlowGroupOptions;
    }

    /**
     * Get 用户自定义合同类型。

自定义合同类型配置的地方如链接图所示。[点击查看自定义合同类型管理的位置](https://qcloudimg.tencent-cloud.cn/raw/36582cea03ae6a2559894844942b5d5c.png)

注意：
如果传递了自定义合同类型，则每一个子合同设置的自定义合同类型将会失效，已最外层定义的为准。
例如：
这份合同组有三个子合同，设置合同类型为<font color="blue">人事/劳务</font>
第一份子合同设置的合同自定义合同类型是<font color="blue">采购</font>
第二份和第三份子合同设置的合同自定义合同类型是<font color="blue">人事/劳务</font>
但最终这个合同组的合同类型是<font color="blue">人事/劳务</font>




 
     * @return UserFlowType 用户自定义合同类型。

自定义合同类型配置的地方如链接图所示。[点击查看自定义合同类型管理的位置](https://qcloudimg.tencent-cloud.cn/raw/36582cea03ae6a2559894844942b5d5c.png)

注意：
如果传递了自定义合同类型，则每一个子合同设置的自定义合同类型将会失效，已最外层定义的为准。
例如：
这份合同组有三个子合同，设置合同类型为<font color="blue">人事/劳务</font>
第一份子合同设置的合同自定义合同类型是<font color="blue">采购</font>
第二份和第三份子合同设置的合同自定义合同类型是<font color="blue">人事/劳务</font>
但最终这个合同组的合同类型是<font color="blue">人事/劳务</font>





     */
    public UserFlowType getUserFlowType() {
        return this.UserFlowType;
    }

    /**
     * Set 用户自定义合同类型。

自定义合同类型配置的地方如链接图所示。[点击查看自定义合同类型管理的位置](https://qcloudimg.tencent-cloud.cn/raw/36582cea03ae6a2559894844942b5d5c.png)

注意：
如果传递了自定义合同类型，则每一个子合同设置的自定义合同类型将会失效，已最外层定义的为准。
例如：
这份合同组有三个子合同，设置合同类型为<font color="blue">人事/劳务</font>
第一份子合同设置的合同自定义合同类型是<font color="blue">采购</font>
第二份和第三份子合同设置的合同自定义合同类型是<font color="blue">人事/劳务</font>
但最终这个合同组的合同类型是<font color="blue">人事/劳务</font>





     * @param UserFlowType 用户自定义合同类型。

自定义合同类型配置的地方如链接图所示。[点击查看自定义合同类型管理的位置](https://qcloudimg.tencent-cloud.cn/raw/36582cea03ae6a2559894844942b5d5c.png)

注意：
如果传递了自定义合同类型，则每一个子合同设置的自定义合同类型将会失效，已最外层定义的为准。
例如：
这份合同组有三个子合同，设置合同类型为<font color="blue">人事/劳务</font>
第一份子合同设置的合同自定义合同类型是<font color="blue">采购</font>
第二份和第三份子合同设置的合同自定义合同类型是<font color="blue">人事/劳务</font>
但最终这个合同组的合同类型是<font color="blue">人事/劳务</font>





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

