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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateGrafanaWhiteListRequest extends AbstractModel{

    /**
    * Grafana 实例 ID，例如：grafana-abcdefgh
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 白名单数组，输入公网域名 IP ，例如：127.0.0.1，可通过接口 DescribeGrafanaWhiteList 查看
    */
    @SerializedName("Whitelist")
    @Expose
    private String [] Whitelist;

    /**
     * Get Grafana 实例 ID，例如：grafana-abcdefgh 
     * @return InstanceId Grafana 实例 ID，例如：grafana-abcdefgh
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Grafana 实例 ID，例如：grafana-abcdefgh
     * @param InstanceId Grafana 实例 ID，例如：grafana-abcdefgh
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 白名单数组，输入公网域名 IP ，例如：127.0.0.1，可通过接口 DescribeGrafanaWhiteList 查看 
     * @return Whitelist 白名单数组，输入公网域名 IP ，例如：127.0.0.1，可通过接口 DescribeGrafanaWhiteList 查看
     */
    public String [] getWhitelist() {
        return this.Whitelist;
    }

    /**
     * Set 白名单数组，输入公网域名 IP ，例如：127.0.0.1，可通过接口 DescribeGrafanaWhiteList 查看
     * @param Whitelist 白名单数组，输入公网域名 IP ，例如：127.0.0.1，可通过接口 DescribeGrafanaWhiteList 查看
     */
    public void setWhitelist(String [] Whitelist) {
        this.Whitelist = Whitelist;
    }

    public UpdateGrafanaWhiteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateGrafanaWhiteListRequest(UpdateGrafanaWhiteListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Whitelist != null) {
            this.Whitelist = new String[source.Whitelist.length];
            for (int i = 0; i < source.Whitelist.length; i++) {
                this.Whitelist[i] = new String(source.Whitelist[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "Whitelist.", this.Whitelist);

    }
}

