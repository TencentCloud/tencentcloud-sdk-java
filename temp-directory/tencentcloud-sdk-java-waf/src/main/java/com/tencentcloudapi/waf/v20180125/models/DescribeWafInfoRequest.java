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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWafInfoRequest extends AbstractModel {

    /**
    * CLB回调WAF接口（获取、删除）的参数
    */
    @SerializedName("Params")
    @Expose
    private ClbHostsParams [] Params;

    /**
     * Get CLB回调WAF接口（获取、删除）的参数 
     * @return Params CLB回调WAF接口（获取、删除）的参数
     */
    public ClbHostsParams [] getParams() {
        return this.Params;
    }

    /**
     * Set CLB回调WAF接口（获取、删除）的参数
     * @param Params CLB回调WAF接口（获取、删除）的参数
     */
    public void setParams(ClbHostsParams [] Params) {
        this.Params = Params;
    }

    public DescribeWafInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWafInfoRequest(DescribeWafInfoRequest source) {
        if (source.Params != null) {
            this.Params = new ClbHostsParams[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new ClbHostsParams(source.Params[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Params.", this.Params);

    }
}

