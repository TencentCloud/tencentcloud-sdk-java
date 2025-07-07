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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMatchingProgressResponse extends AbstractModel {

    /**
    * 匹配票据列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MatchTickets")
    @Expose
    private MatchTicket [] MatchTickets;

    /**
    * 错误码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 匹配票据列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MatchTickets 匹配票据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MatchTicket [] getMatchTickets() {
        return this.MatchTickets;
    }

    /**
     * Set 匹配票据列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param MatchTickets 匹配票据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMatchTickets(MatchTicket [] MatchTickets) {
        this.MatchTickets = MatchTickets;
    }

    /**
     * Get 错误码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrCode 错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 错误码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrCode 错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
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

    public DescribeMatchingProgressResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMatchingProgressResponse(DescribeMatchingProgressResponse source) {
        if (source.MatchTickets != null) {
            this.MatchTickets = new MatchTicket[source.MatchTickets.length];
            for (int i = 0; i < source.MatchTickets.length; i++) {
                this.MatchTickets[i] = new MatchTicket(source.MatchTickets[i]);
            }
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MatchTickets.", this.MatchTickets);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

