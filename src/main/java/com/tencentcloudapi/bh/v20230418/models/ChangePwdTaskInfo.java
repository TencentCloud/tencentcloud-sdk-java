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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChangePwdTaskInfo extends AbstractModel {

    /**
    * <p>id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>任务id</p>
    */
    @SerializedName("OperationId")
    @Expose
    private String OperationId;

    /**
    * <p>任务名</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>所属部门信息</p>
    */
    @SerializedName("Department")
    @Expose
    private Department Department;

    /**
    * <p>改密方式。1：使用执行账号。2：修改自身密码</p>
    */
    @SerializedName("ChangeMethod")
    @Expose
    private Long ChangeMethod;

    /**
    * <p>执行账号</p>
    */
    @SerializedName("RunAccount")
    @Expose
    private String RunAccount;

    /**
    * <p>密码生成策略</p>
    */
    @SerializedName("AuthGenerationStrategy")
    @Expose
    private Long AuthGenerationStrategy;

    /**
    * <p>密码长度</p>
    */
    @SerializedName("PasswordLength")
    @Expose
    private Long PasswordLength;

    /**
    * <p>包含小写字母</p>
    */
    @SerializedName("SmallLetter")
    @Expose
    private Long SmallLetter;

    /**
    * <p>包含大写字母</p>
    */
    @SerializedName("BigLetter")
    @Expose
    private Long BigLetter;

    /**
    * <p>包含数字</p>
    */
    @SerializedName("Digit")
    @Expose
    private Long Digit;

    /**
    * <p>包含的特殊字符，入参base64</p>
    */
    @SerializedName("Symbol")
    @Expose
    private String Symbol;

    /**
    * <p>改密完成通知。0-通知，1-不通知</p>
    */
    @SerializedName("CompleteNotify")
    @Expose
    private Long CompleteNotify;

    /**
    * <p>通知人邮箱</p>
    */
    @SerializedName("NotifyEmails")
    @Expose
    private String [] NotifyEmails;

    /**
    * <p>加密附件密码</p>
    */
    @SerializedName("FilePassword")
    @Expose
    private String FilePassword;

    /**
    * <p>需要改密的账户</p>
    */
    @SerializedName("AccountSet")
    @Expose
    private String [] AccountSet;

    /**
    * <p>需要改密的主机</p>
    */
    @SerializedName("DeviceSet")
    @Expose
    private Device [] DeviceSet;

    /**
    * <p>任务类型：4手动，5自动</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>周期</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>首次执行时间</p>
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * <p>下次执行时间</p>
    */
    @SerializedName("NextTime")
    @Expose
    private String NextTime;

    /**
    * <p>上次执行时间</p>
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * <p>改密任务状态，0-待执行，1-执行完成，2-执行失败，3-执行中，4-执行超时</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>改密任务类别</p><p>枚举值：</p><ul><li>0： Linux 类型改密任务</li><li>1： Windows 类型改密任务</li></ul><p>默认值：0</p>
    */
    @SerializedName("Category")
    @Expose
    private Long Category;

    /**
    * <p>改密任务协议类型</p><p>枚举值：</p><ul><li>0： 未定义，Linux 改密任务类型默认值</li><li>1： Windows OpenSSH 协议</li></ul><p>默认值：0</p>
    */
    @SerializedName("Protocol")
    @Expose
    private Long Protocol;

    /**
    * <p>改密协议端口号. Linux 改密协议类型端口号值为0</p><p>默认值：0</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get <p>id</p> 
     * @return Id <p>id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>id</p>
     * @param Id <p>id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>任务id</p> 
     * @return OperationId <p>任务id</p>
     */
    public String getOperationId() {
        return this.OperationId;
    }

    /**
     * Set <p>任务id</p>
     * @param OperationId <p>任务id</p>
     */
    public void setOperationId(String OperationId) {
        this.OperationId = OperationId;
    }

    /**
     * Get <p>任务名</p> 
     * @return TaskName <p>任务名</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名</p>
     * @param TaskName <p>任务名</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>所属部门信息</p> 
     * @return Department <p>所属部门信息</p>
     */
    public Department getDepartment() {
        return this.Department;
    }

    /**
     * Set <p>所属部门信息</p>
     * @param Department <p>所属部门信息</p>
     */
    public void setDepartment(Department Department) {
        this.Department = Department;
    }

    /**
     * Get <p>改密方式。1：使用执行账号。2：修改自身密码</p> 
     * @return ChangeMethod <p>改密方式。1：使用执行账号。2：修改自身密码</p>
     */
    public Long getChangeMethod() {
        return this.ChangeMethod;
    }

    /**
     * Set <p>改密方式。1：使用执行账号。2：修改自身密码</p>
     * @param ChangeMethod <p>改密方式。1：使用执行账号。2：修改自身密码</p>
     */
    public void setChangeMethod(Long ChangeMethod) {
        this.ChangeMethod = ChangeMethod;
    }

    /**
     * Get <p>执行账号</p> 
     * @return RunAccount <p>执行账号</p>
     */
    public String getRunAccount() {
        return this.RunAccount;
    }

    /**
     * Set <p>执行账号</p>
     * @param RunAccount <p>执行账号</p>
     */
    public void setRunAccount(String RunAccount) {
        this.RunAccount = RunAccount;
    }

    /**
     * Get <p>密码生成策略</p> 
     * @return AuthGenerationStrategy <p>密码生成策略</p>
     */
    public Long getAuthGenerationStrategy() {
        return this.AuthGenerationStrategy;
    }

    /**
     * Set <p>密码生成策略</p>
     * @param AuthGenerationStrategy <p>密码生成策略</p>
     */
    public void setAuthGenerationStrategy(Long AuthGenerationStrategy) {
        this.AuthGenerationStrategy = AuthGenerationStrategy;
    }

    /**
     * Get <p>密码长度</p> 
     * @return PasswordLength <p>密码长度</p>
     */
    public Long getPasswordLength() {
        return this.PasswordLength;
    }

    /**
     * Set <p>密码长度</p>
     * @param PasswordLength <p>密码长度</p>
     */
    public void setPasswordLength(Long PasswordLength) {
        this.PasswordLength = PasswordLength;
    }

    /**
     * Get <p>包含小写字母</p> 
     * @return SmallLetter <p>包含小写字母</p>
     */
    public Long getSmallLetter() {
        return this.SmallLetter;
    }

    /**
     * Set <p>包含小写字母</p>
     * @param SmallLetter <p>包含小写字母</p>
     */
    public void setSmallLetter(Long SmallLetter) {
        this.SmallLetter = SmallLetter;
    }

    /**
     * Get <p>包含大写字母</p> 
     * @return BigLetter <p>包含大写字母</p>
     */
    public Long getBigLetter() {
        return this.BigLetter;
    }

    /**
     * Set <p>包含大写字母</p>
     * @param BigLetter <p>包含大写字母</p>
     */
    public void setBigLetter(Long BigLetter) {
        this.BigLetter = BigLetter;
    }

    /**
     * Get <p>包含数字</p> 
     * @return Digit <p>包含数字</p>
     */
    public Long getDigit() {
        return this.Digit;
    }

    /**
     * Set <p>包含数字</p>
     * @param Digit <p>包含数字</p>
     */
    public void setDigit(Long Digit) {
        this.Digit = Digit;
    }

    /**
     * Get <p>包含的特殊字符，入参base64</p> 
     * @return Symbol <p>包含的特殊字符，入参base64</p>
     */
    public String getSymbol() {
        return this.Symbol;
    }

    /**
     * Set <p>包含的特殊字符，入参base64</p>
     * @param Symbol <p>包含的特殊字符，入参base64</p>
     */
    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    /**
     * Get <p>改密完成通知。0-通知，1-不通知</p> 
     * @return CompleteNotify <p>改密完成通知。0-通知，1-不通知</p>
     */
    public Long getCompleteNotify() {
        return this.CompleteNotify;
    }

    /**
     * Set <p>改密完成通知。0-通知，1-不通知</p>
     * @param CompleteNotify <p>改密完成通知。0-通知，1-不通知</p>
     */
    public void setCompleteNotify(Long CompleteNotify) {
        this.CompleteNotify = CompleteNotify;
    }

    /**
     * Get <p>通知人邮箱</p> 
     * @return NotifyEmails <p>通知人邮箱</p>
     */
    public String [] getNotifyEmails() {
        return this.NotifyEmails;
    }

    /**
     * Set <p>通知人邮箱</p>
     * @param NotifyEmails <p>通知人邮箱</p>
     */
    public void setNotifyEmails(String [] NotifyEmails) {
        this.NotifyEmails = NotifyEmails;
    }

    /**
     * Get <p>加密附件密码</p> 
     * @return FilePassword <p>加密附件密码</p>
     */
    public String getFilePassword() {
        return this.FilePassword;
    }

    /**
     * Set <p>加密附件密码</p>
     * @param FilePassword <p>加密附件密码</p>
     */
    public void setFilePassword(String FilePassword) {
        this.FilePassword = FilePassword;
    }

    /**
     * Get <p>需要改密的账户</p> 
     * @return AccountSet <p>需要改密的账户</p>
     */
    public String [] getAccountSet() {
        return this.AccountSet;
    }

    /**
     * Set <p>需要改密的账户</p>
     * @param AccountSet <p>需要改密的账户</p>
     */
    public void setAccountSet(String [] AccountSet) {
        this.AccountSet = AccountSet;
    }

    /**
     * Get <p>需要改密的主机</p> 
     * @return DeviceSet <p>需要改密的主机</p>
     */
    public Device [] getDeviceSet() {
        return this.DeviceSet;
    }

    /**
     * Set <p>需要改密的主机</p>
     * @param DeviceSet <p>需要改密的主机</p>
     */
    public void setDeviceSet(Device [] DeviceSet) {
        this.DeviceSet = DeviceSet;
    }

    /**
     * Get <p>任务类型：4手动，5自动</p> 
     * @return Type <p>任务类型：4手动，5自动</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>任务类型：4手动，5自动</p>
     * @param Type <p>任务类型：4手动，5自动</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>周期</p> 
     * @return Period <p>周期</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>周期</p>
     * @param Period <p>周期</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>首次执行时间</p> 
     * @return FirstTime <p>首次执行时间</p>
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set <p>首次执行时间</p>
     * @param FirstTime <p>首次执行时间</p>
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get <p>下次执行时间</p> 
     * @return NextTime <p>下次执行时间</p>
     */
    public String getNextTime() {
        return this.NextTime;
    }

    /**
     * Set <p>下次执行时间</p>
     * @param NextTime <p>下次执行时间</p>
     */
    public void setNextTime(String NextTime) {
        this.NextTime = NextTime;
    }

    /**
     * Get <p>上次执行时间</p> 
     * @return LastTime <p>上次执行时间</p>
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set <p>上次执行时间</p>
     * @param LastTime <p>上次执行时间</p>
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get <p>改密任务状态，0-待执行，1-执行完成，2-执行失败，3-执行中，4-执行超时</p> 
     * @return Status <p>改密任务状态，0-待执行，1-执行完成，2-执行失败，3-执行中，4-执行超时</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>改密任务状态，0-待执行，1-执行完成，2-执行失败，3-执行中，4-执行超时</p>
     * @param Status <p>改密任务状态，0-待执行，1-执行完成，2-执行失败，3-执行中，4-执行超时</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>改密任务类别</p><p>枚举值：</p><ul><li>0： Linux 类型改密任务</li><li>1： Windows 类型改密任务</li></ul><p>默认值：0</p> 
     * @return Category <p>改密任务类别</p><p>枚举值：</p><ul><li>0： Linux 类型改密任务</li><li>1： Windows 类型改密任务</li></ul><p>默认值：0</p>
     */
    public Long getCategory() {
        return this.Category;
    }

    /**
     * Set <p>改密任务类别</p><p>枚举值：</p><ul><li>0： Linux 类型改密任务</li><li>1： Windows 类型改密任务</li></ul><p>默认值：0</p>
     * @param Category <p>改密任务类别</p><p>枚举值：</p><ul><li>0： Linux 类型改密任务</li><li>1： Windows 类型改密任务</li></ul><p>默认值：0</p>
     */
    public void setCategory(Long Category) {
        this.Category = Category;
    }

    /**
     * Get <p>改密任务协议类型</p><p>枚举值：</p><ul><li>0： 未定义，Linux 改密任务类型默认值</li><li>1： Windows OpenSSH 协议</li></ul><p>默认值：0</p> 
     * @return Protocol <p>改密任务协议类型</p><p>枚举值：</p><ul><li>0： 未定义，Linux 改密任务类型默认值</li><li>1： Windows OpenSSH 协议</li></ul><p>默认值：0</p>
     */
    public Long getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>改密任务协议类型</p><p>枚举值：</p><ul><li>0： 未定义，Linux 改密任务类型默认值</li><li>1： Windows OpenSSH 协议</li></ul><p>默认值：0</p>
     * @param Protocol <p>改密任务协议类型</p><p>枚举值：</p><ul><li>0： 未定义，Linux 改密任务类型默认值</li><li>1： Windows OpenSSH 协议</li></ul><p>默认值：0</p>
     */
    public void setProtocol(Long Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>改密协议端口号. Linux 改密协议类型端口号值为0</p><p>默认值：0</p> 
     * @return Port <p>改密协议端口号. Linux 改密协议类型端口号值为0</p><p>默认值：0</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>改密协议端口号. Linux 改密协议类型端口号值为0</p><p>默认值：0</p>
     * @param Port <p>改密协议端口号. Linux 改密协议类型端口号值为0</p><p>默认值：0</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
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
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Category != null) {
            this.Category = new Long(source.Category);
        }
        if (source.Protocol != null) {
            this.Protocol = new Long(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
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
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

