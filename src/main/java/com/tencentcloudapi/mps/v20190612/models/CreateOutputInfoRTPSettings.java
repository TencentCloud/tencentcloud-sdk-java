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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOutputInfoRTPSettings extends AbstractModel{

    /**
    * 转推的目标地址，可填1~2个。
    */
    @SerializedName("Destinations")
    @Expose
    private CreateOutputRTPSettingsDestinations [] Destinations;

    /**
    * 只能填none。
    */
    @SerializedName("FEC")
    @Expose
    private String FEC;

    /**
    * 空闲超时时间，单位ms。
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
     * Get 转推的目标地址，可填1~2个。 
     * @return Destinations 转推的目标地址，可填1~2个。
     */
    public CreateOutputRTPSettingsDestinations [] getDestinations() {
        return this.Destinations;
    }

    /**
     * Set 转推的目标地址，可填1~2个。
     * @param Destinations 转推的目标地址，可填1~2个。
     */
    public void setDestinations(CreateOutputRTPSettingsDestinations [] Destinations) {
        this.Destinations = Destinations;
    }

    /**
     * Get 只能填none。 
     * @return FEC 只能填none。
     */
    public String getFEC() {
        return this.FEC;
    }

    /**
     * Set 只能填none。
     * @param FEC 只能填none。
     */
    public void setFEC(String FEC) {
        this.FEC = FEC;
    }

    /**
     * Get 空闲超时时间，单位ms。 
     * @return IdleTimeout 空闲超时时间，单位ms。
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set 空闲超时时间，单位ms。
     * @param IdleTimeout 空闲超时时间，单位ms。
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    public CreateOutputInfoRTPSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOutputInfoRTPSettings(CreateOutputInfoRTPSettings source) {
        if (source.Destinations != null) {
            this.Destinations = new CreateOutputRTPSettingsDestinations[source.Destinations.length];
            for (int i = 0; i < source.Destinations.length; i++) {
                this.Destinations[i] = new CreateOutputRTPSettingsDestinations(source.Destinations[i]);
            }
        }
        if (source.FEC != null) {
            this.FEC = new String(source.FEC);
        }
        if (source.IdleTimeout != null) {
            this.IdleTimeout = new Long(source.IdleTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Destinations.", this.Destinations);
        this.setParamSimple(map, prefix + "FEC", this.FEC);
        this.setParamSimple(map, prefix + "IdleTimeout", this.IdleTimeout);

    }
}

