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

public class ModifyJWKSAuthenticatorRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 端点
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 认证器状态：open-启用；close-关闭
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 刷新时间
    */
    @SerializedName("RefreshInterval")
    @Expose
    private Long RefreshInterval;

    /**
    * JSKS文本
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 设备连接时传递jwt的key；username-使用用户名字段传递；password-使用密码字段传递
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 说明
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

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
     * Get 端点 
     * @return Endpoint 端点
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 端点
     * @param Endpoint 端点
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 认证器状态：open-启用；close-关闭 
     * @return Status 认证器状态：open-启用；close-关闭
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 认证器状态：open-启用；close-关闭
     * @param Status 认证器状态：open-启用；close-关闭
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 刷新时间 
     * @return RefreshInterval 刷新时间
     */
    public Long getRefreshInterval() {
        return this.RefreshInterval;
    }

    /**
     * Set 刷新时间
     * @param RefreshInterval 刷新时间
     */
    public void setRefreshInterval(Long RefreshInterval) {
        this.RefreshInterval = RefreshInterval;
    }

    /**
     * Get JSKS文本 
     * @return Text JSKS文本
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set JSKS文本
     * @param Text JSKS文本
     */
    public void setText(String Text) {
        this.Text = Text;
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

    public ModifyJWKSAuthenticatorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyJWKSAuthenticatorRequest(ModifyJWKSAuthenticatorRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RefreshInterval != null) {
            this.RefreshInterval = new Long(source.RefreshInterval);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.From != null) {
            this.From = new String(source.From);
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
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RefreshInterval", this.RefreshInterval);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

