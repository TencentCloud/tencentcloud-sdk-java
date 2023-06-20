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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAddonValuesResponse extends AbstractModel{

    /**
    * 参数列表，如果addon已安装，会使用已设置的的参数做渲染，是一个json格式的字符串
    */
    @SerializedName("Values")
    @Expose
    private String Values;

    /**
    * addon支持的参数列表，使用默认值，是一个json格式的字符串
    */
    @SerializedName("DefaultValues")
    @Expose
    private String DefaultValues;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 参数列表，如果addon已安装，会使用已设置的的参数做渲染，是一个json格式的字符串 
     * @return Values 参数列表，如果addon已安装，会使用已设置的的参数做渲染，是一个json格式的字符串
     */
    public String getValues() {
        return this.Values;
    }

    /**
     * Set 参数列表，如果addon已安装，会使用已设置的的参数做渲染，是一个json格式的字符串
     * @param Values 参数列表，如果addon已安装，会使用已设置的的参数做渲染，是一个json格式的字符串
     */
    public void setValues(String Values) {
        this.Values = Values;
    }

    /**
     * Get addon支持的参数列表，使用默认值，是一个json格式的字符串 
     * @return DefaultValues addon支持的参数列表，使用默认值，是一个json格式的字符串
     */
    public String getDefaultValues() {
        return this.DefaultValues;
    }

    /**
     * Set addon支持的参数列表，使用默认值，是一个json格式的字符串
     * @param DefaultValues addon支持的参数列表，使用默认值，是一个json格式的字符串
     */
    public void setDefaultValues(String DefaultValues) {
        this.DefaultValues = DefaultValues;
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

    public DescribeAddonValuesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAddonValuesResponse(DescribeAddonValuesResponse source) {
        if (source.Values != null) {
            this.Values = new String(source.Values);
        }
        if (source.DefaultValues != null) {
            this.DefaultValues = new String(source.DefaultValues);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Values", this.Values);
        this.setParamSimple(map, prefix + "DefaultValues", this.DefaultValues);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

