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

public class ResourceUsage extends AbstractModel{

    /**
    * 资源类型
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
    * 资源使用详情
    */
    @SerializedName("Details")
    @Expose
    private ResourceUsageDetail [] Details;

    /**
     * Get 资源类型 
     * @return Name 资源类型
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源类型
     * @param Name 资源类型
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

    /**
     * Get 资源使用详情 
     * @return Details 资源使用详情
     */
    public ResourceUsageDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set 资源使用详情
     * @param Details 资源使用详情
     */
    public void setDetails(ResourceUsageDetail [] Details) {
        this.Details = Details;
    }

    public ResourceUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceUsage(ResourceUsage source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Usage != null) {
            this.Usage = new Long(source.Usage);
        }
        if (source.Details != null) {
            this.Details = new ResourceUsageDetail[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new ResourceUsageDetail(source.Details[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);

    }
}

