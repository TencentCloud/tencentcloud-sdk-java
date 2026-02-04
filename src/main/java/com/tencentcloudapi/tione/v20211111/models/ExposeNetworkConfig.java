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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExposeNetworkConfig extends AbstractModel {

    /**
    * ssh配置
    */
    @SerializedName("SSHConfig")
    @Expose
    private SSHConfig SSHConfig;

    /**
    * 容器端口暴露到公网配置
    */
    @SerializedName("ExposePortConfig")
    @Expose
    private ExposePortConfig ExposePortConfig;

    /**
     * Get ssh配置 
     * @return SSHConfig ssh配置
     */
    public SSHConfig getSSHConfig() {
        return this.SSHConfig;
    }

    /**
     * Set ssh配置
     * @param SSHConfig ssh配置
     */
    public void setSSHConfig(SSHConfig SSHConfig) {
        this.SSHConfig = SSHConfig;
    }

    /**
     * Get 容器端口暴露到公网配置 
     * @return ExposePortConfig 容器端口暴露到公网配置
     */
    public ExposePortConfig getExposePortConfig() {
        return this.ExposePortConfig;
    }

    /**
     * Set 容器端口暴露到公网配置
     * @param ExposePortConfig 容器端口暴露到公网配置
     */
    public void setExposePortConfig(ExposePortConfig ExposePortConfig) {
        this.ExposePortConfig = ExposePortConfig;
    }

    public ExposeNetworkConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExposeNetworkConfig(ExposeNetworkConfig source) {
        if (source.SSHConfig != null) {
            this.SSHConfig = new SSHConfig(source.SSHConfig);
        }
        if (source.ExposePortConfig != null) {
            this.ExposePortConfig = new ExposePortConfig(source.ExposePortConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SSHConfig.", this.SSHConfig);
        this.setParamObj(map, prefix + "ExposePortConfig.", this.ExposePortConfig);

    }
}

