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
package com.tencentcloudapi.cetcd.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EtcdMonitorSettings extends AbstractModel {

    /**
    * Prometheus创建参数
    */
    @SerializedName("PrometheusCreationParam")
    @Expose
    private PrometheusCreationParam PrometheusCreationParam;

    /**
    * Prometheus Id
    */
    @SerializedName("ExistedPrometheusInstanceId")
    @Expose
    private String ExistedPrometheusInstanceId;

    /**
     * Get Prometheus创建参数 
     * @return PrometheusCreationParam Prometheus创建参数
     */
    public PrometheusCreationParam getPrometheusCreationParam() {
        return this.PrometheusCreationParam;
    }

    /**
     * Set Prometheus创建参数
     * @param PrometheusCreationParam Prometheus创建参数
     */
    public void setPrometheusCreationParam(PrometheusCreationParam PrometheusCreationParam) {
        this.PrometheusCreationParam = PrometheusCreationParam;
    }

    /**
     * Get Prometheus Id 
     * @return ExistedPrometheusInstanceId Prometheus Id
     */
    public String getExistedPrometheusInstanceId() {
        return this.ExistedPrometheusInstanceId;
    }

    /**
     * Set Prometheus Id
     * @param ExistedPrometheusInstanceId Prometheus Id
     */
    public void setExistedPrometheusInstanceId(String ExistedPrometheusInstanceId) {
        this.ExistedPrometheusInstanceId = ExistedPrometheusInstanceId;
    }

    public EtcdMonitorSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EtcdMonitorSettings(EtcdMonitorSettings source) {
        if (source.PrometheusCreationParam != null) {
            this.PrometheusCreationParam = new PrometheusCreationParam(source.PrometheusCreationParam);
        }
        if (source.ExistedPrometheusInstanceId != null) {
            this.ExistedPrometheusInstanceId = new String(source.ExistedPrometheusInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PrometheusCreationParam.", this.PrometheusCreationParam);
        this.setParamSimple(map, prefix + "ExistedPrometheusInstanceId", this.ExistedPrometheusInstanceId);

    }
}

