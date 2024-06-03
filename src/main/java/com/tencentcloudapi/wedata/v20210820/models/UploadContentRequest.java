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

public class UploadContentRequest extends AbstractModel {

    /**
    * 脚本上传信息
    */
    @SerializedName("ScriptRequestInfo")
    @Expose
    private ScriptRequestInfo ScriptRequestInfo;

    /**
    * 请求来源，WEB 前端；CLIENT 客户端
    */
    @SerializedName("RequestFromSource")
    @Expose
    private String RequestFromSource;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 脚本上传信息 
     * @return ScriptRequestInfo 脚本上传信息
     */
    public ScriptRequestInfo getScriptRequestInfo() {
        return this.ScriptRequestInfo;
    }

    /**
     * Set 脚本上传信息
     * @param ScriptRequestInfo 脚本上传信息
     */
    public void setScriptRequestInfo(ScriptRequestInfo ScriptRequestInfo) {
        this.ScriptRequestInfo = ScriptRequestInfo;
    }

    /**
     * Get 请求来源，WEB 前端；CLIENT 客户端 
     * @return RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
     */
    public String getRequestFromSource() {
        return this.RequestFromSource;
    }

    /**
     * Set 请求来源，WEB 前端；CLIENT 客户端
     * @param RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
     */
    public void setRequestFromSource(String RequestFromSource) {
        this.RequestFromSource = RequestFromSource;
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

    public UploadContentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadContentRequest(UploadContentRequest source) {
        if (source.ScriptRequestInfo != null) {
            this.ScriptRequestInfo = new ScriptRequestInfo(source.ScriptRequestInfo);
        }
        if (source.RequestFromSource != null) {
            this.RequestFromSource = new String(source.RequestFromSource);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ScriptRequestInfo.", this.ScriptRequestInfo);
        this.setParamSimple(map, prefix + "RequestFromSource", this.RequestFromSource);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

