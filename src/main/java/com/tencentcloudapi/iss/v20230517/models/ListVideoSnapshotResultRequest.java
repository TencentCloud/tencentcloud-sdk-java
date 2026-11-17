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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListVideoSnapshotResultRequest extends AbstractModel {

    /**
    * <p>开始时间</p><p>单位：秒</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * <p>结束时间</p><p>单位：秒</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>截图配置Id</p>
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * <p>通道Id</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * <p>截图类型</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>图片URL有效期，单位：秒</p><p>取值范围：[60, 86400]</p><p>默认值：600</p>
    */
    @SerializedName("ImageUrlExpires")
    @Expose
    private Long ImageUrlExpires;

    /**
    * <p>页码</p><p>默认值：1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页数目</p><p>取值范围：[1, 200]</p><p>默认值：20</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>开始时间</p><p>单位：秒</p> 
     * @return BeginTime <p>开始时间</p><p>单位：秒</p>
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>开始时间</p><p>单位：秒</p>
     * @param BeginTime <p>开始时间</p><p>单位：秒</p>
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>结束时间</p><p>单位：秒</p> 
     * @return EndTime <p>结束时间</p><p>单位：秒</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p><p>单位：秒</p>
     * @param EndTime <p>结束时间</p><p>单位：秒</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>截图配置Id</p> 
     * @return ConfigId <p>截图配置Id</p>
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set <p>截图配置Id</p>
     * @param ConfigId <p>截图配置Id</p>
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get <p>通道Id</p> 
     * @return ChannelId <p>通道Id</p>
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通道Id</p>
     * @param ChannelId <p>通道Id</p>
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>截图类型</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul> 
     * @return Type <p>截图类型</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>截图类型</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul>
     * @param Type <p>截图类型</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>图片URL有效期，单位：秒</p><p>取值范围：[60, 86400]</p><p>默认值：600</p> 
     * @return ImageUrlExpires <p>图片URL有效期，单位：秒</p><p>取值范围：[60, 86400]</p><p>默认值：600</p>
     */
    public Long getImageUrlExpires() {
        return this.ImageUrlExpires;
    }

    /**
     * Set <p>图片URL有效期，单位：秒</p><p>取值范围：[60, 86400]</p><p>默认值：600</p>
     * @param ImageUrlExpires <p>图片URL有效期，单位：秒</p><p>取值范围：[60, 86400]</p><p>默认值：600</p>
     */
    public void setImageUrlExpires(Long ImageUrlExpires) {
        this.ImageUrlExpires = ImageUrlExpires;
    }

    /**
     * Get <p>页码</p><p>默认值：1</p> 
     * @return PageNumber <p>页码</p><p>默认值：1</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码</p><p>默认值：1</p>
     * @param PageNumber <p>页码</p><p>默认值：1</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页数目</p><p>取值范围：[1, 200]</p><p>默认值：20</p> 
     * @return PageSize <p>每页数目</p><p>取值范围：[1, 200]</p><p>默认值：20</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数目</p><p>取值范围：[1, 200]</p><p>默认值：20</p>
     * @param PageSize <p>每页数目</p><p>取值范围：[1, 200]</p><p>默认值：20</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListVideoSnapshotResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListVideoSnapshotResultRequest(ListVideoSnapshotResultRequest source) {
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.ImageUrlExpires != null) {
            this.ImageUrlExpires = new Long(source.ImageUrlExpires);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ImageUrlExpires", this.ImageUrlExpires);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

