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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateGroupAction extends AbstractModel{

    /**
    * 经验库分组动作ID
    */
    @SerializedName("TemplateGroupActionId")
    @Expose
    private Long TemplateGroupActionId;

    /**
    * 动作ID
    */
    @SerializedName("ActionId")
    @Expose
    private Long ActionId;

    /**
    * 分组动作顺序
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * 分组动作通用配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GeneralConfiguration")
    @Expose
    private String GeneralConfiguration;

    /**
    * 分组动作自定义配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomConfiguration")
    @Expose
    private String CustomConfiguration;

    /**
    * 动作分组创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 动作分组更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 动作名称
    */
    @SerializedName("ActionTitle")
    @Expose
    private String ActionTitle;

    /**
    * 自身随机id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RandomId")
    @Expose
    private Long RandomId;

    /**
    * 恢复动作id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecoverId")
    @Expose
    private Long RecoverId;

    /**
    * 执行动作id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteId")
    @Expose
    private Long ExecuteId;

    /**
    * 调用api类型，0:tat, 1:云api
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionApiType")
    @Expose
    private Long ActionApiType;

    /**
    * 1:故障，2:恢复
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionAttribute")
    @Expose
    private Long ActionAttribute;

    /**
    * 动作类型：平台和自定义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
     * Get 经验库分组动作ID 
     * @return TemplateGroupActionId 经验库分组动作ID
     */
    public Long getTemplateGroupActionId() {
        return this.TemplateGroupActionId;
    }

    /**
     * Set 经验库分组动作ID
     * @param TemplateGroupActionId 经验库分组动作ID
     */
    public void setTemplateGroupActionId(Long TemplateGroupActionId) {
        this.TemplateGroupActionId = TemplateGroupActionId;
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
     * Get 分组动作顺序 
     * @return Order 分组动作顺序
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 分组动作顺序
     * @param Order 分组动作顺序
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get 分组动作通用配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GeneralConfiguration 分组动作通用配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGeneralConfiguration() {
        return this.GeneralConfiguration;
    }

    /**
     * Set 分组动作通用配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param GeneralConfiguration 分组动作通用配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGeneralConfiguration(String GeneralConfiguration) {
        this.GeneralConfiguration = GeneralConfiguration;
    }

    /**
     * Get 分组动作自定义配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomConfiguration 分组动作自定义配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomConfiguration() {
        return this.CustomConfiguration;
    }

    /**
     * Set 分组动作自定义配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomConfiguration 分组动作自定义配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomConfiguration(String CustomConfiguration) {
        this.CustomConfiguration = CustomConfiguration;
    }

    /**
     * Get 动作分组创建时间 
     * @return CreateTime 动作分组创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 动作分组创建时间
     * @param CreateTime 动作分组创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 动作分组更新时间 
     * @return UpdateTime 动作分组更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 动作分组更新时间
     * @param UpdateTime 动作分组更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 动作名称 
     * @return ActionTitle 动作名称
     */
    public String getActionTitle() {
        return this.ActionTitle;
    }

    /**
     * Set 动作名称
     * @param ActionTitle 动作名称
     */
    public void setActionTitle(String ActionTitle) {
        this.ActionTitle = ActionTitle;
    }

    /**
     * Get 自身随机id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RandomId 自身随机id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRandomId() {
        return this.RandomId;
    }

    /**
     * Set 自身随机id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RandomId 自身随机id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRandomId(Long RandomId) {
        this.RandomId = RandomId;
    }

    /**
     * Get 恢复动作id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecoverId 恢复动作id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecoverId() {
        return this.RecoverId;
    }

    /**
     * Set 恢复动作id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecoverId 恢复动作id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecoverId(Long RecoverId) {
        this.RecoverId = RecoverId;
    }

    /**
     * Get 执行动作id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecuteId 执行动作id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecuteId() {
        return this.ExecuteId;
    }

    /**
     * Set 执行动作id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecuteId 执行动作id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecuteId(Long ExecuteId) {
        this.ExecuteId = ExecuteId;
    }

    /**
     * Get 调用api类型，0:tat, 1:云api
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionApiType 调用api类型，0:tat, 1:云api
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActionApiType() {
        return this.ActionApiType;
    }

    /**
     * Set 调用api类型，0:tat, 1:云api
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionApiType 调用api类型，0:tat, 1:云api
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionApiType(Long ActionApiType) {
        this.ActionApiType = ActionApiType;
    }

    /**
     * Get 1:故障，2:恢复
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionAttribute 1:故障，2:恢复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActionAttribute() {
        return this.ActionAttribute;
    }

    /**
     * Set 1:故障，2:恢复
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionAttribute 1:故障，2:恢复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionAttribute(Long ActionAttribute) {
        this.ActionAttribute = ActionAttribute;
    }

    /**
     * Get 动作类型：平台和自定义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionType 动作类型：平台和自定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 动作类型：平台和自定义
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionType 动作类型：平台和自定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    public TemplateGroupAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateGroupAction(TemplateGroupAction source) {
        if (source.TemplateGroupActionId != null) {
            this.TemplateGroupActionId = new Long(source.TemplateGroupActionId);
        }
        if (source.ActionId != null) {
            this.ActionId = new Long(source.ActionId);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.GeneralConfiguration != null) {
            this.GeneralConfiguration = new String(source.GeneralConfiguration);
        }
        if (source.CustomConfiguration != null) {
            this.CustomConfiguration = new String(source.CustomConfiguration);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ActionTitle != null) {
            this.ActionTitle = new String(source.ActionTitle);
        }
        if (source.RandomId != null) {
            this.RandomId = new Long(source.RandomId);
        }
        if (source.RecoverId != null) {
            this.RecoverId = new Long(source.RecoverId);
        }
        if (source.ExecuteId != null) {
            this.ExecuteId = new Long(source.ExecuteId);
        }
        if (source.ActionApiType != null) {
            this.ActionApiType = new Long(source.ActionApiType);
        }
        if (source.ActionAttribute != null) {
            this.ActionAttribute = new Long(source.ActionAttribute);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateGroupActionId", this.TemplateGroupActionId);
        this.setParamSimple(map, prefix + "ActionId", this.ActionId);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "GeneralConfiguration", this.GeneralConfiguration);
        this.setParamSimple(map, prefix + "CustomConfiguration", this.CustomConfiguration);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ActionTitle", this.ActionTitle);
        this.setParamSimple(map, prefix + "RandomId", this.RandomId);
        this.setParamSimple(map, prefix + "RecoverId", this.RecoverId);
        this.setParamSimple(map, prefix + "ExecuteId", this.ExecuteId);
        this.setParamSimple(map, prefix + "ActionApiType", this.ActionApiType);
        this.setParamSimple(map, prefix + "ActionAttribute", this.ActionAttribute);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);

    }
}

