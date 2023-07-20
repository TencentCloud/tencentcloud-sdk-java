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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopBaselineRequest extends AbstractModel{

    /**
    * 1
    */
    @SerializedName("BaselineId")
    @Expose
    private String BaselineId;

    /**
    * 1
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 1 
     * @return BaselineId 1
     */
    public String getBaselineId() {
        return this.BaselineId;
    }

    /**
     * Set 1
     * @param BaselineId 1
     */
    public void setBaselineId(String BaselineId) {
        this.BaselineId = BaselineId;
    }

    /**
     * Get 1 
     * @return ProjectId 1
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 1
     * @param ProjectId 1
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public StopBaselineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopBaselineRequest(StopBaselineRequest source) {
        if (source.BaselineId != null) {
            this.BaselineId = new String(source.BaselineId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BaselineId", this.BaselineId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

