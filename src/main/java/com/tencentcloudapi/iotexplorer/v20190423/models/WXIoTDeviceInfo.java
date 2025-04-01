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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WXIoTDeviceInfo extends AbstractModel {

    /**
    * sn信息
    */
    @SerializedName("SN")
    @Expose
    private String SN;

    /**
    * 票据
    */
    @SerializedName("SNTicket")
    @Expose
    private String SNTicket;

    /**
    * 模板ID
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
     * Get sn信息 
     * @return SN sn信息
     */
    public String getSN() {
        return this.SN;
    }

    /**
     * Set sn信息
     * @param SN sn信息
     */
    public void setSN(String SN) {
        this.SN = SN;
    }

    /**
     * Get 票据 
     * @return SNTicket 票据
     */
    public String getSNTicket() {
        return this.SNTicket;
    }

    /**
     * Set 票据
     * @param SNTicket 票据
     */
    public void setSNTicket(String SNTicket) {
        this.SNTicket = SNTicket;
    }

    /**
     * Get 模板ID 
     * @return ModelId 模板ID
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模板ID
     * @param ModelId 模板ID
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    public WXIoTDeviceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WXIoTDeviceInfo(WXIoTDeviceInfo source) {
        if (source.SN != null) {
            this.SN = new String(source.SN);
        }
        if (source.SNTicket != null) {
            this.SNTicket = new String(source.SNTicket);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SN", this.SN);
        this.setParamSimple(map, prefix + "SNTicket", this.SNTicket);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);

    }
}

