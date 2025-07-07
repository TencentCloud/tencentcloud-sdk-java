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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceByCycleRequest extends AbstractModel {

    /**
    * 1
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 1
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

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

    /**
     * Get 1 
     * @return TenantId 1
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 1
     * @param TenantId 1
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    public DescribeInstanceByCycleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceByCycleRequest(DescribeInstanceByCycleRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);

    }
}

