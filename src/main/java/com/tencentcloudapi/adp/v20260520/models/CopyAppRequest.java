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

public class CopyAppRequest extends AbstractModel {

    /**
    * app_id
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * target_space_id
    */
    @SerializedName("TargetSpaceId")
    @Expose
    private String TargetSpaceId;

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
     * Get target_space_id 
     * @return TargetSpaceId target_space_id
     */
    public String getTargetSpaceId() {
        return this.TargetSpaceId;
    }

    /**
     * Set target_space_id
     * @param TargetSpaceId target_space_id
     */
    public void setTargetSpaceId(String TargetSpaceId) {
        this.TargetSpaceId = TargetSpaceId;
    }

    public CopyAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyAppRequest(CopyAppRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.TargetSpaceId != null) {
            this.TargetSpaceId = new String(source.TargetSpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "TargetSpaceId", this.TargetSpaceId);

    }
}

