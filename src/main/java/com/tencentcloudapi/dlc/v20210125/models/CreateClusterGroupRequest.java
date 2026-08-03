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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterGroupRequest extends AbstractModel {

    /**
    * <p>集群组名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>集群组描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>集群组配置</p>
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
     * Get <p>集群组名称</p> 
     * @return Name <p>集群组名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>集群组名称</p>
     * @param Name <p>集群组名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>集群组描述</p> 
     * @return Description <p>集群组描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>集群组描述</p>
     * @param Description <p>集群组描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>集群组配置</p> 
     * @return Config <p>集群组配置</p>
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set <p>集群组配置</p>
     * @param Config <p>集群组配置</p>
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    public CreateClusterGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterGroupRequest(CreateClusterGroupRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Config", this.Config);

    }
}

