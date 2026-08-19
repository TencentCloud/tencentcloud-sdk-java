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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddCustomerGatewayClusterRequest extends AbstractModel {

    /**
    * <p>集群名称。最大 64 字符，支持字母、数字、中划线、下划线、点及中文。</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>部署大区标识。最大 32 字符。例如 CN 表示中国大陆。</p>
    */
    @SerializedName("BigArea")
    @Expose
    private String BigArea;

    /**
    * <p>地域标识。最大 32 字符。例如 ap-guangzhou。</p>
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
     * Get <p>集群名称。最大 64 字符，支持字母、数字、中划线、下划线、点及中文。</p> 
     * @return ClusterName <p>集群名称。最大 64 字符，支持字母、数字、中划线、下划线、点及中文。</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称。最大 64 字符，支持字母、数字、中划线、下划线、点及中文。</p>
     * @param ClusterName <p>集群名称。最大 64 字符，支持字母、数字、中划线、下划线、点及中文。</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>部署大区标识。最大 32 字符。例如 CN 表示中国大陆。</p> 
     * @return BigArea <p>部署大区标识。最大 32 字符。例如 CN 表示中国大陆。</p>
     */
    public String getBigArea() {
        return this.BigArea;
    }

    /**
     * Set <p>部署大区标识。最大 32 字符。例如 CN 表示中国大陆。</p>
     * @param BigArea <p>部署大区标识。最大 32 字符。例如 CN 表示中国大陆。</p>
     */
    public void setBigArea(String BigArea) {
        this.BigArea = BigArea;
    }

    /**
     * Get <p>地域标识。最大 32 字符。例如 ap-guangzhou。</p> 
     * @return RegionId <p>地域标识。最大 32 字符。例如 ap-guangzhou。</p>
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域标识。最大 32 字符。例如 ap-guangzhou。</p>
     * @param RegionId <p>地域标识。最大 32 字符。例如 ap-guangzhou。</p>
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    public AddCustomerGatewayClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddCustomerGatewayClusterRequest(AddCustomerGatewayClusterRequest source) {
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.BigArea != null) {
            this.BigArea = new String(source.BigArea);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "BigArea", this.BigArea);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

