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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceSubDomainMappings extends AbstractModel{

    /**
    * 是否使用默认路径映射，为 True 表示使用默认路径映射；为 False 的话，表示使用自定义路径映射，此时 PathMappingSet 不为空。
    */
    @SerializedName("IsDefaultMapping")
    @Expose
    private Boolean IsDefaultMapping;

    /**
    * 自定义路径映射列表。
    */
    @SerializedName("PathMappingSet")
    @Expose
    private PathMapping [] PathMappingSet;

    /**
     * Get 是否使用默认路径映射，为 True 表示使用默认路径映射；为 False 的话，表示使用自定义路径映射，此时 PathMappingSet 不为空。 
     * @return IsDefaultMapping 是否使用默认路径映射，为 True 表示使用默认路径映射；为 False 的话，表示使用自定义路径映射，此时 PathMappingSet 不为空。
     */
    public Boolean getIsDefaultMapping() {
        return this.IsDefaultMapping;
    }

    /**
     * Set 是否使用默认路径映射，为 True 表示使用默认路径映射；为 False 的话，表示使用自定义路径映射，此时 PathMappingSet 不为空。
     * @param IsDefaultMapping 是否使用默认路径映射，为 True 表示使用默认路径映射；为 False 的话，表示使用自定义路径映射，此时 PathMappingSet 不为空。
     */
    public void setIsDefaultMapping(Boolean IsDefaultMapping) {
        this.IsDefaultMapping = IsDefaultMapping;
    }

    /**
     * Get 自定义路径映射列表。 
     * @return PathMappingSet 自定义路径映射列表。
     */
    public PathMapping [] getPathMappingSet() {
        return this.PathMappingSet;
    }

    /**
     * Set 自定义路径映射列表。
     * @param PathMappingSet 自定义路径映射列表。
     */
    public void setPathMappingSet(PathMapping [] PathMappingSet) {
        this.PathMappingSet = PathMappingSet;
    }

    public ServiceSubDomainMappings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceSubDomainMappings(ServiceSubDomainMappings source) {
        if (source.IsDefaultMapping != null) {
            this.IsDefaultMapping = new Boolean(source.IsDefaultMapping);
        }
        if (source.PathMappingSet != null) {
            this.PathMappingSet = new PathMapping[source.PathMappingSet.length];
            for (int i = 0; i < source.PathMappingSet.length; i++) {
                this.PathMappingSet[i] = new PathMapping(source.PathMappingSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsDefaultMapping", this.IsDefaultMapping);
        this.setParamArrayObj(map, prefix + "PathMappingSet.", this.PathMappingSet);

    }
}

