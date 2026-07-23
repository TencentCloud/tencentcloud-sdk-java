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

public class EdgeRange extends AbstractModel {

    /**
    * 规则生效的范围id，是在哪对vpc之间还是针对所有vpc间生效
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * EdgeId对应的名称
    */
    @SerializedName("EdgeName")
    @Expose
    private String EdgeName;

    /**
    * 本端网络实例Id
    */
    @SerializedName("SrcId")
    @Expose
    private String SrcId;

    /**
    * 本端网络实例所属地域
    */
    @SerializedName("SrcRegion")
    @Expose
    private String SrcRegion;

    /**
    * 本端网络实例名称
    */
    @SerializedName("SrcName")
    @Expose
    private String SrcName;

    /**
    * 本端网络实例cidr，多个以逗号分隔
    */
    @SerializedName("SrcCidr")
    @Expose
    private String SrcCidr;

    /**
    * 对端网络实例Id
    */
    @SerializedName("DstId")
    @Expose
    private String DstId;

    /**
    * 对端网络实例所属地域
    */
    @SerializedName("DstRegion")
    @Expose
    private String DstRegion;

    /**
    * 对端网络实例名称
    */
    @SerializedName("DstName")
    @Expose
    private String DstName;

    /**
    * 对端网络实例cidr，多个以逗号分隔
    */
    @SerializedName("DstCidr")
    @Expose
    private String DstCidr;

    /**
     * Get 规则生效的范围id，是在哪对vpc之间还是针对所有vpc间生效 
     * @return EdgeId 规则生效的范围id，是在哪对vpc之间还是针对所有vpc间生效
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set 规则生效的范围id，是在哪对vpc之间还是针对所有vpc间生效
     * @param EdgeId 规则生效的范围id，是在哪对vpc之间还是针对所有vpc间生效
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get EdgeId对应的名称 
     * @return EdgeName EdgeId对应的名称
     */
    public String getEdgeName() {
        return this.EdgeName;
    }

    /**
     * Set EdgeId对应的名称
     * @param EdgeName EdgeId对应的名称
     */
    public void setEdgeName(String EdgeName) {
        this.EdgeName = EdgeName;
    }

    /**
     * Get 本端网络实例Id 
     * @return SrcId 本端网络实例Id
     */
    public String getSrcId() {
        return this.SrcId;
    }

    /**
     * Set 本端网络实例Id
     * @param SrcId 本端网络实例Id
     */
    public void setSrcId(String SrcId) {
        this.SrcId = SrcId;
    }

    /**
     * Get 本端网络实例所属地域 
     * @return SrcRegion 本端网络实例所属地域
     */
    public String getSrcRegion() {
        return this.SrcRegion;
    }

    /**
     * Set 本端网络实例所属地域
     * @param SrcRegion 本端网络实例所属地域
     */
    public void setSrcRegion(String SrcRegion) {
        this.SrcRegion = SrcRegion;
    }

    /**
     * Get 本端网络实例名称 
     * @return SrcName 本端网络实例名称
     */
    public String getSrcName() {
        return this.SrcName;
    }

    /**
     * Set 本端网络实例名称
     * @param SrcName 本端网络实例名称
     */
    public void setSrcName(String SrcName) {
        this.SrcName = SrcName;
    }

    /**
     * Get 本端网络实例cidr，多个以逗号分隔 
     * @return SrcCidr 本端网络实例cidr，多个以逗号分隔
     */
    public String getSrcCidr() {
        return this.SrcCidr;
    }

    /**
     * Set 本端网络实例cidr，多个以逗号分隔
     * @param SrcCidr 本端网络实例cidr，多个以逗号分隔
     */
    public void setSrcCidr(String SrcCidr) {
        this.SrcCidr = SrcCidr;
    }

    /**
     * Get 对端网络实例Id 
     * @return DstId 对端网络实例Id
     */
    public String getDstId() {
        return this.DstId;
    }

    /**
     * Set 对端网络实例Id
     * @param DstId 对端网络实例Id
     */
    public void setDstId(String DstId) {
        this.DstId = DstId;
    }

    /**
     * Get 对端网络实例所属地域 
     * @return DstRegion 对端网络实例所属地域
     */
    public String getDstRegion() {
        return this.DstRegion;
    }

    /**
     * Set 对端网络实例所属地域
     * @param DstRegion 对端网络实例所属地域
     */
    public void setDstRegion(String DstRegion) {
        this.DstRegion = DstRegion;
    }

    /**
     * Get 对端网络实例名称 
     * @return DstName 对端网络实例名称
     */
    public String getDstName() {
        return this.DstName;
    }

    /**
     * Set 对端网络实例名称
     * @param DstName 对端网络实例名称
     */
    public void setDstName(String DstName) {
        this.DstName = DstName;
    }

    /**
     * Get 对端网络实例cidr，多个以逗号分隔 
     * @return DstCidr 对端网络实例cidr，多个以逗号分隔
     */
    public String getDstCidr() {
        return this.DstCidr;
    }

    /**
     * Set 对端网络实例cidr，多个以逗号分隔
     * @param DstCidr 对端网络实例cidr，多个以逗号分隔
     */
    public void setDstCidr(String DstCidr) {
        this.DstCidr = DstCidr;
    }

    public EdgeRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeRange(EdgeRange source) {
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.EdgeName != null) {
            this.EdgeName = new String(source.EdgeName);
        }
        if (source.SrcId != null) {
            this.SrcId = new String(source.SrcId);
        }
        if (source.SrcRegion != null) {
            this.SrcRegion = new String(source.SrcRegion);
        }
        if (source.SrcName != null) {
            this.SrcName = new String(source.SrcName);
        }
        if (source.SrcCidr != null) {
            this.SrcCidr = new String(source.SrcCidr);
        }
        if (source.DstId != null) {
            this.DstId = new String(source.DstId);
        }
        if (source.DstRegion != null) {
            this.DstRegion = new String(source.DstRegion);
        }
        if (source.DstName != null) {
            this.DstName = new String(source.DstName);
        }
        if (source.DstCidr != null) {
            this.DstCidr = new String(source.DstCidr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "EdgeName", this.EdgeName);
        this.setParamSimple(map, prefix + "SrcId", this.SrcId);
        this.setParamSimple(map, prefix + "SrcRegion", this.SrcRegion);
        this.setParamSimple(map, prefix + "SrcName", this.SrcName);
        this.setParamSimple(map, prefix + "SrcCidr", this.SrcCidr);
        this.setParamSimple(map, prefix + "DstId", this.DstId);
        this.setParamSimple(map, prefix + "DstRegion", this.DstRegion);
        this.setParamSimple(map, prefix + "DstName", this.DstName);
        this.setParamSimple(map, prefix + "DstCidr", this.DstCidr);

    }
}

