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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceRef extends AbstractModel {

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源版本
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * 0-引用 JAR 程序包，1-主程序包，2-引用配置文件，3-Python程序包，4-Python数据文件
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源版本 
     * @return Version 资源版本
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set 资源版本
     * @param Version 资源版本
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get 0-引用 JAR 程序包，1-主程序包，2-引用配置文件，3-Python程序包，4-Python数据文件 
     * @return Type 0-引用 JAR 程序包，1-主程序包，2-引用配置文件，3-Python程序包，4-Python数据文件
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0-引用 JAR 程序包，1-主程序包，2-引用配置文件，3-Python程序包，4-Python数据文件
     * @param Type 0-引用 JAR 程序包，1-主程序包，2-引用配置文件，3-Python程序包，4-Python数据文件
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public ResourceRef() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceRef(ResourceRef source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

