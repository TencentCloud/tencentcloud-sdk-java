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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExclusiveInstance extends AbstractModel {

    /**
    * 配置中心类型[Registration、Configuration]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CenterType")
    @Expose
    private String CenterType;

    /**
    * 实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例类型[Polaris]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例地域id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 实例命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceNamespaceId")
    @Expose
    private String InstanceNamespaceId;

    /**
     * Get 配置中心类型[Registration、Configuration]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CenterType 配置中心类型[Registration、Configuration]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCenterType() {
        return this.CenterType;
    }

    /**
     * Set 配置中心类型[Registration、Configuration]
注意：此字段可能返回 null，表示取不到有效值。
     * @param CenterType 配置中心类型[Registration、Configuration]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCenterType(String CenterType) {
        this.CenterType = CenterType;
    }

    /**
     * Get 实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例类型[Polaris]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 实例类型[Polaris]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型[Polaris]
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 实例类型[Polaris]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例地域id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId 实例地域id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 实例地域id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 实例地域id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 实例命名空间ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceNamespaceId 实例命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceNamespaceId() {
        return this.InstanceNamespaceId;
    }

    /**
     * Set 实例命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceNamespaceId 实例命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceNamespaceId(String InstanceNamespaceId) {
        this.InstanceNamespaceId = InstanceNamespaceId;
    }

    public ExclusiveInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExclusiveInstance(ExclusiveInstance source) {
        if (source.CenterType != null) {
            this.CenterType = new String(source.CenterType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.InstanceNamespaceId != null) {
            this.InstanceNamespaceId = new String(source.InstanceNamespaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CenterType", this.CenterType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "InstanceNamespaceId", this.InstanceNamespaceId);

    }
}

