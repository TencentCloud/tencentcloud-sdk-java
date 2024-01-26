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

public class GetAdvanceRunParamsRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 远程路径
    */
    @SerializedName("RemotePath")
    @Expose
    private String RemotePath;

    /**
    * 高级运行参数
    */
    @SerializedName("AdvanceRunParam")
    @Expose
    private String AdvanceRunParam;

    /**
    * 原始未过滤的高级运行参数
    */
    @SerializedName("OriginalParams")
    @Expose
    private String [] OriginalParams;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 远程路径 
     * @return RemotePath 远程路径
     */
    public String getRemotePath() {
        return this.RemotePath;
    }

    /**
     * Set 远程路径
     * @param RemotePath 远程路径
     */
    public void setRemotePath(String RemotePath) {
        this.RemotePath = RemotePath;
    }

    /**
     * Get 高级运行参数 
     * @return AdvanceRunParam 高级运行参数
     */
    public String getAdvanceRunParam() {
        return this.AdvanceRunParam;
    }

    /**
     * Set 高级运行参数
     * @param AdvanceRunParam 高级运行参数
     */
    public void setAdvanceRunParam(String AdvanceRunParam) {
        this.AdvanceRunParam = AdvanceRunParam;
    }

    /**
     * Get 原始未过滤的高级运行参数 
     * @return OriginalParams 原始未过滤的高级运行参数
     */
    public String [] getOriginalParams() {
        return this.OriginalParams;
    }

    /**
     * Set 原始未过滤的高级运行参数
     * @param OriginalParams 原始未过滤的高级运行参数
     */
    public void setOriginalParams(String [] OriginalParams) {
        this.OriginalParams = OriginalParams;
    }

    public GetAdvanceRunParamsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAdvanceRunParamsRequest(GetAdvanceRunParamsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RemotePath != null) {
            this.RemotePath = new String(source.RemotePath);
        }
        if (source.AdvanceRunParam != null) {
            this.AdvanceRunParam = new String(source.AdvanceRunParam);
        }
        if (source.OriginalParams != null) {
            this.OriginalParams = new String[source.OriginalParams.length];
            for (int i = 0; i < source.OriginalParams.length; i++) {
                this.OriginalParams[i] = new String(source.OriginalParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RemotePath", this.RemotePath);
        this.setParamSimple(map, prefix + "AdvanceRunParam", this.AdvanceRunParam);
        this.setParamArraySimple(map, prefix + "OriginalParams.", this.OriginalParams);

    }
}

