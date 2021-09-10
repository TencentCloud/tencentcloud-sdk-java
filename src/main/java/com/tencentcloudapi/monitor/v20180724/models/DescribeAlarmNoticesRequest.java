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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmNoticesRequest extends AbstractModel{

    /**
    * 模块名，这里填“monitor”
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 页码 最小为1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页大小 1～200
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 按更新时间排序方式 ASC=正序 DESC=倒序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 主账号 uid 用于创建预设通知
    */
    @SerializedName("OwnerUid")
    @Expose
    private Long OwnerUid;

    /**
    * 告警通知模板名称 用来模糊搜索
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 根据接收人过滤告警通知模板需要选定通知用户类型 USER=用户 GROUP=用户组 传空=不按接收人过滤
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * 接收对象列表
    */
    @SerializedName("UserIds")
    @Expose
    private Long [] UserIds;

    /**
    * 接收组列表
    */
    @SerializedName("GroupIds")
    @Expose
    private Long [] GroupIds;

    /**
    * 根据通知模板 id 过滤，空数组/不传则不过滤
    */
    @SerializedName("NoticeIds")
    @Expose
    private String [] NoticeIds;

    /**
     * Get 模块名，这里填“monitor” 
     * @return Module 模块名，这里填“monitor”
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，这里填“monitor”
     * @param Module 模块名，这里填“monitor”
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 页码 最小为1 
     * @return PageNumber 页码 最小为1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码 最小为1
     * @param PageNumber 页码 最小为1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小 1～200 
     * @return PageSize 分页大小 1～200
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小 1～200
     * @param PageSize 分页大小 1～200
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 按更新时间排序方式 ASC=正序 DESC=倒序 
     * @return Order 按更新时间排序方式 ASC=正序 DESC=倒序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 按更新时间排序方式 ASC=正序 DESC=倒序
     * @param Order 按更新时间排序方式 ASC=正序 DESC=倒序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 主账号 uid 用于创建预设通知 
     * @return OwnerUid 主账号 uid 用于创建预设通知
     */
    public Long getOwnerUid() {
        return this.OwnerUid;
    }

    /**
     * Set 主账号 uid 用于创建预设通知
     * @param OwnerUid 主账号 uid 用于创建预设通知
     */
    public void setOwnerUid(Long OwnerUid) {
        this.OwnerUid = OwnerUid;
    }

    /**
     * Get 告警通知模板名称 用来模糊搜索 
     * @return Name 告警通知模板名称 用来模糊搜索
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 告警通知模板名称 用来模糊搜索
     * @param Name 告警通知模板名称 用来模糊搜索
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 根据接收人过滤告警通知模板需要选定通知用户类型 USER=用户 GROUP=用户组 传空=不按接收人过滤 
     * @return ReceiverType 根据接收人过滤告警通知模板需要选定通知用户类型 USER=用户 GROUP=用户组 传空=不按接收人过滤
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set 根据接收人过滤告警通知模板需要选定通知用户类型 USER=用户 GROUP=用户组 传空=不按接收人过滤
     * @param ReceiverType 根据接收人过滤告警通知模板需要选定通知用户类型 USER=用户 GROUP=用户组 传空=不按接收人过滤
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get 接收对象列表 
     * @return UserIds 接收对象列表
     */
    public Long [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 接收对象列表
     * @param UserIds 接收对象列表
     */
    public void setUserIds(Long [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get 接收组列表 
     * @return GroupIds 接收组列表
     */
    public Long [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 接收组列表
     * @param GroupIds 接收组列表
     */
    public void setGroupIds(Long [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get 根据通知模板 id 过滤，空数组/不传则不过滤 
     * @return NoticeIds 根据通知模板 id 过滤，空数组/不传则不过滤
     */
    public String [] getNoticeIds() {
        return this.NoticeIds;
    }

    /**
     * Set 根据通知模板 id 过滤，空数组/不传则不过滤
     * @param NoticeIds 根据通知模板 id 过滤，空数组/不传则不过滤
     */
    public void setNoticeIds(String [] NoticeIds) {
        this.NoticeIds = NoticeIds;
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

    }
}

