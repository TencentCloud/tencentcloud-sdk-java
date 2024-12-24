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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadDrugData extends AbstractModel {

    /**
    * 药品列表
    */
    @SerializedName("Drugs")
    @Expose
    private Drug [] Drugs;

    /**
     * Get 药品列表 
     * @return Drugs 药品列表
     */
    public Drug [] getDrugs() {
        return this.Drugs;
    }

    /**
     * Set 药品列表
     * @param Drugs 药品列表
     */
    public void setDrugs(Drug [] Drugs) {
        this.Drugs = Drugs;
    }

    public UploadDrugData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadDrugData(UploadDrugData source) {
        if (source.Drugs != null) {
            this.Drugs = new Drug[source.Drugs.length];
            for (int i = 0; i < source.Drugs.length; i++) {
                this.Drugs[i] = new Drug(source.Drugs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Drugs.", this.Drugs);

    }
}

