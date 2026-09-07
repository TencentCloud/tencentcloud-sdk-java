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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebhookTrigger extends AbstractModel {

    /**
    * <p>触发器名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>触发器目标</p>
    */
    @SerializedName("Targets")
    @Expose
    private WebhookTarget [] Targets;

    /**
    * <p>触发动作</p>
    */
    @SerializedName("EventTypes")
    @Expose
    private String [] EventTypes;

    /**
    * <p>触发规则</p>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * <p>启用触发器</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>触发器Id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>触发器描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>触发器所属命名空间 Id</p>
    */
    @SerializedName("NamespaceId")
    @Expose
    private Long NamespaceId;

    /**
    * <p>触发器所属命名空间名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
     * Get <p>触发器名称</p> 
     * @return Name <p>触发器名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>触发器名称</p>
     * @param Name <p>触发器名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>触发器目标</p> 
     * @return Targets <p>触发器目标</p>
     */
    public WebhookTarget [] getTargets() {
        return this.Targets;
    }

    /**
     * Set <p>触发器目标</p>
     * @param Targets <p>触发器目标</p>
     */
    public void setTargets(WebhookTarget [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get <p>触发动作</p> 
     * @return EventTypes <p>触发动作</p>
     */
    public String [] getEventTypes() {
        return this.EventTypes;
    }

    /**
     * Set <p>触发动作</p>
     * @param EventTypes <p>触发动作</p>
     */
    public void setEventTypes(String [] EventTypes) {
        this.EventTypes = EventTypes;
    }

    /**
     * Get <p>触发规则</p> 
     * @return Condition <p>触发规则</p>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>触发规则</p>
     * @param Condition <p>触发规则</p>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>启用触发器</p> 
     * @return Enabled <p>启用触发器</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>启用触发器</p>
     * @param Enabled <p>启用触发器</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>触发器Id</p> 
     * @return Id <p>触发器Id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>触发器Id</p>
     * @param Id <p>触发器Id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>触发器描述</p> 
     * @return Description <p>触发器描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>触发器描述</p>
     * @param Description <p>触发器描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>触发器所属命名空间 Id</p> 
     * @return NamespaceId <p>触发器所属命名空间 Id</p>
     */
    public Long getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set <p>触发器所属命名空间 Id</p>
     * @param NamespaceId <p>触发器所属命名空间 Id</p>
     */
    public void setNamespaceId(Long NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get <p>触发器所属命名空间名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceName <p>触发器所属命名空间名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set <p>触发器所属命名空间名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceName <p>触发器所属命名空间名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    public WebhookTrigger() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebhookTrigger(WebhookTrigger source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Targets != null) {
            this.Targets = new WebhookTarget[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new WebhookTarget(source.Targets[i]);
            }
        }
        if (source.EventTypes != null) {
            this.EventTypes = new String[source.EventTypes.length];
            for (int i = 0; i < source.EventTypes.length; i++) {
                this.EventTypes[i] = new String(source.EventTypes[i]);
            }
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new Long(source.NamespaceId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamArraySimple(map, prefix + "EventTypes.", this.EventTypes);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);

    }
}

