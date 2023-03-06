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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserAutoSignEnableUrlRequest extends AbstractModel{

    /**
    * 操作人信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 自动签场景:
E_PRESCRIPTION_AUTO_SIGN 电子处方
    */
    @SerializedName("SceneKey")
    @Expose
    private String SceneKey;

    /**
    * 自动签开通，签署相关配置
    */
    @SerializedName("AutoSignConfig")
    @Expose
    private AutoSignConfig AutoSignConfig;

    /**
    * 链接类型，空-默认小程序端链接，H5SIGN-h5端链接
    */
    @SerializedName("UrlType")
    @Expose
    private String UrlType;

    /**
     * Get 操作人信息 
     * @return Operator 操作人信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人信息
     * @param Operator 操作人信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 自动签场景:
E_PRESCRIPTION_AUTO_SIGN 电子处方 
     * @return SceneKey 自动签场景:
E_PRESCRIPTION_AUTO_SIGN 电子处方
     */
    public String getSceneKey() {
        return this.SceneKey;
    }

    /**
     * Set 自动签场景:
E_PRESCRIPTION_AUTO_SIGN 电子处方
     * @param SceneKey 自动签场景:
E_PRESCRIPTION_AUTO_SIGN 电子处方
     */
    public void setSceneKey(String SceneKey) {
        this.SceneKey = SceneKey;
    }

    /**
     * Get 自动签开通，签署相关配置 
     * @return AutoSignConfig 自动签开通，签署相关配置
     */
    public AutoSignConfig getAutoSignConfig() {
        return this.AutoSignConfig;
    }

    /**
     * Set 自动签开通，签署相关配置
     * @param AutoSignConfig 自动签开通，签署相关配置
     */
    public void setAutoSignConfig(AutoSignConfig AutoSignConfig) {
        this.AutoSignConfig = AutoSignConfig;
    }

    /**
     * Get 链接类型，空-默认小程序端链接，H5SIGN-h5端链接 
     * @return UrlType 链接类型，空-默认小程序端链接，H5SIGN-h5端链接
     */
    public String getUrlType() {
        return this.UrlType;
    }

    /**
     * Set 链接类型，空-默认小程序端链接，H5SIGN-h5端链接
     * @param UrlType 链接类型，空-默认小程序端链接，H5SIGN-h5端链接
     */
    public void setUrlType(String UrlType) {
        this.UrlType = UrlType;
    }

    public CreateUserAutoSignEnableUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserAutoSignEnableUrlRequest(CreateUserAutoSignEnableUrlRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.SceneKey != null) {
            this.SceneKey = new String(source.SceneKey);
        }
        if (source.AutoSignConfig != null) {
            this.AutoSignConfig = new AutoSignConfig(source.AutoSignConfig);
        }
        if (source.UrlType != null) {
            this.UrlType = new String(source.UrlType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "SceneKey", this.SceneKey);
        this.setParamObj(map, prefix + "AutoSignConfig.", this.AutoSignConfig);
        this.setParamSimple(map, prefix + "UrlType", this.UrlType);

    }
}

