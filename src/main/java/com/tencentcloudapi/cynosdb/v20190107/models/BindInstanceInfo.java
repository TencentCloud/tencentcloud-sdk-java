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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindInstanceInfo extends AbstractModel{

    /**
    * 绑定的集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 绑定的实例所在的地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * 绑定的实例类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 绑定集群下的实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtendIds")
    @Expose
    private String [] ExtendIds;

    /**
     * Get 绑定的集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 绑定的集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 绑定的集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 绑定的集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 绑定的实例所在的地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceRegion 绑定的实例所在的地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set 绑定的实例所在的地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceRegion 绑定的实例所在的地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * Get 绑定的实例类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 绑定的实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 绑定的实例类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 绑定的实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 绑定集群下的实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtendIds 绑定集群下的实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getExtendIds() {
        return this.ExtendIds;
    }

    /**
     * Set 绑定集群下的实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtendIds 绑定集群下的实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtendIds(String [] ExtendIds) {
        this.ExtendIds = ExtendIds;
    }

    public BindInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindInstanceInfo(BindInstanceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceRegion != null) {
            this.InstanceRegion = new String(source.InstanceRegion);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.ExtendIds != null) {
            this.ExtendIds = new String[source.ExtendIds.length];
            for (int i = 0; i < source.ExtendIds.length; i++) {
                this.ExtendIds[i] = new String(source.ExtendIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArraySimple(map, prefix + "ExtendIds.", this.ExtendIds);

    }
}

