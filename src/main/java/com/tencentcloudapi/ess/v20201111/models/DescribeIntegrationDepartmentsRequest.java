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

public class DescribeIntegrationDepartmentsRequest extends AbstractModel{

    /**
    * 操作人信息，UserId必填且需拥有组织架构管理权限
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 查询类型 0-查询单个部门节点 1-单个部门节点及一级子节点部门列表
    */
    @SerializedName("QueryType")
    @Expose
    private Long QueryType;

    /**
    * 部门ID,与DeptOpenId二选一,优先DeptId,都为空时获取根节点数据
    */
    @SerializedName("DeptId")
    @Expose
    private String DeptId;

    /**
    * 客户系统部门ID,与DeptId二选一,优先DeptId,都为空时获取根节点数据
    */
    @SerializedName("DeptOpenId")
    @Expose
    private String DeptOpenId;

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
     * Get 查询类型 0-查询单个部门节点 1-单个部门节点及一级子节点部门列表 
     * @return QueryType 查询类型 0-查询单个部门节点 1-单个部门节点及一级子节点部门列表
     */
    public Long getQueryType() {
        return this.QueryType;
    }

    /**
     * Set 查询类型 0-查询单个部门节点 1-单个部门节点及一级子节点部门列表
     * @param QueryType 查询类型 0-查询单个部门节点 1-单个部门节点及一级子节点部门列表
     */
    public void setQueryType(Long QueryType) {
        this.QueryType = QueryType;
    }

    /**
     * Get 部门ID,与DeptOpenId二选一,优先DeptId,都为空时获取根节点数据 
     * @return DeptId 部门ID,与DeptOpenId二选一,优先DeptId,都为空时获取根节点数据
     */
    public String getDeptId() {
        return this.DeptId;
    }

    /**
     * Set 部门ID,与DeptOpenId二选一,优先DeptId,都为空时获取根节点数据
     * @param DeptId 部门ID,与DeptOpenId二选一,优先DeptId,都为空时获取根节点数据
     */
    public void setDeptId(String DeptId) {
        this.DeptId = DeptId;
    }

    /**
     * Get 客户系统部门ID,与DeptId二选一,优先DeptId,都为空时获取根节点数据 
     * @return DeptOpenId 客户系统部门ID,与DeptId二选一,优先DeptId,都为空时获取根节点数据
     */
    public String getDeptOpenId() {
        return this.DeptOpenId;
    }

    /**
     * Set 客户系统部门ID,与DeptId二选一,优先DeptId,都为空时获取根节点数据
     * @param DeptOpenId 客户系统部门ID,与DeptId二选一,优先DeptId,都为空时获取根节点数据
     */
    public void setDeptOpenId(String DeptOpenId) {
        this.DeptOpenId = DeptOpenId;
    }

    public DescribeIntegrationDepartmentsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntegrationDepartmentsRequest(DescribeIntegrationDepartmentsRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.QueryType != null) {
            this.QueryType = new Long(source.QueryType);
        }
        if (source.DeptId != null) {
            this.DeptId = new String(source.DeptId);
        }
        if (source.DeptOpenId != null) {
            this.DeptOpenId = new String(source.DeptOpenId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);
        this.setParamSimple(map, prefix + "DeptId", this.DeptId);
        this.setParamSimple(map, prefix + "DeptOpenId", this.DeptOpenId);

    }
}

