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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Province extends AbstractModel {

    /**
    * 省份Id
    */
    @SerializedName("ProvinceId")
    @Expose
    private String ProvinceId;

    /**
    * 省份名称
    */
    @SerializedName("ProvinceName")
    @Expose
    private String ProvinceName;

    /**
     * Get 省份Id 
     * @return ProvinceId 省份Id
     */
    public String getProvinceId() {
        return this.ProvinceId;
    }

    /**
     * Set 省份Id
     * @param ProvinceId 省份Id
     */
    public void setProvinceId(String ProvinceId) {
        this.ProvinceId = ProvinceId;
    }

    /**
     * Get 省份名称 
     * @return ProvinceName 省份名称
     */
    public String getProvinceName() {
        return this.ProvinceName;
    }

    /**
     * Set 省份名称
     * @param ProvinceName 省份名称
     */
    public void setProvinceName(String ProvinceName) {
        this.ProvinceName = ProvinceName;
    }

    public Province() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Province(Province source) {
        if (source.ProvinceId != null) {
            this.ProvinceId = new String(source.ProvinceId);
        }
        if (source.ProvinceName != null) {
            this.ProvinceName = new String(source.ProvinceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProvinceId", this.ProvinceId);
        this.setParamSimple(map, prefix + "ProvinceName", this.ProvinceName);

    }
}

