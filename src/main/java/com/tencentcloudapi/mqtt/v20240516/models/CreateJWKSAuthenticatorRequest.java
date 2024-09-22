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

public class CreateJWKSAuthenticatorRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * jwks端点
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * jwks刷新间隔,单位：秒
    */
    @SerializedName("RefreshInterval")
    @Expose
    private Long RefreshInterval;

    /**
    * jwks文本
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 认证器是否开启：open-启用；close-关闭
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 说明
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 设备连接时传递jwt的key；username-使用用户名字段传递；password-使用密码字段传递
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get jwks端点 
     * @return Endpoint jwks端点
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set jwks端点
     * @param Endpoint jwks端点
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get jwks刷新间隔,单位：秒 
     * @return RefreshInterval jwks刷新间隔,单位：秒
     */
    public Long getRefreshInterval() {
        return this.RefreshInterval;
    }

    /**
     * Set jwks刷新间隔,单位：秒
     * @param RefreshInterval jwks刷新间隔,单位：秒
     */
    public void setRefreshInterval(Long RefreshInterval) {
        this.RefreshInterval = RefreshInterval;
    }

    /**
     * Get jwks文本 
     * @return Text jwks文本
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set jwks文本
     * @param Text jwks文本
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 认证器是否开启：open-启用；close-关闭 
     * @return Status 认证器是否开启：open-启用；close-关闭
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 认证器是否开启：open-启用；close-关闭
     * @param Status 认证器是否开启：open-启用；close-关闭
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 说明 
     * @return Remark 说明
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明
     * @param Remark 说明
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 设备连接时传递jwt的key；username-使用用户名字段传递；password-使用密码字段传递 
     * @return From 设备连接时传递jwt的key；username-使用用户名字段传递；password-使用密码字段传递
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 设备连接时传递jwt的key；username-使用用户名字段传递；password-使用密码字段传递
     * @param From 设备连接时传递jwt的key；username-使用用户名字段传递；password-使用密码字段传递
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

