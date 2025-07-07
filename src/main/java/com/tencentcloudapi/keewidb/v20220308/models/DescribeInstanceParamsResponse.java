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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceParamsResponse extends AbstractModel {

    /**
    * 实例参数总数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 实例枚举类型参数数组。
    */
    @SerializedName("InstanceEnumParam")
    @Expose
    private InstanceEnumParam [] InstanceEnumParam;

    /**
    * 实例整型参数数组。
    */
    @SerializedName("InstanceIntegerParam")
    @Expose
    private InstanceIntegerParam [] InstanceIntegerParam;

    /**
    * 实例字符型参数数组。
    */
    @SerializedName("InstanceTextParam")
    @Expose
    private InstanceTextParam [] InstanceTextParam;

    /**
    * 实例多选项型参数数组。
    */
    @SerializedName("InstanceMultiParam")
    @Expose
    private InstanceMultiParam [] InstanceMultiParam;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例参数总数量。 
     * @return TotalCount 实例参数总数量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 实例参数总数量。
     * @param TotalCount 实例参数总数量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 实例枚举类型参数数组。 
     * @return InstanceEnumParam 实例枚举类型参数数组。
     */
    public InstanceEnumParam [] getInstanceEnumParam() {
        return this.InstanceEnumParam;
    }

    /**
     * Set 实例枚举类型参数数组。
     * @param InstanceEnumParam 实例枚举类型参数数组。
     */
    public void setInstanceEnumParam(InstanceEnumParam [] InstanceEnumParam) {
        this.InstanceEnumParam = InstanceEnumParam;
    }

    /**
     * Get 实例整型参数数组。 
     * @return InstanceIntegerParam 实例整型参数数组。
     */
    public InstanceIntegerParam [] getInstanceIntegerParam() {
        return this.InstanceIntegerParam;
    }

    /**
     * Set 实例整型参数数组。
     * @param InstanceIntegerParam 实例整型参数数组。
     */
    public void setInstanceIntegerParam(InstanceIntegerParam [] InstanceIntegerParam) {
        this.InstanceIntegerParam = InstanceIntegerParam;
    }

    /**
     * Get 实例字符型参数数组。 
     * @return InstanceTextParam 实例字符型参数数组。
     */
    public InstanceTextParam [] getInstanceTextParam() {
        return this.InstanceTextParam;
    }

    /**
     * Set 实例字符型参数数组。
     * @param InstanceTextParam 实例字符型参数数组。
     */
    public void setInstanceTextParam(InstanceTextParam [] InstanceTextParam) {
        this.InstanceTextParam = InstanceTextParam;
    }

    /**
     * Get 实例多选项型参数数组。 
     * @return InstanceMultiParam 实例多选项型参数数组。
     */
    public InstanceMultiParam [] getInstanceMultiParam() {
        return this.InstanceMultiParam;
    }

    /**
     * Set 实例多选项型参数数组。
     * @param InstanceMultiParam 实例多选项型参数数组。
     */
    public void setInstanceMultiParam(InstanceMultiParam [] InstanceMultiParam) {
        this.InstanceMultiParam = InstanceMultiParam;
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

    public DescribeInstanceParamsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceParamsResponse(DescribeInstanceParamsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.InstanceEnumParam != null) {
            this.InstanceEnumParam = new InstanceEnumParam[source.InstanceEnumParam.length];
            for (int i = 0; i < source.InstanceEnumParam.length; i++) {
                this.InstanceEnumParam[i] = new InstanceEnumParam(source.InstanceEnumParam[i]);
            }
        }
        if (source.InstanceIntegerParam != null) {
            this.InstanceIntegerParam = new InstanceIntegerParam[source.InstanceIntegerParam.length];
            for (int i = 0; i < source.InstanceIntegerParam.length; i++) {
                this.InstanceIntegerParam[i] = new InstanceIntegerParam(source.InstanceIntegerParam[i]);
            }
        }
        if (source.InstanceTextParam != null) {
            this.InstanceTextParam = new InstanceTextParam[source.InstanceTextParam.length];
            for (int i = 0; i < source.InstanceTextParam.length; i++) {
                this.InstanceTextParam[i] = new InstanceTextParam(source.InstanceTextParam[i]);
            }
        }
        if (source.InstanceMultiParam != null) {
            this.InstanceMultiParam = new InstanceMultiParam[source.InstanceMultiParam.length];
            for (int i = 0; i < source.InstanceMultiParam.length; i++) {
                this.InstanceMultiParam[i] = new InstanceMultiParam(source.InstanceMultiParam[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "InstanceEnumParam.", this.InstanceEnumParam);
        this.setParamArrayObj(map, prefix + "InstanceIntegerParam.", this.InstanceIntegerParam);
        this.setParamArrayObj(map, prefix + "InstanceTextParam.", this.InstanceTextParam);
        this.setParamArrayObj(map, prefix + "InstanceMultiParam.", this.InstanceMultiParam);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

