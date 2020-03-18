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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpFilter extends AbstractModel{

    /**
    * IP黑白名单开关，on或off。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * IP黑白名单类型，whitelist或blacklist。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * IP黑白名单列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
     * Get IP黑白名单开关，on或off。 
     * @return Switch IP黑白名单开关，on或off。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set IP黑白名单开关，on或off。
     * @param Switch IP黑白名单开关，on或off。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get IP黑白名单类型，whitelist或blacklist。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterType IP黑白名单类型，whitelist或blacklist。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set IP黑白名单类型，whitelist或blacklist。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterType IP黑白名单类型，whitelist或blacklist。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get IP黑白名单列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Filters IP黑白名单列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set IP黑白名单列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Filters IP黑白名单列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamArraySimple(map, prefix + "Filters.", this.Filters);

    }
}

