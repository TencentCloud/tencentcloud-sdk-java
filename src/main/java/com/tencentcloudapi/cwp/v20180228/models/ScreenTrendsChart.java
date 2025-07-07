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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenTrendsChart extends AbstractModel {

    /**
    * X轴 时间
    */
    @SerializedName("X")
    @Expose
    private String X;

    /**
    * Y轴 数值
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * 统计分类类型 值：防御次数，攻击次数
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get X轴 时间 
     * @return X X轴 时间
     */
    public String getX() {
        return this.X;
    }

    /**
     * Set X轴 时间
     * @param X X轴 时间
     */
    public void setX(String X) {
        this.X = X;
    }

    /**
     * Get Y轴 数值 
     * @return Y Y轴 数值
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set Y轴 数值
     * @param Y Y轴 数值
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get 统计分类类型 值：防御次数，攻击次数 
     * @return Type 统计分类类型 值：防御次数，攻击次数
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 统计分类类型 值：防御次数，攻击次数
     * @param Type 统计分类类型 值：防御次数，攻击次数
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public ScreenTrendsChart() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenTrendsChart(ScreenTrendsChart source) {
        if (source.X != null) {
            this.X = new String(source.X);
        }
        if (source.Y != null) {
            this.Y = new Long(source.Y);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

