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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryAuthorityInfoResponse extends AbstractModel {

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 权威机构did
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
    * 状态：1为已认证，2为未认证
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 机构备注信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 认证时间
    */
    @SerializedName("RecognizeTime")
    @Expose
    private String RecognizeTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 权威机构did 
     * @return Did 权威机构did
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set 权威机构did
     * @param Did 权威机构did
     */
    public void setDid(String Did) {
        this.Did = Did;
    }

    /**
     * Get 状态：1为已认证，2为未认证 
     * @return Status 状态：1为已认证，2为未认证
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：1为已认证，2为未认证
     * @param Status 状态：1为已认证，2为未认证
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 机构备注信息 
     * @return Description 机构备注信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 机构备注信息
     * @param Description 机构备注信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 认证时间 
     * @return RecognizeTime 认证时间
     */
    public String getRecognizeTime() {
        return this.RecognizeTime;
    }

    /**
     * Set 认证时间
     * @param RecognizeTime 认证时间
     */
    public void setRecognizeTime(String RecognizeTime) {
        this.RecognizeTime = RecognizeTime;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public QueryAuthorityInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryAuthorityInfoResponse(QueryAuthorityInfoResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RecognizeTime != null) {
            this.RecognizeTime = new String(source.RecognizeTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RecognizeTime", this.RecognizeTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

