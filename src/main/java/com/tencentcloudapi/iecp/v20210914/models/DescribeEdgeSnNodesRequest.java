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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdgeSnNodesRequest extends AbstractModel{

    /**
    * 边缘单元ID
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * 根据节点名称模糊匹配
    */
    @SerializedName("NamePattern")
    @Expose
    private String NamePattern;

    /**
    * 根据设备SN模糊匹配
    */
    @SerializedName("SNPattern")
    @Expose
    private String SNPattern;

    /**
    * 根据备注批次信息模糊匹配
    */
    @SerializedName("RemarkPattern")
    @Expose
    private String RemarkPattern;

    /**
    * 默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 边缘单元ID 
     * @return EdgeUnitId 边缘单元ID
     */
    public Long getEdgeUnitId() {
        return this.EdgeUnitId;
    }

    /**
     * Set 边缘单元ID
     * @param EdgeUnitId 边缘单元ID
     */
    public void setEdgeUnitId(Long EdgeUnitId) {
        this.EdgeUnitId = EdgeUnitId;
    }

    /**
     * Get 根据节点名称模糊匹配 
     * @return NamePattern 根据节点名称模糊匹配
     */
    public String getNamePattern() {
        return this.NamePattern;
    }

    /**
     * Set 根据节点名称模糊匹配
     * @param NamePattern 根据节点名称模糊匹配
     */
    public void setNamePattern(String NamePattern) {
        this.NamePattern = NamePattern;
    }

    /**
     * Get 根据设备SN模糊匹配 
     * @return SNPattern 根据设备SN模糊匹配
     */
    public String getSNPattern() {
        return this.SNPattern;
    }

    /**
     * Set 根据设备SN模糊匹配
     * @param SNPattern 根据设备SN模糊匹配
     */
    public void setSNPattern(String SNPattern) {
        this.SNPattern = SNPattern;
    }

    /**
     * Get 根据备注批次信息模糊匹配 
     * @return RemarkPattern 根据备注批次信息模糊匹配
     */
    public String getRemarkPattern() {
        return this.RemarkPattern;
    }

    /**
     * Set 根据备注批次信息模糊匹配
     * @param RemarkPattern 根据备注批次信息模糊匹配
     */
    public void setRemarkPattern(String RemarkPattern) {
        this.RemarkPattern = RemarkPattern;
    }

    /**
     * Get 默认0 
     * @return Offset 默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 默认0
     * @param Offset 默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 默认20 
     * @return Limit 默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 默认20
     * @param Limit 默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeEdgeSnNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeSnNodesRequest(DescribeEdgeSnNodesRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
        }
        if (source.NamePattern != null) {
            this.NamePattern = new String(source.NamePattern);
        }
        if (source.SNPattern != null) {
            this.SNPattern = new String(source.SNPattern);
        }
        if (source.RemarkPattern != null) {
            this.RemarkPattern = new String(source.RemarkPattern);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamSimple(map, prefix + "NamePattern", this.NamePattern);
        this.setParamSimple(map, prefix + "SNPattern", this.SNPattern);
        this.setParamSimple(map, prefix + "RemarkPattern", this.RemarkPattern);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

