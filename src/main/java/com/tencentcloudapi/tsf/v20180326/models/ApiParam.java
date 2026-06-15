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

public class ApiParam extends AbstractModel {

    /**
    * <p>接口Method</p>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>接口Path</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get <p>接口Method</p> 
     * @return Method <p>接口Method</p>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>接口Method</p>
     * @param Method <p>接口Method</p>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>接口Path</p> 
     * @return Path <p>接口Path</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>接口Path</p>
     * @param Path <p>接口Path</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public ApiParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiParam(ApiParam source) {
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

