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

public class CreateAccessKeyCheckTaskRequest extends AbstractModel {

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 风险列表
    */
    @SerializedName("RiskIDList")
    @Expose
    private Long [] RiskIDList;

    /**
    * 访问密钥列表
    */
    @SerializedName("AccessKeyList")
    @Expose
    private String [] AccessKeyList;

    /**
    * 账号uin列表
    */
    @SerializedName("SubUinList")
    @Expose
    private String [] SubUinList;

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
     * Get 风险列表 
     * @return RiskIDList 风险列表
     */
    public Long [] getRiskIDList() {
        return this.RiskIDList;
    }

    /**
     * Set 风险列表
     * @param RiskIDList 风险列表
     */
    public void setRiskIDList(Long [] RiskIDList) {
        this.RiskIDList = RiskIDList;
    }

    /**
     * Get 访问密钥列表 
     * @return AccessKeyList 访问密钥列表
     */
    public String [] getAccessKeyList() {
        return this.AccessKeyList;
    }

    /**
     * Set 访问密钥列表
     * @param AccessKeyList 访问密钥列表
     */
    public void setAccessKeyList(String [] AccessKeyList) {
        this.AccessKeyList = AccessKeyList;
    }

    /**
     * Get 账号uin列表 
     * @return SubUinList 账号uin列表
     */
    public String [] getSubUinList() {
        return this.SubUinList;
    }

    /**
     * Set 账号uin列表
     * @param SubUinList 账号uin列表
     */
    public void setSubUinList(String [] SubUinList) {
        this.SubUinList = SubUinList;
    }

    public CreateAccessKeyCheckTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAccessKeyCheckTaskRequest(CreateAccessKeyCheckTaskRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.RiskIDList != null) {
            this.RiskIDList = new Long[source.RiskIDList.length];
            for (int i = 0; i < source.RiskIDList.length; i++) {
                this.RiskIDList[i] = new Long(source.RiskIDList[i]);
            }
        }
        if (source.AccessKeyList != null) {
            this.AccessKeyList = new String[source.AccessKeyList.length];
            for (int i = 0; i < source.AccessKeyList.length; i++) {
                this.AccessKeyList[i] = new String(source.AccessKeyList[i]);
            }
        }
        if (source.SubUinList != null) {
            this.SubUinList = new String[source.SubUinList.length];
            for (int i = 0; i < source.SubUinList.length; i++) {
                this.SubUinList[i] = new String(source.SubUinList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "RiskIDList.", this.RiskIDList);
        this.setParamArraySimple(map, prefix + "AccessKeyList.", this.AccessKeyList);
        this.setParamArraySimple(map, prefix + "SubUinList.", this.SubUinList);

    }
}

