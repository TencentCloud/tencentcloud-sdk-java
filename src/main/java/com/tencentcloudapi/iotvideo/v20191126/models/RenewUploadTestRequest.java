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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewUploadTestRequest extends AbstractModel {

    /**
    * package ID
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 设备TID
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * SessionKeys
    */
    @SerializedName("SessionKey")
    @Expose
    private String SessionKey;

    /**
     * Get package ID 
     * @return PkgId package ID
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set package ID
     * @param PkgId package ID
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get 设备TID 
     * @return Tid 设备TID
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set 设备TID
     * @param Tid 设备TID
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get SessionKeys 
     * @return SessionKey SessionKeys
     */
    public String getSessionKey() {
        return this.SessionKey;
    }

    /**
     * Set SessionKeys
     * @param SessionKey SessionKeys
     */
    public void setSessionKey(String SessionKey) {
        this.SessionKey = SessionKey;
    }

    public RenewUploadTestRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewUploadTestRequest(RenewUploadTestRequest source) {
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.Tid != null) {
            this.Tid = new String(source.Tid);
        }
        if (source.SessionKey != null) {
            this.SessionKey = new String(source.SessionKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "SessionKey", this.SessionKey);

    }
}

