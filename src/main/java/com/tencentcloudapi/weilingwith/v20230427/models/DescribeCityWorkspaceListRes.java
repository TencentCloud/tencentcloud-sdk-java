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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCityWorkspaceListRes extends AbstractModel {

    /**
    * 通过城市id查询工作空间列表结果
    */
    @SerializedName("WorkspaceSet")
    @Expose
    private WorkspaceInfo [] WorkspaceSet;

    /**
     * Get 通过城市id查询工作空间列表结果 
     * @return WorkspaceSet 通过城市id查询工作空间列表结果
     */
    public WorkspaceInfo [] getWorkspaceSet() {
        return this.WorkspaceSet;
    }

    /**
     * Set 通过城市id查询工作空间列表结果
     * @param WorkspaceSet 通过城市id查询工作空间列表结果
     */
    public void setWorkspaceSet(WorkspaceInfo [] WorkspaceSet) {
        this.WorkspaceSet = WorkspaceSet;
    }

    public DescribeCityWorkspaceListRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCityWorkspaceListRes(DescribeCityWorkspaceListRes source) {
        if (source.WorkspaceSet != null) {
            this.WorkspaceSet = new WorkspaceInfo[source.WorkspaceSet.length];
            for (int i = 0; i < source.WorkspaceSet.length; i++) {
                this.WorkspaceSet[i] = new WorkspaceInfo(source.WorkspaceSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "WorkspaceSet.", this.WorkspaceSet);

    }
}

