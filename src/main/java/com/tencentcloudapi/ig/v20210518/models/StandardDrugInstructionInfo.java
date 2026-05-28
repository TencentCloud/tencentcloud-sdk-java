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
package com.tencentcloudapi.ig.v20210518.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StandardDrugInstructionInfo extends AbstractModel {

    /**
    * 标准药品名
    */
    @SerializedName("StandardDrugName")
    @Expose
    private String StandardDrugName;

    /**
    * 药品列表
    */
    @SerializedName("DrugInfos")
    @Expose
    private DrugInstructionInfo [] DrugInfos;

    /**
     * Get 标准药品名 
     * @return StandardDrugName 标准药品名
     */
    public String getStandardDrugName() {
        return this.StandardDrugName;
    }

    /**
     * Set 标准药品名
     * @param StandardDrugName 标准药品名
     */
    public void setStandardDrugName(String StandardDrugName) {
        this.StandardDrugName = StandardDrugName;
    }

    /**
     * Get 药品列表 
     * @return DrugInfos 药品列表
     */
    public DrugInstructionInfo [] getDrugInfos() {
        return this.DrugInfos;
    }

    /**
     * Set 药品列表
     * @param DrugInfos 药品列表
     */
    public void setDrugInfos(DrugInstructionInfo [] DrugInfos) {
        this.DrugInfos = DrugInfos;
    }

    public StandardDrugInstructionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StandardDrugInstructionInfo(StandardDrugInstructionInfo source) {
        if (source.StandardDrugName != null) {
            this.StandardDrugName = new String(source.StandardDrugName);
        }
        if (source.DrugInfos != null) {
            this.DrugInfos = new DrugInstructionInfo[source.DrugInfos.length];
            for (int i = 0; i < source.DrugInfos.length; i++) {
                this.DrugInfos[i] = new DrugInstructionInfo(source.DrugInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StandardDrugName", this.StandardDrugName);
        this.setParamArrayObj(map, prefix + "DrugInfos.", this.DrugInfos);

    }
}

