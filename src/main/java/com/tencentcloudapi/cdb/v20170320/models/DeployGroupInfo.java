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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployGroupInfo extends AbstractModel {

    /**
    * 置放群组 ID。
    */
    @SerializedName("DeployGroupId")
    @Expose
    private String DeployGroupId;

    /**
    * 置放群组名称。
    */
    @SerializedName("DeployGroupName")
    @Expose
    private String DeployGroupName;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 置放群组实例配额，表示一个置放群组中可容纳的最大实例数目。
    */
    @SerializedName("Quota")
    @Expose
    private Long Quota;

    /**
    * 置放群组亲和性策略，目前仅支持策略1，即在物理机纬度打散实例的分布。
    */
    @SerializedName("Affinity")
    @Expose
    private String Affinity;

    /**
    * 置放群组亲和性策略1中，同台物理机上同个置放群组实例的限制个数。
    */
    @SerializedName("LimitNum")
    @Expose
    private Long LimitNum;

    /**
    * 置放群组详细信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 置放群组物理机型属性。
    */
    @SerializedName("DevClass")
    @Expose
    private String DevClass;

    /**
     * Get 置放群组 ID。 
     * @return DeployGroupId 置放群组 ID。
     */
    public String getDeployGroupId() {
        return this.DeployGroupId;
    }

    /**
     * Set 置放群组 ID。
     * @param DeployGroupId 置放群组 ID。
     */
    public void setDeployGroupId(String DeployGroupId) {
        this.DeployGroupId = DeployGroupId;
    }

    /**
     * Get 置放群组名称。 
     * @return DeployGroupName 置放群组名称。
     */
    public String getDeployGroupName() {
        return this.DeployGroupName;
    }

    /**
     * Set 置放群组名称。
     * @param DeployGroupName 置放群组名称。
     */
    public void setDeployGroupName(String DeployGroupName) {
        this.DeployGroupName = DeployGroupName;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 置放群组实例配额，表示一个置放群组中可容纳的最大实例数目。 
     * @return Quota 置放群组实例配额，表示一个置放群组中可容纳的最大实例数目。
     */
    public Long getQuota() {
        return this.Quota;
    }

    /**
     * Set 置放群组实例配额，表示一个置放群组中可容纳的最大实例数目。
     * @param Quota 置放群组实例配额，表示一个置放群组中可容纳的最大实例数目。
     */
    public void setQuota(Long Quota) {
        this.Quota = Quota;
    }

    /**
     * Get 置放群组亲和性策略，目前仅支持策略1，即在物理机纬度打散实例的分布。 
     * @return Affinity 置放群组亲和性策略，目前仅支持策略1，即在物理机纬度打散实例的分布。
     */
    public String getAffinity() {
        return this.Affinity;
    }

    /**
     * Set 置放群组亲和性策略，目前仅支持策略1，即在物理机纬度打散实例的分布。
     * @param Affinity 置放群组亲和性策略，目前仅支持策略1，即在物理机纬度打散实例的分布。
     */
    public void setAffinity(String Affinity) {
        this.Affinity = Affinity;
    }

    /**
     * Get 置放群组亲和性策略1中，同台物理机上同个置放群组实例的限制个数。 
     * @return LimitNum 置放群组亲和性策略1中，同台物理机上同个置放群组实例的限制个数。
     */
    public Long getLimitNum() {
        return this.LimitNum;
    }

    /**
     * Set 置放群组亲和性策略1中，同台物理机上同个置放群组实例的限制个数。
     * @param LimitNum 置放群组亲和性策略1中，同台物理机上同个置放群组实例的限制个数。
     */
    public void setLimitNum(Long LimitNum) {
        this.LimitNum = LimitNum;
    }

    /**
     * Get 置放群组详细信息。 
     * @return Description 置放群组详细信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 置放群组详细信息。
     * @param Description 置放群组详细信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 置放群组物理机型属性。 
     * @return DevClass 置放群组物理机型属性。
     */
    public String getDevClass() {
        return this.DevClass;
    }

    /**
     * Set 置放群组物理机型属性。
     * @param DevClass 置放群组物理机型属性。
     */
    public void setDevClass(String DevClass) {
        this.DevClass = DevClass;
    }

    public DeployGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployGroupInfo(DeployGroupInfo source) {
        if (source.DeployGroupId != null) {
            this.DeployGroupId = new String(source.DeployGroupId);
        }
        if (source.DeployGroupName != null) {
            this.DeployGroupName = new String(source.DeployGroupName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Quota != null) {
            this.Quota = new Long(source.Quota);
        }
        if (source.Affinity != null) {
            this.Affinity = new String(source.Affinity);
        }
        if (source.LimitNum != null) {
            this.LimitNum = new Long(source.LimitNum);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DevClass != null) {
            this.DevClass = new String(source.DevClass);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployGroupId", this.DeployGroupId);
        this.setParamSimple(map, prefix + "DeployGroupName", this.DeployGroupName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Quota", this.Quota);
        this.setParamSimple(map, prefix + "Affinity", this.Affinity);
        this.setParamSimple(map, prefix + "LimitNum", this.LimitNum);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DevClass", this.DevClass);

    }
}

