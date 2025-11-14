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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccessWhiteListAutoStatusRequest extends AbstractModel {

    /**
    * true：放开自动添加IP；false：不放开自动添加IP
    */
    @SerializedName("AllowAuto")
    @Expose
    private Boolean AllowAuto;

    /**
     * Get true：放开自动添加IP；false：不放开自动添加IP 
     * @return AllowAuto true：放开自动添加IP；false：不放开自动添加IP
     */
    public Boolean getAllowAuto() {
        return this.AllowAuto;
    }

    /**
     * Set true：放开自动添加IP；false：不放开自动添加IP
     * @param AllowAuto true：放开自动添加IP；false：不放开自动添加IP
     */
    public void setAllowAuto(Boolean AllowAuto) {
        this.AllowAuto = AllowAuto;
    }

    public ModifyAccessWhiteListAutoStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccessWhiteListAutoStatusRequest(ModifyAccessWhiteListAutoStatusRequest source) {
        if (source.AllowAuto != null) {
            this.AllowAuto = new Boolean(source.AllowAuto);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllowAuto", this.AllowAuto);

    }
}

