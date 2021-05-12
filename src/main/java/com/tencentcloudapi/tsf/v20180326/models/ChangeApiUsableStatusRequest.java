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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChangeApiUsableStatusRequest extends AbstractModel{

    /**
    * API ID
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * 切换状态，enabled/disabled
    */
    @SerializedName("UsableStatus")
    @Expose
    private String UsableStatus;

    /**
     * Get API ID 
     * @return ApiId API ID
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set API ID
     * @param ApiId API ID
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get 切换状态，enabled/disabled 
     * @return UsableStatus 切换状态，enabled/disabled
     */
    public String getUsableStatus() {
        return this.UsableStatus;
    }

    /**
     * Set 切换状态，enabled/disabled
     * @param UsableStatus 切换状态，enabled/disabled
     */
    public void setUsableStatus(String UsableStatus) {
        this.UsableStatus = UsableStatus;
    }

    public ChangeApiUsableStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangeApiUsableStatusRequest(ChangeApiUsableStatusRequest source) {
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.UsableStatus != null) {
            this.UsableStatus = new String(source.UsableStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "UsableStatus", this.UsableStatus);

    }
}

