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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResolveCountAliasItem extends AbstractModel {

    /**
    * 域名解析量统计信息
    */
    @SerializedName("Info")
    @Expose
    private ResolveCountInfo Info;

    /**
    * 解析量明细
    */
    @SerializedName("Data")
    @Expose
    private ResolveCountDataItem [] Data;

    /**
     * Get 域名解析量统计信息 
     * @return Info 域名解析量统计信息
     */
    public ResolveCountInfo getInfo() {
        return this.Info;
    }

    /**
     * Set 域名解析量统计信息
     * @param Info 域名解析量统计信息
     */
    public void setInfo(ResolveCountInfo Info) {
        this.Info = Info;
    }

    /**
     * Get 解析量明细 
     * @return Data 解析量明细
     */
    public ResolveCountDataItem [] getData() {
        return this.Data;
    }

    /**
     * Set 解析量明细
     * @param Data 解析量明细
     */
    public void setData(ResolveCountDataItem [] Data) {
        this.Data = Data;
    }

    public ResolveCountAliasItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResolveCountAliasItem(ResolveCountAliasItem source) {
        if (source.Info != null) {
            this.Info = new ResolveCountInfo(source.Info);
        }
        if (source.Data != null) {
            this.Data = new ResolveCountDataItem[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new ResolveCountDataItem(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Info.", this.Info);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

