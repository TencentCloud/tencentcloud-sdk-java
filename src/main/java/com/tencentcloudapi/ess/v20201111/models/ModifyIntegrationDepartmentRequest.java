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

public class ModifyIntegrationDepartmentRequest extends AbstractModel{

    /**
    * 操作人信息，UserId必填且需拥有组织架构管理权限
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 电子签部门ID,通过DescribeIntegrationDepartments接口可以获取
    */
    @SerializedName("DeptId")
    @Expose
    private String DeptId;

    /**
    * 电子签父部门ID，通过DescribeIntegrationDepartments接口可以获取
    */
    @SerializedName("ParentDeptId")
    @Expose
    private String ParentDeptId;

    /**
    * 部门名称，不超过50个字符
    */
    @SerializedName("DeptName")
    @Expose
    private String DeptName;

    /**
    * 客户系统部门ID，不超过64个字符
    */
    @SerializedName("DeptOpenId")
    @Expose
    private String DeptOpenId;

    /**
    * 排序号,1~30000范围内
    */
    @SerializedName("OrderNo")
    @Expose
    private Long OrderNo;

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
     * Get 电子签部门ID,通过DescribeIntegrationDepartments接口可以获取 
     * @return DeptId 电子签部门ID,通过DescribeIntegrationDepartments接口可以获取
     */
    public String getDeptId() {
        return this.DeptId;
    }

    /**
     * Set 电子签部门ID,通过DescribeIntegrationDepartments接口可以获取
     * @param DeptId 电子签部门ID,通过DescribeIntegrationDepartments接口可以获取
     */
    public void setDeptId(String DeptId) {
        this.DeptId = DeptId;
    }

    /**
     * Get 电子签父部门ID，通过DescribeIntegrationDepartments接口可以获取 
     * @return ParentDeptId 电子签父部门ID，通过DescribeIntegrationDepartments接口可以获取
     */
    public String getParentDeptId() {
        return this.ParentDeptId;
    }

    /**
     * Set 电子签父部门ID，通过DescribeIntegrationDepartments接口可以获取
     * @param ParentDeptId 电子签父部门ID，通过DescribeIntegrationDepartments接口可以获取
     */
    public void setParentDeptId(String ParentDeptId) {
        this.ParentDeptId = ParentDeptId;
    }

    /**
     * Get 部门名称，不超过50个字符 
     * @return DeptName 部门名称，不超过50个字符
     */
    public String getDeptName() {
        return this.DeptName;
    }

    /**
     * Set 部门名称，不超过50个字符
     * @param DeptName 部门名称，不超过50个字符
     */
    public void setDeptName(String DeptName) {
        this.DeptName = DeptName;
    }

    /**
     * Get 客户系统部门ID，不超过64个字符 
     * @return DeptOpenId 客户系统部门ID，不超过64个字符
     */
    public String getDeptOpenId() {
        return this.DeptOpenId;
    }

    /**
     * Set 客户系统部门ID，不超过64个字符
     * @param DeptOpenId 客户系统部门ID，不超过64个字符
     */
    public void setDeptOpenId(String DeptOpenId) {
        this.DeptOpenId = DeptOpenId;
    }

    /**
     * Get 排序号,1~30000范围内 
     * @return OrderNo 排序号,1~30000范围内
     */
    public Long getOrderNo() {
        return this.OrderNo;
    }

    /**
     * Set 排序号,1~30000范围内
     * @param OrderNo 排序号,1~30000范围内
     */
    public void setOrderNo(Long OrderNo) {
        this.OrderNo = OrderNo;
    }

    public ModifyIntegrationDepartmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIntegrationDepartmentRequest(ModifyIntegrationDepartmentRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.DeptId != null) {
            this.DeptId = new String(source.DeptId);
        }
        if (source.ParentDeptId != null) {
            this.ParentDeptId = new String(source.ParentDeptId);
        }
        if (source.DeptName != null) {
            this.DeptName = new String(source.DeptName);
        }
        if (source.DeptOpenId != null) {
            this.DeptOpenId = new String(source.DeptOpenId);
        }
        if (source.OrderNo != null) {
            this.OrderNo = new Long(source.OrderNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "DeptId", this.DeptId);
        this.setParamSimple(map, prefix + "ParentDeptId", this.ParentDeptId);
        this.setParamSimple(map, prefix + "DeptName", this.DeptName);
        this.setParamSimple(map, prefix + "DeptOpenId", this.DeptOpenId);
        this.setParamSimple(map, prefix + "OrderNo", this.OrderNo);

    }
}

