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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusGlobalConfigRequest extends AbstractModel{

    /**
    * 实例级别抓取配置
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 是否禁用统计
    */
    @SerializedName("DisableStatistics")
    @Expose
    private Boolean DisableStatistics;

    /**
     * Get 实例级别抓取配置 
     * @return InstanceId 实例级别抓取配置
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例级别抓取配置
     * @param InstanceId 实例级别抓取配置
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 是否禁用统计 
     * @return DisableStatistics 是否禁用统计
     */
    public Boolean getDisableStatistics() {
        return this.DisableStatistics;
    }

    /**
     * Set 是否禁用统计
     * @param DisableStatistics 是否禁用统计
     */
    public void setDisableStatistics(Boolean DisableStatistics) {
        this.DisableStatistics = DisableStatistics;
    }

    public DescribePrometheusGlobalConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusGlobalConfigRequest(DescribePrometheusGlobalConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DisableStatistics != null) {
            this.DisableStatistics = new Boolean(source.DisableStatistics);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DisableStatistics", this.DisableStatistics);

    }
}

