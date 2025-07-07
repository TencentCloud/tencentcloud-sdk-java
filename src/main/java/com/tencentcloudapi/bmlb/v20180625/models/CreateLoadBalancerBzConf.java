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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLoadBalancerBzConf extends AbstractModel {

    /**
    * 按月/按小时计费。
    */
    @SerializedName("BzPayMode")
    @Expose
    private String BzPayMode;

    /**
    * 四层可选按带宽，连接数衡量。
    */
    @SerializedName("BzL4Metrics")
    @Expose
    private String BzL4Metrics;

    /**
    * 七层可选按qps衡量。
    */
    @SerializedName("BzL7Metrics")
    @Expose
    private String BzL7Metrics;

    /**
     * Get 按月/按小时计费。 
     * @return BzPayMode 按月/按小时计费。
     */
    public String getBzPayMode() {
        return this.BzPayMode;
    }

    /**
     * Set 按月/按小时计费。
     * @param BzPayMode 按月/按小时计费。
     */
    public void setBzPayMode(String BzPayMode) {
        this.BzPayMode = BzPayMode;
    }

    /**
     * Get 四层可选按带宽，连接数衡量。 
     * @return BzL4Metrics 四层可选按带宽，连接数衡量。
     */
    public String getBzL4Metrics() {
        return this.BzL4Metrics;
    }

    /**
     * Set 四层可选按带宽，连接数衡量。
     * @param BzL4Metrics 四层可选按带宽，连接数衡量。
     */
    public void setBzL4Metrics(String BzL4Metrics) {
        this.BzL4Metrics = BzL4Metrics;
    }

    /**
     * Get 七层可选按qps衡量。 
     * @return BzL7Metrics 七层可选按qps衡量。
     */
    public String getBzL7Metrics() {
        return this.BzL7Metrics;
    }

    /**
     * Set 七层可选按qps衡量。
     * @param BzL7Metrics 七层可选按qps衡量。
     */
    public void setBzL7Metrics(String BzL7Metrics) {
        this.BzL7Metrics = BzL7Metrics;
    }

    public CreateLoadBalancerBzConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLoadBalancerBzConf(CreateLoadBalancerBzConf source) {
        if (source.BzPayMode != null) {
            this.BzPayMode = new String(source.BzPayMode);
        }
        if (source.BzL4Metrics != null) {
            this.BzL4Metrics = new String(source.BzL4Metrics);
        }
        if (source.BzL7Metrics != null) {
            this.BzL7Metrics = new String(source.BzL7Metrics);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BzPayMode", this.BzPayMode);
        this.setParamSimple(map, prefix + "BzL4Metrics", this.BzL4Metrics);
        this.setParamSimple(map, prefix + "BzL7Metrics", this.BzL7Metrics);

    }
}

