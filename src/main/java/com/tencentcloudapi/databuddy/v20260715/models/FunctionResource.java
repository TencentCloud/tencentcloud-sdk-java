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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FunctionResource extends AbstractModel {

    /**
    * 资源类型，取值如file(文件)、jar(jar包)、archive(归档文件)等
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源路径
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
     * Get 资源类型，取值如file(文件)、jar(jar包)、archive(归档文件)等 
     * @return ResourceType 资源类型，取值如file(文件)、jar(jar包)、archive(归档文件)等
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型，取值如file(文件)、jar(jar包)、archive(归档文件)等
     * @param ResourceType 资源类型，取值如file(文件)、jar(jar包)、archive(归档文件)等
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源路径 
     * @return Uri 资源路径
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set 资源路径
     * @param Uri 资源路径
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    public FunctionResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionResource(FunctionResource source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Uri != null) {
            this.Uri = new String(source.Uri);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Uri", this.Uri);

    }
}

