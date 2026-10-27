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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertDetail extends AbstractModel {

    /**
    * <p>证书ID</p>
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * <p>证书备注名</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>证书绑定的主域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>证书来源</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>有效期结束（秒级时间戳）</p><p>单位：秒</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>证书到期剩余天数</p>
    */
    @SerializedName("RemainDays")
    @Expose
    private Long RemainDays;

    /**
    * <p>证书状态，1为已通过</p>
    */
    @SerializedName("CertStatus")
    @Expose
    private Long CertStatus;

    /**
     * Get <p>证书ID</p> 
     * @return CertId <p>证书ID</p>
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set <p>证书ID</p>
     * @param CertId <p>证书ID</p>
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get <p>证书备注名</p> 
     * @return Alias <p>证书备注名</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>证书备注名</p>
     * @param Alias <p>证书备注名</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>证书绑定的主域名</p> 
     * @return Domain <p>证书绑定的主域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>证书绑定的主域名</p>
     * @param Domain <p>证书绑定的主域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>证书来源</p> 
     * @return Source <p>证书来源</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>证书来源</p>
     * @param Source <p>证书来源</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>有效期结束（秒级时间戳）</p><p>单位：秒</p> 
     * @return EndTime <p>有效期结束（秒级时间戳）</p><p>单位：秒</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>有效期结束（秒级时间戳）</p><p>单位：秒</p>
     * @param EndTime <p>有效期结束（秒级时间戳）</p><p>单位：秒</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>证书到期剩余天数</p> 
     * @return RemainDays <p>证书到期剩余天数</p>
     */
    public Long getRemainDays() {
        return this.RemainDays;
    }

    /**
     * Set <p>证书到期剩余天数</p>
     * @param RemainDays <p>证书到期剩余天数</p>
     */
    public void setRemainDays(Long RemainDays) {
        this.RemainDays = RemainDays;
    }

    /**
     * Get <p>证书状态，1为已通过</p> 
     * @return CertStatus <p>证书状态，1为已通过</p>
     */
    public Long getCertStatus() {
        return this.CertStatus;
    }

    /**
     * Set <p>证书状态，1为已通过</p>
     * @param CertStatus <p>证书状态，1为已通过</p>
     */
    public void setCertStatus(Long CertStatus) {
        this.CertStatus = CertStatus;
    }

    public CertDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertDetail(CertDetail source) {
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.RemainDays != null) {
            this.RemainDays = new Long(source.RemainDays);
        }
        if (source.CertStatus != null) {
            this.CertStatus = new Long(source.CertStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RemainDays", this.RemainDays);
        this.setParamSimple(map, prefix + "CertStatus", this.CertStatus);

    }
}

