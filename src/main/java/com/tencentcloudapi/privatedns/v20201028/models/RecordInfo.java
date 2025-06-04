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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordInfo extends AbstractModel {

    /**
    * 记录id
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 私有域id: zone-xxxxxxxx
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 子域名
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * 记录类型，可选的记录类型为："A", "AAAA", "CNAME", "MX", "TXT", "PTR"
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * 记录值
    */
    @SerializedName("RecordValue")
    @Expose
    private String RecordValue;

    /**
    * 记录缓存时间，数值越小生效越快，取值1-86400s, 默认 600
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * MX优先级：记录类型为MX时必填。取值范围：5,10,15,20,30,40,50
    */
    @SerializedName("MX")
    @Expose
    private Long MX;

    /**
    * 记录权重，值为1-100
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 记录创建时间
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 记录更新时间
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * 0暂停，1启用
    */
    @SerializedName("Enabled")
    @Expose
    private Long Enabled;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 记录id 
     * @return RecordId 记录id
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 记录id
     * @param RecordId 记录id
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 私有域id: zone-xxxxxxxx 
     * @return ZoneId 私有域id: zone-xxxxxxxx
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 私有域id: zone-xxxxxxxx
     * @param ZoneId 私有域id: zone-xxxxxxxx
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 子域名 
     * @return SubDomain 子域名
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 子域名
     * @param SubDomain 子域名
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get 记录类型，可选的记录类型为："A", "AAAA", "CNAME", "MX", "TXT", "PTR" 
     * @return RecordType 记录类型，可选的记录类型为："A", "AAAA", "CNAME", "MX", "TXT", "PTR"
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set 记录类型，可选的记录类型为："A", "AAAA", "CNAME", "MX", "TXT", "PTR"
     * @param RecordType 记录类型，可选的记录类型为："A", "AAAA", "CNAME", "MX", "TXT", "PTR"
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get 记录值 
     * @return RecordValue 记录值
     */
    public String getRecordValue() {
        return this.RecordValue;
    }

    /**
     * Set 记录值
     * @param RecordValue 记录值
     */
    public void setRecordValue(String RecordValue) {
        this.RecordValue = RecordValue;
    }

    /**
     * Get 记录缓存时间，数值越小生效越快，取值1-86400s, 默认 600 
     * @return TTL 记录缓存时间，数值越小生效越快，取值1-86400s, 默认 600
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set 记录缓存时间，数值越小生效越快，取值1-86400s, 默认 600
     * @param TTL 记录缓存时间，数值越小生效越快，取值1-86400s, 默认 600
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get MX优先级：记录类型为MX时必填。取值范围：5,10,15,20,30,40,50 
     * @return MX MX优先级：记录类型为MX时必填。取值范围：5,10,15,20,30,40,50
     */
    public Long getMX() {
        return this.MX;
    }

    /**
     * Set MX优先级：记录类型为MX时必填。取值范围：5,10,15,20,30,40,50
     * @param MX MX优先级：记录类型为MX时必填。取值范围：5,10,15,20,30,40,50
     */
    public void setMX(Long MX) {
        this.MX = MX;
    }

    /**
     * Get 记录权重，值为1-100 
     * @return Weight 记录权重，值为1-100
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 记录权重，值为1-100
     * @param Weight 记录权重，值为1-100
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 记录创建时间 
     * @return CreatedOn 记录创建时间
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 记录创建时间
     * @param CreatedOn 记录创建时间
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 记录更新时间 
     * @return UpdatedOn 记录更新时间
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set 记录更新时间
     * @param UpdatedOn 记录更新时间
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get 0暂停，1启用 
     * @return Enabled 0暂停，1启用
     */
    public Long getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 0暂停，1启用
     * @param Enabled 0暂停，1启用
     */
    public void setEnabled(Long Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public RecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordInfo(RecordInfo source) {
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.RecordValue != null) {
            this.RecordValue = new String(source.RecordValue);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.MX != null) {
            this.MX = new Long(source.MX);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.Enabled != null) {
            this.Enabled = new Long(source.Enabled);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "RecordValue", this.RecordValue);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "MX", this.MX);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

