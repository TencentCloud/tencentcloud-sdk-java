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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceItem extends AbstractModel {

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据库类型，如 mysql、cynosdb、mariadb、dcdb、mongodb、postgres、redis、dbbrain-mysql、tdstore。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 地域英文ID。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 集群ID，仅集群类产品返回。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 引擎版本。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 实例状态，1表示运行中。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例到期时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据库类型，如 mysql、cynosdb、mariadb、dcdb、mongodb、postgres、redis、dbbrain-mysql、tdstore。 
     * @return Product 数据库类型，如 mysql、cynosdb、mariadb、dcdb、mongodb、postgres、redis、dbbrain-mysql、tdstore。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 数据库类型，如 mysql、cynosdb、mariadb、dcdb、mongodb、postgres、redis、dbbrain-mysql、tdstore。
     * @param Product 数据库类型，如 mysql、cynosdb、mariadb、dcdb、mongodb、postgres、redis、dbbrain-mysql、tdstore。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 地域英文ID。 
     * @return Region 地域英文ID。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域英文ID。
     * @param Region 地域英文ID。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 集群ID，仅集群类产品返回。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 集群ID，仅集群类产品返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID，仅集群类产品返回。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群ID，仅集群类产品返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 引擎版本。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineVersion 引擎版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 引擎版本。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineVersion 引擎版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get 实例状态，1表示运行中。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 实例状态，1表示运行中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态，1表示运行中。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 实例状态，1表示运行中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 实例创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 实例创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 实例创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例到期时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadlineTime 实例到期时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set 实例到期时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadlineTime 实例到期时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    public InstanceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceItem(InstanceItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DeadlineTime != null) {
            this.DeadlineTime = new String(source.DeadlineTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);

    }
}

