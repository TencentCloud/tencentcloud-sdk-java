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

public class CreateIntegrationEmployeesRequest extends AbstractModel{

    /**
    * 操作人信息，userId必填
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 待创建员工的信息，不超过20个。
所有类型的企业支持的入参：Mobile和DisplayName必填,OpenId、Email和Department.DepartmentId选填，其他字段暂不支持。
企微类型的企业特有支持的入参：WeworkOpenId，传入此字段无需在传入其他信息
    */
    @SerializedName("Employees")
    @Expose
    private Staff [] Employees;

    /**
    * 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get 操作人信息，userId必填 
     * @return Operator 操作人信息，userId必填
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人信息，userId必填
     * @param Operator 操作人信息，userId必填
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 待创建员工的信息，不超过20个。
所有类型的企业支持的入参：Mobile和DisplayName必填,OpenId、Email和Department.DepartmentId选填，其他字段暂不支持。
企微类型的企业特有支持的入参：WeworkOpenId，传入此字段无需在传入其他信息 
     * @return Employees 待创建员工的信息，不超过20个。
所有类型的企业支持的入参：Mobile和DisplayName必填,OpenId、Email和Department.DepartmentId选填，其他字段暂不支持。
企微类型的企业特有支持的入参：WeworkOpenId，传入此字段无需在传入其他信息
     */
    public Staff [] getEmployees() {
        return this.Employees;
    }

    /**
     * Set 待创建员工的信息，不超过20个。
所有类型的企业支持的入参：Mobile和DisplayName必填,OpenId、Email和Department.DepartmentId选填，其他字段暂不支持。
企微类型的企业特有支持的入参：WeworkOpenId，传入此字段无需在传入其他信息
     * @param Employees 待创建员工的信息，不超过20个。
所有类型的企业支持的入参：Mobile和DisplayName必填,OpenId、Email和Department.DepartmentId选填，其他字段暂不支持。
企微类型的企业特有支持的入参：WeworkOpenId，传入此字段无需在传入其他信息
     */
    public void setEmployees(Staff [] Employees) {
        this.Employees = Employees;
    }

    /**
     * Get 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填 
     * @return Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     * @param Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamArrayObj(map, prefix + "Employees.", this.Employees);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

