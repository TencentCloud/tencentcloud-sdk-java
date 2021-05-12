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
package com.tencentcloudapi.ims.v20200713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImsDetail extends AbstractModel{

    /**
    * 文本内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 数据方式， 0：我审，1：人审
    */
    @SerializedName("DataSource")
    @Expose
    private Long DataSource;

    /**
    * 最后更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * ----非必选，该参数暂未对外开放
    */
    @SerializedName("EvilType")
    @Expose
    private Long EvilType;

    /**
    * 机器审核时间
    */
    @SerializedName("ModerationTime")
    @Expose
    private String ModerationTime;

    /**
    * 最后更新人
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * 内容RequestId
    */
    @SerializedName("ContentId")
    @Expose
    private String ContentId;

    /**
    * 自主审核结果
    */
    @SerializedName("OperEvilType")
    @Expose
    private Long OperEvilType;

    /**
     * Get 文本内容 
     * @return Content 文本内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 文本内容
     * @param Content 文本内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 数据方式， 0：我审，1：人审 
     * @return DataSource 数据方式， 0：我审，1：人审
     */
    public Long getDataSource() {
        return this.DataSource;
    }

    /**
     * Set 数据方式， 0：我审，1：人审
     * @param DataSource 数据方式， 0：我审，1：人审
     */
    public void setDataSource(Long DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get 最后更新时间 
     * @return UpdateTime 最后更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后更新时间
     * @param UpdateTime 最后更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get ----非必选，该参数暂未对外开放 
     * @return EvilType ----非必选，该参数暂未对外开放
     */
    public Long getEvilType() {
        return this.EvilType;
    }

    /**
     * Set ----非必选，该参数暂未对外开放
     * @param EvilType ----非必选，该参数暂未对外开放
     */
    public void setEvilType(Long EvilType) {
        this.EvilType = EvilType;
    }

    /**
     * Get 机器审核时间 
     * @return ModerationTime 机器审核时间
     */
    public String getModerationTime() {
        return this.ModerationTime;
    }

    /**
     * Set 机器审核时间
     * @param ModerationTime 机器审核时间
     */
    public void setModerationTime(String ModerationTime) {
        this.ModerationTime = ModerationTime;
    }

    /**
     * Get 最后更新人 
     * @return UpdateUser 最后更新人
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set 最后更新人
     * @param UpdateUser 最后更新人
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get 内容RequestId 
     * @return ContentId 内容RequestId
     */
    public String getContentId() {
        return this.ContentId;
    }

    /**
     * Set 内容RequestId
     * @param ContentId 内容RequestId
     */
    public void setContentId(String ContentId) {
        this.ContentId = ContentId;
    }

    /**
     * Get 自主审核结果 
     * @return OperEvilType 自主审核结果
     */
    public Long getOperEvilType() {
        return this.OperEvilType;
    }

    /**
     * Set 自主审核结果
     * @param OperEvilType 自主审核结果
     */
    public void setOperEvilType(Long OperEvilType) {
        this.OperEvilType = OperEvilType;
    }

    public ImsDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImsDetail(ImsDetail source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.DataSource != null) {
            this.DataSource = new Long(source.DataSource);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.EvilType != null) {
            this.EvilType = new Long(source.EvilType);
        }
        if (source.ModerationTime != null) {
            this.ModerationTime = new String(source.ModerationTime);
        }
        if (source.UpdateUser != null) {
            this.UpdateUser = new String(source.UpdateUser);
        }
        if (source.ContentId != null) {
            this.ContentId = new String(source.ContentId);
        }
        if (source.OperEvilType != null) {
            this.OperEvilType = new Long(source.OperEvilType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "EvilType", this.EvilType);
        this.setParamSimple(map, prefix + "ModerationTime", this.ModerationTime);
        this.setParamSimple(map, prefix + "UpdateUser", this.UpdateUser);
        this.setParamSimple(map, prefix + "ContentId", this.ContentId);
        this.setParamSimple(map, prefix + "OperEvilType", this.OperEvilType);

    }
}

