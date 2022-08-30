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

public class PayForExtendDataRequest extends AbstractModel{

    /**
    * 卡片ICCID
    */
    @SerializedName("Iccid")
    @Expose
    private String Iccid;

    /**
    * 套外流量,单位MB
    */
    @SerializedName("ExtentData")
    @Expose
    private Long ExtentData;

    /**
    * 应用ID
    */
    @SerializedName("Sdkappid")
    @Expose
    private Long Sdkappid;

    /**
     * Get 卡片ICCID 
     * @return Iccid 卡片ICCID
     */
    public String getIccid() {
        return this.Iccid;
    }

    /**
     * Set 卡片ICCID
     * @param Iccid 卡片ICCID
     */
    public void setIccid(String Iccid) {
        this.Iccid = Iccid;
    }

    /**
     * Get 套外流量,单位MB 
     * @return ExtentData 套外流量,单位MB
     */
    public Long getExtentData() {
        return this.ExtentData;
    }

    /**
     * Set 套外流量,单位MB
     * @param ExtentData 套外流量,单位MB
     */
    public void setExtentData(Long ExtentData) {
        this.ExtentData = ExtentData;
    }

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

    public PayForExtendDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PayForExtendDataRequest(PayForExtendDataRequest source) {
        if (source.Iccid != null) {
            this.Iccid = new String(source.Iccid);
        }
        if (source.ExtentData != null) {
            this.ExtentData = new Long(source.ExtentData);
        }
        if (source.Sdkappid != null) {
            this.Sdkappid = new Long(source.Sdkappid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Iccid", this.Iccid);
        this.setParamSimple(map, prefix + "ExtentData", this.ExtentData);
        this.setParamSimple(map, prefix + "Sdkappid", this.Sdkappid);

    }
}

