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

public class AdInfo extends AbstractModel{

    /**
    * 插播广告列表
    */
    @SerializedName("Spots")
    @Expose
    private PluginInfo [] Spots;

    /**
    * 精品推荐广告列表
    */
    @SerializedName("BoutiqueRecommands")
    @Expose
    private PluginInfo [] BoutiqueRecommands;

    /**
    * 悬浮窗广告列表
    */
    @SerializedName("FloatWindowses")
    @Expose
    private PluginInfo [] FloatWindowses;

    /**
    * banner广告列表
    */
    @SerializedName("Banners")
    @Expose
    private PluginInfo [] Banners;

    /**
    * 积分墙广告列表
    */
    @SerializedName("IntegralWalls")
    @Expose
    private PluginInfo [] IntegralWalls;

    /**
    * 通知栏广告列表
    */
    @SerializedName("NotifyBars")
    @Expose
    private PluginInfo [] NotifyBars;

    /**
     * Get 插播广告列表 
     * @return Spots 插播广告列表
     */
    public PluginInfo [] getSpots() {
        return this.Spots;
    }

    /**
     * Set 插播广告列表
     * @param Spots 插播广告列表
     */
    public void setSpots(PluginInfo [] Spots) {
        this.Spots = Spots;
    }

    /**
     * Get 精品推荐广告列表 
     * @return BoutiqueRecommands 精品推荐广告列表
     */
    public PluginInfo [] getBoutiqueRecommands() {
        return this.BoutiqueRecommands;
    }

    /**
     * Set 精品推荐广告列表
     * @param BoutiqueRecommands 精品推荐广告列表
     */
    public void setBoutiqueRecommands(PluginInfo [] BoutiqueRecommands) {
        this.BoutiqueRecommands = BoutiqueRecommands;
    }

    /**
     * Get 悬浮窗广告列表 
     * @return FloatWindowses 悬浮窗广告列表
     */
    public PluginInfo [] getFloatWindowses() {
        return this.FloatWindowses;
    }

    /**
     * Set 悬浮窗广告列表
     * @param FloatWindowses 悬浮窗广告列表
     */
    public void setFloatWindowses(PluginInfo [] FloatWindowses) {
        this.FloatWindowses = FloatWindowses;
    }

    /**
     * Get banner广告列表 
     * @return Banners banner广告列表
     */
    public PluginInfo [] getBanners() {
        return this.Banners;
    }

    /**
     * Set banner广告列表
     * @param Banners banner广告列表
     */
    public void setBanners(PluginInfo [] Banners) {
        this.Banners = Banners;
    }

    /**
     * Get 积分墙广告列表 
     * @return IntegralWalls 积分墙广告列表
     */
    public PluginInfo [] getIntegralWalls() {
        return this.IntegralWalls;
    }

    /**
     * Set 积分墙广告列表
     * @param IntegralWalls 积分墙广告列表
     */
    public void setIntegralWalls(PluginInfo [] IntegralWalls) {
        this.IntegralWalls = IntegralWalls;
    }

    /**
     * Get 通知栏广告列表 
     * @return NotifyBars 通知栏广告列表
     */
    public PluginInfo [] getNotifyBars() {
        return this.NotifyBars;
    }

    /**
     * Set 通知栏广告列表
     * @param NotifyBars 通知栏广告列表
     */
    public void setNotifyBars(PluginInfo [] NotifyBars) {
        this.NotifyBars = NotifyBars;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Spots.", this.Spots);
        this.setParamArrayObj(map, prefix + "BoutiqueRecommands.", this.BoutiqueRecommands);
        this.setParamArrayObj(map, prefix + "FloatWindowses.", this.FloatWindowses);
        this.setParamArrayObj(map, prefix + "Banners.", this.Banners);
        this.setParamArrayObj(map, prefix + "IntegralWalls.", this.IntegralWalls);
        this.setParamArrayObj(map, prefix + "NotifyBars.", this.NotifyBars);

    }
}

