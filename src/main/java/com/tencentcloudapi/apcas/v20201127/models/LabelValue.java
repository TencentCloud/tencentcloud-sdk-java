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
package com.tencentcloudapi.apcas.v20201127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LabelValue extends AbstractModel{

    /**
    * 标签覆盖率占比（在整个上传的ID列表中的覆盖率）
    */
    @SerializedName("Proportion")
    @Expose
    private Float Proportion;

    /**
    * 标签大盘覆盖率占比
    */
    @SerializedName("Market")
    @Expose
    private Float Market;

    /**
    * TGI指数，由Proportion除以Market得到
    */
    @SerializedName("Tgi")
    @Expose
    private Float Tgi;

    /**
     * Get 标签覆盖率占比（在整个上传的ID列表中的覆盖率） 
     * @return Proportion 标签覆盖率占比（在整个上传的ID列表中的覆盖率）
     */
    public Float getProportion() {
        return this.Proportion;
    }

    /**
     * Set 标签覆盖率占比（在整个上传的ID列表中的覆盖率）
     * @param Proportion 标签覆盖率占比（在整个上传的ID列表中的覆盖率）
     */
    public void setProportion(Float Proportion) {
        this.Proportion = Proportion;
    }

    /**
     * Get 标签大盘覆盖率占比 
     * @return Market 标签大盘覆盖率占比
     */
    public Float getMarket() {
        return this.Market;
    }

    /**
     * Set 标签大盘覆盖率占比
     * @param Market 标签大盘覆盖率占比
     */
    public void setMarket(Float Market) {
        this.Market = Market;
    }

    /**
     * Get TGI指数，由Proportion除以Market得到 
     * @return Tgi TGI指数，由Proportion除以Market得到
     */
    public Float getTgi() {
        return this.Tgi;
    }

    /**
     * Set TGI指数，由Proportion除以Market得到
     * @param Tgi TGI指数，由Proportion除以Market得到
     */
    public void setTgi(Float Tgi) {
        this.Tgi = Tgi;
    }

    public LabelValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LabelValue(LabelValue source) {
        if (source.Proportion != null) {
            this.Proportion = new Float(source.Proportion);
        }
        if (source.Market != null) {
            this.Market = new Float(source.Market);
        }
        if (source.Tgi != null) {
            this.Tgi = new Float(source.Tgi);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Proportion", this.Proportion);
        this.setParamSimple(map, prefix + "Market", this.Market);
        this.setParamSimple(map, prefix + "Tgi", this.Tgi);

    }
}

