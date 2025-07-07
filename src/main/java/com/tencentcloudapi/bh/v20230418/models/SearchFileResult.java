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

public class SearchFileResult extends AbstractModel {

    /**
    * 文件传输的时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 姓名
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * 资产ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 资产名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 资产公网IP
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 资产内网IP
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 操作结果：1 - 已执行，2 - 已阻断
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * 操作类型：1 - 文件上传，2 - 文件下载，3 - 文件删除，4 - 文件(夹)移动，5 - 文件(夹)重命名，6 - 新建文件夹，9 - 删除文件夹
    */
    @SerializedName("Method")
    @Expose
    private Long Method;

    /**
    * 下载的文件（夹）路径及名称
    */
    @SerializedName("FileCurr")
    @Expose
    private String FileCurr;

    /**
    * 上传或新建文件（夹）路径及名称
    */
    @SerializedName("FileNew")
    @Expose
    private String FileNew;

    /**
    * 会话id
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
    * 账号
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 来源id
    */
    @SerializedName("FromIp")
    @Expose
    private String FromIp;

    /**
    * 协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 文件大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 复核时间
    */
    @SerializedName("ConfirmTime")
    @Expose
    private String ConfirmTime;

    /**
    * 用户部门id
    */
    @SerializedName("UserDepartmentId")
    @Expose
    private String UserDepartmentId;

    /**
    * 用户部门name
    */
    @SerializedName("UserDepartmentName")
    @Expose
    private String UserDepartmentName;

    /**
    * 设备部门id
    */
    @SerializedName("DeviceDepartmentId")
    @Expose
    private String DeviceDepartmentId;

    /**
    * 设备部门name	
    */
    @SerializedName("DeviceDepartmentName")
    @Expose
    private String DeviceDepartmentName;

    /**
    * 签名值
    */
    @SerializedName("SignValue")
    @Expose
    private String SignValue;

    /**
     * Get 文件传输的时间 
     * @return Time 文件传输的时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 文件传输的时间
     * @param Time 文件传输的时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 姓名 
     * @return RealName 姓名
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set 姓名
     * @param RealName 姓名
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get 资产ID 
     * @return InstanceId 资产ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资产ID
     * @param InstanceId 资产ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 资产名称 
     * @return DeviceName 资产名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 资产名称
     * @param DeviceName 资产名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 资产公网IP 
     * @return PublicIp 资产公网IP
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 资产公网IP
     * @param PublicIp 资产公网IP
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 资产内网IP 
     * @return PrivateIp 资产内网IP
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 资产内网IP
     * @param PrivateIp 资产内网IP
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 操作结果：1 - 已执行，2 - 已阻断 
     * @return Action 操作结果：1 - 已执行，2 - 已阻断
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set 操作结果：1 - 已执行，2 - 已阻断
     * @param Action 操作结果：1 - 已执行，2 - 已阻断
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get 操作类型：1 - 文件上传，2 - 文件下载，3 - 文件删除，4 - 文件(夹)移动，5 - 文件(夹)重命名，6 - 新建文件夹，9 - 删除文件夹 
     * @return Method 操作类型：1 - 文件上传，2 - 文件下载，3 - 文件删除，4 - 文件(夹)移动，5 - 文件(夹)重命名，6 - 新建文件夹，9 - 删除文件夹
     */
    public Long getMethod() {
        return this.Method;
    }

    /**
     * Set 操作类型：1 - 文件上传，2 - 文件下载，3 - 文件删除，4 - 文件(夹)移动，5 - 文件(夹)重命名，6 - 新建文件夹，9 - 删除文件夹
     * @param Method 操作类型：1 - 文件上传，2 - 文件下载，3 - 文件删除，4 - 文件(夹)移动，5 - 文件(夹)重命名，6 - 新建文件夹，9 - 删除文件夹
     */
    public void setMethod(Long Method) {
        this.Method = Method;
    }

    /**
     * Get 下载的文件（夹）路径及名称 
     * @return FileCurr 下载的文件（夹）路径及名称
     */
    public String getFileCurr() {
        return this.FileCurr;
    }

    /**
     * Set 下载的文件（夹）路径及名称
     * @param FileCurr 下载的文件（夹）路径及名称
     */
    public void setFileCurr(String FileCurr) {
        this.FileCurr = FileCurr;
    }

    /**
     * Get 上传或新建文件（夹）路径及名称 
     * @return FileNew 上传或新建文件（夹）路径及名称
     */
    public String getFileNew() {
        return this.FileNew;
    }

    /**
     * Set 上传或新建文件（夹）路径及名称
     * @param FileNew 上传或新建文件（夹）路径及名称
     */
    public void setFileNew(String FileNew) {
        this.FileNew = FileNew;
    }

    /**
     * Get 会话id 
     * @return Sid 会话id
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * Set 会话id
     * @param Sid 会话id
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    /**
     * Get 账号 
     * @return Account 账号
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 账号
     * @param Account 账号
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 来源id 
     * @return FromIp 来源id
     */
    public String getFromIp() {
        return this.FromIp;
    }

    /**
     * Set 来源id
     * @param FromIp 来源id
     */
    public void setFromIp(String FromIp) {
        this.FromIp = FromIp;
    }

    /**
     * Get 协议 
     * @return Protocol 协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议
     * @param Protocol 协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 文件大小 
     * @return Size 文件大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 文件大小
     * @param Size 文件大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 复核时间 
     * @return ConfirmTime 复核时间
     */
    public String getConfirmTime() {
        return this.ConfirmTime;
    }

    /**
     * Set 复核时间
     * @param ConfirmTime 复核时间
     */
    public void setConfirmTime(String ConfirmTime) {
        this.ConfirmTime = ConfirmTime;
    }

    /**
     * Get 用户部门id 
     * @return UserDepartmentId 用户部门id
     */
    public String getUserDepartmentId() {
        return this.UserDepartmentId;
    }

    /**
     * Set 用户部门id
     * @param UserDepartmentId 用户部门id
     */
    public void setUserDepartmentId(String UserDepartmentId) {
        this.UserDepartmentId = UserDepartmentId;
    }

    /**
     * Get 用户部门name 
     * @return UserDepartmentName 用户部门name
     */
    public String getUserDepartmentName() {
        return this.UserDepartmentName;
    }

    /**
     * Set 用户部门name
     * @param UserDepartmentName 用户部门name
     */
    public void setUserDepartmentName(String UserDepartmentName) {
        this.UserDepartmentName = UserDepartmentName;
    }

    /**
     * Get 设备部门id 
     * @return DeviceDepartmentId 设备部门id
     */
    public String getDeviceDepartmentId() {
        return this.DeviceDepartmentId;
    }

    /**
     * Set 设备部门id
     * @param DeviceDepartmentId 设备部门id
     */
    public void setDeviceDepartmentId(String DeviceDepartmentId) {
        this.DeviceDepartmentId = DeviceDepartmentId;
    }

    /**
     * Get 设备部门name	 
     * @return DeviceDepartmentName 设备部门name	
     */
    public String getDeviceDepartmentName() {
        return this.DeviceDepartmentName;
    }

    /**
     * Set 设备部门name	
     * @param DeviceDepartmentName 设备部门name	
     */
    public void setDeviceDepartmentName(String DeviceDepartmentName) {
        this.DeviceDepartmentName = DeviceDepartmentName;
    }

    /**
     * Get 签名值 
     * @return SignValue 签名值
     */
    public String getSignValue() {
        return this.SignValue;
    }

    /**
     * Set 签名值
     * @param SignValue 签名值
     */
    public void setSignValue(String SignValue) {
        this.SignValue = SignValue;
    }

    public SearchFileResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchFileResult(SearchFileResult source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.RealName != null) {
            this.RealName = new String(source.RealName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.Method != null) {
            this.Method = new Long(source.Method);
        }
        if (source.FileCurr != null) {
            this.FileCurr = new String(source.FileCurr);
        }
        if (source.FileNew != null) {
            this.FileNew = new String(source.FileNew);
        }
        if (source.Sid != null) {
            this.Sid = new String(source.Sid);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.FromIp != null) {
            this.FromIp = new String(source.FromIp);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.ConfirmTime != null) {
            this.ConfirmTime = new String(source.ConfirmTime);
        }
        if (source.UserDepartmentId != null) {
            this.UserDepartmentId = new String(source.UserDepartmentId);
        }
        if (source.UserDepartmentName != null) {
            this.UserDepartmentName = new String(source.UserDepartmentName);
        }
        if (source.DeviceDepartmentId != null) {
            this.DeviceDepartmentId = new String(source.DeviceDepartmentId);
        }
        if (source.DeviceDepartmentName != null) {
            this.DeviceDepartmentName = new String(source.DeviceDepartmentName);
        }
        if (source.SignValue != null) {
            this.SignValue = new String(source.SignValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "FileCurr", this.FileCurr);
        this.setParamSimple(map, prefix + "FileNew", this.FileNew);
        this.setParamSimple(map, prefix + "Sid", this.Sid);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "FromIp", this.FromIp);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "ConfirmTime", this.ConfirmTime);
        this.setParamSimple(map, prefix + "UserDepartmentId", this.UserDepartmentId);
        this.setParamSimple(map, prefix + "UserDepartmentName", this.UserDepartmentName);
        this.setParamSimple(map, prefix + "DeviceDepartmentId", this.DeviceDepartmentId);
        this.setParamSimple(map, prefix + "DeviceDepartmentName", this.DeviceDepartmentName);
        this.setParamSimple(map, prefix + "SignValue", this.SignValue);

    }
}

