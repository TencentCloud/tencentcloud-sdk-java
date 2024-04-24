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

public class DeviceFirmwareInfo extends AbstractModel {

    /**
    * 固件类型
    */
    @SerializedName("FwType")
    @Expose
    private String FwType;

    /**
    * 固件版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 最后更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 固件类型 
     * @return FwType 固件类型
     */
    public String getFwType() {
        return this.FwType;
    }

    /**
     * Set 固件类型
     * @param FwType 固件类型
     */
    public void setFwType(String FwType) {
        this.FwType = FwType;
    }

    /**
     * Get 固件版本 
     * @return Version 固件版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 固件版本
     * @param Version 固件版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 最后更新时间 
     * @return UpdateTime 最后更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后更新时间
     * @param UpdateTime 最后更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public DeviceFirmwareInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceFirmwareInfo(DeviceFirmwareInfo source) {
        if (source.FwType != null) {
            this.FwType = new String(source.FwType);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FwType", this.FwType);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

