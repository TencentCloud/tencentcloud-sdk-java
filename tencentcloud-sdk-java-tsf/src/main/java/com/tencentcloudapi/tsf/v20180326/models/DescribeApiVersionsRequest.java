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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApiVersionsRequest extends AbstractModel{

    /**
    * 微服务ID
    */
    @SerializedName("MicroserviceId")
    @Expose
    private String MicroserviceId;

    /**
    * API 请求路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 请求方法
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
     * Get 微服务ID 
     * @return MicroserviceId 微服务ID
     */
    public String getMicroserviceId() {
        return this.MicroserviceId;
    }

    /**
     * Set 微服务ID
     * @param MicroserviceId 微服务ID
     */
    public void setMicroserviceId(String MicroserviceId) {
        this.MicroserviceId = MicroserviceId;
    }

    /**
     * Get API 请求路径 
     * @return Path API 请求路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API 请求路径
     * @param Path API 请求路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 请求方法 
     * @return Method 请求方法
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 请求方法
     * @param Method 请求方法
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MicroserviceId", this.MicroserviceId);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);

    }
}

