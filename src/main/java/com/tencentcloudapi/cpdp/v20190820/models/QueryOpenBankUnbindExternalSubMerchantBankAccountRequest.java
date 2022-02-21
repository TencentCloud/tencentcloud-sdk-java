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

public class QueryOpenBankUnbindExternalSubMerchantBankAccountRequest extends AbstractModel{

    /**
    * 渠道子商户ID。
    */
    @SerializedName("ChannelSubMerchantId")
    @Expose
    private String ChannelSubMerchantId;

    /**
    * 渠道商户ID。
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 渠道申请编号，与外部申请编号二者选填其一。
    */
    @SerializedName("ChannelApplyId")
    @Expose
    private String ChannelApplyId;

    /**
    * 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * 外部申请编号，与渠道申请编号二者选填其一。
    */
    @SerializedName("OutApplyId")
    @Expose
    private String OutApplyId;

    /**
     * Get 渠道子商户ID。 
     * @return ChannelSubMerchantId 渠道子商户ID。
     */
    public String getChannelSubMerchantId() {
        return this.ChannelSubMerchantId;
    }

    /**
     * Set 渠道子商户ID。
     * @param ChannelSubMerchantId 渠道子商户ID。
     */
    public void setChannelSubMerchantId(String ChannelSubMerchantId) {
        this.ChannelSubMerchantId = ChannelSubMerchantId;
    }

    /**
     * Get 渠道商户ID。 
     * @return ChannelMerchantId 渠道商户ID。
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 渠道商户ID。
     * @param ChannelMerchantId 渠道商户ID。
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 渠道申请编号，与外部申请编号二者选填其一。 
     * @return ChannelApplyId 渠道申请编号，与外部申请编号二者选填其一。
     */
    public String getChannelApplyId() {
        return this.ChannelApplyId;
    }

    /**
     * Set 渠道申请编号，与外部申请编号二者选填其一。
     * @param ChannelApplyId 渠道申请编号，与外部申请编号二者选填其一。
     */
    public void setChannelApplyId(String ChannelApplyId) {
        this.ChannelApplyId = ChannelApplyId;
    }

    /**
     * Get 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_ 
     * @return Environment 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     * @param Environment 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get 外部申请编号，与渠道申请编号二者选填其一。 
     * @return OutApplyId 外部申请编号，与渠道申请编号二者选填其一。
     */
    public String getOutApplyId() {
        return this.OutApplyId;
    }

    /**
     * Set 外部申请编号，与渠道申请编号二者选填其一。
     * @param OutApplyId 外部申请编号，与渠道申请编号二者选填其一。
     */
    public void setOutApplyId(String OutApplyId) {
        this.OutApplyId = OutApplyId;
    }

    public QueryOpenBankUnbindExternalSubMerchantBankAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankUnbindExternalSubMerchantBankAccountRequest(QueryOpenBankUnbindExternalSubMerchantBankAccountRequest source) {
        if (source.ChannelSubMerchantId != null) {
            this.ChannelSubMerchantId = new String(source.ChannelSubMerchantId);
        }
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.ChannelApplyId != null) {
            this.ChannelApplyId = new String(source.ChannelApplyId);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.OutApplyId != null) {
            this.OutApplyId = new String(source.OutApplyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelSubMerchantId", this.ChannelSubMerchantId);
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "ChannelApplyId", this.ChannelApplyId);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamSimple(map, prefix + "OutApplyId", this.OutApplyId);

    }
}

