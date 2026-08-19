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

public class LogAppCollectPath extends AbstractModel {

    /**
    * <p>配置ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>采集路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>日志标签</p>
    */
    @SerializedName("LogTag")
    @Expose
    private String LogTag;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>修改时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get <p>配置ID</p> 
     * @return Id <p>配置ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>配置ID</p>
     * @param Id <p>配置ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>采集路径</p> 
     * @return Path <p>采集路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>采集路径</p>
     * @param Path <p>采集路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>日志标签</p> 
     * @return LogTag <p>日志标签</p>
     */
    public String getLogTag() {
        return this.LogTag;
    }

    /**
     * Set <p>日志标签</p>
     * @param LogTag <p>日志标签</p>
     */
    public void setLogTag(String LogTag) {
        this.LogTag = LogTag;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>修改时间</p> 
     * @return ModifyTime <p>修改时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param ModifyTime <p>修改时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public LogAppCollectPath() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogAppCollectPath(LogAppCollectPath source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.LogTag != null) {
            this.LogTag = new String(source.LogTag);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "LogTag", this.LogTag);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

