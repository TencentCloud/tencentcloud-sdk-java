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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtendAuthInfo extends AbstractModel {

    /**
    * 扩展服务的类型，可能是以下值：
<ul><li>OPEN_SERVER_SIGN：企业自动签署</li>
<li>BATCH_SIGN：批量签署</li>
<li>OVERSEA_SIGN：企业与港澳台居民签署合同</li>
<li>AGE_LIMIT_EXPANSION：拓宽签署方年龄限制</li>
<li>MOBILE_CHECK_APPROVER：个人签署方仅校验手机号</li>
<li>HIDE_OPERATOR_DISPLAY：隐藏合同经办人姓名</li>
<li>ORGANIZATION_OCR_FALLBACK：正楷临摹签名失败后更换其他签名类型</li>
<li>ORGANIZATION_FLOW_NOTIFY_TYPE：短信通知签署方</li>
<li>HIDE_ONE_KEY_SIGN：个人签署方手动签字</li>
<li>PAGING_SEAL：骑缝章</li>
<li>ORGANIZATION_FLOW_PASSWD_NOTIFY：签署密码开通引导</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 扩展服务的名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 扩展服务的开通状态：
<ul>
<li>ENABLE : 已开通</li>
<li>DISABLE : 未开通</li>
</ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 操作扩展服务的操作人UserId，员工在腾讯电子签平台的唯一身份标识，为32位字符串。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorUserId")
    @Expose
    private String OperatorUserId;

    /**
    * 扩展服务的操作时间，格式为Unix标准时间戳（秒）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateOn")
    @Expose
    private Long OperateOn;

    /**
    * 该扩展服务若可以授权，此参数对应授权人员的列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasAuthUserList")
    @Expose
    private HasAuthUser [] HasAuthUserList;

    /**
     * Get 扩展服务的类型，可能是以下值：
<ul><li>OPEN_SERVER_SIGN：企业自动签署</li>
<li>BATCH_SIGN：批量签署</li>
<li>OVERSEA_SIGN：企业与港澳台居民签署合同</li>
<li>AGE_LIMIT_EXPANSION：拓宽签署方年龄限制</li>
<li>MOBILE_CHECK_APPROVER：个人签署方仅校验手机号</li>
<li>HIDE_OPERATOR_DISPLAY：隐藏合同经办人姓名</li>
<li>ORGANIZATION_OCR_FALLBACK：正楷临摹签名失败后更换其他签名类型</li>
<li>ORGANIZATION_FLOW_NOTIFY_TYPE：短信通知签署方</li>
<li>HIDE_ONE_KEY_SIGN：个人签署方手动签字</li>
<li>PAGING_SEAL：骑缝章</li>
<li>ORGANIZATION_FLOW_PASSWD_NOTIFY：签署密码开通引导</li></ul> 
     * @return Type 扩展服务的类型，可能是以下值：
<ul><li>OPEN_SERVER_SIGN：企业自动签署</li>
<li>BATCH_SIGN：批量签署</li>
<li>OVERSEA_SIGN：企业与港澳台居民签署合同</li>
<li>AGE_LIMIT_EXPANSION：拓宽签署方年龄限制</li>
<li>MOBILE_CHECK_APPROVER：个人签署方仅校验手机号</li>
<li>HIDE_OPERATOR_DISPLAY：隐藏合同经办人姓名</li>
<li>ORGANIZATION_OCR_FALLBACK：正楷临摹签名失败后更换其他签名类型</li>
<li>ORGANIZATION_FLOW_NOTIFY_TYPE：短信通知签署方</li>
<li>HIDE_ONE_KEY_SIGN：个人签署方手动签字</li>
<li>PAGING_SEAL：骑缝章</li>
<li>ORGANIZATION_FLOW_PASSWD_NOTIFY：签署密码开通引导</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 扩展服务的类型，可能是以下值：
<ul><li>OPEN_SERVER_SIGN：企业自动签署</li>
<li>BATCH_SIGN：批量签署</li>
<li>OVERSEA_SIGN：企业与港澳台居民签署合同</li>
<li>AGE_LIMIT_EXPANSION：拓宽签署方年龄限制</li>
<li>MOBILE_CHECK_APPROVER：个人签署方仅校验手机号</li>
<li>HIDE_OPERATOR_DISPLAY：隐藏合同经办人姓名</li>
<li>ORGANIZATION_OCR_FALLBACK：正楷临摹签名失败后更换其他签名类型</li>
<li>ORGANIZATION_FLOW_NOTIFY_TYPE：短信通知签署方</li>
<li>HIDE_ONE_KEY_SIGN：个人签署方手动签字</li>
<li>PAGING_SEAL：骑缝章</li>
<li>ORGANIZATION_FLOW_PASSWD_NOTIFY：签署密码开通引导</li></ul>
     * @param Type 扩展服务的类型，可能是以下值：
<ul><li>OPEN_SERVER_SIGN：企业自动签署</li>
<li>BATCH_SIGN：批量签署</li>
<li>OVERSEA_SIGN：企业与港澳台居民签署合同</li>
<li>AGE_LIMIT_EXPANSION：拓宽签署方年龄限制</li>
<li>MOBILE_CHECK_APPROVER：个人签署方仅校验手机号</li>
<li>HIDE_OPERATOR_DISPLAY：隐藏合同经办人姓名</li>
<li>ORGANIZATION_OCR_FALLBACK：正楷临摹签名失败后更换其他签名类型</li>
<li>ORGANIZATION_FLOW_NOTIFY_TYPE：短信通知签署方</li>
<li>HIDE_ONE_KEY_SIGN：个人签署方手动签字</li>
<li>PAGING_SEAL：骑缝章</li>
<li>ORGANIZATION_FLOW_PASSWD_NOTIFY：签署密码开通引导</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 扩展服务的名称 
     * @return Name 扩展服务的名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 扩展服务的名称
     * @param Name 扩展服务的名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 扩展服务的开通状态：
<ul>
<li>ENABLE : 已开通</li>
<li>DISABLE : 未开通</li>
</ul> 
     * @return Status 扩展服务的开通状态：
<ul>
<li>ENABLE : 已开通</li>
<li>DISABLE : 未开通</li>
</ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 扩展服务的开通状态：
<ul>
<li>ENABLE : 已开通</li>
<li>DISABLE : 未开通</li>
</ul>
     * @param Status 扩展服务的开通状态：
<ul>
<li>ENABLE : 已开通</li>
<li>DISABLE : 未开通</li>
</ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 操作扩展服务的操作人UserId，员工在腾讯电子签平台的唯一身份标识，为32位字符串。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorUserId 操作扩展服务的操作人UserId，员工在腾讯电子签平台的唯一身份标识，为32位字符串。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorUserId() {
        return this.OperatorUserId;
    }

    /**
     * Set 操作扩展服务的操作人UserId，员工在腾讯电子签平台的唯一身份标识，为32位字符串。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorUserId 操作扩展服务的操作人UserId，员工在腾讯电子签平台的唯一身份标识，为32位字符串。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorUserId(String OperatorUserId) {
        this.OperatorUserId = OperatorUserId;
    }

    /**
     * Get 扩展服务的操作时间，格式为Unix标准时间戳（秒）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateOn 扩展服务的操作时间，格式为Unix标准时间戳（秒）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOperateOn() {
        return this.OperateOn;
    }

    /**
     * Set 扩展服务的操作时间，格式为Unix标准时间戳（秒）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateOn 扩展服务的操作时间，格式为Unix标准时间戳（秒）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateOn(Long OperateOn) {
        this.OperateOn = OperateOn;
    }

    /**
     * Get 该扩展服务若可以授权，此参数对应授权人员的列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasAuthUserList 该扩展服务若可以授权，此参数对应授权人员的列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HasAuthUser [] getHasAuthUserList() {
        return this.HasAuthUserList;
    }

    /**
     * Set 该扩展服务若可以授权，此参数对应授权人员的列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasAuthUserList 该扩展服务若可以授权，此参数对应授权人员的列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasAuthUserList(HasAuthUser [] HasAuthUserList) {
        this.HasAuthUserList = HasAuthUserList;
    }

    public ExtendAuthInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtendAuthInfo(ExtendAuthInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.OperatorUserId != null) {
            this.OperatorUserId = new String(source.OperatorUserId);
        }
        if (source.OperateOn != null) {
            this.OperateOn = new Long(source.OperateOn);
        }
        if (source.HasAuthUserList != null) {
            this.HasAuthUserList = new HasAuthUser[source.HasAuthUserList.length];
            for (int i = 0; i < source.HasAuthUserList.length; i++) {
                this.HasAuthUserList[i] = new HasAuthUser(source.HasAuthUserList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OperatorUserId", this.OperatorUserId);
        this.setParamSimple(map, prefix + "OperateOn", this.OperateOn);
        this.setParamArrayObj(map, prefix + "HasAuthUserList.", this.HasAuthUserList);

    }
}

