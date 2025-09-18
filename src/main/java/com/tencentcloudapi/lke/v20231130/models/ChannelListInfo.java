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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelListInfo extends AbstractModel {

    /**
    * 渠道类型 10000 微信订阅号 10001 微信服务号 10002 企微应用
    */
    @SerializedName("ChannelType")
    @Expose
    private Long ChannelType;

    /**
    * 渠道状态 1未发布 2运行中 3已下线
    */
    @SerializedName("ChannelStatus")
    @Expose
    private Long ChannelStatus;

    /**
    * 渠道名称
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 渠道id 数据库主键
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 备注
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后更新人
    */
    @SerializedName("UpdatedUser")
    @Expose
    private String UpdatedUser;

    /**
    * 智能体应用可见范围，public-所有人可见 private-仅自己可见 share-通过分享可见
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("YuanQiInfo")
    @Expose
    private YuanQi YuanQiInfo;

    /**
     * Get 渠道类型 10000 微信订阅号 10001 微信服务号 10002 企微应用 
     * @return ChannelType 渠道类型 10000 微信订阅号 10001 微信服务号 10002 企微应用
     */
    public Long getChannelType() {
        return this.ChannelType;
    }

    /**
     * Set 渠道类型 10000 微信订阅号 10001 微信服务号 10002 企微应用
     * @param ChannelType 渠道类型 10000 微信订阅号 10001 微信服务号 10002 企微应用
     */
    public void setChannelType(Long ChannelType) {
        this.ChannelType = ChannelType;
    }

    /**
     * Get 渠道状态 1未发布 2运行中 3已下线 
     * @return ChannelStatus 渠道状态 1未发布 2运行中 3已下线
     */
    public Long getChannelStatus() {
        return this.ChannelStatus;
    }

    /**
     * Set 渠道状态 1未发布 2运行中 3已下线
     * @param ChannelStatus 渠道状态 1未发布 2运行中 3已下线
     */
    public void setChannelStatus(Long ChannelStatus) {
        this.ChannelStatus = ChannelStatus;
    }

    /**
     * Get 渠道名称 
     * @return ChannelName 渠道名称
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名称
     * @param ChannelName 渠道名称
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 渠道id 数据库主键 
     * @return ChannelId 渠道id 数据库主键
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 渠道id 数据库主键
     * @param ChannelId 渠道id 数据库主键
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 备注 
     * @return Comment 备注
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 备注
     * @param Comment 备注
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后更新人 
     * @return UpdatedUser 最后更新人
     */
    public String getUpdatedUser() {
        return this.UpdatedUser;
    }

    /**
     * Set 最后更新人
     * @param UpdatedUser 最后更新人
     */
    public void setUpdatedUser(String UpdatedUser) {
        this.UpdatedUser = UpdatedUser;
    }

    /**
     * Get 智能体应用可见范围，public-所有人可见 private-仅自己可见 share-通过分享可见
注意：此字段可能返回 null，表示取不到有效值。 
     * @return YuanQiInfo 智能体应用可见范围，public-所有人可见 private-仅自己可见 share-通过分享可见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public YuanQi getYuanQiInfo() {
        return this.YuanQiInfo;
    }

    /**
     * Set 智能体应用可见范围，public-所有人可见 private-仅自己可见 share-通过分享可见
注意：此字段可能返回 null，表示取不到有效值。
     * @param YuanQiInfo 智能体应用可见范围，public-所有人可见 private-仅自己可见 share-通过分享可见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYuanQiInfo(YuanQi YuanQiInfo) {
        this.YuanQiInfo = YuanQiInfo;
    }

    public ChannelListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelListInfo(ChannelListInfo source) {
        if (source.ChannelType != null) {
            this.ChannelType = new Long(source.ChannelType);
        }
        if (source.ChannelStatus != null) {
            this.ChannelStatus = new Long(source.ChannelStatus);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdatedUser != null) {
            this.UpdatedUser = new String(source.UpdatedUser);
        }
        if (source.YuanQiInfo != null) {
            this.YuanQiInfo = new YuanQi(source.YuanQiInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelType", this.ChannelType);
        this.setParamSimple(map, prefix + "ChannelStatus", this.ChannelStatus);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdatedUser", this.UpdatedUser);
        this.setParamObj(map, prefix + "YuanQiInfo.", this.YuanQiInfo);

    }
}

