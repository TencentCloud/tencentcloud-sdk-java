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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientRule extends AbstractModel{

    /**
    * 客户端ip。
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 规则类型。
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 规则id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 封禁状态，取值有：
<li>block ：封禁 ；</li>
<li>allow ：放行 。</li>
    */
    @SerializedName("IpStatus")
    @Expose
    private String IpStatus;

    /**
    * 封禁时间，采用unix秒级时间戳。
    */
    @SerializedName("BlockTime")
    @Expose
    private Long BlockTime;

    /**
    * 每条数据的唯一标识id。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 客户端ip。 
     * @return ClientIp 客户端ip。
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 客户端ip。
     * @param ClientIp 客户端ip。
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get 规则类型。 
     * @return RuleType 规则类型。
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型。
     * @param RuleType 规则类型。
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 规则id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 规则id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 规则id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 规则描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 规则描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 封禁状态，取值有：
<li>block ：封禁 ；</li>
<li>allow ：放行 。</li> 
     * @return IpStatus 封禁状态，取值有：
<li>block ：封禁 ；</li>
<li>allow ：放行 。</li>
     */
    public String getIpStatus() {
        return this.IpStatus;
    }

    /**
     * Set 封禁状态，取值有：
<li>block ：封禁 ；</li>
<li>allow ：放行 。</li>
     * @param IpStatus 封禁状态，取值有：
<li>block ：封禁 ；</li>
<li>allow ：放行 。</li>
     */
    public void setIpStatus(String IpStatus) {
        this.IpStatus = IpStatus;
    }

    /**
     * Get 封禁时间，采用unix秒级时间戳。 
     * @return BlockTime 封禁时间，采用unix秒级时间戳。
     */
    public Long getBlockTime() {
        return this.BlockTime;
    }

    /**
     * Set 封禁时间，采用unix秒级时间戳。
     * @param BlockTime 封禁时间，采用unix秒级时间戳。
     */
    public void setBlockTime(Long BlockTime) {
        this.BlockTime = BlockTime;
    }

    /**
     * Get 每条数据的唯一标识id。 
     * @return Id 每条数据的唯一标识id。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 每条数据的唯一标识id。
     * @param Id 每条数据的唯一标识id。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public ClientRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientRule(ClientRule source) {
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IpStatus != null) {
            this.IpStatus = new String(source.IpStatus);
        }
        if (source.BlockTime != null) {
            this.BlockTime = new Long(source.BlockTime);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IpStatus", this.IpStatus);
        this.setParamSimple(map, prefix + "BlockTime", this.BlockTime);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

