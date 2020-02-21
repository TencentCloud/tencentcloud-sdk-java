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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListLayerVersionsRequest extends AbstractModel{

    /**
    * 层名称
    */
    @SerializedName("LayerName")
    @Expose
    private String LayerName;

    /**
    * 适配的运行时
    */
    @SerializedName("CompatibleRuntime")
    @Expose
    private String [] CompatibleRuntime;

    /**
     * Get 层名称 
     * @return LayerName 层名称
     */
    public String getLayerName() {
        return this.LayerName;
    }

    /**
     * Set 层名称
     * @param LayerName 层名称
     */
    public void setLayerName(String LayerName) {
        this.LayerName = LayerName;
    }

    /**
     * Get 适配的运行时 
     * @return CompatibleRuntime 适配的运行时
     */
    public String [] getCompatibleRuntime() {
        return this.CompatibleRuntime;
    }

    /**
     * Set 适配的运行时
     * @param CompatibleRuntime 适配的运行时
     */
    public void setCompatibleRuntime(String [] CompatibleRuntime) {
        this.CompatibleRuntime = CompatibleRuntime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LayerName", this.LayerName);
        this.setParamArraySimple(map, prefix + "CompatibleRuntime.", this.CompatibleRuntime);

    }
}

