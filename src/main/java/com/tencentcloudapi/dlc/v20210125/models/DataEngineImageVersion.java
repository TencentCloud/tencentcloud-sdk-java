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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataEngineImageVersion extends AbstractModel {

    /**
    * 镜像大版本ID
    */
    @SerializedName("ImageVersionId")
    @Expose
    private String ImageVersionId;

    /**
    * 镜像大版本名称
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
    * 镜像大版本描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 是否为公共版本：1：公共；2：私有
    */
    @SerializedName("IsPublic")
    @Expose
    private Long IsPublic;

    /**
    * 集群类型：SparkSQL/PrestoSQL/SparkBatch
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * 版本状态：1：初始化；2：上线；3：下线
    */
    @SerializedName("IsSharedEngine")
    @Expose
    private Long IsSharedEngine;

    /**
    * 版本状态：1：初始化；2：上线；3：下线
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 插入时间
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
     * Get 镜像大版本ID 
     * @return ImageVersionId 镜像大版本ID
     */
    public String getImageVersionId() {
        return this.ImageVersionId;
    }

    /**
     * Set 镜像大版本ID
     * @param ImageVersionId 镜像大版本ID
     */
    public void setImageVersionId(String ImageVersionId) {
        this.ImageVersionId = ImageVersionId;
    }

    /**
     * Get 镜像大版本名称 
     * @return ImageVersion 镜像大版本名称
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set 镜像大版本名称
     * @param ImageVersion 镜像大版本名称
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
    }

    /**
     * Get 镜像大版本描述 
     * @return Description 镜像大版本描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 镜像大版本描述
     * @param Description 镜像大版本描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 是否为公共版本：1：公共；2：私有 
     * @return IsPublic 是否为公共版本：1：公共；2：私有
     */
    public Long getIsPublic() {
        return this.IsPublic;
    }

    /**
     * Set 是否为公共版本：1：公共；2：私有
     * @param IsPublic 是否为公共版本：1：公共；2：私有
     */
    public void setIsPublic(Long IsPublic) {
        this.IsPublic = IsPublic;
    }

    /**
     * Get 集群类型：SparkSQL/PrestoSQL/SparkBatch 
     * @return EngineType 集群类型：SparkSQL/PrestoSQL/SparkBatch
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 集群类型：SparkSQL/PrestoSQL/SparkBatch
     * @param EngineType 集群类型：SparkSQL/PrestoSQL/SparkBatch
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get 版本状态：1：初始化；2：上线；3：下线 
     * @return IsSharedEngine 版本状态：1：初始化；2：上线；3：下线
     */
    public Long getIsSharedEngine() {
        return this.IsSharedEngine;
    }

    /**
     * Set 版本状态：1：初始化；2：上线；3：下线
     * @param IsSharedEngine 版本状态：1：初始化；2：上线；3：下线
     */
    public void setIsSharedEngine(Long IsSharedEngine) {
        this.IsSharedEngine = IsSharedEngine;
    }

    /**
     * Get 版本状态：1：初始化；2：上线；3：下线 
     * @return State 版本状态：1：初始化；2：上线；3：下线
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 版本状态：1：初始化；2：上线；3：下线
     * @param State 版本状态：1：初始化；2：上线；3：下线
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 插入时间 
     * @return InsertTime 插入时间
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 插入时间
     * @param InsertTime 插入时间
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

    public DataEngineImageVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataEngineImageVersion(DataEngineImageVersion source) {
        if (source.ImageVersionId != null) {
            this.ImageVersionId = new String(source.ImageVersionId);
        }
        if (source.ImageVersion != null) {
            this.ImageVersion = new String(source.ImageVersion);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IsPublic != null) {
            this.IsPublic = new Long(source.IsPublic);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.IsSharedEngine != null) {
            this.IsSharedEngine = new Long(source.IsSharedEngine);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageVersionId", this.ImageVersionId);
        this.setParamSimple(map, prefix + "ImageVersion", this.ImageVersion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsPublic", this.IsPublic);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "IsSharedEngine", this.IsSharedEngine);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

