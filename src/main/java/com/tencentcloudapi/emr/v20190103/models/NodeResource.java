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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeResource extends AbstractModel {

    /**
    * 配置Id
    */
    @SerializedName("ResourceConfigId")
    @Expose
    private Long ResourceConfigId;

    /**
    * Resource
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private Resource Resource;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 是否默认配置,DEFAULT,BACKUP
    */
    @SerializedName("IsDefault")
    @Expose
    private String IsDefault;

    /**
    * 该类型剩余
    */
    @SerializedName("MaxResourceNum")
    @Expose
    private Long MaxResourceNum;

    /**
    * 支持的包销时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrepaidUnderwritePeriods")
    @Expose
    private Long [] PrepaidUnderwritePeriods;

    /**
     * Get 配置Id 
     * @return ResourceConfigId 配置Id
     */
    public Long getResourceConfigId() {
        return this.ResourceConfigId;
    }

    /**
     * Set 配置Id
     * @param ResourceConfigId 配置Id
     */
    public void setResourceConfigId(Long ResourceConfigId) {
        this.ResourceConfigId = ResourceConfigId;
    }

    /**
     * Get Resource
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource Resource
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Resource getResource() {
        return this.Resource;
    }

    /**
     * Set Resource
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource Resource
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(Resource Resource) {
        this.Resource = Resource;
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
     * Get 是否默认配置,DEFAULT,BACKUP 
     * @return IsDefault 是否默认配置,DEFAULT,BACKUP
     */
    public String getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否默认配置,DEFAULT,BACKUP
     * @param IsDefault 是否默认配置,DEFAULT,BACKUP
     */
    public void setIsDefault(String IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 该类型剩余 
     * @return MaxResourceNum 该类型剩余
     */
    public Long getMaxResourceNum() {
        return this.MaxResourceNum;
    }

    /**
     * Set 该类型剩余
     * @param MaxResourceNum 该类型剩余
     */
    public void setMaxResourceNum(Long MaxResourceNum) {
        this.MaxResourceNum = MaxResourceNum;
    }

    /**
     * Get 支持的包销时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrepaidUnderwritePeriods 支持的包销时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getPrepaidUnderwritePeriods() {
        return this.PrepaidUnderwritePeriods;
    }

    /**
     * Set 支持的包销时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrepaidUnderwritePeriods 支持的包销时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrepaidUnderwritePeriods(Long [] PrepaidUnderwritePeriods) {
        this.PrepaidUnderwritePeriods = PrepaidUnderwritePeriods;
    }

    public NodeResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeResource(NodeResource source) {
        if (source.ResourceConfigId != null) {
            this.ResourceConfigId = new Long(source.ResourceConfigId);
        }
        if (source.Resource != null) {
            this.Resource = new Resource(source.Resource);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new String(source.IsDefault);
        }
        if (source.MaxResourceNum != null) {
            this.MaxResourceNum = new Long(source.MaxResourceNum);
        }
        if (source.PrepaidUnderwritePeriods != null) {
            this.PrepaidUnderwritePeriods = new Long[source.PrepaidUnderwritePeriods.length];
            for (int i = 0; i < source.PrepaidUnderwritePeriods.length; i++) {
                this.PrepaidUnderwritePeriods[i] = new Long(source.PrepaidUnderwritePeriods[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceConfigId", this.ResourceConfigId);
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "MaxResourceNum", this.MaxResourceNum);
        this.setParamArraySimple(map, prefix + "PrepaidUnderwritePeriods.", this.PrepaidUnderwritePeriods);

    }
}

