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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLibraDBClusterDetailRequest extends AbstractModel {

    /**
    * 分析集群 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 是否获取更多服务器信息，可选值yes no
    */
    @SerializedName("GetServerInfo")
    @Expose
    private String GetServerInfo;

    /**
     * Get 分析集群 ID 
     * @return ClusterId 分析集群 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 分析集群 ID
     * @param ClusterId 分析集群 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 是否获取更多服务器信息，可选值yes no 
     * @return GetServerInfo 是否获取更多服务器信息，可选值yes no
     */
    public String getGetServerInfo() {
        return this.GetServerInfo;
    }

    /**
     * Set 是否获取更多服务器信息，可选值yes no
     * @param GetServerInfo 是否获取更多服务器信息，可选值yes no
     */
    public void setGetServerInfo(String GetServerInfo) {
        this.GetServerInfo = GetServerInfo;
    }

    public DescribeLibraDBClusterDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLibraDBClusterDetailRequest(DescribeLibraDBClusterDetailRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GetServerInfo != null) {
            this.GetServerInfo = new String(source.GetServerInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GetServerInfo", this.GetServerInfo);

    }
}

