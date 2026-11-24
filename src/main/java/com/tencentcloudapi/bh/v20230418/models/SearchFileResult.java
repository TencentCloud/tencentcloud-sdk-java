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
    * <p>文件传输的时间</p>
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * <p>用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>姓名</p>
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * <p>资产ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>资产名称</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>资产公网IP</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>资产内网IP</p>
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * <p>操作结果：1 - 已放行，2 - 已阻断</p>
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * <p>操作类型：1 - 文件上传，2 - 文件下载，3 - 文件删除，4 - 文件(夹)移动，5 - 文件(夹)重命名，6 - 新建文件夹，9 - 删除文件夹</p>
    */
    @SerializedName("Method")
    @Expose
    private Long Method;

    /**
    * <p>下载的文件（夹）路径及名称</p>
    */
    @SerializedName("FileCurr")
    @Expose
    private String FileCurr;

    /**
    * <p>上传或新建文件（夹）路径及名称</p>
    */
    @SerializedName("FileNew")
    @Expose
    private String FileNew;

    /**
    * <p>会话id</p>
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
    * <p>账号</p>
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * <p>来源id</p>
    */
    @SerializedName("FromIp")
    @Expose
    private String FromIp;

    /**
    * <p>协议</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>文件大小</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>复核时间</p>
    */
    @SerializedName("ConfirmTime")
    @Expose
    private String ConfirmTime;

    /**
    * <p>用户部门id</p>
    */
    @SerializedName("UserDepartmentId")
    @Expose
    private String UserDepartmentId;

    /**
    * <p>用户部门name</p>
    */
    @SerializedName("UserDepartmentName")
    @Expose
    private String UserDepartmentName;

    /**
    * <p>设备部门id</p>
    */
    @SerializedName("DeviceDepartmentId")
    @Expose
    private String DeviceDepartmentId;

    /**
    * <p>设备部门name</p>
    */
    @SerializedName("DeviceDepartmentName")
    @Expose
    private String DeviceDepartmentName;

    /**
    * <p>签名值</p>
    */
    @SerializedName("SignValue")
    @Expose
    private String SignValue;

    /**
     * Get <p>文件传输的时间</p> 
     * @return Time <p>文件传输的时间</p>
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set <p>文件传输的时间</p>
     * @param Time <p>文件传输的时间</p>
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get <p>用户名</p> 
     * @return UserName <p>用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名</p>
     * @param UserName <p>用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>姓名</p> 
     * @return RealName <p>姓名</p>
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set <p>姓名</p>
     * @param RealName <p>姓名</p>
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get <p>资产ID</p> 
     * @return InstanceId <p>资产ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>资产ID</p>
     * @param InstanceId <p>资产ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>资产名称</p> 
     * @return DeviceName <p>资产名称</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>资产名称</p>
     * @param DeviceName <p>资产名称</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>资产公网IP</p> 
     * @return PublicIp <p>资产公网IP</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>资产公网IP</p>
     * @param PublicIp <p>资产公网IP</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>资产内网IP</p> 
     * @return PrivateIp <p>资产内网IP</p>
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set <p>资产内网IP</p>
     * @param PrivateIp <p>资产内网IP</p>
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get <p>操作结果：1 - 已放行，2 - 已阻断</p> 
     * @return Action <p>操作结果：1 - 已放行，2 - 已阻断</p>
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set <p>操作结果：1 - 已放行，2 - 已阻断</p>
     * @param Action <p>操作结果：1 - 已放行，2 - 已阻断</p>
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get <p>操作类型：1 - 文件上传，2 - 文件下载，3 - 文件删除，4 - 文件(夹)移动，5 - 文件(夹)重命名，6 - 新建文件夹，9 - 删除文件夹</p> 
     * @return Method <p>操作类型：1 - 文件上传，2 - 文件下载，3 - 文件删除，4 - 文件(夹)移动，5 - 文件(夹)重命名，6 - 新建文件夹，9 - 删除文件夹</p>
     */
    public Long getMethod() {
        return this.Method;
    }

    /**
     * Set <p>操作类型：1 - 文件上传，2 - 文件下载，3 - 文件删除，4 - 文件(夹)移动，5 - 文件(夹)重命名，6 - 新建文件夹，9 - 删除文件夹</p>
     * @param Method <p>操作类型：1 - 文件上传，2 - 文件下载，3 - 文件删除，4 - 文件(夹)移动，5 - 文件(夹)重命名，6 - 新建文件夹，9 - 删除文件夹</p>
     */
    public void setMethod(Long Method) {
        this.Method = Method;
    }

    /**
     * Get <p>下载的文件（夹）路径及名称</p> 
     * @return FileCurr <p>下载的文件（夹）路径及名称</p>
     */
    public String getFileCurr() {
        return this.FileCurr;
    }

    /**
     * Set <p>下载的文件（夹）路径及名称</p>
     * @param FileCurr <p>下载的文件（夹）路径及名称</p>
     */
    public void setFileCurr(String FileCurr) {
        this.FileCurr = FileCurr;
    }

    /**
     * Get <p>上传或新建文件（夹）路径及名称</p> 
     * @return FileNew <p>上传或新建文件（夹）路径及名称</p>
     */
    public String getFileNew() {
        return this.FileNew;
    }

    /**
     * Set <p>上传或新建文件（夹）路径及名称</p>
     * @param FileNew <p>上传或新建文件（夹）路径及名称</p>
     */
    public void setFileNew(String FileNew) {
        this.FileNew = FileNew;
    }

    /**
     * Get <p>会话id</p> 
     * @return Sid <p>会话id</p>
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * Set <p>会话id</p>
     * @param Sid <p>会话id</p>
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    /**
     * Get <p>账号</p> 
     * @return Account <p>账号</p>
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set <p>账号</p>
     * @param Account <p>账号</p>
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get <p>来源id</p> 
     * @return FromIp <p>来源id</p>
     */
    public String getFromIp() {
        return this.FromIp;
    }

    /**
     * Set <p>来源id</p>
     * @param FromIp <p>来源id</p>
     */
    public void setFromIp(String FromIp) {
        this.FromIp = FromIp;
    }

    /**
     * Get <p>协议</p> 
     * @return Protocol <p>协议</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议</p>
     * @param Protocol <p>协议</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>文件大小</p> 
     * @return Size <p>文件大小</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>文件大小</p>
     * @param Size <p>文件大小</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>复核时间</p> 
     * @return ConfirmTime <p>复核时间</p>
     */
    public String getConfirmTime() {
        return this.ConfirmTime;
    }

    /**
     * Set <p>复核时间</p>
     * @param ConfirmTime <p>复核时间</p>
     */
    public void setConfirmTime(String ConfirmTime) {
        this.ConfirmTime = ConfirmTime;
    }

    /**
     * Get <p>用户部门id</p> 
     * @return UserDepartmentId <p>用户部门id</p>
     */
    public String getUserDepartmentId() {
        return this.UserDepartmentId;
    }

    /**
     * Set <p>用户部门id</p>
     * @param UserDepartmentId <p>用户部门id</p>
     */
    public void setUserDepartmentId(String UserDepartmentId) {
        this.UserDepartmentId = UserDepartmentId;
    }

    /**
     * Get <p>用户部门name</p> 
     * @return UserDepartmentName <p>用户部门name</p>
     */
    public String getUserDepartmentName() {
        return this.UserDepartmentName;
    }

    /**
     * Set <p>用户部门name</p>
     * @param UserDepartmentName <p>用户部门name</p>
     */
    public void setUserDepartmentName(String UserDepartmentName) {
        this.UserDepartmentName = UserDepartmentName;
    }

    /**
     * Get <p>设备部门id</p> 
     * @return DeviceDepartmentId <p>设备部门id</p>
     */
    public String getDeviceDepartmentId() {
        return this.DeviceDepartmentId;
    }

    /**
     * Set <p>设备部门id</p>
     * @param DeviceDepartmentId <p>设备部门id</p>
     */
    public void setDeviceDepartmentId(String DeviceDepartmentId) {
        this.DeviceDepartmentId = DeviceDepartmentId;
    }

    /**
     * Get <p>设备部门name</p> 
     * @return DeviceDepartmentName <p>设备部门name</p>
     */
    public String getDeviceDepartmentName() {
        return this.DeviceDepartmentName;
    }

    /**
     * Set <p>设备部门name</p>
     * @param DeviceDepartmentName <p>设备部门name</p>
     */
    public void setDeviceDepartmentName(String DeviceDepartmentName) {
        this.DeviceDepartmentName = DeviceDepartmentName;
    }

    /**
     * Get <p>签名值</p> 
     * @return SignValue <p>签名值</p>
     */
    public String getSignValue() {
        return this.SignValue;
    }

    /**
     * Set <p>签名值</p>
     * @param SignValue <p>签名值</p>
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

