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
package com.tencentcloudapi.cloudstudio.v20210524.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWorkspaceByTemplateRequest extends AbstractModel{

    /**
    * 用户所属组
    */
    @SerializedName("CloudStudioSessionTeam")
    @Expose
    private String CloudStudioSessionTeam;

    /**
    * 模板ID
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 工作空间名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 用户所属组 
     * @return CloudStudioSessionTeam 用户所属组
     */
    public String getCloudStudioSessionTeam() {
        return this.CloudStudioSessionTeam;
    }

    /**
     * Set 用户所属组
     * @param CloudStudioSessionTeam 用户所属组
     */
    public void setCloudStudioSessionTeam(String CloudStudioSessionTeam) {
        this.CloudStudioSessionTeam = CloudStudioSessionTeam;
    }

    /**
     * Get 模板ID 
     * @return TemplateId 模板ID
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID
     * @param TemplateId 模板ID
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 工作空间名称 
     * @return Name 工作空间名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 工作空间名称
     * @param Name 工作空间名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public CreateWorkspaceByTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWorkspaceByTemplateRequest(CreateWorkspaceByTemplateRequest source) {
        if (source.CloudStudioSessionTeam != null) {
            this.CloudStudioSessionTeam = new String(source.CloudStudioSessionTeam);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloudStudioSessionTeam", this.CloudStudioSessionTeam);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

