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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeListProtectThresholdConfigResponse extends AbstractModel{

    /**
    * 总记录数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 防护阈值配置列表
    */
    @SerializedName("ConfigList")
    @Expose
    private ProtectThresholdRelation [] ConfigList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总记录数 
     * @return Total 总记录数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总记录数
     * @param Total 总记录数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 防护阈值配置列表 
     * @return ConfigList 防护阈值配置列表
     */
    public ProtectThresholdRelation [] getConfigList() {
        return this.ConfigList;
    }

    /**
     * Set 防护阈值配置列表
     * @param ConfigList 防护阈值配置列表
     */
    public void setConfigList(ProtectThresholdRelation [] ConfigList) {
        this.ConfigList = ConfigList;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeListProtectThresholdConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListProtectThresholdConfigResponse(DescribeListProtectThresholdConfigResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.ConfigList != null) {
            this.ConfigList = new ProtectThresholdRelation[source.ConfigList.length];
            for (int i = 0; i < source.ConfigList.length; i++) {
                this.ConfigList[i] = new ProtectThresholdRelation(source.ConfigList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "ConfigList.", this.ConfigList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

