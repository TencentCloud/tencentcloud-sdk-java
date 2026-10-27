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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopSessionRequest extends AbstractModel {

    /**
    * <p>机器所在区域</p>
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * <p>机器hostname</p>
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * <p>IsDisconnect为true，表示断开当前会话<br>IsDisconnect为false，表示注销当前会话</p>
    */
    @SerializedName("IsDisconnect")
    @Expose
    private Boolean IsDisconnect;

    /**
    * <p>选填，为多会话预留字段</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get <p>机器所在区域</p> 
     * @return InstanceRegion <p>机器所在区域</p>
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set <p>机器所在区域</p>
     * @param InstanceRegion <p>机器所在区域</p>
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * Get <p>机器hostname</p> 
     * @return HostName <p>机器hostname</p>
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set <p>机器hostname</p>
     * @param HostName <p>机器hostname</p>
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get <p>IsDisconnect为true，表示断开当前会话<br>IsDisconnect为false，表示注销当前会话</p> 
     * @return IsDisconnect <p>IsDisconnect为true，表示断开当前会话<br>IsDisconnect为false，表示注销当前会话</p>
     */
    public Boolean getIsDisconnect() {
        return this.IsDisconnect;
    }

    /**
     * Set <p>IsDisconnect为true，表示断开当前会话<br>IsDisconnect为false，表示注销当前会话</p>
     * @param IsDisconnect <p>IsDisconnect为true，表示断开当前会话<br>IsDisconnect为false，表示注销当前会话</p>
     */
    public void setIsDisconnect(Boolean IsDisconnect) {
        this.IsDisconnect = IsDisconnect;
    }

    /**
     * Get <p>选填，为多会话预留字段</p> 
     * @return UserId <p>选填，为多会话预留字段</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>选填，为多会话预留字段</p>
     * @param UserId <p>选填，为多会话预留字段</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public StopSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopSessionRequest(StopSessionRequest source) {
        if (source.InstanceRegion != null) {
            this.InstanceRegion = new String(source.InstanceRegion);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.IsDisconnect != null) {
            this.IsDisconnect = new Boolean(source.IsDisconnect);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "IsDisconnect", this.IsDisconnect);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

