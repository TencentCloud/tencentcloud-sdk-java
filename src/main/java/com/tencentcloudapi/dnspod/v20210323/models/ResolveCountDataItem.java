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

public class ResolveCountDataItem extends AbstractModel {

    /**
    * 解析量
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * 统计的时间点
    */
    @SerializedName("DateKey")
    @Expose
    private String DateKey;

    /**
     * Get 解析量 
     * @return Num 解析量
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 解析量
     * @param Num 解析量
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get 统计的时间点 
     * @return DateKey 统计的时间点
     */
    public String getDateKey() {
        return this.DateKey;
    }

    /**
     * Set 统计的时间点
     * @param DateKey 统计的时间点
     */
    public void setDateKey(String DateKey) {
        this.DateKey = DateKey;
    }

    public ResolveCountDataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResolveCountDataItem(ResolveCountDataItem source) {
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.DateKey != null) {
            this.DateKey = new String(source.DateKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "DateKey", this.DateKey);

    }
}

