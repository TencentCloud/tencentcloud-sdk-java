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

public class CreateChannelCodeRequest extends AbstractModel{

    /**
    * 欢迎语类型:0普通欢迎语,1渠道欢迎语
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 使用成员用户id集
    */
    @SerializedName("UseUserId")
    @Expose
    private Long [] UseUserId;

    /**
    * 使用成员企微账号id集
    */
    @SerializedName("UseUserOpenId")
    @Expose
    private String [] UseUserOpenId;

    /**
    * 应用ID,字典表中的APP_TYPE值,多个已逗号分隔
    */
    @SerializedName("AppIds")
    @Expose
    private String AppIds;

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
    * 标签
    */
    @SerializedName("Tag")
    @Expose
    private WeComTagDetail [] Tag;

    /**
    * 自动通过好友：0开启 1关闭, 默认开启
    */
    @SerializedName("SkipVerify")
    @Expose
    private Long SkipVerify;

    /**
    * 欢迎语id（通过欢迎语新增返回的id）
    */
    @SerializedName("MsgId")
    @Expose
    private Long MsgId;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 渠道类型 0 未知 1 公域 2私域
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
     * Get 欢迎语类型:0普通欢迎语,1渠道欢迎语 
     * @return Type 欢迎语类型:0普通欢迎语,1渠道欢迎语
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 欢迎语类型:0普通欢迎语,1渠道欢迎语
     * @param Type 欢迎语类型:0普通欢迎语,1渠道欢迎语
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 使用成员用户id集 
     * @return UseUserId 使用成员用户id集
     */
    public Long [] getUseUserId() {
        return this.UseUserId;
    }

    /**
     * Set 使用成员用户id集
     * @param UseUserId 使用成员用户id集
     */
    public void setUseUserId(Long [] UseUserId) {
        this.UseUserId = UseUserId;
    }

    /**
     * Get 使用成员企微账号id集 
     * @return UseUserOpenId 使用成员企微账号id集
     */
    public String [] getUseUserOpenId() {
        return this.UseUserOpenId;
    }

    /**
     * Set 使用成员企微账号id集
     * @param UseUserOpenId 使用成员企微账号id集
     */
    public void setUseUserOpenId(String [] UseUserOpenId) {
        this.UseUserOpenId = UseUserOpenId;
    }

    /**
     * Get 应用ID,字典表中的APP_TYPE值,多个已逗号分隔 
     * @return AppIds 应用ID,字典表中的APP_TYPE值,多个已逗号分隔
     */
    public String getAppIds() {
        return this.AppIds;
    }

    /**
     * Set 应用ID,字典表中的APP_TYPE值,多个已逗号分隔
     * @param AppIds 应用ID,字典表中的APP_TYPE值,多个已逗号分隔
     */
    public void setAppIds(String AppIds) {
        this.AppIds = AppIds;
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
     * Get 标签 
     * @return Tag 标签
     */
    public WeComTagDetail [] getTag() {
        return this.Tag;
    }

    /**
     * Set 标签
     * @param Tag 标签
     */
    public void setTag(WeComTagDetail [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 自动通过好友：0开启 1关闭, 默认开启 
     * @return SkipVerify 自动通过好友：0开启 1关闭, 默认开启
     */
    public Long getSkipVerify() {
        return this.SkipVerify;
    }

    /**
     * Set 自动通过好友：0开启 1关闭, 默认开启
     * @param SkipVerify 自动通过好友：0开启 1关闭, 默认开启
     */
    public void setSkipVerify(Long SkipVerify) {
        this.SkipVerify = SkipVerify;
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
     * Get 渠道类型 0 未知 1 公域 2私域 
     * @return SourceType 渠道类型 0 未知 1 公域 2私域
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 渠道类型 0 未知 1 公域 2私域
     * @param SourceType 渠道类型 0 未知 1 公域 2私域
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    public CreateChannelCodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateChannelCodeRequest(CreateChannelCodeRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.UseUserId != null) {
            this.UseUserId = new Long[source.UseUserId.length];
            for (int i = 0; i < source.UseUserId.length; i++) {
                this.UseUserId[i] = new Long(source.UseUserId[i]);
            }
        }
        if (source.UseUserOpenId != null) {
            this.UseUserOpenId = new String[source.UseUserOpenId.length];
            for (int i = 0; i < source.UseUserOpenId.length; i++) {
                this.UseUserOpenId[i] = new String(source.UseUserOpenId[i]);
            }
        }
        if (source.AppIds != null) {
            this.AppIds = new String(source.AppIds);
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
        if (source.Tag != null) {
            this.Tag = new WeComTagDetail[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new WeComTagDetail(source.Tag[i]);
            }
        }
        if (source.SkipVerify != null) {
            this.SkipVerify = new Long(source.SkipVerify);
        }
        if (source.MsgId != null) {
            this.MsgId = new Long(source.MsgId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "UseUserId.", this.UseUserId);
        this.setParamArraySimple(map, prefix + "UseUserOpenId.", this.UseUserOpenId);
        this.setParamSimple(map, prefix + "AppIds", this.AppIds);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "SkipVerify", this.SkipVerify);
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);

    }
}

