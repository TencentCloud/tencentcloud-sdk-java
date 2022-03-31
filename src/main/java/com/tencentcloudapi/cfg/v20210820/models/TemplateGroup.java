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

public class TemplateGroup extends AbstractModel{

    /**
    * 经验库动作ID
    */
    @SerializedName("TemplateGroupId")
    @Expose
    private Long TemplateGroupId;

    /**
    * 经验库动作分组动作列表
    */
    @SerializedName("TemplateGroupActions")
    @Expose
    private TemplateGroupAction [] TemplateGroupActions;

    /**
    * 分组标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 分组描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 分组顺序
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * 执行模式。1 --- 顺序执行，2 --- 阶段执行
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 对象类型ID
    */
    @SerializedName("ObjectTypeId")
    @Expose
    private Long ObjectTypeId;

    /**
    * 分组创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 分组更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 经验库动作ID 
     * @return TemplateGroupId 经验库动作ID
     */
    public Long getTemplateGroupId() {
        return this.TemplateGroupId;
    }

    /**
     * Set 经验库动作ID
     * @param TemplateGroupId 经验库动作ID
     */
    public void setTemplateGroupId(Long TemplateGroupId) {
        this.TemplateGroupId = TemplateGroupId;
    }

    /**
     * Get 经验库动作分组动作列表 
     * @return TemplateGroupActions 经验库动作分组动作列表
     */
    public TemplateGroupAction [] getTemplateGroupActions() {
        return this.TemplateGroupActions;
    }

    /**
     * Set 经验库动作分组动作列表
     * @param TemplateGroupActions 经验库动作分组动作列表
     */
    public void setTemplateGroupActions(TemplateGroupAction [] TemplateGroupActions) {
        this.TemplateGroupActions = TemplateGroupActions;
    }

    /**
     * Get 分组标题 
     * @return Title 分组标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 分组标题
     * @param Title 分组标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 分组描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 分组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 分组描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 分组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 分组顺序 
     * @return Order 分组顺序
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 分组顺序
     * @param Order 分组顺序
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get 执行模式。1 --- 顺序执行，2 --- 阶段执行 
     * @return Mode 执行模式。1 --- 顺序执行，2 --- 阶段执行
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 执行模式。1 --- 顺序执行，2 --- 阶段执行
     * @param Mode 执行模式。1 --- 顺序执行，2 --- 阶段执行
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
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

    /**
     * Get 分组创建时间 
     * @return CreateTime 分组创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 分组创建时间
     * @param CreateTime 分组创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 分组更新时间 
     * @return UpdateTime 分组更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 分组更新时间
     * @param UpdateTime 分组更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public TemplateGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateGroup(TemplateGroup source) {
        if (source.TemplateGroupId != null) {
            this.TemplateGroupId = new Long(source.TemplateGroupId);
        }
        if (source.TemplateGroupActions != null) {
            this.TemplateGroupActions = new TemplateGroupAction[source.TemplateGroupActions.length];
            for (int i = 0; i < source.TemplateGroupActions.length; i++) {
                this.TemplateGroupActions[i] = new TemplateGroupAction(source.TemplateGroupActions[i]);
            }
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.ObjectTypeId != null) {
            this.ObjectTypeId = new Long(source.ObjectTypeId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateGroupId", this.TemplateGroupId);
        this.setParamArrayObj(map, prefix + "TemplateGroupActions.", this.TemplateGroupActions);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "ObjectTypeId", this.ObjectTypeId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

