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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FormField extends AbstractModel{

    /**
    * 控件填充value
    */
    @SerializedName("ComponentValue")
    @Expose
    private String ComponentValue;

    /**
    * 控件id
    */
    @SerializedName("ComponentId")
    @Expose
    private String ComponentId;

    /**
    * 控件名字
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
     * Get 控件填充value 
     * @return ComponentValue 控件填充value
     */
    public String getComponentValue() {
        return this.ComponentValue;
    }

    /**
     * Set 控件填充value
     * @param ComponentValue 控件填充value
     */
    public void setComponentValue(String ComponentValue) {
        this.ComponentValue = ComponentValue;
    }

    /**
     * Get 控件id 
     * @return ComponentId 控件id
     */
    public String getComponentId() {
        return this.ComponentId;
    }

    /**
     * Set 控件id
     * @param ComponentId 控件id
     */
    public void setComponentId(String ComponentId) {
        this.ComponentId = ComponentId;
    }

    /**
     * Get 控件名字 
     * @return ComponentName 控件名字
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set 控件名字
     * @param ComponentName 控件名字
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    public FormField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FormField(FormField source) {
        if (source.ComponentValue != null) {
            this.ComponentValue = new String(source.ComponentValue);
        }
        if (source.ComponentId != null) {
            this.ComponentId = new String(source.ComponentId);
        }
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentValue", this.ComponentValue);
        this.setParamSimple(map, prefix + "ComponentId", this.ComponentId);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);

    }
}

