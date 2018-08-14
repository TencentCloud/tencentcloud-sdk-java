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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateShieldInstanceRequest  extends AbstractModel{

    /**
    * 待加固的应用信息
    */
    @SerializedName("AppInfo")
    @Expose
    private AppInfo AppInfo;

    /**
    * 加固服务信息
    */
    @SerializedName("ServiceInfo")
    @Expose
    private ServiceInfo ServiceInfo;

    /**
     * 获取待加固的应用信息
     * @return AppInfo 待加固的应用信息
     */
    public AppInfo getAppInfo() {
        return this.AppInfo;
    }

    /**
     * 设置待加固的应用信息
     * @param AppInfo 待加固的应用信息
     */
    public void setAppInfo(AppInfo AppInfo) {
        this.AppInfo = AppInfo;
    }

    /**
     * 获取加固服务信息
     * @return ServiceInfo 加固服务信息
     */
    public ServiceInfo getServiceInfo() {
        return this.ServiceInfo;
    }

    /**
     * 设置加固服务信息
     * @param ServiceInfo 加固服务信息
     */
    public void setServiceInfo(ServiceInfo ServiceInfo) {
        this.ServiceInfo = ServiceInfo;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AppInfo.", this.AppInfo);
        this.setParamObj(map, prefix + "ServiceInfo.", this.ServiceInfo);

    }
}

