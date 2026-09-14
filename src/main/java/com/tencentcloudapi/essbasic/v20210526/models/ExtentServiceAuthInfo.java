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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtentServiceAuthInfo extends AbstractModel {

    /**
    * <p>扩展服务类型<ul><li>AUTO_SIGN             企业“授权签”（“授权签”）</li><li>  OVERSEA_SIGN          企业与港澳台居民签署合同</li><li>  MOBILE_CHECK_APPROVER 使用手机号验证签署方身份</li><li> DOWNLOAD_FLOW         授权渠道下载合同 </li><li>AGE_LIMIT_EXPANSION 拓宽签署方年龄限制</li><li>HIDE_OPERATOR_DISPLAY 隐藏合同经办人姓名</li></ul></p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>扩展服务名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>扩展服务的开通状态<br><strong>ENABLE</strong>：开通<br><strong>DISABLE</strong>：未开通</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>操作扩展服务的操作人第三方应用平台的用户openid</p>
    */
    @SerializedName("OperatorOpenId")
    @Expose
    private String OperatorOpenId;

    /**
    * <p>扩展服务的操作时间，格式为Unix标准时间戳（秒）。</p>
    */
    @SerializedName("OperateOn")
    @Expose
    private Long OperateOn;

    /**
     * Get <p>扩展服务类型<ul><li>AUTO_SIGN             企业“授权签”（“授权签”）</li><li>  OVERSEA_SIGN          企业与港澳台居民签署合同</li><li>  MOBILE_CHECK_APPROVER 使用手机号验证签署方身份</li><li> DOWNLOAD_FLOW         授权渠道下载合同 </li><li>AGE_LIMIT_EXPANSION 拓宽签署方年龄限制</li><li>HIDE_OPERATOR_DISPLAY 隐藏合同经办人姓名</li></ul></p> 
     * @return Type <p>扩展服务类型<ul><li>AUTO_SIGN             企业“授权签”（“授权签”）</li><li>  OVERSEA_SIGN          企业与港澳台居民签署合同</li><li>  MOBILE_CHECK_APPROVER 使用手机号验证签署方身份</li><li> DOWNLOAD_FLOW         授权渠道下载合同 </li><li>AGE_LIMIT_EXPANSION 拓宽签署方年龄限制</li><li>HIDE_OPERATOR_DISPLAY 隐藏合同经办人姓名</li></ul></p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>扩展服务类型<ul><li>AUTO_SIGN             企业“授权签”（“授权签”）</li><li>  OVERSEA_SIGN          企业与港澳台居民签署合同</li><li>  MOBILE_CHECK_APPROVER 使用手机号验证签署方身份</li><li> DOWNLOAD_FLOW         授权渠道下载合同 </li><li>AGE_LIMIT_EXPANSION 拓宽签署方年龄限制</li><li>HIDE_OPERATOR_DISPLAY 隐藏合同经办人姓名</li></ul></p>
     * @param Type <p>扩展服务类型<ul><li>AUTO_SIGN             企业“授权签”（“授权签”）</li><li>  OVERSEA_SIGN          企业与港澳台居民签署合同</li><li>  MOBILE_CHECK_APPROVER 使用手机号验证签署方身份</li><li> DOWNLOAD_FLOW         授权渠道下载合同 </li><li>AGE_LIMIT_EXPANSION 拓宽签署方年龄限制</li><li>HIDE_OPERATOR_DISPLAY 隐藏合同经办人姓名</li></ul></p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>扩展服务名称</p> 
     * @return Name <p>扩展服务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>扩展服务名称</p>
     * @param Name <p>扩展服务名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>扩展服务的开通状态<br><strong>ENABLE</strong>：开通<br><strong>DISABLE</strong>：未开通</p> 
     * @return Status <p>扩展服务的开通状态<br><strong>ENABLE</strong>：开通<br><strong>DISABLE</strong>：未开通</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>扩展服务的开通状态<br><strong>ENABLE</strong>：开通<br><strong>DISABLE</strong>：未开通</p>
     * @param Status <p>扩展服务的开通状态<br><strong>ENABLE</strong>：开通<br><strong>DISABLE</strong>：未开通</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>操作扩展服务的操作人第三方应用平台的用户openid</p> 
     * @return OperatorOpenId <p>操作扩展服务的操作人第三方应用平台的用户openid</p>
     */
    public String getOperatorOpenId() {
        return this.OperatorOpenId;
    }

    /**
     * Set <p>操作扩展服务的操作人第三方应用平台的用户openid</p>
     * @param OperatorOpenId <p>操作扩展服务的操作人第三方应用平台的用户openid</p>
     */
    public void setOperatorOpenId(String OperatorOpenId) {
        this.OperatorOpenId = OperatorOpenId;
    }

    /**
     * Get <p>扩展服务的操作时间，格式为Unix标准时间戳（秒）。</p> 
     * @return OperateOn <p>扩展服务的操作时间，格式为Unix标准时间戳（秒）。</p>
     */
    public Long getOperateOn() {
        return this.OperateOn;
    }

    /**
     * Set <p>扩展服务的操作时间，格式为Unix标准时间戳（秒）。</p>
     * @param OperateOn <p>扩展服务的操作时间，格式为Unix标准时间戳（秒）。</p>
     */
    public void setOperateOn(Long OperateOn) {
        this.OperateOn = OperateOn;
    }

    public ExtentServiceAuthInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtentServiceAuthInfo(ExtentServiceAuthInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.OperatorOpenId != null) {
            this.OperatorOpenId = new String(source.OperatorOpenId);
        }
        if (source.OperateOn != null) {
            this.OperateOn = new Long(source.OperateOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OperatorOpenId", this.OperatorOpenId);
        this.setParamSimple(map, prefix + "OperateOn", this.OperateOn);

    }
}

