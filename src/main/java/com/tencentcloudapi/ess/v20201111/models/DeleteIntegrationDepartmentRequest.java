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

public class DeleteIntegrationDepartmentRequest extends AbstractModel{

    /**
    * 操作人信息，UserId必填且需拥有组织架构管理权限
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 电子签中的部门id,通过DescribeIntegrationDepartments接口可获得
    */
    @SerializedName("DeptId")
    @Expose
    private String DeptId;

    /**
    * 交接部门ID。待删除部门中的合同、印章和模板数据，交接至该部门ID下，未填写交接至公司根部门。
    */
    @SerializedName("ReceiveDeptId")
    @Expose
    private String ReceiveDeptId;

    /**
     * Get 操作人信息，UserId必填且需拥有组织架构管理权限 
     * @return Operator 操作人信息，UserId必填且需拥有组织架构管理权限
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人信息，UserId必填且需拥有组织架构管理权限
     * @param Operator 操作人信息，UserId必填且需拥有组织架构管理权限
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 电子签中的部门id,通过DescribeIntegrationDepartments接口可获得 
     * @return DeptId 电子签中的部门id,通过DescribeIntegrationDepartments接口可获得
     */
    public String getDeptId() {
        return this.DeptId;
    }

    /**
     * Set 电子签中的部门id,通过DescribeIntegrationDepartments接口可获得
     * @param DeptId 电子签中的部门id,通过DescribeIntegrationDepartments接口可获得
     */
    public void setDeptId(String DeptId) {
        this.DeptId = DeptId;
    }

    /**
     * Get 交接部门ID。待删除部门中的合同、印章和模板数据，交接至该部门ID下，未填写交接至公司根部门。 
     * @return ReceiveDeptId 交接部门ID。待删除部门中的合同、印章和模板数据，交接至该部门ID下，未填写交接至公司根部门。
     */
    public String getReceiveDeptId() {
        return this.ReceiveDeptId;
    }

    /**
     * Set 交接部门ID。待删除部门中的合同、印章和模板数据，交接至该部门ID下，未填写交接至公司根部门。
     * @param ReceiveDeptId 交接部门ID。待删除部门中的合同、印章和模板数据，交接至该部门ID下，未填写交接至公司根部门。
     */
    public void setReceiveDeptId(String ReceiveDeptId) {
        this.ReceiveDeptId = ReceiveDeptId;
    }

    public DeleteIntegrationDepartmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteIntegrationDepartmentRequest(DeleteIntegrationDepartmentRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.DeptId != null) {
            this.DeptId = new String(source.DeptId);
        }
        if (source.ReceiveDeptId != null) {
            this.ReceiveDeptId = new String(source.ReceiveDeptId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "DeptId", this.DeptId);
        this.setParamSimple(map, prefix + "ReceiveDeptId", this.ReceiveDeptId);

    }
}

