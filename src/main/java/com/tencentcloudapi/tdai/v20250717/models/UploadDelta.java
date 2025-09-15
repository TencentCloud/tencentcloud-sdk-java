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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadDelta extends AbstractModel {

    /**
    * 步骤摘要
    */
    @SerializedName("StepBrief")
    @Expose
    private String StepBrief;

    /**
    * 步骤详情
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 步骤摘要 
     * @return StepBrief 步骤摘要
     */
    public String getStepBrief() {
        return this.StepBrief;
    }

    /**
     * Set 步骤摘要
     * @param StepBrief 步骤摘要
     */
    public void setStepBrief(String StepBrief) {
        this.StepBrief = StepBrief;
    }

    /**
     * Get 步骤详情 
     * @return Content 步骤详情
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 步骤详情
     * @param Content 步骤详情
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public UploadDelta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadDelta(UploadDelta source) {
        if (source.StepBrief != null) {
            this.StepBrief = new String(source.StepBrief);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepBrief", this.StepBrief);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

