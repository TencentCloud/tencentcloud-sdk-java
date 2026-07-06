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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelChargingInfo extends AbstractModel {

    /**
    * 计费类型。取值：Uniform（统一计费）、Tiered（阶梯计费）。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 计费名称，阶梯计费时表示区间标识，统一计费为空。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 计费场景，用于区分同一产品不同功能的计费。
    */
    @SerializedName("Scenario")
    @Expose
    private String Scenario;

    /**
    * 计费条目列表，顺序即前端展示顺序。
    */
    @SerializedName("ChargingItems")
    @Expose
    private ModelChargingItem [] ChargingItems;

    /**
    * 计费单位。取值：TOKEN（词元）、COUNT（次）、CREDIT（积分）、PICTURE（张）。
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
    * 计费参考链接。
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
     * Get 计费类型。取值：Uniform（统一计费）、Tiered（阶梯计费）。 
     * @return Type 计费类型。取值：Uniform（统一计费）、Tiered（阶梯计费）。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 计费类型。取值：Uniform（统一计费）、Tiered（阶梯计费）。
     * @param Type 计费类型。取值：Uniform（统一计费）、Tiered（阶梯计费）。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 计费名称，阶梯计费时表示区间标识，统一计费为空。 
     * @return Name 计费名称，阶梯计费时表示区间标识，统一计费为空。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 计费名称，阶梯计费时表示区间标识，统一计费为空。
     * @param Name 计费名称，阶梯计费时表示区间标识，统一计费为空。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 计费场景，用于区分同一产品不同功能的计费。 
     * @return Scenario 计费场景，用于区分同一产品不同功能的计费。
     */
    public String getScenario() {
        return this.Scenario;
    }

    /**
     * Set 计费场景，用于区分同一产品不同功能的计费。
     * @param Scenario 计费场景，用于区分同一产品不同功能的计费。
     */
    public void setScenario(String Scenario) {
        this.Scenario = Scenario;
    }

    /**
     * Get 计费条目列表，顺序即前端展示顺序。 
     * @return ChargingItems 计费条目列表，顺序即前端展示顺序。
     */
    public ModelChargingItem [] getChargingItems() {
        return this.ChargingItems;
    }

    /**
     * Set 计费条目列表，顺序即前端展示顺序。
     * @param ChargingItems 计费条目列表，顺序即前端展示顺序。
     */
    public void setChargingItems(ModelChargingItem [] ChargingItems) {
        this.ChargingItems = ChargingItems;
    }

    /**
     * Get 计费单位。取值：TOKEN（词元）、COUNT（次）、CREDIT（积分）、PICTURE（张）。 
     * @return ChargeUnit 计费单位。取值：TOKEN（词元）、COUNT（次）、CREDIT（积分）、PICTURE（张）。
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     * Set 计费单位。取值：TOKEN（词元）、COUNT（次）、CREDIT（积分）、PICTURE（张）。
     * @param ChargeUnit 计费单位。取值：TOKEN（词元）、COUNT（次）、CREDIT（积分）、PICTURE（张）。
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    /**
     * Get 计费参考链接。 
     * @return Reference 计费参考链接。
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set 计费参考链接。
     * @param Reference 计费参考链接。
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    public ModelChargingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelChargingInfo(ModelChargingInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Scenario != null) {
            this.Scenario = new String(source.Scenario);
        }
        if (source.ChargingItems != null) {
            this.ChargingItems = new ModelChargingItem[source.ChargingItems.length];
            for (int i = 0; i < source.ChargingItems.length; i++) {
                this.ChargingItems[i] = new ModelChargingItem(source.ChargingItems[i]);
            }
        }
        if (source.ChargeUnit != null) {
            this.ChargeUnit = new String(source.ChargeUnit);
        }
        if (source.Reference != null) {
            this.Reference = new String(source.Reference);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Scenario", this.Scenario);
        this.setParamArrayObj(map, prefix + "ChargingItems.", this.ChargingItems);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);
        this.setParamSimple(map, prefix + "Reference", this.Reference);

    }
}

