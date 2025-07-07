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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrafficQosPolicyRequest extends AbstractModel {

    /**
    * CCN实例ID。形如：ccn-f49l6u0z。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 本端地域。
    */
    @SerializedName("LocalRegion")
    @Expose
    private String LocalRegion;

    /**
    * 远端地域。
    */
    @SerializedName("RemoteRegion")
    @Expose
    private String RemoteRegion;

    /**
     * Get CCN实例ID。形如：ccn-f49l6u0z。 
     * @return CcnId CCN实例ID。形如：ccn-f49l6u0z。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set CCN实例ID。形如：ccn-f49l6u0z。
     * @param CcnId CCN实例ID。形如：ccn-f49l6u0z。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 本端地域。 
     * @return LocalRegion 本端地域。
     */
    public String getLocalRegion() {
        return this.LocalRegion;
    }

    /**
     * Set 本端地域。
     * @param LocalRegion 本端地域。
     */
    public void setLocalRegion(String LocalRegion) {
        this.LocalRegion = LocalRegion;
    }

    /**
     * Get 远端地域。 
     * @return RemoteRegion 远端地域。
     */
    public String getRemoteRegion() {
        return this.RemoteRegion;
    }

    /**
     * Set 远端地域。
     * @param RemoteRegion 远端地域。
     */
    public void setRemoteRegion(String RemoteRegion) {
        this.RemoteRegion = RemoteRegion;
    }

    public DescribeTrafficQosPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrafficQosPolicyRequest(DescribeTrafficQosPolicyRequest source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.LocalRegion != null) {
            this.LocalRegion = new String(source.LocalRegion);
        }
        if (source.RemoteRegion != null) {
            this.RemoteRegion = new String(source.RemoteRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "LocalRegion", this.LocalRegion);
        this.setParamSimple(map, prefix + "RemoteRegion", this.RemoteRegion);

    }
}

