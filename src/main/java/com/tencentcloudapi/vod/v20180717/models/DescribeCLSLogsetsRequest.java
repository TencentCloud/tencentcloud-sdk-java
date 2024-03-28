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
    * 日志集所属的地域，取值有： <li>ap-guangzhou：广州；</li> <li>ap-beijing：北京；</li> <li>ap-chengdu：成都；</li> <li>ap-chongqing：重庆；</li> <li>ap-nanjing：南京；</li> <li>ap-shanghai：上海；</li> <li>ap-singapore：新加坡。</li>
    */
    @SerializedName("CLSRegion")
    @Expose
    private String CLSRegion;

    /**
     * Get 日志集所属的地域，取值有： <li>ap-guangzhou：广州；</li> <li>ap-beijing：北京；</li> <li>ap-chengdu：成都；</li> <li>ap-chongqing：重庆；</li> <li>ap-nanjing：南京；</li> <li>ap-shanghai：上海；</li> <li>ap-singapore：新加坡。</li> 
     * @return CLSRegion 日志集所属的地域，取值有： <li>ap-guangzhou：广州；</li> <li>ap-beijing：北京；</li> <li>ap-chengdu：成都；</li> <li>ap-chongqing：重庆；</li> <li>ap-nanjing：南京；</li> <li>ap-shanghai：上海；</li> <li>ap-singapore：新加坡。</li>
     */
    public String getCLSRegion() {
        return this.CLSRegion;
    }

    /**
     * Set 日志集所属的地域，取值有： <li>ap-guangzhou：广州；</li> <li>ap-beijing：北京；</li> <li>ap-chengdu：成都；</li> <li>ap-chongqing：重庆；</li> <li>ap-nanjing：南京；</li> <li>ap-shanghai：上海；</li> <li>ap-singapore：新加坡。</li>
     * @param CLSRegion 日志集所属的地域，取值有： <li>ap-guangzhou：广州；</li> <li>ap-beijing：北京；</li> <li>ap-chengdu：成都；</li> <li>ap-chongqing：重庆；</li> <li>ap-nanjing：南京；</li> <li>ap-shanghai：上海；</li> <li>ap-singapore：新加坡。</li>
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

