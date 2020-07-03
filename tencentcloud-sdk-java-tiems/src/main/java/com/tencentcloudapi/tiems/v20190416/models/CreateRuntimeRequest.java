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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRuntimeRequest extends AbstractModel{

    /**
    * 全局唯一的运行环境名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 运行环境镜像地址
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 运行环境框架
    */
    @SerializedName("Framework")
    @Expose
    private String Framework;

    /**
    * 运行环境描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 是否支持健康检查，默认为False
    */
    @SerializedName("HealthCheckOn")
    @Expose
    private Boolean HealthCheckOn;

    /**
     * Get 全局唯一的运行环境名称 
     * @return Name 全局唯一的运行环境名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 全局唯一的运行环境名称
     * @param Name 全局唯一的运行环境名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 运行环境镜像地址 
     * @return Image 运行环境镜像地址
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 运行环境镜像地址
     * @param Image 运行环境镜像地址
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 运行环境框架 
     * @return Framework 运行环境框架
     */
    public String getFramework() {
        return this.Framework;
    }

    /**
     * Set 运行环境框架
     * @param Framework 运行环境框架
     */
    public void setFramework(String Framework) {
        this.Framework = Framework;
    }

    /**
     * Get 运行环境描述 
     * @return Description 运行环境描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 运行环境描述
     * @param Description 运行环境描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 是否支持健康检查，默认为False 
     * @return HealthCheckOn 是否支持健康检查，默认为False
     */
    public Boolean getHealthCheckOn() {
        return this.HealthCheckOn;
    }

    /**
     * Set 是否支持健康检查，默认为False
     * @param HealthCheckOn 是否支持健康检查，默认为False
     */
    public void setHealthCheckOn(Boolean HealthCheckOn) {
        this.HealthCheckOn = HealthCheckOn;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Framework", this.Framework);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "HealthCheckOn", this.HealthCheckOn);

    }
}

