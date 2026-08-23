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

public class DescribeAIAgentCredentialLocationListRequest extends AbstractModel {

    /**
    * <p>凭据组行 ID（来自 DescribeAIAgentCredentialList 响应 AIAgentCredentialItem.ID）</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>偏移量，默认 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页数量，默认 10，上限 200</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>凭据组行 ID（来自 DescribeAIAgentCredentialList 响应 AIAgentCredentialItem.ID）</p> 
     * @return ID <p>凭据组行 ID（来自 DescribeAIAgentCredentialList 响应 AIAgentCredentialItem.ID）</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>凭据组行 ID（来自 DescribeAIAgentCredentialList 响应 AIAgentCredentialItem.ID）</p>
     * @param ID <p>凭据组行 ID（来自 DescribeAIAgentCredentialList 响应 AIAgentCredentialItem.ID）</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>偏移量，默认 0</p> 
     * @return Offset <p>偏移量，默认 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认 0</p>
     * @param Offset <p>偏移量，默认 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页数量，默认 10，上限 200</p> 
     * @return Limit <p>每页数量，默认 10，上限 200</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页数量，默认 10，上限 200</p>
     * @param Limit <p>每页数量，默认 10，上限 200</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeAIAgentCredentialLocationListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIAgentCredentialLocationListRequest(DescribeAIAgentCredentialLocationListRequest source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

