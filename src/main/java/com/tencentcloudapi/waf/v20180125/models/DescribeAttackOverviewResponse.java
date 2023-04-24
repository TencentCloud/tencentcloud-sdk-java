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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAttackOverviewResponse extends AbstractModel{

    /**
    * 访问请求总数
    */
    @SerializedName("AccessCount")
    @Expose
    private Long AccessCount;

    /**
    * Web攻击总数
    */
    @SerializedName("AttackCount")
    @Expose
    private Long AttackCount;

    /**
    * 访问控制总数
    */
    @SerializedName("ACLCount")
    @Expose
    private Long ACLCount;

    /**
    * CC攻击总数
    */
    @SerializedName("CCCount")
    @Expose
    private Long CCCount;

    /**
    * Bot攻击总数
    */
    @SerializedName("BotCount")
    @Expose
    private Long BotCount;

    /**
    * api资产总数
    */
    @SerializedName("ApiAssetsCount")
    @Expose
    private Long ApiAssetsCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 访问请求总数 
     * @return AccessCount 访问请求总数
     */
    public Long getAccessCount() {
        return this.AccessCount;
    }

    /**
     * Set 访问请求总数
     * @param AccessCount 访问请求总数
     */
    public void setAccessCount(Long AccessCount) {
        this.AccessCount = AccessCount;
    }

    /**
     * Get Web攻击总数 
     * @return AttackCount Web攻击总数
     */
    public Long getAttackCount() {
        return this.AttackCount;
    }

    /**
     * Set Web攻击总数
     * @param AttackCount Web攻击总数
     */
    public void setAttackCount(Long AttackCount) {
        this.AttackCount = AttackCount;
    }

    /**
     * Get 访问控制总数 
     * @return ACLCount 访问控制总数
     */
    public Long getACLCount() {
        return this.ACLCount;
    }

    /**
     * Set 访问控制总数
     * @param ACLCount 访问控制总数
     */
    public void setACLCount(Long ACLCount) {
        this.ACLCount = ACLCount;
    }

    /**
     * Get CC攻击总数 
     * @return CCCount CC攻击总数
     */
    public Long getCCCount() {
        return this.CCCount;
    }

    /**
     * Set CC攻击总数
     * @param CCCount CC攻击总数
     */
    public void setCCCount(Long CCCount) {
        this.CCCount = CCCount;
    }

    /**
     * Get Bot攻击总数 
     * @return BotCount Bot攻击总数
     */
    public Long getBotCount() {
        return this.BotCount;
    }

    /**
     * Set Bot攻击总数
     * @param BotCount Bot攻击总数
     */
    public void setBotCount(Long BotCount) {
        this.BotCount = BotCount;
    }

    /**
     * Get api资产总数 
     * @return ApiAssetsCount api资产总数
     */
    public Long getApiAssetsCount() {
        return this.ApiAssetsCount;
    }

    /**
     * Set api资产总数
     * @param ApiAssetsCount api资产总数
     */
    public void setApiAssetsCount(Long ApiAssetsCount) {
        this.ApiAssetsCount = ApiAssetsCount;
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

    public DescribeAttackOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAttackOverviewResponse(DescribeAttackOverviewResponse source) {
        if (source.AccessCount != null) {
            this.AccessCount = new Long(source.AccessCount);
        }
        if (source.AttackCount != null) {
            this.AttackCount = new Long(source.AttackCount);
        }
        if (source.ACLCount != null) {
            this.ACLCount = new Long(source.ACLCount);
        }
        if (source.CCCount != null) {
            this.CCCount = new Long(source.CCCount);
        }
        if (source.BotCount != null) {
            this.BotCount = new Long(source.BotCount);
        }
        if (source.ApiAssetsCount != null) {
            this.ApiAssetsCount = new Long(source.ApiAssetsCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessCount", this.AccessCount);
        this.setParamSimple(map, prefix + "AttackCount", this.AttackCount);
        this.setParamSimple(map, prefix + "ACLCount", this.ACLCount);
        this.setParamSimple(map, prefix + "CCCount", this.CCCount);
        this.setParamSimple(map, prefix + "BotCount", this.BotCount);
        this.setParamSimple(map, prefix + "ApiAssetsCount", this.ApiAssetsCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

