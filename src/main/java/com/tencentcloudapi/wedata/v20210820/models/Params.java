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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Params extends AbstractModel {

    /**
    * DLC专用：分区字段转换策略
    */
    @SerializedName("Transform")
    @Expose
    private String Transform;

    /**
    * DLC专用：分区字段策略参数
    */
    @SerializedName("TransformArgs")
    @Expose
    private String TransformArgs;

    /**
     * Get DLC专用：分区字段转换策略 
     * @return Transform DLC专用：分区字段转换策略
     */
    public String getTransform() {
        return this.Transform;
    }

    /**
     * Set DLC专用：分区字段转换策略
     * @param Transform DLC专用：分区字段转换策略
     */
    public void setTransform(String Transform) {
        this.Transform = Transform;
    }

    /**
     * Get DLC专用：分区字段策略参数 
     * @return TransformArgs DLC专用：分区字段策略参数
     */
    public String getTransformArgs() {
        return this.TransformArgs;
    }

    /**
     * Set DLC专用：分区字段策略参数
     * @param TransformArgs DLC专用：分区字段策略参数
     */
    public void setTransformArgs(String TransformArgs) {
        this.TransformArgs = TransformArgs;
    }

    public Params() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Params(Params source) {
        if (source.Transform != null) {
            this.Transform = new String(source.Transform);
        }
        if (source.TransformArgs != null) {
            this.TransformArgs = new String(source.TransformArgs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Transform", this.Transform);
        this.setParamSimple(map, prefix + "TransformArgs", this.TransformArgs);

    }
}

