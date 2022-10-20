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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EscapeWhiteListInfo extends AbstractModel{

    /**
    * 镜像ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 白名单记录ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 关联主机数量
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * 关联容器数量
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

    /**
    * 加白事件类型
    */
    @SerializedName("EventType")
    @Expose
    private String [] EventType;

    /**
    * 创建时间
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 镜像大小
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
     * Get 镜像ID 
     * @return ImageID 镜像ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set 镜像ID
     * @param ImageID 镜像ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get 镜像名称 
     * @return ImageName 镜像名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
     * @param ImageName 镜像名称
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 白名单记录ID 
     * @return ID 白名单记录ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 白名单记录ID
     * @param ID 白名单记录ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 关联主机数量 
     * @return HostCount 关联主机数量
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 关联主机数量
     * @param HostCount 关联主机数量
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get 关联容器数量 
     * @return ContainerCount 关联容器数量
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set 关联容器数量
     * @param ContainerCount 关联容器数量
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
    }

    /**
     * Get 加白事件类型 
     * @return EventType 加白事件类型
     */
    public String [] getEventType() {
        return this.EventType;
    }

    /**
     * Set 加白事件类型
     * @param EventType 加白事件类型
     */
    public void setEventType(String [] EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 创建时间 
     * @return InsertTime 创建时间
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 创建时间
     * @param InsertTime 创建时间
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
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
     * Get 镜像大小 
     * @return ImageSize 镜像大小
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set 镜像大小
     * @param ImageSize 镜像大小
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    public EscapeWhiteListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EscapeWhiteListInfo(EscapeWhiteListInfo source) {
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.ContainerCount != null) {
            this.ContainerCount = new Long(source.ContainerCount);
        }
        if (source.EventType != null) {
            this.EventType = new String[source.EventType.length];
            for (int i = 0; i < source.EventType.length; i++) {
                this.EventType[i] = new String(source.EventType[i]);
            }
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ImageSize != null) {
            this.ImageSize = new Long(source.ImageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "ContainerCount", this.ContainerCount);
        this.setParamArraySimple(map, prefix + "EventType.", this.EventType);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);

    }
}

