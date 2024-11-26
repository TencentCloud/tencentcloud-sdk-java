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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTokenUsageGraphResponse extends AbstractModel {

    /**
    * Token消耗总量
    */
    @SerializedName("Total")
    @Expose
    private Stat [] Total;

    /**
    * 输入Token消耗量
    */
    @SerializedName("Input")
    @Expose
    private Stat [] Input;

    /**
    * 输出Token消耗量
    */
    @SerializedName("Output")
    @Expose
    private Stat [] Output;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Token消耗总量 
     * @return Total Token消耗总量
     */
    public Stat [] getTotal() {
        return this.Total;
    }

    /**
     * Set Token消耗总量
     * @param Total Token消耗总量
     */
    public void setTotal(Stat [] Total) {
        this.Total = Total;
    }

    /**
     * Get 输入Token消耗量 
     * @return Input 输入Token消耗量
     */
    public Stat [] getInput() {
        return this.Input;
    }

    /**
     * Set 输入Token消耗量
     * @param Input 输入Token消耗量
     */
    public void setInput(Stat [] Input) {
        this.Input = Input;
    }

    /**
     * Get 输出Token消耗量 
     * @return Output 输出Token消耗量
     */
    public Stat [] getOutput() {
        return this.Output;
    }

    /**
     * Set 输出Token消耗量
     * @param Output 输出Token消耗量
     */
    public void setOutput(Stat [] Output) {
        this.Output = Output;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTokenUsageGraphResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTokenUsageGraphResponse(DescribeTokenUsageGraphResponse source) {
        if (source.Total != null) {
            this.Total = new Stat[source.Total.length];
            for (int i = 0; i < source.Total.length; i++) {
                this.Total[i] = new Stat(source.Total[i]);
            }
        }
        if (source.Input != null) {
            this.Input = new Stat[source.Input.length];
            for (int i = 0; i < source.Input.length; i++) {
                this.Input[i] = new Stat(source.Input[i]);
            }
        }
        if (source.Output != null) {
            this.Output = new Stat[source.Output.length];
            for (int i = 0; i < source.Output.length; i++) {
                this.Output[i] = new Stat(source.Output[i]);
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
        this.setParamArrayObj(map, prefix + "Total.", this.Total);
        this.setParamArrayObj(map, prefix + "Input.", this.Input);
        this.setParamArrayObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

