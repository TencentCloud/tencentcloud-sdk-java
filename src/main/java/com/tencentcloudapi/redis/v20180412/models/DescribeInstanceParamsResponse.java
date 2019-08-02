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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceParamsResponse  extends AbstractModel{

    /**
    * 实例参数个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 实例枚举类型参数
    */
    @SerializedName("InstanceEnumParam")
    @Expose
    private InstanceEnumParam [] InstanceEnumParam;

    /**
    * 实例整型参数
    */
    @SerializedName("InstanceIntegerParam")
    @Expose
    private InstanceIntegerParam [] InstanceIntegerParam;

    /**
    * 实例字符型参数
    */
    @SerializedName("InstanceTextParam")
    @Expose
    private InstanceTextParam [] InstanceTextParam;

    /**
    * 实例多选项型参数
    */
    @SerializedName("InstanceMultiParam")
    @Expose
    private InstanceMultiParam [] InstanceMultiParam;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取实例参数个数
     * @return TotalCount 实例参数个数
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置实例参数个数
     * @param TotalCount 实例参数个数
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取实例枚举类型参数
     * @return InstanceEnumParam 实例枚举类型参数
     */
    public InstanceEnumParam [] getInstanceEnumParam() {
        return this.InstanceEnumParam;
    }

    /**
     * 设置实例枚举类型参数
     * @param InstanceEnumParam 实例枚举类型参数
     */
    public void setInstanceEnumParam(InstanceEnumParam [] InstanceEnumParam) {
        this.InstanceEnumParam = InstanceEnumParam;
    }

    /**
     * 获取实例整型参数
     * @return InstanceIntegerParam 实例整型参数
     */
    public InstanceIntegerParam [] getInstanceIntegerParam() {
        return this.InstanceIntegerParam;
    }

    /**
     * 设置实例整型参数
     * @param InstanceIntegerParam 实例整型参数
     */
    public void setInstanceIntegerParam(InstanceIntegerParam [] InstanceIntegerParam) {
        this.InstanceIntegerParam = InstanceIntegerParam;
    }

    /**
     * 获取实例字符型参数
     * @return InstanceTextParam 实例字符型参数
     */
    public InstanceTextParam [] getInstanceTextParam() {
        return this.InstanceTextParam;
    }

    /**
     * 设置实例字符型参数
     * @param InstanceTextParam 实例字符型参数
     */
    public void setInstanceTextParam(InstanceTextParam [] InstanceTextParam) {
        this.InstanceTextParam = InstanceTextParam;
    }

    /**
     * 获取实例多选项型参数
     * @return InstanceMultiParam 实例多选项型参数
     */
    public InstanceMultiParam [] getInstanceMultiParam() {
        return this.InstanceMultiParam;
    }

    /**
     * 设置实例多选项型参数
     * @param InstanceMultiParam 实例多选项型参数
     */
    public void setInstanceMultiParam(InstanceMultiParam [] InstanceMultiParam) {
        this.InstanceMultiParam = InstanceMultiParam;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
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

