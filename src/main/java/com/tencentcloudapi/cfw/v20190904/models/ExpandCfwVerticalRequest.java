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
    * nat：nat防火墙，ew：东西向防火墙
    */
    @SerializedName("FwType")
    @Expose
    private String FwType;

    /**
    * 带宽值
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 防火墙实例id
    */
    @SerializedName("CfwInstance")
    @Expose
    private String CfwInstance;

    /**
    * 弹性开关 1打开 0 关闭
    */
    @SerializedName("ElasticSwitch")
    @Expose
    private Long ElasticSwitch;

    /**
    * 弹性带宽上限，单位Mbps
    */
    @SerializedName("ElasticBandwidth")
    @Expose
    private Long ElasticBandwidth;

    /**
    * 按量计费标签
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get nat：nat防火墙，ew：东西向防火墙 
     * @return FwType nat：nat防火墙，ew：东西向防火墙
     */
    public String getFwType() {
        return this.FwType;
    }

    /**
     * Set nat：nat防火墙，ew：东西向防火墙
     * @param FwType nat：nat防火墙，ew：东西向防火墙
     */
    public void setFwType(String FwType) {
        this.FwType = FwType;
    }

    /**
     * Get 带宽值 
     * @return Width 带宽值
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 带宽值
     * @param Width 带宽值
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 防火墙实例id 
     * @return CfwInstance 防火墙实例id
     */
    public String getCfwInstance() {
        return this.CfwInstance;
    }

    /**
     * Set 防火墙实例id
     * @param CfwInstance 防火墙实例id
     */
    public void setCfwInstance(String CfwInstance) {
        this.CfwInstance = CfwInstance;
    }

    /**
     * Get 弹性开关 1打开 0 关闭 
     * @return ElasticSwitch 弹性开关 1打开 0 关闭
     */
    public Long getElasticSwitch() {
        return this.ElasticSwitch;
    }

    /**
     * Set 弹性开关 1打开 0 关闭
     * @param ElasticSwitch 弹性开关 1打开 0 关闭
     */
    public void setElasticSwitch(Long ElasticSwitch) {
        this.ElasticSwitch = ElasticSwitch;
    }

    /**
     * Get 弹性带宽上限，单位Mbps 
     * @return ElasticBandwidth 弹性带宽上限，单位Mbps
     */
    public Long getElasticBandwidth() {
        return this.ElasticBandwidth;
    }

    /**
     * Set 弹性带宽上限，单位Mbps
     * @param ElasticBandwidth 弹性带宽上限，单位Mbps
     */
    public void setElasticBandwidth(Long ElasticBandwidth) {
        this.ElasticBandwidth = ElasticBandwidth;
    }

    /**
     * Get 按量计费标签 
     * @return Tags 按量计费标签
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 按量计费标签
     * @param Tags 按量计费标签
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
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

    }
}

