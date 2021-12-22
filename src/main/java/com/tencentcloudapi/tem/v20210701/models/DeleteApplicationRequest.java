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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteApplicationRequest extends AbstractModel{

    /**
    * 服务Id
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 环境ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 来源渠道
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * 当服务没有任何运行版本时，是否删除此服务
    */
    @SerializedName("DeleteApplicationIfNoRunningVersion")
    @Expose
    private Boolean DeleteApplicationIfNoRunningVersion;

    /**
     * Get 服务Id 
     * @return ApplicationId 服务Id
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 服务Id
     * @param ApplicationId 服务Id
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 环境ID 
     * @return EnvironmentId 环境ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境ID
     * @param EnvironmentId 环境ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 来源渠道 
     * @return SourceChannel 来源渠道
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set 来源渠道
     * @param SourceChannel 来源渠道
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    /**
     * Get 当服务没有任何运行版本时，是否删除此服务 
     * @return DeleteApplicationIfNoRunningVersion 当服务没有任何运行版本时，是否删除此服务
     */
    public Boolean getDeleteApplicationIfNoRunningVersion() {
        return this.DeleteApplicationIfNoRunningVersion;
    }

    /**
     * Set 当服务没有任何运行版本时，是否删除此服务
     * @param DeleteApplicationIfNoRunningVersion 当服务没有任何运行版本时，是否删除此服务
     */
    public void setDeleteApplicationIfNoRunningVersion(Boolean DeleteApplicationIfNoRunningVersion) {
        this.DeleteApplicationIfNoRunningVersion = DeleteApplicationIfNoRunningVersion;
    }

    public DeleteApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteApplicationRequest(DeleteApplicationRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.DeleteApplicationIfNoRunningVersion != null) {
            this.DeleteApplicationIfNoRunningVersion = new Boolean(source.DeleteApplicationIfNoRunningVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamSimple(map, prefix + "DeleteApplicationIfNoRunningVersion", this.DeleteApplicationIfNoRunningVersion);

    }
}

