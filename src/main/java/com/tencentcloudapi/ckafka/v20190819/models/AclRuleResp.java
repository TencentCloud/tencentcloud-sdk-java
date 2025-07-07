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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AclRuleResp extends AbstractModel {

    /**
    * 总数据条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * AclRule列表
    */
    @SerializedName("AclRuleList")
    @Expose
    private AclRule [] AclRuleList;

    /**
     * Get 总数据条数 
     * @return TotalCount 总数据条数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数据条数
     * @param TotalCount 总数据条数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get AclRule列表 
     * @return AclRuleList AclRule列表
     */
    public AclRule [] getAclRuleList() {
        return this.AclRuleList;
    }

    /**
     * Set AclRule列表
     * @param AclRuleList AclRule列表
     */
    public void setAclRuleList(AclRule [] AclRuleList) {
        this.AclRuleList = AclRuleList;
    }

    public AclRuleResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AclRuleResp(AclRuleResp source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AclRuleList != null) {
            this.AclRuleList = new AclRule[source.AclRuleList.length];
            for (int i = 0; i < source.AclRuleList.length; i++) {
                this.AclRuleList[i] = new AclRule(source.AclRuleList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "AclRuleList.", this.AclRuleList);

    }
}

