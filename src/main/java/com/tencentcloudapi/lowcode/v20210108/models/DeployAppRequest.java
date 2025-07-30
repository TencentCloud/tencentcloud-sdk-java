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

public class DeployAppRequest extends AbstractModel {

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
    * 发布体验preview/正式upload
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 构建类型：mp、pc、web、adminPortal
    */
    @SerializedName("BuildType")
    @Expose
    private String BuildType;

    /**
    * 子包数组
    */
    @SerializedName("SubAppIds")
    @Expose
    private String [] SubAppIds;

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
     * Get 发布体验preview/正式upload 
     * @return Mode 发布体验preview/正式upload
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 发布体验preview/正式upload
     * @param Mode 发布体验preview/正式upload
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 构建类型：mp、pc、web、adminPortal 
     * @return BuildType 构建类型：mp、pc、web、adminPortal
     */
    public String getBuildType() {
        return this.BuildType;
    }

    /**
     * Set 构建类型：mp、pc、web、adminPortal
     * @param BuildType 构建类型：mp、pc、web、adminPortal
     */
    public void setBuildType(String BuildType) {
        this.BuildType = BuildType;
    }

    /**
     * Get 子包数组 
     * @return SubAppIds 子包数组
     */
    public String [] getSubAppIds() {
        return this.SubAppIds;
    }

    /**
     * Set 子包数组
     * @param SubAppIds 子包数组
     */
    public void setSubAppIds(String [] SubAppIds) {
        this.SubAppIds = SubAppIds;
    }

    public DeployAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployAppRequest(DeployAppRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.BuildType != null) {
            this.BuildType = new String(source.BuildType);
        }
        if (source.SubAppIds != null) {
            this.SubAppIds = new String[source.SubAppIds.length];
            for (int i = 0; i < source.SubAppIds.length; i++) {
                this.SubAppIds[i] = new String(source.SubAppIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "BuildType", this.BuildType);
        this.setParamArraySimple(map, prefix + "SubAppIds.", this.SubAppIds);

    }
}

