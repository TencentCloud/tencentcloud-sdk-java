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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceUsageDetail extends AbstractModel{

    /**
    * 资源名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 资源使用量
    */
    @SerializedName("Usage")
    @Expose
    private Long Usage;

    /**
     * Get 资源名称 
     * @return Name 资源名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源名称
     * @param Name 资源名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 资源使用量 
     * @return Usage 资源使用量
     */
    public Long getUsage() {
        return this.Usage;
    }

    /**
     * Set 资源使用量
     * @param Usage 资源使用量
     */
    public void setUsage(Long Usage) {
        this.Usage = Usage;
    }

    public ResourceUsageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceUsageDetail(ResourceUsageDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Usage != null) {
            this.Usage = new Long(source.Usage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Usage", this.Usage);

    }
}

