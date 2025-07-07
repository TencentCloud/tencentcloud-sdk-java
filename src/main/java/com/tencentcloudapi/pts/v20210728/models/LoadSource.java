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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadSource extends AbstractModel {

    /**
    * 发压host的IP
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 发压host所在的pod
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * 所属地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 发压host的IP 
     * @return IP 发压host的IP
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 发压host的IP
     * @param IP 发压host的IP
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 发压host所在的pod 
     * @return PodName 发压host所在的pod
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set 发压host所在的pod
     * @param PodName 发压host所在的pod
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get 所属地域 
     * @return Region 所属地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 所属地域
     * @param Region 所属地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public LoadSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadSource(LoadSource source) {
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

