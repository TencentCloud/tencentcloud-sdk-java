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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Vpc extends AbstractModel{

    /**
    * Vpc名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * VpcId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 是否为默认VPC
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
     * Get Vpc名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcName Vpc名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set Vpc名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcName Vpc名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get VpcId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId VpcId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VpcId
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId VpcId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 是否为默认VPC
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDefault 是否为默认VPC
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否为默认VPC
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDefault 是否为默认VPC
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);

    }
}

