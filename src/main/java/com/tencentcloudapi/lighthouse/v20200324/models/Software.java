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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Software extends AbstractModel{

    /**
    * 软件名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 软件版本。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 软件图片 URL。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 软件安装目录。
    */
    @SerializedName("InstallDir")
    @Expose
    private String InstallDir;

    /**
    * 软件详情列表。
    */
    @SerializedName("DetailSet")
    @Expose
    private SoftwareDetail [] DetailSet;

    /**
     * Get 软件名称。 
     * @return Name 软件名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 软件名称。
     * @param Name 软件名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 软件版本。 
     * @return Version 软件版本。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 软件版本。
     * @param Version 软件版本。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 软件图片 URL。 
     * @return ImageUrl 软件图片 URL。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 软件图片 URL。
     * @param ImageUrl 软件图片 URL。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 软件安装目录。 
     * @return InstallDir 软件安装目录。
     */
    public String getInstallDir() {
        return this.InstallDir;
    }

    /**
     * Set 软件安装目录。
     * @param InstallDir 软件安装目录。
     */
    public void setInstallDir(String InstallDir) {
        this.InstallDir = InstallDir;
    }

    /**
     * Get 软件详情列表。 
     * @return DetailSet 软件详情列表。
     */
    public SoftwareDetail [] getDetailSet() {
        return this.DetailSet;
    }

    /**
     * Set 软件详情列表。
     * @param DetailSet 软件详情列表。
     */
    public void setDetailSet(SoftwareDetail [] DetailSet) {
        this.DetailSet = DetailSet;
    }

    public Software() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Software(Software source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.InstallDir != null) {
            this.InstallDir = new String(source.InstallDir);
        }
        if (source.DetailSet != null) {
            this.DetailSet = new SoftwareDetail[source.DetailSet.length];
            for (int i = 0; i < source.DetailSet.length; i++) {
                this.DetailSet[i] = new SoftwareDetail(source.DetailSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "InstallDir", this.InstallDir);
        this.setParamArrayObj(map, prefix + "DetailSet.", this.DetailSet);

    }
}

