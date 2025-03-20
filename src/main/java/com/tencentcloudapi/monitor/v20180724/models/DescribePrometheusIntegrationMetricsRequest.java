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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusIntegrationMetricsRequest extends AbstractModel {

    /**
    * 集成类型标识。取值参考DescribePrometheusIntegrations接口返回中IntegrationSet[i].Code参数
    */
    @SerializedName("IntegrationCode")
    @Expose
    private String IntegrationCode;

    /**
     * Get 集成类型标识。取值参考DescribePrometheusIntegrations接口返回中IntegrationSet[i].Code参数 
     * @return IntegrationCode 集成类型标识。取值参考DescribePrometheusIntegrations接口返回中IntegrationSet[i].Code参数
     */
    public String getIntegrationCode() {
        return this.IntegrationCode;
    }

    /**
     * Set 集成类型标识。取值参考DescribePrometheusIntegrations接口返回中IntegrationSet[i].Code参数
     * @param IntegrationCode 集成类型标识。取值参考DescribePrometheusIntegrations接口返回中IntegrationSet[i].Code参数
     */
    public void setIntegrationCode(String IntegrationCode) {
        this.IntegrationCode = IntegrationCode;
    }

    public DescribePrometheusIntegrationMetricsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusIntegrationMetricsRequest(DescribePrometheusIntegrationMetricsRequest source) {
        if (source.IntegrationCode != null) {
            this.IntegrationCode = new String(source.IntegrationCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntegrationCode", this.IntegrationCode);

    }
}

