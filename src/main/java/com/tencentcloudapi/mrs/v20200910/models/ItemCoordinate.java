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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ItemCoordinate extends AbstractModel {

    /**
    * <p>指标项名称坐标</p>
    */
    @SerializedName("Name")
    @Expose
    private Coordinate Name;

    /**
    * <p>指标结果称坐标</p>
    */
    @SerializedName("Result")
    @Expose
    private Coordinate Result;

    /**
    * <p>指标项范围坐标</p>
    */
    @SerializedName("Range")
    @Expose
    private Coordinate Range;

    /**
     * Get <p>指标项名称坐标</p> 
     * @return Name <p>指标项名称坐标</p>
     */
    public Coordinate getName() {
        return this.Name;
    }

    /**
     * Set <p>指标项名称坐标</p>
     * @param Name <p>指标项名称坐标</p>
     */
    public void setName(Coordinate Name) {
        this.Name = Name;
    }

    /**
     * Get <p>指标结果称坐标</p> 
     * @return Result <p>指标结果称坐标</p>
     */
    public Coordinate getResult() {
        return this.Result;
    }

    /**
     * Set <p>指标结果称坐标</p>
     * @param Result <p>指标结果称坐标</p>
     */
    public void setResult(Coordinate Result) {
        this.Result = Result;
    }

    /**
     * Get <p>指标项范围坐标</p> 
     * @return Range <p>指标项范围坐标</p>
     */
    public Coordinate getRange() {
        return this.Range;
    }

    /**
     * Set <p>指标项范围坐标</p>
     * @param Range <p>指标项范围坐标</p>
     */
    public void setRange(Coordinate Range) {
        this.Range = Range;
    }

    public ItemCoordinate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ItemCoordinate(ItemCoordinate source) {
        if (source.Name != null) {
            this.Name = new Coordinate(source.Name);
        }
        if (source.Result != null) {
            this.Result = new Coordinate(source.Result);
        }
        if (source.Range != null) {
            this.Range = new Coordinate(source.Range);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Name.", this.Name);
        this.setParamObj(map, prefix + "Result.", this.Result);
        this.setParamObj(map, prefix + "Range.", this.Range);

    }
}

