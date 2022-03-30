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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnablePrometheusConf extends AbstractModel{

    /**
    * 应用开放的监听端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 业务指标暴露的url path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get 应用开放的监听端口 
     * @return Port 应用开放的监听端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 应用开放的监听端口
     * @param Port 应用开放的监听端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 业务指标暴露的url path 
     * @return Path 业务指标暴露的url path
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 业务指标暴露的url path
     * @param Path 业务指标暴露的url path
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public EnablePrometheusConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnablePrometheusConf(EnablePrometheusConf source) {
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

