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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyServerlessStrategyRequest extends AbstractModel {

    /**
    * serverless集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群是否自动暂停，可选范围
<li>yes</li>
<li>no</li>
    */
    @SerializedName("AutoPause")
    @Expose
    private String AutoPause;

    /**
    * 集群自动暂停的延迟，单位秒，可选范围[600,691200]，默认600
    */
    @SerializedName("AutoPauseDelay")
    @Expose
    private Long AutoPauseDelay;

    /**
    * 该参数暂时无效
    */
    @SerializedName("AutoScaleUpDelay")
    @Expose
    private Long AutoScaleUpDelay;

    /**
    * 该参数暂时无效
    */
    @SerializedName("AutoScaleDownDelay")
    @Expose
    private Long AutoScaleDownDelay;

    /**
    * cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * 只读实例cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回
    */
    @SerializedName("MinRoCpu")
    @Expose
    private Float MinRoCpu;

    /**
    * 只读cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回
    */
    @SerializedName("MaxRoCpu")
    @Expose
    private Float MaxRoCpu;

    /**
    * 只读节点最小个数
    */
    @SerializedName("MinRoCount")
    @Expose
    private Long MinRoCount;

    /**
    * 只读节点最大个数
    */
    @SerializedName("MaxRoCount")
    @Expose
    private Long MaxRoCount;

    /**
    * 是否开启归档，可选范围<li>yes</li><li>no</li>默认值:yes
    */
    @SerializedName("AutoArchive")
    @Expose
    private String AutoArchive;

    /**
     * Get serverless集群id 
     * @return ClusterId serverless集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set serverless集群id
     * @param ClusterId serverless集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群是否自动暂停，可选范围
<li>yes</li>
<li>no</li> 
     * @return AutoPause 集群是否自动暂停，可选范围
<li>yes</li>
<li>no</li>
     */
    public String getAutoPause() {
        return this.AutoPause;
    }

    /**
     * Set 集群是否自动暂停，可选范围
<li>yes</li>
<li>no</li>
     * @param AutoPause 集群是否自动暂停，可选范围
<li>yes</li>
<li>no</li>
     */
    public void setAutoPause(String AutoPause) {
        this.AutoPause = AutoPause;
    }

    /**
     * Get 集群自动暂停的延迟，单位秒，可选范围[600,691200]，默认600 
     * @return AutoPauseDelay 集群自动暂停的延迟，单位秒，可选范围[600,691200]，默认600
     */
    public Long getAutoPauseDelay() {
        return this.AutoPauseDelay;
    }

    /**
     * Set 集群自动暂停的延迟，单位秒，可选范围[600,691200]，默认600
     * @param AutoPauseDelay 集群自动暂停的延迟，单位秒，可选范围[600,691200]，默认600
     */
    public void setAutoPauseDelay(Long AutoPauseDelay) {
        this.AutoPauseDelay = AutoPauseDelay;
    }

    /**
     * Get 该参数暂时无效 
     * @return AutoScaleUpDelay 该参数暂时无效
     */
    public Long getAutoScaleUpDelay() {
        return this.AutoScaleUpDelay;
    }

    /**
     * Set 该参数暂时无效
     * @param AutoScaleUpDelay 该参数暂时无效
     */
    public void setAutoScaleUpDelay(Long AutoScaleUpDelay) {
        this.AutoScaleUpDelay = AutoScaleUpDelay;
    }

    /**
     * Get 该参数暂时无效 
     * @return AutoScaleDownDelay 该参数暂时无效
     */
    public Long getAutoScaleDownDelay() {
        return this.AutoScaleDownDelay;
    }

    /**
     * Set 该参数暂时无效
     * @param AutoScaleDownDelay 该参数暂时无效
     */
    public void setAutoScaleDownDelay(Long AutoScaleDownDelay) {
        this.AutoScaleDownDelay = AutoScaleDownDelay;
    }

    /**
     * Get cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回 
     * @return MinCpu cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回
     * @param MinCpu cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回 
     * @return MaxCpu cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回
     * @param MaxCpu cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get 只读实例cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回 
     * @return MinRoCpu 只读实例cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回
     */
    public Float getMinRoCpu() {
        return this.MinRoCpu;
    }

    /**
     * Set 只读实例cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回
     * @param MinRoCpu 只读实例cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回
     */
    public void setMinRoCpu(Float MinRoCpu) {
        this.MinRoCpu = MinRoCpu;
    }

    /**
     * Get 只读cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回 
     * @return MaxRoCpu 只读cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回
     */
    public Float getMaxRoCpu() {
        return this.MaxRoCpu;
    }

    /**
     * Set 只读cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回
     * @param MaxRoCpu 只读cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回
     */
    public void setMaxRoCpu(Float MaxRoCpu) {
        this.MaxRoCpu = MaxRoCpu;
    }

    /**
     * Get 只读节点最小个数 
     * @return MinRoCount 只读节点最小个数
     */
    public Long getMinRoCount() {
        return this.MinRoCount;
    }

    /**
     * Set 只读节点最小个数
     * @param MinRoCount 只读节点最小个数
     */
    public void setMinRoCount(Long MinRoCount) {
        this.MinRoCount = MinRoCount;
    }

    /**
     * Get 只读节点最大个数 
     * @return MaxRoCount 只读节点最大个数
     */
    public Long getMaxRoCount() {
        return this.MaxRoCount;
    }

    /**
     * Set 只读节点最大个数
     * @param MaxRoCount 只读节点最大个数
     */
    public void setMaxRoCount(Long MaxRoCount) {
        this.MaxRoCount = MaxRoCount;
    }

    /**
     * Get 是否开启归档，可选范围<li>yes</li><li>no</li>默认值:yes 
     * @return AutoArchive 是否开启归档，可选范围<li>yes</li><li>no</li>默认值:yes
     */
    public String getAutoArchive() {
        return this.AutoArchive;
    }

    /**
     * Set 是否开启归档，可选范围<li>yes</li><li>no</li>默认值:yes
     * @param AutoArchive 是否开启归档，可选范围<li>yes</li><li>no</li>默认值:yes
     */
    public void setAutoArchive(String AutoArchive) {
        this.AutoArchive = AutoArchive;
    }

    public ModifyServerlessStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyServerlessStrategyRequest(ModifyServerlessStrategyRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AutoPause != null) {
            this.AutoPause = new String(source.AutoPause);
        }
        if (source.AutoPauseDelay != null) {
            this.AutoPauseDelay = new Long(source.AutoPauseDelay);
        }
        if (source.AutoScaleUpDelay != null) {
            this.AutoScaleUpDelay = new Long(source.AutoScaleUpDelay);
        }
        if (source.AutoScaleDownDelay != null) {
            this.AutoScaleDownDelay = new Long(source.AutoScaleDownDelay);
        }
        if (source.MinCpu != null) {
            this.MinCpu = new Float(source.MinCpu);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Float(source.MaxCpu);
        }
        if (source.MinRoCpu != null) {
            this.MinRoCpu = new Float(source.MinRoCpu);
        }
        if (source.MaxRoCpu != null) {
            this.MaxRoCpu = new Float(source.MaxRoCpu);
        }
        if (source.MinRoCount != null) {
            this.MinRoCount = new Long(source.MinRoCount);
        }
        if (source.MaxRoCount != null) {
            this.MaxRoCount = new Long(source.MaxRoCount);
        }
        if (source.AutoArchive != null) {
            this.AutoArchive = new String(source.AutoArchive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AutoPause", this.AutoPause);
        this.setParamSimple(map, prefix + "AutoPauseDelay", this.AutoPauseDelay);
        this.setParamSimple(map, prefix + "AutoScaleUpDelay", this.AutoScaleUpDelay);
        this.setParamSimple(map, prefix + "AutoScaleDownDelay", this.AutoScaleDownDelay);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "MinRoCpu", this.MinRoCpu);
        this.setParamSimple(map, prefix + "MaxRoCpu", this.MaxRoCpu);
        this.setParamSimple(map, prefix + "MinRoCount", this.MinRoCount);
        this.setParamSimple(map, prefix + "MaxRoCount", this.MaxRoCount);
        this.setParamSimple(map, prefix + "AutoArchive", this.AutoArchive);

    }
}

