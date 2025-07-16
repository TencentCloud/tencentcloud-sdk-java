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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiPathGatewayLine extends AbstractModel {

    /**
    * 线路 ID ， 其中 line-0 和 line-1 为系统内置线路 ID，取值有:
<li> line-0：直连线路，不支持添加、编辑和删除；</li>
<li> line-1： EdgeOne 四层代理线路，支持修改实例和规则，不支持删除；</li>
<li> line-2 及以上：EdgeOne 四层代理线路或者自定义线路，支持修改、删除实例和规则。</li>
    */
    @SerializedName("LineId")
    @Expose
    private String LineId;

    /**
    * 线路类型，取值有：
<li>direct ：直连线路，不支持编辑、不支持删除；</li>
<li>proxy ：EdgeOne 四层代理线路，支持编辑修改实例和规则，不支持删除；</li>
<li>custom ：自定义线路，支持编辑、支持删除。</li>
    */
    @SerializedName("LineType")
    @Expose
    private String LineType;

    /**
    * 线路地址，格式为 host:port 。
    */
    @SerializedName("LineAddress")
    @Expose
    private String LineAddress;

    /**
    * 四层代理实例 ID  ，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）返回。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 转发规则 ID ，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）返回。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get 线路 ID ， 其中 line-0 和 line-1 为系统内置线路 ID，取值有:
<li> line-0：直连线路，不支持添加、编辑和删除；</li>
<li> line-1： EdgeOne 四层代理线路，支持修改实例和规则，不支持删除；</li>
<li> line-2 及以上：EdgeOne 四层代理线路或者自定义线路，支持修改、删除实例和规则。</li> 
     * @return LineId 线路 ID ， 其中 line-0 和 line-1 为系统内置线路 ID，取值有:
<li> line-0：直连线路，不支持添加、编辑和删除；</li>
<li> line-1： EdgeOne 四层代理线路，支持修改实例和规则，不支持删除；</li>
<li> line-2 及以上：EdgeOne 四层代理线路或者自定义线路，支持修改、删除实例和规则。</li>
     */
    public String getLineId() {
        return this.LineId;
    }

    /**
     * Set 线路 ID ， 其中 line-0 和 line-1 为系统内置线路 ID，取值有:
<li> line-0：直连线路，不支持添加、编辑和删除；</li>
<li> line-1： EdgeOne 四层代理线路，支持修改实例和规则，不支持删除；</li>
<li> line-2 及以上：EdgeOne 四层代理线路或者自定义线路，支持修改、删除实例和规则。</li>
     * @param LineId 线路 ID ， 其中 line-0 和 line-1 为系统内置线路 ID，取值有:
<li> line-0：直连线路，不支持添加、编辑和删除；</li>
<li> line-1： EdgeOne 四层代理线路，支持修改实例和规则，不支持删除；</li>
<li> line-2 及以上：EdgeOne 四层代理线路或者自定义线路，支持修改、删除实例和规则。</li>
     */
    public void setLineId(String LineId) {
        this.LineId = LineId;
    }

    /**
     * Get 线路类型，取值有：
<li>direct ：直连线路，不支持编辑、不支持删除；</li>
<li>proxy ：EdgeOne 四层代理线路，支持编辑修改实例和规则，不支持删除；</li>
<li>custom ：自定义线路，支持编辑、支持删除。</li> 
     * @return LineType 线路类型，取值有：
<li>direct ：直连线路，不支持编辑、不支持删除；</li>
<li>proxy ：EdgeOne 四层代理线路，支持编辑修改实例和规则，不支持删除；</li>
<li>custom ：自定义线路，支持编辑、支持删除。</li>
     */
    public String getLineType() {
        return this.LineType;
    }

    /**
     * Set 线路类型，取值有：
<li>direct ：直连线路，不支持编辑、不支持删除；</li>
<li>proxy ：EdgeOne 四层代理线路，支持编辑修改实例和规则，不支持删除；</li>
<li>custom ：自定义线路，支持编辑、支持删除。</li>
     * @param LineType 线路类型，取值有：
<li>direct ：直连线路，不支持编辑、不支持删除；</li>
<li>proxy ：EdgeOne 四层代理线路，支持编辑修改实例和规则，不支持删除；</li>
<li>custom ：自定义线路，支持编辑、支持删除。</li>
     */
    public void setLineType(String LineType) {
        this.LineType = LineType;
    }

    /**
     * Get 线路地址，格式为 host:port 。 
     * @return LineAddress 线路地址，格式为 host:port 。
     */
    public String getLineAddress() {
        return this.LineAddress;
    }

    /**
     * Set 线路地址，格式为 host:port 。
     * @param LineAddress 线路地址，格式为 host:port 。
     */
    public void setLineAddress(String LineAddress) {
        this.LineAddress = LineAddress;
    }

    /**
     * Get 四层代理实例 ID  ，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）返回。 
     * @return ProxyId 四层代理实例 ID  ，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）返回。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 四层代理实例 ID  ，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）返回。
     * @param ProxyId 四层代理实例 ID  ，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）返回。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 转发规则 ID ，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）返回。 
     * @return RuleId 转发规则 ID ，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）返回。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 转发规则 ID ，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）返回。
     * @param RuleId 转发规则 ID ，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）返回。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    public MultiPathGatewayLine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiPathGatewayLine(MultiPathGatewayLine source) {
        if (source.LineId != null) {
            this.LineId = new String(source.LineId);
        }
        if (source.LineType != null) {
            this.LineType = new String(source.LineType);
        }
        if (source.LineAddress != null) {
            this.LineAddress = new String(source.LineAddress);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LineId", this.LineId);
        this.setParamSimple(map, prefix + "LineType", this.LineType);
        this.setParamSimple(map, prefix + "LineAddress", this.LineAddress);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

