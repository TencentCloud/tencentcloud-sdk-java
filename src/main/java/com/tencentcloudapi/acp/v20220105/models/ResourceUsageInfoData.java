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
package com.tencentcloudapi.acp.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceUsageInfoData extends AbstractModel{

    /**
    * 资源计费项名称
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 资源总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 未使用资源数
    */
    @SerializedName("UnusedCount")
    @Expose
    private Long UnusedCount;

    /**
     * Get 资源计费项名称 
     * @return ResourceName 资源计费项名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源计费项名称
     * @param ResourceName 资源计费项名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 资源总数 
     * @return Total 资源总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 资源总数
     * @param Total 资源总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 未使用资源数 
     * @return UnusedCount 未使用资源数
     */
    public Long getUnusedCount() {
        return this.UnusedCount;
    }

    /**
     * Set 未使用资源数
     * @param UnusedCount 未使用资源数
     */
    public void setUnusedCount(Long UnusedCount) {
        this.UnusedCount = UnusedCount;
    }

    public ResourceUsageInfoData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceUsageInfoData(ResourceUsageInfoData source) {
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.UnusedCount != null) {
            this.UnusedCount = new Long(source.UnusedCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "UnusedCount", this.UnusedCount);

    }
}

