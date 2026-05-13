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
    * <p>配置Id</p>
    */
    @SerializedName("ResourceConfigId")
    @Expose
    private Long ResourceConfigId;

    /**
    * <p>Resource</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private Resource Resource;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>是否默认配置,DEFAULT,BACKUP</p>
    */
    @SerializedName("IsDefault")
    @Expose
    private String IsDefault;

    /**
    * <p>该类型剩余</p>
    */
    @SerializedName("MaxResourceNum")
    @Expose
    private Long MaxResourceNum;

    /**
    * <p>支持的包销时长</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrepaidUnderwritePeriods")
    @Expose
    private Long [] PrepaidUnderwritePeriods;

    /**
    * <p>配额数量</p>
    */
    @SerializedName("QuotaNum")
    @Expose
    private Long QuotaNum;

    /**
    * <p>配额单位</p>
    */
    @SerializedName("QuotaUnit")
    @Expose
    private String QuotaUnit;

    /**
     * Get <p>配置Id</p> 
     * @return ResourceConfigId <p>配置Id</p>
     */
    public Long getResourceConfigId() {
        return this.ResourceConfigId;
    }

    /**
     * Set <p>配置Id</p>
     * @param ResourceConfigId <p>配置Id</p>
     */
    public void setResourceConfigId(Long ResourceConfigId) {
        this.ResourceConfigId = ResourceConfigId;
    }

    /**
     * Get <p>Resource</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource <p>Resource</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Resource getResource() {
        return this.Resource;
    }

    /**
     * Set <p>Resource</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource <p>Resource</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(Resource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>是否默认配置,DEFAULT,BACKUP</p> 
     * @return IsDefault <p>是否默认配置,DEFAULT,BACKUP</p>
     */
    public String getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set <p>是否默认配置,DEFAULT,BACKUP</p>
     * @param IsDefault <p>是否默认配置,DEFAULT,BACKUP</p>
     */
    public void setIsDefault(String IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get <p>该类型剩余</p> 
     * @return MaxResourceNum <p>该类型剩余</p>
     */
    public Long getMaxResourceNum() {
        return this.MaxResourceNum;
    }

    /**
     * Set <p>该类型剩余</p>
     * @param MaxResourceNum <p>该类型剩余</p>
     */
    public void setMaxResourceNum(Long MaxResourceNum) {
        this.MaxResourceNum = MaxResourceNum;
    }

    /**
     * Get <p>支持的包销时长</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrepaidUnderwritePeriods <p>支持的包销时长</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getPrepaidUnderwritePeriods() {
        return this.PrepaidUnderwritePeriods;
    }

    /**
     * Set <p>支持的包销时长</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrepaidUnderwritePeriods <p>支持的包销时长</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrepaidUnderwritePeriods(Long [] PrepaidUnderwritePeriods) {
        this.PrepaidUnderwritePeriods = PrepaidUnderwritePeriods;
    }

    /**
     * Get <p>配额数量</p> 
     * @return QuotaNum <p>配额数量</p>
     */
    public Long getQuotaNum() {
        return this.QuotaNum;
    }

    /**
     * Set <p>配额数量</p>
     * @param QuotaNum <p>配额数量</p>
     */
    public void setQuotaNum(Long QuotaNum) {
        this.QuotaNum = QuotaNum;
    }

    /**
     * Get <p>配额单位</p> 
     * @return QuotaUnit <p>配额单位</p>
     */
    public String getQuotaUnit() {
        return this.QuotaUnit;
    }

    /**
     * Set <p>配额单位</p>
     * @param QuotaUnit <p>配额单位</p>
     */
    public void setQuotaUnit(String QuotaUnit) {
        this.QuotaUnit = QuotaUnit;
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
        if (source.QuotaNum != null) {
            this.QuotaNum = new Long(source.QuotaNum);
        }
        if (source.QuotaUnit != null) {
            this.QuotaUnit = new String(source.QuotaUnit);
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
        this.setParamSimple(map, prefix + "QuotaNum", this.QuotaNum);
        this.setParamSimple(map, prefix + "QuotaUnit", this.QuotaUnit);

    }
}

