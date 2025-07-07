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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateJWKSAuthenticatorRequest extends AbstractModel {

    /**
    * 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * JWKS服务地址，（Text字段和Endpoint字段必须选择一个填写）
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 认证文本刷新间隔时间，单位：秒，最小值60，默认值60，最大值1000。填写认证服务器地址（Endpoint）时生效。
    */
    @SerializedName("RefreshInterval")
    @Expose
    private Long RefreshInterval;

    /**
    * jwks文本，（Text字段和Endpoint字段必须选择一个填写）
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 认证器是否开启：open-启用；close-关闭，默认open-启用
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 说明，不能超过 128 个字符
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 认证字段；
username-对应 MQTT CONNECT Packet 中 username 字段，
password-对应 MQTT CONNECT Packet 中 password 字段。

默认username
    */
    @SerializedName("From")
    @Expose
    private String From;

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
     * Get JWKS服务地址，（Text字段和Endpoint字段必须选择一个填写） 
     * @return Endpoint JWKS服务地址，（Text字段和Endpoint字段必须选择一个填写）
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set JWKS服务地址，（Text字段和Endpoint字段必须选择一个填写）
     * @param Endpoint JWKS服务地址，（Text字段和Endpoint字段必须选择一个填写）
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 认证文本刷新间隔时间，单位：秒，最小值60，默认值60，最大值1000。填写认证服务器地址（Endpoint）时生效。 
     * @return RefreshInterval 认证文本刷新间隔时间，单位：秒，最小值60，默认值60，最大值1000。填写认证服务器地址（Endpoint）时生效。
     */
    public Long getRefreshInterval() {
        return this.RefreshInterval;
    }

    /**
     * Set 认证文本刷新间隔时间，单位：秒，最小值60，默认值60，最大值1000。填写认证服务器地址（Endpoint）时生效。
     * @param RefreshInterval 认证文本刷新间隔时间，单位：秒，最小值60，默认值60，最大值1000。填写认证服务器地址（Endpoint）时生效。
     */
    public void setRefreshInterval(Long RefreshInterval) {
        this.RefreshInterval = RefreshInterval;
    }

    /**
     * Get jwks文本，（Text字段和Endpoint字段必须选择一个填写） 
     * @return Text jwks文本，（Text字段和Endpoint字段必须选择一个填写）
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set jwks文本，（Text字段和Endpoint字段必须选择一个填写）
     * @param Text jwks文本，（Text字段和Endpoint字段必须选择一个填写）
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 认证器是否开启：open-启用；close-关闭，默认open-启用 
     * @return Status 认证器是否开启：open-启用；close-关闭，默认open-启用
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 认证器是否开启：open-启用；close-关闭，默认open-启用
     * @param Status 认证器是否开启：open-启用；close-关闭，默认open-启用
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 说明，不能超过 128 个字符 
     * @return Remark 说明，不能超过 128 个字符
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明，不能超过 128 个字符
     * @param Remark 说明，不能超过 128 个字符
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 认证字段；
username-对应 MQTT CONNECT Packet 中 username 字段，
password-对应 MQTT CONNECT Packet 中 password 字段。

默认username 
     * @return From 认证字段；
username-对应 MQTT CONNECT Packet 中 username 字段，
password-对应 MQTT CONNECT Packet 中 password 字段。

默认username
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 认证字段；
username-对应 MQTT CONNECT Packet 中 username 字段，
password-对应 MQTT CONNECT Packet 中 password 字段。

默认username
     * @param From 认证字段；
username-对应 MQTT CONNECT Packet 中 username 字段，
password-对应 MQTT CONNECT Packet 中 password 字段。

默认username
     */
    public void setFrom(String From) {
        this.From = From;
    }

    public CreateJWKSAuthenticatorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateJWKSAuthenticatorRequest(CreateJWKSAuthenticatorRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.RefreshInterval != null) {
            this.RefreshInterval = new Long(source.RefreshInterval);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "RefreshInterval", this.RefreshInterval);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "From", this.From);

    }
}

