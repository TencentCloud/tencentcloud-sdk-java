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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CaptchaOperDataInterceptUnit extends AbstractModel{

    /**
    * 时间
    */
    @SerializedName("DateKey")
    @Expose
    private String DateKey;

    /**
    * 停止验证数量
    */
    @SerializedName("AllStopCnt")
    @Expose
    private Float AllStopCnt;

    /**
    * 图片停止加载数量
    */
    @SerializedName("PicStopCnt")
    @Expose
    private Float PicStopCnt;

    /**
    * 策略拦截数量
    */
    @SerializedName("StrategyStopCnt")
    @Expose
    private Float StrategyStopCnt;

    /**
     * Get 时间 
     * @return DateKey 时间
     */
    public String getDateKey() {
        return this.DateKey;
    }

    /**
     * Set 时间
     * @param DateKey 时间
     */
    public void setDateKey(String DateKey) {
        this.DateKey = DateKey;
    }

    /**
     * Get 停止验证数量 
     * @return AllStopCnt 停止验证数量
     */
    public Float getAllStopCnt() {
        return this.AllStopCnt;
    }

    /**
     * Set 停止验证数量
     * @param AllStopCnt 停止验证数量
     */
    public void setAllStopCnt(Float AllStopCnt) {
        this.AllStopCnt = AllStopCnt;
    }

    /**
     * Get 图片停止加载数量 
     * @return PicStopCnt 图片停止加载数量
     */
    public Float getPicStopCnt() {
        return this.PicStopCnt;
    }

    /**
     * Set 图片停止加载数量
     * @param PicStopCnt 图片停止加载数量
     */
    public void setPicStopCnt(Float PicStopCnt) {
        this.PicStopCnt = PicStopCnt;
    }

    /**
     * Get 策略拦截数量 
     * @return StrategyStopCnt 策略拦截数量
     */
    public Float getStrategyStopCnt() {
        return this.StrategyStopCnt;
    }

    /**
     * Set 策略拦截数量
     * @param StrategyStopCnt 策略拦截数量
     */
    public void setStrategyStopCnt(Float StrategyStopCnt) {
        this.StrategyStopCnt = StrategyStopCnt;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DateKey", this.DateKey);
        this.setParamSimple(map, prefix + "AllStopCnt", this.AllStopCnt);
        this.setParamSimple(map, prefix + "PicStopCnt", this.PicStopCnt);
        this.setParamSimple(map, prefix + "StrategyStopCnt", this.StrategyStopCnt);

    }
}

