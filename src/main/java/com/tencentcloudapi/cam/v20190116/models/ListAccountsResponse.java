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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAccountsResponse extends AbstractModel {

    /**
    * <p>子账号列表。</p>
    */
    @SerializedName("Users")
    @Expose
    private ListAllUser [] Users;

    /**
    * <p>当IsTruncated为true时才有此字段，当返回true时，需要继续调用此接口，并且使用Marker获取截断后的内容 。</p>
    */
    @SerializedName("Marker")
    @Expose
    private String Marker;

    /**
    * <p>请求返回结果是否被截断。</p>
    */
    @SerializedName("IsTruncated")
    @Expose
    private Boolean IsTruncated;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>子账号列表。</p> 
     * @return Users <p>子账号列表。</p>
     */
    public ListAllUser [] getUsers() {
        return this.Users;
    }

    /**
     * Set <p>子账号列表。</p>
     * @param Users <p>子账号列表。</p>
     */
    public void setUsers(ListAllUser [] Users) {
        this.Users = Users;
    }

    /**
     * Get <p>当IsTruncated为true时才有此字段，当返回true时，需要继续调用此接口，并且使用Marker获取截断后的内容 。</p> 
     * @return Marker <p>当IsTruncated为true时才有此字段，当返回true时，需要继续调用此接口，并且使用Marker获取截断后的内容 。</p>
     */
    public String getMarker() {
        return this.Marker;
    }

    /**
     * Set <p>当IsTruncated为true时才有此字段，当返回true时，需要继续调用此接口，并且使用Marker获取截断后的内容 。</p>
     * @param Marker <p>当IsTruncated为true时才有此字段，当返回true时，需要继续调用此接口，并且使用Marker获取截断后的内容 。</p>
     */
    public void setMarker(String Marker) {
        this.Marker = Marker;
    }

    /**
     * Get <p>请求返回结果是否被截断。</p> 
     * @return IsTruncated <p>请求返回结果是否被截断。</p>
     */
    public Boolean getIsTruncated() {
        return this.IsTruncated;
    }

    /**
     * Set <p>请求返回结果是否被截断。</p>
     * @param IsTruncated <p>请求返回结果是否被截断。</p>
     */
    public void setIsTruncated(Boolean IsTruncated) {
        this.IsTruncated = IsTruncated;
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

    public ListAccountsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAccountsResponse(ListAccountsResponse source) {
        if (source.Users != null) {
            this.Users = new ListAllUser[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new ListAllUser(source.Users[i]);
            }
        }
        if (source.Marker != null) {
            this.Marker = new String(source.Marker);
        }
        if (source.IsTruncated != null) {
            this.IsTruncated = new Boolean(source.IsTruncated);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Users.", this.Users);
        this.setParamSimple(map, prefix + "Marker", this.Marker);
        this.setParamSimple(map, prefix + "IsTruncated", this.IsTruncated);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

