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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AndroidInstanceImage extends AbstractModel {

    /**
    * 镜像 ID
    */
    @SerializedName("AndroidInstanceImageId")
    @Expose
    private String AndroidInstanceImageId;

    /**
    * 镜像名称，由业务方自定义，仅用于展示
    */
    @SerializedName("AndroidInstanceImageName")
    @Expose
    private String AndroidInstanceImageName;

    /**
    * 镜像状态
    */
    @SerializedName("AndroidInstanceImageState")
    @Expose
    private String AndroidInstanceImageState;

    /**
    * 镜像可用区
    */
    @SerializedName("AndroidInstanceImageZone")
    @Expose
    private String AndroidInstanceImageZone;

    /**
    * 镜像描述
    */
    @SerializedName("AndroidInstanceImageDescription")
    @Expose
    private String AndroidInstanceImageDescription;

    /**
    * 安卓10
    */
    @SerializedName("AndroidVersion")
    @Expose
    private String AndroidVersion;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 镜像型号。
YS1：基础型云手机
GC0、GC1、GC2：三种性能型云手机
    */
    @SerializedName("AndroidInstanceImageModel")
    @Expose
    private String AndroidInstanceImageModel;

    /**
     * Get 镜像 ID 
     * @return AndroidInstanceImageId 镜像 ID
     */
    public String getAndroidInstanceImageId() {
        return this.AndroidInstanceImageId;
    }

    /**
     * Set 镜像 ID
     * @param AndroidInstanceImageId 镜像 ID
     */
    public void setAndroidInstanceImageId(String AndroidInstanceImageId) {
        this.AndroidInstanceImageId = AndroidInstanceImageId;
    }

    /**
     * Get 镜像名称，由业务方自定义，仅用于展示 
     * @return AndroidInstanceImageName 镜像名称，由业务方自定义，仅用于展示
     */
    public String getAndroidInstanceImageName() {
        return this.AndroidInstanceImageName;
    }

    /**
     * Set 镜像名称，由业务方自定义，仅用于展示
     * @param AndroidInstanceImageName 镜像名称，由业务方自定义，仅用于展示
     */
    public void setAndroidInstanceImageName(String AndroidInstanceImageName) {
        this.AndroidInstanceImageName = AndroidInstanceImageName;
    }

    /**
     * Get 镜像状态 
     * @return AndroidInstanceImageState 镜像状态
     */
    public String getAndroidInstanceImageState() {
        return this.AndroidInstanceImageState;
    }

    /**
     * Set 镜像状态
     * @param AndroidInstanceImageState 镜像状态
     */
    public void setAndroidInstanceImageState(String AndroidInstanceImageState) {
        this.AndroidInstanceImageState = AndroidInstanceImageState;
    }

    /**
     * Get 镜像可用区 
     * @return AndroidInstanceImageZone 镜像可用区
     */
    public String getAndroidInstanceImageZone() {
        return this.AndroidInstanceImageZone;
    }

    /**
     * Set 镜像可用区
     * @param AndroidInstanceImageZone 镜像可用区
     */
    public void setAndroidInstanceImageZone(String AndroidInstanceImageZone) {
        this.AndroidInstanceImageZone = AndroidInstanceImageZone;
    }

    /**
     * Get 镜像描述 
     * @return AndroidInstanceImageDescription 镜像描述
     */
    public String getAndroidInstanceImageDescription() {
        return this.AndroidInstanceImageDescription;
    }

    /**
     * Set 镜像描述
     * @param AndroidInstanceImageDescription 镜像描述
     */
    public void setAndroidInstanceImageDescription(String AndroidInstanceImageDescription) {
        this.AndroidInstanceImageDescription = AndroidInstanceImageDescription;
    }

    /**
     * Get 安卓10 
     * @return AndroidVersion 安卓10
     */
    public String getAndroidVersion() {
        return this.AndroidVersion;
    }

    /**
     * Set 安卓10
     * @param AndroidVersion 安卓10
     */
    public void setAndroidVersion(String AndroidVersion) {
        this.AndroidVersion = AndroidVersion;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 镜像型号。
YS1：基础型云手机
GC0、GC1、GC2：三种性能型云手机 
     * @return AndroidInstanceImageModel 镜像型号。
YS1：基础型云手机
GC0、GC1、GC2：三种性能型云手机
     */
    public String getAndroidInstanceImageModel() {
        return this.AndroidInstanceImageModel;
    }

    /**
     * Set 镜像型号。
YS1：基础型云手机
GC0、GC1、GC2：三种性能型云手机
     * @param AndroidInstanceImageModel 镜像型号。
YS1：基础型云手机
GC0、GC1、GC2：三种性能型云手机
     */
    public void setAndroidInstanceImageModel(String AndroidInstanceImageModel) {
        this.AndroidInstanceImageModel = AndroidInstanceImageModel;
    }

    public AndroidInstanceImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AndroidInstanceImage(AndroidInstanceImage source) {
        if (source.AndroidInstanceImageId != null) {
            this.AndroidInstanceImageId = new String(source.AndroidInstanceImageId);
        }
        if (source.AndroidInstanceImageName != null) {
            this.AndroidInstanceImageName = new String(source.AndroidInstanceImageName);
        }
        if (source.AndroidInstanceImageState != null) {
            this.AndroidInstanceImageState = new String(source.AndroidInstanceImageState);
        }
        if (source.AndroidInstanceImageZone != null) {
            this.AndroidInstanceImageZone = new String(source.AndroidInstanceImageZone);
        }
        if (source.AndroidInstanceImageDescription != null) {
            this.AndroidInstanceImageDescription = new String(source.AndroidInstanceImageDescription);
        }
        if (source.AndroidVersion != null) {
            this.AndroidVersion = new String(source.AndroidVersion);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AndroidInstanceImageModel != null) {
            this.AndroidInstanceImageModel = new String(source.AndroidInstanceImageModel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AndroidInstanceImageId", this.AndroidInstanceImageId);
        this.setParamSimple(map, prefix + "AndroidInstanceImageName", this.AndroidInstanceImageName);
        this.setParamSimple(map, prefix + "AndroidInstanceImageState", this.AndroidInstanceImageState);
        this.setParamSimple(map, prefix + "AndroidInstanceImageZone", this.AndroidInstanceImageZone);
        this.setParamSimple(map, prefix + "AndroidInstanceImageDescription", this.AndroidInstanceImageDescription);
        this.setParamSimple(map, prefix + "AndroidVersion", this.AndroidVersion);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AndroidInstanceImageModel", this.AndroidInstanceImageModel);

    }
}

