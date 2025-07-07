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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlgorithmInfo extends AbstractModel {

    /**
    * 算法的标识
    */
    @SerializedName("KeyUsage")
    @Expose
    private String KeyUsage;

    /**
    * 算法的名称
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
     * Get 算法的标识 
     * @return KeyUsage 算法的标识
     */
    public String getKeyUsage() {
        return this.KeyUsage;
    }

    /**
     * Set 算法的标识
     * @param KeyUsage 算法的标识
     */
    public void setKeyUsage(String KeyUsage) {
        this.KeyUsage = KeyUsage;
    }

    /**
     * Get 算法的名称 
     * @return Algorithm 算法的名称
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set 算法的名称
     * @param Algorithm 算法的名称
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    public AlgorithmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlgorithmInfo(AlgorithmInfo source) {
        if (source.KeyUsage != null) {
            this.KeyUsage = new String(source.KeyUsage);
        }
        if (source.Algorithm != null) {
            this.Algorithm = new String(source.Algorithm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyUsage", this.KeyUsage);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);

    }
}

