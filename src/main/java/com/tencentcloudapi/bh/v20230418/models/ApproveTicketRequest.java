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

public class ApproveTicketRequest extends AbstractModel {

    /**
    * 工单唯一id，数据库索引id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 2-审批通过，4-审批驳回
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 审批意见
    */
    @SerializedName("ApproveDesc")
    @Expose
    private String ApproveDesc;

    /**
    * 申请时间戳，单位微妙
    */
    @SerializedName("ApplyTimeVersion")
    @Expose
    private Long ApplyTimeVersion;

    /**
    * 审批权限工单时，设置的有效期开始时间，默认为当前时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 审批权限工单时，设置的有效期的结束时间，默认有限期为1天
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

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
    * 是否开启 SFTP 文件上传
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
    * 是否开启 SFTP 文件下载
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
    * 是否开启rdp磁盘映射文件上传
    */
    @SerializedName("AllowDiskFileUp")
    @Expose
    private Boolean AllowDiskFileUp;

    /**
    * 是否开启rdp磁盘映射文件下载
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
    * 是否允许使用访问串，默认允许
    */
    @SerializedName("AllowAccessCredential")
    @Expose
    private Boolean AllowAccessCredential;

    /**
    * 关联的高危命令模板ID
    */
    @SerializedName("CmdTemplateIdSet")
    @Expose
    private Long [] CmdTemplateIdSet;

    /**
    * 关联高危DB模板ID
    */
    @SerializedName("ACTemplateIdSet")
    @Expose
    private String [] ACTemplateIdSet;

    /**
    * 部门id
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
    * 是否允许键盘记录
    */
    @SerializedName("AllowKeyboardLogger")
    @Expose
    private Boolean AllowKeyboardLogger;

    /**
     * Get 工单唯一id，数据库索引id 
     * @return Id 工单唯一id，数据库索引id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 工单唯一id，数据库索引id
     * @param Id 工单唯一id，数据库索引id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 2-审批通过，4-审批驳回 
     * @return Status 2-审批通过，4-审批驳回
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 2-审批通过，4-审批驳回
     * @param Status 2-审批通过，4-审批驳回
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 审批意见 
     * @return ApproveDesc 审批意见
     */
    public String getApproveDesc() {
        return this.ApproveDesc;
    }

    /**
     * Set 审批意见
     * @param ApproveDesc 审批意见
     */
    public void setApproveDesc(String ApproveDesc) {
        this.ApproveDesc = ApproveDesc;
    }

    /**
     * Get 申请时间戳，单位微妙 
     * @return ApplyTimeVersion 申请时间戳，单位微妙
     */
    public Long getApplyTimeVersion() {
        return this.ApplyTimeVersion;
    }

    /**
     * Set 申请时间戳，单位微妙
     * @param ApplyTimeVersion 申请时间戳，单位微妙
     */
    public void setApplyTimeVersion(Long ApplyTimeVersion) {
        this.ApplyTimeVersion = ApplyTimeVersion;
    }

    /**
     * Get 审批权限工单时，设置的有效期开始时间，默认为当前时间 
     * @return StartTime 审批权限工单时，设置的有效期开始时间，默认为当前时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 审批权限工单时，设置的有效期开始时间，默认为当前时间
     * @param StartTime 审批权限工单时，设置的有效期开始时间，默认为当前时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 审批权限工单时，设置的有效期的结束时间，默认有限期为1天 
     * @return EndTime 审批权限工单时，设置的有效期的结束时间，默认有限期为1天
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 审批权限工单时，设置的有效期的结束时间，默认有限期为1天
     * @param EndTime 审批权限工单时，设置的有效期的结束时间，默认有限期为1天
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get 是否开启 SFTP 文件上传 
     * @return AllowFileUp 是否开启 SFTP 文件上传
     */
    public Boolean getAllowFileUp() {
        return this.AllowFileUp;
    }

    /**
     * Set 是否开启 SFTP 文件上传
     * @param AllowFileUp 是否开启 SFTP 文件上传
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
     * Get 是否开启 SFTP 文件下载 
     * @return AllowFileDown 是否开启 SFTP 文件下载
     */
    public Boolean getAllowFileDown() {
        return this.AllowFileDown;
    }

    /**
     * Set 是否开启 SFTP 文件下载
     * @param AllowFileDown 是否开启 SFTP 文件下载
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
     * Get 是否开启rdp磁盘映射文件上传 
     * @return AllowDiskFileUp 是否开启rdp磁盘映射文件上传
     */
    public Boolean getAllowDiskFileUp() {
        return this.AllowDiskFileUp;
    }

    /**
     * Set 是否开启rdp磁盘映射文件上传
     * @param AllowDiskFileUp 是否开启rdp磁盘映射文件上传
     */
    public void setAllowDiskFileUp(Boolean AllowDiskFileUp) {
        this.AllowDiskFileUp = AllowDiskFileUp;
    }

    /**
     * Get 是否开启rdp磁盘映射文件下载 
     * @return AllowDiskFileDown 是否开启rdp磁盘映射文件下载
     */
    public Boolean getAllowDiskFileDown() {
        return this.AllowDiskFileDown;
    }

    /**
     * Set 是否开启rdp磁盘映射文件下载
     * @param AllowDiskFileDown 是否开启rdp磁盘映射文件下载
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
     * Get 是否允许使用访问串，默认允许 
     * @return AllowAccessCredential 是否允许使用访问串，默认允许
     */
    public Boolean getAllowAccessCredential() {
        return this.AllowAccessCredential;
    }

    /**
     * Set 是否允许使用访问串，默认允许
     * @param AllowAccessCredential 是否允许使用访问串，默认允许
     */
    public void setAllowAccessCredential(Boolean AllowAccessCredential) {
        this.AllowAccessCredential = AllowAccessCredential;
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
     * Get 关联高危DB模板ID 
     * @return ACTemplateIdSet 关联高危DB模板ID
     */
    public String [] getACTemplateIdSet() {
        return this.ACTemplateIdSet;
    }

    /**
     * Set 关联高危DB模板ID
     * @param ACTemplateIdSet 关联高危DB模板ID
     */
    public void setACTemplateIdSet(String [] ACTemplateIdSet) {
        this.ACTemplateIdSet = ACTemplateIdSet;
    }

    /**
     * Get 部门id 
     * @return DepartmentId 部门id
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set 部门id
     * @param DepartmentId 部门id
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    /**
     * Get 是否允许键盘记录 
     * @return AllowKeyboardLogger 是否允许键盘记录
     */
    public Boolean getAllowKeyboardLogger() {
        return this.AllowKeyboardLogger;
    }

    /**
     * Set 是否允许键盘记录
     * @param AllowKeyboardLogger 是否允许键盘记录
     */
    public void setAllowKeyboardLogger(Boolean AllowKeyboardLogger) {
        this.AllowKeyboardLogger = AllowKeyboardLogger;
    }

    public ApproveTicketRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApproveTicketRequest(ApproveTicketRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ApproveDesc != null) {
            this.ApproveDesc = new String(source.ApproveDesc);
        }
        if (source.ApplyTimeVersion != null) {
            this.ApplyTimeVersion = new Long(source.ApplyTimeVersion);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
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
        if (source.AllowAccessCredential != null) {
            this.AllowAccessCredential = new Boolean(source.AllowAccessCredential);
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
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
        if (source.AllowKeyboardLogger != null) {
            this.AllowKeyboardLogger = new Boolean(source.AllowKeyboardLogger);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ApproveDesc", this.ApproveDesc);
        this.setParamSimple(map, prefix + "ApplyTimeVersion", this.ApplyTimeVersion);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AllowDiskRedirect", this.AllowDiskRedirect);
        this.setParamSimple(map, prefix + "AllowClipFileUp", this.AllowClipFileUp);
        this.setParamSimple(map, prefix + "AllowClipFileDown", this.AllowClipFileDown);
        this.setParamSimple(map, prefix + "AllowClipTextUp", this.AllowClipTextUp);
        this.setParamSimple(map, prefix + "AllowClipTextDown", this.AllowClipTextDown);
        this.setParamSimple(map, prefix + "AllowFileUp", this.AllowFileUp);
        this.setParamSimple(map, prefix + "MaxFileUpSize", this.MaxFileUpSize);
        this.setParamSimple(map, prefix + "AllowFileDown", this.AllowFileDown);
        this.setParamSimple(map, prefix + "MaxFileDownSize", this.MaxFileDownSize);
        this.setParamSimple(map, prefix + "AllowDiskFileUp", this.AllowDiskFileUp);
        this.setParamSimple(map, prefix + "AllowDiskFileDown", this.AllowDiskFileDown);
        this.setParamSimple(map, prefix + "AllowShellFileUp", this.AllowShellFileUp);
        this.setParamSimple(map, prefix + "AllowShellFileDown", this.AllowShellFileDown);
        this.setParamSimple(map, prefix + "AllowFileDel", this.AllowFileDel);
        this.setParamSimple(map, prefix + "AllowAccessCredential", this.AllowAccessCredential);
        this.setParamArraySimple(map, prefix + "CmdTemplateIdSet.", this.CmdTemplateIdSet);
        this.setParamArraySimple(map, prefix + "ACTemplateIdSet.", this.ACTemplateIdSet);
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);
        this.setParamSimple(map, prefix + "AllowKeyboardLogger", this.AllowKeyboardLogger);

    }
}

