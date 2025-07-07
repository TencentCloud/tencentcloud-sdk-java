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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Affinity extends AbstractModel {

    /**
    * 亲和性范围
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * 亲和规则的权重
    */
    @SerializedName("Weight")
    @Expose
    private String Weight;

    /**
    * -
    */
    @SerializedName("Paths")
    @Expose
    private CommonOption [] Paths;

    /**
     * Get 亲和性范围 
     * @return Scope 亲和性范围
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set 亲和性范围
     * @param Scope 亲和性范围
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 亲和规则的权重 
     * @return Weight 亲和规则的权重
     */
    public String getWeight() {
        return this.Weight;
    }

    /**
     * Set 亲和规则的权重
     * @param Weight 亲和规则的权重
     */
    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    /**
     * Get - 
     * @return Paths -
     */
    public CommonOption [] getPaths() {
        return this.Paths;
    }

    /**
     * Set -
     * @param Paths -
     */
    public void setPaths(CommonOption [] Paths) {
        this.Paths = Paths;
    }

    public Affinity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Affinity(Affinity source) {
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.Weight != null) {
            this.Weight = new String(source.Weight);
        }
        if (source.Paths != null) {
            this.Paths = new CommonOption[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new CommonOption(source.Paths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamArrayObj(map, prefix + "Paths.", this.Paths);

    }
}

