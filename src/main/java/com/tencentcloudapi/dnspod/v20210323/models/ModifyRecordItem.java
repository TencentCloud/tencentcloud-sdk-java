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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRecordItem extends AbstractModel {

    /**
    * 记录 ID
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * 主机记录
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * 记录类型
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * 记录线路
    */
    @SerializedName("RecordLine")
    @Expose
    private String RecordLine;

    /**
    * 记录值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 解析记录状态 1：开启 0：暂停
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 权重
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * MX优先级
    */
    @SerializedName("MX")
    @Expose
    private Long MX;

    /**
    * TTL缓存时间
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
     * Get 记录 ID 
     * @return RecordId 记录 ID
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 记录 ID
     * @param RecordId 记录 ID
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 主机记录 
     * @return SubDomain 主机记录
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 主机记录
     * @param SubDomain 主机记录
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get 记录类型 
     * @return RecordType 记录类型
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set 记录类型
     * @param RecordType 记录类型
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get 记录线路 
     * @return RecordLine 记录线路
     */
    public String getRecordLine() {
        return this.RecordLine;
    }

    /**
     * Set 记录线路
     * @param RecordLine 记录线路
     */
    public void setRecordLine(String RecordLine) {
        this.RecordLine = RecordLine;
    }

    /**
     * Get 记录值 
     * @return Value 记录值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 记录值
     * @param Value 记录值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 解析记录状态 1：开启 0：暂停 
     * @return Enabled 解析记录状态 1：开启 0：暂停
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 解析记录状态 1：开启 0：暂停
     * @param Enabled 解析记录状态 1：开启 0：暂停
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 权重 
     * @return Weight 权重
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 权重
     * @param Weight 权重
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get MX优先级 
     * @return MX MX优先级
     */
    public Long getMX() {
        return this.MX;
    }

    /**
     * Set MX优先级
     * @param MX MX优先级
     */
    public void setMX(Long MX) {
        this.MX = MX;
    }

    /**
     * Get TTL缓存时间 
     * @return TTL TTL缓存时间
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set TTL缓存时间
     * @param TTL TTL缓存时间
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    public ModifyRecordItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRecordItem(ModifyRecordItem source) {
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.RecordLine != null) {
            this.RecordLine = new String(source.RecordLine);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.MX != null) {
            this.MX = new Long(source.MX);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "RecordLine", this.RecordLine);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "MX", this.MX);
        this.setParamSimple(map, prefix + "TTL", this.TTL);

    }
}

