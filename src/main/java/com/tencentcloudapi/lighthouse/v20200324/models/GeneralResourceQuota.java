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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralResourceQuota extends AbstractModel{

    /**
    * 资源名称。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 资源当前可用数量。
    */
    @SerializedName("ResourceQuotaAvailable")
    @Expose
    private Long ResourceQuotaAvailable;

    /**
    * 资源总数量。
    */
    @SerializedName("ResourceQuotaTotal")
    @Expose
    private Long ResourceQuotaTotal;

    /**
     * Get 资源名称。 
     * @return ResourceName 资源名称。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称。
     * @param ResourceName 资源名称。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 资源当前可用数量。 
     * @return ResourceQuotaAvailable 资源当前可用数量。
     */
    public Long getResourceQuotaAvailable() {
        return this.ResourceQuotaAvailable;
    }

    /**
     * Set 资源当前可用数量。
     * @param ResourceQuotaAvailable 资源当前可用数量。
     */
    public void setResourceQuotaAvailable(Long ResourceQuotaAvailable) {
        this.ResourceQuotaAvailable = ResourceQuotaAvailable;
    }

    /**
     * Get 资源总数量。 
     * @return ResourceQuotaTotal 资源总数量。
     */
    public Long getResourceQuotaTotal() {
        return this.ResourceQuotaTotal;
    }

    /**
     * Set 资源总数量。
     * @param ResourceQuotaTotal 资源总数量。
     */
    public void setResourceQuotaTotal(Long ResourceQuotaTotal) {
        this.ResourceQuotaTotal = ResourceQuotaTotal;
    }

    public GeneralResourceQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralResourceQuota(GeneralResourceQuota source) {
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ResourceQuotaAvailable != null) {
            this.ResourceQuotaAvailable = new Long(source.ResourceQuotaAvailable);
        }
        if (source.ResourceQuotaTotal != null) {
            this.ResourceQuotaTotal = new Long(source.ResourceQuotaTotal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ResourceQuotaAvailable", this.ResourceQuotaAvailable);
        this.setParamSimple(map, prefix + "ResourceQuotaTotal", this.ResourceQuotaTotal);

    }
}

