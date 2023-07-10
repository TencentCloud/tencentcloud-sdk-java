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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QpsThreshold extends AbstractModel{

    /**
    * qps阈值控制维度,包含:second、minute、hour、day、month、year
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 阈值
    */
    @SerializedName("Max")
    @Expose
    private Long Max;

    /**
     * Get qps阈值控制维度,包含:second、minute、hour、day、month、year 
     * @return Unit qps阈值控制维度,包含:second、minute、hour、day、month、year
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set qps阈值控制维度,包含:second、minute、hour、day、month、year
     * @param Unit qps阈值控制维度,包含:second、minute、hour、day、month、year
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 阈值 
     * @return Max 阈值
     */
    public Long getMax() {
        return this.Max;
    }

    /**
     * Set 阈值
     * @param Max 阈值
     */
    public void setMax(Long Max) {
        this.Max = Max;
    }

    public QpsThreshold() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QpsThreshold(QpsThreshold source) {
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Max != null) {
            this.Max = new Long(source.Max);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Max", this.Max);

    }
}

