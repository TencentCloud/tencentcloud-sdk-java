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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigMapRequest extends AbstractModel{

    /**
    * 单元ID
    */
    @SerializedName("EdgeUnitID")
    @Expose
    private Long EdgeUnitID;

    /**
    * ConfigMap名称
    */
    @SerializedName("ConfigMapName")
    @Expose
    private String ConfigMapName;

    /**
    * ConfigMap命名空间
    */
    @SerializedName("ConfigMapNamespace")
    @Expose
    private String ConfigMapNamespace;

    /**
     * Get 单元ID 
     * @return EdgeUnitID 单元ID
     */
    public Long getEdgeUnitID() {
        return this.EdgeUnitID;
    }

    /**
     * Set 单元ID
     * @param EdgeUnitID 单元ID
     */
    public void setEdgeUnitID(Long EdgeUnitID) {
        this.EdgeUnitID = EdgeUnitID;
    }

    /**
     * Get ConfigMap名称 
     * @return ConfigMapName ConfigMap名称
     */
    public String getConfigMapName() {
        return this.ConfigMapName;
    }

    /**
     * Set ConfigMap名称
     * @param ConfigMapName ConfigMap名称
     */
    public void setConfigMapName(String ConfigMapName) {
        this.ConfigMapName = ConfigMapName;
    }

    /**
     * Get ConfigMap命名空间 
     * @return ConfigMapNamespace ConfigMap命名空间
     */
    public String getConfigMapNamespace() {
        return this.ConfigMapNamespace;
    }

    /**
     * Set ConfigMap命名空间
     * @param ConfigMapNamespace ConfigMap命名空间
     */
    public void setConfigMapNamespace(String ConfigMapNamespace) {
        this.ConfigMapNamespace = ConfigMapNamespace;
    }

    public DescribeConfigMapRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigMapRequest(DescribeConfigMapRequest source) {
        if (source.EdgeUnitID != null) {
            this.EdgeUnitID = new Long(source.EdgeUnitID);
        }
        if (source.ConfigMapName != null) {
            this.ConfigMapName = new String(source.ConfigMapName);
        }
        if (source.ConfigMapNamespace != null) {
            this.ConfigMapNamespace = new String(source.ConfigMapNamespace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitID", this.EdgeUnitID);
        this.setParamSimple(map, prefix + "ConfigMapName", this.ConfigMapName);
        this.setParamSimple(map, prefix + "ConfigMapNamespace", this.ConfigMapNamespace);

    }
}

