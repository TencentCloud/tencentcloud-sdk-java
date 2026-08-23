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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageAssociatedAssetCount extends AbstractModel {

    /**
    * <p>镜像id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>镜像关联主机数</p>
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * <p>镜像关联容器数</p>
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

    /**
    * <p>镜像所属账号名</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>镜像所属账号appid</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>镜像所属账号uin</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
     * Get <p>镜像id</p> 
     * @return Id <p>镜像id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>镜像id</p>
     * @param Id <p>镜像id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>镜像关联主机数</p> 
     * @return HostCount <p>镜像关联主机数</p>
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set <p>镜像关联主机数</p>
     * @param HostCount <p>镜像关联主机数</p>
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get <p>镜像关联容器数</p> 
     * @return ContainerCount <p>镜像关联容器数</p>
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set <p>镜像关联容器数</p>
     * @param ContainerCount <p>镜像关联容器数</p>
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
    }

    /**
     * Get <p>镜像所属账号名</p> 
     * @return OwnerAccountName <p>镜像所属账号名</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>镜像所属账号名</p>
     * @param OwnerAccountName <p>镜像所属账号名</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>镜像所属账号appid</p> 
     * @return OwnerAppId <p>镜像所属账号appid</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>镜像所属账号appid</p>
     * @param OwnerAppId <p>镜像所属账号appid</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>镜像所属账号uin</p> 
     * @return OwnerUin <p>镜像所属账号uin</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>镜像所属账号uin</p>
     * @param OwnerUin <p>镜像所属账号uin</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    public ImageAssociatedAssetCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageAssociatedAssetCount(ImageAssociatedAssetCount source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.ContainerCount != null) {
            this.ContainerCount = new Long(source.ContainerCount);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "ContainerCount", this.ContainerCount);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);

    }
}

