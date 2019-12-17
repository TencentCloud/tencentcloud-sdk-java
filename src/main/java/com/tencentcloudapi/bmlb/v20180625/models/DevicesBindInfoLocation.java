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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DevicesBindInfoLocation extends AbstractModel{

    /**
    * 转发路径。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 转发路径实例ID。
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 该转发路径所绑定的主机列表。
    */
    @SerializedName("BackendSet")
    @Expose
    private DevicesBindInfoBackend [] BackendSet;

    /**
     * Get 转发路径。 
     * @return Url 转发路径。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 转发路径。
     * @param Url 转发路径。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 转发路径实例ID。 
     * @return LocationId 转发路径实例ID。
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 转发路径实例ID。
     * @param LocationId 转发路径实例ID。
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get 该转发路径所绑定的主机列表。 
     * @return BackendSet 该转发路径所绑定的主机列表。
     */
    public DevicesBindInfoBackend [] getBackendSet() {
        return this.BackendSet;
    }

    /**
     * Set 该转发路径所绑定的主机列表。
     * @param BackendSet 该转发路径所绑定的主机列表。
     */
    public void setBackendSet(DevicesBindInfoBackend [] BackendSet) {
        this.BackendSet = BackendSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamArrayObj(map, prefix + "BackendSet.", this.BackendSet);

    }
}

