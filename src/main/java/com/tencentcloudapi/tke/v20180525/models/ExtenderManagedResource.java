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

public class ExtenderManagedResource extends AbstractModel {

    /**
    * <p>自定义资源的名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>调度器是否忽略该资源的默认处理</p>
    */
    @SerializedName("IgnoredByScheduler")
    @Expose
    private Boolean IgnoredByScheduler;

    /**
     * Get <p>自定义资源的名称</p> 
     * @return Name <p>自定义资源的名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>自定义资源的名称</p>
     * @param Name <p>自定义资源的名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>调度器是否忽略该资源的默认处理</p> 
     * @return IgnoredByScheduler <p>调度器是否忽略该资源的默认处理</p>
     */
    public Boolean getIgnoredByScheduler() {
        return this.IgnoredByScheduler;
    }

    /**
     * Set <p>调度器是否忽略该资源的默认处理</p>
     * @param IgnoredByScheduler <p>调度器是否忽略该资源的默认处理</p>
     */
    public void setIgnoredByScheduler(Boolean IgnoredByScheduler) {
        this.IgnoredByScheduler = IgnoredByScheduler;
    }

    public ExtenderManagedResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtenderManagedResource(ExtenderManagedResource source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IgnoredByScheduler != null) {
            this.IgnoredByScheduler = new Boolean(source.IgnoredByScheduler);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IgnoredByScheduler", this.IgnoredByScheduler);

    }
}

