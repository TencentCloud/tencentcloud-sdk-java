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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetServicePodLogsRequest extends AbstractModel {

    /**
    * <p>服务Id</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>Pod名称</p>
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * <p>日志行数</p>
    */
    @SerializedName("TailLines")
    @Expose
    private String TailLines;

    /**
     * Get <p>服务Id</p> 
     * @return ServiceId <p>服务Id</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>服务Id</p>
     * @param ServiceId <p>服务Id</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>Pod名称</p> 
     * @return PodName <p>Pod名称</p>
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set <p>Pod名称</p>
     * @param PodName <p>Pod名称</p>
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get <p>日志行数</p> 
     * @return TailLines <p>日志行数</p>
     */
    public String getTailLines() {
        return this.TailLines;
    }

    /**
     * Set <p>日志行数</p>
     * @param TailLines <p>日志行数</p>
     */
    public void setTailLines(String TailLines) {
        this.TailLines = TailLines;
    }

    public GetServicePodLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetServicePodLogsRequest(GetServicePodLogsRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.TailLines != null) {
            this.TailLines = new String(source.TailLines);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "TailLines", this.TailLines);

    }
}

