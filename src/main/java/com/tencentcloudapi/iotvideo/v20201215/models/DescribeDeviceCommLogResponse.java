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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceCommLogResponse extends AbstractModel{

    /**
    * 数据是否已全部返回，true 表示数据全部返回，false 表示还有数据待返回，可将 Context 作为入参，继续查询返回结果。
    */
    @SerializedName("Listover")
    @Expose
    private Boolean Listover;

    /**
    * 检索上下文，当 ListOver 为false时，可以用此上下文，继续读取后续数据
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 日志数据结果数组，返回对应时间点及取值。
    */
    @SerializedName("Results")
    @Expose
    private DeviceCommLogItem [] Results;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据是否已全部返回，true 表示数据全部返回，false 表示还有数据待返回，可将 Context 作为入参，继续查询返回结果。 
     * @return Listover 数据是否已全部返回，true 表示数据全部返回，false 表示还有数据待返回，可将 Context 作为入参，继续查询返回结果。
     */
    public Boolean getListover() {
        return this.Listover;
    }

    /**
     * Set 数据是否已全部返回，true 表示数据全部返回，false 表示还有数据待返回，可将 Context 作为入参，继续查询返回结果。
     * @param Listover 数据是否已全部返回，true 表示数据全部返回，false 表示还有数据待返回，可将 Context 作为入参，继续查询返回结果。
     */
    public void setListover(Boolean Listover) {
        this.Listover = Listover;
    }

    /**
     * Get 检索上下文，当 ListOver 为false时，可以用此上下文，继续读取后续数据 
     * @return Context 检索上下文，当 ListOver 为false时，可以用此上下文，继续读取后续数据
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 检索上下文，当 ListOver 为false时，可以用此上下文，继续读取后续数据
     * @param Context 检索上下文，当 ListOver 为false时，可以用此上下文，继续读取后续数据
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 日志数据结果数组，返回对应时间点及取值。 
     * @return Results 日志数据结果数组，返回对应时间点及取值。
     */
    public DeviceCommLogItem [] getResults() {
        return this.Results;
    }

    /**
     * Set 日志数据结果数组，返回对应时间点及取值。
     * @param Results 日志数据结果数组，返回对应时间点及取值。
     */
    public void setResults(DeviceCommLogItem [] Results) {
        this.Results = Results;
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

    public DescribeDeviceCommLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceCommLogResponse(DescribeDeviceCommLogResponse source) {
        if (source.Listover != null) {
            this.Listover = new Boolean(source.Listover);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Results != null) {
            this.Results = new DeviceCommLogItem[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new DeviceCommLogItem(source.Results[i]);
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
        this.setParamSimple(map, prefix + "Listover", this.Listover);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

