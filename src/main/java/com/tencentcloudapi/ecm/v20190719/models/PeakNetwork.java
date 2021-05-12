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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PeakNetwork extends AbstractModel{

    /**
    * 记录时间。
    */
    @SerializedName("RecordTime")
    @Expose
    private String RecordTime;

    /**
    * 入带宽数据。
    */
    @SerializedName("PeakInNetwork")
    @Expose
    private String PeakInNetwork;

    /**
    * 出带宽数据。
    */
    @SerializedName("PeakOutNetwork")
    @Expose
    private String PeakOutNetwork;

    /**
    * 计费带宽。单位bps
    */
    @SerializedName("ChargeNetwork")
    @Expose
    private String ChargeNetwork;

    /**
     * Get 记录时间。 
     * @return RecordTime 记录时间。
     */
    public String getRecordTime() {
        return this.RecordTime;
    }

    /**
     * Set 记录时间。
     * @param RecordTime 记录时间。
     */
    public void setRecordTime(String RecordTime) {
        this.RecordTime = RecordTime;
    }

    /**
     * Get 入带宽数据。 
     * @return PeakInNetwork 入带宽数据。
     */
    public String getPeakInNetwork() {
        return this.PeakInNetwork;
    }

    /**
     * Set 入带宽数据。
     * @param PeakInNetwork 入带宽数据。
     */
    public void setPeakInNetwork(String PeakInNetwork) {
        this.PeakInNetwork = PeakInNetwork;
    }

    /**
     * Get 出带宽数据。 
     * @return PeakOutNetwork 出带宽数据。
     */
    public String getPeakOutNetwork() {
        return this.PeakOutNetwork;
    }

    /**
     * Set 出带宽数据。
     * @param PeakOutNetwork 出带宽数据。
     */
    public void setPeakOutNetwork(String PeakOutNetwork) {
        this.PeakOutNetwork = PeakOutNetwork;
    }

    /**
     * Get 计费带宽。单位bps 
     * @return ChargeNetwork 计费带宽。单位bps
     */
    public String getChargeNetwork() {
        return this.ChargeNetwork;
    }

    /**
     * Set 计费带宽。单位bps
     * @param ChargeNetwork 计费带宽。单位bps
     */
    public void setChargeNetwork(String ChargeNetwork) {
        this.ChargeNetwork = ChargeNetwork;
    }

    public PeakNetwork() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PeakNetwork(PeakNetwork source) {
        if (source.RecordTime != null) {
            this.RecordTime = new String(source.RecordTime);
        }
        if (source.PeakInNetwork != null) {
            this.PeakInNetwork = new String(source.PeakInNetwork);
        }
        if (source.PeakOutNetwork != null) {
            this.PeakOutNetwork = new String(source.PeakOutNetwork);
        }
        if (source.ChargeNetwork != null) {
            this.ChargeNetwork = new String(source.ChargeNetwork);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordTime", this.RecordTime);
        this.setParamSimple(map, prefix + "PeakInNetwork", this.PeakInNetwork);
        this.setParamSimple(map, prefix + "PeakOutNetwork", this.PeakOutNetwork);
        this.setParamSimple(map, prefix + "ChargeNetwork", this.ChargeNetwork);

    }
}

