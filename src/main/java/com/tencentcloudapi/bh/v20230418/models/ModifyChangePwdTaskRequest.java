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

public class ModifyChangePwdTaskRequest extends AbstractModel {

    /**
    * <p>改密任务id</p>
    */
    @SerializedName("OperationId")
    @Expose
    private String OperationId;

    /**
    * <p>改密资产id列表</p>
    */
    @SerializedName("DeviceIdSet")
    @Expose
    private Long [] DeviceIdSet;

    /**
    * <p>改密资产的账号列表</p>
    */
    @SerializedName("AccountSet")
    @Expose
    private String [] AccountSet;

    /**
    * <p>修改类型：1：修改任务信息  2：关联任务资产账号</p>
    */
    @SerializedName("ModifyType")
    @Expose
    private Long ModifyType;

    /**
    * <p>改密方式。1：使用执行账号修改密码；2：修改自身密码</p>
    */
    @SerializedName("ChangeMethod")
    @Expose
    private Long ChangeMethod;

    /**
    * <p>密码生成方式。 1:自动生成相同密码 2:自动生成不同密码 3:手动指定相同密码</p>
    */
    @SerializedName("AuthGenerationStrategy")
    @Expose
    private Long AuthGenerationStrategy;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>所属部门ID，&quot;1,2,3&quot;</p>
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
    * <p>任务的执行账号</p>
    */
    @SerializedName("RunAccount")
    @Expose
    private String RunAccount;

    /**
    * <p>密码，手动指定密码时必传。</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>密码限制长度，自动生成密码必传。</p>
    */
    @SerializedName("PasswordLength")
    @Expose
    private Long PasswordLength;

    /**
    * <p>密码包含小写字母，0：否，1：是。</p>
    */
    @SerializedName("SmallLetter")
    @Expose
    private Long SmallLetter;

    /**
    * <p>密码包含大写字母，0：否，1：是。</p>
    */
    @SerializedName("BigLetter")
    @Expose
    private Long BigLetter;

    /**
    * <p>密码包含数字，0：否，1：是。</p>
    */
    @SerializedName("Digit")
    @Expose
    private Long Digit;

    /**
    * <p>密码包含的特殊字符（base64编码），包含：^[-_#();%~!+=]*$</p>
    */
    @SerializedName("Symbol")
    @Expose
    private String Symbol;

    /**
    * <p>改密完成通知。0：不通知 1：通知</p>
    */
    @SerializedName("CompleteNotify")
    @Expose
    private Long CompleteNotify;

    /**
    * <p>通知邮箱</p>
    */
    @SerializedName("NotifyEmails")
    @Expose
    private String [] NotifyEmails;

    /**
    * <p>加密压缩文件密码</p>
    */
    @SerializedName("FilePassword")
    @Expose
    private String FilePassword;

    /**
    * <p>任务类型， 4：手工执行  5：周期自动执行</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>周期任务周期，单位天（大于等于 1，小于等于 365）</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>周期任务首次执行时间</p>
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

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
    * <p>改密协议端口号，Linux 改密类型协议端口号需设置为0</p><p>取值范围：[0, 65535]</p><p>默认值：0</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get <p>改密任务id</p> 
     * @return OperationId <p>改密任务id</p>
     */
    public String getOperationId() {
        return this.OperationId;
    }

    /**
     * Set <p>改密任务id</p>
     * @param OperationId <p>改密任务id</p>
     */
    public void setOperationId(String OperationId) {
        this.OperationId = OperationId;
    }

    /**
     * Get <p>改密资产id列表</p> 
     * @return DeviceIdSet <p>改密资产id列表</p>
     */
    public Long [] getDeviceIdSet() {
        return this.DeviceIdSet;
    }

    /**
     * Set <p>改密资产id列表</p>
     * @param DeviceIdSet <p>改密资产id列表</p>
     */
    public void setDeviceIdSet(Long [] DeviceIdSet) {
        this.DeviceIdSet = DeviceIdSet;
    }

    /**
     * Get <p>改密资产的账号列表</p> 
     * @return AccountSet <p>改密资产的账号列表</p>
     */
    public String [] getAccountSet() {
        return this.AccountSet;
    }

    /**
     * Set <p>改密资产的账号列表</p>
     * @param AccountSet <p>改密资产的账号列表</p>
     */
    public void setAccountSet(String [] AccountSet) {
        this.AccountSet = AccountSet;
    }

    /**
     * Get <p>修改类型：1：修改任务信息  2：关联任务资产账号</p> 
     * @return ModifyType <p>修改类型：1：修改任务信息  2：关联任务资产账号</p>
     */
    public Long getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set <p>修改类型：1：修改任务信息  2：关联任务资产账号</p>
     * @param ModifyType <p>修改类型：1：修改任务信息  2：关联任务资产账号</p>
     */
    public void setModifyType(Long ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get <p>改密方式。1：使用执行账号修改密码；2：修改自身密码</p> 
     * @return ChangeMethod <p>改密方式。1：使用执行账号修改密码；2：修改自身密码</p>
     */
    public Long getChangeMethod() {
        return this.ChangeMethod;
    }

    /**
     * Set <p>改密方式。1：使用执行账号修改密码；2：修改自身密码</p>
     * @param ChangeMethod <p>改密方式。1：使用执行账号修改密码；2：修改自身密码</p>
     */
    public void setChangeMethod(Long ChangeMethod) {
        this.ChangeMethod = ChangeMethod;
    }

    /**
     * Get <p>密码生成方式。 1:自动生成相同密码 2:自动生成不同密码 3:手动指定相同密码</p> 
     * @return AuthGenerationStrategy <p>密码生成方式。 1:自动生成相同密码 2:自动生成不同密码 3:手动指定相同密码</p>
     */
    public Long getAuthGenerationStrategy() {
        return this.AuthGenerationStrategy;
    }

    /**
     * Set <p>密码生成方式。 1:自动生成相同密码 2:自动生成不同密码 3:手动指定相同密码</p>
     * @param AuthGenerationStrategy <p>密码生成方式。 1:自动生成相同密码 2:自动生成不同密码 3:手动指定相同密码</p>
     */
    public void setAuthGenerationStrategy(Long AuthGenerationStrategy) {
        this.AuthGenerationStrategy = AuthGenerationStrategy;
    }

    /**
     * Get <p>任务名称</p> 
     * @return TaskName <p>任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
     * @param TaskName <p>任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>所属部门ID，&quot;1,2,3&quot;</p> 
     * @return DepartmentId <p>所属部门ID，&quot;1,2,3&quot;</p>
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set <p>所属部门ID，&quot;1,2,3&quot;</p>
     * @param DepartmentId <p>所属部门ID，&quot;1,2,3&quot;</p>
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    /**
     * Get <p>任务的执行账号</p> 
     * @return RunAccount <p>任务的执行账号</p>
     */
    public String getRunAccount() {
        return this.RunAccount;
    }

    /**
     * Set <p>任务的执行账号</p>
     * @param RunAccount <p>任务的执行账号</p>
     */
    public void setRunAccount(String RunAccount) {
        this.RunAccount = RunAccount;
    }

    /**
     * Get <p>密码，手动指定密码时必传。</p> 
     * @return Password <p>密码，手动指定密码时必传。</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>密码，手动指定密码时必传。</p>
     * @param Password <p>密码，手动指定密码时必传。</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>密码限制长度，自动生成密码必传。</p> 
     * @return PasswordLength <p>密码限制长度，自动生成密码必传。</p>
     */
    public Long getPasswordLength() {
        return this.PasswordLength;
    }

    /**
     * Set <p>密码限制长度，自动生成密码必传。</p>
     * @param PasswordLength <p>密码限制长度，自动生成密码必传。</p>
     */
    public void setPasswordLength(Long PasswordLength) {
        this.PasswordLength = PasswordLength;
    }

    /**
     * Get <p>密码包含小写字母，0：否，1：是。</p> 
     * @return SmallLetter <p>密码包含小写字母，0：否，1：是。</p>
     */
    public Long getSmallLetter() {
        return this.SmallLetter;
    }

    /**
     * Set <p>密码包含小写字母，0：否，1：是。</p>
     * @param SmallLetter <p>密码包含小写字母，0：否，1：是。</p>
     */
    public void setSmallLetter(Long SmallLetter) {
        this.SmallLetter = SmallLetter;
    }

    /**
     * Get <p>密码包含大写字母，0：否，1：是。</p> 
     * @return BigLetter <p>密码包含大写字母，0：否，1：是。</p>
     */
    public Long getBigLetter() {
        return this.BigLetter;
    }

    /**
     * Set <p>密码包含大写字母，0：否，1：是。</p>
     * @param BigLetter <p>密码包含大写字母，0：否，1：是。</p>
     */
    public void setBigLetter(Long BigLetter) {
        this.BigLetter = BigLetter;
    }

    /**
     * Get <p>密码包含数字，0：否，1：是。</p> 
     * @return Digit <p>密码包含数字，0：否，1：是。</p>
     */
    public Long getDigit() {
        return this.Digit;
    }

    /**
     * Set <p>密码包含数字，0：否，1：是。</p>
     * @param Digit <p>密码包含数字，0：否，1：是。</p>
     */
    public void setDigit(Long Digit) {
        this.Digit = Digit;
    }

    /**
     * Get <p>密码包含的特殊字符（base64编码），包含：^[-_#();%~!+=]*$</p> 
     * @return Symbol <p>密码包含的特殊字符（base64编码），包含：^[-_#();%~!+=]*$</p>
     */
    public String getSymbol() {
        return this.Symbol;
    }

    /**
     * Set <p>密码包含的特殊字符（base64编码），包含：^[-_#();%~!+=]*$</p>
     * @param Symbol <p>密码包含的特殊字符（base64编码），包含：^[-_#();%~!+=]*$</p>
     */
    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    /**
     * Get <p>改密完成通知。0：不通知 1：通知</p> 
     * @return CompleteNotify <p>改密完成通知。0：不通知 1：通知</p>
     */
    public Long getCompleteNotify() {
        return this.CompleteNotify;
    }

    /**
     * Set <p>改密完成通知。0：不通知 1：通知</p>
     * @param CompleteNotify <p>改密完成通知。0：不通知 1：通知</p>
     */
    public void setCompleteNotify(Long CompleteNotify) {
        this.CompleteNotify = CompleteNotify;
    }

    /**
     * Get <p>通知邮箱</p> 
     * @return NotifyEmails <p>通知邮箱</p>
     */
    public String [] getNotifyEmails() {
        return this.NotifyEmails;
    }

    /**
     * Set <p>通知邮箱</p>
     * @param NotifyEmails <p>通知邮箱</p>
     */
    public void setNotifyEmails(String [] NotifyEmails) {
        this.NotifyEmails = NotifyEmails;
    }

    /**
     * Get <p>加密压缩文件密码</p> 
     * @return FilePassword <p>加密压缩文件密码</p>
     */
    public String getFilePassword() {
        return this.FilePassword;
    }

    /**
     * Set <p>加密压缩文件密码</p>
     * @param FilePassword <p>加密压缩文件密码</p>
     */
    public void setFilePassword(String FilePassword) {
        this.FilePassword = FilePassword;
    }

    /**
     * Get <p>任务类型， 4：手工执行  5：周期自动执行</p> 
     * @return Type <p>任务类型， 4：手工执行  5：周期自动执行</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>任务类型， 4：手工执行  5：周期自动执行</p>
     * @param Type <p>任务类型， 4：手工执行  5：周期自动执行</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>周期任务周期，单位天（大于等于 1，小于等于 365）</p> 
     * @return Period <p>周期任务周期，单位天（大于等于 1，小于等于 365）</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>周期任务周期，单位天（大于等于 1，小于等于 365）</p>
     * @param Period <p>周期任务周期，单位天（大于等于 1，小于等于 365）</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>周期任务首次执行时间</p> 
     * @return FirstTime <p>周期任务首次执行时间</p>
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set <p>周期任务首次执行时间</p>
     * @param FirstTime <p>周期任务首次执行时间</p>
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
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
     * Get <p>改密协议端口号，Linux 改密类型协议端口号需设置为0</p><p>取值范围：[0, 65535]</p><p>默认值：0</p> 
     * @return Port <p>改密协议端口号，Linux 改密类型协议端口号需设置为0</p><p>取值范围：[0, 65535]</p><p>默认值：0</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>改密协议端口号，Linux 改密类型协议端口号需设置为0</p><p>取值范围：[0, 65535]</p><p>默认值：0</p>
     * @param Port <p>改密协议端口号，Linux 改密类型协议端口号需设置为0</p><p>取值范围：[0, 65535]</p><p>默认值：0</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public ModifyChangePwdTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyChangePwdTaskRequest(ModifyChangePwdTaskRequest source) {
        if (source.OperationId != null) {
            this.OperationId = new String(source.OperationId);
        }
        if (source.DeviceIdSet != null) {
            this.DeviceIdSet = new Long[source.DeviceIdSet.length];
            for (int i = 0; i < source.DeviceIdSet.length; i++) {
                this.DeviceIdSet[i] = new Long(source.DeviceIdSet[i]);
            }
        }
        if (source.AccountSet != null) {
            this.AccountSet = new String[source.AccountSet.length];
            for (int i = 0; i < source.AccountSet.length; i++) {
                this.AccountSet[i] = new String(source.AccountSet[i]);
            }
        }
        if (source.ModifyType != null) {
            this.ModifyType = new Long(source.ModifyType);
        }
        if (source.ChangeMethod != null) {
            this.ChangeMethod = new Long(source.ChangeMethod);
        }
        if (source.AuthGenerationStrategy != null) {
            this.AuthGenerationStrategy = new Long(source.AuthGenerationStrategy);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
        if (source.RunAccount != null) {
            this.RunAccount = new String(source.RunAccount);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
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
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
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
        this.setParamSimple(map, prefix + "OperationId", this.OperationId);
        this.setParamArraySimple(map, prefix + "DeviceIdSet.", this.DeviceIdSet);
        this.setParamArraySimple(map, prefix + "AccountSet.", this.AccountSet);
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "ChangeMethod", this.ChangeMethod);
        this.setParamSimple(map, prefix + "AuthGenerationStrategy", this.AuthGenerationStrategy);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);
        this.setParamSimple(map, prefix + "RunAccount", this.RunAccount);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "PasswordLength", this.PasswordLength);
        this.setParamSimple(map, prefix + "SmallLetter", this.SmallLetter);
        this.setParamSimple(map, prefix + "BigLetter", this.BigLetter);
        this.setParamSimple(map, prefix + "Digit", this.Digit);
        this.setParamSimple(map, prefix + "Symbol", this.Symbol);
        this.setParamSimple(map, prefix + "CompleteNotify", this.CompleteNotify);
        this.setParamArraySimple(map, prefix + "NotifyEmails.", this.NotifyEmails);
        this.setParamSimple(map, prefix + "FilePassword", this.FilePassword);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

