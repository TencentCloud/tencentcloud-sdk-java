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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VersionWeight extends AbstractModel{

    /**
    * 函数版本名称
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 该版本的权重
    */
    @SerializedName("Weight")
    @Expose
    private Float Weight;

    /**
     * Get 函数版本名称 
     * @return Version 函数版本名称
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 函数版本名称
     * @param Version 函数版本名称
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 该版本的权重 
     * @return Weight 该版本的权重
     */
    public Float getWeight() {
        return this.Weight;
    }

    /**
     * Set 该版本的权重
     * @param Weight 该版本的权重
     */
    public void setWeight(Float Weight) {
        this.Weight = Weight;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

