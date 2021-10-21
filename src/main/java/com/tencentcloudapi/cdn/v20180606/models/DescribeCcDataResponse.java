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

public class DescribeCcDataResponse extends AbstractModel{

    /**
    * 指定执行动作的请求数数据，如果指定类型为空，表示所有类型的请求总数
    */
    @SerializedName("Data")
    @Expose
    private TimestampData [] Data;

    /**
    * 粒度
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 执行动作为拦截类型QPS统计数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InterceptQpsData")
    @Expose
    private TimestampData [] InterceptQpsData;

    /**
    * 执行动作为重定向类型QPS统计数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedirectQpsData")
    @Expose
    private TimestampData [] RedirectQpsData;

    /**
    * 执行动作为观察类型QPS统计数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObserveQpsData")
    @Expose
    private TimestampData [] ObserveQpsData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 指定执行动作的请求数数据，如果指定类型为空，表示所有类型的请求总数 
     * @return Data 指定执行动作的请求数数据，如果指定类型为空，表示所有类型的请求总数
     */
    public TimestampData [] getData() {
        return this.Data;
    }

    /**
     * Set 指定执行动作的请求数数据，如果指定类型为空，表示所有类型的请求总数
     * @param Data 指定执行动作的请求数数据，如果指定类型为空，表示所有类型的请求总数
     */
    public void setData(TimestampData [] Data) {
        this.Data = Data;
    }

    /**
     * Get 粒度 
     * @return Interval 粒度
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 粒度
     * @param Interval 粒度
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 执行动作为拦截类型QPS统计数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InterceptQpsData 执行动作为拦截类型QPS统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TimestampData [] getInterceptQpsData() {
        return this.InterceptQpsData;
    }

    /**
     * Set 执行动作为拦截类型QPS统计数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param InterceptQpsData 执行动作为拦截类型QPS统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInterceptQpsData(TimestampData [] InterceptQpsData) {
        this.InterceptQpsData = InterceptQpsData;
    }

    /**
     * Get 执行动作为重定向类型QPS统计数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedirectQpsData 执行动作为重定向类型QPS统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TimestampData [] getRedirectQpsData() {
        return this.RedirectQpsData;
    }

    /**
     * Set 执行动作为重定向类型QPS统计数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedirectQpsData 执行动作为重定向类型QPS统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedirectQpsData(TimestampData [] RedirectQpsData) {
        this.RedirectQpsData = RedirectQpsData;
    }

    /**
     * Get 执行动作为观察类型QPS统计数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObserveQpsData 执行动作为观察类型QPS统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TimestampData [] getObserveQpsData() {
        return this.ObserveQpsData;
    }

    /**
     * Set 执行动作为观察类型QPS统计数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObserveQpsData 执行动作为观察类型QPS统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObserveQpsData(TimestampData [] ObserveQpsData) {
        this.ObserveQpsData = ObserveQpsData;
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

    public DescribeCcDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCcDataResponse(DescribeCcDataResponse source) {
        if (source.Data != null) {
            this.Data = new TimestampData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new TimestampData(source.Data[i]);
            }
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.InterceptQpsData != null) {
            this.InterceptQpsData = new TimestampData[source.InterceptQpsData.length];
            for (int i = 0; i < source.InterceptQpsData.length; i++) {
                this.InterceptQpsData[i] = new TimestampData(source.InterceptQpsData[i]);
            }
        }
        if (source.RedirectQpsData != null) {
            this.RedirectQpsData = new TimestampData[source.RedirectQpsData.length];
            for (int i = 0; i < source.RedirectQpsData.length; i++) {
                this.RedirectQpsData[i] = new TimestampData(source.RedirectQpsData[i]);
            }
        }
        if (source.ObserveQpsData != null) {
            this.ObserveQpsData = new TimestampData[source.ObserveQpsData.length];
            for (int i = 0; i < source.ObserveQpsData.length; i++) {
                this.ObserveQpsData[i] = new TimestampData(source.ObserveQpsData[i]);
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
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "InterceptQpsData.", this.InterceptQpsData);
        this.setParamArrayObj(map, prefix + "RedirectQpsData.", this.RedirectQpsData);
        this.setParamArrayObj(map, prefix + "ObserveQpsData.", this.ObserveQpsData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

