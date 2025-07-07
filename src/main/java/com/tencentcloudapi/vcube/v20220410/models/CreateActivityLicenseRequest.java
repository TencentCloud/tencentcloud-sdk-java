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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateActivityLicenseRequest extends AbstractModel {

    /**
    * 活动Id
    */
    @SerializedName("Activity")
    @Expose
    private String Activity;

    /**
     * Get 活动Id 
     * @return Activity 活动Id
     */
    public String getActivity() {
        return this.Activity;
    }

    /**
     * Set 活动Id
     * @param Activity 活动Id
     */
    public void setActivity(String Activity) {
        this.Activity = Activity;
    }

    public CreateActivityLicenseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateActivityLicenseRequest(CreateActivityLicenseRequest source) {
        if (source.Activity != null) {
            this.Activity = new String(source.Activity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Activity", this.Activity);

    }
}

