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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetPortCountRequest extends AbstractModel {

    /**
    * 搜索条件：返回指定端口号数据
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get 搜索条件：返回指定端口号数据 
     * @return Port 搜索条件：返回指定端口号数据
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 搜索条件：返回指定端口号数据
     * @param Port 搜索条件：返回指定端口号数据
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public DescribeAssetPortCountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetPortCountRequest(DescribeAssetPortCountRequest source) {
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

