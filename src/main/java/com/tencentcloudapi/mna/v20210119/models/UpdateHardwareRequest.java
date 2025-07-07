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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateHardwareRequest extends AbstractModel {

    /**
    * 硬件ID
    */
    @SerializedName("HardwareId")
    @Expose
    private String HardwareId;

    /**
    * 硬件序列号
    */
    @SerializedName("SN")
    @Expose
    private String SN;

    /**
    * 设备备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 硬件ID 
     * @return HardwareId 硬件ID
     */
    public String getHardwareId() {
        return this.HardwareId;
    }

    /**
     * Set 硬件ID
     * @param HardwareId 硬件ID
     */
    public void setHardwareId(String HardwareId) {
        this.HardwareId = HardwareId;
    }

    /**
     * Get 硬件序列号 
     * @return SN 硬件序列号
     */
    public String getSN() {
        return this.SN;
    }

    /**
     * Set 硬件序列号
     * @param SN 硬件序列号
     */
    public void setSN(String SN) {
        this.SN = SN;
    }

    /**
     * Get 设备备注 
     * @return Description 设备备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 设备备注
     * @param Description 设备备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public UpdateHardwareRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateHardwareRequest(UpdateHardwareRequest source) {
        if (source.HardwareId != null) {
            this.HardwareId = new String(source.HardwareId);
        }
        if (source.SN != null) {
            this.SN = new String(source.SN);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HardwareId", this.HardwareId);
        this.setParamSimple(map, prefix + "SN", this.SN);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

