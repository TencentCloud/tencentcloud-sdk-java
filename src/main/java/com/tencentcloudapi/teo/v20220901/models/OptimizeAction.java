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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OptimizeAction extends AbstractModel{

    /**
    * 站点性能优化配置项，取值有：
<li>Http2；</li>
<li>Http3；</li>
<li>Brotli。</li>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 网络环境。
    */
    @SerializedName("Connectivity")
    @Expose
    private String Connectivity;

    /**
    * 开启配置项后，预估性能优化效果，单位ms。
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * 开启配置项后，预估性能提升比例，单位%。
    */
    @SerializedName("Ratio")
    @Expose
    private Long Ratio;

    /**
     * Get 站点性能优化配置项，取值有：
<li>Http2；</li>
<li>Http3；</li>
<li>Brotli。</li> 
     * @return Name 站点性能优化配置项，取值有：
<li>Http2；</li>
<li>Http3；</li>
<li>Brotli。</li>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 站点性能优化配置项，取值有：
<li>Http2；</li>
<li>Http3；</li>
<li>Brotli。</li>
     * @param Name 站点性能优化配置项，取值有：
<li>Http2；</li>
<li>Http3；</li>
<li>Brotli。</li>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 网络环境。 
     * @return Connectivity 网络环境。
     */
    public String getConnectivity() {
        return this.Connectivity;
    }

    /**
     * Set 网络环境。
     * @param Connectivity 网络环境。
     */
    public void setConnectivity(String Connectivity) {
        this.Connectivity = Connectivity;
    }

    /**
     * Get 开启配置项后，预估性能优化效果，单位ms。 
     * @return Value 开启配置项后，预估性能优化效果，单位ms。
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 开启配置项后，预估性能优化效果，单位ms。
     * @param Value 开启配置项后，预估性能优化效果，单位ms。
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get 开启配置项后，预估性能提升比例，单位%。 
     * @return Ratio 开启配置项后，预估性能提升比例，单位%。
     */
    public Long getRatio() {
        return this.Ratio;
    }

    /**
     * Set 开启配置项后，预估性能提升比例，单位%。
     * @param Ratio 开启配置项后，预估性能提升比例，单位%。
     */
    public void setRatio(Long Ratio) {
        this.Ratio = Ratio;
    }

    public OptimizeAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OptimizeAction(OptimizeAction source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Connectivity != null) {
            this.Connectivity = new String(source.Connectivity);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.Ratio != null) {
            this.Ratio = new Long(source.Ratio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Connectivity", this.Connectivity);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);

    }
}

