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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExpandCfwVerticalRequest extends AbstractModel {

    /**
    * <p>nat：nat防火墙，ew：东西向防火墙</p>
    */
    @SerializedName("FwType")
    @Expose
    private String FwType;

    /**
    * <p>带宽值</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>防火墙实例id</p>
    */
    @SerializedName("CfwInstance")
    @Expose
    private String CfwInstance;

    /**
    * <p>弹性开关 1打开 0 关闭</p>
    */
    @SerializedName("ElasticSwitch")
    @Expose
    private Long ElasticSwitch;

    /**
    * <p>弹性带宽上限，单位Mbps</p>
    */
    @SerializedName("ElasticBandwidth")
    @Expose
    private Long ElasticBandwidth;

    /**
    * <p>按量计费标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>按流量弹性开关</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
    */
    @SerializedName("ElasticTrafficSwitch")
    @Expose
    private Long ElasticTrafficSwitch;

    /**
     * Get <p>nat：nat防火墙，ew：东西向防火墙</p> 
     * @return FwType <p>nat：nat防火墙，ew：东西向防火墙</p>
     */
    public String getFwType() {
        return this.FwType;
    }

    /**
     * Set <p>nat：nat防火墙，ew：东西向防火墙</p>
     * @param FwType <p>nat：nat防火墙，ew：东西向防火墙</p>
     */
    public void setFwType(String FwType) {
        this.FwType = FwType;
    }

    /**
     * Get <p>带宽值</p> 
     * @return Width <p>带宽值</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>带宽值</p>
     * @param Width <p>带宽值</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>防火墙实例id</p> 
     * @return CfwInstance <p>防火墙实例id</p>
     */
    public String getCfwInstance() {
        return this.CfwInstance;
    }

    /**
     * Set <p>防火墙实例id</p>
     * @param CfwInstance <p>防火墙实例id</p>
     */
    public void setCfwInstance(String CfwInstance) {
        this.CfwInstance = CfwInstance;
    }

    /**
     * Get <p>弹性开关 1打开 0 关闭</p> 
     * @return ElasticSwitch <p>弹性开关 1打开 0 关闭</p>
     */
    public Long getElasticSwitch() {
        return this.ElasticSwitch;
    }

    /**
     * Set <p>弹性开关 1打开 0 关闭</p>
     * @param ElasticSwitch <p>弹性开关 1打开 0 关闭</p>
     */
    public void setElasticSwitch(Long ElasticSwitch) {
        this.ElasticSwitch = ElasticSwitch;
    }

    /**
     * Get <p>弹性带宽上限，单位Mbps</p> 
     * @return ElasticBandwidth <p>弹性带宽上限，单位Mbps</p>
     */
    public Long getElasticBandwidth() {
        return this.ElasticBandwidth;
    }

    /**
     * Set <p>弹性带宽上限，单位Mbps</p>
     * @param ElasticBandwidth <p>弹性带宽上限，单位Mbps</p>
     */
    public void setElasticBandwidth(Long ElasticBandwidth) {
        this.ElasticBandwidth = ElasticBandwidth;
    }

    /**
     * Get <p>按量计费标签</p> 
     * @return Tags <p>按量计费标签</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>按量计费标签</p>
     * @param Tags <p>按量计费标签</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>按流量弹性开关</p><p>取值范围：[0, 1]</p><p>默认值：0</p> 
     * @return ElasticTrafficSwitch <p>按流量弹性开关</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     */
    public Long getElasticTrafficSwitch() {
        return this.ElasticTrafficSwitch;
    }

    /**
     * Set <p>按流量弹性开关</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     * @param ElasticTrafficSwitch <p>按流量弹性开关</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     */
    public void setElasticTrafficSwitch(Long ElasticTrafficSwitch) {
        this.ElasticTrafficSwitch = ElasticTrafficSwitch;
    }

    public ExpandCfwVerticalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExpandCfwVerticalRequest(ExpandCfwVerticalRequest source) {
        if (source.FwType != null) {
            this.FwType = new String(source.FwType);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.CfwInstance != null) {
            this.CfwInstance = new String(source.CfwInstance);
        }
        if (source.ElasticSwitch != null) {
            this.ElasticSwitch = new Long(source.ElasticSwitch);
        }
        if (source.ElasticBandwidth != null) {
            this.ElasticBandwidth = new Long(source.ElasticBandwidth);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.ElasticTrafficSwitch != null) {
            this.ElasticTrafficSwitch = new Long(source.ElasticTrafficSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FwType", this.FwType);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "CfwInstance", this.CfwInstance);
        this.setParamSimple(map, prefix + "ElasticSwitch", this.ElasticSwitch);
        this.setParamSimple(map, prefix + "ElasticBandwidth", this.ElasticBandwidth);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ElasticTrafficSwitch", this.ElasticTrafficSwitch);

    }
}

