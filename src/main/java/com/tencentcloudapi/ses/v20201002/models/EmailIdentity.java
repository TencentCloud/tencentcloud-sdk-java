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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmailIdentity extends AbstractModel {

    /**
    * <p>发信域名</p>
    */
    @SerializedName("IdentityName")
    @Expose
    private String IdentityName;

    /**
    * <p>验证类型，固定为DOMAIN</p>
    */
    @SerializedName("IdentityType")
    @Expose
    private String IdentityType;

    /**
    * <p>是否已通过验证</p>
    */
    @SerializedName("SendingEnabled")
    @Expose
    private Boolean SendingEnabled;

    /**
    * <p>当前信誉等级</p>
    */
    @SerializedName("CurrentReputationLevel")
    @Expose
    private Long CurrentReputationLevel;

    /**
    * <p>当日最高发信量</p>
    */
    @SerializedName("DailyQuota")
    @Expose
    private Long DailyQuota;

    /**
    * <p>域名配置的独立ip</p>
    */
    @SerializedName("SendIp")
    @Expose
    private String [] SendIp;

    /**
    * <p>tag 标签</p>
    */
    @SerializedName("TagList")
    @Expose
    private TagList [] TagList;

    /**
    * <p>dkim位数</p><p>枚举值：</p><ul><li>0： 1024</li><li>1： 2048</li><li>2： 双签</li></ul><p>默认值：0</p>
    */
    @SerializedName("DKIMOption")
    @Expose
    private Long DKIMOption;

    /**
     * Get <p>发信域名</p> 
     * @return IdentityName <p>发信域名</p>
     */
    public String getIdentityName() {
        return this.IdentityName;
    }

    /**
     * Set <p>发信域名</p>
     * @param IdentityName <p>发信域名</p>
     */
    public void setIdentityName(String IdentityName) {
        this.IdentityName = IdentityName;
    }

    /**
     * Get <p>验证类型，固定为DOMAIN</p> 
     * @return IdentityType <p>验证类型，固定为DOMAIN</p>
     */
    public String getIdentityType() {
        return this.IdentityType;
    }

    /**
     * Set <p>验证类型，固定为DOMAIN</p>
     * @param IdentityType <p>验证类型，固定为DOMAIN</p>
     */
    public void setIdentityType(String IdentityType) {
        this.IdentityType = IdentityType;
    }

    /**
     * Get <p>是否已通过验证</p> 
     * @return SendingEnabled <p>是否已通过验证</p>
     */
    public Boolean getSendingEnabled() {
        return this.SendingEnabled;
    }

    /**
     * Set <p>是否已通过验证</p>
     * @param SendingEnabled <p>是否已通过验证</p>
     */
    public void setSendingEnabled(Boolean SendingEnabled) {
        this.SendingEnabled = SendingEnabled;
    }

    /**
     * Get <p>当前信誉等级</p> 
     * @return CurrentReputationLevel <p>当前信誉等级</p>
     */
    public Long getCurrentReputationLevel() {
        return this.CurrentReputationLevel;
    }

    /**
     * Set <p>当前信誉等级</p>
     * @param CurrentReputationLevel <p>当前信誉等级</p>
     */
    public void setCurrentReputationLevel(Long CurrentReputationLevel) {
        this.CurrentReputationLevel = CurrentReputationLevel;
    }

    /**
     * Get <p>当日最高发信量</p> 
     * @return DailyQuota <p>当日最高发信量</p>
     */
    public Long getDailyQuota() {
        return this.DailyQuota;
    }

    /**
     * Set <p>当日最高发信量</p>
     * @param DailyQuota <p>当日最高发信量</p>
     */
    public void setDailyQuota(Long DailyQuota) {
        this.DailyQuota = DailyQuota;
    }

    /**
     * Get <p>域名配置的独立ip</p> 
     * @return SendIp <p>域名配置的独立ip</p>
     */
    public String [] getSendIp() {
        return this.SendIp;
    }

    /**
     * Set <p>域名配置的独立ip</p>
     * @param SendIp <p>域名配置的独立ip</p>
     */
    public void setSendIp(String [] SendIp) {
        this.SendIp = SendIp;
    }

    /**
     * Get <p>tag 标签</p> 
     * @return TagList <p>tag 标签</p>
     */
    public TagList [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>tag 标签</p>
     * @param TagList <p>tag 标签</p>
     */
    public void setTagList(TagList [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>dkim位数</p><p>枚举值：</p><ul><li>0： 1024</li><li>1： 2048</li><li>2： 双签</li></ul><p>默认值：0</p> 
     * @return DKIMOption <p>dkim位数</p><p>枚举值：</p><ul><li>0： 1024</li><li>1： 2048</li><li>2： 双签</li></ul><p>默认值：0</p>
     */
    public Long getDKIMOption() {
        return this.DKIMOption;
    }

    /**
     * Set <p>dkim位数</p><p>枚举值：</p><ul><li>0： 1024</li><li>1： 2048</li><li>2： 双签</li></ul><p>默认值：0</p>
     * @param DKIMOption <p>dkim位数</p><p>枚举值：</p><ul><li>0： 1024</li><li>1： 2048</li><li>2： 双签</li></ul><p>默认值：0</p>
     */
    public void setDKIMOption(Long DKIMOption) {
        this.DKIMOption = DKIMOption;
    }

    public EmailIdentity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmailIdentity(EmailIdentity source) {
        if (source.IdentityName != null) {
            this.IdentityName = new String(source.IdentityName);
        }
        if (source.IdentityType != null) {
            this.IdentityType = new String(source.IdentityType);
        }
        if (source.SendingEnabled != null) {
            this.SendingEnabled = new Boolean(source.SendingEnabled);
        }
        if (source.CurrentReputationLevel != null) {
            this.CurrentReputationLevel = new Long(source.CurrentReputationLevel);
        }
        if (source.DailyQuota != null) {
            this.DailyQuota = new Long(source.DailyQuota);
        }
        if (source.SendIp != null) {
            this.SendIp = new String[source.SendIp.length];
            for (int i = 0; i < source.SendIp.length; i++) {
                this.SendIp[i] = new String(source.SendIp[i]);
            }
        }
        if (source.TagList != null) {
            this.TagList = new TagList[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagList(source.TagList[i]);
            }
        }
        if (source.DKIMOption != null) {
            this.DKIMOption = new Long(source.DKIMOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentityName", this.IdentityName);
        this.setParamSimple(map, prefix + "IdentityType", this.IdentityType);
        this.setParamSimple(map, prefix + "SendingEnabled", this.SendingEnabled);
        this.setParamSimple(map, prefix + "CurrentReputationLevel", this.CurrentReputationLevel);
        this.setParamSimple(map, prefix + "DailyQuota", this.DailyQuota);
        this.setParamArraySimple(map, prefix + "SendIp.", this.SendIp);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "DKIMOption", this.DKIMOption);

    }
}

