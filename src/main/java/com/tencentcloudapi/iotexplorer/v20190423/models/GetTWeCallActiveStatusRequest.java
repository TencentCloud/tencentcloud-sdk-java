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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTWeCallActiveStatusRequest extends AbstractModel {

    /**
    * 参数已弃用，不用传参
    */
    @SerializedName("MiniProgramAppId")
    @Expose
    private String MiniProgramAppId;

    /**
    * 设备列表
    */
    @SerializedName("DeviceList")
    @Expose
    private TWeCallInfo [] DeviceList;

    /**
     * Get 参数已弃用，不用传参 
     * @return MiniProgramAppId 参数已弃用，不用传参
     * @deprecated
     */
    @Deprecated
    public String getMiniProgramAppId() {
        return this.MiniProgramAppId;
    }

    /**
     * Set 参数已弃用，不用传参
     * @param MiniProgramAppId 参数已弃用，不用传参
     * @deprecated
     */
    @Deprecated
    public void setMiniProgramAppId(String MiniProgramAppId) {
        this.MiniProgramAppId = MiniProgramAppId;
    }

    /**
     * Get 设备列表 
     * @return DeviceList 设备列表
     */
    public TWeCallInfo [] getDeviceList() {
        return this.DeviceList;
    }

    /**
     * Set 设备列表
     * @param DeviceList 设备列表
     */
    public void setDeviceList(TWeCallInfo [] DeviceList) {
        this.DeviceList = DeviceList;
    }

    public GetTWeCallActiveStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTWeCallActiveStatusRequest(GetTWeCallActiveStatusRequest source) {
        if (source.MiniProgramAppId != null) {
            this.MiniProgramAppId = new String(source.MiniProgramAppId);
        }
        if (source.DeviceList != null) {
            this.DeviceList = new TWeCallInfo[source.DeviceList.length];
            for (int i = 0; i < source.DeviceList.length; i++) {
                this.DeviceList[i] = new TWeCallInfo(source.DeviceList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MiniProgramAppId", this.MiniProgramAppId);
        this.setParamArrayObj(map, prefix + "DeviceList.", this.DeviceList);

    }
}

