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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterPasswordComplexityResponse extends AbstractModel {

    /**
    * 数据字典参数
    */
    @SerializedName("ValidatePasswordDictionary")
    @Expose
    private ParamInfo ValidatePasswordDictionary;

    /**
    * 密码长度
    */
    @SerializedName("ValidatePasswordLength")
    @Expose
    private ParamInfo ValidatePasswordLength;

    /**
    * 大小写敏感字符个数
    */
    @SerializedName("ValidatePasswordMixedCaseCount")
    @Expose
    private ParamInfo ValidatePasswordMixedCaseCount;

    /**
    * 数字个数
    */
    @SerializedName("ValidatePasswordNumberCount")
    @Expose
    private ParamInfo ValidatePasswordNumberCount;

    /**
    * 密码等级
    */
    @SerializedName("ValidatePasswordPolicy")
    @Expose
    private ParamInfo ValidatePasswordPolicy;

    /**
    * 特殊字符个数
    */
    @SerializedName("ValidatePasswordSpecialCharCount")
    @Expose
    private ParamInfo ValidatePasswordSpecialCharCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据字典参数 
     * @return ValidatePasswordDictionary 数据字典参数
     */
    public ParamInfo getValidatePasswordDictionary() {
        return this.ValidatePasswordDictionary;
    }

    /**
     * Set 数据字典参数
     * @param ValidatePasswordDictionary 数据字典参数
     */
    public void setValidatePasswordDictionary(ParamInfo ValidatePasswordDictionary) {
        this.ValidatePasswordDictionary = ValidatePasswordDictionary;
    }

    /**
     * Get 密码长度 
     * @return ValidatePasswordLength 密码长度
     */
    public ParamInfo getValidatePasswordLength() {
        return this.ValidatePasswordLength;
    }

    /**
     * Set 密码长度
     * @param ValidatePasswordLength 密码长度
     */
    public void setValidatePasswordLength(ParamInfo ValidatePasswordLength) {
        this.ValidatePasswordLength = ValidatePasswordLength;
    }

    /**
     * Get 大小写敏感字符个数 
     * @return ValidatePasswordMixedCaseCount 大小写敏感字符个数
     */
    public ParamInfo getValidatePasswordMixedCaseCount() {
        return this.ValidatePasswordMixedCaseCount;
    }

    /**
     * Set 大小写敏感字符个数
     * @param ValidatePasswordMixedCaseCount 大小写敏感字符个数
     */
    public void setValidatePasswordMixedCaseCount(ParamInfo ValidatePasswordMixedCaseCount) {
        this.ValidatePasswordMixedCaseCount = ValidatePasswordMixedCaseCount;
    }

    /**
     * Get 数字个数 
     * @return ValidatePasswordNumberCount 数字个数
     */
    public ParamInfo getValidatePasswordNumberCount() {
        return this.ValidatePasswordNumberCount;
    }

    /**
     * Set 数字个数
     * @param ValidatePasswordNumberCount 数字个数
     */
    public void setValidatePasswordNumberCount(ParamInfo ValidatePasswordNumberCount) {
        this.ValidatePasswordNumberCount = ValidatePasswordNumberCount;
    }

    /**
     * Get 密码等级 
     * @return ValidatePasswordPolicy 密码等级
     */
    public ParamInfo getValidatePasswordPolicy() {
        return this.ValidatePasswordPolicy;
    }

    /**
     * Set 密码等级
     * @param ValidatePasswordPolicy 密码等级
     */
    public void setValidatePasswordPolicy(ParamInfo ValidatePasswordPolicy) {
        this.ValidatePasswordPolicy = ValidatePasswordPolicy;
    }

    /**
     * Get 特殊字符个数 
     * @return ValidatePasswordSpecialCharCount 特殊字符个数
     */
    public ParamInfo getValidatePasswordSpecialCharCount() {
        return this.ValidatePasswordSpecialCharCount;
    }

    /**
     * Set 特殊字符个数
     * @param ValidatePasswordSpecialCharCount 特殊字符个数
     */
    public void setValidatePasswordSpecialCharCount(ParamInfo ValidatePasswordSpecialCharCount) {
        this.ValidatePasswordSpecialCharCount = ValidatePasswordSpecialCharCount;
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

    public DescribeClusterPasswordComplexityResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterPasswordComplexityResponse(DescribeClusterPasswordComplexityResponse source) {
        if (source.ValidatePasswordDictionary != null) {
            this.ValidatePasswordDictionary = new ParamInfo(source.ValidatePasswordDictionary);
        }
        if (source.ValidatePasswordLength != null) {
            this.ValidatePasswordLength = new ParamInfo(source.ValidatePasswordLength);
        }
        if (source.ValidatePasswordMixedCaseCount != null) {
            this.ValidatePasswordMixedCaseCount = new ParamInfo(source.ValidatePasswordMixedCaseCount);
        }
        if (source.ValidatePasswordNumberCount != null) {
            this.ValidatePasswordNumberCount = new ParamInfo(source.ValidatePasswordNumberCount);
        }
        if (source.ValidatePasswordPolicy != null) {
            this.ValidatePasswordPolicy = new ParamInfo(source.ValidatePasswordPolicy);
        }
        if (source.ValidatePasswordSpecialCharCount != null) {
            this.ValidatePasswordSpecialCharCount = new ParamInfo(source.ValidatePasswordSpecialCharCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ValidatePasswordDictionary.", this.ValidatePasswordDictionary);
        this.setParamObj(map, prefix + "ValidatePasswordLength.", this.ValidatePasswordLength);
        this.setParamObj(map, prefix + "ValidatePasswordMixedCaseCount.", this.ValidatePasswordMixedCaseCount);
        this.setParamObj(map, prefix + "ValidatePasswordNumberCount.", this.ValidatePasswordNumberCount);
        this.setParamObj(map, prefix + "ValidatePasswordPolicy.", this.ValidatePasswordPolicy);
        this.setParamObj(map, prefix + "ValidatePasswordSpecialCharCount.", this.ValidatePasswordSpecialCharCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

