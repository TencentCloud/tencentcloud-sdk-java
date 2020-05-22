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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserInfoGjh extends AbstractModel{

    /**
    * 消息发表人简介，非必填，如填写，会结合简介内容判定该条是否有害。评论消息如展示简介则建议填写。
    */
    @SerializedName("StrDesc")
    @Expose
    private String StrDesc;

    /**
    * 消息发表人头像url，非必填，如填写，头像有害，该条消息会被判断为有害。评论消息如展示头像则建议填写。
    */
    @SerializedName("StrHeadUrl")
    @Expose
    private String StrHeadUrl;

    /**
    * 消息发表人昵称，非必填，如填写，会结合昵称信息判断该条内容是否有害。评论消息如展示昵称则建议填写。
    */
    @SerializedName("StrNick")
    @Expose
    private String StrNick;

    /**
    * 发表评论账号ID，如填写，会根据账号历史恶意情况，判定消息有害结果.
    */
    @SerializedName("StrUin")
    @Expose
    private String StrUin;

    /**
    * 1-微信uin 2-QQ号 3-微信群uin 4-qq群号 5-微信openid 6-QQopenid 7-其它string
    */
    @SerializedName("UiAcntType")
    @Expose
    private Long UiAcntType;

    /**
     * Get 消息发表人简介，非必填，如填写，会结合简介内容判定该条是否有害。评论消息如展示简介则建议填写。 
     * @return StrDesc 消息发表人简介，非必填，如填写，会结合简介内容判定该条是否有害。评论消息如展示简介则建议填写。
     */
    public String getStrDesc() {
        return this.StrDesc;
    }

    /**
     * Set 消息发表人简介，非必填，如填写，会结合简介内容判定该条是否有害。评论消息如展示简介则建议填写。
     * @param StrDesc 消息发表人简介，非必填，如填写，会结合简介内容判定该条是否有害。评论消息如展示简介则建议填写。
     */
    public void setStrDesc(String StrDesc) {
        this.StrDesc = StrDesc;
    }

    /**
     * Get 消息发表人头像url，非必填，如填写，头像有害，该条消息会被判断为有害。评论消息如展示头像则建议填写。 
     * @return StrHeadUrl 消息发表人头像url，非必填，如填写，头像有害，该条消息会被判断为有害。评论消息如展示头像则建议填写。
     */
    public String getStrHeadUrl() {
        return this.StrHeadUrl;
    }

    /**
     * Set 消息发表人头像url，非必填，如填写，头像有害，该条消息会被判断为有害。评论消息如展示头像则建议填写。
     * @param StrHeadUrl 消息发表人头像url，非必填，如填写，头像有害，该条消息会被判断为有害。评论消息如展示头像则建议填写。
     */
    public void setStrHeadUrl(String StrHeadUrl) {
        this.StrHeadUrl = StrHeadUrl;
    }

    /**
     * Get 消息发表人昵称，非必填，如填写，会结合昵称信息判断该条内容是否有害。评论消息如展示昵称则建议填写。 
     * @return StrNick 消息发表人昵称，非必填，如填写，会结合昵称信息判断该条内容是否有害。评论消息如展示昵称则建议填写。
     */
    public String getStrNick() {
        return this.StrNick;
    }

    /**
     * Set 消息发表人昵称，非必填，如填写，会结合昵称信息判断该条内容是否有害。评论消息如展示昵称则建议填写。
     * @param StrNick 消息发表人昵称，非必填，如填写，会结合昵称信息判断该条内容是否有害。评论消息如展示昵称则建议填写。
     */
    public void setStrNick(String StrNick) {
        this.StrNick = StrNick;
    }

    /**
     * Get 发表评论账号ID，如填写，会根据账号历史恶意情况，判定消息有害结果. 
     * @return StrUin 发表评论账号ID，如填写，会根据账号历史恶意情况，判定消息有害结果.
     */
    public String getStrUin() {
        return this.StrUin;
    }

    /**
     * Set 发表评论账号ID，如填写，会根据账号历史恶意情况，判定消息有害结果.
     * @param StrUin 发表评论账号ID，如填写，会根据账号历史恶意情况，判定消息有害结果.
     */
    public void setStrUin(String StrUin) {
        this.StrUin = StrUin;
    }

    /**
     * Get 1-微信uin 2-QQ号 3-微信群uin 4-qq群号 5-微信openid 6-QQopenid 7-其它string 
     * @return UiAcntType 1-微信uin 2-QQ号 3-微信群uin 4-qq群号 5-微信openid 6-QQopenid 7-其它string
     */
    public Long getUiAcntType() {
        return this.UiAcntType;
    }

    /**
     * Set 1-微信uin 2-QQ号 3-微信群uin 4-qq群号 5-微信openid 6-QQopenid 7-其它string
     * @param UiAcntType 1-微信uin 2-QQ号 3-微信群uin 4-qq群号 5-微信openid 6-QQopenid 7-其它string
     */
    public void setUiAcntType(Long UiAcntType) {
        this.UiAcntType = UiAcntType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrDesc", this.StrDesc);
        this.setParamSimple(map, prefix + "StrHeadUrl", this.StrHeadUrl);
        this.setParamSimple(map, prefix + "StrNick", this.StrNick);
        this.setParamSimple(map, prefix + "StrUin", this.StrUin);
        this.setParamSimple(map, prefix + "UiAcntType", this.UiAcntType);

    }
}

