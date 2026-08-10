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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VPRRatingStage extends AbstractModel {

    /**
    * 阶段名称（例如：威胁活跃度、可利用性、漏洞严重性等）
    */
    @SerializedName("Stage")
    @Expose
    private String Stage;

    /**
    * 该阶段的评级结果
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
     * Get 阶段名称（例如：威胁活跃度、可利用性、漏洞严重性等） 
     * @return Stage 阶段名称（例如：威胁活跃度、可利用性、漏洞严重性等）
     */
    public String getStage() {
        return this.Stage;
    }

    /**
     * Set 阶段名称（例如：威胁活跃度、可利用性、漏洞严重性等）
     * @param Stage 阶段名称（例如：威胁活跃度、可利用性、漏洞严重性等）
     */
    public void setStage(String Stage) {
        this.Stage = Stage;
    }

    /**
     * Get 该阶段的评级结果 
     * @return Result 该阶段的评级结果
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 该阶段的评级结果
     * @param Result 该阶段的评级结果
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    public VPRRatingStage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VPRRatingStage(VPRRatingStage source) {
        if (source.Stage != null) {
            this.Stage = new String(source.Stage);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Stage", this.Stage);
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

