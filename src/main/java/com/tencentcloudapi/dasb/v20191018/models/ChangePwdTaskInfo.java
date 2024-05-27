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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChangePwdTaskInfo extends AbstractModel {

    /**
    * id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 任务id
    */
    @SerializedName("OperationId")
    @Expose
    private String OperationId;

    /**
    * 任务名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 所属部门信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Department")
    @Expose
    private Department Department;

    /**
    * 改密方式。1：使用执行账号。2：修改自身密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChangeMethod")
    @Expose
    private Long ChangeMethod;

    /**
    * 执行账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunAccount")
    @Expose
    private String RunAccount;

    /**
    * 密码生成策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthGenerationStrategy")
    @Expose
    private Long AuthGenerationStrategy;

    /**
    * 密码长度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PasswordLength")
    @Expose
    private Long PasswordLength;

    /**
    * 包含小写字母
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmallLetter")
    @Expose
    private Long SmallLetter;

    /**
    * 包含大写字母
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BigLetter")
    @Expose
    private Long BigLetter;

    /**
    * 包含数字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Digit")
    @Expose
    private Long Digit;

    /**
    * 包含的特殊字符，base64
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Symbol")
    @Expose
    private String Symbol;

    /**
    * 改密完成通知。0-通知，1-不通知
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompleteNotify")
    @Expose
    private Long CompleteNotify;

    /**
    * 通知人邮箱
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotifyEmails")
    @Expose
    private String [] NotifyEmails;

    /**
    * 加密附件密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilePassword")
    @Expose
    private String FilePassword;

    /**
    * 需要改密的账户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountSet")
    @Expose
    private String [] AccountSet;

    /**
    * 需要改密的主机
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceSet")
    @Expose
    private Device [] DeviceSet;

    /**
    * 任务类型：4手动，5自动
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 首次执行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * 下次执行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextTime")
    @Expose
    private String NextTime;

    /**
     * Get id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 任务id 
     * @return OperationId 任务id
     */
    public String getOperationId() {
        return this.OperationId;
    }

    /**
     * Set 任务id
     * @param OperationId 任务id
     */
    public void setOperationId(String OperationId) {
        this.OperationId = OperationId;
    }

    /**
     * Get 任务名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 所属部门信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Department 所属部门信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Department getDepartment() {
        return this.Department;
    }

    /**
     * Set 所属部门信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Department 所属部门信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDepartment(Department Department) {
        this.Department = Department;
    }

    /**
     * Get 改密方式。1：使用执行账号。2：修改自身密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChangeMethod 改密方式。1：使用执行账号。2：修改自身密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChangeMethod() {
        return this.ChangeMethod;
    }

    /**
     * Set 改密方式。1：使用执行账号。2：修改自身密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChangeMethod 改密方式。1：使用执行账号。2：修改自身密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChangeMethod(Long ChangeMethod) {
        this.ChangeMethod = ChangeMethod;
    }

    /**
     * Get 执行账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunAccount 执行账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunAccount() {
        return this.RunAccount;
    }

    /**
     * Set 执行账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunAccount 执行账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunAccount(String RunAccount) {
        this.RunAccount = RunAccount;
    }

    /**
     * Get 密码生成策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthGenerationStrategy 密码生成策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAuthGenerationStrategy() {
        return this.AuthGenerationStrategy;
    }

    /**
     * Set 密码生成策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthGenerationStrategy 密码生成策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthGenerationStrategy(Long AuthGenerationStrategy) {
        this.AuthGenerationStrategy = AuthGenerationStrategy;
    }

    /**
     * Get 密码长度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PasswordLength 密码长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPasswordLength() {
        return this.PasswordLength;
    }

    /**
     * Set 密码长度
注意：此字段可能返回 null，表示取不到有效值。
     * @param PasswordLength 密码长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPasswordLength(Long PasswordLength) {
        this.PasswordLength = PasswordLength;
    }

    /**
     * Get 包含小写字母
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmallLetter 包含小写字母
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSmallLetter() {
        return this.SmallLetter;
    }

    /**
     * Set 包含小写字母
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmallLetter 包含小写字母
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmallLetter(Long SmallLetter) {
        this.SmallLetter = SmallLetter;
    }

    /**
     * Get 包含大写字母
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BigLetter 包含大写字母
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBigLetter() {
        return this.BigLetter;
    }

    /**
     * Set 包含大写字母
注意：此字段可能返回 null，表示取不到有效值。
     * @param BigLetter 包含大写字母
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBigLetter(Long BigLetter) {
        this.BigLetter = BigLetter;
    }

    /**
     * Get 包含数字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Digit 包含数字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDigit() {
        return this.Digit;
    }

    /**
     * Set 包含数字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Digit 包含数字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDigit(Long Digit) {
        this.Digit = Digit;
    }

    /**
     * Get 包含的特殊字符，base64
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Symbol 包含的特殊字符，base64
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSymbol() {
        return this.Symbol;
    }

    /**
     * Set 包含的特殊字符，base64
注意：此字段可能返回 null，表示取不到有效值。
     * @param Symbol 包含的特殊字符，base64
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    /**
     * Get 改密完成通知。0-通知，1-不通知
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompleteNotify 改密完成通知。0-通知，1-不通知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompleteNotify() {
        return this.CompleteNotify;
    }

    /**
     * Set 改密完成通知。0-通知，1-不通知
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompleteNotify 改密完成通知。0-通知，1-不通知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompleteNotify(Long CompleteNotify) {
        this.CompleteNotify = CompleteNotify;
    }

    /**
     * Get 通知人邮箱
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotifyEmails 通知人邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNotifyEmails() {
        return this.NotifyEmails;
    }

    /**
     * Set 通知人邮箱
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotifyEmails 通知人邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotifyEmails(String [] NotifyEmails) {
        this.NotifyEmails = NotifyEmails;
    }

    /**
     * Get 加密附件密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilePassword 加密附件密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilePassword() {
        return this.FilePassword;
    }

    /**
     * Set 加密附件密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilePassword 加密附件密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilePassword(String FilePassword) {
        this.FilePassword = FilePassword;
    }

    /**
     * Get 需要改密的账户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountSet 需要改密的账户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAccountSet() {
        return this.AccountSet;
    }

    /**
     * Set 需要改密的账户
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountSet 需要改密的账户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountSet(String [] AccountSet) {
        this.AccountSet = AccountSet;
    }

    /**
     * Get 需要改密的主机
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceSet 需要改密的主机
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Device [] getDeviceSet() {
        return this.DeviceSet;
    }

    /**
     * Set 需要改密的主机
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceSet 需要改密的主机
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceSet(Device [] DeviceSet) {
        this.DeviceSet = DeviceSet;
    }

    /**
     * Get 任务类型：4手动，5自动
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 任务类型：4手动，5自动
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 任务类型：4手动，5自动
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 任务类型：4手动，5自动
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Period 周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Period 周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 首次执行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstTime 首次执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set 首次执行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstTime 首次执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get 下次执行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextTime 下次执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextTime() {
        return this.NextTime;
    }

    /**
     * Set 下次执行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextTime 下次执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextTime(String NextTime) {
        this.NextTime = NextTime;
    }

    public ChangePwdTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangePwdTaskInfo(ChangePwdTaskInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.OperationId != null) {
            this.OperationId = new String(source.OperationId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Department != null) {
            this.Department = new Department(source.Department);
        }
        if (source.ChangeMethod != null) {
            this.ChangeMethod = new Long(source.ChangeMethod);
        }
        if (source.RunAccount != null) {
            this.RunAccount = new String(source.RunAccount);
        }
        if (source.AuthGenerationStrategy != null) {
            this.AuthGenerationStrategy = new Long(source.AuthGenerationStrategy);
        }
        if (source.PasswordLength != null) {
            this.PasswordLength = new Long(source.PasswordLength);
        }
        if (source.SmallLetter != null) {
            this.SmallLetter = new Long(source.SmallLetter);
        }
        if (source.BigLetter != null) {
            this.BigLetter = new Long(source.BigLetter);
        }
        if (source.Digit != null) {
            this.Digit = new Long(source.Digit);
        }
        if (source.Symbol != null) {
            this.Symbol = new String(source.Symbol);
        }
        if (source.CompleteNotify != null) {
            this.CompleteNotify = new Long(source.CompleteNotify);
        }
        if (source.NotifyEmails != null) {
            this.NotifyEmails = new String[source.NotifyEmails.length];
            for (int i = 0; i < source.NotifyEmails.length; i++) {
                this.NotifyEmails[i] = new String(source.NotifyEmails[i]);
            }
        }
        if (source.FilePassword != null) {
            this.FilePassword = new String(source.FilePassword);
        }
        if (source.AccountSet != null) {
            this.AccountSet = new String[source.AccountSet.length];
            for (int i = 0; i < source.AccountSet.length; i++) {
                this.AccountSet[i] = new String(source.AccountSet[i]);
            }
        }
        if (source.DeviceSet != null) {
            this.DeviceSet = new Device[source.DeviceSet.length];
            for (int i = 0; i < source.DeviceSet.length; i++) {
                this.DeviceSet[i] = new Device(source.DeviceSet[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.NextTime != null) {
            this.NextTime = new String(source.NextTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "OperationId", this.OperationId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamObj(map, prefix + "Department.", this.Department);
        this.setParamSimple(map, prefix + "ChangeMethod", this.ChangeMethod);
        this.setParamSimple(map, prefix + "RunAccount", this.RunAccount);
        this.setParamSimple(map, prefix + "AuthGenerationStrategy", this.AuthGenerationStrategy);
        this.setParamSimple(map, prefix + "PasswordLength", this.PasswordLength);
        this.setParamSimple(map, prefix + "SmallLetter", this.SmallLetter);
        this.setParamSimple(map, prefix + "BigLetter", this.BigLetter);
        this.setParamSimple(map, prefix + "Digit", this.Digit);
        this.setParamSimple(map, prefix + "Symbol", this.Symbol);
        this.setParamSimple(map, prefix + "CompleteNotify", this.CompleteNotify);
        this.setParamArraySimple(map, prefix + "NotifyEmails.", this.NotifyEmails);
        this.setParamSimple(map, prefix + "FilePassword", this.FilePassword);
        this.setParamArraySimple(map, prefix + "AccountSet.", this.AccountSet);
        this.setParamArrayObj(map, prefix + "DeviceSet.", this.DeviceSet);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "NextTime", this.NextTime);

    }
}

