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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PluginInfo extends AbstractModel{

    /**
    * 插件类型，分别为 1-通知栏广告，2-积分墙广告，3-banner广告，4- 悬浮窗图标广告，5-精品推荐列表广告, 6-插播广告
    */
    @SerializedName("PluginType")
    @Expose
    private Long PluginType;

    /**
    * 插件名称
    */
    @SerializedName("PluginName")
    @Expose
    private String PluginName;

    /**
    * 插件描述
    */
    @SerializedName("PluginDesc")
    @Expose
    private String PluginDesc;

    /**
     * Get 插件类型，分别为 1-通知栏广告，2-积分墙广告，3-banner广告，4- 悬浮窗图标广告，5-精品推荐列表广告, 6-插播广告 
     * @return PluginType 插件类型，分别为 1-通知栏广告，2-积分墙广告，3-banner广告，4- 悬浮窗图标广告，5-精品推荐列表广告, 6-插播广告
     */
    public Long getPluginType() {
        return this.PluginType;
    }

    /**
     * Set 插件类型，分别为 1-通知栏广告，2-积分墙广告，3-banner广告，4- 悬浮窗图标广告，5-精品推荐列表广告, 6-插播广告
     * @param PluginType 插件类型，分别为 1-通知栏广告，2-积分墙广告，3-banner广告，4- 悬浮窗图标广告，5-精品推荐列表广告, 6-插播广告
     */
    public void setPluginType(Long PluginType) {
        this.PluginType = PluginType;
    }

    /**
     * Get 插件名称 
     * @return PluginName 插件名称
     */
    public String getPluginName() {
        return this.PluginName;
    }

    /**
     * Set 插件名称
     * @param PluginName 插件名称
     */
    public void setPluginName(String PluginName) {
        this.PluginName = PluginName;
    }

    /**
     * Get 插件描述 
     * @return PluginDesc 插件描述
     */
    public String getPluginDesc() {
        return this.PluginDesc;
    }

    /**
     * Set 插件描述
     * @param PluginDesc 插件描述
     */
    public void setPluginDesc(String PluginDesc) {
        this.PluginDesc = PluginDesc;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginType", this.PluginType);
        this.setParamSimple(map, prefix + "PluginName", this.PluginName);
        this.setParamSimple(map, prefix + "PluginDesc", this.PluginDesc);

    }
}

