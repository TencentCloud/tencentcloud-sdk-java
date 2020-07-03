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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInstance extends AbstractModel{

    /**
    * 地域名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 地域ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 地域状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 地域特性开关(按照JSON的形式返回所有属性)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FeatureGates")
    @Expose
    private String FeatureGates;

    /**
    * 地域简称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 地域白名单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 地域名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionName 地域名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionName 地域名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 地域ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 地域状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 地域状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 地域状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 地域状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 地域特性开关(按照JSON的形式返回所有属性)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FeatureGates 地域特性开关(按照JSON的形式返回所有属性)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFeatureGates() {
        return this.FeatureGates;
    }

    /**
     * Set 地域特性开关(按照JSON的形式返回所有属性)
注意：此字段可能返回 null，表示取不到有效值。
     * @param FeatureGates 地域特性开关(按照JSON的形式返回所有属性)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFeatureGates(String FeatureGates) {
        this.FeatureGates = FeatureGates;
    }

    /**
     * Get 地域简称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alias 地域简称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 地域简称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alias 地域简称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 地域白名单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 地域白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 地域白名单
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 地域白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FeatureGates", this.FeatureGates);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

