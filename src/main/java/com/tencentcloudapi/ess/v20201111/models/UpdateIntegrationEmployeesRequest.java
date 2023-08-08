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

public class UpdateIntegrationEmployeesRequest extends AbstractModel{

    /**
    * 当前用户信息，UserId必填
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 员工信息，不超过100个。
根据UserId或OpenId更新员工，必填一个，优先UserId。
可更新Mobile、DisplayName、Email和Department.DepartmentId字段，其他字段暂不支持
    */
    @SerializedName("Employees")
    @Expose
    private Staff [] Employees;

    /**
    * 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId需填充子企业Id
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get 当前用户信息，UserId必填 
     * @return Operator 当前用户信息，UserId必填
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 当前用户信息，UserId必填
     * @param Operator 当前用户信息，UserId必填
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 员工信息，不超过100个。
根据UserId或OpenId更新员工，必填一个，优先UserId。
可更新Mobile、DisplayName、Email和Department.DepartmentId字段，其他字段暂不支持 
     * @return Employees 员工信息，不超过100个。
根据UserId或OpenId更新员工，必填一个，优先UserId。
可更新Mobile、DisplayName、Email和Department.DepartmentId字段，其他字段暂不支持
     */
    public Staff [] getEmployees() {
        return this.Employees;
    }

    /**
     * Set 员工信息，不超过100个。
根据UserId或OpenId更新员工，必填一个，优先UserId。
可更新Mobile、DisplayName、Email和Department.DepartmentId字段，其他字段暂不支持
     * @param Employees 员工信息，不超过100个。
根据UserId或OpenId更新员工，必填一个，优先UserId。
可更新Mobile、DisplayName、Email和Department.DepartmentId字段，其他字段暂不支持
     */
    public void setEmployees(Staff [] Employees) {
        this.Employees = Employees;
    }

    /**
     * Get 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId需填充子企业Id 
     * @return Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId需填充子企业Id
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId需填充子企业Id
     * @param Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId需填充子企业Id
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    public UpdateIntegrationEmployeesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateIntegrationEmployeesRequest(UpdateIntegrationEmployeesRequest source) {
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

