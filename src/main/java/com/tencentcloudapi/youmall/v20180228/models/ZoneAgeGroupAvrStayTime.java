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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneAgeGroupAvrStayTime extends AbstractModel {

    /**
    * 男性平均停留时间
    */
    @SerializedName("MaleAvrStayTime")
    @Expose
    private Float MaleAvrStayTime;

    /**
    * 女性平均停留时间
    */
    @SerializedName("FemaleAvrStayTime")
    @Expose
    private Float FemaleAvrStayTime;

    /**
     * Get 男性平均停留时间 
     * @return MaleAvrStayTime 男性平均停留时间
     */
    public Float getMaleAvrStayTime() {
        return this.MaleAvrStayTime;
    }

    /**
     * Set 男性平均停留时间
     * @param MaleAvrStayTime 男性平均停留时间
     */
    public void setMaleAvrStayTime(Float MaleAvrStayTime) {
        this.MaleAvrStayTime = MaleAvrStayTime;
    }

    /**
     * Get 女性平均停留时间 
     * @return FemaleAvrStayTime 女性平均停留时间
     */
    public Float getFemaleAvrStayTime() {
        return this.FemaleAvrStayTime;
    }

    /**
     * Set 女性平均停留时间
     * @param FemaleAvrStayTime 女性平均停留时间
     */
    public void setFemaleAvrStayTime(Float FemaleAvrStayTime) {
        this.FemaleAvrStayTime = FemaleAvrStayTime;
    }

    public ZoneAgeGroupAvrStayTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneAgeGroupAvrStayTime(ZoneAgeGroupAvrStayTime source) {
        if (source.MaleAvrStayTime != null) {
            this.MaleAvrStayTime = new Float(source.MaleAvrStayTime);
        }
        if (source.FemaleAvrStayTime != null) {
            this.FemaleAvrStayTime = new Float(source.FemaleAvrStayTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaleAvrStayTime", this.MaleAvrStayTime);
        this.setParamSimple(map, prefix + "FemaleAvrStayTime", this.FemaleAvrStayTime);

    }
}

