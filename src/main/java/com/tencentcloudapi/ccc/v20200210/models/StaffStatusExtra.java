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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StaffStatusExtra extends AbstractModel{

    /**
    * im - 文本 | tel - 电话 | all - 全媒体
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * in - 呼入 | out - 呼出
    */
    @SerializedName("Direct")
    @Expose
    private String Direct;

    /**
     * Get im - 文本 | tel - 电话 | all - 全媒体 
     * @return Type im - 文本 | tel - 电话 | all - 全媒体
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set im - 文本 | tel - 电话 | all - 全媒体
     * @param Type im - 文本 | tel - 电话 | all - 全媒体
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get in - 呼入 | out - 呼出 
     * @return Direct in - 呼入 | out - 呼出
     */
    public String getDirect() {
        return this.Direct;
    }

    /**
     * Set in - 呼入 | out - 呼出
     * @param Direct in - 呼入 | out - 呼出
     */
    public void setDirect(String Direct) {
        this.Direct = Direct;
    }

    public StaffStatusExtra() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaffStatusExtra(StaffStatusExtra source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Direct != null) {
            this.Direct = new String(source.Direct);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Direct", this.Direct);

    }
}

