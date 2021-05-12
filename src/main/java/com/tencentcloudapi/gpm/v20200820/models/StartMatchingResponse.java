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

public class StartMatchingResponse extends AbstractModel{

    /**
    * 错误码。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 匹配票据 ID长度 128。
    */
    @SerializedName("MatchTicketId")
    @Expose
    private String MatchTicketId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 错误码。 
     * @return ErrCode 错误码。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 错误码。
     * @param ErrCode 错误码。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 匹配票据 ID长度 128。 
     * @return MatchTicketId 匹配票据 ID长度 128。
     */
    public String getMatchTicketId() {
        return this.MatchTicketId;
    }

    /**
     * Set 匹配票据 ID长度 128。
     * @param MatchTicketId 匹配票据 ID长度 128。
     */
    public void setMatchTicketId(String MatchTicketId) {
        this.MatchTicketId = MatchTicketId;
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

    public StartMatchingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartMatchingResponse(StartMatchingResponse source) {
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.MatchTicketId != null) {
            this.MatchTicketId = new String(source.MatchTicketId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "MatchTicketId", this.MatchTicketId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

