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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutboundEndpoint extends AbstractModel {

    /**
    * 出站终端节点ID
    */
    @SerializedName("EndpointId")
    @Expose
    private String EndpointId;

    /**
    * 出站终端节点名
    */
    @SerializedName("EndpointName")
    @Expose
    private String EndpointName;

    /**
    * 出站终端节点所属地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * tag标签
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 出站终端节点信息
仅在转发架构为 V2R的情况下返回
    */
    @SerializedName("EndpointServiceSet")
    @Expose
    private EndpointService [] EndpointServiceSet;

    /**
    * 转发链接架构
V2V: privatelink
V2R: jnsgw
    */
    @SerializedName("ForwardLinkArch")
    @Expose
    private String ForwardLinkArch;

    /**
    * 终端节点服务ID
仅在转发架构为 V2V的情况下返回

    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * 终端节点VIP列表
仅在转发架构为 V2V的情况下返回
    */
    @SerializedName("EndPointVipSet")
    @Expose
    private String [] EndPointVipSet;

    /**
     * Get 出站终端节点ID 
     * @return EndpointId 出站终端节点ID
     */
    public String getEndpointId() {
        return this.EndpointId;
    }

    /**
     * Set 出站终端节点ID
     * @param EndpointId 出站终端节点ID
     */
    public void setEndpointId(String EndpointId) {
        this.EndpointId = EndpointId;
    }

    /**
     * Get 出站终端节点名 
     * @return EndpointName 出站终端节点名
     */
    public String getEndpointName() {
        return this.EndpointName;
    }

    /**
     * Set 出站终端节点名
     * @param EndpointName 出站终端节点名
     */
    public void setEndpointName(String EndpointName) {
        this.EndpointName = EndpointName;
    }

    /**
     * Get 出站终端节点所属地域 
     * @return Region 出站终端节点所属地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 出站终端节点所属地域
     * @param Region 出站终端节点所属地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get tag标签 
     * @return Tags tag标签
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set tag标签
     * @param Tags tag标签
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 出站终端节点信息
仅在转发架构为 V2R的情况下返回 
     * @return EndpointServiceSet 出站终端节点信息
仅在转发架构为 V2R的情况下返回
     */
    public EndpointService [] getEndpointServiceSet() {
        return this.EndpointServiceSet;
    }

    /**
     * Set 出站终端节点信息
仅在转发架构为 V2R的情况下返回
     * @param EndpointServiceSet 出站终端节点信息
仅在转发架构为 V2R的情况下返回
     */
    public void setEndpointServiceSet(EndpointService [] EndpointServiceSet) {
        this.EndpointServiceSet = EndpointServiceSet;
    }

    /**
     * Get 转发链接架构
V2V: privatelink
V2R: jnsgw 
     * @return ForwardLinkArch 转发链接架构
V2V: privatelink
V2R: jnsgw
     */
    public String getForwardLinkArch() {
        return this.ForwardLinkArch;
    }

    /**
     * Set 转发链接架构
V2V: privatelink
V2R: jnsgw
     * @param ForwardLinkArch 转发链接架构
V2V: privatelink
V2R: jnsgw
     */
    public void setForwardLinkArch(String ForwardLinkArch) {
        this.ForwardLinkArch = ForwardLinkArch;
    }

    /**
     * Get 终端节点服务ID
仅在转发架构为 V2V的情况下返回
 
     * @return EndPointServiceId 终端节点服务ID
仅在转发架构为 V2V的情况下返回

     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set 终端节点服务ID
仅在转发架构为 V2V的情况下返回

     * @param EndPointServiceId 终端节点服务ID
仅在转发架构为 V2V的情况下返回

     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    /**
     * Get 终端节点VIP列表
仅在转发架构为 V2V的情况下返回 
     * @return EndPointVipSet 终端节点VIP列表
仅在转发架构为 V2V的情况下返回
     */
    public String [] getEndPointVipSet() {
        return this.EndPointVipSet;
    }

    /**
     * Set 终端节点VIP列表
仅在转发架构为 V2V的情况下返回
     * @param EndPointVipSet 终端节点VIP列表
仅在转发架构为 V2V的情况下返回
     */
    public void setEndPointVipSet(String [] EndPointVipSet) {
        this.EndPointVipSet = EndPointVipSet;
    }

    public OutboundEndpoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutboundEndpoint(OutboundEndpoint source) {
        if (source.EndpointId != null) {
            this.EndpointId = new String(source.EndpointId);
        }
        if (source.EndpointName != null) {
            this.EndpointName = new String(source.EndpointName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.EndpointServiceSet != null) {
            this.EndpointServiceSet = new EndpointService[source.EndpointServiceSet.length];
            for (int i = 0; i < source.EndpointServiceSet.length; i++) {
                this.EndpointServiceSet[i] = new EndpointService(source.EndpointServiceSet[i]);
            }
        }
        if (source.ForwardLinkArch != null) {
            this.ForwardLinkArch = new String(source.ForwardLinkArch);
        }
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
        if (source.EndPointVipSet != null) {
            this.EndPointVipSet = new String[source.EndPointVipSet.length];
            for (int i = 0; i < source.EndPointVipSet.length; i++) {
                this.EndPointVipSet[i] = new String(source.EndPointVipSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndpointId", this.EndpointId);
        this.setParamSimple(map, prefix + "EndpointName", this.EndpointName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "EndpointServiceSet.", this.EndpointServiceSet);
        this.setParamSimple(map, prefix + "ForwardLinkArch", this.ForwardLinkArch);
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);
        this.setParamArraySimple(map, prefix + "EndPointVipSet.", this.EndPointVipSet);

    }
}

