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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricSpec extends AbstractModel{

    /**
    * 指标来源类型，支持 Pods/Resource
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 使用自定义指标扩进行自动扩缩容
    */
    @SerializedName("Pods")
    @Expose
    private PodsMetricSource Pods;

    /**
    * 使用资源指标扩进行自动扩缩容
    */
    @SerializedName("Resource")
    @Expose
    private ResourceMetricSource Resource;

    /**
     * Get 指标来源类型，支持 Pods/Resource 
     * @return Type 指标来源类型，支持 Pods/Resource
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 指标来源类型，支持 Pods/Resource
     * @param Type 指标来源类型，支持 Pods/Resource
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 使用自定义指标扩进行自动扩缩容 
     * @return Pods 使用自定义指标扩进行自动扩缩容
     */
    public PodsMetricSource getPods() {
        return this.Pods;
    }

    /**
     * Set 使用自定义指标扩进行自动扩缩容
     * @param Pods 使用自定义指标扩进行自动扩缩容
     */
    public void setPods(PodsMetricSource Pods) {
        this.Pods = Pods;
    }

    /**
     * Get 使用资源指标扩进行自动扩缩容 
     * @return Resource 使用资源指标扩进行自动扩缩容
     */
    public ResourceMetricSource getResource() {
        return this.Resource;
    }

    /**
     * Set 使用资源指标扩进行自动扩缩容
     * @param Resource 使用资源指标扩进行自动扩缩容
     */
    public void setResource(ResourceMetricSource Resource) {
        this.Resource = Resource;
    }

    public MetricSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricSpec(MetricSpec source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Pods != null) {
            this.Pods = new PodsMetricSource(source.Pods);
        }
        if (source.Resource != null) {
            this.Resource = new ResourceMetricSource(source.Resource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Pods.", this.Pods);
        this.setParamObj(map, prefix + "Resource.", this.Resource);

    }
}

