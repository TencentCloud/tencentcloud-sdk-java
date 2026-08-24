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
    * <p>EMR实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private Long InstanceId;

    /**
    * <p>操作名称</p>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * <p>操作类型</p>
    */
    @SerializedName("OperationType")
    @Expose
    private Long OperationType;

    /**
    * <p>用户类型</p>
    */
    @SerializedName("UserType")
    @Expose
    private Long UserType;

    /**
    * <p>操作者</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>操作时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>操作对象</p>
    */
    @SerializedName("Operand")
    @Expose
    private String Operand;

    /**
    * <p>操作详情</p>
    */
    @SerializedName("OperationDesc")
    @Expose
    private String OperationDesc;

    /**
    * <p>安全级别</p>
    */
    @SerializedName("SecurityLevel")
    @Expose
    private String SecurityLevel;

    /**
    * <p>操作者名称</p>
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
     * Get <p>EMR实例ID</p> 
     * @return InstanceId <p>EMR实例ID</p>
     */
    public Long getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>EMR实例ID</p>
     * @param InstanceId <p>EMR实例ID</p>
     */
    public void setInstanceId(Long InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>操作名称</p> 
     * @return Operation <p>操作名称</p>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set <p>操作名称</p>
     * @param Operation <p>操作名称</p>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get <p>操作类型</p> 
     * @return OperationType <p>操作类型</p>
     */
    public Long getOperationType() {
        return this.OperationType;
    }

    /**
     * Set <p>操作类型</p>
     * @param OperationType <p>操作类型</p>
     */
    public void setOperationType(Long OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get <p>用户类型</p> 
     * @return UserType <p>用户类型</p>
     */
    public Long getUserType() {
        return this.UserType;
    }

    /**
     * Set <p>用户类型</p>
     * @param UserType <p>用户类型</p>
     */
    public void setUserType(Long UserType) {
        this.UserType = UserType;
    }

    /**
     * Get <p>操作者</p> 
     * @return Operator <p>操作者</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作者</p>
     * @param Operator <p>操作者</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>操作时间</p> 
     * @return CreateTime <p>操作时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>操作时间</p>
     * @param CreateTime <p>操作时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>操作对象</p> 
     * @return Operand <p>操作对象</p>
     */
    public String getOperand() {
        return this.Operand;
    }

    /**
     * Set <p>操作对象</p>
     * @param Operand <p>操作对象</p>
     */
    public void setOperand(String Operand) {
        this.Operand = Operand;
    }

    /**
     * Get <p>操作详情</p> 
     * @return OperationDesc <p>操作详情</p>
     */
    public String getOperationDesc() {
        return this.OperationDesc;
    }

    /**
     * Set <p>操作详情</p>
     * @param OperationDesc <p>操作详情</p>
     */
    public void setOperationDesc(String OperationDesc) {
        this.OperationDesc = OperationDesc;
    }

    /**
     * Get <p>安全级别</p> 
     * @return SecurityLevel <p>安全级别</p>
     */
    public String getSecurityLevel() {
        return this.SecurityLevel;
    }

    /**
     * Set <p>安全级别</p>
     * @param SecurityLevel <p>安全级别</p>
     */
    public void setSecurityLevel(String SecurityLevel) {
        this.SecurityLevel = SecurityLevel;
    }

    /**
     * Get <p>操作者名称</p> 
     * @return OperatorName <p>操作者名称</p>
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set <p>操作者名称</p>
     * @param OperatorName <p>操作者名称</p>
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
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
        if (source.OperatorName != null) {
            this.OperatorName = new String(source.OperatorName);
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
        this.setParamSimple(map, prefix + "OperatorName", this.OperatorName);

    }
}

