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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpGetAction extends AbstractModel {

    /**
    * 路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 协议
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
     * Get 路径 
     * @return Path 路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 路径
     * @param Path 路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 协议 
     * @return Scheme 协议
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set 协议
     * @param Scheme 协议
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    public HttpGetAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HttpGetAction(HttpGetAction source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);

    }
}

