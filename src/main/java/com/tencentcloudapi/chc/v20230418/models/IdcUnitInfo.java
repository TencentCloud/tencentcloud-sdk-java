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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IdcUnitInfo extends AbstractModel {

    /**
    * 机房管理单元地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 机房经理
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 联系电话
    */
    @SerializedName("TelNumber")
    @Expose
    private String TelNumber;

    /**
    * 资产管理员
    */
    @SerializedName("AssetManager")
    @Expose
    private String AssetManager;

    /**
    * 资产管理员电话
    */
    @SerializedName("AssetManagerTelNumber")
    @Expose
    private String AssetManagerTelNumber;

    /**
     * Get 机房管理单元地址 
     * @return Address 机房管理单元地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 机房管理单元地址
     * @param Address 机房管理单元地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 机房经理 
     * @return Operator 机房经理
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 机房经理
     * @param Operator 机房经理
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 联系电话 
     * @return TelNumber 联系电话
     */
    public String getTelNumber() {
        return this.TelNumber;
    }

    /**
     * Set 联系电话
     * @param TelNumber 联系电话
     */
    public void setTelNumber(String TelNumber) {
        this.TelNumber = TelNumber;
    }

    /**
     * Get 资产管理员 
     * @return AssetManager 资产管理员
     */
    public String getAssetManager() {
        return this.AssetManager;
    }

    /**
     * Set 资产管理员
     * @param AssetManager 资产管理员
     */
    public void setAssetManager(String AssetManager) {
        this.AssetManager = AssetManager;
    }

    /**
     * Get 资产管理员电话 
     * @return AssetManagerTelNumber 资产管理员电话
     */
    public String getAssetManagerTelNumber() {
        return this.AssetManagerTelNumber;
    }

    /**
     * Set 资产管理员电话
     * @param AssetManagerTelNumber 资产管理员电话
     */
    public void setAssetManagerTelNumber(String AssetManagerTelNumber) {
        this.AssetManagerTelNumber = AssetManagerTelNumber;
    }

    public IdcUnitInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IdcUnitInfo(IdcUnitInfo source) {
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.TelNumber != null) {
            this.TelNumber = new String(source.TelNumber);
        }
        if (source.AssetManager != null) {
            this.AssetManager = new String(source.AssetManager);
        }
        if (source.AssetManagerTelNumber != null) {
            this.AssetManagerTelNumber = new String(source.AssetManagerTelNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "TelNumber", this.TelNumber);
        this.setParamSimple(map, prefix + "AssetManager", this.AssetManager);
        this.setParamSimple(map, prefix + "AssetManagerTelNumber", this.AssetManagerTelNumber);

    }
}

