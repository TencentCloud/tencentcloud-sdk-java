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

public class ExtendAuthInfo extends AbstractModel{

    /**
    * 授权服务类型
OPEN_SERVER_SIGN：开通企业静默签署
OVERSEA_SIGN：企业与港澳台居民签署合同
MOBILE_CHECK_APPROVER：使用手机号验证签署方身份
PAGING_SEAL：骑缝章
BATCH_SIGN：批量签署
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 授权服务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 授权服务状态，ENABLE：开通
DISABLE：未开通
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 授权人用户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorUserId")
    @Expose
    private String OperatorUserId;

    /**
    * 授权时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateOn")
    @Expose
    private Long OperateOn;

    /**
    * 被授权用户列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasAuthUserList")
    @Expose
    private HasAuthUser [] HasAuthUserList;

    /**
     * Get 授权服务类型
OPEN_SERVER_SIGN：开通企业静默签署
OVERSEA_SIGN：企业与港澳台居民签署合同
MOBILE_CHECK_APPROVER：使用手机号验证签署方身份
PAGING_SEAL：骑缝章
BATCH_SIGN：批量签署 
     * @return Type 授权服务类型
OPEN_SERVER_SIGN：开通企业静默签署
OVERSEA_SIGN：企业与港澳台居民签署合同
MOBILE_CHECK_APPROVER：使用手机号验证签署方身份
PAGING_SEAL：骑缝章
BATCH_SIGN：批量签署
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 授权服务类型
OPEN_SERVER_SIGN：开通企业静默签署
OVERSEA_SIGN：企业与港澳台居民签署合同
MOBILE_CHECK_APPROVER：使用手机号验证签署方身份
PAGING_SEAL：骑缝章
BATCH_SIGN：批量签署
     * @param Type 授权服务类型
OPEN_SERVER_SIGN：开通企业静默签署
OVERSEA_SIGN：企业与港澳台居民签署合同
MOBILE_CHECK_APPROVER：使用手机号验证签署方身份
PAGING_SEAL：骑缝章
BATCH_SIGN：批量签署
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 授权服务名称 
     * @return Name 授权服务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 授权服务名称
     * @param Name 授权服务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 授权服务状态，ENABLE：开通
DISABLE：未开通 
     * @return Status 授权服务状态，ENABLE：开通
DISABLE：未开通
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 授权服务状态，ENABLE：开通
DISABLE：未开通
     * @param Status 授权服务状态，ENABLE：开通
DISABLE：未开通
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 授权人用户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorUserId 授权人用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorUserId() {
        return this.OperatorUserId;
    }

    /**
     * Set 授权人用户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorUserId 授权人用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorUserId(String OperatorUserId) {
        this.OperatorUserId = OperatorUserId;
    }

    /**
     * Get 授权时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateOn 授权时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOperateOn() {
        return this.OperateOn;
    }

    /**
     * Set 授权时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateOn 授权时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateOn(Long OperateOn) {
        this.OperateOn = OperateOn;
    }

    /**
     * Get 被授权用户列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasAuthUserList 被授权用户列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HasAuthUser [] getHasAuthUserList() {
        return this.HasAuthUserList;
    }

    /**
     * Set 被授权用户列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasAuthUserList 被授权用户列表
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

