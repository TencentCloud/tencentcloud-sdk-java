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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAbnormalCallRecordRequest extends AbstractModel {

    /**
    * 告警规则ID
    */
    @SerializedName("AlarmRuleID")
    @Expose
    private Long AlarmRuleID;

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 访问密钥
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * 调用源IP
    */
    @SerializedName("SourceIP")
    @Expose
    private String SourceIP;

    /**
    * 过滤器
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
     * Get 告警规则ID 
     * @return AlarmRuleID 告警规则ID
     */
    public Long getAlarmRuleID() {
        return this.AlarmRuleID;
    }

    /**
     * Set 告警规则ID
     * @param AlarmRuleID 告警规则ID
     */
    public void setAlarmRuleID(Long AlarmRuleID) {
        this.AlarmRuleID = AlarmRuleID;
    }

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 访问密钥 
     * @return AccessKey 访问密钥
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set 访问密钥
     * @param AccessKey 访问密钥
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get 调用源IP 
     * @return SourceIP 调用源IP
     */
    public String getSourceIP() {
        return this.SourceIP;
    }

    /**
     * Set 调用源IP
     * @param SourceIP 调用源IP
     */
    public void setSourceIP(String SourceIP) {
        this.SourceIP = SourceIP;
    }

    /**
     * Get 过滤器 
     * @return Filter 过滤器
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤器
     * @param Filter 过滤器
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    public DescribeAbnormalCallRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAbnormalCallRecordRequest(DescribeAbnormalCallRecordRequest source) {
        if (source.AlarmRuleID != null) {
            this.AlarmRuleID = new Long(source.AlarmRuleID);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.SourceIP != null) {
            this.SourceIP = new String(source.SourceIP);
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmRuleID", this.AlarmRuleID);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "SourceIP", this.SourceIP);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

