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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateIntegrationEmployeesRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息。使用此接口时，必须填写userId。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 待创建员工的信息，最多不超过20个。
其中入参Mobile和DisplayName必填，OpenId、Email和Department.DepartmentId选填，其他字段暂不支持设置。
在创建企微企业员工场景下，只需传入WeworkOpenId，无需再传其他信息。
    */
    @SerializedName("Employees")
    @Expose
    private Staff [] Employees;

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 员工邀请方式
如果是来自H5的，参数需要传递H5
短信或者企微 请传递SMS，或者不传递
    */
    @SerializedName("InvitationNotifyType")
    @Expose
    private String InvitationNotifyType;

    /**
    * 回跳地址，
在认证成功之后，进行回跳，请保证回跳地址的可用性。
使用前请联系对接的客户经理沟通，提供回跳地址的域名，进行域名配置

    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
     * Get 执行本接口操作的员工信息。使用此接口时，必须填写userId。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息。使用此接口时，必须填写userId。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。使用此接口时，必须填写userId。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息。使用此接口时，必须填写userId。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 待创建员工的信息，最多不超过20个。
其中入参Mobile和DisplayName必填，OpenId、Email和Department.DepartmentId选填，其他字段暂不支持设置。
在创建企微企业员工场景下，只需传入WeworkOpenId，无需再传其他信息。 
     * @return Employees 待创建员工的信息，最多不超过20个。
其中入参Mobile和DisplayName必填，OpenId、Email和Department.DepartmentId选填，其他字段暂不支持设置。
在创建企微企业员工场景下，只需传入WeworkOpenId，无需再传其他信息。
     */
    public Staff [] getEmployees() {
        return this.Employees;
    }

    /**
     * Set 待创建员工的信息，最多不超过20个。
其中入参Mobile和DisplayName必填，OpenId、Email和Department.DepartmentId选填，其他字段暂不支持设置。
在创建企微企业员工场景下，只需传入WeworkOpenId，无需再传其他信息。
     * @param Employees 待创建员工的信息，最多不超过20个。
其中入参Mobile和DisplayName必填，OpenId、Email和Department.DepartmentId选填，其他字段暂不支持设置。
在创建企微企业员工场景下，只需传入WeworkOpenId，无需再传其他信息。
     */
    public void setEmployees(Staff [] Employees) {
        this.Employees = Employees;
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
     * Get 员工邀请方式
如果是来自H5的，参数需要传递H5
短信或者企微 请传递SMS，或者不传递 
     * @return InvitationNotifyType 员工邀请方式
如果是来自H5的，参数需要传递H5
短信或者企微 请传递SMS，或者不传递
     */
    public String getInvitationNotifyType() {
        return this.InvitationNotifyType;
    }

    /**
     * Set 员工邀请方式
如果是来自H5的，参数需要传递H5
短信或者企微 请传递SMS，或者不传递
     * @param InvitationNotifyType 员工邀请方式
如果是来自H5的，参数需要传递H5
短信或者企微 请传递SMS，或者不传递
     */
    public void setInvitationNotifyType(String InvitationNotifyType) {
        this.InvitationNotifyType = InvitationNotifyType;
    }

    /**
     * Get 回跳地址，
在认证成功之后，进行回跳，请保证回跳地址的可用性。
使用前请联系对接的客户经理沟通，提供回跳地址的域名，进行域名配置
 
     * @return JumpUrl 回跳地址，
在认证成功之后，进行回跳，请保证回跳地址的可用性。
使用前请联系对接的客户经理沟通，提供回跳地址的域名，进行域名配置

     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 回跳地址，
在认证成功之后，进行回跳，请保证回跳地址的可用性。
使用前请联系对接的客户经理沟通，提供回跳地址的域名，进行域名配置

     * @param JumpUrl 回跳地址，
在认证成功之后，进行回跳，请保证回跳地址的可用性。
使用前请联系对接的客户经理沟通，提供回跳地址的域名，进行域名配置

     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    public CreateIntegrationEmployeesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIntegrationEmployeesRequest(CreateIntegrationEmployeesRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Employees != null) {
            this.Employees = new Staff[source.Employees.length];
            for (int i = 0; i < source.Employees.length; i++) {
                this.Employees[i] = new Staff(source.Employees[i]);
            }
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.InvitationNotifyType != null) {
            this.InvitationNotifyType = new String(source.InvitationNotifyType);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamArrayObj(map, prefix + "Employees.", this.Employees);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "InvitationNotifyType", this.InvitationNotifyType);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);

    }
}

