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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SrvInvokeRequest extends AbstractModel{

    /**
    * 服务类型，iss或者dam
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 服务接口，要调用的方法函数名
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 用户自定义json字符串
    */
    @SerializedName("Param")
    @Expose
    private String Param;

    /**
     * Get 服务类型，iss或者dam 
     * @return Service 服务类型，iss或者dam
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 服务类型，iss或者dam
     * @param Service 服务类型，iss或者dam
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 服务接口，要调用的方法函数名 
     * @return Method 服务接口，要调用的方法函数名
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 服务接口，要调用的方法函数名
     * @param Method 服务接口，要调用的方法函数名
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 用户自定义json字符串 
     * @return Param 用户自定义json字符串
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * Set 用户自定义json字符串
     * @param Param 用户自定义json字符串
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Param", this.Param);

    }
}

