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

public class SearchFileBySidResult extends AbstractModel {

    /**
    * <p>会话Id</p>
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
    * <p>用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>实例Id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>资产账号</p>
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * <p>来源Ip</p>
    */
    @SerializedName("FromIp")
    @Expose
    private String FromIp;

    /**
    * <p>文件操作时间</p>
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * <p>1-上传文件 2-下载文件 3-删除文件 4-移动文件 5-重命名文件 6-新建文件夹 7-移动文件夹 8-重命名文件夹 9-删除文件夹</p>
    */
    @SerializedName("Method")
    @Expose
    private Long Method;

    /**
    * <p>文件传输协议</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>method为上传、下载、删除时文件在服务器上的位置, 或重命名、移动文件前文件的位置</p>
    */
    @SerializedName("FileCurr")
    @Expose
    private String FileCurr;

    /**
    * <p>method为重命名、移动文件时代表移动后的新位置.其他情况为null</p>
    */
    @SerializedName("FileNew")
    @Expose
    private String FileNew;

    /**
    * <p>method为上传文件、下载文件、删除文件时显示文件大小。其他情况为null</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>堡垒机拦截情况, 1-已放行，  2-已阻断</p>
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * <p>复核时间，当Action是3时，需有复核时间</p>
    */
    @SerializedName("ConfirmTime")
    @Expose
    private String ConfirmTime;

    /**
    * <p>用户部门Id</p>
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
     * Get <p>会话Id</p> 
     * @return Sid <p>会话Id</p>
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * Set <p>会话Id</p>
     * @param Sid <p>会话Id</p>
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
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
     * Get <p>实例Id</p> 
     * @return InstanceId <p>实例Id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例Id</p>
     * @param InstanceId <p>实例Id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>资产账号</p> 
     * @return Account <p>资产账号</p>
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set <p>资产账号</p>
     * @param Account <p>资产账号</p>
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get <p>来源Ip</p> 
     * @return FromIp <p>来源Ip</p>
     */
    public String getFromIp() {
        return this.FromIp;
    }

    /**
     * Set <p>来源Ip</p>
     * @param FromIp <p>来源Ip</p>
     */
    public void setFromIp(String FromIp) {
        this.FromIp = FromIp;
    }

    /**
     * Get <p>文件操作时间</p> 
     * @return Time <p>文件操作时间</p>
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set <p>文件操作时间</p>
     * @param Time <p>文件操作时间</p>
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get <p>1-上传文件 2-下载文件 3-删除文件 4-移动文件 5-重命名文件 6-新建文件夹 7-移动文件夹 8-重命名文件夹 9-删除文件夹</p> 
     * @return Method <p>1-上传文件 2-下载文件 3-删除文件 4-移动文件 5-重命名文件 6-新建文件夹 7-移动文件夹 8-重命名文件夹 9-删除文件夹</p>
     */
    public Long getMethod() {
        return this.Method;
    }

    /**
     * Set <p>1-上传文件 2-下载文件 3-删除文件 4-移动文件 5-重命名文件 6-新建文件夹 7-移动文件夹 8-重命名文件夹 9-删除文件夹</p>
     * @param Method <p>1-上传文件 2-下载文件 3-删除文件 4-移动文件 5-重命名文件 6-新建文件夹 7-移动文件夹 8-重命名文件夹 9-删除文件夹</p>
     */
    public void setMethod(Long Method) {
        this.Method = Method;
    }

    /**
     * Get <p>文件传输协议</p> 
     * @return Protocol <p>文件传输协议</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>文件传输协议</p>
     * @param Protocol <p>文件传输协议</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>method为上传、下载、删除时文件在服务器上的位置, 或重命名、移动文件前文件的位置</p> 
     * @return FileCurr <p>method为上传、下载、删除时文件在服务器上的位置, 或重命名、移动文件前文件的位置</p>
     */
    public String getFileCurr() {
        return this.FileCurr;
    }

    /**
     * Set <p>method为上传、下载、删除时文件在服务器上的位置, 或重命名、移动文件前文件的位置</p>
     * @param FileCurr <p>method为上传、下载、删除时文件在服务器上的位置, 或重命名、移动文件前文件的位置</p>
     */
    public void setFileCurr(String FileCurr) {
        this.FileCurr = FileCurr;
    }

    /**
     * Get <p>method为重命名、移动文件时代表移动后的新位置.其他情况为null</p> 
     * @return FileNew <p>method为重命名、移动文件时代表移动后的新位置.其他情况为null</p>
     */
    public String getFileNew() {
        return this.FileNew;
    }

    /**
     * Set <p>method为重命名、移动文件时代表移动后的新位置.其他情况为null</p>
     * @param FileNew <p>method为重命名、移动文件时代表移动后的新位置.其他情况为null</p>
     */
    public void setFileNew(String FileNew) {
        this.FileNew = FileNew;
    }

    /**
     * Get <p>method为上传文件、下载文件、删除文件时显示文件大小。其他情况为null</p> 
     * @return Size <p>method为上传文件、下载文件、删除文件时显示文件大小。其他情况为null</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>method为上传文件、下载文件、删除文件时显示文件大小。其他情况为null</p>
     * @param Size <p>method为上传文件、下载文件、删除文件时显示文件大小。其他情况为null</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>堡垒机拦截情况, 1-已放行，  2-已阻断</p> 
     * @return Action <p>堡垒机拦截情况, 1-已放行，  2-已阻断</p>
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set <p>堡垒机拦截情况, 1-已放行，  2-已阻断</p>
     * @param Action <p>堡垒机拦截情况, 1-已放行，  2-已阻断</p>
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get <p>复核时间，当Action是3时，需有复核时间</p> 
     * @return ConfirmTime <p>复核时间，当Action是3时，需有复核时间</p>
     */
    public String getConfirmTime() {
        return this.ConfirmTime;
    }

    /**
     * Set <p>复核时间，当Action是3时，需有复核时间</p>
     * @param ConfirmTime <p>复核时间，当Action是3时，需有复核时间</p>
     */
    public void setConfirmTime(String ConfirmTime) {
        this.ConfirmTime = ConfirmTime;
    }

    /**
     * Get <p>用户部门Id</p> 
     * @return UserDepartmentId <p>用户部门Id</p>
     */
    public String getUserDepartmentId() {
        return this.UserDepartmentId;
    }

    /**
     * Set <p>用户部门Id</p>
     * @param UserDepartmentId <p>用户部门Id</p>
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

    public SearchFileBySidResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchFileBySidResult(SearchFileBySidResult source) {
        if (source.Sid != null) {
            this.Sid = new String(source.Sid);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.FromIp != null) {
            this.FromIp = new String(source.FromIp);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Method != null) {
            this.Method = new Long(source.Method);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.FileCurr != null) {
            this.FileCurr = new String(source.FileCurr);
        }
        if (source.FileNew != null) {
            this.FileNew = new String(source.FileNew);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
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
        this.setParamSimple(map, prefix + "Sid", this.Sid);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "FromIp", this.FromIp);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "FileCurr", this.FileCurr);
        this.setParamSimple(map, prefix + "FileNew", this.FileNew);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "ConfirmTime", this.ConfirmTime);
        this.setParamSimple(map, prefix + "UserDepartmentId", this.UserDepartmentId);
        this.setParamSimple(map, prefix + "UserDepartmentName", this.UserDepartmentName);
        this.setParamSimple(map, prefix + "DeviceDepartmentId", this.DeviceDepartmentId);
        this.setParamSimple(map, prefix + "DeviceDepartmentName", this.DeviceDepartmentName);
        this.setParamSimple(map, prefix + "SignValue", this.SignValue);

    }
}

