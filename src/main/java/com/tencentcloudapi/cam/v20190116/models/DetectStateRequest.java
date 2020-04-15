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

public class DetectStateRequest extends AbstractModel{

    /**
    * IP
    */
    @SerializedName("ClientIP")
    @Expose
    private String ClientIP;

    /**
    * 浏览器UA
    */
    @SerializedName("ClientUA")
    @Expose
    private String ClientUA;

    /**
    * token
    */
    @SerializedName("FaceIdToken")
    @Expose
    private String FaceIdToken;

    /**
     * Get IP 
     * @return ClientIP IP
     */
    public String getClientIP() {
        return this.ClientIP;
    }

    /**
     * Set IP
     * @param ClientIP IP
     */
    public void setClientIP(String ClientIP) {
        this.ClientIP = ClientIP;
    }

    /**
     * Get 浏览器UA 
     * @return ClientUA 浏览器UA
     */
    public String getClientUA() {
        return this.ClientUA;
    }

    /**
     * Set 浏览器UA
     * @param ClientUA 浏览器UA
     */
    public void setClientUA(String ClientUA) {
        this.ClientUA = ClientUA;
    }

    /**
     * Get token 
     * @return FaceIdToken token
     */
    public String getFaceIdToken() {
        return this.FaceIdToken;
    }

    /**
     * Set token
     * @param FaceIdToken token
     */
    public void setFaceIdToken(String FaceIdToken) {
        this.FaceIdToken = FaceIdToken;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientIP", this.ClientIP);
        this.setParamSimple(map, prefix + "ClientUA", this.ClientUA);
        this.setParamSimple(map, prefix + "FaceIdToken", this.FaceIdToken);

    }
}

