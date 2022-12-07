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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CorpQuota extends AbstractModel{

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 企业名称
    */
    @SerializedName("CorpName")
    @Expose
    private String CorpName;

    /**
    * 额度
    */
    @SerializedName("Quota")
    @Expose
    private Quota Quota;

    /**
    * 额度使用量
    */
    @SerializedName("UsageQuota")
    @Expose
    private UsageQuota UsageQuota;

    /**
     * Get 企业ID 
     * @return CorpId 企业ID
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
     * @param CorpId 企业ID
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 企业名称 
     * @return CorpName 企业名称
     */
    public String getCorpName() {
        return this.CorpName;
    }

    /**
     * Set 企业名称
     * @param CorpName 企业名称
     */
    public void setCorpName(String CorpName) {
        this.CorpName = CorpName;
    }

    /**
     * Get 额度 
     * @return Quota 额度
     */
    public Quota getQuota() {
        return this.Quota;
    }

    /**
     * Set 额度
     * @param Quota 额度
     */
    public void setQuota(Quota Quota) {
        this.Quota = Quota;
    }

    /**
     * Get 额度使用量 
     * @return UsageQuota 额度使用量
     */
    public UsageQuota getUsageQuota() {
        return this.UsageQuota;
    }

    /**
     * Set 额度使用量
     * @param UsageQuota 额度使用量
     */
    public void setUsageQuota(UsageQuota UsageQuota) {
        this.UsageQuota = UsageQuota;
    }

    public CorpQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CorpQuota(CorpQuota source) {
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.CorpName != null) {
            this.CorpName = new String(source.CorpName);
        }
        if (source.Quota != null) {
            this.Quota = new Quota(source.Quota);
        }
        if (source.UsageQuota != null) {
            this.UsageQuota = new UsageQuota(source.UsageQuota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "CorpName", this.CorpName);
        this.setParamObj(map, prefix + "Quota.", this.Quota);
        this.setParamObj(map, prefix + "UsageQuota.", this.UsageQuota);

    }
}

