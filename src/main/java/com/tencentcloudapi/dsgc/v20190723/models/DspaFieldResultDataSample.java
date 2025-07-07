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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaFieldResultDataSample extends AbstractModel {

    /**
    * 数据样本
    */
    @SerializedName("DataSample")
    @Expose
    private String DataSample;

    /**
     * Get 数据样本 
     * @return DataSample 数据样本
     */
    public String getDataSample() {
        return this.DataSample;
    }

    /**
     * Set 数据样本
     * @param DataSample 数据样本
     */
    public void setDataSample(String DataSample) {
        this.DataSample = DataSample;
    }

    public DspaFieldResultDataSample() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaFieldResultDataSample(DspaFieldResultDataSample source) {
        if (source.DataSample != null) {
            this.DataSample = new String(source.DataSample);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataSample", this.DataSample);

    }
}

