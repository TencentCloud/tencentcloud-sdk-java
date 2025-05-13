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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserLocation extends AbstractModel {

    /**
    * 表示位置类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 用户近似位置的详细信息
    */
    @SerializedName("Approximate")
    @Expose
    private Approximate Approximate;

    /**
     * Get 表示位置类型 
     * @return Type 表示位置类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 表示位置类型
     * @param Type 表示位置类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 用户近似位置的详细信息 
     * @return Approximate 用户近似位置的详细信息
     */
    public Approximate getApproximate() {
        return this.Approximate;
    }

    /**
     * Set 用户近似位置的详细信息
     * @param Approximate 用户近似位置的详细信息
     */
    public void setApproximate(Approximate Approximate) {
        this.Approximate = Approximate;
    }

    public UserLocation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserLocation(UserLocation source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Approximate != null) {
            this.Approximate = new Approximate(source.Approximate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Approximate.", this.Approximate);

    }
}

