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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DashboardInfo extends AbstractModel {

    /**
    * 仪表盘id
    */
    @SerializedName("DashboardId")
    @Expose
    private String DashboardId;

    /**
    * 仪表盘名字
    */
    @SerializedName("DashboardName")
    @Expose
    private String DashboardName;

    /**
    * 仪表盘数据
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 创建仪表盘的时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * AssumerUin非空则表示创建该日志主题的服务方Uin
    */
    @SerializedName("AssumerUin")
    @Expose
    private Long AssumerUin;

    /**
    * RoleName非空则表示创建该日志主题的服务方使用的角色
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * AssumerName非空则表示创建该日志主题的服务方名称
    */
    @SerializedName("AssumerName")
    @Expose
    private String AssumerName;

    /**
    * 日志主题绑定的标签信息
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 仪表盘所在地域： 为了兼容老的地域。
    */
    @SerializedName("DashboardRegion")
    @Expose
    private String DashboardRegion;

    /**
    * 修改仪表盘的时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 仪表盘对应的topic相关信息
    */
    @SerializedName("DashboardTopicInfos")
    @Expose
    private DashboardTopicInfo [] DashboardTopicInfos;

    /**
     * Get 仪表盘id 
     * @return DashboardId 仪表盘id
     */
    public String getDashboardId() {
        return this.DashboardId;
    }

    /**
     * Set 仪表盘id
     * @param DashboardId 仪表盘id
     */
    public void setDashboardId(String DashboardId) {
        this.DashboardId = DashboardId;
    }

    /**
     * Get 仪表盘名字 
     * @return DashboardName 仪表盘名字
     */
    public String getDashboardName() {
        return this.DashboardName;
    }

    /**
     * Set 仪表盘名字
     * @param DashboardName 仪表盘名字
     */
    public void setDashboardName(String DashboardName) {
        this.DashboardName = DashboardName;
    }

    /**
     * Get 仪表盘数据 
     * @return Data 仪表盘数据
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 仪表盘数据
     * @param Data 仪表盘数据
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get 创建仪表盘的时间 
     * @return CreateTime 创建仪表盘的时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建仪表盘的时间
     * @param CreateTime 创建仪表盘的时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get AssumerUin非空则表示创建该日志主题的服务方Uin 
     * @return AssumerUin AssumerUin非空则表示创建该日志主题的服务方Uin
     */
    public Long getAssumerUin() {
        return this.AssumerUin;
    }

    /**
     * Set AssumerUin非空则表示创建该日志主题的服务方Uin
     * @param AssumerUin AssumerUin非空则表示创建该日志主题的服务方Uin
     */
    public void setAssumerUin(Long AssumerUin) {
        this.AssumerUin = AssumerUin;
    }

    /**
     * Get RoleName非空则表示创建该日志主题的服务方使用的角色 
     * @return RoleName RoleName非空则表示创建该日志主题的服务方使用的角色
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set RoleName非空则表示创建该日志主题的服务方使用的角色
     * @param RoleName RoleName非空则表示创建该日志主题的服务方使用的角色
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get AssumerName非空则表示创建该日志主题的服务方名称 
     * @return AssumerName AssumerName非空则表示创建该日志主题的服务方名称
     */
    public String getAssumerName() {
        return this.AssumerName;
    }

    /**
     * Set AssumerName非空则表示创建该日志主题的服务方名称
     * @param AssumerName AssumerName非空则表示创建该日志主题的服务方名称
     */
    public void setAssumerName(String AssumerName) {
        this.AssumerName = AssumerName;
    }

    /**
     * Get 日志主题绑定的标签信息 
     * @return Tags 日志主题绑定的标签信息
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 日志主题绑定的标签信息
     * @param Tags 日志主题绑定的标签信息
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 仪表盘所在地域： 为了兼容老的地域。 
     * @return DashboardRegion 仪表盘所在地域： 为了兼容老的地域。
     */
    public String getDashboardRegion() {
        return this.DashboardRegion;
    }

    /**
     * Set 仪表盘所在地域： 为了兼容老的地域。
     * @param DashboardRegion 仪表盘所在地域： 为了兼容老的地域。
     */
    public void setDashboardRegion(String DashboardRegion) {
        this.DashboardRegion = DashboardRegion;
    }

    /**
     * Get 修改仪表盘的时间 
     * @return UpdateTime 修改仪表盘的时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改仪表盘的时间
     * @param UpdateTime 修改仪表盘的时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 仪表盘对应的topic相关信息 
     * @return DashboardTopicInfos 仪表盘对应的topic相关信息
     */
    public DashboardTopicInfo [] getDashboardTopicInfos() {
        return this.DashboardTopicInfos;
    }

    /**
     * Set 仪表盘对应的topic相关信息
     * @param DashboardTopicInfos 仪表盘对应的topic相关信息
     */
    public void setDashboardTopicInfos(DashboardTopicInfo [] DashboardTopicInfos) {
        this.DashboardTopicInfos = DashboardTopicInfos;
    }

    public DashboardInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DashboardInfo(DashboardInfo source) {
        if (source.DashboardId != null) {
            this.DashboardId = new String(source.DashboardId);
        }
        if (source.DashboardName != null) {
            this.DashboardName = new String(source.DashboardName);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AssumerUin != null) {
            this.AssumerUin = new Long(source.AssumerUin);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.AssumerName != null) {
            this.AssumerName = new String(source.AssumerName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.DashboardRegion != null) {
            this.DashboardRegion = new String(source.DashboardRegion);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.DashboardTopicInfos != null) {
            this.DashboardTopicInfos = new DashboardTopicInfo[source.DashboardTopicInfos.length];
            for (int i = 0; i < source.DashboardTopicInfos.length; i++) {
                this.DashboardTopicInfos[i] = new DashboardTopicInfo(source.DashboardTopicInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DashboardId", this.DashboardId);
        this.setParamSimple(map, prefix + "DashboardName", this.DashboardName);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AssumerUin", this.AssumerUin);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "AssumerName", this.AssumerName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DashboardRegion", this.DashboardRegion);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "DashboardTopicInfos.", this.DashboardTopicInfos);

    }
}

