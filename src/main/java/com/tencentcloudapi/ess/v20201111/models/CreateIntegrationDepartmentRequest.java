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

public class CreateIntegrationDepartmentRequest extends AbstractModel{

    /**
    * 操作人信息，UserId必填且需拥有组织架构管理权限
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 部门名称，不超过50个字符
    */
    @SerializedName("DeptName")
    @Expose
    private String DeptName;

    /**
    * 电子签父部门ID，与ParentDeptOpenId二选一,优先ParentDeptId,都为空时自动填充至根节点下
    */
    @SerializedName("ParentDeptId")
    @Expose
    private String ParentDeptId;

    /**
    * 第三方平台中父部门ID,与ParentDeptId二选一,优先ParentDeptId,都为空时自动填充至根节点下
    */
    @SerializedName("ParentDeptOpenId")
    @Expose
    private String ParentDeptOpenId;

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
     * Get 电子签父部门ID，与ParentDeptOpenId二选一,优先ParentDeptId,都为空时自动填充至根节点下 
     * @return ParentDeptId 电子签父部门ID，与ParentDeptOpenId二选一,优先ParentDeptId,都为空时自动填充至根节点下
     */
    public String getParentDeptId() {
        return this.ParentDeptId;
    }

    /**
     * Set 电子签父部门ID，与ParentDeptOpenId二选一,优先ParentDeptId,都为空时自动填充至根节点下
     * @param ParentDeptId 电子签父部门ID，与ParentDeptOpenId二选一,优先ParentDeptId,都为空时自动填充至根节点下
     */
    public void setParentDeptId(String ParentDeptId) {
        this.ParentDeptId = ParentDeptId;
    }

    /**
     * Get 第三方平台中父部门ID,与ParentDeptId二选一,优先ParentDeptId,都为空时自动填充至根节点下 
     * @return ParentDeptOpenId 第三方平台中父部门ID,与ParentDeptId二选一,优先ParentDeptId,都为空时自动填充至根节点下
     */
    public String getParentDeptOpenId() {
        return this.ParentDeptOpenId;
    }

    /**
     * Set 第三方平台中父部门ID,与ParentDeptId二选一,优先ParentDeptId,都为空时自动填充至根节点下
     * @param ParentDeptOpenId 第三方平台中父部门ID,与ParentDeptId二选一,优先ParentDeptId,都为空时自动填充至根节点下
     */
    public void setParentDeptOpenId(String ParentDeptOpenId) {
        this.ParentDeptOpenId = ParentDeptOpenId;
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

    public CreateIntegrationDepartmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIntegrationDepartmentRequest(CreateIntegrationDepartmentRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.DeptName != null) {
            this.DeptName = new String(source.DeptName);
        }
        if (source.ParentDeptId != null) {
            this.ParentDeptId = new String(source.ParentDeptId);
        }
        if (source.ParentDeptOpenId != null) {
            this.ParentDeptOpenId = new String(source.ParentDeptOpenId);
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
        this.setParamSimple(map, prefix + "DeptName", this.DeptName);
        this.setParamSimple(map, prefix + "ParentDeptId", this.ParentDeptId);
        this.setParamSimple(map, prefix + "ParentDeptOpenId", this.ParentDeptOpenId);
        this.setParamSimple(map, prefix + "DeptOpenId", this.DeptOpenId);
        this.setParamSimple(map, prefix + "OrderNo", this.OrderNo);

    }
}

