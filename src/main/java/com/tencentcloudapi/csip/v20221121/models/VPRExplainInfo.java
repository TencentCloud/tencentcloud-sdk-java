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

public class VPRExplainInfo extends AbstractModel {

    /**
    * <p>漏洞情报</p>
    */
    @SerializedName("VulIntel")
    @Expose
    private VPRExplainDimension [] VulIntel;

    /**
    * <p>资产上下文</p>
    */
    @SerializedName("AssetContext")
    @Expose
    private VPRExplainDimension [] AssetContext;

    /**
     * Get <p>漏洞情报</p> 
     * @return VulIntel <p>漏洞情报</p>
     */
    public VPRExplainDimension [] getVulIntel() {
        return this.VulIntel;
    }

    /**
     * Set <p>漏洞情报</p>
     * @param VulIntel <p>漏洞情报</p>
     */
    public void setVulIntel(VPRExplainDimension [] VulIntel) {
        this.VulIntel = VulIntel;
    }

    /**
     * Get <p>资产上下文</p> 
     * @return AssetContext <p>资产上下文</p>
     */
    public VPRExplainDimension [] getAssetContext() {
        return this.AssetContext;
    }

    /**
     * Set <p>资产上下文</p>
     * @param AssetContext <p>资产上下文</p>
     */
    public void setAssetContext(VPRExplainDimension [] AssetContext) {
        this.AssetContext = AssetContext;
    }

    public VPRExplainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VPRExplainInfo(VPRExplainInfo source) {
        if (source.VulIntel != null) {
            this.VulIntel = new VPRExplainDimension[source.VulIntel.length];
            for (int i = 0; i < source.VulIntel.length; i++) {
                this.VulIntel[i] = new VPRExplainDimension(source.VulIntel[i]);
            }
        }
        if (source.AssetContext != null) {
            this.AssetContext = new VPRExplainDimension[source.AssetContext.length];
            for (int i = 0; i < source.AssetContext.length; i++) {
                this.AssetContext[i] = new VPRExplainDimension(source.AssetContext[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VulIntel.", this.VulIntel);
        this.setParamArrayObj(map, prefix + "AssetContext.", this.AssetContext);

    }
}

