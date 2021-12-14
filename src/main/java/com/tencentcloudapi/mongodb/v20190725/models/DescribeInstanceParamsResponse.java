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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceParamsResponse extends AbstractModel{

    /**
    * 值为枚举类型参数集合
    */
    @SerializedName("InstanceEnumParam")
    @Expose
    private InstanceEnumParam [] InstanceEnumParam;

    /**
    * 值为integer类型参数集合
    */
    @SerializedName("InstanceIntegerParam")
    @Expose
    private InstanceIntegerParam [] InstanceIntegerParam;

    /**
    * 值为text类型的参数集合
    */
    @SerializedName("InstanceTextParam")
    @Expose
    private InstanceTextParam [] InstanceTextParam;

    /**
    * 值为混合类型的参数集合
    */
    @SerializedName("InstanceMultiParam")
    @Expose
    private InstanceMultiParam [] InstanceMultiParam;

    /**
    * 当前实例支持修改的参数个数统计 如0
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 值为枚举类型参数集合 
     * @return InstanceEnumParam 值为枚举类型参数集合
     */
    public InstanceEnumParam [] getInstanceEnumParam() {
        return this.InstanceEnumParam;
    }

    /**
     * Set 值为枚举类型参数集合
     * @param InstanceEnumParam 值为枚举类型参数集合
     */
    public void setInstanceEnumParam(InstanceEnumParam [] InstanceEnumParam) {
        this.InstanceEnumParam = InstanceEnumParam;
    }

    /**
     * Get 值为integer类型参数集合 
     * @return InstanceIntegerParam 值为integer类型参数集合
     */
    public InstanceIntegerParam [] getInstanceIntegerParam() {
        return this.InstanceIntegerParam;
    }

    /**
     * Set 值为integer类型参数集合
     * @param InstanceIntegerParam 值为integer类型参数集合
     */
    public void setInstanceIntegerParam(InstanceIntegerParam [] InstanceIntegerParam) {
        this.InstanceIntegerParam = InstanceIntegerParam;
    }

    /**
     * Get 值为text类型的参数集合 
     * @return InstanceTextParam 值为text类型的参数集合
     */
    public InstanceTextParam [] getInstanceTextParam() {
        return this.InstanceTextParam;
    }

    /**
     * Set 值为text类型的参数集合
     * @param InstanceTextParam 值为text类型的参数集合
     */
    public void setInstanceTextParam(InstanceTextParam [] InstanceTextParam) {
        this.InstanceTextParam = InstanceTextParam;
    }

    /**
     * Get 值为混合类型的参数集合 
     * @return InstanceMultiParam 值为混合类型的参数集合
     */
    public InstanceMultiParam [] getInstanceMultiParam() {
        return this.InstanceMultiParam;
    }

    /**
     * Set 值为混合类型的参数集合
     * @param InstanceMultiParam 值为混合类型的参数集合
     */
    public void setInstanceMultiParam(InstanceMultiParam [] InstanceMultiParam) {
        this.InstanceMultiParam = InstanceMultiParam;
    }

    /**
     * Get 当前实例支持修改的参数个数统计 如0 
     * @return TotalCount 当前实例支持修改的参数个数统计 如0
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 当前实例支持修改的参数个数统计 如0
     * @param TotalCount 当前实例支持修改的参数个数统计 如0
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeInstanceParamsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceParamsResponse(DescribeInstanceParamsResponse source) {
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
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InstanceEnumParam.", this.InstanceEnumParam);
        this.setParamArrayObj(map, prefix + "InstanceIntegerParam.", this.InstanceIntegerParam);
        this.setParamArrayObj(map, prefix + "InstanceTextParam.", this.InstanceTextParam);
        this.setParamArrayObj(map, prefix + "InstanceMultiParam.", this.InstanceMultiParam);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

