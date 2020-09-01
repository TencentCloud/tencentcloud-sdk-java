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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtensionAddon extends AbstractModel{

    /**
    * 扩展组件名称
    */
    @SerializedName("AddonName")
    @Expose
    private String AddonName;

    /**
    * 扩展组件信息(扩展组件资源对象的json字符串描述)
    */
    @SerializedName("AddonParam")
    @Expose
    private String AddonParam;

    /**
     * Get 扩展组件名称 
     * @return AddonName 扩展组件名称
     */
    public String getAddonName() {
        return this.AddonName;
    }

    /**
     * Set 扩展组件名称
     * @param AddonName 扩展组件名称
     */
    public void setAddonName(String AddonName) {
        this.AddonName = AddonName;
    }

    /**
     * Get 扩展组件信息(扩展组件资源对象的json字符串描述) 
     * @return AddonParam 扩展组件信息(扩展组件资源对象的json字符串描述)
     */
    public String getAddonParam() {
        return this.AddonParam;
    }

    /**
     * Set 扩展组件信息(扩展组件资源对象的json字符串描述)
     * @param AddonParam 扩展组件信息(扩展组件资源对象的json字符串描述)
     */
    public void setAddonParam(String AddonParam) {
        this.AddonParam = AddonParam;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddonName", this.AddonName);
        this.setParamSimple(map, prefix + "AddonParam", this.AddonParam);

    }
}

