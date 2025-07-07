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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ArtifactReduction extends AbstractModel {

    /**
    * 去毛刺方式：weak,,strong
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 去毛刺算法，可选项：
edaf,
wdaf，
默认edaf。
注意：此参数已经弃用
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
     * Get 去毛刺方式：weak,,strong 
     * @return Type 去毛刺方式：weak,,strong
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 去毛刺方式：weak,,strong
     * @param Type 去毛刺方式：weak,,strong
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 去毛刺算法，可选项：
edaf,
wdaf，
默认edaf。
注意：此参数已经弃用 
     * @return Algorithm 去毛刺算法，可选项：
edaf,
wdaf，
默认edaf。
注意：此参数已经弃用
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set 去毛刺算法，可选项：
edaf,
wdaf，
默认edaf。
注意：此参数已经弃用
     * @param Algorithm 去毛刺算法，可选项：
edaf,
wdaf，
默认edaf。
注意：此参数已经弃用
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    public ArtifactReduction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ArtifactReduction(ArtifactReduction source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Algorithm != null) {
            this.Algorithm = new String(source.Algorithm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);

    }
}

