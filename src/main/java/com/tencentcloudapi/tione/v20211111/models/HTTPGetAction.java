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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HTTPGetAction extends AbstractModel {

    /**
    * http 路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 调用端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get http 路径 
     * @return Path http 路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set http 路径
     * @param Path http 路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 调用端口 
     * @return Port 调用端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 调用端口
     * @param Port 调用端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public HTTPGetAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPGetAction(HTTPGetAction source) {
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

