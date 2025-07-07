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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OSImage extends AbstractModel {

    /**
    * os聚合名称
    */
    @SerializedName("SeriesName")
    @Expose
    private String SeriesName;

    /**
    * os别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * os名称
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 操作系统类型(分为定制和非定制，取值分别为:DOCKER_CUSTOMIZE、GENERAL)
    */
    @SerializedName("OsCustomizeType")
    @Expose
    private String OsCustomizeType;

    /**
    * os是否下线(online表示在线,offline表示下线)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 镜像id
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
     * Get os聚合名称 
     * @return SeriesName os聚合名称
     */
    public String getSeriesName() {
        return this.SeriesName;
    }

    /**
     * Set os聚合名称
     * @param SeriesName os聚合名称
     */
    public void setSeriesName(String SeriesName) {
        this.SeriesName = SeriesName;
    }

    /**
     * Get os别名 
     * @return Alias os别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set os别名
     * @param Alias os别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get os名称 
     * @return OsName os名称
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set os名称
     * @param OsName os名称
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 操作系统类型(分为定制和非定制，取值分别为:DOCKER_CUSTOMIZE、GENERAL) 
     * @return OsCustomizeType 操作系统类型(分为定制和非定制，取值分别为:DOCKER_CUSTOMIZE、GENERAL)
     */
    public String getOsCustomizeType() {
        return this.OsCustomizeType;
    }

    /**
     * Set 操作系统类型(分为定制和非定制，取值分别为:DOCKER_CUSTOMIZE、GENERAL)
     * @param OsCustomizeType 操作系统类型(分为定制和非定制，取值分别为:DOCKER_CUSTOMIZE、GENERAL)
     */
    public void setOsCustomizeType(String OsCustomizeType) {
        this.OsCustomizeType = OsCustomizeType;
    }

    /**
     * Get os是否下线(online表示在线,offline表示下线) 
     * @return Status os是否下线(online表示在线,offline表示下线)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set os是否下线(online表示在线,offline表示下线)
     * @param Status os是否下线(online表示在线,offline表示下线)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 镜像id 
     * @return ImageId 镜像id
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像id
     * @param ImageId 镜像id
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    public OSImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OSImage(OSImage source) {
        if (source.SeriesName != null) {
            this.SeriesName = new String(source.SeriesName);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.OsCustomizeType != null) {
            this.OsCustomizeType = new String(source.OsCustomizeType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SeriesName", this.SeriesName);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "OsCustomizeType", this.OsCustomizeType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);

    }
}

