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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReleaseSummaryRequest extends AbstractModel {

    /**
    * app_id
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * release_id
    */
    @SerializedName("ReleaseId")
    @Expose
    private String ReleaseId;

    /**
     * Get app_id 
     * @return AppId app_id
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set app_id
     * @param AppId app_id
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get release_id 
     * @return ReleaseId release_id
     */
    public String getReleaseId() {
        return this.ReleaseId;
    }

    /**
     * Set release_id
     * @param ReleaseId release_id
     */
    public void setReleaseId(String ReleaseId) {
        this.ReleaseId = ReleaseId;
    }

    public DescribeReleaseSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReleaseSummaryRequest(DescribeReleaseSummaryRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ReleaseId != null) {
            this.ReleaseId = new String(source.ReleaseId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ReleaseId", this.ReleaseId);

    }
}

