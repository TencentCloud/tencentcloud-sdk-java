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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PythonSparkImage extends AbstractModel {

    /**
    * spark镜像唯一id
    */
    @SerializedName("SparkImageId")
    @Expose
    private String SparkImageId;

    /**
    * 集群小版本镜像id
    */
    @SerializedName("ChildImageVersionId")
    @Expose
    private String ChildImageVersionId;

    /**
    * spark镜像名称
    */
    @SerializedName("SparkImageVersion")
    @Expose
    private String SparkImageVersion;

    /**
    * spark镜像描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get spark镜像唯一id 
     * @return SparkImageId spark镜像唯一id
     */
    public String getSparkImageId() {
        return this.SparkImageId;
    }

    /**
     * Set spark镜像唯一id
     * @param SparkImageId spark镜像唯一id
     */
    public void setSparkImageId(String SparkImageId) {
        this.SparkImageId = SparkImageId;
    }

    /**
     * Get 集群小版本镜像id 
     * @return ChildImageVersionId 集群小版本镜像id
     */
    public String getChildImageVersionId() {
        return this.ChildImageVersionId;
    }

    /**
     * Set 集群小版本镜像id
     * @param ChildImageVersionId 集群小版本镜像id
     */
    public void setChildImageVersionId(String ChildImageVersionId) {
        this.ChildImageVersionId = ChildImageVersionId;
    }

    /**
     * Get spark镜像名称 
     * @return SparkImageVersion spark镜像名称
     */
    public String getSparkImageVersion() {
        return this.SparkImageVersion;
    }

    /**
     * Set spark镜像名称
     * @param SparkImageVersion spark镜像名称
     */
    public void setSparkImageVersion(String SparkImageVersion) {
        this.SparkImageVersion = SparkImageVersion;
    }

    /**
     * Get spark镜像描述信息 
     * @return Description spark镜像描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set spark镜像描述信息
     * @param Description spark镜像描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
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

    public PythonSparkImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PythonSparkImage(PythonSparkImage source) {
        if (source.SparkImageId != null) {
            this.SparkImageId = new String(source.SparkImageId);
        }
        if (source.ChildImageVersionId != null) {
            this.ChildImageVersionId = new String(source.ChildImageVersionId);
        }
        if (source.SparkImageVersion != null) {
            this.SparkImageVersion = new String(source.SparkImageVersion);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SparkImageId", this.SparkImageId);
        this.setParamSimple(map, prefix + "ChildImageVersionId", this.ChildImageVersionId);
        this.setParamSimple(map, prefix + "SparkImageVersion", this.SparkImageVersion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

