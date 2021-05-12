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

public class ApiUseStatisticsEntity extends AbstractModel{

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 次数
    */
    @SerializedName("Count")
    @Expose
    private String Count;

    /**
    * 比率
    */
    @SerializedName("Ratio")
    @Expose
    private String Ratio;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 次数 
     * @return Count 次数
     */
    public String getCount() {
        return this.Count;
    }

    /**
     * Set 次数
     * @param Count 次数
     */
    public void setCount(String Count) {
        this.Count = Count;
    }

    /**
     * Get 比率 
     * @return Ratio 比率
     */
    public String getRatio() {
        return this.Ratio;
    }

    /**
     * Set 比率
     * @param Ratio 比率
     */
    public void setRatio(String Ratio) {
        this.Ratio = Ratio;
    }

    public ApiUseStatisticsEntity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiUseStatisticsEntity(ApiUseStatisticsEntity source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Count != null) {
            this.Count = new String(source.Count);
        }
        if (source.Ratio != null) {
            this.Ratio = new String(source.Ratio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);

    }
}

