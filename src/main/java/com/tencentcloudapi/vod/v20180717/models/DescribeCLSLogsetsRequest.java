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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCLSLogsetsRequest extends AbstractModel {

    /**
    * CLS 日志集所属的地域，取值有：
ap-guangzhou：广州；
ap-singapore：新加坡。
    */
    @SerializedName("CLSRegion")
    @Expose
    private String CLSRegion;

    /**
     * Get CLS 日志集所属的地域，取值有：
ap-guangzhou：广州；
ap-singapore：新加坡。 
     * @return CLSRegion CLS 日志集所属的地域，取值有：
ap-guangzhou：广州；
ap-singapore：新加坡。
     */
    public String getCLSRegion() {
        return this.CLSRegion;
    }

    /**
     * Set CLS 日志集所属的地域，取值有：
ap-guangzhou：广州；
ap-singapore：新加坡。
     * @param CLSRegion CLS 日志集所属的地域，取值有：
ap-guangzhou：广州；
ap-singapore：新加坡。
     */
    public void setCLSRegion(String CLSRegion) {
        this.CLSRegion = CLSRegion;
    }

    public DescribeCLSLogsetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCLSLogsetsRequest(DescribeCLSLogsetsRequest source) {
        if (source.CLSRegion != null) {
            this.CLSRegion = new String(source.CLSRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CLSRegion", this.CLSRegion);

    }
}

