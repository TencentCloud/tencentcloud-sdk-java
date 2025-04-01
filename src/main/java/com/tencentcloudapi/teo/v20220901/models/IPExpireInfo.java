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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPExpireInfo extends AbstractModel {

    /**
    * 定时过期时间，遵循 ISO 8601 标准的日期和时间格式。例如 "2022-01-01T00:00:00+08:00"。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * IP 列表。仅支持 IP  及 IP 网段。
    */
    @SerializedName("IPList")
    @Expose
    private String [] IPList;

    /**
     * Get 定时过期时间，遵循 ISO 8601 标准的日期和时间格式。例如 "2022-01-01T00:00:00+08:00"。 
     * @return ExpireTime 定时过期时间，遵循 ISO 8601 标准的日期和时间格式。例如 "2022-01-01T00:00:00+08:00"。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 定时过期时间，遵循 ISO 8601 标准的日期和时间格式。例如 "2022-01-01T00:00:00+08:00"。
     * @param ExpireTime 定时过期时间，遵循 ISO 8601 标准的日期和时间格式。例如 "2022-01-01T00:00:00+08:00"。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get IP 列表。仅支持 IP  及 IP 网段。 
     * @return IPList IP 列表。仅支持 IP  及 IP 网段。
     */
    public String [] getIPList() {
        return this.IPList;
    }

    /**
     * Set IP 列表。仅支持 IP  及 IP 网段。
     * @param IPList IP 列表。仅支持 IP  及 IP 网段。
     */
    public void setIPList(String [] IPList) {
        this.IPList = IPList;
    }

    public IPExpireInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPExpireInfo(IPExpireInfo source) {
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.IPList != null) {
            this.IPList = new String[source.IPList.length];
            for (int i = 0; i < source.IPList.length; i++) {
                this.IPList[i] = new String(source.IPList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamArraySimple(map, prefix + "IPList.", this.IPList);

    }
}

