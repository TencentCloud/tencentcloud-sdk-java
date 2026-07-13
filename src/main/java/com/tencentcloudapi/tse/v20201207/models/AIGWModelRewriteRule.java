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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWModelRewriteRule extends AbstractModel {

    /**
    * <p>原始模型</p>
    */
    @SerializedName("SourceModel")
    @Expose
    private String SourceModel;

    /**
    * <p>目标模型</p>
    */
    @SerializedName("TargetModel")
    @Expose
    private String TargetModel;

    /**
     * Get <p>原始模型</p> 
     * @return SourceModel <p>原始模型</p>
     */
    public String getSourceModel() {
        return this.SourceModel;
    }

    /**
     * Set <p>原始模型</p>
     * @param SourceModel <p>原始模型</p>
     */
    public void setSourceModel(String SourceModel) {
        this.SourceModel = SourceModel;
    }

    /**
     * Get <p>目标模型</p> 
     * @return TargetModel <p>目标模型</p>
     */
    public String getTargetModel() {
        return this.TargetModel;
    }

    /**
     * Set <p>目标模型</p>
     * @param TargetModel <p>目标模型</p>
     */
    public void setTargetModel(String TargetModel) {
        this.TargetModel = TargetModel;
    }

    public AIGWModelRewriteRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWModelRewriteRule(AIGWModelRewriteRule source) {
        if (source.SourceModel != null) {
            this.SourceModel = new String(source.SourceModel);
        }
        if (source.TargetModel != null) {
            this.TargetModel = new String(source.TargetModel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceModel", this.SourceModel);
        this.setParamSimple(map, prefix + "TargetModel", this.TargetModel);

    }
}

