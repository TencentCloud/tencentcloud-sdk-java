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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CancelAssignTWeCallLicenseRequest extends AbstractModel {

    /**
    * 订单号
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
     * Get 订单号 
     * @return PkgId 订单号
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 订单号
     * @param PkgId 订单号
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    public CancelAssignTWeCallLicenseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CancelAssignTWeCallLicenseRequest(CancelAssignTWeCallLicenseRequest source) {
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);

    }
}

