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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Identity extends AbstractModel{

    /**
    * 账户标识符
    */
    @SerializedName("AccountIdentifier")
    @Expose
    private String AccountIdentifier;

    /**
    * 链ID
    */
    @SerializedName("ChainID")
    @Expose
    private String ChainID;

    /**
    * 完整tdid
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
    * 群组ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 群组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get 账户标识符 
     * @return AccountIdentifier 账户标识符
     */
    public String getAccountIdentifier() {
        return this.AccountIdentifier;
    }

    /**
     * Set 账户标识符
     * @param AccountIdentifier 账户标识符
     */
    public void setAccountIdentifier(String AccountIdentifier) {
        this.AccountIdentifier = AccountIdentifier;
    }

    /**
     * Get 链ID 
     * @return ChainID 链ID
     */
    public String getChainID() {
        return this.ChainID;
    }

    /**
     * Set 链ID
     * @param ChainID 链ID
     */
    public void setChainID(String ChainID) {
        this.ChainID = ChainID;
    }

    /**
     * Get 完整tdid 
     * @return Did 完整tdid
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set 完整tdid
     * @param Did 完整tdid
     */
    public void setDid(String Did) {
        this.Did = Did;
    }

    /**
     * Get 群组ID 
     * @return GroupId 群组ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 群组ID
     * @param GroupId 群组ID
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 群组名称 
     * @return GroupName 群组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 群组名称
     * @param GroupName 群组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public Identity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Identity(Identity source) {
        if (source.AccountIdentifier != null) {
            this.AccountIdentifier = new String(source.AccountIdentifier);
        }
        if (source.ChainID != null) {
            this.ChainID = new String(source.ChainID);
        }
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountIdentifier", this.AccountIdentifier);
        this.setParamSimple(map, prefix + "ChainID", this.ChainID);
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

