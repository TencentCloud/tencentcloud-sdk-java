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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebhookTrigger extends AbstractModel{

    /**
    * 触发器名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 触发器目标
    */
    @SerializedName("Targets")
    @Expose
    private WebhookTarget [] Targets;

    /**
    * 触发动作
    */
    @SerializedName("EventTypes")
    @Expose
    private String [] EventTypes;

    /**
    * 触发规则
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * 启用触发器
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 触发器Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 触发器描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 触发器所属命名空间 Id
    */
    @SerializedName("NamespaceId")
    @Expose
    private Long NamespaceId;

    /**
     * Get 触发器名称 
     * @return Name 触发器名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 触发器名称
     * @param Name 触发器名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 触发器目标 
     * @return Targets 触发器目标
     */
    public WebhookTarget [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 触发器目标
     * @param Targets 触发器目标
     */
    public void setTargets(WebhookTarget [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get 触发动作 
     * @return EventTypes 触发动作
     */
    public String [] getEventTypes() {
        return this.EventTypes;
    }

    /**
     * Set 触发动作
     * @param EventTypes 触发动作
     */
    public void setEventTypes(String [] EventTypes) {
        this.EventTypes = EventTypes;
    }

    /**
     * Get 触发规则 
     * @return Condition 触发规则
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set 触发规则
     * @param Condition 触发规则
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 启用触发器 
     * @return Enabled 启用触发器
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 启用触发器
     * @param Enabled 启用触发器
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 触发器Id 
     * @return Id 触发器Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 触发器Id
     * @param Id 触发器Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 触发器描述 
     * @return Description 触发器描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 触发器描述
     * @param Description 触发器描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 触发器所属命名空间 Id 
     * @return NamespaceId 触发器所属命名空间 Id
     */
    public Long getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 触发器所属命名空间 Id
     * @param NamespaceId 触发器所属命名空间 Id
     */
    public void setNamespaceId(Long NamespaceId) {
        this.NamespaceId = NamespaceId;
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

    }
}

