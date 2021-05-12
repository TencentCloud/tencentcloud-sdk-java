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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBundleDiscountRequest extends AbstractModel{

    /**
    * 套餐 ID。
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
     * Get 套餐 ID。 
     * @return BundleId 套餐 ID。
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set 套餐 ID。
     * @param BundleId 套餐 ID。
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    public DescribeBundleDiscountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBundleDiscountRequest(DescribeBundleDiscountRequest source) {
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);

    }
}

