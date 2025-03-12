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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PipelineInfo extends AbstractModel {

    /**
    * 聚合运算符：$addFields、$match、$project、$replaceRoot、$redact、$replaceWith、$set、$unset。其中 $replaceWith、$set、$unset 只有当订阅实例是4.2及以上版本可选。
    */
    @SerializedName("AggOp")
    @Expose
    private String AggOp;

    /**
    * 聚合表达式。必须是json格式
    */
    @SerializedName("AggCmd")
    @Expose
    private String AggCmd;

    /**
     * Get 聚合运算符：$addFields、$match、$project、$replaceRoot、$redact、$replaceWith、$set、$unset。其中 $replaceWith、$set、$unset 只有当订阅实例是4.2及以上版本可选。 
     * @return AggOp 聚合运算符：$addFields、$match、$project、$replaceRoot、$redact、$replaceWith、$set、$unset。其中 $replaceWith、$set、$unset 只有当订阅实例是4.2及以上版本可选。
     */
    public String getAggOp() {
        return this.AggOp;
    }

    /**
     * Set 聚合运算符：$addFields、$match、$project、$replaceRoot、$redact、$replaceWith、$set、$unset。其中 $replaceWith、$set、$unset 只有当订阅实例是4.2及以上版本可选。
     * @param AggOp 聚合运算符：$addFields、$match、$project、$replaceRoot、$redact、$replaceWith、$set、$unset。其中 $replaceWith、$set、$unset 只有当订阅实例是4.2及以上版本可选。
     */
    public void setAggOp(String AggOp) {
        this.AggOp = AggOp;
    }

    /**
     * Get 聚合表达式。必须是json格式 
     * @return AggCmd 聚合表达式。必须是json格式
     */
    public String getAggCmd() {
        return this.AggCmd;
    }

    /**
     * Set 聚合表达式。必须是json格式
     * @param AggCmd 聚合表达式。必须是json格式
     */
    public void setAggCmd(String AggCmd) {
        this.AggCmd = AggCmd;
    }

    public PipelineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PipelineInfo(PipelineInfo source) {
        if (source.AggOp != null) {
            this.AggOp = new String(source.AggOp);
        }
        if (source.AggCmd != null) {
            this.AggCmd = new String(source.AggCmd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AggOp", this.AggOp);
        this.setParamSimple(map, prefix + "AggCmd", this.AggCmd);

    }
}

