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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataInfo extends AbstractModel{

    /**
    * Song Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 歌曲版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 歌曲总时长（非试听时长）
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * 试听开始时间
    */
    @SerializedName("AuditionBegin")
    @Expose
    private Long AuditionBegin;

    /**
    * 试听结束时间
    */
    @SerializedName("AuditionEnd")
    @Expose
    private Long AuditionEnd;

    /**
    * 标签名称
    */
    @SerializedName("TagNames")
    @Expose
    private String [] TagNames;

    /**
     * Get Song Name 
     * @return Name Song Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Song Name
     * @param Name Song Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 歌曲版本 
     * @return Version 歌曲版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 歌曲版本
     * @param Version 歌曲版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 歌曲总时长（非试听时长） 
     * @return Duration 歌曲总时长（非试听时长）
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 歌曲总时长（非试听时长）
     * @param Duration 歌曲总时长（非试听时长）
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 试听开始时间 
     * @return AuditionBegin 试听开始时间
     */
    public Long getAuditionBegin() {
        return this.AuditionBegin;
    }

    /**
     * Set 试听开始时间
     * @param AuditionBegin 试听开始时间
     */
    public void setAuditionBegin(Long AuditionBegin) {
        this.AuditionBegin = AuditionBegin;
    }

    /**
     * Get 试听结束时间 
     * @return AuditionEnd 试听结束时间
     */
    public Long getAuditionEnd() {
        return this.AuditionEnd;
    }

    /**
     * Set 试听结束时间
     * @param AuditionEnd 试听结束时间
     */
    public void setAuditionEnd(Long AuditionEnd) {
        this.AuditionEnd = AuditionEnd;
    }

    /**
     * Get 标签名称 
     * @return TagNames 标签名称
     */
    public String [] getTagNames() {
        return this.TagNames;
    }

    /**
     * Set 标签名称
     * @param TagNames 标签名称
     */
    public void setTagNames(String [] TagNames) {
        this.TagNames = TagNames;
    }

    public DataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataInfo(DataInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.AuditionBegin != null) {
            this.AuditionBegin = new Long(source.AuditionBegin);
        }
        if (source.AuditionEnd != null) {
            this.AuditionEnd = new Long(source.AuditionEnd);
        }
        if (source.TagNames != null) {
            this.TagNames = new String[source.TagNames.length];
            for (int i = 0; i < source.TagNames.length; i++) {
                this.TagNames[i] = new String(source.TagNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "AuditionBegin", this.AuditionBegin);
        this.setParamSimple(map, prefix + "AuditionEnd", this.AuditionEnd);
        this.setParamArraySimple(map, prefix + "TagNames.", this.TagNames);

    }
}

