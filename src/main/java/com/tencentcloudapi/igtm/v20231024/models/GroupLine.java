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
package com.tencentcloudapi.igtm.v20231024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupLine extends AbstractModel {

    /**
    * 分组线路id
    */
    @SerializedName("DnsLineId")
    @Expose
    private Long DnsLineId;

    /**
    * 父节点 0为根节点
    */
    @SerializedName("Parent")
    @Expose
    private Long Parent;

    /**
    * 线路名
    */
    @SerializedName("LineName")
    @Expose
    private String LineName;

    /**
    * 10=9 DNSPod 线路 id
    */
    @SerializedName("LineId")
    @Expose
    private String LineId;

    /**
    * 是否已使用过
    */
    @SerializedName("Useful")
    @Expose
    private Boolean Useful;

    /**
    * 0为未使用
    */
    @SerializedName("SubGroup")
    @Expose
    private Long SubGroup;

    /**
    * 权限标识
    */
    @SerializedName("LinePackage")
    @Expose
    private Long LinePackage;

    /**
    * 1
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get 分组线路id 
     * @return DnsLineId 分组线路id
     */
    public Long getDnsLineId() {
        return this.DnsLineId;
    }

    /**
     * Set 分组线路id
     * @param DnsLineId 分组线路id
     */
    public void setDnsLineId(Long DnsLineId) {
        this.DnsLineId = DnsLineId;
    }

    /**
     * Get 父节点 0为根节点 
     * @return Parent 父节点 0为根节点
     */
    public Long getParent() {
        return this.Parent;
    }

    /**
     * Set 父节点 0为根节点
     * @param Parent 父节点 0为根节点
     */
    public void setParent(Long Parent) {
        this.Parent = Parent;
    }

    /**
     * Get 线路名 
     * @return LineName 线路名
     */
    public String getLineName() {
        return this.LineName;
    }

    /**
     * Set 线路名
     * @param LineName 线路名
     */
    public void setLineName(String LineName) {
        this.LineName = LineName;
    }

    /**
     * Get 10=9 DNSPod 线路 id 
     * @return LineId 10=9 DNSPod 线路 id
     */
    public String getLineId() {
        return this.LineId;
    }

    /**
     * Set 10=9 DNSPod 线路 id
     * @param LineId 10=9 DNSPod 线路 id
     */
    public void setLineId(String LineId) {
        this.LineId = LineId;
    }

    /**
     * Get 是否已使用过 
     * @return Useful 是否已使用过
     */
    public Boolean getUseful() {
        return this.Useful;
    }

    /**
     * Set 是否已使用过
     * @param Useful 是否已使用过
     */
    public void setUseful(Boolean Useful) {
        this.Useful = Useful;
    }

    /**
     * Get 0为未使用 
     * @return SubGroup 0为未使用
     */
    public Long getSubGroup() {
        return this.SubGroup;
    }

    /**
     * Set 0为未使用
     * @param SubGroup 0为未使用
     */
    public void setSubGroup(Long SubGroup) {
        this.SubGroup = SubGroup;
    }

    /**
     * Get 权限标识 
     * @return LinePackage 权限标识
     */
    public Long getLinePackage() {
        return this.LinePackage;
    }

    /**
     * Set 权限标识
     * @param LinePackage 权限标识
     */
    public void setLinePackage(Long LinePackage) {
        this.LinePackage = LinePackage;
    }

    /**
     * Get 1 
     * @return Weight 1
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 1
     * @param Weight 1
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public GroupLine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupLine(GroupLine source) {
        if (source.DnsLineId != null) {
            this.DnsLineId = new Long(source.DnsLineId);
        }
        if (source.Parent != null) {
            this.Parent = new Long(source.Parent);
        }
        if (source.LineName != null) {
            this.LineName = new String(source.LineName);
        }
        if (source.LineId != null) {
            this.LineId = new String(source.LineId);
        }
        if (source.Useful != null) {
            this.Useful = new Boolean(source.Useful);
        }
        if (source.SubGroup != null) {
            this.SubGroup = new Long(source.SubGroup);
        }
        if (source.LinePackage != null) {
            this.LinePackage = new Long(source.LinePackage);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DnsLineId", this.DnsLineId);
        this.setParamSimple(map, prefix + "Parent", this.Parent);
        this.setParamSimple(map, prefix + "LineName", this.LineName);
        this.setParamSimple(map, prefix + "LineId", this.LineId);
        this.setParamSimple(map, prefix + "Useful", this.Useful);
        this.setParamSimple(map, prefix + "SubGroup", this.SubGroup);
        this.setParamSimple(map, prefix + "LinePackage", this.LinePackage);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

