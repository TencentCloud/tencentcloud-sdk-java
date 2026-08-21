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
    * <p>os聚合名称</p>
    */
    @SerializedName("SeriesName")
    @Expose
    private String SeriesName;

    /**
    * <p>os别名</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>os名称</p>
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * <p>操作系统类型(分为定制和非定制，取值分别为:DOCKER_CUSTOMIZE、GENERAL)</p>
    */
    @SerializedName("OsCustomizeType")
    @Expose
    private String OsCustomizeType;

    /**
    * <p>os是否下线(online表示在线,offline表示下线)</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>镜像id</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>架构</p>
    */
    @SerializedName("Arch")
    @Expose
    private String Arch;

    /**
     * Get <p>os聚合名称</p> 
     * @return SeriesName <p>os聚合名称</p>
     */
    public String getSeriesName() {
        return this.SeriesName;
    }

    /**
     * Set <p>os聚合名称</p>
     * @param SeriesName <p>os聚合名称</p>
     */
    public void setSeriesName(String SeriesName) {
        this.SeriesName = SeriesName;
    }

    /**
     * Get <p>os别名</p> 
     * @return Alias <p>os别名</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>os别名</p>
     * @param Alias <p>os别名</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>os名称</p> 
     * @return OsName <p>os名称</p>
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set <p>os名称</p>
     * @param OsName <p>os名称</p>
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get <p>操作系统类型(分为定制和非定制，取值分别为:DOCKER_CUSTOMIZE、GENERAL)</p> 
     * @return OsCustomizeType <p>操作系统类型(分为定制和非定制，取值分别为:DOCKER_CUSTOMIZE、GENERAL)</p>
     */
    public String getOsCustomizeType() {
        return this.OsCustomizeType;
    }

    /**
     * Set <p>操作系统类型(分为定制和非定制，取值分别为:DOCKER_CUSTOMIZE、GENERAL)</p>
     * @param OsCustomizeType <p>操作系统类型(分为定制和非定制，取值分别为:DOCKER_CUSTOMIZE、GENERAL)</p>
     */
    public void setOsCustomizeType(String OsCustomizeType) {
        this.OsCustomizeType = OsCustomizeType;
    }

    /**
     * Get <p>os是否下线(online表示在线,offline表示下线)</p> 
     * @return Status <p>os是否下线(online表示在线,offline表示下线)</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>os是否下线(online表示在线,offline表示下线)</p>
     * @param Status <p>os是否下线(online表示在线,offline表示下线)</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>镜像id</p> 
     * @return ImageId <p>镜像id</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>镜像id</p>
     * @param ImageId <p>镜像id</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>架构</p> 
     * @return Arch <p>架构</p>
     */
    public String getArch() {
        return this.Arch;
    }

    /**
     * Set <p>架构</p>
     * @param Arch <p>架构</p>
     */
    public void setArch(String Arch) {
        this.Arch = Arch;
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
        if (source.Arch != null) {
            this.Arch = new String(source.Arch);
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
        this.setParamSimple(map, prefix + "Arch", this.Arch);

    }
}

