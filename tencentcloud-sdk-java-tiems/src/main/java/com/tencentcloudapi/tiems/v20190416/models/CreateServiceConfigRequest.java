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

public class CreateServiceConfigRequest extends AbstractModel{

    /**
    * 配置名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 运行环境
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 模型地址，支持cos路径，格式为 cos://bucket名-appid.cos.region名.myqcloud.com/模型文件夹路径。为模型文件的上一层文件夹地址。
    */
    @SerializedName("ModelUri")
    @Expose
    private String ModelUri;

    /**
    * 配置描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 配置名称 
     * @return Name 配置名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 配置名称
     * @param Name 配置名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 运行环境 
     * @return Runtime 运行环境
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set 运行环境
     * @param Runtime 运行环境
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get 模型地址，支持cos路径，格式为 cos://bucket名-appid.cos.region名.myqcloud.com/模型文件夹路径。为模型文件的上一层文件夹地址。 
     * @return ModelUri 模型地址，支持cos路径，格式为 cos://bucket名-appid.cos.region名.myqcloud.com/模型文件夹路径。为模型文件的上一层文件夹地址。
     */
    public String getModelUri() {
        return this.ModelUri;
    }

    /**
     * Set 模型地址，支持cos路径，格式为 cos://bucket名-appid.cos.region名.myqcloud.com/模型文件夹路径。为模型文件的上一层文件夹地址。
     * @param ModelUri 模型地址，支持cos路径，格式为 cos://bucket名-appid.cos.region名.myqcloud.com/模型文件夹路径。为模型文件的上一层文件夹地址。
     */
    public void setModelUri(String ModelUri) {
        this.ModelUri = ModelUri;
    }

    /**
     * Get 配置描述 
     * @return Description 配置描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 配置描述
     * @param Description 配置描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "ModelUri", this.ModelUri);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

