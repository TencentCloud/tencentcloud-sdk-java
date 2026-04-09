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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpConfig extends AbstractModel {

    /**
    * <p>指定健康检查的URL路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>指定健康检查的端口</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get <p>指定健康检查的URL路径</p> 
     * @return Path <p>指定健康检查的URL路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>指定健康检查的URL路径</p>
     * @param Path <p>指定健康检查的URL路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>指定健康检查的端口</p> 
     * @return Port <p>指定健康检查的端口</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>指定健康检查的端口</p>
     * @param Port <p>指定健康检查的端口</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public HttpConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HttpConfig(HttpConfig source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

