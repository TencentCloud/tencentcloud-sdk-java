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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosAuthMode extends AbstractModel{

    /**
    * 授权类型，可选值： 
0：bucket授权，需要将对应bucket授权给本服务帐号（3020447271），否则会读写cos失败； 
1：key托管，把cos的账号id和key托管于本服务，本服务会提供一个托管id； 
3：临时key授权。
注意：目前智能编辑还不支持临时key授权。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * cos账号托管id，Type等于1时必选。
    */
    @SerializedName("HostedId")
    @Expose
    private String HostedId;

    /**
    * cos身份识别id，Type等于3时必选。
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * cos身份秘钥，Type等于3时必选。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * 临时授权 token，Type等于3时必选。
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
     * Get 授权类型，可选值： 
0：bucket授权，需要将对应bucket授权给本服务帐号（3020447271），否则会读写cos失败； 
1：key托管，把cos的账号id和key托管于本服务，本服务会提供一个托管id； 
3：临时key授权。
注意：目前智能编辑还不支持临时key授权。 
     * @return Type 授权类型，可选值： 
0：bucket授权，需要将对应bucket授权给本服务帐号（3020447271），否则会读写cos失败； 
1：key托管，把cos的账号id和key托管于本服务，本服务会提供一个托管id； 
3：临时key授权。
注意：目前智能编辑还不支持临时key授权。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 授权类型，可选值： 
0：bucket授权，需要将对应bucket授权给本服务帐号（3020447271），否则会读写cos失败； 
1：key托管，把cos的账号id和key托管于本服务，本服务会提供一个托管id； 
3：临时key授权。
注意：目前智能编辑还不支持临时key授权。
     * @param Type 授权类型，可选值： 
0：bucket授权，需要将对应bucket授权给本服务帐号（3020447271），否则会读写cos失败； 
1：key托管，把cos的账号id和key托管于本服务，本服务会提供一个托管id； 
3：临时key授权。
注意：目前智能编辑还不支持临时key授权。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get cos账号托管id，Type等于1时必选。 
     * @return HostedId cos账号托管id，Type等于1时必选。
     */
    public String getHostedId() {
        return this.HostedId;
    }

    /**
     * Set cos账号托管id，Type等于1时必选。
     * @param HostedId cos账号托管id，Type等于1时必选。
     */
    public void setHostedId(String HostedId) {
        this.HostedId = HostedId;
    }

    /**
     * Get cos身份识别id，Type等于3时必选。 
     * @return SecretId cos身份识别id，Type等于3时必选。
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set cos身份识别id，Type等于3时必选。
     * @param SecretId cos身份识别id，Type等于3时必选。
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get cos身份秘钥，Type等于3时必选。 
     * @return SecretKey cos身份秘钥，Type等于3时必选。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set cos身份秘钥，Type等于3时必选。
     * @param SecretKey cos身份秘钥，Type等于3时必选。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get 临时授权 token，Type等于3时必选。 
     * @return Token 临时授权 token，Type等于3时必选。
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set 临时授权 token，Type等于3时必选。
     * @param Token 临时授权 token，Type等于3时必选。
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "HostedId", this.HostedId);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Token", this.Token);

    }
}

