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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBuildingListRequest extends AbstractModel {

    /**
    * 项目空间id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * 应用token
    */
    @SerializedName("ApplicationToken")
    @Expose
    private String ApplicationToken;

    /**
    * 是否有模型文件
    */
    @SerializedName("HasModel")
    @Expose
    private Boolean HasModel;

    /**
    * 空间编码
    */
    @SerializedName("SpaceCodes")
    @Expose
    private String [] SpaceCodes;

    /**
     * Get 项目空间id 
     * @return WorkspaceId 项目空间id
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 项目空间id
     * @param WorkspaceId 项目空间id
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 应用token 
     * @return ApplicationToken 应用token
     */
    public String getApplicationToken() {
        return this.ApplicationToken;
    }

    /**
     * Set 应用token
     * @param ApplicationToken 应用token
     */
    public void setApplicationToken(String ApplicationToken) {
        this.ApplicationToken = ApplicationToken;
    }

    /**
     * Get 是否有模型文件 
     * @return HasModel 是否有模型文件
     */
    public Boolean getHasModel() {
        return this.HasModel;
    }

    /**
     * Set 是否有模型文件
     * @param HasModel 是否有模型文件
     */
    public void setHasModel(Boolean HasModel) {
        this.HasModel = HasModel;
    }

    /**
     * Get 空间编码 
     * @return SpaceCodes 空间编码
     */
    public String [] getSpaceCodes() {
        return this.SpaceCodes;
    }

    /**
     * Set 空间编码
     * @param SpaceCodes 空间编码
     */
    public void setSpaceCodes(String [] SpaceCodes) {
        this.SpaceCodes = SpaceCodes;
    }

    public DescribeBuildingListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBuildingListRequest(DescribeBuildingListRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
        if (source.HasModel != null) {
            this.HasModel = new Boolean(source.HasModel);
        }
        if (source.SpaceCodes != null) {
            this.SpaceCodes = new String[source.SpaceCodes.length];
            for (int i = 0; i < source.SpaceCodes.length; i++) {
                this.SpaceCodes[i] = new String(source.SpaceCodes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);
        this.setParamSimple(map, prefix + "HasModel", this.HasModel);
        this.setParamArraySimple(map, prefix + "SpaceCodes.", this.SpaceCodes);

    }
}

