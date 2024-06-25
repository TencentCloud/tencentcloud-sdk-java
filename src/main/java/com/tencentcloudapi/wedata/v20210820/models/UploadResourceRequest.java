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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadResourceRequest extends AbstractModel {

    /**
    * 资源上传请求信息
    */
    @SerializedName("UploadResourceRequestInfo")
    @Expose
    private UploadResourceRequestInfo UploadResourceRequestInfo;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 资源上传请求信息 
     * @return UploadResourceRequestInfo 资源上传请求信息
     */
    public UploadResourceRequestInfo getUploadResourceRequestInfo() {
        return this.UploadResourceRequestInfo;
    }

    /**
     * Set 资源上传请求信息
     * @param UploadResourceRequestInfo 资源上传请求信息
     */
    public void setUploadResourceRequestInfo(UploadResourceRequestInfo UploadResourceRequestInfo) {
        this.UploadResourceRequestInfo = UploadResourceRequestInfo;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public UploadResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadResourceRequest(UploadResourceRequest source) {
        if (source.UploadResourceRequestInfo != null) {
            this.UploadResourceRequestInfo = new UploadResourceRequestInfo(source.UploadResourceRequestInfo);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UploadResourceRequestInfo.", this.UploadResourceRequestInfo);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

