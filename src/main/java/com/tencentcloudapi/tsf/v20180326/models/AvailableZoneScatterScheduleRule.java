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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvailableZoneScatterScheduleRule extends AbstractModel {

    /**
    * -
    */
    @SerializedName("ScatterDimension")
    @Expose
    private String ScatterDimension;

    /**
    * -
    */
    @SerializedName("MaxUnbalanceQuantity")
    @Expose
    private Long MaxUnbalanceQuantity;

    /**
    * -
    */
    @SerializedName("IsForceSchedule")
    @Expose
    private Boolean IsForceSchedule;

    /**
    * -
    */
    @SerializedName("Paths")
    @Expose
    private CommonOption [] Paths;

    /**
     * Get - 
     * @return ScatterDimension -
     */
    public String getScatterDimension() {
        return this.ScatterDimension;
    }

    /**
     * Set -
     * @param ScatterDimension -
     */
    public void setScatterDimension(String ScatterDimension) {
        this.ScatterDimension = ScatterDimension;
    }

    /**
     * Get - 
     * @return MaxUnbalanceQuantity -
     */
    public Long getMaxUnbalanceQuantity() {
        return this.MaxUnbalanceQuantity;
    }

    /**
     * Set -
     * @param MaxUnbalanceQuantity -
     */
    public void setMaxUnbalanceQuantity(Long MaxUnbalanceQuantity) {
        this.MaxUnbalanceQuantity = MaxUnbalanceQuantity;
    }

    /**
     * Get - 
     * @return IsForceSchedule -
     */
    public Boolean getIsForceSchedule() {
        return this.IsForceSchedule;
    }

    /**
     * Set -
     * @param IsForceSchedule -
     */
    public void setIsForceSchedule(Boolean IsForceSchedule) {
        this.IsForceSchedule = IsForceSchedule;
    }

    /**
     * Get - 
     * @return Paths -
     */
    public CommonOption [] getPaths() {
        return this.Paths;
    }

    /**
     * Set -
     * @param Paths -
     */
    public void setPaths(CommonOption [] Paths) {
        this.Paths = Paths;
    }

    public AvailableZoneScatterScheduleRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvailableZoneScatterScheduleRule(AvailableZoneScatterScheduleRule source) {
        if (source.ScatterDimension != null) {
            this.ScatterDimension = new String(source.ScatterDimension);
        }
        if (source.MaxUnbalanceQuantity != null) {
            this.MaxUnbalanceQuantity = new Long(source.MaxUnbalanceQuantity);
        }
        if (source.IsForceSchedule != null) {
            this.IsForceSchedule = new Boolean(source.IsForceSchedule);
        }
        if (source.Paths != null) {
            this.Paths = new CommonOption[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new CommonOption(source.Paths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScatterDimension", this.ScatterDimension);
        this.setParamSimple(map, prefix + "MaxUnbalanceQuantity", this.MaxUnbalanceQuantity);
        this.setParamSimple(map, prefix + "IsForceSchedule", this.IsForceSchedule);
        this.setParamArrayObj(map, prefix + "Paths.", this.Paths);

    }
}

