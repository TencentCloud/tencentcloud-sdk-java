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

public class CreateApplicationRequest  extends AbstractModel{

    /**
    * 应用名称
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 应用类型
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * 应用描述
    */
    @SerializedName("ApplicationDesc")
    @Expose
    private String ApplicationDesc;

    /**
    * 应用日志配置项，废弃参数
    */
    @SerializedName("ApplicationLogConfig")
    @Expose
    private String ApplicationLogConfig;

    /**
    * 应用微服务类型
    */
    @SerializedName("MicroserviceType")
    @Expose
    private String MicroserviceType;

    /**
    * 应有资源类型
    */
    @SerializedName("ApplicationResourceType")
    @Expose
    private String ApplicationResourceType;

    /**
     * 获取应用名称
     * @return ApplicationName 应用名称
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * 设置应用名称
     * @param ApplicationName 应用名称
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * 获取应用类型
     * @return ApplicationType 应用类型
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * 设置应用类型
     * @param ApplicationType 应用类型
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * 获取应用描述
     * @return ApplicationDesc 应用描述
     */
    public String getApplicationDesc() {
        return this.ApplicationDesc;
    }

    /**
     * 设置应用描述
     * @param ApplicationDesc 应用描述
     */
    public void setApplicationDesc(String ApplicationDesc) {
        this.ApplicationDesc = ApplicationDesc;
    }

    /**
     * 获取应用日志配置项，废弃参数
     * @return ApplicationLogConfig 应用日志配置项，废弃参数
     */
    public String getApplicationLogConfig() {
        return this.ApplicationLogConfig;
    }

    /**
     * 设置应用日志配置项，废弃参数
     * @param ApplicationLogConfig 应用日志配置项，废弃参数
     */
    public void setApplicationLogConfig(String ApplicationLogConfig) {
        this.ApplicationLogConfig = ApplicationLogConfig;
    }

    /**
     * 获取应用微服务类型
     * @return MicroserviceType 应用微服务类型
     */
    public String getMicroserviceType() {
        return this.MicroserviceType;
    }

    /**
     * 设置应用微服务类型
     * @param MicroserviceType 应用微服务类型
     */
    public void setMicroserviceType(String MicroserviceType) {
        this.MicroserviceType = MicroserviceType;
    }

    /**
     * 获取应有资源类型
     * @return ApplicationResourceType 应有资源类型
     */
    public String getApplicationResourceType() {
        return this.ApplicationResourceType;
    }

    /**
     * 设置应有资源类型
     * @param ApplicationResourceType 应有资源类型
     */
    public void setApplicationResourceType(String ApplicationResourceType) {
        this.ApplicationResourceType = ApplicationResourceType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "ApplicationDesc", this.ApplicationDesc);
        this.setParamSimple(map, prefix + "ApplicationLogConfig", this.ApplicationLogConfig);
        this.setParamSimple(map, prefix + "MicroserviceType", this.MicroserviceType);
        this.setParamSimple(map, prefix + "ApplicationResourceType", this.ApplicationResourceType);

    }
}

