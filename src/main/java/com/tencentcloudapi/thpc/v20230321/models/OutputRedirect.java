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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputRedirect extends AbstractModel {

    /**
    * 输出driver类型
    */
    @SerializedName("Driver")
    @Expose
    private String Driver;

    /**
    * 重定向配置参数
    */
    @SerializedName("Options")
    @Expose
    private String [] Options;

    /**
     * Get 输出driver类型 
     * @return Driver 输出driver类型
     */
    public String getDriver() {
        return this.Driver;
    }

    /**
     * Set 输出driver类型
     * @param Driver 输出driver类型
     */
    public void setDriver(String Driver) {
        this.Driver = Driver;
    }

    /**
     * Get 重定向配置参数 
     * @return Options 重定向配置参数
     */
    public String [] getOptions() {
        return this.Options;
    }

    /**
     * Set 重定向配置参数
     * @param Options 重定向配置参数
     */
    public void setOptions(String [] Options) {
        this.Options = Options;
    }

    public OutputRedirect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputRedirect(OutputRedirect source) {
        if (source.Driver != null) {
            this.Driver = new String(source.Driver);
        }
        if (source.Options != null) {
            this.Options = new String[source.Options.length];
            for (int i = 0; i < source.Options.length; i++) {
                this.Options[i] = new String(source.Options[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Driver", this.Driver);
        this.setParamArraySimple(map, prefix + "Options.", this.Options);

    }
}

