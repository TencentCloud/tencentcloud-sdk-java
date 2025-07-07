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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActionLibraryListResult extends AbstractModel {

    /**
    * 动作名称
    */
    @SerializedName("ActionName")
    @Expose
    private String ActionName;

    /**
    * 动作描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 动作类型。范围：["平台","自定义"]
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 创建人
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 动作风险描述
    */
    @SerializedName("RiskDesc")
    @Expose
    private String RiskDesc;

    /**
    * 动作ID
    */
    @SerializedName("ActionId")
    @Expose
    private Long ActionId;

    /**
    * 动作属性（ 1：故障  2：恢复）
    */
    @SerializedName("AttributeId")
    @Expose
    private Long AttributeId;

    /**
    * 关联的动作ID
    */
    @SerializedName("RelationActionId")
    @Expose
    private Long RelationActionId;

    /**
    * 操作命令
    */
    @SerializedName("ActionCommand")
    @Expose
    private String ActionCommand;

    /**
    * 动作类型（0 -- tat   1 -- 云API）
    */
    @SerializedName("ActionCommandType")
    @Expose
    private Long ActionCommandType;

    /**
    * 自定义动作的参数，json string
    */
    @SerializedName("ActionContent")
    @Expose
    private String ActionContent;

    /**
    * 二级分类
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 动作描述
    */
    @SerializedName("ActionDetail")
    @Expose
    private String ActionDetail;

    /**
    * 是否允许当前账号使用
    */
    @SerializedName("IsAllowed")
    @Expose
    private Boolean IsAllowed;

    /**
    * 最佳实践案例的链接地址
    */
    @SerializedName("ActionBestCase")
    @Expose
    private String ActionBestCase;

    /**
    * 对象类型
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * 监控指标ID列表
    */
    @SerializedName("MetricIdList")
    @Expose
    private Long [] MetricIdList;

    /**
    * 是否是新动作
    */
    @SerializedName("IsNewAction")
    @Expose
    private Boolean IsNewAction;

    /**
    * 对象类型ID
    */
    @SerializedName("ObjectTypeId")
    @Expose
    private Long ObjectTypeId;

    /**
     * Get 动作名称 
     * @return ActionName 动作名称
     */
    public String getActionName() {
        return this.ActionName;
    }

    /**
     * Set 动作名称
     * @param ActionName 动作名称
     */
    public void setActionName(String ActionName) {
        this.ActionName = ActionName;
    }

    /**
     * Get 动作描述 
     * @return Desc 动作描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 动作描述
     * @param Desc 动作描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 动作类型。范围：["平台","自定义"] 
     * @return ActionType 动作类型。范围：["平台","自定义"]
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 动作类型。范围：["平台","自定义"]
     * @param ActionType 动作类型。范围：["平台","自定义"]
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 创建人 
     * @return Creator 创建人
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建人
     * @param Creator 创建人
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 动作风险描述 
     * @return RiskDesc 动作风险描述
     */
    public String getRiskDesc() {
        return this.RiskDesc;
    }

    /**
     * Set 动作风险描述
     * @param RiskDesc 动作风险描述
     */
    public void setRiskDesc(String RiskDesc) {
        this.RiskDesc = RiskDesc;
    }

    /**
     * Get 动作ID 
     * @return ActionId 动作ID
     */
    public Long getActionId() {
        return this.ActionId;
    }

    /**
     * Set 动作ID
     * @param ActionId 动作ID
     */
    public void setActionId(Long ActionId) {
        this.ActionId = ActionId;
    }

    /**
     * Get 动作属性（ 1：故障  2：恢复） 
     * @return AttributeId 动作属性（ 1：故障  2：恢复）
     */
    public Long getAttributeId() {
        return this.AttributeId;
    }

    /**
     * Set 动作属性（ 1：故障  2：恢复）
     * @param AttributeId 动作属性（ 1：故障  2：恢复）
     */
    public void setAttributeId(Long AttributeId) {
        this.AttributeId = AttributeId;
    }

    /**
     * Get 关联的动作ID 
     * @return RelationActionId 关联的动作ID
     */
    public Long getRelationActionId() {
        return this.RelationActionId;
    }

    /**
     * Set 关联的动作ID
     * @param RelationActionId 关联的动作ID
     */
    public void setRelationActionId(Long RelationActionId) {
        this.RelationActionId = RelationActionId;
    }

    /**
     * Get 操作命令 
     * @return ActionCommand 操作命令
     */
    public String getActionCommand() {
        return this.ActionCommand;
    }

    /**
     * Set 操作命令
     * @param ActionCommand 操作命令
     */
    public void setActionCommand(String ActionCommand) {
        this.ActionCommand = ActionCommand;
    }

    /**
     * Get 动作类型（0 -- tat   1 -- 云API） 
     * @return ActionCommandType 动作类型（0 -- tat   1 -- 云API）
     */
    public Long getActionCommandType() {
        return this.ActionCommandType;
    }

    /**
     * Set 动作类型（0 -- tat   1 -- 云API）
     * @param ActionCommandType 动作类型（0 -- tat   1 -- 云API）
     */
    public void setActionCommandType(Long ActionCommandType) {
        this.ActionCommandType = ActionCommandType;
    }

    /**
     * Get 自定义动作的参数，json string 
     * @return ActionContent 自定义动作的参数，json string
     */
    public String getActionContent() {
        return this.ActionContent;
    }

    /**
     * Set 自定义动作的参数，json string
     * @param ActionContent 自定义动作的参数，json string
     */
    public void setActionContent(String ActionContent) {
        this.ActionContent = ActionContent;
    }

    /**
     * Get 二级分类 
     * @return ResourceType 二级分类
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 二级分类
     * @param ResourceType 二级分类
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 动作描述 
     * @return ActionDetail 动作描述
     */
    public String getActionDetail() {
        return this.ActionDetail;
    }

    /**
     * Set 动作描述
     * @param ActionDetail 动作描述
     */
    public void setActionDetail(String ActionDetail) {
        this.ActionDetail = ActionDetail;
    }

    /**
     * Get 是否允许当前账号使用 
     * @return IsAllowed 是否允许当前账号使用
     */
    public Boolean getIsAllowed() {
        return this.IsAllowed;
    }

    /**
     * Set 是否允许当前账号使用
     * @param IsAllowed 是否允许当前账号使用
     */
    public void setIsAllowed(Boolean IsAllowed) {
        this.IsAllowed = IsAllowed;
    }

    /**
     * Get 最佳实践案例的链接地址 
     * @return ActionBestCase 最佳实践案例的链接地址
     */
    public String getActionBestCase() {
        return this.ActionBestCase;
    }

    /**
     * Set 最佳实践案例的链接地址
     * @param ActionBestCase 最佳实践案例的链接地址
     */
    public void setActionBestCase(String ActionBestCase) {
        this.ActionBestCase = ActionBestCase;
    }

    /**
     * Get 对象类型 
     * @return ObjectType 对象类型
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set 对象类型
     * @param ObjectType 对象类型
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get 监控指标ID列表 
     * @return MetricIdList 监控指标ID列表
     */
    public Long [] getMetricIdList() {
        return this.MetricIdList;
    }

    /**
     * Set 监控指标ID列表
     * @param MetricIdList 监控指标ID列表
     */
    public void setMetricIdList(Long [] MetricIdList) {
        this.MetricIdList = MetricIdList;
    }

    /**
     * Get 是否是新动作 
     * @return IsNewAction 是否是新动作
     */
    public Boolean getIsNewAction() {
        return this.IsNewAction;
    }

    /**
     * Set 是否是新动作
     * @param IsNewAction 是否是新动作
     */
    public void setIsNewAction(Boolean IsNewAction) {
        this.IsNewAction = IsNewAction;
    }

    /**
     * Get 对象类型ID 
     * @return ObjectTypeId 对象类型ID
     */
    public Long getObjectTypeId() {
        return this.ObjectTypeId;
    }

    /**
     * Set 对象类型ID
     * @param ObjectTypeId 对象类型ID
     */
    public void setObjectTypeId(Long ObjectTypeId) {
        this.ObjectTypeId = ObjectTypeId;
    }

    public ActionLibraryListResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActionLibraryListResult(ActionLibraryListResult source) {
        if (source.ActionName != null) {
            this.ActionName = new String(source.ActionName);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RiskDesc != null) {
            this.RiskDesc = new String(source.RiskDesc);
        }
        if (source.ActionId != null) {
            this.ActionId = new Long(source.ActionId);
        }
        if (source.AttributeId != null) {
            this.AttributeId = new Long(source.AttributeId);
        }
        if (source.RelationActionId != null) {
            this.RelationActionId = new Long(source.RelationActionId);
        }
        if (source.ActionCommand != null) {
            this.ActionCommand = new String(source.ActionCommand);
        }
        if (source.ActionCommandType != null) {
            this.ActionCommandType = new Long(source.ActionCommandType);
        }
        if (source.ActionContent != null) {
            this.ActionContent = new String(source.ActionContent);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ActionDetail != null) {
            this.ActionDetail = new String(source.ActionDetail);
        }
        if (source.IsAllowed != null) {
            this.IsAllowed = new Boolean(source.IsAllowed);
        }
        if (source.ActionBestCase != null) {
            this.ActionBestCase = new String(source.ActionBestCase);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
        if (source.MetricIdList != null) {
            this.MetricIdList = new Long[source.MetricIdList.length];
            for (int i = 0; i < source.MetricIdList.length; i++) {
                this.MetricIdList[i] = new Long(source.MetricIdList[i]);
            }
        }
        if (source.IsNewAction != null) {
            this.IsNewAction = new Boolean(source.IsNewAction);
        }
        if (source.ObjectTypeId != null) {
            this.ObjectTypeId = new Long(source.ObjectTypeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionName", this.ActionName);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RiskDesc", this.RiskDesc);
        this.setParamSimple(map, prefix + "ActionId", this.ActionId);
        this.setParamSimple(map, prefix + "AttributeId", this.AttributeId);
        this.setParamSimple(map, prefix + "RelationActionId", this.RelationActionId);
        this.setParamSimple(map, prefix + "ActionCommand", this.ActionCommand);
        this.setParamSimple(map, prefix + "ActionCommandType", this.ActionCommandType);
        this.setParamSimple(map, prefix + "ActionContent", this.ActionContent);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ActionDetail", this.ActionDetail);
        this.setParamSimple(map, prefix + "IsAllowed", this.IsAllowed);
        this.setParamSimple(map, prefix + "ActionBestCase", this.ActionBestCase);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamArraySimple(map, prefix + "MetricIdList.", this.MetricIdList);
        this.setParamSimple(map, prefix + "IsNewAction", this.IsNewAction);
        this.setParamSimple(map, prefix + "ObjectTypeId", this.ObjectTypeId);

    }
}

