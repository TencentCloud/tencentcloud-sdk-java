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

public class ModifyWorkspaceAttributesRequest extends AbstractModel{

    /**
    * 用户所属组
    */
    @SerializedName("CloudStudioSessionTeam")
    @Expose
    private String CloudStudioSessionTeam;

    /**
    * 工作空间ID
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 工作空间名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 工作空间描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * xxx
    */
    @SerializedName("PriceId")
    @Expose
    private Long PriceId;

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
     * Get 工作空间ID 
     * @return WorkspaceId 工作空间ID
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间ID
     * @param WorkspaceId 工作空间ID
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
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

    /**
     * Get 工作空间描述 
     * @return Description 工作空间描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 工作空间描述
     * @param Description 工作空间描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get xxx 
     * @return PriceId xxx
     */
    public Long getPriceId() {
        return this.PriceId;
    }

    /**
     * Set xxx
     * @param PriceId xxx
     */
    public void setPriceId(Long PriceId) {
        this.PriceId = PriceId;
    }

    public ModifyWorkspaceAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWorkspaceAttributesRequest(ModifyWorkspaceAttributesRequest source) {
        if (source.CloudStudioSessionTeam != null) {
            this.CloudStudioSessionTeam = new String(source.CloudStudioSessionTeam);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PriceId != null) {
            this.PriceId = new Long(source.PriceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloudStudioSessionTeam", this.CloudStudioSessionTeam);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PriceId", this.PriceId);

    }
}

