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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParquetInfo extends AbstractModel{

    /**
    * ParquetKeyInfo数组
    */
    @SerializedName("ParquetKeyInfo")
    @Expose
    private ParquetKeyInfo [] ParquetKeyInfo;

    /**
     * Get ParquetKeyInfo数组 
     * @return ParquetKeyInfo ParquetKeyInfo数组
     */
    public ParquetKeyInfo [] getParquetKeyInfo() {
        return this.ParquetKeyInfo;
    }

    /**
     * Set ParquetKeyInfo数组
     * @param ParquetKeyInfo ParquetKeyInfo数组
     */
    public void setParquetKeyInfo(ParquetKeyInfo [] ParquetKeyInfo) {
        this.ParquetKeyInfo = ParquetKeyInfo;
    }

    public ParquetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParquetInfo(ParquetInfo source) {
        if (source.ParquetKeyInfo != null) {
            this.ParquetKeyInfo = new ParquetKeyInfo[source.ParquetKeyInfo.length];
            for (int i = 0; i < source.ParquetKeyInfo.length; i++) {
                this.ParquetKeyInfo[i] = new ParquetKeyInfo(source.ParquetKeyInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ParquetKeyInfo.", this.ParquetKeyInfo);

    }
}

