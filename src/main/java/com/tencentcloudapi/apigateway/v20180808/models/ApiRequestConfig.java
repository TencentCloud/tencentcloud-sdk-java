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

public class ApiRequestConfig extends AbstractModel{

    /**
    * path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 方法
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
     * Get path 
     * @return Path path
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set path
     * @param Path path
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 方法 
     * @return Method 方法
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 方法
     * @param Method 方法
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    public ApiRequestConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiRequestConfig(ApiRequestConfig source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);

    }
}

