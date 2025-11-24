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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperationLog extends AbstractModel {

    /**
    * EMR实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private Long InstanceId;

    /**
    * 操作名称
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 操作类型
    */
    @SerializedName("OperationType")
    @Expose
    private Long OperationType;

    /**
    * 用户类型
    */
    @SerializedName("UserType")
    @Expose
    private Long UserType;

    /**
    * 操作者
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 操作时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 操作对象
    */
    @SerializedName("Operand")
    @Expose
    private String Operand;

    /**
    * 操作详情
    */
    @SerializedName("OperationDesc")
    @Expose
    private String OperationDesc;

    /**
    * 安全级别
    */
    @SerializedName("SecurityLevel")
    @Expose
    private String SecurityLevel;

    /**
     * Get EMR实例ID 
     * @return InstanceId EMR实例ID
     */
    public Long getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set EMR实例ID
     * @param InstanceId EMR实例ID
     */
    public void setInstanceId(Long InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 操作名称 
     * @return Operation 操作名称
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名称
     * @param Operation 操作名称
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 操作类型 
     * @return OperationType 操作类型
     */
    public Long getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 操作类型
     * @param OperationType 操作类型
     */
    public void setOperationType(Long OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get 用户类型 
     * @return UserType 用户类型
     */
    public Long getUserType() {
        return this.UserType;
    }

    /**
     * Set 用户类型
     * @param UserType 用户类型
     */
    public void setUserType(Long UserType) {
        this.UserType = UserType;
    }

    /**
     * Get 操作者 
     * @return Operator 操作者
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者
     * @param Operator 操作者
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 操作时间 
     * @return CreateTime 操作时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 操作时间
     * @param CreateTime 操作时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 操作对象 
     * @return Operand 操作对象
     */
    public String getOperand() {
        return this.Operand;
    }

    /**
     * Set 操作对象
     * @param Operand 操作对象
     */
    public void setOperand(String Operand) {
        this.Operand = Operand;
    }

    /**
     * Get 操作详情 
     * @return OperationDesc 操作详情
     */
    public String getOperationDesc() {
        return this.OperationDesc;
    }

    /**
     * Set 操作详情
     * @param OperationDesc 操作详情
     */
    public void setOperationDesc(String OperationDesc) {
        this.OperationDesc = OperationDesc;
    }

    /**
     * Get 安全级别 
     * @return SecurityLevel 安全级别
     */
    public String getSecurityLevel() {
        return this.SecurityLevel;
    }

    /**
     * Set 安全级别
     * @param SecurityLevel 安全级别
     */
    public void setSecurityLevel(String SecurityLevel) {
        this.SecurityLevel = SecurityLevel;
    }

    public OperationLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperationLog(OperationLog source) {
        if (source.InstanceId != null) {
            this.InstanceId = new Long(source.InstanceId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.OperationType != null) {
            this.OperationType = new Long(source.OperationType);
        }
        if (source.UserType != null) {
            this.UserType = new Long(source.UserType);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Operand != null) {
            this.Operand = new String(source.Operand);
        }
        if (source.OperationDesc != null) {
            this.OperationDesc = new String(source.OperationDesc);
        }
        if (source.SecurityLevel != null) {
            this.SecurityLevel = new String(source.SecurityLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Operand", this.Operand);
        this.setParamSimple(map, prefix + "OperationDesc", this.OperationDesc);
        this.setParamSimple(map, prefix + "SecurityLevel", this.SecurityLevel);

    }
}

