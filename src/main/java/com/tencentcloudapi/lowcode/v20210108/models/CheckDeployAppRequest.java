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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckDeployAppRequest extends AbstractModel {

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 应用id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 构建 Id
    */
    @SerializedName("BuildId")
    @Expose
    private String BuildId;

    /**
     * Get 环境ID 
     * @return EnvId 环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
     * @param EnvId 环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 应用id 
     * @return Id 应用id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 应用id
     * @param Id 应用id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 构建 Id 
     * @return BuildId 构建 Id
     */
    public String getBuildId() {
        return this.BuildId;
    }

    /**
     * Set 构建 Id
     * @param BuildId 构建 Id
     */
    public void setBuildId(String BuildId) {
        this.BuildId = BuildId;
    }

    public CheckDeployAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckDeployAppRequest(CheckDeployAppRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.BuildId != null) {
            this.BuildId = new String(source.BuildId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "BuildId", this.BuildId);

    }
}

