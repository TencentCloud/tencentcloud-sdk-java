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

public class Audit extends AbstractModel {

    /**
    * <p>创建者</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>最后修改者</p>
    */
    @SerializedName("LastModifier")
    @Expose
    private String LastModifier;

    /**
    * <p>创建时间戳</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private Long CreatedAt;

    /**
    * <p>最后修改时间戳</p>
    */
    @SerializedName("LastModifiedAt")
    @Expose
    private Long LastModifiedAt;

    /**
    * <p>最后修改时间（已废弃）</p><p>参数格式：2024-11-01 11:01:01</p>
    */
    @SerializedName("LastModifiedTime")
    @Expose
    private String LastModifiedTime;

    /**
    * <p>创建时间（已废弃）</p><p>参数格式：2024-11-01 11:01:01</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get <p>创建者</p> 
     * @return Creator <p>创建者</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>创建者</p>
     * @param Creator <p>创建者</p>
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>最后修改者</p> 
     * @return LastModifier <p>最后修改者</p>
     */
    public String getLastModifier() {
        return this.LastModifier;
    }

    /**
     * Set <p>最后修改者</p>
     * @param LastModifier <p>最后修改者</p>
     */
    public void setLastModifier(String LastModifier) {
        this.LastModifier = LastModifier;
    }

    /**
     * Get <p>创建时间戳</p> 
     * @return CreatedAt <p>创建时间戳</p>
     */
    public Long getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间戳</p>
     * @param CreatedAt <p>创建时间戳</p>
     */
    public void setCreatedAt(Long CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>最后修改时间戳</p> 
     * @return LastModifiedAt <p>最后修改时间戳</p>
     */
    public Long getLastModifiedAt() {
        return this.LastModifiedAt;
    }

    /**
     * Set <p>最后修改时间戳</p>
     * @param LastModifiedAt <p>最后修改时间戳</p>
     */
    public void setLastModifiedAt(Long LastModifiedAt) {
        this.LastModifiedAt = LastModifiedAt;
    }

    /**
     * Get <p>最后修改时间（已废弃）</p><p>参数格式：2024-11-01 11:01:01</p> 
     * @return LastModifiedTime <p>最后修改时间（已废弃）</p><p>参数格式：2024-11-01 11:01:01</p>
     */
    public String getLastModifiedTime() {
        return this.LastModifiedTime;
    }

    /**
     * Set <p>最后修改时间（已废弃）</p><p>参数格式：2024-11-01 11:01:01</p>
     * @param LastModifiedTime <p>最后修改时间（已废弃）</p><p>参数格式：2024-11-01 11:01:01</p>
     */
    public void setLastModifiedTime(String LastModifiedTime) {
        this.LastModifiedTime = LastModifiedTime;
    }

    /**
     * Get <p>创建时间（已废弃）</p><p>参数格式：2024-11-01 11:01:01</p> 
     * @return CreatedTime <p>创建时间（已废弃）</p><p>参数格式：2024-11-01 11:01:01</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间（已废弃）</p><p>参数格式：2024-11-01 11:01:01</p>
     * @param CreatedTime <p>创建时间（已废弃）</p><p>参数格式：2024-11-01 11:01:01</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public Audit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Audit(Audit source) {
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.LastModifier != null) {
            this.LastModifier = new String(source.LastModifier);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new Long(source.CreatedAt);
        }
        if (source.LastModifiedAt != null) {
            this.LastModifiedAt = new Long(source.LastModifiedAt);
        }
        if (source.LastModifiedTime != null) {
            this.LastModifiedTime = new String(source.LastModifiedTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "LastModifier", this.LastModifier);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "LastModifiedAt", this.LastModifiedAt);
        this.setParamSimple(map, prefix + "LastModifiedTime", this.LastModifiedTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

