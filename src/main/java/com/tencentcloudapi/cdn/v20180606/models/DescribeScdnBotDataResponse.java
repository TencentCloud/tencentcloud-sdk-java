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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScdnBotDataResponse extends AbstractModel{

    /**
    * 统计信息详细数据
    */
    @SerializedName("Data")
    @Expose
    private BotStats [] Data;

    /**
    * 当前返回数据的粒度，取值："2min"或者"hour"，分别表示2分钟或者1小时粒度
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 统计信息详细数据 
     * @return Data 统计信息详细数据
     */
    public BotStats [] getData() {
        return this.Data;
    }

    /**
     * Set 统计信息详细数据
     * @param Data 统计信息详细数据
     */
    public void setData(BotStats [] Data) {
        this.Data = Data;
    }

    /**
     * Get 当前返回数据的粒度，取值："2min"或者"hour"，分别表示2分钟或者1小时粒度 
     * @return Interval 当前返回数据的粒度，取值："2min"或者"hour"，分别表示2分钟或者1小时粒度
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 当前返回数据的粒度，取值："2min"或者"hour"，分别表示2分钟或者1小时粒度
     * @param Interval 当前返回数据的粒度，取值："2min"或者"hour"，分别表示2分钟或者1小时粒度
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
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

    public DescribeScdnBotDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScdnBotDataResponse(DescribeScdnBotDataResponse source) {
        if (source.Data != null) {
            this.Data = new BotStats[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new BotStats(source.Data[i]);
            }
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

