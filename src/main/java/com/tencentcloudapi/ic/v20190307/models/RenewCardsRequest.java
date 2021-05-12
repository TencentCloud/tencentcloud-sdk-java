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
package com.tencentcloudapi.ic.v20190307.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewCardsRequest extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("Sdkappid")
    @Expose
    private Long Sdkappid;

    /**
    * 续费的iccid
    */
    @SerializedName("Iccids")
    @Expose
    private String [] Iccids;

    /**
    * 续费的周期（单位：月）
    */
    @SerializedName("RenewNum")
    @Expose
    private Long RenewNum;

    /**
     * Get 应用ID 
     * @return Sdkappid 应用ID
     */
    public Long getSdkappid() {
        return this.Sdkappid;
    }

    /**
     * Set 应用ID
     * @param Sdkappid 应用ID
     */
    public void setSdkappid(Long Sdkappid) {
        this.Sdkappid = Sdkappid;
    }

    /**
     * Get 续费的iccid 
     * @return Iccids 续费的iccid
     */
    public String [] getIccids() {
        return this.Iccids;
    }

    /**
     * Set 续费的iccid
     * @param Iccids 续费的iccid
     */
    public void setIccids(String [] Iccids) {
        this.Iccids = Iccids;
    }

    /**
     * Get 续费的周期（单位：月） 
     * @return RenewNum 续费的周期（单位：月）
     */
    public Long getRenewNum() {
        return this.RenewNum;
    }

    /**
     * Set 续费的周期（单位：月）
     * @param RenewNum 续费的周期（单位：月）
     */
    public void setRenewNum(Long RenewNum) {
        this.RenewNum = RenewNum;
    }

    public RenewCardsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewCardsRequest(RenewCardsRequest source) {
        if (source.Sdkappid != null) {
            this.Sdkappid = new Long(source.Sdkappid);
        }
        if (source.Iccids != null) {
            this.Iccids = new String[source.Iccids.length];
            for (int i = 0; i < source.Iccids.length; i++) {
                this.Iccids[i] = new String(source.Iccids[i]);
            }
        }
        if (source.RenewNum != null) {
            this.RenewNum = new Long(source.RenewNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sdkappid", this.Sdkappid);
        this.setParamArraySimple(map, prefix + "Iccids.", this.Iccids);
        this.setParamSimple(map, prefix + "RenewNum", this.RenewNum);

    }
}

