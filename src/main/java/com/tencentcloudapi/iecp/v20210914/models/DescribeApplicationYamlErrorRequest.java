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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationYamlErrorRequest extends AbstractModel{

    /**
    * Yaml配置
    */
    @SerializedName("Yaml")
    @Expose
    private String Yaml;

    /**
     * Get Yaml配置 
     * @return Yaml Yaml配置
     */
    public String getYaml() {
        return this.Yaml;
    }

    /**
     * Set Yaml配置
     * @param Yaml Yaml配置
     */
    public void setYaml(String Yaml) {
        this.Yaml = Yaml;
    }

    public DescribeApplicationYamlErrorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationYamlErrorRequest(DescribeApplicationYamlErrorRequest source) {
        if (source.Yaml != null) {
            this.Yaml = new String(source.Yaml);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Yaml", this.Yaml);

    }
}

