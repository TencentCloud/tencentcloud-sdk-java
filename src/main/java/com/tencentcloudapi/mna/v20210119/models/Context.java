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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Context extends AbstractModel{

    /**
    * 测速数据
    */
    @SerializedName("NetworkData")
    @Expose
    private NetworkData NetworkData;

    /**
    * 用户期望最低门限
    */
    @SerializedName("ExpectedLowThreshold")
    @Expose
    private ExpectedThreshold ExpectedLowThreshold;

    /**
    * 用户期望最高门限
    */
    @SerializedName("ExpectedHighThreshold")
    @Expose
    private ExpectedThreshold ExpectedHighThreshold;

    /**
     * Get 测速数据 
     * @return NetworkData 测速数据
     */
    public NetworkData getNetworkData() {
        return this.NetworkData;
    }

    /**
     * Set 测速数据
     * @param NetworkData 测速数据
     */
    public void setNetworkData(NetworkData NetworkData) {
        this.NetworkData = NetworkData;
    }

    /**
     * Get 用户期望最低门限 
     * @return ExpectedLowThreshold 用户期望最低门限
     */
    public ExpectedThreshold getExpectedLowThreshold() {
        return this.ExpectedLowThreshold;
    }

    /**
     * Set 用户期望最低门限
     * @param ExpectedLowThreshold 用户期望最低门限
     */
    public void setExpectedLowThreshold(ExpectedThreshold ExpectedLowThreshold) {
        this.ExpectedLowThreshold = ExpectedLowThreshold;
    }

    /**
     * Get 用户期望最高门限 
     * @return ExpectedHighThreshold 用户期望最高门限
     */
    public ExpectedThreshold getExpectedHighThreshold() {
        return this.ExpectedHighThreshold;
    }

    /**
     * Set 用户期望最高门限
     * @param ExpectedHighThreshold 用户期望最高门限
     */
    public void setExpectedHighThreshold(ExpectedThreshold ExpectedHighThreshold) {
        this.ExpectedHighThreshold = ExpectedHighThreshold;
    }

    public Context() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Context(Context source) {
        if (source.NetworkData != null) {
            this.NetworkData = new NetworkData(source.NetworkData);
        }
        if (source.ExpectedLowThreshold != null) {
            this.ExpectedLowThreshold = new ExpectedThreshold(source.ExpectedLowThreshold);
        }
        if (source.ExpectedHighThreshold != null) {
            this.ExpectedHighThreshold = new ExpectedThreshold(source.ExpectedHighThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "NetworkData.", this.NetworkData);
        this.setParamObj(map, prefix + "ExpectedLowThreshold.", this.ExpectedLowThreshold);
        this.setParamObj(map, prefix + "ExpectedHighThreshold.", this.ExpectedHighThreshold);

    }
}

