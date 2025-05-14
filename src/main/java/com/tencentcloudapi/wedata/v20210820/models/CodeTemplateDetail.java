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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodeTemplateDetail extends AbstractModel {

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 模版名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeTemplateName")
    @Expose
    private String CodeTemplateName;

    /**
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 代码模版描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeTemplateDesc")
    @Expose
    private String CodeTemplateDesc;

    /**
    * 文件夹id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * 责任人id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InChargeId")
    @Expose
    private String InChargeId;

    /**
    * 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ext")
    @Expose
    private TaskExtDsVO Ext;

    /**
    * 模版id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeTemplateId")
    @Expose
    private String CodeTemplateId;

    /**
    * 最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * 更新人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * 更新人id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUserId")
    @Expose
    private String UpdateUserId;

    /**
    * 执行ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * 资源组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * 是否提交
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Submit")
    @Expose
    private Boolean Submit;

    /**
    * 任务脚本是否发生变化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptChange")
    @Expose
    private Boolean ScriptChange;

    /**
     * Get 项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 模版名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeTemplateName 模版名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeTemplateName() {
        return this.CodeTemplateName;
    }

    /**
     * Set 模版名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeTemplateName 模版名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeTemplateName(String CodeTemplateName) {
        this.CodeTemplateName = CodeTemplateName;
    }

    /**
     * Get 任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 代码模版描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeTemplateDesc 代码模版描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeTemplateDesc() {
        return this.CodeTemplateDesc;
    }

    /**
     * Set 代码模版描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeTemplateDesc 代码模版描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeTemplateDesc(String CodeTemplateDesc) {
        this.CodeTemplateDesc = CodeTemplateDesc;
    }

    /**
     * Get 文件夹id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId 文件夹id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 文件夹id
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId 文件夹id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderName 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderName 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get 责任人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InCharge 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InCharge 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get 责任人id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InChargeId 责任人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInChargeId() {
        return this.InChargeId;
    }

    /**
     * Set 责任人id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InChargeId 责任人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInChargeId(String InChargeId) {
        this.InChargeId = InChargeId;
    }

    /**
     * Get 扩展信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ext 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskExtDsVO getExt() {
        return this.Ext;
    }

    /**
     * Set 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ext 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExt(TaskExtDsVO Ext) {
        this.Ext = Ext;
    }

    /**
     * Get 模版id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeTemplateId 模版id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeTemplateId() {
        return this.CodeTemplateId;
    }

    /**
     * Set 模版id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeTemplateId 模版id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeTemplateId(String CodeTemplateId) {
        this.CodeTemplateId = CodeTemplateId;
    }

    /**
     * Get 最后更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdateTime 最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdateTime 最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get 更新人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUser 更新人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set 更新人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUser 更新人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get 更新人id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUserId 更新人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUserId() {
        return this.UpdateUserId;
    }

    /**
     * Set 更新人id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUserId 更新人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUserId(String UpdateUserId) {
        this.UpdateUserId = UpdateUserId;
    }

    /**
     * Get 执行ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrokerIp 执行ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set 执行ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrokerIp 执行ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get 资源组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroup 资源组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set 资源组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroup 资源组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get 是否提交
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Submit 是否提交
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSubmit() {
        return this.Submit;
    }

    /**
     * Set 是否提交
注意：此字段可能返回 null，表示取不到有效值。
     * @param Submit 是否提交
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubmit(Boolean Submit) {
        this.Submit = Submit;
    }

    /**
     * Get 任务脚本是否发生变化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptChange 任务脚本是否发生变化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getScriptChange() {
        return this.ScriptChange;
    }

    /**
     * Set 任务脚本是否发生变化
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptChange 任务脚本是否发生变化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptChange(Boolean ScriptChange) {
        this.ScriptChange = ScriptChange;
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

    }
}

