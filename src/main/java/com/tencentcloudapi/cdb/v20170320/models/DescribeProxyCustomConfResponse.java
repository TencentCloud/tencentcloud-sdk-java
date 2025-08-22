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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxyCustomConfResponse extends AbstractModel {

    /**
    * 代理配置数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 代理配置
    */
    @SerializedName("CustomConf")
    @Expose
    private CustomConfig CustomConf;

    /**
    * 权重限制
    */
    @SerializedName("WeightRule")
    @Expose
    private Rule WeightRule;

    /**
    * 代理配置
    */
    @SerializedName("CustomConfInfo")
    @Expose
    private CustomConfig [] CustomConfInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 代理配置数 
     * @return Count 代理配置数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 代理配置数
     * @param Count 代理配置数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 代理配置 
     * @return CustomConf 代理配置
     * @deprecated
     */
    @Deprecated
    public CustomConfig getCustomConf() {
        return this.CustomConf;
    }

    /**
     * Set 代理配置
     * @param CustomConf 代理配置
     * @deprecated
     */
    @Deprecated
    public void setCustomConf(CustomConfig CustomConf) {
        this.CustomConf = CustomConf;
    }

    /**
     * Get 权重限制 
     * @return WeightRule 权重限制
     */
    public Rule getWeightRule() {
        return this.WeightRule;
    }

    /**
     * Set 权重限制
     * @param WeightRule 权重限制
     */
    public void setWeightRule(Rule WeightRule) {
        this.WeightRule = WeightRule;
    }

    /**
     * Get 代理配置 
     * @return CustomConfInfo 代理配置
     */
    public CustomConfig [] getCustomConfInfo() {
        return this.CustomConfInfo;
    }

    /**
     * Set 代理配置
     * @param CustomConfInfo 代理配置
     */
    public void setCustomConfInfo(CustomConfig [] CustomConfInfo) {
        this.CustomConfInfo = CustomConfInfo;
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

    public DescribeProxyCustomConfResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxyCustomConfResponse(DescribeProxyCustomConfResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.CustomConf != null) {
            this.CustomConf = new CustomConfig(source.CustomConf);
        }
        if (source.WeightRule != null) {
            this.WeightRule = new Rule(source.WeightRule);
        }
        if (source.CustomConfInfo != null) {
            this.CustomConfInfo = new CustomConfig[source.CustomConfInfo.length];
            for (int i = 0; i < source.CustomConfInfo.length; i++) {
                this.CustomConfInfo[i] = new CustomConfig(source.CustomConfInfo[i]);
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
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamObj(map, prefix + "CustomConf.", this.CustomConf);
        this.setParamObj(map, prefix + "WeightRule.", this.WeightRule);
        this.setParamArrayObj(map, prefix + "CustomConfInfo.", this.CustomConfInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

