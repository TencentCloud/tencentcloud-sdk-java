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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodeTemplateDetail extends AbstractModel {

    /**
    * <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>模版名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeTemplateName")
    @Expose
    private String CodeTemplateName;

    /**
    * <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * <p>代码模版描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeTemplateDesc")
    @Expose
    private String CodeTemplateDesc;

    /**
    * <p>文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * <p>责任人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * <p>责任人id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InChargeId")
    @Expose
    private String InChargeId;

    /**
    * <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ext")
    @Expose
    private TaskExtDsVO Ext;

    /**
    * <p>模版id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeTemplateId")
    @Expose
    private String CodeTemplateId;

    /**
    * <p>最后更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * <p>更新人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * <p>更新人id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUserId")
    @Expose
    private String UpdateUserId;

    /**
    * <p>执行ip</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * <p>资源组id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * <p>是否提交</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Submit")
    @Expose
    private Boolean Submit;

    /**
    * <p>模版脚本是否发生变化</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptChange")
    @Expose
    private Boolean ScriptChange;

    /**
    * <p>代码模版脚本，base64编码返回</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
     * Get <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>模版名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeTemplateName <p>模版名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeTemplateName() {
        return this.CodeTemplateName;
    }

    /**
     * Set <p>模版名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeTemplateName <p>模版名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeTemplateName(String CodeTemplateName) {
        this.CodeTemplateName = CodeTemplateName;
    }

    /**
     * Get <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>代码模版描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeTemplateDesc <p>代码模版描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeTemplateDesc() {
        return this.CodeTemplateDesc;
    }

    /**
     * Set <p>代码模版描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeTemplateDesc <p>代码模版描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeTemplateDesc(String CodeTemplateDesc) {
        this.CodeTemplateDesc = CodeTemplateDesc;
    }

    /**
     * Get <p>文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId <p>文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set <p>文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId <p>文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderName <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderName <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get <p>责任人名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InCharge <p>责任人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set <p>责任人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InCharge <p>责任人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get <p>责任人id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InChargeId <p>责任人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInChargeId() {
        return this.InChargeId;
    }

    /**
     * Set <p>责任人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InChargeId <p>责任人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInChargeId(String InChargeId) {
        this.InChargeId = InChargeId;
    }

    /**
     * Get <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ext <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskExtDsVO getExt() {
        return this.Ext;
    }

    /**
     * Set <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ext <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExt(TaskExtDsVO Ext) {
        this.Ext = Ext;
    }

    /**
     * Get <p>模版id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeTemplateId <p>模版id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeTemplateId() {
        return this.CodeTemplateId;
    }

    /**
     * Set <p>模版id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeTemplateId <p>模版id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeTemplateId(String CodeTemplateId) {
        this.CodeTemplateId = CodeTemplateId;
    }

    /**
     * Get <p>最后更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdateTime <p>最后更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set <p>最后更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdateTime <p>最后更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get <p>更新人名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUser <p>更新人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set <p>更新人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUser <p>更新人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get <p>更新人id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUserId <p>更新人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUserId() {
        return this.UpdateUserId;
    }

    /**
     * Set <p>更新人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUserId <p>更新人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUserId(String UpdateUserId) {
        this.UpdateUserId = UpdateUserId;
    }

    /**
     * Get <p>执行ip</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrokerIp <p>执行ip</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set <p>执行ip</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrokerIp <p>执行ip</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get <p>资源组id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroup <p>资源组id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set <p>资源组id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroup <p>资源组id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get <p>是否提交</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Submit <p>是否提交</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSubmit() {
        return this.Submit;
    }

    /**
     * Set <p>是否提交</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Submit <p>是否提交</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubmit(Boolean Submit) {
        this.Submit = Submit;
    }

    /**
     * Get <p>模版脚本是否发生变化</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptChange <p>模版脚本是否发生变化</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getScriptChange() {
        return this.ScriptChange;
    }

    /**
     * Set <p>模版脚本是否发生变化</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptChange <p>模版脚本是否发生变化</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptChange(Boolean ScriptChange) {
        this.ScriptChange = ScriptChange;
    }

    /**
     * Get <p>代码模版脚本，base64编码返回</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content <p>代码模版脚本，base64编码返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>代码模版脚本，base64编码返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content <p>代码模版脚本，base64编码返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Privilege <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Privilege <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    public CodeTemplateDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodeTemplateDetail(CodeTemplateDetail source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CodeTemplateName != null) {
            this.CodeTemplateName = new String(source.CodeTemplateName);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.CodeTemplateDesc != null) {
            this.CodeTemplateDesc = new String(source.CodeTemplateDesc);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.InChargeId != null) {
            this.InChargeId = new String(source.InChargeId);
        }
        if (source.Ext != null) {
            this.Ext = new TaskExtDsVO(source.Ext);
        }
        if (source.CodeTemplateId != null) {
            this.CodeTemplateId = new String(source.CodeTemplateId);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
        if (source.UpdateUser != null) {
            this.UpdateUser = new String(source.UpdateUser);
        }
        if (source.UpdateUserId != null) {
            this.UpdateUserId = new String(source.UpdateUserId);
        }
        if (source.BrokerIp != null) {
            this.BrokerIp = new String(source.BrokerIp);
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.Submit != null) {
            this.Submit = new Boolean(source.Submit);
        }
        if (source.ScriptChange != null) {
            this.ScriptChange = new Boolean(source.ScriptChange);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Privilege != null) {
            this.Privilege = new String(source.Privilege);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CodeTemplateName", this.CodeTemplateName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "CodeTemplateDesc", this.CodeTemplateDesc);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "InChargeId", this.InChargeId);
        this.setParamObj(map, prefix + "Ext.", this.Ext);
        this.setParamSimple(map, prefix + "CodeTemplateId", this.CodeTemplateId);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "UpdateUser", this.UpdateUser);
        this.setParamSimple(map, prefix + "UpdateUserId", this.UpdateUserId);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "Submit", this.Submit);
        this.setParamSimple(map, prefix + "ScriptChange", this.ScriptChange);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);

    }
}

