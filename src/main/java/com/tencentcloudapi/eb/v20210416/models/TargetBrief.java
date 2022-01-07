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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetBrief extends AbstractModel{

    /**
    * 目标ID
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * 目标类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 目标ID 
     * @return TargetId 目标ID
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set 目标ID
     * @param TargetId 目标ID
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get 目标类型 
     * @return Type 目标类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 目标类型
     * @param Type 目标类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public TargetBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetBrief(TargetBrief source) {
        if (source.TargetId != null) {
            this.TargetId = new String(source.TargetId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

