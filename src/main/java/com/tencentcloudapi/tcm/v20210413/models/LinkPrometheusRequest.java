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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LinkPrometheusRequest extends AbstractModel{

    /**
    * 网格ID
    */
    @SerializedName("MeshID")
    @Expose
    private String MeshID;

    /**
    * 配置
    */
    @SerializedName("Prometheus")
    @Expose
    private PrometheusConfig Prometheus;

    /**
     * Get 网格ID 
     * @return MeshID 网格ID
     */
    public String getMeshID() {
        return this.MeshID;
    }

    /**
     * Set 网格ID
     * @param MeshID 网格ID
     */
    public void setMeshID(String MeshID) {
        this.MeshID = MeshID;
    }

    /**
     * Get 配置 
     * @return Prometheus 配置
     */
    public PrometheusConfig getPrometheus() {
        return this.Prometheus;
    }

    /**
     * Set 配置
     * @param Prometheus 配置
     */
    public void setPrometheus(PrometheusConfig Prometheus) {
        this.Prometheus = Prometheus;
    }

    public LinkPrometheusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LinkPrometheusRequest(LinkPrometheusRequest source) {
        if (source.MeshID != null) {
            this.MeshID = new String(source.MeshID);
        }
        if (source.Prometheus != null) {
            this.Prometheus = new PrometheusConfig(source.Prometheus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MeshID", this.MeshID);
        this.setParamObj(map, prefix + "Prometheus.", this.Prometheus);

    }
}

