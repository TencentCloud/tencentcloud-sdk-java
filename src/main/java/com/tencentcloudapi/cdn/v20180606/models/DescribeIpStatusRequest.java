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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIpStatusRequest extends AbstractModel{

    /**
    * 加速域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 节点类型：
edge：表示边缘节点
last：表示回源层节点
不填充情况下，默认返回边缘节点信息
    */
    @SerializedName("Layer")
    @Expose
    private String Layer;

    /**
    * 查询区域：
mainland: 国内节点
overseas: 海外节点
global: 全球节点
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 是否以IP段的格式返回。
    */
    @SerializedName("Segment")
    @Expose
    private Boolean Segment;

    /**
     * Get 加速域名 
     * @return Domain 加速域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 加速域名
     * @param Domain 加速域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 节点类型：
edge：表示边缘节点
last：表示回源层节点
不填充情况下，默认返回边缘节点信息 
     * @return Layer 节点类型：
edge：表示边缘节点
last：表示回源层节点
不填充情况下，默认返回边缘节点信息
     */
    public String getLayer() {
        return this.Layer;
    }

    /**
     * Set 节点类型：
edge：表示边缘节点
last：表示回源层节点
不填充情况下，默认返回边缘节点信息
     * @param Layer 节点类型：
edge：表示边缘节点
last：表示回源层节点
不填充情况下，默认返回边缘节点信息
     */
    public void setLayer(String Layer) {
        this.Layer = Layer;
    }

    /**
     * Get 查询区域：
mainland: 国内节点
overseas: 海外节点
global: 全球节点 
     * @return Area 查询区域：
mainland: 国内节点
overseas: 海外节点
global: 全球节点
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 查询区域：
mainland: 国内节点
overseas: 海外节点
global: 全球节点
     * @param Area 查询区域：
mainland: 国内节点
overseas: 海外节点
global: 全球节点
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 是否以IP段的格式返回。 
     * @return Segment 是否以IP段的格式返回。
     */
    public Boolean getSegment() {
        return this.Segment;
    }

    /**
     * Set 是否以IP段的格式返回。
     * @param Segment 是否以IP段的格式返回。
     */
    public void setSegment(Boolean Segment) {
        this.Segment = Segment;
    }

    public DescribeIpStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIpStatusRequest(DescribeIpStatusRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Layer != null) {
            this.Layer = new String(source.Layer);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Segment != null) {
            this.Segment = new Boolean(source.Segment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Layer", this.Layer);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Segment", this.Segment);

    }
}

