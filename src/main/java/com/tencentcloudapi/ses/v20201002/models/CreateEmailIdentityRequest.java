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

public class CreateEmailIdentityRequest extends AbstractModel {

    /**
    * 您的发信域名，建议使用三级以上域名。例如：mail.qcloud.com。
    */
    @SerializedName("EmailIdentity")
    @Expose
    private String EmailIdentity;

    /**
    * 生成的dkim密钥长度。0:1024，1:2048
    */
    @SerializedName("DKIMOption")
    @Expose
    private Long DKIMOption;

    /**
    * tag 标签
    */
    @SerializedName("TagList")
    @Expose
    private TagList [] TagList;

    /**
     * Get 您的发信域名，建议使用三级以上域名。例如：mail.qcloud.com。 
     * @return EmailIdentity 您的发信域名，建议使用三级以上域名。例如：mail.qcloud.com。
     */
    public String getEmailIdentity() {
        return this.EmailIdentity;
    }

    /**
     * Set 您的发信域名，建议使用三级以上域名。例如：mail.qcloud.com。
     * @param EmailIdentity 您的发信域名，建议使用三级以上域名。例如：mail.qcloud.com。
     */
    public void setEmailIdentity(String EmailIdentity) {
        this.EmailIdentity = EmailIdentity;
    }

    /**
     * Get 生成的dkim密钥长度。0:1024，1:2048 
     * @return DKIMOption 生成的dkim密钥长度。0:1024，1:2048
     */
    public Long getDKIMOption() {
        return this.DKIMOption;
    }

    /**
     * Set 生成的dkim密钥长度。0:1024，1:2048
     * @param DKIMOption 生成的dkim密钥长度。0:1024，1:2048
     */
    public void setDKIMOption(Long DKIMOption) {
        this.DKIMOption = DKIMOption;
    }

    /**
     * Get tag 标签 
     * @return TagList tag 标签
     */
    public TagList [] getTagList() {
        return this.TagList;
    }

    /**
     * Set tag 标签
     * @param TagList tag 标签
     */
    public void setTagList(TagList [] TagList) {
        this.TagList = TagList;
    }

    public CreateEmailIdentityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEmailIdentityRequest(CreateEmailIdentityRequest source) {
        if (source.EmailIdentity != null) {
            this.EmailIdentity = new String(source.EmailIdentity);
        }
        if (source.DKIMOption != null) {
            this.DKIMOption = new Long(source.DKIMOption);
        }
        if (source.TagList != null) {
            this.TagList = new TagList[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagList(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EmailIdentity", this.EmailIdentity);
        this.setParamSimple(map, prefix + "DKIMOption", this.DKIMOption);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

