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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PathMapping extends AbstractModel{

    /**
    * 路径。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 发布环境，可选值为“test”、 ”prepub“、”release“。
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 路径。 
     * @return Path 路径。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 路径。
     * @param Path 路径。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 发布环境，可选值为“test”、 ”prepub“、”release“。 
     * @return Environment 发布环境，可选值为“test”、 ”prepub“、”release“。
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 发布环境，可选值为“test”、 ”prepub“、”release“。
     * @param Environment 发布环境，可选值为“test”、 ”prepub“、”release“。
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public PathMapping() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PathMapping(PathMapping source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

