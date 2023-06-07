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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtentServiceAuthInfo extends AbstractModel{

    /**
    * 扩展服务类型
  AUTO_SIGN             企业静默签（自动签署）
  OVERSEA_SIGN          企业与港澳台居民*签署合同
  MOBILE_CHECK_APPROVER 使用手机号验证签署方身份
  PAGING_SEAL           骑缝章
  DOWNLOAD_FLOW         授权平台企业下载合同 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 扩展服务名称 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 服务状态 
ENABLE 开启 
DISABLE 关闭
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 最近操作人第三方应用平台的用户openid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorOpenId")
    @Expose
    private String OperatorOpenId;

    /**
    * 最近操作时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateOn")
    @Expose
    private Long OperateOn;

    /**
     * Get 扩展服务类型
  AUTO_SIGN             企业静默签（自动签署）
  OVERSEA_SIGN          企业与港澳台居民*签署合同
  MOBILE_CHECK_APPROVER 使用手机号验证签署方身份
  PAGING_SEAL           骑缝章
  DOWNLOAD_FLOW         授权平台企业下载合同  
     * @return Type 扩展服务类型
  AUTO_SIGN             企业静默签（自动签署）
  OVERSEA_SIGN          企业与港澳台居民*签署合同
  MOBILE_CHECK_APPROVER 使用手机号验证签署方身份
  PAGING_SEAL           骑缝章
  DOWNLOAD_FLOW         授权平台企业下载合同 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 扩展服务类型
  AUTO_SIGN             企业静默签（自动签署）
  OVERSEA_SIGN          企业与港澳台居民*签署合同
  MOBILE_CHECK_APPROVER 使用手机号验证签署方身份
  PAGING_SEAL           骑缝章
  DOWNLOAD_FLOW         授权平台企业下载合同 
     * @param Type 扩展服务类型
  AUTO_SIGN             企业静默签（自动签署）
  OVERSEA_SIGN          企业与港澳台居民*签署合同
  MOBILE_CHECK_APPROVER 使用手机号验证签署方身份
  PAGING_SEAL           骑缝章
  DOWNLOAD_FLOW         授权平台企业下载合同 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 扩展服务名称  
     * @return Name 扩展服务名称 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 扩展服务名称 
     * @param Name 扩展服务名称 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 服务状态 
ENABLE 开启 
DISABLE 关闭 
     * @return Status 服务状态 
ENABLE 开启 
DISABLE 关闭
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 服务状态 
ENABLE 开启 
DISABLE 关闭
     * @param Status 服务状态 
ENABLE 开启 
DISABLE 关闭
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 最近操作人第三方应用平台的用户openid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorOpenId 最近操作人第三方应用平台的用户openid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorOpenId() {
        return this.OperatorOpenId;
    }

    /**
     * Set 最近操作人第三方应用平台的用户openid
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorOpenId 最近操作人第三方应用平台的用户openid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorOpenId(String OperatorOpenId) {
        this.OperatorOpenId = OperatorOpenId;
    }

    /**
     * Get 最近操作时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateOn 最近操作时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOperateOn() {
        return this.OperateOn;
    }

    /**
     * Set 最近操作时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateOn 最近操作时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
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

