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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContractInfo extends AbstractModel{

    /**
    * 米大师内部签约商户号
    */
    @SerializedName("ChannelContractMerchantId")
    @Expose
    private String ChannelContractMerchantId;

    /**
    * 米大师内部签约子商户号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelContractSubMerchantId")
    @Expose
    private String ChannelContractSubMerchantId;

    /**
    * 米大师内部签约应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelContractAppId")
    @Expose
    private String ChannelContractAppId;

    /**
    * 米大师内部签约子应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelContractSubAppId")
    @Expose
    private String ChannelContractSubAppId;

    /**
    * 业务合约协议号
    */
    @SerializedName("OutContractCode")
    @Expose
    private String OutContractCode;

    /**
    * 第三方渠道用户信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalContractUserInfoList")
    @Expose
    private ExternalContractUserInfo [] ExternalContractUserInfoList;

    /**
    * 签约方式，如 wechat_app ，使用app方式下的微信签
    */
    @SerializedName("ContractMethod")
    @Expose
    private String ContractMethod;

    /**
    * 合约场景id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractSceneId")
    @Expose
    private String ContractSceneId;

    /**
    * 用户信息
    */
    @SerializedName("UserInfo")
    @Expose
    private ContractUserInfo UserInfo;

    /**
    * 第三方渠道签约数据
    */
    @SerializedName("ExternalContractData")
    @Expose
    private String ExternalContractData;

    /**
     * Get 米大师内部签约商户号 
     * @return ChannelContractMerchantId 米大师内部签约商户号
     */
    public String getChannelContractMerchantId() {
        return this.ChannelContractMerchantId;
    }

    /**
     * Set 米大师内部签约商户号
     * @param ChannelContractMerchantId 米大师内部签约商户号
     */
    public void setChannelContractMerchantId(String ChannelContractMerchantId) {
        this.ChannelContractMerchantId = ChannelContractMerchantId;
    }

    /**
     * Get 米大师内部签约子商户号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelContractSubMerchantId 米大师内部签约子商户号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelContractSubMerchantId() {
        return this.ChannelContractSubMerchantId;
    }

    /**
     * Set 米大师内部签约子商户号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelContractSubMerchantId 米大师内部签约子商户号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelContractSubMerchantId(String ChannelContractSubMerchantId) {
        this.ChannelContractSubMerchantId = ChannelContractSubMerchantId;
    }

    /**
     * Get 米大师内部签约应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelContractAppId 米大师内部签约应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelContractAppId() {
        return this.ChannelContractAppId;
    }

    /**
     * Set 米大师内部签约应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelContractAppId 米大师内部签约应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelContractAppId(String ChannelContractAppId) {
        this.ChannelContractAppId = ChannelContractAppId;
    }

    /**
     * Get 米大师内部签约子应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelContractSubAppId 米大师内部签约子应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelContractSubAppId() {
        return this.ChannelContractSubAppId;
    }

    /**
     * Set 米大师内部签约子应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelContractSubAppId 米大师内部签约子应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelContractSubAppId(String ChannelContractSubAppId) {
        this.ChannelContractSubAppId = ChannelContractSubAppId;
    }

    /**
     * Get 业务合约协议号 
     * @return OutContractCode 业务合约协议号
     */
    public String getOutContractCode() {
        return this.OutContractCode;
    }

    /**
     * Set 业务合约协议号
     * @param OutContractCode 业务合约协议号
     */
    public void setOutContractCode(String OutContractCode) {
        this.OutContractCode = OutContractCode;
    }

    /**
     * Get 第三方渠道用户信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalContractUserInfoList 第三方渠道用户信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExternalContractUserInfo [] getExternalContractUserInfoList() {
        return this.ExternalContractUserInfoList;
    }

    /**
     * Set 第三方渠道用户信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalContractUserInfoList 第三方渠道用户信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalContractUserInfoList(ExternalContractUserInfo [] ExternalContractUserInfoList) {
        this.ExternalContractUserInfoList = ExternalContractUserInfoList;
    }

    /**
     * Get 签约方式，如 wechat_app ，使用app方式下的微信签 
     * @return ContractMethod 签约方式，如 wechat_app ，使用app方式下的微信签
     */
    public String getContractMethod() {
        return this.ContractMethod;
    }

    /**
     * Set 签约方式，如 wechat_app ，使用app方式下的微信签
     * @param ContractMethod 签约方式，如 wechat_app ，使用app方式下的微信签
     */
    public void setContractMethod(String ContractMethod) {
        this.ContractMethod = ContractMethod;
    }

    /**
     * Get 合约场景id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractSceneId 合约场景id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractSceneId() {
        return this.ContractSceneId;
    }

    /**
     * Set 合约场景id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractSceneId 合约场景id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractSceneId(String ContractSceneId) {
        this.ContractSceneId = ContractSceneId;
    }

    /**
     * Get 用户信息 
     * @return UserInfo 用户信息
     */
    public ContractUserInfo getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set 用户信息
     * @param UserInfo 用户信息
     */
    public void setUserInfo(ContractUserInfo UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get 第三方渠道签约数据 
     * @return ExternalContractData 第三方渠道签约数据
     */
    public String getExternalContractData() {
        return this.ExternalContractData;
    }

    /**
     * Set 第三方渠道签约数据
     * @param ExternalContractData 第三方渠道签约数据
     */
    public void setExternalContractData(String ExternalContractData) {
        this.ExternalContractData = ExternalContractData;
    }

    public ContractInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContractInfo(ContractInfo source) {
        if (source.ChannelContractMerchantId != null) {
            this.ChannelContractMerchantId = new String(source.ChannelContractMerchantId);
        }
        if (source.ChannelContractSubMerchantId != null) {
            this.ChannelContractSubMerchantId = new String(source.ChannelContractSubMerchantId);
        }
        if (source.ChannelContractAppId != null) {
            this.ChannelContractAppId = new String(source.ChannelContractAppId);
        }
        if (source.ChannelContractSubAppId != null) {
            this.ChannelContractSubAppId = new String(source.ChannelContractSubAppId);
        }
        if (source.OutContractCode != null) {
            this.OutContractCode = new String(source.OutContractCode);
        }
        if (source.ExternalContractUserInfoList != null) {
            this.ExternalContractUserInfoList = new ExternalContractUserInfo[source.ExternalContractUserInfoList.length];
            for (int i = 0; i < source.ExternalContractUserInfoList.length; i++) {
                this.ExternalContractUserInfoList[i] = new ExternalContractUserInfo(source.ExternalContractUserInfoList[i]);
            }
        }
        if (source.ContractMethod != null) {
            this.ContractMethod = new String(source.ContractMethod);
        }
        if (source.ContractSceneId != null) {
            this.ContractSceneId = new String(source.ContractSceneId);
        }
        if (source.UserInfo != null) {
            this.UserInfo = new ContractUserInfo(source.UserInfo);
        }
        if (source.ExternalContractData != null) {
            this.ExternalContractData = new String(source.ExternalContractData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelContractMerchantId", this.ChannelContractMerchantId);
        this.setParamSimple(map, prefix + "ChannelContractSubMerchantId", this.ChannelContractSubMerchantId);
        this.setParamSimple(map, prefix + "ChannelContractAppId", this.ChannelContractAppId);
        this.setParamSimple(map, prefix + "ChannelContractSubAppId", this.ChannelContractSubAppId);
        this.setParamSimple(map, prefix + "OutContractCode", this.OutContractCode);
        this.setParamArrayObj(map, prefix + "ExternalContractUserInfoList.", this.ExternalContractUserInfoList);
        this.setParamSimple(map, prefix + "ContractMethod", this.ContractMethod);
        this.setParamSimple(map, prefix + "ContractSceneId", this.ContractSceneId);
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "ExternalContractData", this.ExternalContractData);

    }
}

