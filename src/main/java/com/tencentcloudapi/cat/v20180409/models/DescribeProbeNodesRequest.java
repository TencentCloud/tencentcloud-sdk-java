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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProbeNodesRequest extends AbstractModel{

    /**
    * 节点类型
<li> 1 = IDC </li>
<li> 2 = LastMile </li>
<li> 3 = Mobile </li>
    */
    @SerializedName("NodeType")
    @Expose
    private Long NodeType;

    /**
    * 节点区域
<li> 1 = 中国大陆 </li>
<li> 2 = 港澳台 </li>
<li> 3 = 海外 </li>
    */
    @SerializedName("Location")
    @Expose
    private Long Location;

    /**
    * 是否IPv6
    */
    @SerializedName("IsIPv6")
    @Expose
    private Boolean IsIPv6;

    /**
    * 名字模糊搜索
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 付费模式
<li>1 = 试用版本</li>
<li> 2 = 付费版本 </li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
     * Get 节点类型
<li> 1 = IDC </li>
<li> 2 = LastMile </li>
<li> 3 = Mobile </li> 
     * @return NodeType 节点类型
<li> 1 = IDC </li>
<li> 2 = LastMile </li>
<li> 3 = Mobile </li>
     */
    public Long getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型
<li> 1 = IDC </li>
<li> 2 = LastMile </li>
<li> 3 = Mobile </li>
     * @param NodeType 节点类型
<li> 1 = IDC </li>
<li> 2 = LastMile </li>
<li> 3 = Mobile </li>
     */
    public void setNodeType(Long NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 节点区域
<li> 1 = 中国大陆 </li>
<li> 2 = 港澳台 </li>
<li> 3 = 海外 </li> 
     * @return Location 节点区域
<li> 1 = 中国大陆 </li>
<li> 2 = 港澳台 </li>
<li> 3 = 海外 </li>
     */
    public Long getLocation() {
        return this.Location;
    }

    /**
     * Set 节点区域
<li> 1 = 中国大陆 </li>
<li> 2 = 港澳台 </li>
<li> 3 = 海外 </li>
     * @param Location 节点区域
<li> 1 = 中国大陆 </li>
<li> 2 = 港澳台 </li>
<li> 3 = 海外 </li>
     */
    public void setLocation(Long Location) {
        this.Location = Location;
    }

    /**
     * Get 是否IPv6 
     * @return IsIPv6 是否IPv6
     */
    public Boolean getIsIPv6() {
        return this.IsIPv6;
    }

    /**
     * Set 是否IPv6
     * @param IsIPv6 是否IPv6
     */
    public void setIsIPv6(Boolean IsIPv6) {
        this.IsIPv6 = IsIPv6;
    }

    /**
     * Get 名字模糊搜索 
     * @return NodeName 名字模糊搜索
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 名字模糊搜索
     * @param NodeName 名字模糊搜索
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 付费模式
<li>1 = 试用版本</li>
<li> 2 = 付费版本 </li> 
     * @return PayMode 付费模式
<li>1 = 试用版本</li>
<li> 2 = 付费版本 </li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式
<li>1 = 试用版本</li>
<li> 2 = 付费版本 </li>
     * @param PayMode 付费模式
<li>1 = 试用版本</li>
<li> 2 = 付费版本 </li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    public DescribeProbeNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProbeNodesRequest(DescribeProbeNodesRequest source) {
        if (source.NodeType != null) {
            this.NodeType = new Long(source.NodeType);
        }
        if (source.Location != null) {
            this.Location = new Long(source.Location);
        }
        if (source.IsIPv6 != null) {
            this.IsIPv6 = new Boolean(source.IsIPv6);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "IsIPv6", this.IsIPv6);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);

    }
}

