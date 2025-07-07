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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQServerlessWhiteListInfo extends AbstractModel {

    /**
    * 公网数据流白名单
    */
    @SerializedName("PublicDataStreamWhiteList")
    @Expose
    private String PublicDataStreamWhiteList;

    /**
    * 公网数据流白名单状态
    */
    @SerializedName("PublicDataStreamWhiteListStatus")
    @Expose
    private String PublicDataStreamWhiteListStatus;

    /**
     * Get 公网数据流白名单 
     * @return PublicDataStreamWhiteList 公网数据流白名单
     */
    public String getPublicDataStreamWhiteList() {
        return this.PublicDataStreamWhiteList;
    }

    /**
     * Set 公网数据流白名单
     * @param PublicDataStreamWhiteList 公网数据流白名单
     */
    public void setPublicDataStreamWhiteList(String PublicDataStreamWhiteList) {
        this.PublicDataStreamWhiteList = PublicDataStreamWhiteList;
    }

    /**
     * Get 公网数据流白名单状态 
     * @return PublicDataStreamWhiteListStatus 公网数据流白名单状态
     */
    public String getPublicDataStreamWhiteListStatus() {
        return this.PublicDataStreamWhiteListStatus;
    }

    /**
     * Set 公网数据流白名单状态
     * @param PublicDataStreamWhiteListStatus 公网数据流白名单状态
     */
    public void setPublicDataStreamWhiteListStatus(String PublicDataStreamWhiteListStatus) {
        this.PublicDataStreamWhiteListStatus = PublicDataStreamWhiteListStatus;
    }

    public RabbitMQServerlessWhiteListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQServerlessWhiteListInfo(RabbitMQServerlessWhiteListInfo source) {
        if (source.PublicDataStreamWhiteList != null) {
            this.PublicDataStreamWhiteList = new String(source.PublicDataStreamWhiteList);
        }
        if (source.PublicDataStreamWhiteListStatus != null) {
            this.PublicDataStreamWhiteListStatus = new String(source.PublicDataStreamWhiteListStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicDataStreamWhiteList", this.PublicDataStreamWhiteList);
        this.setParamSimple(map, prefix + "PublicDataStreamWhiteListStatus", this.PublicDataStreamWhiteListStatus);

    }
}

