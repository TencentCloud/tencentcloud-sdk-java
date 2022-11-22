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

public class ModifyCustomRuleStatusRequest extends AbstractModel{

    /**
    * 码规则ID
    */
    @SerializedName("CustomId")
    @Expose
    private String CustomId;

    /**
    * 码规则状态 0:未生效 1:已生效 -1:已失效
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
     * Get 码规则ID 
     * @return CustomId 码规则ID
     */
    public String getCustomId() {
        return this.CustomId;
    }

    /**
     * Set 码规则ID
     * @param CustomId 码规则ID
     */
    public void setCustomId(String CustomId) {
        this.CustomId = CustomId;
    }

    /**
     * Get 码规则状态 0:未生效 1:已生效 -1:已失效 
     * @return Status 码规则状态 0:未生效 1:已生效 -1:已失效
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 码规则状态 0:未生效 1:已生效 -1:已失效
     * @param Status 码规则状态 0:未生效 1:已生效 -1:已失效
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

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

    public ModifyCustomRuleStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCustomRuleStatusRequest(ModifyCustomRuleStatusRequest source) {
        if (source.CustomId != null) {
            this.CustomId = new String(source.CustomId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomId", this.CustomId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);

    }
}

