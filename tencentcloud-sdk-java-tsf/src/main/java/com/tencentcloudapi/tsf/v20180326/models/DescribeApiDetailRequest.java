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

public class DescribeApiDetailRequest extends AbstractModel{

    /**
    * 微服务id
    */
    @SerializedName("MicroserviceId")
    @Expose
    private String MicroserviceId;

    /**
    * 请求路径
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
    * 包版本
    */
    @SerializedName("PkgVersion")
    @Expose
    private String PkgVersion;

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
     * Get 微服务id 
     * @return MicroserviceId 微服务id
     */
    public String getMicroserviceId() {
        return this.MicroserviceId;
    }

    /**
     * Set 微服务id
     * @param MicroserviceId 微服务id
     */
    public void setMicroserviceId(String MicroserviceId) {
        this.MicroserviceId = MicroserviceId;
    }

    /**
     * Get 请求路径 
     * @return Path 请求路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 请求路径
     * @param Path 请求路径
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
     * Get 包版本 
     * @return PkgVersion 包版本
     */
    public String getPkgVersion() {
        return this.PkgVersion;
    }

    /**
     * Set 包版本
     * @param PkgVersion 包版本
     */
    public void setPkgVersion(String PkgVersion) {
        this.PkgVersion = PkgVersion;
    }

    /**
     * Get 应用ID 
     * @return ApplicationId 应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
     * @param ApplicationId 应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MicroserviceId", this.MicroserviceId);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "PkgVersion", this.PkgVersion);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);

    }
}

