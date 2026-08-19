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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetRiskContent extends AbstractModel {

    /**
    * <p>风险引擎</p>
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * <p>风险引擎下具体风险分布</p>
    */
    @SerializedName("Risks")
    @Expose
    private AssetRiskInfo [] Risks;

    /**
    * <p>资产ID</p>
    */
    @SerializedName("AssetRID")
    @Expose
    private String AssetRID;

    /**
     * Get <p>风险引擎</p> 
     * @return EngineType <p>风险引擎</p>
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set <p>风险引擎</p>
     * @param EngineType <p>风险引擎</p>
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get <p>风险引擎下具体风险分布</p> 
     * @return Risks <p>风险引擎下具体风险分布</p>
     */
    public AssetRiskInfo [] getRisks() {
        return this.Risks;
    }

    /**
     * Set <p>风险引擎下具体风险分布</p>
     * @param Risks <p>风险引擎下具体风险分布</p>
     */
    public void setRisks(AssetRiskInfo [] Risks) {
        this.Risks = Risks;
    }

    /**
     * Get <p>资产ID</p> 
     * @return AssetRID <p>资产ID</p>
     */
    public String getAssetRID() {
        return this.AssetRID;
    }

    /**
     * Set <p>资产ID</p>
     * @param AssetRID <p>资产ID</p>
     */
    public void setAssetRID(String AssetRID) {
        this.AssetRID = AssetRID;
    }

    public AssetRiskContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetRiskContent(AssetRiskContent source) {
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.Risks != null) {
            this.Risks = new AssetRiskInfo[source.Risks.length];
            for (int i = 0; i < source.Risks.length; i++) {
                this.Risks[i] = new AssetRiskInfo(source.Risks[i]);
            }
        }
        if (source.AssetRID != null) {
            this.AssetRID = new String(source.AssetRID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamArrayObj(map, prefix + "Risks.", this.Risks);
        this.setParamSimple(map, prefix + "AssetRID", this.AssetRID);

    }
}

