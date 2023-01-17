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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteConfigTemplateRequest extends AbstractModel{

    /**
    * 无
    */
    @SerializedName("ConfigTemplateId")
    @Expose
    private String ConfigTemplateId;

    /**
     * Get 无 
     * @return ConfigTemplateId 无
     */
    public String getConfigTemplateId() {
        return this.ConfigTemplateId;
    }

    /**
     * Set 无
     * @param ConfigTemplateId 无
     */
    public void setConfigTemplateId(String ConfigTemplateId) {
        this.ConfigTemplateId = ConfigTemplateId;
    }

    public DeleteConfigTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteConfigTemplateRequest(DeleteConfigTemplateRequest source) {
        if (source.ConfigTemplateId != null) {
            this.ConfigTemplateId = new String(source.ConfigTemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigTemplateId", this.ConfigTemplateId);

    }
}

