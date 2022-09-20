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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpeedTestingConfig extends AbstractModel{

    /**
    * 任务类型，取值有：
<li>1：页面性能;</li>
<li>2：文件上传;</li>
<li>3：文件下载;</li>
<li>4：端口性能;</li>
<li>5：网络质量;</li>
<li>6：音视频体验。</li>
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 拨测 url。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 拨测 UA。
    */
    @SerializedName("UA")
    @Expose
    private String UA;

    /**
    * 网络类型。
    */
    @SerializedName("Connectivity")
    @Expose
    private String Connectivity;

    /**
     * Get 任务类型，取值有：
<li>1：页面性能;</li>
<li>2：文件上传;</li>
<li>3：文件下载;</li>
<li>4：端口性能;</li>
<li>5：网络质量;</li>
<li>6：音视频体验。</li> 
     * @return TaskType 任务类型，取值有：
<li>1：页面性能;</li>
<li>2：文件上传;</li>
<li>3：文件下载;</li>
<li>4：端口性能;</li>
<li>5：网络质量;</li>
<li>6：音视频体验。</li>
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型，取值有：
<li>1：页面性能;</li>
<li>2：文件上传;</li>
<li>3：文件下载;</li>
<li>4：端口性能;</li>
<li>5：网络质量;</li>
<li>6：音视频体验。</li>
     * @param TaskType 任务类型，取值有：
<li>1：页面性能;</li>
<li>2：文件上传;</li>
<li>3：文件下载;</li>
<li>4：端口性能;</li>
<li>5：网络质量;</li>
<li>6：音视频体验。</li>
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 拨测 url。 
     * @return Url 拨测 url。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 拨测 url。
     * @param Url 拨测 url。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 拨测 UA。 
     * @return UA 拨测 UA。
     */
    public String getUA() {
        return this.UA;
    }

    /**
     * Set 拨测 UA。
     * @param UA 拨测 UA。
     */
    public void setUA(String UA) {
        this.UA = UA;
    }

    /**
     * Get 网络类型。 
     * @return Connectivity 网络类型。
     */
    public String getConnectivity() {
        return this.Connectivity;
    }

    /**
     * Set 网络类型。
     * @param Connectivity 网络类型。
     */
    public void setConnectivity(String Connectivity) {
        this.Connectivity = Connectivity;
    }

    public SpeedTestingConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpeedTestingConfig(SpeedTestingConfig source) {
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.UA != null) {
            this.UA = new String(source.UA);
        }
        if (source.Connectivity != null) {
            this.Connectivity = new String(source.Connectivity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "UA", this.UA);
        this.setParamSimple(map, prefix + "Connectivity", this.Connectivity);

    }
}

