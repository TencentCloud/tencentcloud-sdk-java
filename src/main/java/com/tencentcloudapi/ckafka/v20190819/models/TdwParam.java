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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TdwParam extends AbstractModel{

    /**
    * Tdw的bid
    */
    @SerializedName("Bid")
    @Expose
    private String Bid;

    /**
    * Tdw的tid
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * 是否为国内站，默认true
    */
    @SerializedName("IsDomestic")
    @Expose
    private Boolean IsDomestic;

    /**
     * Get Tdw的bid 
     * @return Bid Tdw的bid
     */
    public String getBid() {
        return this.Bid;
    }

    /**
     * Set Tdw的bid
     * @param Bid Tdw的bid
     */
    public void setBid(String Bid) {
        this.Bid = Bid;
    }

    /**
     * Get Tdw的tid 
     * @return Tid Tdw的tid
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set Tdw的tid
     * @param Tid Tdw的tid
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get 是否为国内站，默认true 
     * @return IsDomestic 是否为国内站，默认true
     */
    public Boolean getIsDomestic() {
        return this.IsDomestic;
    }

    /**
     * Set 是否为国内站，默认true
     * @param IsDomestic 是否为国内站，默认true
     */
    public void setIsDomestic(Boolean IsDomestic) {
        this.IsDomestic = IsDomestic;
    }

    public TdwParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TdwParam(TdwParam source) {
        if (source.Bid != null) {
            this.Bid = new String(source.Bid);
        }
        if (source.Tid != null) {
            this.Tid = new String(source.Tid);
        }
        if (source.IsDomestic != null) {
            this.IsDomestic = new Boolean(source.IsDomestic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bid", this.Bid);
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "IsDomestic", this.IsDomestic);

    }
}

