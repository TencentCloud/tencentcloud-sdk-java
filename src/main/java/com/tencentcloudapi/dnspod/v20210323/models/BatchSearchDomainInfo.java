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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchSearchDomainInfo extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名 ID
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * 域名套餐等级
    */
    @SerializedName("DomainGrade")
    @Expose
    private String DomainGrade;

    /**
    * 记录信息列表
    */
    @SerializedName("RecordList")
    @Expose
    private BatchSearchRecordInfo [] RecordList;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名 ID 
     * @return DomainId 域名 ID
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名 ID
     * @param DomainId 域名 ID
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 域名套餐等级 
     * @return DomainGrade 域名套餐等级
     */
    public String getDomainGrade() {
        return this.DomainGrade;
    }

    /**
     * Set 域名套餐等级
     * @param DomainGrade 域名套餐等级
     */
    public void setDomainGrade(String DomainGrade) {
        this.DomainGrade = DomainGrade;
    }

    /**
     * Get 记录信息列表 
     * @return RecordList 记录信息列表
     */
    public BatchSearchRecordInfo [] getRecordList() {
        return this.RecordList;
    }

    /**
     * Set 记录信息列表
     * @param RecordList 记录信息列表
     */
    public void setRecordList(BatchSearchRecordInfo [] RecordList) {
        this.RecordList = RecordList;
    }

    public BatchSearchDomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchSearchDomainInfo(BatchSearchDomainInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.DomainGrade != null) {
            this.DomainGrade = new String(source.DomainGrade);
        }
        if (source.RecordList != null) {
            this.RecordList = new BatchSearchRecordInfo[source.RecordList.length];
            for (int i = 0; i < source.RecordList.length; i++) {
                this.RecordList[i] = new BatchSearchRecordInfo(source.RecordList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "DomainGrade", this.DomainGrade);
        this.setParamArrayObj(map, prefix + "RecordList.", this.RecordList);

    }
}

