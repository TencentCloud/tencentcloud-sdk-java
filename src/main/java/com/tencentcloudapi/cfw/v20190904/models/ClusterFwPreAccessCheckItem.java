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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterFwPreAccessCheckItem extends AbstractModel {

    /**
    * 检查项 key，与查询接口 CheckResult.Stages[].Stage 一一对应
    */
    @SerializedName("Stage")
    @Expose
    private String Stage;

    /**
    * 该检查项的展示文案，已按请求的 Language 返回中文或英文
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 检查项 key，与查询接口 CheckResult.Stages[].Stage 一一对应 
     * @return Stage 检查项 key，与查询接口 CheckResult.Stages[].Stage 一一对应
     */
    public String getStage() {
        return this.Stage;
    }

    /**
     * Set 检查项 key，与查询接口 CheckResult.Stages[].Stage 一一对应
     * @param Stage 检查项 key，与查询接口 CheckResult.Stages[].Stage 一一对应
     */
    public void setStage(String Stage) {
        this.Stage = Stage;
    }

    /**
     * Get 该检查项的展示文案，已按请求的 Language 返回中文或英文 
     * @return Description 该检查项的展示文案，已按请求的 Language 返回中文或英文
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 该检查项的展示文案，已按请求的 Language 返回中文或英文
     * @param Description 该检查项的展示文案，已按请求的 Language 返回中文或英文
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ClusterFwPreAccessCheckItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterFwPreAccessCheckItem(ClusterFwPreAccessCheckItem source) {
        if (source.Stage != null) {
            this.Stage = new String(source.Stage);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Stage", this.Stage);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

