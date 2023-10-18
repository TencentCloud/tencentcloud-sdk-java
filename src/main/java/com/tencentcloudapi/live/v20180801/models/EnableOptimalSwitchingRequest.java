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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnableOptimalSwitchingRequest extends AbstractModel{

    /**
    * 针对该流 ID 启用择优调度。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 启用开关，默认为启用。
0 - 禁用。
1 - 启用。
    */
    @SerializedName("EnableSwitch")
    @Expose
    private Long EnableSwitch;

    /**
    * 要启用自动择优的流所属的域名分组名称。
    */
    @SerializedName("HostGroupName")
    @Expose
    private String HostGroupName;

    /**
     * Get 针对该流 ID 启用择优调度。 
     * @return StreamName 针对该流 ID 启用择优调度。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 针对该流 ID 启用择优调度。
     * @param StreamName 针对该流 ID 启用择优调度。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get 启用开关，默认为启用。
0 - 禁用。
1 - 启用。 
     * @return EnableSwitch 启用开关，默认为启用。
0 - 禁用。
1 - 启用。
     */
    public Long getEnableSwitch() {
        return this.EnableSwitch;
    }

    /**
     * Set 启用开关，默认为启用。
0 - 禁用。
1 - 启用。
     * @param EnableSwitch 启用开关，默认为启用。
0 - 禁用。
1 - 启用。
     */
    public void setEnableSwitch(Long EnableSwitch) {
        this.EnableSwitch = EnableSwitch;
    }

    /**
     * Get 要启用自动择优的流所属的域名分组名称。 
     * @return HostGroupName 要启用自动择优的流所属的域名分组名称。
     */
    public String getHostGroupName() {
        return this.HostGroupName;
    }

    /**
     * Set 要启用自动择优的流所属的域名分组名称。
     * @param HostGroupName 要启用自动择优的流所属的域名分组名称。
     */
    public void setHostGroupName(String HostGroupName) {
        this.HostGroupName = HostGroupName;
    }

    public EnableOptimalSwitchingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableOptimalSwitchingRequest(EnableOptimalSwitchingRequest source) {
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.EnableSwitch != null) {
            this.EnableSwitch = new Long(source.EnableSwitch);
        }
        if (source.HostGroupName != null) {
            this.HostGroupName = new String(source.HostGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "EnableSwitch", this.EnableSwitch);
        this.setParamSimple(map, prefix + "HostGroupName", this.HostGroupName);

    }
}

