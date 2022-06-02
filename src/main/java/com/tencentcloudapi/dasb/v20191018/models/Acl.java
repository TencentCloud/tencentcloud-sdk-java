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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Acl extends AbstractModel{

    /**
    * 访问权限ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 访问权限名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否开启磁盘映射
    */
    @SerializedName("AllowDiskRedirect")
    @Expose
    private Boolean AllowDiskRedirect;

    /**
    * 是否开启剪贴板文件上行
    */
    @SerializedName("AllowClipFileUp")
    @Expose
    private Boolean AllowClipFileUp;

    /**
    * 是否开启剪贴板文件下行
    */
    @SerializedName("AllowClipFileDown")
    @Expose
    private Boolean AllowClipFileDown;

    /**
    * 是否开启剪贴板文本（目前含图片）上行
    */
    @SerializedName("AllowClipTextUp")
    @Expose
    private Boolean AllowClipTextUp;

    /**
    * 是否开启剪贴板文本（目前含图片）下行
    */
    @SerializedName("AllowClipTextDown")
    @Expose
    private Boolean AllowClipTextDown;

    /**
    * 是否开启文件传输上传
    */
    @SerializedName("AllowFileUp")
    @Expose
    private Boolean AllowFileUp;

    /**
    * 文件传输上传大小限制（预留参数，暂未启用）
    */
    @SerializedName("MaxFileUpSize")
    @Expose
    private Long MaxFileUpSize;

    /**
    * 是否开启文件传输下载
    */
    @SerializedName("AllowFileDown")
    @Expose
    private Boolean AllowFileDown;

    /**
    * 文件传输下载大小限制（预留参数，暂未启用）
    */
    @SerializedName("MaxFileDownSize")
    @Expose
    private Long MaxFileDownSize;

    /**
    * 是否允许任意账号登录
    */
    @SerializedName("AllowAnyAccount")
    @Expose
    private Boolean AllowAnyAccount;

    /**
    * 关联的用户列表
    */
    @SerializedName("UserSet")
    @Expose
    private User [] UserSet;

    /**
    * 关联的用户组列表
    */
    @SerializedName("UserGroupSet")
    @Expose
    private Group [] UserGroupSet;

    /**
    * 关联的资产列表
    */
    @SerializedName("DeviceSet")
    @Expose
    private Device [] DeviceSet;

    /**
    * 关联的资产组列表
    */
    @SerializedName("DeviceGroupSet")
    @Expose
    private Group [] DeviceGroupSet;

    /**
    * 关联的账号列表
    */
    @SerializedName("AccountSet")
    @Expose
    private String [] AccountSet;

    /**
    * 关联的高危命令模板列表
    */
    @SerializedName("CmdTemplateSet")
    @Expose
    private CmdTemplate [] CmdTemplateSet;

    /**
    * 是否开启 RDP 磁盘映射文件上传
    */
    @SerializedName("AllowDiskFileUp")
    @Expose
    private Boolean AllowDiskFileUp;

    /**
    * 是否开启 RDP 磁盘映射文件下载
    */
    @SerializedName("AllowDiskFileDown")
    @Expose
    private Boolean AllowDiskFileDown;

    /**
    * 是否开启 rz sz 文件上传
    */
    @SerializedName("AllowShellFileUp")
    @Expose
    private Boolean AllowShellFileUp;

    /**
    * 是否开启 rz sz 文件下载
    */
    @SerializedName("AllowShellFileDown")
    @Expose
    private Boolean AllowShellFileDown;

    /**
    * 是否开启 SFTP 文件删除
    */
    @SerializedName("AllowFileDel")
    @Expose
    private Boolean AllowFileDel;

    /**
    * 访问权限生效时间，如:"2021-09-22T00:00:00+00:00"
生效、失效时间不填则访问权限长期有效
    */
    @SerializedName("ValidateFrom")
    @Expose
    private String ValidateFrom;

    /**
    * 访问权限失效时间，如:"2021-09-23T00:00:00+00:00"
生效、失效时间不填则访问权限长期有效
    */
    @SerializedName("ValidateTo")
    @Expose
    private String ValidateTo;

    /**
    * 访问权限状态，1 - 已生效，2 - 未生效，3 - 已过期
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 访问权限ID 
     * @return Id 访问权限ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 访问权限ID
     * @param Id 访问权限ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 访问权限名称 
     * @return Name 访问权限名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 访问权限名称
     * @param Name 访问权限名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否开启磁盘映射 
     * @return AllowDiskRedirect 是否开启磁盘映射
     */
    public Boolean getAllowDiskRedirect() {
        return this.AllowDiskRedirect;
    }

    /**
     * Set 是否开启磁盘映射
     * @param AllowDiskRedirect 是否开启磁盘映射
     */
    public void setAllowDiskRedirect(Boolean AllowDiskRedirect) {
        this.AllowDiskRedirect = AllowDiskRedirect;
    }

    /**
     * Get 是否开启剪贴板文件上行 
     * @return AllowClipFileUp 是否开启剪贴板文件上行
     */
    public Boolean getAllowClipFileUp() {
        return this.AllowClipFileUp;
    }

    /**
     * Set 是否开启剪贴板文件上行
     * @param AllowClipFileUp 是否开启剪贴板文件上行
     */
    public void setAllowClipFileUp(Boolean AllowClipFileUp) {
        this.AllowClipFileUp = AllowClipFileUp;
    }

    /**
     * Get 是否开启剪贴板文件下行 
     * @return AllowClipFileDown 是否开启剪贴板文件下行
     */
    public Boolean getAllowClipFileDown() {
        return this.AllowClipFileDown;
    }

    /**
     * Set 是否开启剪贴板文件下行
     * @param AllowClipFileDown 是否开启剪贴板文件下行
     */
    public void setAllowClipFileDown(Boolean AllowClipFileDown) {
        this.AllowClipFileDown = AllowClipFileDown;
    }

    /**
     * Get 是否开启剪贴板文本（目前含图片）上行 
     * @return AllowClipTextUp 是否开启剪贴板文本（目前含图片）上行
     */
    public Boolean getAllowClipTextUp() {
        return this.AllowClipTextUp;
    }

    /**
     * Set 是否开启剪贴板文本（目前含图片）上行
     * @param AllowClipTextUp 是否开启剪贴板文本（目前含图片）上行
     */
    public void setAllowClipTextUp(Boolean AllowClipTextUp) {
        this.AllowClipTextUp = AllowClipTextUp;
    }

    /**
     * Get 是否开启剪贴板文本（目前含图片）下行 
     * @return AllowClipTextDown 是否开启剪贴板文本（目前含图片）下行
     */
    public Boolean getAllowClipTextDown() {
        return this.AllowClipTextDown;
    }

    /**
     * Set 是否开启剪贴板文本（目前含图片）下行
     * @param AllowClipTextDown 是否开启剪贴板文本（目前含图片）下行
     */
    public void setAllowClipTextDown(Boolean AllowClipTextDown) {
        this.AllowClipTextDown = AllowClipTextDown;
    }

    /**
     * Get 是否开启文件传输上传 
     * @return AllowFileUp 是否开启文件传输上传
     */
    public Boolean getAllowFileUp() {
        return this.AllowFileUp;
    }

    /**
     * Set 是否开启文件传输上传
     * @param AllowFileUp 是否开启文件传输上传
     */
    public void setAllowFileUp(Boolean AllowFileUp) {
        this.AllowFileUp = AllowFileUp;
    }

    /**
     * Get 文件传输上传大小限制（预留参数，暂未启用） 
     * @return MaxFileUpSize 文件传输上传大小限制（预留参数，暂未启用）
     */
    public Long getMaxFileUpSize() {
        return this.MaxFileUpSize;
    }

    /**
     * Set 文件传输上传大小限制（预留参数，暂未启用）
     * @param MaxFileUpSize 文件传输上传大小限制（预留参数，暂未启用）
     */
    public void setMaxFileUpSize(Long MaxFileUpSize) {
        this.MaxFileUpSize = MaxFileUpSize;
    }

    /**
     * Get 是否开启文件传输下载 
     * @return AllowFileDown 是否开启文件传输下载
     */
    public Boolean getAllowFileDown() {
        return this.AllowFileDown;
    }

    /**
     * Set 是否开启文件传输下载
     * @param AllowFileDown 是否开启文件传输下载
     */
    public void setAllowFileDown(Boolean AllowFileDown) {
        this.AllowFileDown = AllowFileDown;
    }

    /**
     * Get 文件传输下载大小限制（预留参数，暂未启用） 
     * @return MaxFileDownSize 文件传输下载大小限制（预留参数，暂未启用）
     */
    public Long getMaxFileDownSize() {
        return this.MaxFileDownSize;
    }

    /**
     * Set 文件传输下载大小限制（预留参数，暂未启用）
     * @param MaxFileDownSize 文件传输下载大小限制（预留参数，暂未启用）
     */
    public void setMaxFileDownSize(Long MaxFileDownSize) {
        this.MaxFileDownSize = MaxFileDownSize;
    }

    /**
     * Get 是否允许任意账号登录 
     * @return AllowAnyAccount 是否允许任意账号登录
     */
    public Boolean getAllowAnyAccount() {
        return this.AllowAnyAccount;
    }

    /**
     * Set 是否允许任意账号登录
     * @param AllowAnyAccount 是否允许任意账号登录
     */
    public void setAllowAnyAccount(Boolean AllowAnyAccount) {
        this.AllowAnyAccount = AllowAnyAccount;
    }

    /**
     * Get 关联的用户列表 
     * @return UserSet 关联的用户列表
     */
    public User [] getUserSet() {
        return this.UserSet;
    }

    /**
     * Set 关联的用户列表
     * @param UserSet 关联的用户列表
     */
    public void setUserSet(User [] UserSet) {
        this.UserSet = UserSet;
    }

    /**
     * Get 关联的用户组列表 
     * @return UserGroupSet 关联的用户组列表
     */
    public Group [] getUserGroupSet() {
        return this.UserGroupSet;
    }

    /**
     * Set 关联的用户组列表
     * @param UserGroupSet 关联的用户组列表
     */
    public void setUserGroupSet(Group [] UserGroupSet) {
        this.UserGroupSet = UserGroupSet;
    }

    /**
     * Get 关联的资产列表 
     * @return DeviceSet 关联的资产列表
     */
    public Device [] getDeviceSet() {
        return this.DeviceSet;
    }

    /**
     * Set 关联的资产列表
     * @param DeviceSet 关联的资产列表
     */
    public void setDeviceSet(Device [] DeviceSet) {
        this.DeviceSet = DeviceSet;
    }

    /**
     * Get 关联的资产组列表 
     * @return DeviceGroupSet 关联的资产组列表
     */
    public Group [] getDeviceGroupSet() {
        return this.DeviceGroupSet;
    }

    /**
     * Set 关联的资产组列表
     * @param DeviceGroupSet 关联的资产组列表
     */
    public void setDeviceGroupSet(Group [] DeviceGroupSet) {
        this.DeviceGroupSet = DeviceGroupSet;
    }

    /**
     * Get 关联的账号列表 
     * @return AccountSet 关联的账号列表
     */
    public String [] getAccountSet() {
        return this.AccountSet;
    }

    /**
     * Set 关联的账号列表
     * @param AccountSet 关联的账号列表
     */
    public void setAccountSet(String [] AccountSet) {
        this.AccountSet = AccountSet;
    }

    /**
     * Get 关联的高危命令模板列表 
     * @return CmdTemplateSet 关联的高危命令模板列表
     */
    public CmdTemplate [] getCmdTemplateSet() {
        return this.CmdTemplateSet;
    }

    /**
     * Set 关联的高危命令模板列表
     * @param CmdTemplateSet 关联的高危命令模板列表
     */
    public void setCmdTemplateSet(CmdTemplate [] CmdTemplateSet) {
        this.CmdTemplateSet = CmdTemplateSet;
    }

    /**
     * Get 是否开启 RDP 磁盘映射文件上传 
     * @return AllowDiskFileUp 是否开启 RDP 磁盘映射文件上传
     */
    public Boolean getAllowDiskFileUp() {
        return this.AllowDiskFileUp;
    }

    /**
     * Set 是否开启 RDP 磁盘映射文件上传
     * @param AllowDiskFileUp 是否开启 RDP 磁盘映射文件上传
     */
    public void setAllowDiskFileUp(Boolean AllowDiskFileUp) {
        this.AllowDiskFileUp = AllowDiskFileUp;
    }

    /**
     * Get 是否开启 RDP 磁盘映射文件下载 
     * @return AllowDiskFileDown 是否开启 RDP 磁盘映射文件下载
     */
    public Boolean getAllowDiskFileDown() {
        return this.AllowDiskFileDown;
    }

    /**
     * Set 是否开启 RDP 磁盘映射文件下载
     * @param AllowDiskFileDown 是否开启 RDP 磁盘映射文件下载
     */
    public void setAllowDiskFileDown(Boolean AllowDiskFileDown) {
        this.AllowDiskFileDown = AllowDiskFileDown;
    }

    /**
     * Get 是否开启 rz sz 文件上传 
     * @return AllowShellFileUp 是否开启 rz sz 文件上传
     */
    public Boolean getAllowShellFileUp() {
        return this.AllowShellFileUp;
    }

    /**
     * Set 是否开启 rz sz 文件上传
     * @param AllowShellFileUp 是否开启 rz sz 文件上传
     */
    public void setAllowShellFileUp(Boolean AllowShellFileUp) {
        this.AllowShellFileUp = AllowShellFileUp;
    }

    /**
     * Get 是否开启 rz sz 文件下载 
     * @return AllowShellFileDown 是否开启 rz sz 文件下载
     */
    public Boolean getAllowShellFileDown() {
        return this.AllowShellFileDown;
    }

    /**
     * Set 是否开启 rz sz 文件下载
     * @param AllowShellFileDown 是否开启 rz sz 文件下载
     */
    public void setAllowShellFileDown(Boolean AllowShellFileDown) {
        this.AllowShellFileDown = AllowShellFileDown;
    }

    /**
     * Get 是否开启 SFTP 文件删除 
     * @return AllowFileDel 是否开启 SFTP 文件删除
     */
    public Boolean getAllowFileDel() {
        return this.AllowFileDel;
    }

    /**
     * Set 是否开启 SFTP 文件删除
     * @param AllowFileDel 是否开启 SFTP 文件删除
     */
    public void setAllowFileDel(Boolean AllowFileDel) {
        this.AllowFileDel = AllowFileDel;
    }

    /**
     * Get 访问权限生效时间，如:"2021-09-22T00:00:00+00:00"
生效、失效时间不填则访问权限长期有效 
     * @return ValidateFrom 访问权限生效时间，如:"2021-09-22T00:00:00+00:00"
生效、失效时间不填则访问权限长期有效
     */
    public String getValidateFrom() {
        return this.ValidateFrom;
    }

    /**
     * Set 访问权限生效时间，如:"2021-09-22T00:00:00+00:00"
生效、失效时间不填则访问权限长期有效
     * @param ValidateFrom 访问权限生效时间，如:"2021-09-22T00:00:00+00:00"
生效、失效时间不填则访问权限长期有效
     */
    public void setValidateFrom(String ValidateFrom) {
        this.ValidateFrom = ValidateFrom;
    }

    /**
     * Get 访问权限失效时间，如:"2021-09-23T00:00:00+00:00"
生效、失效时间不填则访问权限长期有效 
     * @return ValidateTo 访问权限失效时间，如:"2021-09-23T00:00:00+00:00"
生效、失效时间不填则访问权限长期有效
     */
    public String getValidateTo() {
        return this.ValidateTo;
    }

    /**
     * Set 访问权限失效时间，如:"2021-09-23T00:00:00+00:00"
生效、失效时间不填则访问权限长期有效
     * @param ValidateTo 访问权限失效时间，如:"2021-09-23T00:00:00+00:00"
生效、失效时间不填则访问权限长期有效
     */
    public void setValidateTo(String ValidateTo) {
        this.ValidateTo = ValidateTo;
    }

    /**
     * Get 访问权限状态，1 - 已生效，2 - 未生效，3 - 已过期 
     * @return Status 访问权限状态，1 - 已生效，2 - 未生效，3 - 已过期
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 访问权限状态，1 - 已生效，2 - 未生效，3 - 已过期
     * @param Status 访问权限状态，1 - 已生效，2 - 未生效，3 - 已过期
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public Acl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Acl(Acl source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AllowDiskRedirect != null) {
            this.AllowDiskRedirect = new Boolean(source.AllowDiskRedirect);
        }
        if (source.AllowClipFileUp != null) {
            this.AllowClipFileUp = new Boolean(source.AllowClipFileUp);
        }
        if (source.AllowClipFileDown != null) {
            this.AllowClipFileDown = new Boolean(source.AllowClipFileDown);
        }
        if (source.AllowClipTextUp != null) {
            this.AllowClipTextUp = new Boolean(source.AllowClipTextUp);
        }
        if (source.AllowClipTextDown != null) {
            this.AllowClipTextDown = new Boolean(source.AllowClipTextDown);
        }
        if (source.AllowFileUp != null) {
            this.AllowFileUp = new Boolean(source.AllowFileUp);
        }
        if (source.MaxFileUpSize != null) {
            this.MaxFileUpSize = new Long(source.MaxFileUpSize);
        }
        if (source.AllowFileDown != null) {
            this.AllowFileDown = new Boolean(source.AllowFileDown);
        }
        if (source.MaxFileDownSize != null) {
            this.MaxFileDownSize = new Long(source.MaxFileDownSize);
        }
        if (source.AllowAnyAccount != null) {
            this.AllowAnyAccount = new Boolean(source.AllowAnyAccount);
        }
        if (source.UserSet != null) {
            this.UserSet = new User[source.UserSet.length];
            for (int i = 0; i < source.UserSet.length; i++) {
                this.UserSet[i] = new User(source.UserSet[i]);
            }
        }
        if (source.UserGroupSet != null) {
            this.UserGroupSet = new Group[source.UserGroupSet.length];
            for (int i = 0; i < source.UserGroupSet.length; i++) {
                this.UserGroupSet[i] = new Group(source.UserGroupSet[i]);
            }
        }
        if (source.DeviceSet != null) {
            this.DeviceSet = new Device[source.DeviceSet.length];
            for (int i = 0; i < source.DeviceSet.length; i++) {
                this.DeviceSet[i] = new Device(source.DeviceSet[i]);
            }
        }
        if (source.DeviceGroupSet != null) {
            this.DeviceGroupSet = new Group[source.DeviceGroupSet.length];
            for (int i = 0; i < source.DeviceGroupSet.length; i++) {
                this.DeviceGroupSet[i] = new Group(source.DeviceGroupSet[i]);
            }
        }
        if (source.AccountSet != null) {
            this.AccountSet = new String[source.AccountSet.length];
            for (int i = 0; i < source.AccountSet.length; i++) {
                this.AccountSet[i] = new String(source.AccountSet[i]);
            }
        }
        if (source.CmdTemplateSet != null) {
            this.CmdTemplateSet = new CmdTemplate[source.CmdTemplateSet.length];
            for (int i = 0; i < source.CmdTemplateSet.length; i++) {
                this.CmdTemplateSet[i] = new CmdTemplate(source.CmdTemplateSet[i]);
            }
        }
        if (source.AllowDiskFileUp != null) {
            this.AllowDiskFileUp = new Boolean(source.AllowDiskFileUp);
        }
        if (source.AllowDiskFileDown != null) {
            this.AllowDiskFileDown = new Boolean(source.AllowDiskFileDown);
        }
        if (source.AllowShellFileUp != null) {
            this.AllowShellFileUp = new Boolean(source.AllowShellFileUp);
        }
        if (source.AllowShellFileDown != null) {
            this.AllowShellFileDown = new Boolean(source.AllowShellFileDown);
        }
        if (source.AllowFileDel != null) {
            this.AllowFileDel = new Boolean(source.AllowFileDel);
        }
        if (source.ValidateFrom != null) {
            this.ValidateFrom = new String(source.ValidateFrom);
        }
        if (source.ValidateTo != null) {
            this.ValidateTo = new String(source.ValidateTo);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AllowDiskRedirect", this.AllowDiskRedirect);
        this.setParamSimple(map, prefix + "AllowClipFileUp", this.AllowClipFileUp);
        this.setParamSimple(map, prefix + "AllowClipFileDown", this.AllowClipFileDown);
        this.setParamSimple(map, prefix + "AllowClipTextUp", this.AllowClipTextUp);
        this.setParamSimple(map, prefix + "AllowClipTextDown", this.AllowClipTextDown);
        this.setParamSimple(map, prefix + "AllowFileUp", this.AllowFileUp);
        this.setParamSimple(map, prefix + "MaxFileUpSize", this.MaxFileUpSize);
        this.setParamSimple(map, prefix + "AllowFileDown", this.AllowFileDown);
        this.setParamSimple(map, prefix + "MaxFileDownSize", this.MaxFileDownSize);
        this.setParamSimple(map, prefix + "AllowAnyAccount", this.AllowAnyAccount);
        this.setParamArrayObj(map, prefix + "UserSet.", this.UserSet);
        this.setParamArrayObj(map, prefix + "UserGroupSet.", this.UserGroupSet);
        this.setParamArrayObj(map, prefix + "DeviceSet.", this.DeviceSet);
        this.setParamArrayObj(map, prefix + "DeviceGroupSet.", this.DeviceGroupSet);
        this.setParamArraySimple(map, prefix + "AccountSet.", this.AccountSet);
        this.setParamArrayObj(map, prefix + "CmdTemplateSet.", this.CmdTemplateSet);
        this.setParamSimple(map, prefix + "AllowDiskFileUp", this.AllowDiskFileUp);
        this.setParamSimple(map, prefix + "AllowDiskFileDown", this.AllowDiskFileDown);
        this.setParamSimple(map, prefix + "AllowShellFileUp", this.AllowShellFileUp);
        this.setParamSimple(map, prefix + "AllowShellFileDown", this.AllowShellFileDown);
        this.setParamSimple(map, prefix + "AllowFileDel", this.AllowFileDel);
        this.setParamSimple(map, prefix + "ValidateFrom", this.ValidateFrom);
        this.setParamSimple(map, prefix + "ValidateTo", this.ValidateTo);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

