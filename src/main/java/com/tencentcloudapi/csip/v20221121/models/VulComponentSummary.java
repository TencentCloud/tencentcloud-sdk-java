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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulComponentSummary extends AbstractModel {

    /**
    * <p>组件名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>关联主机数</p>
    */
    @SerializedName("RelateHostCount")
    @Expose
    private Long RelateHostCount;

    /**
     * Get <p>组件名称</p> 
     * @return Name <p>组件名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>组件名称</p>
     * @param Name <p>组件名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>关联主机数</p> 
     * @return RelateHostCount <p>关联主机数</p>
     */
    public Long getRelateHostCount() {
        return this.RelateHostCount;
    }

    /**
     * Set <p>关联主机数</p>
     * @param RelateHostCount <p>关联主机数</p>
     */
    public void setRelateHostCount(Long RelateHostCount) {
        this.RelateHostCount = RelateHostCount;
    }

    public VulComponentSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulComponentSummary(VulComponentSummary source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RelateHostCount != null) {
            this.RelateHostCount = new Long(source.RelateHostCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RelateHostCount", this.RelateHostCount);

    }
}

