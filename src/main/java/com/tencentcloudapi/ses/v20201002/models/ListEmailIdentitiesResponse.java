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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListEmailIdentitiesResponse extends AbstractModel{

    /**
    * 发信域名列表
    */
    @SerializedName("EmailIdentities")
    @Expose
    private EmailIdentity [] EmailIdentities;

    /**
    * 最大信誉等级
    */
    @SerializedName("MaxReputationLevel")
    @Expose
    private Long MaxReputationLevel;

    /**
    * 单域名最高日发送量
    */
    @SerializedName("MaxDailyQuota")
    @Expose
    private Long MaxDailyQuota;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 发信域名列表 
     * @return EmailIdentities 发信域名列表
     */
    public EmailIdentity [] getEmailIdentities() {
        return this.EmailIdentities;
    }

    /**
     * Set 发信域名列表
     * @param EmailIdentities 发信域名列表
     */
    public void setEmailIdentities(EmailIdentity [] EmailIdentities) {
        this.EmailIdentities = EmailIdentities;
    }

    /**
     * Get 最大信誉等级 
     * @return MaxReputationLevel 最大信誉等级
     */
    public Long getMaxReputationLevel() {
        return this.MaxReputationLevel;
    }

    /**
     * Set 最大信誉等级
     * @param MaxReputationLevel 最大信誉等级
     */
    public void setMaxReputationLevel(Long MaxReputationLevel) {
        this.MaxReputationLevel = MaxReputationLevel;
    }

    /**
     * Get 单域名最高日发送量 
     * @return MaxDailyQuota 单域名最高日发送量
     */
    public Long getMaxDailyQuota() {
        return this.MaxDailyQuota;
    }

    /**
     * Set 单域名最高日发送量
     * @param MaxDailyQuota 单域名最高日发送量
     */
    public void setMaxDailyQuota(Long MaxDailyQuota) {
        this.MaxDailyQuota = MaxDailyQuota;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ListEmailIdentitiesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListEmailIdentitiesResponse(ListEmailIdentitiesResponse source) {
        if (source.EmailIdentities != null) {
            this.EmailIdentities = new EmailIdentity[source.EmailIdentities.length];
            for (int i = 0; i < source.EmailIdentities.length; i++) {
                this.EmailIdentities[i] = new EmailIdentity(source.EmailIdentities[i]);
            }
        }
        if (source.MaxReputationLevel != null) {
            this.MaxReputationLevel = new Long(source.MaxReputationLevel);
        }
        if (source.MaxDailyQuota != null) {
            this.MaxDailyQuota = new Long(source.MaxDailyQuota);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "EmailIdentities.", this.EmailIdentities);
        this.setParamSimple(map, prefix + "MaxReputationLevel", this.MaxReputationLevel);
        this.setParamSimple(map, prefix + "MaxDailyQuota", this.MaxDailyQuota);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

