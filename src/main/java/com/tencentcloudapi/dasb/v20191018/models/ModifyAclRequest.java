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

public class ModifyAclRequest extends AbstractModel{

    /**
    * 访问权限名称，最大32字符，不能包含空白字符
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
    * 是否允许任意账号登录
    */
    @SerializedName("AllowAnyAccount")
    @Expose
    private Boolean AllowAnyAccount;

    /**
    * 访问权限ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

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
    * 是否开启剪贴板文本（含图片）上行
    */
    @SerializedName("AllowClipTextUp")
    @Expose
    private Boolean AllowClipTextUp;

    /**
    * 是否开启剪贴板文本（含图片）下行
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
    * 文件传输上传大小限制（预留参数，目前暂未使用）
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
    * 文件传输下载大小限制（预留参数，目前暂未使用）
    */
    @SerializedName("MaxFileDownSize")
    @Expose
    private Long MaxFileDownSize;

    /**
    * 关联的用户ID
    */
    @SerializedName("UserIdSet")
    @Expose
    private Long [] UserIdSet;

    /**
    * 关联的用户组ID
    */
    @SerializedName("UserGroupIdSet")
    @Expose
    private Long [] UserGroupIdSet;

    /**
    * 关联的资产ID
    */
    @SerializedName("DeviceIdSet")
    @Expose
    private Long [] DeviceIdSet;

    /**
    * 关联的资产组ID
    */
    @SerializedName("DeviceGroupIdSet")
    @Expose
    private Long [] DeviceGroupIdSet;

    /**
    * 关联的账号
    */
    @SerializedName("AccountSet")
    @Expose
    private String [] AccountSet;

    /**
    * 关联的高危命令模板ID
    */
    @SerializedName("CmdTemplateIdSet")
    @Expose
    private Long [] CmdTemplateIdSet;

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
    * 是否开启rz sz文件上传
    */
    @SerializedName("AllowShellFileUp")
    @Expose
    private Boolean AllowShellFileUp;

    /**
    * 是否开启rz sz文件下载
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
     * Get 访问权限名称，最大32字符，不能包含空白字符 
     * @return Name 访问权限名称，最大32字符，不能包含空白字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 访问权限名称，最大32字符，不能包含空白字符
     * @param Name 访问权限名称，最大32字符，不能包含空白字符
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
     * Get 是否开启剪贴板文本（含图片）上行 
     * @return AllowClipTextUp 是否开启剪贴板文本（含图片）上行
     */
    public Boolean getAllowClipTextUp() {
        return this.AllowClipTextUp;
    }

    /**
     * Set 是否开启剪贴板文本（含图片）上行
     * @param AllowClipTextUp 是否开启剪贴板文本（含图片）上行
     */
    public void setAllowClipTextUp(Boolean AllowClipTextUp) {
        this.AllowClipTextUp = AllowClipTextUp;
    }

    /**
     * Get 是否开启剪贴板文本（含图片）下行 
     * @return AllowClipTextDown 是否开启剪贴板文本（含图片）下行
     */
    public Boolean getAllowClipTextDown() {
        return this.AllowClipTextDown;
    }

    /**
     * Set 是否开启剪贴板文本（含图片）下行
     * @param AllowClipTextDown 是否开启剪贴板文本（含图片）下行
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
     * Get 文件传输上传大小限制（预留参数，目前暂未使用） 
     * @return MaxFileUpSize 文件传输上传大小限制（预留参数，目前暂未使用）
     */
    public Long getMaxFileUpSize() {
        return this.MaxFileUpSize;
    }

    /**
     * Set 文件传输上传大小限制（预留参数，目前暂未使用）
     * @param MaxFileUpSize 文件传输上传大小限制（预留参数，目前暂未使用）
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
     * Get 文件传输下载大小限制（预留参数，目前暂未使用） 
     * @return MaxFileDownSize 文件传输下载大小限制（预留参数，目前暂未使用）
     */
    public Long getMaxFileDownSize() {
        return this.MaxFileDownSize;
    }

    /**
     * Set 文件传输下载大小限制（预留参数，目前暂未使用）
     * @param MaxFileDownSize 文件传输下载大小限制（预留参数，目前暂未使用）
     */
    public void setMaxFileDownSize(Long MaxFileDownSize) {
        this.MaxFileDownSize = MaxFileDownSize;
    }

    /**
     * Get 关联的用户ID 
     * @return UserIdSet 关联的用户ID
     */
    public Long [] getUserIdSet() {
        return this.UserIdSet;
    }

    /**
     * Set 关联的用户ID
     * @param UserIdSet 关联的用户ID
     */
    public void setUserIdSet(Long [] UserIdSet) {
        this.UserIdSet = UserIdSet;
    }

    /**
     * Get 关联的用户组ID 
     * @return UserGroupIdSet 关联的用户组ID
     */
    public Long [] getUserGroupIdSet() {
        return this.UserGroupIdSet;
    }

    /**
     * Set 关联的用户组ID
     * @param UserGroupIdSet 关联的用户组ID
     */
    public void setUserGroupIdSet(Long [] UserGroupIdSet) {
        this.UserGroupIdSet = UserGroupIdSet;
    }

    /**
     * Get 关联的资产ID 
     * @return DeviceIdSet 关联的资产ID
     */
    public Long [] getDeviceIdSet() {
        return this.DeviceIdSet;
    }

    /**
     * Set 关联的资产ID
     * @param DeviceIdSet 关联的资产ID
     */
    public void setDeviceIdSet(Long [] DeviceIdSet) {
        this.DeviceIdSet = DeviceIdSet;
    }

    /**
     * Get 关联的资产组ID 
     * @return DeviceGroupIdSet 关联的资产组ID
     */
    public Long [] getDeviceGroupIdSet() {
        return this.DeviceGroupIdSet;
    }

    /**
     * Set 关联的资产组ID
     * @param DeviceGroupIdSet 关联的资产组ID
     */
    public void setDeviceGroupIdSet(Long [] DeviceGroupIdSet) {
        this.DeviceGroupIdSet = DeviceGroupIdSet;
    }

    /**
     * Get 关联的账号 
     * @return AccountSet 关联的账号
     */
    public String [] getAccountSet() {
        return this.AccountSet;
    }

    /**
     * Set 关联的账号
     * @param AccountSet 关联的账号
     */
    public void setAccountSet(String [] AccountSet) {
        this.AccountSet = AccountSet;
    }

    /**
     * Get 关联的高危命令模板ID 
     * @return CmdTemplateIdSet 关联的高危命令模板ID
     */
    public Long [] getCmdTemplateIdSet() {
        return this.CmdTemplateIdSet;
    }

    /**
     * Set 关联的高危命令模板ID
     * @param CmdTemplateIdSet 关联的高危命令模板ID
     */
    public void setCmdTemplateIdSet(Long [] CmdTemplateIdSet) {
        this.CmdTemplateIdSet = CmdTemplateIdSet;
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
     * Get 是否开启rz sz文件上传 
     * @return AllowShellFileUp 是否开启rz sz文件上传
     */
    public Boolean getAllowShellFileUp() {
        return this.AllowShellFileUp;
    }

    /**
     * Set 是否开启rz sz文件上传
     * @param AllowShellFileUp 是否开启rz sz文件上传
     */
    public void setAllowShellFileUp(Boolean AllowShellFileUp) {
        this.AllowShellFileUp = AllowShellFileUp;
    }

    /**
     * Get 是否开启rz sz文件下载 
     * @return AllowShellFileDown 是否开启rz sz文件下载
     */
    public Boolean getAllowShellFileDown() {
        return this.AllowShellFileDown;
    }

    /**
     * Set 是否开启rz sz文件下载
     * @param AllowShellFileDown 是否开启rz sz文件下载
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

    public ModifyAclRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAclRequest(ModifyAclRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AllowDiskRedirect != null) {
            this.AllowDiskRedirect = new Boolean(source.AllowDiskRedirect);
        }
        if (source.AllowAnyAccount != null) {
            this.AllowAnyAccount = new Boolean(source.AllowAnyAccount);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
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
        if (source.UserIdSet != null) {
            this.UserIdSet = new Long[source.UserIdSet.length];
            for (int i = 0; i < source.UserIdSet.length; i++) {
                this.UserIdSet[i] = new Long(source.UserIdSet[i]);
            }
        }
        if (source.UserGroupIdSet != null) {
            this.UserGroupIdSet = new Long[source.UserGroupIdSet.length];
            for (int i = 0; i < source.UserGroupIdSet.length; i++) {
                this.UserGroupIdSet[i] = new Long(source.UserGroupIdSet[i]);
            }
        }
        if (source.DeviceIdSet != null) {
            this.DeviceIdSet = new Long[source.DeviceIdSet.length];
            for (int i = 0; i < source.DeviceIdSet.length; i++) {
                this.DeviceIdSet[i] = new Long(source.DeviceIdSet[i]);
            }
        }
        if (source.DeviceGroupIdSet != null) {
            this.DeviceGroupIdSet = new Long[source.DeviceGroupIdSet.length];
            for (int i = 0; i < source.DeviceGroupIdSet.length; i++) {
                this.DeviceGroupIdSet[i] = new Long(source.DeviceGroupIdSet[i]);
            }
        }
        if (source.AccountSet != null) {
            this.AccountSet = new String[source.AccountSet.length];
            for (int i = 0; i < source.AccountSet.length; i++) {
                this.AccountSet[i] = new String(source.AccountSet[i]);
            }
        }
        if (source.CmdTemplateIdSet != null) {
            this.CmdTemplateIdSet = new Long[source.CmdTemplateIdSet.length];
            for (int i = 0; i < source.CmdTemplateIdSet.length; i++) {
                this.CmdTemplateIdSet[i] = new Long(source.CmdTemplateIdSet[i]);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AllowDiskRedirect", this.AllowDiskRedirect);
        this.setParamSimple(map, prefix + "AllowAnyAccount", this.AllowAnyAccount);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AllowClipFileUp", this.AllowClipFileUp);
        this.setParamSimple(map, prefix + "AllowClipFileDown", this.AllowClipFileDown);
        this.setParamSimple(map, prefix + "AllowClipTextUp", this.AllowClipTextUp);
        this.setParamSimple(map, prefix + "AllowClipTextDown", this.AllowClipTextDown);
        this.setParamSimple(map, prefix + "AllowFileUp", this.AllowFileUp);
        this.setParamSimple(map, prefix + "MaxFileUpSize", this.MaxFileUpSize);
        this.setParamSimple(map, prefix + "AllowFileDown", this.AllowFileDown);
        this.setParamSimple(map, prefix + "MaxFileDownSize", this.MaxFileDownSize);
        this.setParamArraySimple(map, prefix + "UserIdSet.", this.UserIdSet);
        this.setParamArraySimple(map, prefix + "UserGroupIdSet.", this.UserGroupIdSet);
        this.setParamArraySimple(map, prefix + "DeviceIdSet.", this.DeviceIdSet);
        this.setParamArraySimple(map, prefix + "DeviceGroupIdSet.", this.DeviceGroupIdSet);
        this.setParamArraySimple(map, prefix + "AccountSet.", this.AccountSet);
        this.setParamArraySimple(map, prefix + "CmdTemplateIdSet.", this.CmdTemplateIdSet);
        this.setParamSimple(map, prefix + "AllowDiskFileUp", this.AllowDiskFileUp);
        this.setParamSimple(map, prefix + "AllowDiskFileDown", this.AllowDiskFileDown);
        this.setParamSimple(map, prefix + "AllowShellFileUp", this.AllowShellFileUp);
        this.setParamSimple(map, prefix + "AllowShellFileDown", this.AllowShellFileDown);
        this.setParamSimple(map, prefix + "AllowFileDel", this.AllowFileDel);
        this.setParamSimple(map, prefix + "ValidateFrom", this.ValidateFrom);
        this.setParamSimple(map, prefix + "ValidateTo", this.ValidateTo);

    }
}

