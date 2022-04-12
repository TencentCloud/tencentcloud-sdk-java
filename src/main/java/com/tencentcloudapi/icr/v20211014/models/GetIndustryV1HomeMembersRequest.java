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
package com.tencentcloudapi.icr.v20211014.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetIndustryV1HomeMembersRequest extends AbstractModel{

    /**
    * 无
    */
    @SerializedName("Payload")
    @Expose
    private GetIndustryV1HomeMembersReqPayload Payload;

    /**
    * 无
    */
    @SerializedName("Metadata")
    @Expose
    private ReqMetadata Metadata;

    /**
     * Get 无 
     * @return Payload 无
     */
    public GetIndustryV1HomeMembersReqPayload getPayload() {
        return this.Payload;
    }

    /**
     * Set 无
     * @param Payload 无
     */
    public void setPayload(GetIndustryV1HomeMembersReqPayload Payload) {
        this.Payload = Payload;
    }

    /**
     * Get 无 
     * @return Metadata 无
     */
    public ReqMetadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 无
     * @param Metadata 无
     */
    public void setMetadata(ReqMetadata Metadata) {
        this.Metadata = Metadata;
    }

    public GetIndustryV1HomeMembersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetIndustryV1HomeMembersRequest(GetIndustryV1HomeMembersRequest source) {
        if (source.Payload != null) {
            this.Payload = new GetIndustryV1HomeMembersReqPayload(source.Payload);
        }
        if (source.Metadata != null) {
            this.Metadata = new ReqMetadata(source.Metadata);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Payload.", this.Payload);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);

    }
}

