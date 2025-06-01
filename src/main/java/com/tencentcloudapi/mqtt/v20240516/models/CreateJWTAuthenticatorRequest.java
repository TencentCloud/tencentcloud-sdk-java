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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateJWTAuthenticatorRequest extends AbstractModel {

    /**
    * 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 签名方式：hmac-based，public-key
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * 认证字段
password：对应 MQTT CONNECT Packet 中 password 字段，
username：对应 MQTT CONNECT Packet 中 username 字段
默认username

    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 密钥，Algorithm为hmac-based需要传递该字段。
    */
    @SerializedName("Secret")
    @Expose
    private String Secret;

    /**
    * 公钥，Algorithm为public-key时需要传递该字段。
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * 认证器是否开启：open-启用；close-关闭，默认：open-启用
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 说明，不能超过 128 个字符。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。 
     * @return InstanceId 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     * @param InstanceId 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 签名方式：hmac-based，public-key 
     * @return Algorithm 签名方式：hmac-based，public-key
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set 签名方式：hmac-based，public-key
     * @param Algorithm 签名方式：hmac-based，public-key
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get 认证字段
password：对应 MQTT CONNECT Packet 中 password 字段，
username：对应 MQTT CONNECT Packet 中 username 字段
默认username
 
     * @return From 认证字段
password：对应 MQTT CONNECT Packet 中 password 字段，
username：对应 MQTT CONNECT Packet 中 username 字段
默认username

     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 认证字段
password：对应 MQTT CONNECT Packet 中 password 字段，
username：对应 MQTT CONNECT Packet 中 username 字段
默认username

     * @param From 认证字段
password：对应 MQTT CONNECT Packet 中 password 字段，
username：对应 MQTT CONNECT Packet 中 username 字段
默认username

     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get 密钥，Algorithm为hmac-based需要传递该字段。 
     * @return Secret 密钥，Algorithm为hmac-based需要传递该字段。
     */
    public String getSecret() {
        return this.Secret;
    }

    /**
     * Set 密钥，Algorithm为hmac-based需要传递该字段。
     * @param Secret 密钥，Algorithm为hmac-based需要传递该字段。
     */
    public void setSecret(String Secret) {
        this.Secret = Secret;
    }

    /**
     * Get 公钥，Algorithm为public-key时需要传递该字段。 
     * @return PublicKey 公钥，Algorithm为public-key时需要传递该字段。
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set 公钥，Algorithm为public-key时需要传递该字段。
     * @param PublicKey 公钥，Algorithm为public-key时需要传递该字段。
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get 认证器是否开启：open-启用；close-关闭，默认：open-启用 
     * @return Status 认证器是否开启：open-启用；close-关闭，默认：open-启用
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 认证器是否开启：open-启用；close-关闭，默认：open-启用
     * @param Status 认证器是否开启：open-启用；close-关闭，默认：open-启用
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 说明，不能超过 128 个字符。 
     * @return Remark 说明，不能超过 128 个字符。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明，不能超过 128 个字符。
     * @param Remark 说明，不能超过 128 个字符。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateJWTAuthenticatorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateJWTAuthenticatorRequest(CreateJWTAuthenticatorRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Algorithm != null) {
            this.Algorithm = new String(source.Algorithm);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.Secret != null) {
            this.Secret = new String(source.Secret);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "Secret", this.Secret);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

