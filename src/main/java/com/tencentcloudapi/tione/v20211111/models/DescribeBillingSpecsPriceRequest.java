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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillingSpecsPriceRequest extends AbstractModel {

    /**
    * 询价参数，支持批量询价
    */
    @SerializedName("SpecsParam")
    @Expose
    private SpecUnit [] SpecsParam;

    /**
    * <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
     * Get 询价参数，支持批量询价 
     * @return SpecsParam 询价参数，支持批量询价
     */
    public SpecUnit [] getSpecsParam() {
        return this.SpecsParam;
    }

    /**
     * Set 询价参数，支持批量询价
     * @param SpecsParam 询价参数，支持批量询价
     */
    public void setSpecsParam(SpecUnit [] SpecsParam) {
        this.SpecsParam = SpecsParam;
    }

    /**
     * Get <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p> 
     * @return TiProjectId <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     * @param TiProjectId <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    public DescribeBillingSpecsPriceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillingSpecsPriceRequest(DescribeBillingSpecsPriceRequest source) {
        if (source.SpecsParam != null) {
            this.SpecsParam = new SpecUnit[source.SpecsParam.length];
            for (int i = 0; i < source.SpecsParam.length; i++) {
                this.SpecsParam[i] = new SpecUnit(source.SpecsParam[i]);
            }
        }
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SpecsParam.", this.SpecsParam);
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);

    }
}

