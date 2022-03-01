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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetUserAppIdResponse extends AbstractModel{

    /**
    * 当前账号Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 当前账号OwnerUin
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 当前账号AppId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前账号Uin 
     * @return Uin 当前账号Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 当前账号Uin
     * @param Uin 当前账号Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 当前账号OwnerUin 
     * @return OwnerUin 当前账号OwnerUin
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 当前账号OwnerUin
     * @param OwnerUin 当前账号OwnerUin
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 当前账号AppId 
     * @return AppId 当前账号AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 当前账号AppId
     * @param AppId 当前账号AppId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
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

    public GetUserAppIdResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetUserAppIdResponse(GetUserAppIdResponse source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

