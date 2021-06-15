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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelCodeInnerDetail extends AbstractModel{

    /**
    * 渠道活码id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 欢迎语类型，0：普通欢迎语、1:渠道欢迎语
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 渠道来源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 渠道来源名称
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * 二维码名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 使用成员用户id集
    */
    @SerializedName("UseUserIdList")
    @Expose
    private Long [] UseUserIdList;

    /**
    * 使用成员企微账号id集
    */
    @SerializedName("UseUserOpenIdList")
    @Expose
    private String [] UseUserOpenIdList;

    /**
    * 标签
    */
    @SerializedName("TagList")
    @Expose
    private WeComTagDetail [] TagList;

    /**
    * 自动通过好友，0：开启、1：关闭，默认0开启
    */
    @SerializedName("SkipVerify")
    @Expose
    private Long SkipVerify;

    /**
    * 添加好友人数
    */
    @SerializedName("Friends")
    @Expose
    private Long Friends;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 欢迎语id（通过欢迎语新增返回的id）
    */
    @SerializedName("MsgId")
    @Expose
    private Long MsgId;

    /**
    * 联系我config_id
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 联系我二维码地址
    */
    @SerializedName("QrCodeUrl")
    @Expose
    private String QrCodeUrl;

    /**
    * 记录状态， 0：有效、1：无效
    */
    @SerializedName("RecStatus")
    @Expose
    private Long RecStatus;

    /**
    * 应用ID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
     * Get 渠道活码id 
     * @return Id 渠道活码id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 渠道活码id
     * @param Id 渠道活码id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 欢迎语类型，0：普通欢迎语、1:渠道欢迎语 
     * @return Type 欢迎语类型，0：普通欢迎语、1:渠道欢迎语
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 欢迎语类型，0：普通欢迎语、1:渠道欢迎语
     * @param Type 欢迎语类型，0：普通欢迎语、1:渠道欢迎语
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 渠道来源 
     * @return Source 渠道来源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 渠道来源
     * @param Source 渠道来源
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 渠道来源名称 
     * @return SourceName 渠道来源名称
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set 渠道来源名称
     * @param SourceName 渠道来源名称
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get 二维码名称 
     * @return Name 二维码名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 二维码名称
     * @param Name 二维码名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 使用成员用户id集 
     * @return UseUserIdList 使用成员用户id集
     */
    public Long [] getUseUserIdList() {
        return this.UseUserIdList;
    }

    /**
     * Set 使用成员用户id集
     * @param UseUserIdList 使用成员用户id集
     */
    public void setUseUserIdList(Long [] UseUserIdList) {
        this.UseUserIdList = UseUserIdList;
    }

    /**
     * Get 使用成员企微账号id集 
     * @return UseUserOpenIdList 使用成员企微账号id集
     */
    public String [] getUseUserOpenIdList() {
        return this.UseUserOpenIdList;
    }

    /**
     * Set 使用成员企微账号id集
     * @param UseUserOpenIdList 使用成员企微账号id集
     */
    public void setUseUserOpenIdList(String [] UseUserOpenIdList) {
        this.UseUserOpenIdList = UseUserOpenIdList;
    }

    /**
     * Get 标签 
     * @return TagList 标签
     */
    public WeComTagDetail [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 标签
     * @param TagList 标签
     */
    public void setTagList(WeComTagDetail [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get 自动通过好友，0：开启、1：关闭，默认0开启 
     * @return SkipVerify 自动通过好友，0：开启、1：关闭，默认0开启
     */
    public Long getSkipVerify() {
        return this.SkipVerify;
    }

    /**
     * Set 自动通过好友，0：开启、1：关闭，默认0开启
     * @param SkipVerify 自动通过好友，0：开启、1：关闭，默认0开启
     */
    public void setSkipVerify(Long SkipVerify) {
        this.SkipVerify = SkipVerify;
    }

    /**
     * Get 添加好友人数 
     * @return Friends 添加好友人数
     */
    public Long getFriends() {
        return this.Friends;
    }

    /**
     * Set 添加好友人数
     * @param Friends 添加好友人数
     */
    public void setFriends(Long Friends) {
        this.Friends = Friends;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 欢迎语id（通过欢迎语新增返回的id） 
     * @return MsgId 欢迎语id（通过欢迎语新增返回的id）
     */
    public Long getMsgId() {
        return this.MsgId;
    }

    /**
     * Set 欢迎语id（通过欢迎语新增返回的id）
     * @param MsgId 欢迎语id（通过欢迎语新增返回的id）
     */
    public void setMsgId(Long MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get 联系我config_id 
     * @return ConfigId 联系我config_id
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 联系我config_id
     * @param ConfigId 联系我config_id
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 联系我二维码地址 
     * @return QrCodeUrl 联系我二维码地址
     */
    public String getQrCodeUrl() {
        return this.QrCodeUrl;
    }

    /**
     * Set 联系我二维码地址
     * @param QrCodeUrl 联系我二维码地址
     */
    public void setQrCodeUrl(String QrCodeUrl) {
        this.QrCodeUrl = QrCodeUrl;
    }

    /**
     * Get 记录状态， 0：有效、1：无效 
     * @return RecStatus 记录状态， 0：有效、1：无效
     */
    public Long getRecStatus() {
        return this.RecStatus;
    }

    /**
     * Set 记录状态， 0：有效、1：无效
     * @param RecStatus 记录状态， 0：有效、1：无效
     */
    public void setRecStatus(Long RecStatus) {
        this.RecStatus = RecStatus;
    }

    /**
     * Get 应用ID 
     * @return AppId 应用ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用ID
     * @param AppId 应用ID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    public ChannelCodeInnerDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCodeInnerDetail(ChannelCodeInnerDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UseUserIdList != null) {
            this.UseUserIdList = new Long[source.UseUserIdList.length];
            for (int i = 0; i < source.UseUserIdList.length; i++) {
                this.UseUserIdList[i] = new Long(source.UseUserIdList[i]);
            }
        }
        if (source.UseUserOpenIdList != null) {
            this.UseUserOpenIdList = new String[source.UseUserOpenIdList.length];
            for (int i = 0; i < source.UseUserOpenIdList.length; i++) {
                this.UseUserOpenIdList[i] = new String(source.UseUserOpenIdList[i]);
            }
        }
        if (source.TagList != null) {
            this.TagList = new WeComTagDetail[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new WeComTagDetail(source.TagList[i]);
            }
        }
        if (source.SkipVerify != null) {
            this.SkipVerify = new Long(source.SkipVerify);
        }
        if (source.Friends != null) {
            this.Friends = new Long(source.Friends);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MsgId != null) {
            this.MsgId = new Long(source.MsgId);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.QrCodeUrl != null) {
            this.QrCodeUrl = new String(source.QrCodeUrl);
        }
        if (source.RecStatus != null) {
            this.RecStatus = new Long(source.RecStatus);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "UseUserIdList.", this.UseUserIdList);
        this.setParamArraySimple(map, prefix + "UseUserOpenIdList.", this.UseUserOpenIdList);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "SkipVerify", this.SkipVerify);
        this.setParamSimple(map, prefix + "Friends", this.Friends);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "QrCodeUrl", this.QrCodeUrl);
        this.setParamSimple(map, prefix + "RecStatus", this.RecStatus);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

