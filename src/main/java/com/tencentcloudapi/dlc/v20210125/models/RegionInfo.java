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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel {

    /**
    * <p>地域编码，如 ap-chongqing</p>
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * <p>地域名称，如 重庆</p>
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * <p>地域状态：AVAILABLE-可用，UNAVAILABLE-不可用</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>地域编码，如 ap-chongqing</p> 
     * @return RegionCode <p>地域编码，如 ap-chongqing</p>
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set <p>地域编码，如 ap-chongqing</p>
     * @param RegionCode <p>地域编码，如 ap-chongqing</p>
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get <p>地域名称，如 重庆</p> 
     * @return RegionName <p>地域名称，如 重庆</p>
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <p>地域名称，如 重庆</p>
     * @param RegionName <p>地域名称，如 重庆</p>
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get <p>地域状态：AVAILABLE-可用，UNAVAILABLE-不可用</p> 
     * @return Status <p>地域状态：AVAILABLE-可用，UNAVAILABLE-不可用</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>地域状态：AVAILABLE-可用，UNAVAILABLE-不可用</p>
     * @param Status <p>地域状态：AVAILABLE-可用，UNAVAILABLE-不可用</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public RegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionInfo(RegionInfo source) {
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

