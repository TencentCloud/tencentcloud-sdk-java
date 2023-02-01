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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAppDetailRequest extends AbstractModel{

    /**
    * 应用ID。低代码互动课堂的SdkAppId。

    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 开发商ID
    */
    @SerializedName("DeveloperId")
    @Expose
    private String DeveloperId;

    /**
     * Get 应用ID。低代码互动课堂的SdkAppId。
 
     * @return ApplicationId 应用ID。低代码互动课堂的SdkAppId。

     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID。低代码互动课堂的SdkAppId。

     * @param ApplicationId 应用ID。低代码互动课堂的SdkAppId。

     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 开发商ID 
     * @return DeveloperId 开发商ID
     */
    public String getDeveloperId() {
        return this.DeveloperId;
    }

    /**
     * Set 开发商ID
     * @param DeveloperId 开发商ID
     */
    public void setDeveloperId(String DeveloperId) {
        this.DeveloperId = DeveloperId;
    }

    public DescribeAppDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAppDetailRequest(DescribeAppDetailRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.DeveloperId != null) {
            this.DeveloperId = new String(source.DeveloperId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "DeveloperId", this.DeveloperId);

    }
}

