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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetNetMonitorResponse extends AbstractModel {

    /**
    * 监控数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorData")
    @Expose
    private MonitorData [] MonitorData;

    /**
    * 接入区域。取值范围：['MC','AP','EU','AM']
MC=中国大陆
AP=亚太
EU=欧洲
AM=美洲
    */
    @SerializedName("AccessRegion")
    @Expose
    private String AccessRegion;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 监控数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorData 监控数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MonitorData [] getMonitorData() {
        return this.MonitorData;
    }

    /**
     * Set 监控数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorData 监控数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorData(MonitorData [] MonitorData) {
        this.MonitorData = MonitorData;
    }

    /**
     * Get 接入区域。取值范围：['MC','AP','EU','AM']
MC=中国大陆
AP=亚太
EU=欧洲
AM=美洲 
     * @return AccessRegion 接入区域。取值范围：['MC','AP','EU','AM']
MC=中国大陆
AP=亚太
EU=欧洲
AM=美洲
     */
    public String getAccessRegion() {
        return this.AccessRegion;
    }

    /**
     * Set 接入区域。取值范围：['MC','AP','EU','AM']
MC=中国大陆
AP=亚太
EU=欧洲
AM=美洲
     * @param AccessRegion 接入区域。取值范围：['MC','AP','EU','AM']
MC=中国大陆
AP=亚太
EU=欧洲
AM=美洲
     */
    public void setAccessRegion(String AccessRegion) {
        this.AccessRegion = AccessRegion;
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

    public GetNetMonitorResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetNetMonitorResponse(GetNetMonitorResponse source) {
        if (source.MonitorData != null) {
            this.MonitorData = new MonitorData[source.MonitorData.length];
            for (int i = 0; i < source.MonitorData.length; i++) {
                this.MonitorData[i] = new MonitorData(source.MonitorData[i]);
            }
        }
        if (source.AccessRegion != null) {
            this.AccessRegion = new String(source.AccessRegion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MonitorData.", this.MonitorData);
        this.setParamSimple(map, prefix + "AccessRegion", this.AccessRegion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

