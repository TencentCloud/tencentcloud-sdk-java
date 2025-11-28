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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeTask extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 组件名称
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * 关联资源
    */
    @SerializedName("RelatedResources")
    @Expose
    private String [] RelatedResources;

    /**
    * 升级影响
    */
    @SerializedName("UpgradeImpact")
    @Expose
    private String UpgradeImpact;

    /**
    * 预计开始时间
    */
    @SerializedName("PlanedStartAt")
    @Expose
    private String PlanedStartAt;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
     * Get 任务ID 
     * @return ID 任务ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 任务ID
     * @param ID 任务ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 任务名称 
     * @return Name 任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名称
     * @param Name 任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 组件名称 
     * @return Component 组件名称
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set 组件名称
     * @param Component 组件名称
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get 关联资源 
     * @return RelatedResources 关联资源
     */
    public String [] getRelatedResources() {
        return this.RelatedResources;
    }

    /**
     * Set 关联资源
     * @param RelatedResources 关联资源
     */
    public void setRelatedResources(String [] RelatedResources) {
        this.RelatedResources = RelatedResources;
    }

    /**
     * Get 升级影响 
     * @return UpgradeImpact 升级影响
     */
    public String getUpgradeImpact() {
        return this.UpgradeImpact;
    }

    /**
     * Set 升级影响
     * @param UpgradeImpact 升级影响
     */
    public void setUpgradeImpact(String UpgradeImpact) {
        this.UpgradeImpact = UpgradeImpact;
    }

    /**
     * Get 预计开始时间 
     * @return PlanedStartAt 预计开始时间
     */
    public String getPlanedStartAt() {
        return this.PlanedStartAt;
    }

    /**
     * Set 预计开始时间
     * @param PlanedStartAt 预计开始时间
     */
    public void setPlanedStartAt(String PlanedStartAt) {
        this.PlanedStartAt = PlanedStartAt;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public UpgradeTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeTask(UpgradeTask source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Component != null) {
            this.Component = new String(source.Component);
        }
        if (source.RelatedResources != null) {
            this.RelatedResources = new String[source.RelatedResources.length];
            for (int i = 0; i < source.RelatedResources.length; i++) {
                this.RelatedResources[i] = new String(source.RelatedResources[i]);
            }
        }
        if (source.UpgradeImpact != null) {
            this.UpgradeImpact = new String(source.UpgradeImpact);
        }
        if (source.PlanedStartAt != null) {
            this.PlanedStartAt = new String(source.PlanedStartAt);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamArraySimple(map, prefix + "RelatedResources.", this.RelatedResources);
        this.setParamSimple(map, prefix + "UpgradeImpact", this.UpgradeImpact);
        this.setParamSimple(map, prefix + "PlanedStartAt", this.PlanedStartAt);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);

    }
}

