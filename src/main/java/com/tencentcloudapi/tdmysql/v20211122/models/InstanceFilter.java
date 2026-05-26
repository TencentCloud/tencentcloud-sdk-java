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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceFilter extends AbstractModel {

    /**
    * 过滤key，支持InstanceId、VpcId、SubnetId、Vip、Vport、Status、InstanceName、TagKey
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 过滤value
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 过滤key，支持InstanceId、VpcId、SubnetId、Vip、Vport、Status、InstanceName、TagKey 
     * @return Name 过滤key，支持InstanceId、VpcId、SubnetId、Vip、Vport、Status、InstanceName、TagKey
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 过滤key，支持InstanceId、VpcId、SubnetId、Vip、Vport、Status、InstanceName、TagKey
     * @param Name 过滤key，支持InstanceId、VpcId、SubnetId、Vip、Vport、Status、InstanceName、TagKey
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 过滤value 
     * @return Values 过滤value
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 过滤value
     * @param Values 过滤value
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public InstanceFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceFilter(InstanceFilter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

