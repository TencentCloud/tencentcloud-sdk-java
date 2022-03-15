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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteConfigExtraRequest extends AbstractModel{

    /**
    * 采集规则扩展配置ID
    */
    @SerializedName("ConfigExtraId")
    @Expose
    private String ConfigExtraId;

    /**
     * Get 采集规则扩展配置ID 
     * @return ConfigExtraId 采集规则扩展配置ID
     */
    public String getConfigExtraId() {
        return this.ConfigExtraId;
    }

    /**
     * Set 采集规则扩展配置ID
     * @param ConfigExtraId 采集规则扩展配置ID
     */
    public void setConfigExtraId(String ConfigExtraId) {
        this.ConfigExtraId = ConfigExtraId;
    }

    public DeleteConfigExtraRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteConfigExtraRequest(DeleteConfigExtraRequest source) {
        if (source.ConfigExtraId != null) {
            this.ConfigExtraId = new String(source.ConfigExtraId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigExtraId", this.ConfigExtraId);

    }
}

