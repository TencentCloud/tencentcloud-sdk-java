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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmNoticesRequest extends AbstractModel {

    /**
    * <p>模块名，这里填“monitor”</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>页码 最小为1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>分页大小 1～200</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>按更新时间排序方式 ASC=正序 DESC=倒序</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>主账号 uid 用于创建预设通知</p>
    */
    @SerializedName("OwnerUid")
    @Expose
    private Long OwnerUid;

    /**
    * <p>告警通知模板名称 用来模糊搜索</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>根据接收人过滤告警通知模板需要选定通知用户类型 USER=用户 GROUP=用户组 传空=不按接收人过滤</p>
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * <p>接收对象列表</p>
    */
    @SerializedName("UserIds")
    @Expose
    private Long [] UserIds;

    /**
    * <p>接收组列表</p>
    */
    @SerializedName("GroupIds")
    @Expose
    private Long [] GroupIds;

    /**
    * <p>根据通知模板 id 过滤，空数组/不传则不过滤</p>
    */
    @SerializedName("NoticeIds")
    @Expose
    private String [] NoticeIds;

    /**
    * <p>模板根据标签过滤</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>值班列表</p>
    */
    @SerializedName("OnCallFormIDs")
    @Expose
    private String [] OnCallFormIDs;

    /**
     * Get <p>模块名，这里填“monitor”</p> 
     * @return Module <p>模块名，这里填“monitor”</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>模块名，这里填“monitor”</p>
     * @param Module <p>模块名，这里填“monitor”</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>页码 最小为1</p> 
     * @return PageNumber <p>页码 最小为1</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码 最小为1</p>
     * @param PageNumber <p>页码 最小为1</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>分页大小 1～200</p> 
     * @return PageSize <p>分页大小 1～200</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>分页大小 1～200</p>
     * @param PageSize <p>分页大小 1～200</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>按更新时间排序方式 ASC=正序 DESC=倒序</p> 
     * @return Order <p>按更新时间排序方式 ASC=正序 DESC=倒序</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>按更新时间排序方式 ASC=正序 DESC=倒序</p>
     * @param Order <p>按更新时间排序方式 ASC=正序 DESC=倒序</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>主账号 uid 用于创建预设通知</p> 
     * @return OwnerUid <p>主账号 uid 用于创建预设通知</p>
     */
    public Long getOwnerUid() {
        return this.OwnerUid;
    }

    /**
     * Set <p>主账号 uid 用于创建预设通知</p>
     * @param OwnerUid <p>主账号 uid 用于创建预设通知</p>
     */
    public void setOwnerUid(Long OwnerUid) {
        this.OwnerUid = OwnerUid;
    }

    /**
     * Get <p>告警通知模板名称 用来模糊搜索</p> 
     * @return Name <p>告警通知模板名称 用来模糊搜索</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>告警通知模板名称 用来模糊搜索</p>
     * @param Name <p>告警通知模板名称 用来模糊搜索</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>根据接收人过滤告警通知模板需要选定通知用户类型 USER=用户 GROUP=用户组 传空=不按接收人过滤</p> 
     * @return ReceiverType <p>根据接收人过滤告警通知模板需要选定通知用户类型 USER=用户 GROUP=用户组 传空=不按接收人过滤</p>
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set <p>根据接收人过滤告警通知模板需要选定通知用户类型 USER=用户 GROUP=用户组 传空=不按接收人过滤</p>
     * @param ReceiverType <p>根据接收人过滤告警通知模板需要选定通知用户类型 USER=用户 GROUP=用户组 传空=不按接收人过滤</p>
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get <p>接收对象列表</p> 
     * @return UserIds <p>接收对象列表</p>
     */
    public Long [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set <p>接收对象列表</p>
     * @param UserIds <p>接收对象列表</p>
     */
    public void setUserIds(Long [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get <p>接收组列表</p> 
     * @return GroupIds <p>接收组列表</p>
     */
    public Long [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set <p>接收组列表</p>
     * @param GroupIds <p>接收组列表</p>
     */
    public void setGroupIds(Long [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get <p>根据通知模板 id 过滤，空数组/不传则不过滤</p> 
     * @return NoticeIds <p>根据通知模板 id 过滤，空数组/不传则不过滤</p>
     */
    public String [] getNoticeIds() {
        return this.NoticeIds;
    }

    /**
     * Set <p>根据通知模板 id 过滤，空数组/不传则不过滤</p>
     * @param NoticeIds <p>根据通知模板 id 过滤，空数组/不传则不过滤</p>
     */
    public void setNoticeIds(String [] NoticeIds) {
        this.NoticeIds = NoticeIds;
    }

    /**
     * Get <p>模板根据标签过滤</p> 
     * @return Tags <p>模板根据标签过滤</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>模板根据标签过滤</p>
     * @param Tags <p>模板根据标签过滤</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>值班列表</p> 
     * @return OnCallFormIDs <p>值班列表</p>
     */
    public String [] getOnCallFormIDs() {
        return this.OnCallFormIDs;
    }

    /**
     * Set <p>值班列表</p>
     * @param OnCallFormIDs <p>值班列表</p>
     */
    public void setOnCallFormIDs(String [] OnCallFormIDs) {
        this.OnCallFormIDs = OnCallFormIDs;
    }

    public DescribeAlarmNoticesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmNoticesRequest(DescribeAlarmNoticesRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OwnerUid != null) {
            this.OwnerUid = new Long(source.OwnerUid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ReceiverType != null) {
            this.ReceiverType = new String(source.ReceiverType);
        }
        if (source.UserIds != null) {
            this.UserIds = new Long[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new Long(source.UserIds[i]);
            }
        }
        if (source.GroupIds != null) {
            this.GroupIds = new Long[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new Long(source.GroupIds[i]);
            }
        }
        if (source.NoticeIds != null) {
            this.NoticeIds = new String[source.NoticeIds.length];
            for (int i = 0; i < source.NoticeIds.length; i++) {
                this.NoticeIds[i] = new String(source.NoticeIds[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.OnCallFormIDs != null) {
            this.OnCallFormIDs = new String[source.OnCallFormIDs.length];
            for (int i = 0; i < source.OnCallFormIDs.length; i++) {
                this.OnCallFormIDs[i] = new String(source.OnCallFormIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OwnerUid", this.OwnerUid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamArraySimple(map, prefix + "NoticeIds.", this.NoticeIds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "OnCallFormIDs.", this.OnCallFormIDs);

    }
}

