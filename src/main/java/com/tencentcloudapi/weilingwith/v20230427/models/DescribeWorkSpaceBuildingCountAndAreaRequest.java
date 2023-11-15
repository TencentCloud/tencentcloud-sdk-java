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

public class DescribeWorkSpaceBuildingCountAndAreaRequest extends AbstractModel {

    /**
    * 工作空间ID列表
    */
    @SerializedName("WorkspaceIdList")
    @Expose
    private String [] WorkspaceIdList;

    /**
    * 应用token
    */
    @SerializedName("ApplicationToken")
    @Expose
    private String ApplicationToken;

    /**
     * Get 工作空间ID列表 
     * @return WorkspaceIdList 工作空间ID列表
     */
    public String [] getWorkspaceIdList() {
        return this.WorkspaceIdList;
    }

    /**
     * Set 工作空间ID列表
     * @param WorkspaceIdList 工作空间ID列表
     */
    public void setWorkspaceIdList(String [] WorkspaceIdList) {
        this.WorkspaceIdList = WorkspaceIdList;
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

    public DescribeWorkSpaceBuildingCountAndAreaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWorkSpaceBuildingCountAndAreaRequest(DescribeWorkSpaceBuildingCountAndAreaRequest source) {
        if (source.WorkspaceIdList != null) {
            this.WorkspaceIdList = new String[source.WorkspaceIdList.length];
            for (int i = 0; i < source.WorkspaceIdList.length; i++) {
                this.WorkspaceIdList[i] = new String(source.WorkspaceIdList[i]);
            }
        }
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "WorkspaceIdList.", this.WorkspaceIdList);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);

    }
}

