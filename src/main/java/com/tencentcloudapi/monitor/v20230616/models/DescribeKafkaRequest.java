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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKafkaRequest extends AbstractModel {

    /**
    * kafka地址
    */
    @SerializedName("Brokers")
    @Expose
    private String Brokers;

    /**
    * 转发部署地域列表
    */
    @SerializedName("DispenseRegions")
    @Expose
    private String [] DispenseRegions;

    /**
     * Get kafka地址 
     * @return Brokers kafka地址
     */
    public String getBrokers() {
        return this.Brokers;
    }

    /**
     * Set kafka地址
     * @param Brokers kafka地址
     */
    public void setBrokers(String Brokers) {
        this.Brokers = Brokers;
    }

    /**
     * Get 转发部署地域列表 
     * @return DispenseRegions 转发部署地域列表
     */
    public String [] getDispenseRegions() {
        return this.DispenseRegions;
    }

    /**
     * Set 转发部署地域列表
     * @param DispenseRegions 转发部署地域列表
     */
    public void setDispenseRegions(String [] DispenseRegions) {
        this.DispenseRegions = DispenseRegions;
    }

    public DescribeKafkaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKafkaRequest(DescribeKafkaRequest source) {
        if (source.Brokers != null) {
            this.Brokers = new String(source.Brokers);
        }
        if (source.DispenseRegions != null) {
            this.DispenseRegions = new String[source.DispenseRegions.length];
            for (int i = 0; i < source.DispenseRegions.length; i++) {
                this.DispenseRegions[i] = new String(source.DispenseRegions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Brokers", this.Brokers);
        this.setParamArraySimple(map, prefix + "DispenseRegions.", this.DispenseRegions);

    }
}

