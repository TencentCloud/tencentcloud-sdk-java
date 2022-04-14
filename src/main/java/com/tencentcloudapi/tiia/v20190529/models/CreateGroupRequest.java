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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGroupRequest extends AbstractModel{

    /**
    * 图库ID，不可重复，仅支持字母、数字和下划线。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 图库名称描述。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 该库的容量限制。
    */
    @SerializedName("MaxCapacity")
    @Expose
    private Long MaxCapacity;

    /**
    * 简介。
    */
    @SerializedName("Brief")
    @Expose
    private String Brief;

    /**
    * 该库的访问限频 ，默认10。
    */
    @SerializedName("MaxQps")
    @Expose
    private Long MaxQps;

    /**
    * 图库类型，对应不同产品功能，默认为1。建议调整为4或5，1~3为历史版本，不推荐。
参数值：
4：相同图像搜索，在自建图库中搜索相同原图，可支持裁剪、翻转、调色、加水印后的图片搜索，适用于版权场景。
5：商品图像搜索，在自建图库中搜索相同或相似的商品图片，适用于电商场景。
    */
    @SerializedName("GroupType")
    @Expose
    private Long GroupType;

    /**
     * Get 图库ID，不可重复，仅支持字母、数字和下划线。 
     * @return GroupId 图库ID，不可重复，仅支持字母、数字和下划线。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 图库ID，不可重复，仅支持字母、数字和下划线。
     * @param GroupId 图库ID，不可重复，仅支持字母、数字和下划线。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 图库名称描述。 
     * @return GroupName 图库名称描述。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 图库名称描述。
     * @param GroupName 图库名称描述。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 该库的容量限制。 
     * @return MaxCapacity 该库的容量限制。
     */
    public Long getMaxCapacity() {
        return this.MaxCapacity;
    }

    /**
     * Set 该库的容量限制。
     * @param MaxCapacity 该库的容量限制。
     */
    public void setMaxCapacity(Long MaxCapacity) {
        this.MaxCapacity = MaxCapacity;
    }

    /**
     * Get 简介。 
     * @return Brief 简介。
     */
    public String getBrief() {
        return this.Brief;
    }

    /**
     * Set 简介。
     * @param Brief 简介。
     */
    public void setBrief(String Brief) {
        this.Brief = Brief;
    }

    /**
     * Get 该库的访问限频 ，默认10。 
     * @return MaxQps 该库的访问限频 ，默认10。
     */
    public Long getMaxQps() {
        return this.MaxQps;
    }

    /**
     * Set 该库的访问限频 ，默认10。
     * @param MaxQps 该库的访问限频 ，默认10。
     */
    public void setMaxQps(Long MaxQps) {
        this.MaxQps = MaxQps;
    }

    /**
     * Get 图库类型，对应不同产品功能，默认为1。建议调整为4或5，1~3为历史版本，不推荐。
参数值：
4：相同图像搜索，在自建图库中搜索相同原图，可支持裁剪、翻转、调色、加水印后的图片搜索，适用于版权场景。
5：商品图像搜索，在自建图库中搜索相同或相似的商品图片，适用于电商场景。 
     * @return GroupType 图库类型，对应不同产品功能，默认为1。建议调整为4或5，1~3为历史版本，不推荐。
参数值：
4：相同图像搜索，在自建图库中搜索相同原图，可支持裁剪、翻转、调色、加水印后的图片搜索，适用于版权场景。
5：商品图像搜索，在自建图库中搜索相同或相似的商品图片，适用于电商场景。
     */
    public Long getGroupType() {
        return this.GroupType;
    }

    /**
     * Set 图库类型，对应不同产品功能，默认为1。建议调整为4或5，1~3为历史版本，不推荐。
参数值：
4：相同图像搜索，在自建图库中搜索相同原图，可支持裁剪、翻转、调色、加水印后的图片搜索，适用于版权场景。
5：商品图像搜索，在自建图库中搜索相同或相似的商品图片，适用于电商场景。
     * @param GroupType 图库类型，对应不同产品功能，默认为1。建议调整为4或5，1~3为历史版本，不推荐。
参数值：
4：相同图像搜索，在自建图库中搜索相同原图，可支持裁剪、翻转、调色、加水印后的图片搜索，适用于版权场景。
5：商品图像搜索，在自建图库中搜索相同或相似的商品图片，适用于电商场景。
     */
    public void setGroupType(Long GroupType) {
        this.GroupType = GroupType;
    }

    public CreateGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGroupRequest(CreateGroupRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.MaxCapacity != null) {
            this.MaxCapacity = new Long(source.MaxCapacity);
        }
        if (source.Brief != null) {
            this.Brief = new String(source.Brief);
        }
        if (source.MaxQps != null) {
            this.MaxQps = new Long(source.MaxQps);
        }
        if (source.GroupType != null) {
            this.GroupType = new Long(source.GroupType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "MaxCapacity", this.MaxCapacity);
        this.setParamSimple(map, prefix + "Brief", this.Brief);
        this.setParamSimple(map, prefix + "MaxQps", this.MaxQps);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);

    }
}

