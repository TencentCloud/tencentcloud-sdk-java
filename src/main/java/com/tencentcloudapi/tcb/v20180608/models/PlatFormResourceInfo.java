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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlatFormResourceInfo extends AbstractModel {

    /**
    * <p>资源类系</p><p>枚举值：</p><ul><li>log： 日志</li><li>storage： 云存储</li><li>hosting： 静态托管</li></ul>
    */
    @SerializedName("ResType")
    @Expose
    private String ResType;

    /**
    * <p>资源唯一标识</p>
    */
    @SerializedName("ResName")
    @Expose
    private String ResName;

    /**
    * <p>资源详细信息</p>
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * <p>资源状态</p><p>枚举值：</p><ul><li>0： 正常</li><li>5： 初始化中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>资源id</p>
    */
    @SerializedName("PlatformId")
    @Expose
    private Long PlatformId;

    /**
    * <p>对用平台资源id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get <p>资源类系</p><p>枚举值：</p><ul><li>log： 日志</li><li>storage： 云存储</li><li>hosting： 静态托管</li></ul> 
     * @return ResType <p>资源类系</p><p>枚举值：</p><ul><li>log： 日志</li><li>storage： 云存储</li><li>hosting： 静态托管</li></ul>
     */
    public String getResType() {
        return this.ResType;
    }

    /**
     * Set <p>资源类系</p><p>枚举值：</p><ul><li>log： 日志</li><li>storage： 云存储</li><li>hosting： 静态托管</li></ul>
     * @param ResType <p>资源类系</p><p>枚举值：</p><ul><li>log： 日志</li><li>storage： 云存储</li><li>hosting： 静态托管</li></ul>
     */
    public void setResType(String ResType) {
        this.ResType = ResType;
    }

    /**
     * Get <p>资源唯一标识</p> 
     * @return ResName <p>资源唯一标识</p>
     */
    public String getResName() {
        return this.ResName;
    }

    /**
     * Set <p>资源唯一标识</p>
     * @param ResName <p>资源唯一标识</p>
     */
    public void setResName(String ResName) {
        this.ResName = ResName;
    }

    /**
     * Get <p>资源详细信息</p> 
     * @return Detail <p>资源详细信息</p>
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set <p>资源详细信息</p>
     * @param Detail <p>资源详细信息</p>
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get <p>资源状态</p><p>枚举值：</p><ul><li>0： 正常</li><li>5： 初始化中</li></ul> 
     * @return Status <p>资源状态</p><p>枚举值：</p><ul><li>0： 正常</li><li>5： 初始化中</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>资源状态</p><p>枚举值：</p><ul><li>0： 正常</li><li>5： 初始化中</li></ul>
     * @param Status <p>资源状态</p><p>枚举值：</p><ul><li>0： 正常</li><li>5： 初始化中</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>资源id</p> 
     * @return PlatformId <p>资源id</p>
     */
    public Long getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set <p>资源id</p>
     * @param PlatformId <p>资源id</p>
     */
    public void setPlatformId(Long PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get <p>对用平台资源id</p> 
     * @return Id <p>对用平台资源id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>对用平台资源id</p>
     * @param Id <p>对用平台资源id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public PlatFormResourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlatFormResourceInfo(PlatFormResourceInfo source) {
        if (source.ResType != null) {
            this.ResType = new String(source.ResType);
        }
        if (source.ResName != null) {
            this.ResName = new String(source.ResName);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new Long(source.PlatformId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResType", this.ResType);
        this.setParamSimple(map, prefix + "ResName", this.ResName);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

