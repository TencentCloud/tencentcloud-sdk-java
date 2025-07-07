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

public class TemplateGroupAction extends AbstractModel {

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
    */
    @SerializedName("GeneralConfiguration")
    @Expose
    private String GeneralConfiguration;

    /**
    * 分组动作自定义配置
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
    */
    @SerializedName("RandomId")
    @Expose
    private Long RandomId;

    /**
    * 恢复动作id
    */
    @SerializedName("RecoverId")
    @Expose
    private Long RecoverId;

    /**
    * 执行动作id
    */
    @SerializedName("ExecuteId")
    @Expose
    private Long ExecuteId;

    /**
    * 调用api类型，0:tat, 1:云api
    */
    @SerializedName("ActionApiType")
    @Expose
    private Long ActionApiType;

    /**
    * 1:故障，2:恢复
    */
    @SerializedName("ActionAttribute")
    @Expose
    private Long ActionAttribute;

    /**
    * 动作类型：平台和自定义
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 动作风险等级，1:低风险 2:中风险 3:高风险
    */
    @SerializedName("ActionRisk")
    @Expose
    private String ActionRisk;

    /**
    * 故障表现
    */
    @SerializedName("FailurePerformance")
    @Expose
    private String FailurePerformance;

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
     * @return GeneralConfiguration 分组动作通用配置
     */
    public String getGeneralConfiguration() {
        return this.GeneralConfiguration;
    }

    /**
     * Set 分组动作通用配置
     * @param GeneralConfiguration 分组动作通用配置
     */
    public void setGeneralConfiguration(String GeneralConfiguration) {
        this.GeneralConfiguration = GeneralConfiguration;
    }

    /**
     * Get 分组动作自定义配置 
     * @return CustomConfiguration 分组动作自定义配置
     */
    public String getCustomConfiguration() {
        return this.CustomConfiguration;
    }

    /**
     * Set 分组动作自定义配置
     * @param CustomConfiguration 分组动作自定义配置
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
     * @return RandomId 自身随机id
     */
    public Long getRandomId() {
        return this.RandomId;
    }

    /**
     * Set 自身随机id
     * @param RandomId 自身随机id
     */
    public void setRandomId(Long RandomId) {
        this.RandomId = RandomId;
    }

    /**
     * Get 恢复动作id 
     * @return RecoverId 恢复动作id
     */
    public Long getRecoverId() {
        return this.RecoverId;
    }

    /**
     * Set 恢复动作id
     * @param RecoverId 恢复动作id
     */
    public void setRecoverId(Long RecoverId) {
        this.RecoverId = RecoverId;
    }

    /**
     * Get 执行动作id 
     * @return ExecuteId 执行动作id
     */
    public Long getExecuteId() {
        return this.ExecuteId;
    }

    /**
     * Set 执行动作id
     * @param ExecuteId 执行动作id
     */
    public void setExecuteId(Long ExecuteId) {
        this.ExecuteId = ExecuteId;
    }

    /**
     * Get 调用api类型，0:tat, 1:云api 
     * @return ActionApiType 调用api类型，0:tat, 1:云api
     */
    public Long getActionApiType() {
        return this.ActionApiType;
    }

    /**
     * Set 调用api类型，0:tat, 1:云api
     * @param ActionApiType 调用api类型，0:tat, 1:云api
     */
    public void setActionApiType(Long ActionApiType) {
        this.ActionApiType = ActionApiType;
    }

    /**
     * Get 1:故障，2:恢复 
     * @return ActionAttribute 1:故障，2:恢复
     */
    public Long getActionAttribute() {
        return this.ActionAttribute;
    }

    /**
     * Set 1:故障，2:恢复
     * @param ActionAttribute 1:故障，2:恢复
     */
    public void setActionAttribute(Long ActionAttribute) {
        this.ActionAttribute = ActionAttribute;
    }

    /**
     * Get 动作类型：平台和自定义 
     * @return ActionType 动作类型：平台和自定义
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 动作类型：平台和自定义
     * @param ActionType 动作类型：平台和自定义
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 动作风险等级，1:低风险 2:中风险 3:高风险 
     * @return ActionRisk 动作风险等级，1:低风险 2:中风险 3:高风险
     */
    public String getActionRisk() {
        return this.ActionRisk;
    }

    /**
     * Set 动作风险等级，1:低风险 2:中风险 3:高风险
     * @param ActionRisk 动作风险等级，1:低风险 2:中风险 3:高风险
     */
    public void setActionRisk(String ActionRisk) {
        this.ActionRisk = ActionRisk;
    }

    /**
     * Get 故障表现 
     * @return FailurePerformance 故障表现
     */
    public String getFailurePerformance() {
        return this.FailurePerformance;
    }

    /**
     * Set 故障表现
     * @param FailurePerformance 故障表现
     */
    public void setFailurePerformance(String FailurePerformance) {
        this.FailurePerformance = FailurePerformance;
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
        if (source.ActionRisk != null) {
            this.ActionRisk = new String(source.ActionRisk);
        }
        if (source.FailurePerformance != null) {
            this.FailurePerformance = new String(source.FailurePerformance);
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
        this.setParamSimple(map, prefix + "ActionRisk", this.ActionRisk);
        this.setParamSimple(map, prefix + "FailurePerformance", this.FailurePerformance);

    }
}

