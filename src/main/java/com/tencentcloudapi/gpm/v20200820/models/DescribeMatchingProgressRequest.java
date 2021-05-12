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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMatchingProgressRequest extends AbstractModel{

    /**
    * 匹配票据 ID列表, 列表长度 12。
    */
    @SerializedName("MatchTicketIds")
    @Expose
    private MTicket [] MatchTicketIds;

    /**
     * Get 匹配票据 ID列表, 列表长度 12。 
     * @return MatchTicketIds 匹配票据 ID列表, 列表长度 12。
     */
    public MTicket [] getMatchTicketIds() {
        return this.MatchTicketIds;
    }

    /**
     * Set 匹配票据 ID列表, 列表长度 12。
     * @param MatchTicketIds 匹配票据 ID列表, 列表长度 12。
     */
    public void setMatchTicketIds(MTicket [] MatchTicketIds) {
        this.MatchTicketIds = MatchTicketIds;
    }

    public DescribeMatchingProgressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMatchingProgressRequest(DescribeMatchingProgressRequest source) {
        if (source.MatchTicketIds != null) {
            this.MatchTicketIds = new MTicket[source.MatchTicketIds.length];
            for (int i = 0; i < source.MatchTicketIds.length; i++) {
                this.MatchTicketIds[i] = new MTicket(source.MatchTicketIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MatchTicketIds.", this.MatchTicketIds);

    }
}

