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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComponentSeal extends AbstractModel{

    /**
    * 签署区ID
    */
    @SerializedName("ComponentId")
    @Expose
    private String ComponentId;

    /**
    * 印章ID
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
     * Get 签署区ID 
     * @return ComponentId 签署区ID
     */
    public String getComponentId() {
        return this.ComponentId;
    }

    /**
     * Set 签署区ID
     * @param ComponentId 签署区ID
     */
    public void setComponentId(String ComponentId) {
        this.ComponentId = ComponentId;
    }

    /**
     * Get 印章ID 
     * @return SealId 印章ID
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set 印章ID
     * @param SealId 印章ID
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    public ComponentSeal() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComponentSeal(ComponentSeal source) {
        if (source.ComponentId != null) {
            this.ComponentId = new String(source.ComponentId);
        }
        if (source.SealId != null) {
            this.SealId = new String(source.SealId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentId", this.ComponentId);
        this.setParamSimple(map, prefix + "SealId", this.SealId);

    }
}

