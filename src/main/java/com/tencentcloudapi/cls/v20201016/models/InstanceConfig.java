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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceConfig extends AbstractModel {

    /**
    * 实例维度
    */
    @SerializedName("InstanceDimension")
    @Expose
    private String [] InstanceDimension;

    /**
    * 实例值
    */
    @SerializedName("Instances")
    @Expose
    private Instance [] Instances;

    /**
     * Get 实例维度 
     * @return InstanceDimension 实例维度
     */
    public String [] getInstanceDimension() {
        return this.InstanceDimension;
    }

    /**
     * Set 实例维度
     * @param InstanceDimension 实例维度
     */
    public void setInstanceDimension(String [] InstanceDimension) {
        this.InstanceDimension = InstanceDimension;
    }

    /**
     * Get 实例值 
     * @return Instances 实例值
     */
    public Instance [] getInstances() {
        return this.Instances;
    }

    /**
     * Set 实例值
     * @param Instances 实例值
     */
    public void setInstances(Instance [] Instances) {
        this.Instances = Instances;
    }

    public InstanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceConfig(InstanceConfig source) {
        if (source.InstanceDimension != null) {
            this.InstanceDimension = new String[source.InstanceDimension.length];
            for (int i = 0; i < source.InstanceDimension.length; i++) {
                this.InstanceDimension[i] = new String(source.InstanceDimension[i]);
            }
        }
        if (source.Instances != null) {
            this.Instances = new Instance[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new Instance(source.Instances[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceDimension.", this.InstanceDimension);
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);

    }
}

