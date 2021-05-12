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
package com.tencentcloudapi.aa.v20200224.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OnlineScamInfo extends AbstractModel{

    /**
    * 内容标签。
    */
    @SerializedName("ContentLabel")
    @Expose
    private String ContentLabel;

    /**
    * 内容风险等级：
0：正常。
1：可疑。
    */
    @SerializedName("ContentRiskLevel")
    @Expose
    private Long ContentRiskLevel;

    /**
    * 内容产生形式：
0：对话。
1：广播。
    */
    @SerializedName("ContentType")
    @Expose
    private Long ContentType;

    /**
    * 诈骗账号类型：
1：11位手机号。
2：QQ账号。
    */
    @SerializedName("FraudType")
    @Expose
    private Long FraudType;

    /**
    * 诈骗账号，手机号或QQ账号。
    */
    @SerializedName("FraudAccount")
    @Expose
    private String FraudAccount;

    /**
     * Get 内容标签。 
     * @return ContentLabel 内容标签。
     */
    public String getContentLabel() {
        return this.ContentLabel;
    }

    /**
     * Set 内容标签。
     * @param ContentLabel 内容标签。
     */
    public void setContentLabel(String ContentLabel) {
        this.ContentLabel = ContentLabel;
    }

    /**
     * Get 内容风险等级：
0：正常。
1：可疑。 
     * @return ContentRiskLevel 内容风险等级：
0：正常。
1：可疑。
     */
    public Long getContentRiskLevel() {
        return this.ContentRiskLevel;
    }

    /**
     * Set 内容风险等级：
0：正常。
1：可疑。
     * @param ContentRiskLevel 内容风险等级：
0：正常。
1：可疑。
     */
    public void setContentRiskLevel(Long ContentRiskLevel) {
        this.ContentRiskLevel = ContentRiskLevel;
    }

    /**
     * Get 内容产生形式：
0：对话。
1：广播。 
     * @return ContentType 内容产生形式：
0：对话。
1：广播。
     */
    public Long getContentType() {
        return this.ContentType;
    }

    /**
     * Set 内容产生形式：
0：对话。
1：广播。
     * @param ContentType 内容产生形式：
0：对话。
1：广播。
     */
    public void setContentType(Long ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 诈骗账号类型：
1：11位手机号。
2：QQ账号。 
     * @return FraudType 诈骗账号类型：
1：11位手机号。
2：QQ账号。
     */
    public Long getFraudType() {
        return this.FraudType;
    }

    /**
     * Set 诈骗账号类型：
1：11位手机号。
2：QQ账号。
     * @param FraudType 诈骗账号类型：
1：11位手机号。
2：QQ账号。
     */
    public void setFraudType(Long FraudType) {
        this.FraudType = FraudType;
    }

    /**
     * Get 诈骗账号，手机号或QQ账号。 
     * @return FraudAccount 诈骗账号，手机号或QQ账号。
     */
    public String getFraudAccount() {
        return this.FraudAccount;
    }

    /**
     * Set 诈骗账号，手机号或QQ账号。
     * @param FraudAccount 诈骗账号，手机号或QQ账号。
     */
    public void setFraudAccount(String FraudAccount) {
        this.FraudAccount = FraudAccount;
    }

    public OnlineScamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OnlineScamInfo(OnlineScamInfo source) {
        if (source.ContentLabel != null) {
            this.ContentLabel = new String(source.ContentLabel);
        }
        if (source.ContentRiskLevel != null) {
            this.ContentRiskLevel = new Long(source.ContentRiskLevel);
        }
        if (source.ContentType != null) {
            this.ContentType = new Long(source.ContentType);
        }
        if (source.FraudType != null) {
            this.FraudType = new Long(source.FraudType);
        }
        if (source.FraudAccount != null) {
            this.FraudAccount = new String(source.FraudAccount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContentLabel", this.ContentLabel);
        this.setParamSimple(map, prefix + "ContentRiskLevel", this.ContentRiskLevel);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "FraudType", this.FraudType);
        this.setParamSimple(map, prefix + "FraudAccount", this.FraudAccount);

    }
}

