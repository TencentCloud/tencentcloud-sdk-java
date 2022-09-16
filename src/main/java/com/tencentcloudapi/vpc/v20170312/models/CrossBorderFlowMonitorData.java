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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CrossBorderFlowMonitorData extends AbstractModel{

    /**
    * 入带宽
    */
    @SerializedName("InBandwidth")
    @Expose
    private Long [] InBandwidth;

    /**
    * 出带宽
    */
    @SerializedName("OutBandwidth")
    @Expose
    private Long [] OutBandwidth;

    /**
    * 入包
    */
    @SerializedName("InPkg")
    @Expose
    private Long [] InPkg;

    /**
    * 出包
    */
    @SerializedName("OutPkg")
    @Expose
    private Long [] OutPkg;

    /**
     * Get 入带宽 
     * @return InBandwidth 入带宽
     */
    public Long [] getInBandwidth() {
        return this.InBandwidth;
    }

    /**
     * Set 入带宽
     * @param InBandwidth 入带宽
     */
    public void setInBandwidth(Long [] InBandwidth) {
        this.InBandwidth = InBandwidth;
    }

    /**
     * Get 出带宽 
     * @return OutBandwidth 出带宽
     */
    public Long [] getOutBandwidth() {
        return this.OutBandwidth;
    }

    /**
     * Set 出带宽
     * @param OutBandwidth 出带宽
     */
    public void setOutBandwidth(Long [] OutBandwidth) {
        this.OutBandwidth = OutBandwidth;
    }

    /**
     * Get 入包 
     * @return InPkg 入包
     */
    public Long [] getInPkg() {
        return this.InPkg;
    }

    /**
     * Set 入包
     * @param InPkg 入包
     */
    public void setInPkg(Long [] InPkg) {
        this.InPkg = InPkg;
    }

    /**
     * Get 出包 
     * @return OutPkg 出包
     */
    public Long [] getOutPkg() {
        return this.OutPkg;
    }

    /**
     * Set 出包
     * @param OutPkg 出包
     */
    public void setOutPkg(Long [] OutPkg) {
        this.OutPkg = OutPkg;
    }

    public CrossBorderFlowMonitorData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CrossBorderFlowMonitorData(CrossBorderFlowMonitorData source) {
        if (source.InBandwidth != null) {
            this.InBandwidth = new Long[source.InBandwidth.length];
            for (int i = 0; i < source.InBandwidth.length; i++) {
                this.InBandwidth[i] = new Long(source.InBandwidth[i]);
            }
        }
        if (source.OutBandwidth != null) {
            this.OutBandwidth = new Long[source.OutBandwidth.length];
            for (int i = 0; i < source.OutBandwidth.length; i++) {
                this.OutBandwidth[i] = new Long(source.OutBandwidth[i]);
            }
        }
        if (source.InPkg != null) {
            this.InPkg = new Long[source.InPkg.length];
            for (int i = 0; i < source.InPkg.length; i++) {
                this.InPkg[i] = new Long(source.InPkg[i]);
            }
        }
        if (source.OutPkg != null) {
            this.OutPkg = new Long[source.OutPkg.length];
            for (int i = 0; i < source.OutPkg.length; i++) {
                this.OutPkg[i] = new Long(source.OutPkg[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InBandwidth.", this.InBandwidth);
        this.setParamArraySimple(map, prefix + "OutBandwidth.", this.OutBandwidth);
        this.setParamArraySimple(map, prefix + "InPkg.", this.InPkg);
        this.setParamArraySimple(map, prefix + "OutPkg.", this.OutPkg);

    }
}

