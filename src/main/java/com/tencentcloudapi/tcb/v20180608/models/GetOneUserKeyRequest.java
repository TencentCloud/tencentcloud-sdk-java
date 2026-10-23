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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetOneUserKeyRequest extends AbstractModel {

    /**
    * <p>环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>用户密钥对标识，前半部分用户填写，后半部分平台按照一定规则生成</p>
    */
    @SerializedName("KeyID")
    @Expose
    private String KeyID;

    /**
    * <p>业务场景来源，默认不传，表示来源授权中心，integration表示来源集成中心，当从集成中心请求时必传integration</p>
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * <p>是否需要加密字段的值，true：是，false：否，默认不传，不需要</p><p>默认值：false</p><p>当为true时，返回加密字段的值，前端进行按约定解密</p>
    */
    @SerializedName("NeedPwd")
    @Expose
    private Boolean NeedPwd;

    /**
     * Get <p>环境ID</p> 
     * @return EnvId <p>环境ID</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境ID</p>
     * @param EnvId <p>环境ID</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>用户密钥对标识，前半部分用户填写，后半部分平台按照一定规则生成</p> 
     * @return KeyID <p>用户密钥对标识，前半部分用户填写，后半部分平台按照一定规则生成</p>
     */
    public String getKeyID() {
        return this.KeyID;
    }

    /**
     * Set <p>用户密钥对标识，前半部分用户填写，后半部分平台按照一定规则生成</p>
     * @param KeyID <p>用户密钥对标识，前半部分用户填写，后半部分平台按照一定规则生成</p>
     */
    public void setKeyID(String KeyID) {
        this.KeyID = KeyID;
    }

    /**
     * Get <p>业务场景来源，默认不传，表示来源授权中心，integration表示来源集成中心，当从集成中心请求时必传integration</p> 
     * @return Business <p>业务场景来源，默认不传，表示来源授权中心，integration表示来源集成中心，当从集成中心请求时必传integration</p>
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set <p>业务场景来源，默认不传，表示来源授权中心，integration表示来源集成中心，当从集成中心请求时必传integration</p>
     * @param Business <p>业务场景来源，默认不传，表示来源授权中心，integration表示来源集成中心，当从集成中心请求时必传integration</p>
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get <p>是否需要加密字段的值，true：是，false：否，默认不传，不需要</p><p>默认值：false</p><p>当为true时，返回加密字段的值，前端进行按约定解密</p> 
     * @return NeedPwd <p>是否需要加密字段的值，true：是，false：否，默认不传，不需要</p><p>默认值：false</p><p>当为true时，返回加密字段的值，前端进行按约定解密</p>
     */
    public Boolean getNeedPwd() {
        return this.NeedPwd;
    }

    /**
     * Set <p>是否需要加密字段的值，true：是，false：否，默认不传，不需要</p><p>默认值：false</p><p>当为true时，返回加密字段的值，前端进行按约定解密</p>
     * @param NeedPwd <p>是否需要加密字段的值，true：是，false：否，默认不传，不需要</p><p>默认值：false</p><p>当为true时，返回加密字段的值，前端进行按约定解密</p>
     */
    public void setNeedPwd(Boolean NeedPwd) {
        this.NeedPwd = NeedPwd;
    }

    public GetOneUserKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetOneUserKeyRequest(GetOneUserKeyRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.KeyID != null) {
            this.KeyID = new String(source.KeyID);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.NeedPwd != null) {
            this.NeedPwd = new Boolean(source.NeedPwd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "KeyID", this.KeyID);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "NeedPwd", this.NeedPwd);

    }
}

