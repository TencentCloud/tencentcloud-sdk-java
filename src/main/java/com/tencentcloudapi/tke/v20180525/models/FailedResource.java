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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FailedResource extends AbstractModel {

    /**
    * 资源六段式
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * 执行失败的原因
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
     * Get 资源六段式 
     * @return Resource 资源六段式
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 资源六段式
     * @param Resource 资源六段式
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 执行失败的原因 
     * @return Error 执行失败的原因
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set 执行失败的原因
     * @param Error 执行失败的原因
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    public FailedResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FailedResource(FailedResource source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Error", this.Error);

    }
}

