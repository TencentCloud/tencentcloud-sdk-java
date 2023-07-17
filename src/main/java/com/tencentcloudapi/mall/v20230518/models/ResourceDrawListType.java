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
package com.tencentcloudapi.mall.v20230518.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceDrawListType extends AbstractModel{

    /**
    * 记录id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 资源记录id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * 资源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 本订单资源序列号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexId")
    @Expose
    private String IndexId;

    /**
    * 客户的Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 大订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BigDealId")
    @Expose
    private String BigDealId;

    /**
    * 小订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmallOrderId")
    @Expose
    private String SmallOrderId;

    /**
    * 资源创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceNewStartTime")
    @Expose
    private String ResourceNewStartTime;

    /**
    * 资源到期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceNewEndTime")
    @Expose
    private String ResourceNewEndTime;

    /**
    * 资源状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceStatus")
    @Expose
    private Long ResourceStatus;

    /**
    * 本记录状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 项目类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
     * Get 记录id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 记录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 记录id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 记录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 资源记录id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowId 资源记录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 资源记录id
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowId 资源记录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 资源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 资源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 资源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 本订单资源序列号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexId 本订单资源序列号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexId() {
        return this.IndexId;
    }

    /**
     * Set 本订单资源序列号
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexId 本订单资源序列号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexId(String IndexId) {
        this.IndexId = IndexId;
    }

    /**
     * Get 客户的Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 客户的Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 客户的Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 客户的Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 大订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BigDealId 大订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBigDealId() {
        return this.BigDealId;
    }

    /**
     * Set 大订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param BigDealId 大订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBigDealId(String BigDealId) {
        this.BigDealId = BigDealId;
    }

    /**
     * Get 小订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmallOrderId 小订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSmallOrderId() {
        return this.SmallOrderId;
    }

    /**
     * Set 小订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmallOrderId 小订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmallOrderId(String SmallOrderId) {
        this.SmallOrderId = SmallOrderId;
    }

    /**
     * Get 资源创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceNewStartTime 资源创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceNewStartTime() {
        return this.ResourceNewStartTime;
    }

    /**
     * Set 资源创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceNewStartTime 资源创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceNewStartTime(String ResourceNewStartTime) {
        this.ResourceNewStartTime = ResourceNewStartTime;
    }

    /**
     * Get 资源到期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceNewEndTime 资源到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceNewEndTime() {
        return this.ResourceNewEndTime;
    }

    /**
     * Set 资源到期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceNewEndTime 资源到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceNewEndTime(String ResourceNewEndTime) {
        this.ResourceNewEndTime = ResourceNewEndTime;
    }

    /**
     * Get 资源状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceStatus 资源状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set 资源状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceStatus 资源状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceStatus(Long ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    /**
     * Get 本记录状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 本记录状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 本记录状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 本记录状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 项目类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 项目类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 项目类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 项目类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    public ResourceDrawListType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceDrawListType(ResourceDrawListType source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.IndexId != null) {
            this.IndexId = new String(source.IndexId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.BigDealId != null) {
            this.BigDealId = new String(source.BigDealId);
        }
        if (source.SmallOrderId != null) {
            this.SmallOrderId = new String(source.SmallOrderId);
        }
        if (source.ResourceNewStartTime != null) {
            this.ResourceNewStartTime = new String(source.ResourceNewStartTime);
        }
        if (source.ResourceNewEndTime != null) {
            this.ResourceNewEndTime = new String(source.ResourceNewEndTime);
        }
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new Long(source.ResourceStatus);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "IndexId", this.IndexId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "BigDealId", this.BigDealId);
        this.setParamSimple(map, prefix + "SmallOrderId", this.SmallOrderId);
        this.setParamSimple(map, prefix + "ResourceNewStartTime", this.ResourceNewStartTime);
        this.setParamSimple(map, prefix + "ResourceNewEndTime", this.ResourceNewEndTime);
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);

    }
}

