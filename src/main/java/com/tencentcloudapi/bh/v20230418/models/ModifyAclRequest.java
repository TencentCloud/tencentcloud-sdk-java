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

public class ModifyAclRequest extends AbstractModel {

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
    * 是否开启剪贴板文件上行，不传时默认为false
    */
    @SerializedName("AllowClipFileUp")
    @Expose
    private Boolean AllowClipFileUp;

    /**
    * 是否开启剪贴板文件下行，不传时默认为false
    */
    @SerializedName("AllowClipFileDown")
    @Expose
    private Boolean AllowClipFileDown;

    /**
    * 是否开启剪贴板文本（含图片）上行，不传时默认为false
    */
    @SerializedName("AllowClipTextUp")
    @Expose
    private Boolean AllowClipTextUp;

    /**
    * 是否开启剪贴板文本（含图片）下行，不传时默认为false
    */
    @SerializedName("AllowClipTextDown")
    @Expose
    private Boolean AllowClipTextDown;

    /**
    * 是否开启文件传输上传，不传时默认为false
    */
    @SerializedName("AllowFileUp")
    @Expose
    private Boolean AllowFileUp;

    /**
    * 文件传输上传大小限制（预留参数，目前暂未使用），不传时默认为0
    */
    @SerializedName("MaxFileUpSize")
    @Expose
    private Long MaxFileUpSize;

    /**
    * 是否开启文件传输下载，不传时默认为false
    */
    @SerializedName("AllowFileDown")
    @Expose
    private Boolean AllowFileDown;

    /**
    * 文件传输下载大小限制（预留参数，目前暂未使用），不传时默认为0
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
    * 关联的应用资产ID集合，不传时表示不选择任何应用资产
    */
    @SerializedName("AppAssetIdSet")
    @Expose
    private Long [] AppAssetIdSet;

    /**
    * 关联的资产组ID，不传时表示不选择任何资产组
    */
    @SerializedName("DeviceGroupIdSet")
    @Expose
    private Long [] DeviceGroupIdSet;

    /**
    * 关联的资产账号，不传时表示不选择任何资产账号
    */
    @SerializedName("AccountSet")
    @Expose
    private String [] AccountSet;

    /**
    * 关联的高危命令模板ID，不传时表示不选择任何模板
    */
    @SerializedName("CmdTemplateIdSet")
    @Expose
    private Long [] CmdTemplateIdSet;

    /**
    * 关联高危DB模板ID，不传时表示不选择任何模板
    */
    @SerializedName("ACTemplateIdSet")
    @Expose
    private String [] ACTemplateIdSet;

    /**
    * 是否开启 RDP 磁盘映射文件上传，不传时默认为false
    */
    @SerializedName("AllowDiskFileUp")
    @Expose
    private Boolean AllowDiskFileUp;

    /**
    * 是否开启 RDP 磁盘映射文件下载，不传时默认为false
    */
    @SerializedName("AllowDiskFileDown")
    @Expose
    private Boolean AllowDiskFileDown;

    /**
    * 是否开启rz sz文件上传，不传时默认为false
    */
    @SerializedName("AllowShellFileUp")
    @Expose
    private Boolean AllowShellFileUp;

    /**
    * 是否开启rz sz文件下载，不传时默认为false
    */
    @SerializedName("AllowShellFileDown")
    @Expose
    private Boolean AllowShellFileDown;

    /**
    * 是否开启 SFTP 文件删除，不传时默认为false
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
    * 权限所属部门的ID，如：1.2.3
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
    * 是否允许使用访问串，不传时默认为true
    */
    @SerializedName("AllowAccessCredential")
    @Expose
    private Boolean AllowAccessCredential;

    /**
    * 是否允许键盘记录，不传时默认为false
    */
    @SerializedName("AllowKeyboardLogger")
    @Expose
    private Boolean AllowKeyboardLogger;

    /**
    * 访问串有效期最大时长，秒数，允许使用访问串时需大于0且必须为86400整数倍，不传时默认为9999天对应的秒数
    */
    @SerializedName("MaxAccessCredentialDuration")
    @Expose
    private Long MaxAccessCredentialDuration;

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
     * Get 是否开启剪贴板文件上行，不传时默认为false 
     * @return AllowClipFileUp 是否开启剪贴板文件上行，不传时默认为false
     */
    public Boolean getAllowClipFileUp() {
        return this.AllowClipFileUp;
    }

    /**
     * Set 是否开启剪贴板文件上行，不传时默认为false
     * @param AllowClipFileUp 是否开启剪贴板文件上行，不传时默认为false
     */
    public void setAllowClipFileUp(Boolean AllowClipFileUp) {
        this.AllowClipFileUp = AllowClipFileUp;
    }

    /**
     * Get 是否开启剪贴板文件下行，不传时默认为false 
     * @return AllowClipFileDown 是否开启剪贴板文件下行，不传时默认为false
     */
    public Boolean getAllowClipFileDown() {
        return this.AllowClipFileDown;
    }

    /**
     * Set 是否开启剪贴板文件下行，不传时默认为false
     * @param AllowClipFileDown 是否开启剪贴板文件下行，不传时默认为false
     */
    public void setAllowClipFileDown(Boolean AllowClipFileDown) {
        this.AllowClipFileDown = AllowClipFileDown;
    }

    /**
     * Get 是否开启剪贴板文本（含图片）上行，不传时默认为false 
     * @return AllowClipTextUp 是否开启剪贴板文本（含图片）上行，不传时默认为false
     */
    public Boolean getAllowClipTextUp() {
        return this.AllowClipTextUp;
    }

    /**
     * Set 是否开启剪贴板文本（含图片）上行，不传时默认为false
     * @param AllowClipTextUp 是否开启剪贴板文本（含图片）上行，不传时默认为false
     */
    public void setAllowClipTextUp(Boolean AllowClipTextUp) {
        this.AllowClipTextUp = AllowClipTextUp;
    }

    /**
     * Get 是否开启剪贴板文本（含图片）下行，不传时默认为false 
     * @return AllowClipTextDown 是否开启剪贴板文本（含图片）下行，不传时默认为false
     */
    public Boolean getAllowClipTextDown() {
        return this.AllowClipTextDown;
    }

    /**
     * Set 是否开启剪贴板文本（含图片）下行，不传时默认为false
     * @param AllowClipTextDown 是否开启剪贴板文本（含图片）下行，不传时默认为false
     */
    public void setAllowClipTextDown(Boolean AllowClipTextDown) {
        this.AllowClipTextDown = AllowClipTextDown;
    }

    /**
     * Get 是否开启文件传输上传，不传时默认为false 
     * @return AllowFileUp 是否开启文件传输上传，不传时默认为false
     */
    public Boolean getAllowFileUp() {
        return this.AllowFileUp;
    }

    /**
     * Set 是否开启文件传输上传，不传时默认为false
     * @param AllowFileUp 是否开启文件传输上传，不传时默认为false
     */
    public void setAllowFileUp(Boolean AllowFileUp) {
        this.AllowFileUp = AllowFileUp;
    }

    /**
     * Get 文件传输上传大小限制（预留参数，目前暂未使用），不传时默认为0 
     * @return MaxFileUpSize 文件传输上传大小限制（预留参数，目前暂未使用），不传时默认为0
     */
    public Long getMaxFileUpSize() {
        return this.MaxFileUpSize;
    }

    /**
     * Set 文件传输上传大小限制（预留参数，目前暂未使用），不传时默认为0
     * @param MaxFileUpSize 文件传输上传大小限制（预留参数，目前暂未使用），不传时默认为0
     */
    public void setMaxFileUpSize(Long MaxFileUpSize) {
        this.MaxFileUpSize = MaxFileUpSize;
    }

    /**
     * Get 是否开启文件传输下载，不传时默认为false 
     * @return AllowFileDown 是否开启文件传输下载，不传时默认为false
     */
    public Boolean getAllowFileDown() {
        return this.AllowFileDown;
    }

    /**
     * Set 是否开启文件传输下载，不传时默认为false
     * @param AllowFileDown 是否开启文件传输下载，不传时默认为false
     */
    public void setAllowFileDown(Boolean AllowFileDown) {
        this.AllowFileDown = AllowFileDown;
    }

    /**
     * Get 文件传输下载大小限制（预留参数，目前暂未使用），不传时默认为0 
     * @return MaxFileDownSize 文件传输下载大小限制（预留参数，目前暂未使用），不传时默认为0
     */
    public Long getMaxFileDownSize() {
        return this.MaxFileDownSize;
    }

    /**
     * Set 文件传输下载大小限制（预留参数，目前暂未使用），不传时默认为0
     * @param MaxFileDownSize 文件传输下载大小限制（预留参数，目前暂未使用），不传时默认为0
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
     * Get 关联的应用资产ID集合，不传时表示不选择任何应用资产 
     * @return AppAssetIdSet 关联的应用资产ID集合，不传时表示不选择任何应用资产
     */
    public Long [] getAppAssetIdSet() {
        return this.AppAssetIdSet;
    }

    /**
     * Set 关联的应用资产ID集合，不传时表示不选择任何应用资产
     * @param AppAssetIdSet 关联的应用资产ID集合，不传时表示不选择任何应用资产
     */
    public void setAppAssetIdSet(Long [] AppAssetIdSet) {
        this.AppAssetIdSet = AppAssetIdSet;
    }

    /**
     * Get 关联的资产组ID，不传时表示不选择任何资产组 
     * @return DeviceGroupIdSet 关联的资产组ID，不传时表示不选择任何资产组
     */
    public Long [] getDeviceGroupIdSet() {
        return this.DeviceGroupIdSet;
    }

    /**
     * Set 关联的资产组ID，不传时表示不选择任何资产组
     * @param DeviceGroupIdSet 关联的资产组ID，不传时表示不选择任何资产组
     */
    public void setDeviceGroupIdSet(Long [] DeviceGroupIdSet) {
        this.DeviceGroupIdSet = DeviceGroupIdSet;
    }

    /**
     * Get 关联的资产账号，不传时表示不选择任何资产账号 
     * @return AccountSet 关联的资产账号，不传时表示不选择任何资产账号
     */
    public String [] getAccountSet() {
        return this.AccountSet;
    }

    /**
     * Set 关联的资产账号，不传时表示不选择任何资产账号
     * @param AccountSet 关联的资产账号，不传时表示不选择任何资产账号
     */
    public void setAccountSet(String [] AccountSet) {
        this.AccountSet = AccountSet;
    }

    /**
     * Get 关联的高危命令模板ID，不传时表示不选择任何模板 
     * @return CmdTemplateIdSet 关联的高危命令模板ID，不传时表示不选择任何模板
     */
    public Long [] getCmdTemplateIdSet() {
        return this.CmdTemplateIdSet;
    }

    /**
     * Set 关联的高危命令模板ID，不传时表示不选择任何模板
     * @param CmdTemplateIdSet 关联的高危命令模板ID，不传时表示不选择任何模板
     */
    public void setCmdTemplateIdSet(Long [] CmdTemplateIdSet) {
        this.CmdTemplateIdSet = CmdTemplateIdSet;
    }

    /**
     * Get 关联高危DB模板ID，不传时表示不选择任何模板 
     * @return ACTemplateIdSet 关联高危DB模板ID，不传时表示不选择任何模板
     */
    public String [] getACTemplateIdSet() {
        return this.ACTemplateIdSet;
    }

    /**
     * Set 关联高危DB模板ID，不传时表示不选择任何模板
     * @param ACTemplateIdSet 关联高危DB模板ID，不传时表示不选择任何模板
     */
    public void setACTemplateIdSet(String [] ACTemplateIdSet) {
        this.ACTemplateIdSet = ACTemplateIdSet;
    }

    /**
     * Get 是否开启 RDP 磁盘映射文件上传，不传时默认为false 
     * @return AllowDiskFileUp 是否开启 RDP 磁盘映射文件上传，不传时默认为false
     */
    public Boolean getAllowDiskFileUp() {
        return this.AllowDiskFileUp;
    }

    /**
     * Set 是否开启 RDP 磁盘映射文件上传，不传时默认为false
     * @param AllowDiskFileUp 是否开启 RDP 磁盘映射文件上传，不传时默认为false
     */
    public void setAllowDiskFileUp(Boolean AllowDiskFileUp) {
        this.AllowDiskFileUp = AllowDiskFileUp;
    }

    /**
     * Get 是否开启 RDP 磁盘映射文件下载，不传时默认为false 
     * @return AllowDiskFileDown 是否开启 RDP 磁盘映射文件下载，不传时默认为false
     */
    public Boolean getAllowDiskFileDown() {
        return this.AllowDiskFileDown;
    }

    /**
     * Set 是否开启 RDP 磁盘映射文件下载，不传时默认为false
     * @param AllowDiskFileDown 是否开启 RDP 磁盘映射文件下载，不传时默认为false
     */
    public void setAllowDiskFileDown(Boolean AllowDiskFileDown) {
        this.AllowDiskFileDown = AllowDiskFileDown;
    }

    /**
     * Get 是否开启rz sz文件上传，不传时默认为false 
     * @return AllowShellFileUp 是否开启rz sz文件上传，不传时默认为false
     */
    public Boolean getAllowShellFileUp() {
        return this.AllowShellFileUp;
    }

    /**
     * Set 是否开启rz sz文件上传，不传时默认为false
     * @param AllowShellFileUp 是否开启rz sz文件上传，不传时默认为false
     */
    public void setAllowShellFileUp(Boolean AllowShellFileUp) {
        this.AllowShellFileUp = AllowShellFileUp;
    }

    /**
     * Get 是否开启rz sz文件下载，不传时默认为false 
     * @return AllowShellFileDown 是否开启rz sz文件下载，不传时默认为false
     */
    public Boolean getAllowShellFileDown() {
        return this.AllowShellFileDown;
    }

    /**
     * Set 是否开启rz sz文件下载，不传时默认为false
     * @param AllowShellFileDown 是否开启rz sz文件下载，不传时默认为false
     */
    public void setAllowShellFileDown(Boolean AllowShellFileDown) {
        this.AllowShellFileDown = AllowShellFileDown;
    }

    /**
     * Get 是否开启 SFTP 文件删除，不传时默认为false 
     * @return AllowFileDel 是否开启 SFTP 文件删除，不传时默认为false
     */
    public Boolean getAllowFileDel() {
        return this.AllowFileDel;
    }

    /**
     * Set 是否开启 SFTP 文件删除，不传时默认为false
     * @param AllowFileDel 是否开启 SFTP 文件删除，不传时默认为false
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
     * Get 权限所属部门的ID，如：1.2.3 
     * @return DepartmentId 权限所属部门的ID，如：1.2.3
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set 权限所属部门的ID，如：1.2.3
     * @param DepartmentId 权限所属部门的ID，如：1.2.3
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    /**
     * Get 是否允许使用访问串，不传时默认为true 
     * @return AllowAccessCredential 是否允许使用访问串，不传时默认为true
     */
    public Boolean getAllowAccessCredential() {
        return this.AllowAccessCredential;
    }

    /**
     * Set 是否允许使用访问串，不传时默认为true
     * @param AllowAccessCredential 是否允许使用访问串，不传时默认为true
     */
    public void setAllowAccessCredential(Boolean AllowAccessCredential) {
        this.AllowAccessCredential = AllowAccessCredential;
    }

    /**
     * Get 是否允许键盘记录，不传时默认为false 
     * @return AllowKeyboardLogger 是否允许键盘记录，不传时默认为false
     */
    public Boolean getAllowKeyboardLogger() {
        return this.AllowKeyboardLogger;
    }

    /**
     * Set 是否允许键盘记录，不传时默认为false
     * @param AllowKeyboardLogger 是否允许键盘记录，不传时默认为false
     */
    public void setAllowKeyboardLogger(Boolean AllowKeyboardLogger) {
        this.AllowKeyboardLogger = AllowKeyboardLogger;
    }

    /**
     * Get 访问串有效期最大时长，秒数，允许使用访问串时需大于0且必须为86400整数倍，不传时默认为9999天对应的秒数 
     * @return MaxAccessCredentialDuration 访问串有效期最大时长，秒数，允许使用访问串时需大于0且必须为86400整数倍，不传时默认为9999天对应的秒数
     */
    public Long getMaxAccessCredentialDuration() {
        return this.MaxAccessCredentialDuration;
    }

    /**
     * Set 访问串有效期最大时长，秒数，允许使用访问串时需大于0且必须为86400整数倍，不传时默认为9999天对应的秒数
     * @param MaxAccessCredentialDuration 访问串有效期最大时长，秒数，允许使用访问串时需大于0且必须为86400整数倍，不传时默认为9999天对应的秒数
     */
    public void setMaxAccessCredentialDuration(Long MaxAccessCredentialDuration) {
        this.MaxAccessCredentialDuration = MaxAccessCredentialDuration;
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
        if (source.AppAssetIdSet != null) {
            this.AppAssetIdSet = new Long[source.AppAssetIdSet.length];
            for (int i = 0; i < source.AppAssetIdSet.length; i++) {
                this.AppAssetIdSet[i] = new Long(source.AppAssetIdSet[i]);
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
        if (source.ACTemplateIdSet != null) {
            this.ACTemplateIdSet = new String[source.ACTemplateIdSet.length];
            for (int i = 0; i < source.ACTemplateIdSet.length; i++) {
                this.ACTemplateIdSet[i] = new String(source.ACTemplateIdSet[i]);
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
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
        if (source.AllowAccessCredential != null) {
            this.AllowAccessCredential = new Boolean(source.AllowAccessCredential);
        }
        if (source.AllowKeyboardLogger != null) {
            this.AllowKeyboardLogger = new Boolean(source.AllowKeyboardLogger);
        }
        if (source.MaxAccessCredentialDuration != null) {
            this.MaxAccessCredentialDuration = new Long(source.MaxAccessCredentialDuration);
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
        this.setParamArraySimple(map, prefix + "AppAssetIdSet.", this.AppAssetIdSet);
        this.setParamArraySimple(map, prefix + "DeviceGroupIdSet.", this.DeviceGroupIdSet);
        this.setParamArraySimple(map, prefix + "AccountSet.", this.AccountSet);
        this.setParamArraySimple(map, prefix + "CmdTemplateIdSet.", this.CmdTemplateIdSet);
        this.setParamArraySimple(map, prefix + "ACTemplateIdSet.", this.ACTemplateIdSet);
        this.setParamSimple(map, prefix + "AllowDiskFileUp", this.AllowDiskFileUp);
        this.setParamSimple(map, prefix + "AllowDiskFileDown", this.AllowDiskFileDown);
        this.setParamSimple(map, prefix + "AllowShellFileUp", this.AllowShellFileUp);
        this.setParamSimple(map, prefix + "AllowShellFileDown", this.AllowShellFileDown);
        this.setParamSimple(map, prefix + "AllowFileDel", this.AllowFileDel);
        this.setParamSimple(map, prefix + "ValidateFrom", this.ValidateFrom);
        this.setParamSimple(map, prefix + "ValidateTo", this.ValidateTo);
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);
        this.setParamSimple(map, prefix + "AllowAccessCredential", this.AllowAccessCredential);
        this.setParamSimple(map, prefix + "AllowKeyboardLogger", this.AllowKeyboardLogger);
        this.setParamSimple(map, prefix + "MaxAccessCredentialDuration", this.MaxAccessCredentialDuration);

    }
}

