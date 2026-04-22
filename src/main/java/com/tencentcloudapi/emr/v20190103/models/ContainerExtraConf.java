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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerExtraConf extends AbstractModel {

    /**
    * <p>计算作业代理访问类型，如Spark作业和RayCluster UI；不填写默认使用Internal</p><p>枚举值：</p><ul><li>Internal： 使用内网LB代理访问</li><li>Public： 使用公网LB代理访问</li><li>None： 不创建LB代理访问</li></ul>
    */
    @SerializedName("JobAccessProxyType")
    @Expose
    private String JobAccessProxyType;

    /**
     * Get <p>计算作业代理访问类型，如Spark作业和RayCluster UI；不填写默认使用Internal</p><p>枚举值：</p><ul><li>Internal： 使用内网LB代理访问</li><li>Public： 使用公网LB代理访问</li><li>None： 不创建LB代理访问</li></ul> 
     * @return JobAccessProxyType <p>计算作业代理访问类型，如Spark作业和RayCluster UI；不填写默认使用Internal</p><p>枚举值：</p><ul><li>Internal： 使用内网LB代理访问</li><li>Public： 使用公网LB代理访问</li><li>None： 不创建LB代理访问</li></ul>
     */
    public String getJobAccessProxyType() {
        return this.JobAccessProxyType;
    }

    /**
     * Set <p>计算作业代理访问类型，如Spark作业和RayCluster UI；不填写默认使用Internal</p><p>枚举值：</p><ul><li>Internal： 使用内网LB代理访问</li><li>Public： 使用公网LB代理访问</li><li>None： 不创建LB代理访问</li></ul>
     * @param JobAccessProxyType <p>计算作业代理访问类型，如Spark作业和RayCluster UI；不填写默认使用Internal</p><p>枚举值：</p><ul><li>Internal： 使用内网LB代理访问</li><li>Public： 使用公网LB代理访问</li><li>None： 不创建LB代理访问</li></ul>
     */
    public void setJobAccessProxyType(String JobAccessProxyType) {
        this.JobAccessProxyType = JobAccessProxyType;
    }

    public ContainerExtraConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerExtraConf(ContainerExtraConf source) {
        if (source.JobAccessProxyType != null) {
            this.JobAccessProxyType = new String(source.JobAccessProxyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobAccessProxyType", this.JobAccessProxyType);

    }
}

